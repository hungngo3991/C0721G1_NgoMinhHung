package ss17_io_binaryfile_serialization.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {

    public static void writeFile(List<Product> listProduct, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            for (Product product : listProduct) {
                bw.write(product.getId() + "," + product.getName() + "," +
                        product.getManufacturer() + "," + product.getPrice() + "," + product.getDescription());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile(String filePath) {
        List<Product> listProduct = new ArrayList<>();
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
                Product product = new Product(value[0], value[1], value[2], Double.parseDouble(value[3]), value[4]);
                listProduct.add(product);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProduct;
    }
}
