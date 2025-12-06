import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Literal {

    void metacharacter() {
        System.out.println("abc".matches("a.c"));
        System.out.println("abbb".matches("ab*"));
        System.out.println("ab".matches("ab+"));
        System.out.println("a".matches("ab+"));
        System.out.println("a".matches("ab?"));
        System.out.println("dog".matches("cat|dog"));
        System.out.println("a".matches("[abc]"));
        System.out.println("d".matches("[abc]"));
    }

    void predefinedChar() {
        System.out.println("5".matches("\\d"));
        System.out.println("A".matches("\\D"));
        System.out.println("_".matches("\\w"));
        System.out.println(" ".matches("\\W"));
        System.out.println("@".matches("\\W"));
        System.out.println("a".matches("\\S"));
        System.out.println("9876543210".matches("\\d{10}")); // true
        System.out.println("user_01".matches("\\w+")); // true
        System.out.println("apple".matches("^a.*"));
        System.out.println("arpitha".matches(".*a$"));
        System.out.println("arpitha".matches("^a.*a$"));
        //escaping spl character

        String text = "My age is 21";
        String regex = "\\d+"; // Match numbers

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("Number Found: " + m.group());
        }
    }

    void patternAndMatcher(){
        String regex = "\\d+";
        String text = "Hi arpitha 1234";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        System.out.println(p);
        Matcher matcher = p.matcher(text);

        if(matcher.find()){
            System.out.println(matcher.group());
        }
        System.out.println("Starts at: " + matcher.start());
    }

    void validEmail(){
        String email = "arpithaa1122@gmail.com";
        boolean valid = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        System.out.println(valid);
    }

    void LogParsing(){
        String log = "Login from 192.168.1.10";
        Matcher matcher= Pattern.compile("\\b\\d{1,3}(\\.\\d{1,3}){3}\\b").matcher(log);

        if(matcher.find()){
            System.out.println("ip:"+matcher.group());
        }
    }

    void extractingNUmber(){
        String text = "Order123 Amount=450";
        Matcher m = Pattern.compile("\\d+").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
    void dataSanitization(){
        //Remove Special Characters
        String result = "Hello@123#".replaceAll("[^A-Za-z0-9]", "");
        System.out.println(result); // Hello123
        //Remove Extra Spaces
        String result1 = "Java   is  best".replaceAll("\\s+", " ");
        System.out.println(result1); // Java is best
    }

    void matches(){
        String s = "12345";
        boolean result = s.matches("\\d+");
        System.out.println(result); // true
    }

    void replaceAll(){
        String s = "Java123Learning456";
        System.out.println(s.replaceAll("\\d", "")); // JavaLearning
    }

    void replaceFirst(){
        String s = "100-200-300";
        System.out.println(s.replaceFirst("\\d+", "XXX"));
    }

    void split(){
        String s = "Java   is  best";
        String[] parts = s.split("\\s+");

        for (String p : parts) {
            System.out.println(p);
        }

    }
}
    public class RegularExpression {
        public static void main(String[] args) {
            Literal literal = new Literal();
            literal.metacharacter();
            literal.predefinedChar();
            literal.patternAndMatcher();
            literal.validEmail();
            literal.LogParsing();
            literal.extractingNUmber();
            literal.dataSanitization();
            literal.matches();
            literal.replaceAll();
            literal.replaceFirst();
            literal.split();
        }
    }
