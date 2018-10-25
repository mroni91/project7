package nestedclass;

public class OuterClass {

    InnerClassA innerA = new InnerClassA();

    public void OuterMethodA(){
        System.out.println("OuterClassA MethodA");
        innerA.InnerAMethodA();
    }

    public void OuterMethodB(){
        System.out.println("OuterClassA MethodB");
    }


    public class InnerClassA{

        public void InnerAMethodA(){
            System.out.println("InnerA MethodA");
        }

        public void InnerAMethodB(){
            System.out.println("InnerA MethodB");
        }

    }

    public class InnerClassB{

        public void InnerBMethodA(){
            System.out.println("InnerB MethodA");
        }

        public void innerBMethodB(){
            System.out.println("InnerB MethodB");
        }
    }

}
