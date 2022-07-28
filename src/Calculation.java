public class Calculation {
    public static void main(String[] args){
        int a=12;
        int b=24;
        String c="*";


        if(c.equals("+")){
            System.out.println("Addition : " + (a+b));
        }else if(c.equals("_")){
            System.out.println("Subtraction :"+ (a-b));


        }else if(c.equals("*")){
            System.out.println("multiple :" +(a*b) );


        }else if(c.equals("/")){
            System.out.println("div :"+(a/b));

        }else {
            System.out.println("wrong operation");
        }





    }
}
