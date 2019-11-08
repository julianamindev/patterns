package behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// originator
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String address;
    private String phone;

    protected EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    protected void revert(EmployeeMemento memento) {
        this.name = memento.getName();
        this.phone = memento.getPhone();
    }
}
