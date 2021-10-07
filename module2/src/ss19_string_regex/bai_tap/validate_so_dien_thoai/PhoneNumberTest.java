package ss19_string_regex.bai_tap.validate_so_dien_thoai;

public class PhoneNumberTest {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String[] valid = new String[]{"(84)-(0978489648)"};
        String[] invalid = new String[]{"(a8)-(22222222)"};
        for (String pn : valid) {
            boolean isValid = phoneNumber.validate(pn);
            System.out.println("phone number " + pn + " is valid: " + isValid);
        }
        for (String pn : invalid) {
            boolean isValid = phoneNumber.validate(pn);
            System.out.println("phone number " + pn + " is valid: " + isValid);
        }
    }
}
