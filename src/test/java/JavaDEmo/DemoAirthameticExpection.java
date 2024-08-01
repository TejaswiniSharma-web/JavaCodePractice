package JavaDEmo;

public class DemoAirthameticExpection {
    public static void main(String[] args) {
        try {
            int AE=10/0;

        }catch (ArithmeticException e){
            System.out.println("Airthemetic Exception caught");
            e.printStackTrace();
        }

    }
}
