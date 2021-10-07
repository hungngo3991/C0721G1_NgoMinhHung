package ss5_acccess_modifier.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String university = "ABC";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        university = "CBA";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + university);
    }
}
