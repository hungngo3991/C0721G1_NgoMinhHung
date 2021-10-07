package ss16_io_textfile.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void copyFile(String filePath, String filePath2) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath2, true));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (Exception e) {
            System.err.println("The file does not exist or the file content has an error");
        }
    }

    public static void main(String[] args) {
        copyFile("src\\ss16_io_textfile\\bai_tap\\copy_file_text\\number.txt",
                "src\\ss16_io_textfile\\bai_tap\\copy_file_text\\copyofnumber.txt");
    }
}
