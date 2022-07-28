public class Nesttedifelse {
    public static void main(String[] args){
        int balance = 1000;
        boolean loan= false;
        int withDrawAmt=200;
        if(withDrawAmt<balance){
            if(!loan){
                System.out.println("give cash...");
            }else{
                System.out.print("no cash because of loan");
            }
        }else {
            System.out.println("NO cash because low balance");
        }

        }

    }

