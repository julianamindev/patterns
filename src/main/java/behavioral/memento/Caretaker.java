package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

// caretaker
public class Caretaker {

    private Deque<EmployeeMemento> stack = new ArrayDeque<>();

    public void save(Employee employee) {
        stack.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(stack.poll());
    }
}
