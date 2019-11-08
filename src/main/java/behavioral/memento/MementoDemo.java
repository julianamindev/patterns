package behavioral.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MementoDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("Julian Amin", "Marikina", "09989958224");
        Caretaker caretaker = new Caretaker();

        log.info("original: {}", employee);

        employee.setName("Julian Rodas");
        caretaker.save(employee);
        log.info("changed name: {}", employee);

        employee.setPhone("2222222");
        caretaker.revert(employee);
        log.info("changed phone but not saved: {}", employee);

        employee.setPhone("2222222");
        caretaker.save(employee);
        log.info("changed phone: {}", employee);
    }
}