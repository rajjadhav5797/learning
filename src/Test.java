class Test{
    public static void main(String[] args) {

        // Primitive
        int a = 1;
        char c = 'a';
        boolean b = true;
        float f = 1.1f;
        double d = 1.10;

        // non-primitive
        String s = "Raj";                   // initialized variable

        String sb = new String();           // defined variable

        char[] carray = {'R','a','j'};     // initialized array

        int[] num = new int[9];             // defining length of array

        num[0] = 10;
        num[1] = 2;
        num[2] = 8;
        num[3] = 7;
		
        num[4] = 5;
        num[5] = 9;
        num[6] = 3;
        num[7] = 4;
        num[8] = 1;


        System.out.println(num[7]);

        String str = " Raj is a man  man";

        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(1,4));
        System.out.println(str.substring(10,13));
        System.out.println(str.substring(7));
        System.out.println(str.charAt(7));
        System.out.println(str.indexOf('n'));
        System.out.println(str.lastIndexOf('n'));


    }
}
