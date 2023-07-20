import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder1 {
    System System;
    String content;
    private static final String REGEX = "<!" ;

    RegexFinder1() {}

    RegexFinder1(String content) {
        this.content = content;
    }

    public void FindMatches(String content2) {
        String content3 = new String(content2);
        System.out.println("this is the passed arguement: "+content3);
        //System.out.print();
        //String pattern = new String("<p");


       // String pattern = "<p";
        Pattern r = Pattern.compile(REGEX);
        Matcher m = r.matcher(content3);
        java.lang.System.out.println("These are the values" + m.group());

    }
}
