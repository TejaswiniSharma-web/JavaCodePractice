package JavaDEmo;

public class NumberFormatException1 {
    public static void main(String[] args) {

        try{
            String str="Teju";
            int i=Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
