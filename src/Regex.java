import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private final String REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public boolean check(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
