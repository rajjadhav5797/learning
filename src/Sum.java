public class Sum {
    public static void main(String[] args){
        int a= 10;
        int b=20;
        int c=30;
        int d=sumnum(a,b,c);

        int[] f = {10,5,3,2,100};
        int e=   arrysum(f);

        System.out.println(d);
        System.out.println(e);
    }
         static int sumnum(int a,int b, int c ){
         return a+ b+ c;
     }

          static int arrysum(int[] a){
          return a[0]+a[1]+a[2]+a[3]+a[4];
        }

}

