package business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDEFinder {
    private String text;
    private static final String REGEX = "(CHE-[0-9]{3}\\.[0-9]{3}\\.[0-9]{3})";
    private static final Pattern pattern = Pattern.compile(REGEX);

    public IDEFinder(String text) {
        this.text = text;
    }

    public String find(){
        Matcher matcher = pattern.matcher(this.text);
        matcher.find();
        matcher.groupCount();
        String content = matcher.group(1);
        return content;
    }
}
// recuperer content + code interroger IDER + server
