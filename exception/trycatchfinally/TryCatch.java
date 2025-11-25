package exception.trycatchfinally;

public class TryCatch {
    public static void main(String[] args) {
        int n=10;
        int m = 0;

        try{
            int ans = n/m;
            System.out.println("Answer :"+ ans);
        }catch(ArithmeticException e){
            System.out.println("Error : Divisiom by 0"+e);
        }
    }
}
