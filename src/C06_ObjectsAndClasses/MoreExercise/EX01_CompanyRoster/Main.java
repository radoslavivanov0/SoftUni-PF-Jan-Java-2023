package C06_ObjectsAndClasses.MoreExercise.EX01_CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        double highestSalary = 0.0;
        String highestDepartment = "";
        for (int i = 1; i <= n; i++) {
            String[] employeeArr = scanner.nextLine().split(" ");
            String name = employeeArr[0];
            Double salary = Double.parseDouble(employeeArr[1]);
            String position = employeeArr[2];
            String department = employeeArr[3];

            String email = "";
            int age = 0;

            if (highestSalary < salary) {
                highestSalary = salary;
                highestDepartment = department;
            }

            if (employeeArr.length == 6) {
                email = employeeArr[4];
                age = Integer.parseInt(employeeArr[5]);
                Employee currentEmployee = new Employee(name, salary, position, department, email, age);
                employeeList.add(currentEmployee);
            } else if (employeeArr.length == 5) {
                boolean isNumber = Character.isDigit(employeeArr[4].charAt(0));
                if (isNumber) {
                    age = Integer.parseInt(employeeArr[4]);
                    Employee currentEmployee = new Employee(name, salary, position, department, age);
                    employeeList.add(currentEmployee);
                } else {
                    email = employeeArr[4];
                    Employee currentEmployee = new Employee(name, salary, position, department, email);
                    employeeList.add(currentEmployee);
                }
            } else {
                Employee currentEmployee = new Employee(name, salary, position, department);
                employeeList.add(currentEmployee);
            }
        }
        Collections.sort(employeeList, Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Highest Average Salary: " + highestDepartment);
        for (Employee item : employeeList) {
            if (highestDepartment.equals(item.getDepartment())) {
                System.out.printf("%s %.2f %s %d%n", item.getName(), item.getSalary(), item.getEmail(), item.getAge());
            }
        }
    }
}
