import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Department> departments;

    public Library() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public Department getDepartmentByName(String name) {
        for (Department department : departments) {
            if (department.getName().equalsIgnoreCase(name)) {
                return department;
            }
        }
        return null;
    }
}


