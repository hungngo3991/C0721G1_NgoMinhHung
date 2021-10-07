package casestudy.src.utils;


import casestudy.src.models.Booking;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class WriteReadFileBooking {
    public static void writeFile(Set<Booking> bookingList, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            for (Booking booking : bookingList) {
                bw.write(booking.getIdBooking() + "," + booking.getStartDate() + "," +
                        booking.getEndDate() + "," + booking.getIdCustomer() + "," +
                        booking.getNameService() + "," + booking.getIdService());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Set<Booking> readFile(String filePath) {
        Set<Booking> bookingList = new TreeSet<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String[] value;
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                value = line.split(",");
                Booking booking = new Booking(value[0], value[1], value[2], value[3], value[4], value[5]);
                bookingList.add(booking);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingList;
    }
}
