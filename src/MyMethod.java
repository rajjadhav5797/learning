public class MyMethod {


    static void callme() {
        System.out.println("My method Called ");

    }

    static String sendString(){
        return "My String called";

    }

    public static void main(String[] args){
    callme();
    String my = sendString();
    System.out.println(my);



    }




}

