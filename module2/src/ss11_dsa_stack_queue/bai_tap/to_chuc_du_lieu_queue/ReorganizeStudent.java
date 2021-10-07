package ss11_dsa_stack_queue.bai_tap.to_chuc_du_lieu_queue;

import java.util.*;

public class ReorganizeStudent {
    public static List<Student> studentList = new ArrayList<>();
    public static List<Student> reorganizedList = new ArrayList<>();

    static {
        Student student1 = new Student("001","Nguyen Thi D", 45, "Female");
        Student student2 = new Student("002","Ngo Van A", 42, "Male");
        Student student3 = new Student("003","Nguyen Van B", 34, "Male");
        Student student4 = new Student("004","Nguyen Thi E", 55, "Female");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }

    public static void reOrganize() {
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("List after reorganization: ");

        Queue<Student> male = new LinkedList();
        Queue<Student> female = new LinkedList();

        for (Student student : studentList) {
            if (student.getGender().equals("Female")) {
                female.add(student);
            } else {
                male.add(student);
            }
        }

        while (!female.isEmpty()) {
            reorganizedList.add(female.remove());
        }

        while (!male.isEmpty()) {
            reorganizedList.add(male.remove());
        }

        for (Student student : reorganizedList) {
            System.out.println(student);
        }
    }

}
