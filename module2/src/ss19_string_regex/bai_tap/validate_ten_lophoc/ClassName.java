package ss19_string_regex.bai_tap.validate_ten_lophoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ClassName() {
    }
    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
