// Use of static, final and super keyword
class A {
    int value1 = 10;
}
public class KeywordDemo2 extends A {
    final int value1 = 20;
    public static void main(String[] args) { // main method is static, so it does not require object for call
        KeywordDemo2 obj1 = new KeywordDemo2();
        obj1.data();
    }
    void data() {
        // value1 = 15; => [if I write, this error will be shown] The final field KeywordDemo2.value1 cannot be assigned
        System.out.println(super.value1); // super keyword refers to the value of the parent class which is 10 => So, the outout will be 10
    }
}