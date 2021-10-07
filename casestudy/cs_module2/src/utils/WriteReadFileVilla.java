package casestudy.src.utils;

import casestudy.src.models.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class WriteReadFileVilla {
    public static void writeFile(Map<Villa, Integer> villaList, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            Set<Villa> villaSet = villaList.keySet();
            for (Villa villa : villaSet) {
                bw.write(villa.getIdService() + "," + villa.getNameService() + "," +
                        villa.getUsableArea() + "," + villa.getRentalCost() + "," +
                        villa.getMaxPeople() + "," + villa.getRentalType() + "," +
                        villa.getRoomStandard() + "," + villa.getPoolArea() + "," + villa.getNumberFloor() + "," + villaList.get(villa));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Villa, Integer> readFile(String filePath) {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
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
                villaList.put(new Villa(value[0], value[1], Double.parseDouble(value[2]),
                        Double.parseDouble(value[3]), Integer.parseInt(value[4]), value[5],
                        value[6], Double.parseDouble(value[7]), Integer.parseInt(value[8])), Integer.parseInt(value[9]));

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
