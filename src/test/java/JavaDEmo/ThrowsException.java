package JavaDEmo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException {
    public static void main(String[] args) throws IOException {
        int i,j=1,k=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        i=0;
        System.out.println("Enter the number");
        j=Integer.parseInt(br.readLine());
        k=i+j;
        System.out.println("output is"+k);
    }
}