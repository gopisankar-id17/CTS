class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}

class StudentView {
    void displayStudentDetails(String name) {
        System.out.println("Student Name: " + name);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    void updateView() {
        view.displayStudentDetails(model.getName());
    }
}

public class MVCTest {
    public static void main(String[] args) {
        Student s = new Student("Gopi");
        StudentView v = new StudentView();

        StudentController c =
                new StudentController(s, v);

        c.updateView();
    }
}