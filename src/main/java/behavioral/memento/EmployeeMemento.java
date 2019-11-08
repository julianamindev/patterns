package behavioral.memento;

import lombok.Getter;
import lombok.Setter;

// memento
@Getter
@Setter
public class EmployeeMemento {
    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
