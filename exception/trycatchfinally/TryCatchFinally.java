package exception.trycatchfinally;

public class TryCatchFinally {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        try{
            System.out.println(numbers[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught :"+e);
        }finally {
            System.out.println("End of the block");
        }

        System.out.println("Program continous");
    }
}
