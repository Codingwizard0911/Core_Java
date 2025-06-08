public class Varargs {
    public static void main(String[] args) {

    //varargs ==> variable number of arguments
    //varapublic class VarArgsDemo 
        // Calling add method with different number of arguments
        System.out.println("Sum of 1, 2, 3, 4, 5 is: " + add(1, 2, 3, 4, 5));
        System.out.println("Sum of 1, 2 is: " + add(1, 2));
        System.out.println("Sum of no numbers is: " + add());
    }


    static int add(int... nums) {
        // nums is treated as an array inside the method

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}

