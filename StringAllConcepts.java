import javax.crypto.spec.PSource;

class StringUsingLiteral {

    String name = "Arpitha";
    void stringName() {
        String name = "Arpitha.S";
        System.out.println("Printing name using StringLiteral: "+name);
    }

void usingNew(){
        String name = new String("Amulya");
        System.out.println("Printing name using new keyword: "+name);
    }

    void internMethod(){
        String name1 = new String("Hi");
        String name2 = name1.intern();
        String name3= "Hi";

        System.out.println("name1 is equal to name2?: "+(name1==name2));
        System.out.println("name2 is equal to name3?: "+(name2==name3));
    }

    void lengthOfString(){
        int lengthOfname  = name.length();
        System.out.println("The length of the name is :"+lengthOfname);

    }

    void charAt(){
        System.out.println("The specific character at index i s:"+name.charAt(1));
    }

    void substring(){
        System.out.println("the subString of the name is start from 2 index:"+name.substring(2));
        System.out.println("The substring of the name start from 2 and end it by index 4:"+name.substring(2,4));
    }

    void contains(){
        System.out.println("Check name contains arpi or not:"+ name.contains("Arpi"));
    }

    void startsWith(){
        System.out.println("The name sring is starts with arpi? : "+ name.startsWith("Arpi"));
    }

    void endsWith(){
        System.out.println("The name string is ends with arpi? : "+ name.endsWith("Arpi"));
    }

    void equalsVSequalsIgnoreCase(){
        String text1 = "Hello";
        String text2 = "hello";

        System.out.println("Using equals :"+text1.equals(text2));
        System.out.println("Using equalsIgnoreCase :"+text1.equalsIgnoreCase(text2));
    }

    void compareTo(){
        System.out.println("Apple".compareTo("Banana"));
        System.out.println("Dog".compareTo("Cat"));
        System.out.println("Java".compareTo("Java"));
    }
}

class ModifyAndProcessingString{
    String text = "   Hello world   ";

    void trim(){
        System.out.println("Using trim: "+text.trim());
    }

    void strip(){
        System.out.println("Using strip remover all white space: "+text.strip());
    }

    void stripLeading(){
        System.out.println("Using strip remover staring white space: "+text.stripLeading());
    }

    void stripTrailing(){
        System.out.println("Using stripTrailing remove ending white space: "+text.stripTrailing());
    }
    void IsEmpty(){
        String text1 = " ";
        System.out.println("Check is the string is empty:"+text.isEmpty());
        System.out.println("check text1 :"+text1.isEmpty());
    }

    void IsBlank(){
        String text1 = " ";
        System.out.println("Check the string is blank: "+text.isBlank());
        System.out.println("Check the string is blank:"+text1.isBlank());
    }

    void replace(){
        System.out.println("Replace the valus:"+text.replace("Hello","hi"));
    }

    void replaceAll(){
        String s = "Java123Programming456";
        String result = s.replaceAll("\\d", "*"); // \\d → digits
        System.out.println(result);

        String text = "cat bat mat";
        System.out.println(text.replaceAll("at", "@"));
    }

    void replaceFirst(){
        String text = "Java programming in Java";

        System.out.println(text.replaceFirst("Java","Python"));
    }

    void indexOf(){
        System.out.println(text.indexOf("H"));
    }

    void lastIndex(){
        System.out.println(text.indexOf("l"));
    }

    void split(){
        String data = "Java,Python,C,Go";
        String[] arr = data.split(",");

        for (String lang : arr) {
            System.out.println(lang);
        }

    }
    void join(){
        String result = String.join("-", "Java", "Python", "C");
        System.out.println(result);

        String[] langs = {"HTML", "CSS", "JS"};
        String output = String.join(" | ", langs);
        System.out.println(output);
    }

    void stringFormat(){
        String student = "Arpitha";
        int marks = 95;
        double percentage = 95.5;

        String data = String.format("Name: %s, Marks: %d, Percentage: %.1f",
                student, marks, percentage);

        System.out.println(data);

    }

    void stringToPrimitive(){
        String str = "533";
        System.out.println(Integer.parseInt(str));
    }

    void PrimitiveToString(){

        int num = 177;
        System.out.println(String.valueOf(num));

        boolean flag = true;
        String s1 = String.valueOf(flag); // "true"

        double price = 99.99;
        String s2 = Double.toString(price); // "99.99"
    }

    void lowerAndupper(){

        String name = "Arpitha";

        System.out.println("the lowercase :"+name.toLowerCase());
        System.out.println("The upper case:"+name.toUpperCase());
    }

    void toCharArray(){

        String text = "Hello";
        char[] character = text.toCharArray();

        for(int c : character){
            System.out.println(c);
        }

    }

    void getByte(){

        String letter = "ABX";

        byte[] bytes = letter.getBytes();

        for(int b : bytes){
            System.out.println(b);
        }
    }

    void stringBuilder(){
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("append method:"+sb.append("World"));
        System.out.println("insert method:"+sb.insert(3,"world"));
        System.out.println("delete method :"+sb.delete(2,5));
        System.out.println("deleteed one letter:"+sb.deleteCharAt(3));
    }

    void stringBuildermethods(){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("reverse string:"+sb.reverse());
        System.out.println("replace string"+sb.replace(0,2,"Hi"));
    }

    void stringCapacity(){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("capacicity:"+sb.capacity());
    }

    void stringEnsureCapacity(){
        StringBuilder sb = new StringBuilder("hello");
        sb.ensureCapacity(54);
        System.out.println("ensure capacity:"+sb.capacity());
    }
}

public class StringAllConcepts {
    public static void main(String[] args) {
        StringUsingLiteral name = new StringUsingLiteral();
        name.stringName();
        name.usingNew();
        name.internMethod();
        name.lengthOfString();
        name.charAt();
        name.substring();
        name.contains();
        name.startsWith();
        name.endsWith();
        name.equalsVSequalsIgnoreCase();
        name.compareTo();

        ModifyAndProcessingString text = new ModifyAndProcessingString();
        text.trim();
        text.strip();
        text.stripLeading();
        text.stripTrailing();
        text.IsEmpty();
        text.IsBlank();
        text.replace();
        text.replaceAll();
        text.replaceFirst();
        text.indexOf();
        text.lastIndex();
        text.split();
        text.join();
        text.stringFormat();
        text.stringToPrimitive();
        text.PrimitiveToString();
        text.lowerAndupper();
        text.toCharArray();
        text.getByte();
        text.stringBuilder();
        text.stringBuildermethods();
        text.stringCapacity();
        text.stringEnsureCapacity();

    }
}
