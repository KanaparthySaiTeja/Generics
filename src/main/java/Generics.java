public class Generics <E extends Comparable<E>>{
    E a,b,c;
    public Generics(){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public E maximum(){
        return Generics.findMax(a,b,c);
    }
    public static void main(String[] args) {
Integer a=3,b=5,c=10;
Float af=4.4f,bf=8.7f,cf=9.7f;
String as="apple",bs="banana",cs="mango";
        new Generics().maximum();
new Generics().maximum();
new Generics().maximum();
    }

    public static <E extends Comparable<E>> E findMax (E a,E b,E c) {
        E max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        printMax(a,b,c,max);
        return max;
    }
    public static <E> void printMax(E a, E b, E c, E max){
        System.out.printf("Max of %s,%s and %s is %s\n",a,b,c,max);
    }
}
