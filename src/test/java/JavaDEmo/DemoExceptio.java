package JavaDEmo;

public class DemoExceptio extends Throwable {
    public static void main(String[] args) {

        {

            String ptr = null;


            try {
                if ("gfg".equals(ptr))
                    System.out.print("Same");
                else
                    System.out.print("Not Same");
            } catch (NullPointerException e) {
                System.out.print("Caught NullPointerException");
            }
        }
    }

}