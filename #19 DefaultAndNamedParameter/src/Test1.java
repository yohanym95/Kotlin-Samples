public class Test1 {
    public static void main(String[] args) {
        System.out.println( TestKt.calAmount(50)); //when we run from kotlin default parameter method from java we have to use two parameter in java.nut if we use @jvmOverload then it provide two 1 is one parameter method and second one is two parameter method
        System.out.println(TestKt.calAmount(23,0.04));
    }
}
