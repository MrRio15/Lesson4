public class L5_T9 {
    public static void main(String[] args) {
        int i=0;
        for (String arg : args){
            i = Integer.parseInt(arg) + i;
        }
        System.out.println(i);
    }
}
