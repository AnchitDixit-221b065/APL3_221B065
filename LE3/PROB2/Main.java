public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
        // AbsTest cannot be instantiated directly since it is abstract
        // AbsTest absTest = new AbsTest(); // This will cause an error
    }
}
