package casestudy.src.models;

public class Employee extends Person{
    private String idEmployee;
    private String academicLevel;
    private String position;

    public Employee() {
    }


    public Employee(String name, String birthday, String gender, String idCardNumber, String phoneNumber, String email,
                    String idEmployee, String academicLevel, String position) {
        super(name, birthday, gender, idCardNumber, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.academicLevel = academicLevel;
        this.position = position;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", academicLevel=" + academicLevel +
                ", position=" + position +
                "} " + super.toString();
    }
}
