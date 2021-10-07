package ss19_string_regex.bai_tap.validate_ten_lophoc;

public class ClassNameTest {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        String[] valid = new String[]{"C0318G"};
        String[] invalid = new String[]{"M0318G", "P0323A"};
        for (String cn : valid) {
            boolean isValid = className.validate(cn);
            System.out.println("class name " + cn + " is valid: " + isValid);
        }
        for (String cn : invalid) {
            boolean isValid = className.validate(cn);
            System.out.println("class name " + cn + " is valid: " + isValid);
        }
    }
}
