package ss5_acccess_modifier.bai_tap.lop_chi_ghi_trong_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("David");
        student.setClasses("C03");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
