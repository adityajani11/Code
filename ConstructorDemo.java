public class ConstructorDemo {
    int value1, value2;
    ConstructorDemo() {
        System.out.println("Default Constructor Called");
    }
    ConstructorDemo(int value1, int value2) {
        System.out.println("Parameterized Constructor Called");
        this.value1 = value1;
        this.value2 = value2;
    }
    // Below Constructor is only for Copy Constructor explaination
    ConstructorDemo(ConstructorDemo object) {
        value1 = object.value1;
        value2 = object.value2;
    }
    public static void main(String[] args) {
        ConstructorDemo obj1 = new ConstructorDemo(); // Default Constructor
        ConstructorDemo obj2 = new ConstructorDemo(10, 20); // Parameterized Constructor
        ConstructorDemo obj3 = obj2; // Shallow Copy of obj2 [new memory is not allocated]
        ConstructorDemo obj4 = new ConstructorDemo(obj2); // Deep Copy of obj2 [new memory is allocated]
    }
}