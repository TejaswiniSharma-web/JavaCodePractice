package JavaDEmo;

public class FinallyKeyword {
    public static void main(String[] args) {
      try {
            int a=5/10;
      }catch (Exception x) {
          System.out.println(x);
      }  finally{
        System.out.println("This is 'finally',it always gets run!");
          }

      }


    }
