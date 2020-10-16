public class Generics {
    public static void main(String[] args) {

        System.out.println(findMax("Banana","apple","mango"));
    }

    public static String findMax (String a,String b,String c) {
        String max=a;
        if(b.compareToIgnoreCase(max)>0){
            max=b;
        }
        if(c.compareToIgnoreCase(max)>0){
            max=c;
        }
        return max;
    }
}
