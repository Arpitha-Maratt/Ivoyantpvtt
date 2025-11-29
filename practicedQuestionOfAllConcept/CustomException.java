package practicedQuestionOfAllConcept;


class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {

    static void validation(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be more");
        }
        System.out.println("Age "+ age+"-Eligible to vote");
    }

    public static void main(String[] args) {
        int[] testAges = {15,18,12,25};
    for(int age : testAges){
    try{
        validation(age);
    }catch (InvalidAgeException e){
        System.out.println("Age"+age+"Error for age"+e.getMessage());

    }
    }
    }

}
