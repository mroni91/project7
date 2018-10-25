package exceptionhandling;

public class exceptionHandlLing {
    public static void main(String[] args) {
        int num = 20;
        try {
            int result = num / 3;
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println("You can not divide a number by zero, go learn math first !");
        }
        System.out.println("I was able to come to this point");
    }
}
