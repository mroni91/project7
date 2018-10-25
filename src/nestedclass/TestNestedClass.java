package nestedclass;

public class TestNestedClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.OuterMethodA();
        outerClass.innerA.InnerAMethodA();
    }
}
