import java.util.ArrayList;
import java.util.List;

public class StringDemo {



    public static void main(String[] args) {

        String str="Teju1234";
        int z =0;

        for(Character x : str.toCharArray()){

            if(Character.isDigit(x)){
                z=  z+Character.getNumericValue(x);
            }
        }
        System.out.println(z);
    }

}
