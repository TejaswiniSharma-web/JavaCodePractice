package Basics;

public class StringArrayDemo {
    public static void main(String[] args) {
        String[]DuplicatesArray={".png",".png",".jpg"};
        for (int i=0;i<=DuplicatesArray.length-1;i++){
            for (int j=i+1;j<DuplicatesArray.length;j++){
                if ((DuplicatesArray[i].equals(DuplicatesArray[j]))){
                    System.out.println(DuplicatesArray[j]);
                }
            }
        }
    }
}
