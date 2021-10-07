package casestudy.src.utils;

import casestudy.src.models.AddressCustomer;
import casestudy.src.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFileCustomer {
    public static void writeFile(List<Customer> customerList, String filePath, boolean check) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, check));
            for (Customer customer : customerList) {
                bw.write(customer.getName() + "," + customer.getBirthday() + "," +
                        customer.getGender() + "," + customer.getIdCardNumber() + "," +
                        customer.getPhoneNumber() + "," + customer.getEmail() + "," +
                        customer.getIdCustomer() + "," + customer.getCustomerType() + "," +
                        customer.getAddressCustomer().getHouseNumber() + "," +
                        customer.getAddressCustomer().getStreet() + "," + customer.getAddressCustomer().getWard() +
                        "," + customer.getAddressCustomer().getDistrict() + "," + customer.getAddressCustomer().getProvince());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFile(String filePath) {
        List<Customer> customerList = new ArrayList<>();
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
                Customer customer = new Customer(value[0], value[1], value[2], value[3], value[4],
                        value[5], value[6], value[7], new AddressCustomer(value[8], value[9], value[10], value[11], value[12]));
                customerList.add(customer);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }


}
