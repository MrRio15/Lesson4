public class L6_T10 {
    public static void main(String[] args) {
        print("tt",1);
        print("tt", new boolean[]{});
        print("rt", 6.0);
        print("false", false);
        print("Tt", 'T');
        print("y", (byte)1);
    }

    static void print(String str,int... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (int element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,long... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (long element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,byte... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (byte element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,short... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (short element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,double... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (double element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,float... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (float element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,char... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (char element : arr) {
                System.out.println(element);
            }
        }
    }

    static void print(String str,boolean... arr) {
        if (arr.length == 0) System.out.println(str);
        else {
            for (boolean element : arr) {
                System.out.println(element);
            }
        }
    }
}
