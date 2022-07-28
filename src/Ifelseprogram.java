public class Ifelseprogram {
    public static void main(String[]args){
        int a=3;

        if(a%2==1){
            System.out.println("Weird");
        }else{
            if(a>=2&&a<=5) {
                System.out.println("No Weird");
            }else if(a>=6&& a<=20) {
                System.out.println("Weird");
            }else if(a>20) {
                System.out.println("Not weird");
            }
        }

    }
}
