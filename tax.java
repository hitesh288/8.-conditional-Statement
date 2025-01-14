import java.util.*;

public class tax {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<=500000){
            System.out.println("You are Tax free");
        }else if(income>=500000 && income<=1000000){
            tax=(int)(income*(0.2));
            System.out.println("You are 20% Tax Payer on Salary and Tax Amount is " + tax );
        }else{
            tax=(int)(income*(0.3));
            System.out.println("You are 30% Tax Payer on Salary and Tax Amount is "+ tax);
        }}
    }

