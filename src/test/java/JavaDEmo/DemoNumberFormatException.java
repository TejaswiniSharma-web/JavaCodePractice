package JavaDEmo;

public class DemoNumberFormatException {
    public static void main(String[] args) {


    String s="asd";
    int i;
    try{
        i = Integer.parseInt(s);
    }catch (NumberFormatException ex){
        System.out.println(ex);
    }

    }
}