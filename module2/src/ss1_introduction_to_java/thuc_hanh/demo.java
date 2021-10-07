package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class demo {
//    String[] arrayStrudent = new String[5];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int length = Integer.parseInt(sc.nextLine());
//        String[] arrayStrudent = new String[5];
//
//        for(int i = 0; i < length; i++){
//            System.out.println("nhap vao phan tu thu" +i);
//            arrayStrudent[i] = sc.nextLine();
//        }
//        for(int i = 0; i < arrayStrudent.length; i++){
//            System.out.println(arrayStrudent[i]);
//        }
//
//    }

    public static void main(String[] args) {
        String [] students = {"A", "B", "C"};
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        double [] heights = {1.7,1.6,2};
        int count = 0;
        while (count < heights.length){
            if(heights[count] > 1.7){
                System.out.println("Da tim thay tai vi tri " +count);
                break;
            }
            count++;
        }
    }


}
