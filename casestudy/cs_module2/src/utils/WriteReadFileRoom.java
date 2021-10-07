package casestudy.src.utils;

import casestudy.src.models.FreeService;
import casestudy.src.models.Room;

import java.io.*;
import java.util.*;

public class WriteReadFileRoom {
    public static void writeFile(Map<Room, Integer> roomList, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            Set<Room> roomSet = roomList.keySet();
            for (Room room : roomSet) {
                bw.write(room.getIdService() + "," + room.getNameService() + "," +
                        room.getUsableArea() + "," + room.getRentalCost() + "," +
                        room.getMaxPeople() + "," + room.getRentalType() + "," +
                        room.getFreeService().getIdFreeService() + "," +
                        room.getFreeService().getNameFreeService() + "," + roomList.get(room));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room, Integer> readFile(String filePath) {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
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
                roomList.put(new Room(value[0], value[1], Double.parseDouble(value[2]), Double.parseDouble(value[3]),
                        Integer.parseInt(value[4]), value[5], new FreeService(value[6], value[7])), Integer.parseInt(value[8]));

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
