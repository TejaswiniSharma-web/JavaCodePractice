package JavaDEmo;

public class TestTHrow1 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 10 / i;
            if (j == 0) ;

            throw new ArithmeticException("I dont want print exception");
        }catch (ArithmeticException e){
            j=10/i;
            System.out.println("Thats is the default output");
        }catch (Exception e){
            System.out.println("Something went wrong"+e);
        }
        System.out.println(j);
        System.out.println();
    }
}
