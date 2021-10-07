package ss16_io_textfile.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadCSV {
    public static void main(String[] args) {
        try {

            File file = new File("src\\ss16_io_textfile\\bai_tap\\doc_file_csv\\country.csv" );
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch (Exception e){
            System.err.println("The file does not exist or the file content has an error");
        }
    }
}
