public class elseif {
    public static void main(String[] args) {
        int age=15;
        if(age>=18){
            System.out.println("Adult Person");
        }
        else if(age>=13 && age<=17){
            System.out.println("Teenager Person");
        }else{
            System.out.println("Its Child");
        }
    }
}
