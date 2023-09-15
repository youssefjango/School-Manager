package Convertors;

import School.Departement;
import Workers.Dean;
import Workers.Staff;
import Workers.Teacher;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class is crucial in the functioning of the program. It is used to save
 * the changed information in the GUI section directly in the text file to not
 * lose any piece of data.
 *
 * @author YOUSSEF
 */
public class DataConvertor {

    /**
     * This convertor goes thought a specific file containing the data of
     * teachers and the department itself to return the actual department in a
     * computational value. It is assumed that the order of data is in the
     * following: teachers, dean, Staff and Teachers : firstName lastName Gender
     * Degree email age hours worked yearsOfExp specialty ispartTime; Dean : the
     * same order but yearsAsDean at the end Staff : firstName lastName Gender
     * email age workload yearsOfExp duty
     *
     * @author Youssef BenMouny
     * @param path, which is the String formated path of the txt file containing
     * a speciic departement database
     * @return returnedDeparement;
     */
    public static Departement convertToObjects(String path) {
        File file = new File(path);
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Staff> staffs = new ArrayList<>();
        int departementID = 0;
        String departementName = "";
        int numberOfStudent = 0;
        Dean dean = null;
        int i = 0;
        try ( Scanner input = new Scanner(file)) {
            if (!input.hasNext()) {
                return null;
            }
            while (input.hasNext()) {
                String line = input.nextLine();

                if (line.endsWith(":")) {
                    String[] datas = line.substring(0, line.indexOf(":")).split(" ");
                    departementID = Integer.parseInt(datas[2]);
                    departementName = datas[0];
                    numberOfStudent = Integer.parseInt(datas[1]);
                    continue;
                }
                if (line.contains("Teachers") || line.contains("Dean") || line.contains("Staffs") || line.contains("Staff")) {
                    i++;
                    continue;
                }
                if (i == 1) {
                    if (line.isBlank()) {
                        continue;
                    }
                    String[] teachersData = line.split(" ");
                    teachers.add(new Teacher(Integer.parseInt(teachersData[4]),
                            teachersData[0] + " " + teachersData[1],
                            teachersData[2].equals("M"), Double.parseDouble(teachersData[8]),
                            teachersData[3], Integer.parseInt(teachersData[5]),
                            Integer.parseInt(teachersData[6]), teachersData[9],
                            Character.toUpperCase(teachersData[7].charAt(0))
                            + teachersData[7].substring(1).toLowerCase(),
                            !teachersData[10].equals("fullTime")));
                }
                if (i == 2) {
                    if (line.isBlank()) {
                        continue;
                    }
                    String[] deanData = line.split(" ");
                    dean = new Dean(Integer.parseInt(deanData[4]),
                            deanData[0] + " " + deanData[1],
                            deanData[2].equals("M"),
                            Double.parseDouble(deanData[8]),
                            deanData[3], Integer.parseInt(deanData[5]),
                            Integer.parseInt(deanData[6]), deanData[9],
                            deanData[7], !deanData[10].equals("fullTime"),
                            Integer.parseInt(deanData[11]));
                }
                if (i == 3) {
                    if (line.isBlank()) {
                        continue;
                    }
                    String[] staffData = line.split(" ");
                    staffs.add(new Staff(Integer.parseInt(staffData[4]),
                            staffData[0] + " " + staffData[1],
                            staffData[2].equals("M"), Double.parseDouble(staffData[8]),
                            staffData[3], Integer.parseInt(staffData[5]),
                            Integer.parseInt(staffData[6]),
                            Character.toUpperCase(staffData[7].charAt(0))
                            + staffData[7].substring(1).toLowerCase()));
                }
            }
            input.close();
        } catch (IOException e) {
            System.out.print("File not found");
        }
        Departement returnedDepartement = new Departement(teachers, staffs, numberOfStudent, dean, departementID, departementName);
        return returnedDepartement;
    }

    /**
     * This convertor, following the same rule as the one in top and the
     * database rules. stores a particular departement in a text file.
     *
     * @author Youssef BenMouny
     * @param departement is the departement to be stored in the particular text
     * file
     * @param path is the String formated path where the departements gets
     * stored for the next visit or the refresh.
     */
    public static void convertToFile(Departement departement, String path) {
        File file = new File(path);
        String teachers = "";
        String staffs = "";
        if (departement.getTeachers() != null) {
            for (int i = 0; departement.getTeachers().size() > i; i++) {
                if (departement.getTeachers().size() == i - 1) {
                    teachers += departement.getTeachers().get(i).toString();
                    continue;
                }
                teachers += departement.getTeachers().get(i).toString() + "\n";
            }
        } else {
            teachers += "\n";
        }
        if (departement.getStaffs() != null) {
            for (int i = 0; departement.getStaffs().size() > i; i++) {
                if (departement.getStaffs().size() == i - 1) {
                    staffs += departement.getStaffs().get(i).toString();
                    continue;
                }
                staffs += departement.getStaffs().get(i).toString() + "\n";

            }
        } else {
            staffs += "\n";
        }

        try ( FileWriter fileWrite = new FileWriter(file)) {
            fileWrite.write(departement.getDepartementName()
                    + " " + departement.getNumberOfStudent() + " " + departement.getID() + ":\n");
            fileWrite.write("Teachers\n");
            fileWrite.write(teachers);
            fileWrite.write("Dean\n");
            fileWrite.write(departement.getDean() != null ? departement.getDean().toString() + "\n" : "\n");
            fileWrite.write("Staffs\n");
            fileWrite.write(staffs);
            fileWrite.close();

        } catch (IOException e) {
            System.out.println("Fail to write to the file");
        }

    }

    public static ArrayList<Departement> convertAllDepartments() {
        File file = new File("Database\\DepartmentsNames.txt");
        ArrayList<Departement> returnedDepartements = new ArrayList<>();
        try ( Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String[] line = input.nextLine().split(" ");
                returnedDepartements.add(new Departement(Integer.parseInt(line[2]), Character.toUpperCase(line[0].charAt(0)) + line[0].substring(1).toLowerCase(), Integer.parseInt(line[1])));
                //returnedDepartements.add(Character.toUpperCase(line.charAt(0)) + line.trim().substring(1).toLowerCase());
            }
        } catch (IOException e) {
            System.out.print("File not found");
        }
        return returnedDepartements;
    }

    public static void changeDepContent(ArrayList<Departement> deps) {
        File file = new File("Database\\DepartmentsNames.txt");
        try ( FileWriter fileWrite = new FileWriter(file)) {
            for (int i = 0; i < deps.size(); i++) {
                fileWrite.write(deps.get(i).getDepartementName() + " " + deps.get(i).getNumberOfStudent() + " " + deps.get(i).getID() + "\n");
            }

        } catch (IOException ex) {
            System.out.println("Fail to write to the file");
        }
    }
}
