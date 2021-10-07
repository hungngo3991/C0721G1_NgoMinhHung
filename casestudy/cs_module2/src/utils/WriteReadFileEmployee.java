package casestudy.src.utils;

import casestudy.src.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFileEmployee {
    public static void writeFile(List<Employee> employeeList, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            for (Employee employee : employeeList) {
                bw.write(employee.getName() + "," + employee.getBirthday() + "," +
                        employee.getGender() + "," + employee.getIdCardNumber() + "," +
                        employee.getPhoneNumber() + "," + employee.getEmail() + "," +
                        employee.getIdEmployee() + "," + employee.getAcademicLevel() + "," + employee.getPosition());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile(String filePath) {
        List<Employee> employeeList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String[] value;
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                value = line.split(",");
                Employee employee = new Employee(value[0], value[1], value[2], value[3], value[4] , value[5], value[6], value[7], value[8]);
                employeeList.add(employee);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
