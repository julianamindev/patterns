package structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AdapterDemo {

    private static Logger log = LoggerFactory.getLogger(AdapterDemo.class);

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        employees.forEach(p -> log.info("{}", p));
    }
}
