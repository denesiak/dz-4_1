public class Main {
    public static void main(String[] args) {
        Test testA = new Test();
        testA.print();
    }
}

class Test {
    public int id = 30;
    public void print() {
        System.out.printf("Value is %d", id);
    }
}


