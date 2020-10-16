public class Generics {
    public static void main(String[] args) {

        System.out.println(findMax(5.1f,8.2f,12.5f));
    }

    public static Float findMax (Float a,Float b,Float c) {
        Float max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}
