import java.util.*;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year You wan t to Find its Leap or Not");
        int year=sc.nextInt();
        if((year%4==0)){
            System.out.println("Year is Leaf year");
        }else{
            System.out.println("Year Is Normal Year");
        }
    }
}
