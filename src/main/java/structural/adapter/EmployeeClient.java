package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        // class adaptee
        EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "han", "solo", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeLdap));

        // another class adaptee
        EmployeeCsv employeeCsv = new EmployeeCsv("1000,Rigel,Santorio,rigel@santorio.com");

        employees.add(new EmployeeAdapterCsv(employeeCsv));

        return employees;
    }
}
