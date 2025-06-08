public class Switch {
    public static void main(String[] args) {
        int a=19,b=20;
        int choice =2;
        switch (choice) {
            case 1 ->
                System.out.println(a+b);
            case 2 -> System.out.print(a-b) ;
            default ->
                throw new AssertionError();
        }
        
    }
}
