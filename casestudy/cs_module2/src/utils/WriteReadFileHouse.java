package casestudy.src.utils;


import casestudy.src.models.House;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WriteReadFileHouse {
    public static void writeFile(Map<House, Integer> houseList, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            Set<House> houseSet = houseList.keySet();
            for (House house : houseSet) {
                bw.write(house.getIdService() + "," + house.getNameService() + "," +
                        house.getUsableArea() + "," + house.getRentalCost() + "," +
                        house.getMaxPeople() + "," + house.getRentalType() + "," +
                        house.getRoomStandard() + "," + house.getNumberFloor() + "," + houseList.get(house));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<House, Integer> readFile(String filePath) {
        Map<House, Integer> houseList = new LinkedHashMap<>();
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
                houseList.put(new House(value[0], value[1], Double.parseDouble(value[2]),
                        Double.parseDouble(value[3]), Integer.parseInt(value[4]), value[5],
                        value[6], Integer.parseInt(value[7])), Integer.parseInt(value[8]));

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
