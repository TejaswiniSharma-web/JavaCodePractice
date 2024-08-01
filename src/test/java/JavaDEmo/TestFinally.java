package JavaDEmo;

public class TestFinally {
    public static void main(String[] args) {
        try {
            int data=25/5;
            System.out.println();
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally code is excuted");
        }

    }
}
