public class Ifexample {
    public static void main(String[] args) {
        int n = 20;

        if (n > 13 && n < 56) {
            System.out.println("yes");
        } else {
            System.out.print("NO");
        }

        int a = 18;
        if (a % 9 == 0 && a >23){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }

        int b =12;
        if(b<10){
            if(b%2==0) {
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }else{
            System.out.println("Odd");
        }



        int day = 6;

        if(day >= 1 && day<=5){
            if(day==1){
                System.out.println("Monday");
            }else if(day ==2){
                System.out.println("Tuesday");
            }else if(day ==3){
                System.out.println("Wednesday");
            }else if(day ==4){
                System.out.println("Thursday");
            }else if(day ==5){
                System.out.println("Friday");
            }

        }else if(day >= 6 && day <= 7){
            if(day==6){
                System.out.println("Saturday - Holiday");
            }else if(day ==7){
                System.out.println("Sunday - Holiday");
            }


        }else{
            System.out.println("Not a day");
        }








        }

    }
