package structural.adapter;

public class EmployeeAdapterCsv implements Employee {

    private EmployeeCsv instance;

    public EmployeeAdapterCsv(EmployeeCsv instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return Integer.toString(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
