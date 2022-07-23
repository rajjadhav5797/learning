public class Addition {
    public static void main(String[] args){
        int a=56;
        int b=55;
      int c=  add(a,b);
      int d =  sub(a,b);
      int e =  multiple(a,b);
      int f=   div(a,b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);


    }
        static int add(int a,int b){
        return (a+b);
    }
         static int sub(int a,int b ){
         return(a-b);
    }
         static int multiple(int a,int b) {
             return (a * b);
         }
         static int div(int a,int b){
         return(a/b);

         }



}

