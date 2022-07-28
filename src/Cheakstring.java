public class Cheakstring {
    public static void main(String[] args) {
        String a = "raj";


        if (a.equalsIgnoreCase("Raj")) {
            System.out.println("ok");
        } else {
            System.out.println("Not ok");
        }

        //Ledder if/else
       if(a.length()>6){
           System.out.println("Greter then 6");
       }
       else if(a.length()>4){
           System.out.println("Greter then 4");
       }
       else{
           System.out.println("Not ok");
       }

    }
}
