import java.util.Scanner;
public class Operators {
        public static void main(String[] args) {
            /*
             * Arithmetic operators
             * + addition
             * - subtraction
             * * multiplication
             * / division
             * % modulus
             * ++ increment
             * -- decrement
             */
            //Basic arithmetic operators
            int a = 10;
            int b = 3;
            System.out.println("Sum of a and b is :" + (a + b));
            System.out.println("Difference of a and b is :" + (a - b));
            System.out.println("Product of a and b is :" + (a * b));
            System.out.println("Quotient of a and b is :" + (a / b));
            System.out.println("Remainder of a and b is :" + (a % b));

            //Augmented assignment versions
            int c = 10;
            c += 5;
            System.out.println("c += 5 is " + c);
            c -= 5;
            System.out.println("c -= 5 is " + c);
            c *= 5;
            System.out.println("c *= 5 is " + c);
            c /= 5;
            System.out.println("c /= 5 is " + c);
            c %= 5;
            System.out.println("c %= 5 is " + c);

            //Increment and decrement operators
            int d = 10;
            d++; //d = d + 1
            System.out.println("d++ is " + d);
            d--; //d = d - 1
            System.out.println("d-- is " + d);
            ++d; //d = d + 1
            System.out.println("++d is " + d);
            --d; //d = d - 1
            System.out.println("--d is " + d);


            /*Order of operations
             * P-E-M-D-A-S
             * Parentheses, Exponents, Multiplication, Division, Addition, Subtraction
             */

            double result = 5 + 4 * (7 - 5) / 2.222;
            System.out.println("Result is " + result);


            /*2.Relational operators 
             * == equal to
             * != not equal to
             * > greater than
             * < less than
             * >= greater than or equal to
             * <= less than or equal to
            
            */

            int x = 10;
            int y = 20;
            System.out.println("x == y is " + (x == y));
            System.out.println("x != y is " + (x != y));
            System.out.println("x > y is " + (x > y));
            System.out.println("x < y is " + (x < y));
            System.out.println("x >= y is " + (x >= y));
            System.out.println("x <= y is " + (x <= y));


            /*3.Logical operators
             * && and
             * || or
             * ! not
             */

            boolean a1 = true;
            boolean b1 = false;
            System.out.println("a1 && b1 is " + (a1 && b1));
            System.out.println("a1 || b1 is " + (a1 || b1));
            System.out.println("!a1 is " + (!a1));


            /*4.Bitwise operators
             * & and
             * | or
             * ^ xor             
             * ~ not
             * << shift left
             * >> shift right
             */

            int a2 = 10;
            int b2 = 20;
            System.out.println("a2 & b2 is " + (a2 & b2));
            System.out.println("a2 | b2 is " + (a2 | b2));
            System.out.println("a2 ^ b2 is " + (a2 ^ b2));
            System.out.println("~a2 is " + (~a2));
            System.out.println("a2 << 2 is " + (a2 << 2));
            System.out.println("a2 >> 2 is " + (a2 >> 2));


            /*5.Assignment operators
             * = assignment
             * += addition assignment
             * -= subtraction assignment
             * *= multiplication assignment
             * /= division assignment
             * %= modulus assignment
             * &= and assignment
             * |= or assignment
             * ^= xor assignment
             * <<= shift left assignment
             * >>= shift right assignment
             */

            int a3 = 10;
            int b3 = 20;
            System.out.println("a3 = b3 is " + (a3 = b3));
            System.out.println("a3 += b3 is " + (a3 += b3));
            System.out.println("a3 -= b3 is " + (a3 -= b3));
            System.out.println("a3 *= b3 is " + (a3 *= b3));
            System.out.println("a3 /= b3 is " + (a3 /= b3));
            System.out.println("a3 %= b3 is " + (a3 %= b3));
            System.out.println("a3 &= b3 is " + (a3 &= b3));
            System.out.println("a3 |= b3 is " + (a3 |= b3));
            System.out.println("a3 ^= b3 is " + (a3 ^= b3));
            System.out.println("a3 <<= b3 is " + (a3 <<= b3));
            System.out.println("a3 >>= b3 is " + (a3 >>= b3));

            /*6.Unary operators
             * ++ increment
             * -- decrement
             * + positive
             * - negative
             * ! not
             * ~ not
             */

            int a4 = 10;
            System.out.println("++a4 is " + (++a4));
            System.out.println("--a4 is " + (--a4));
            System.out.println("+a4 is " + (+a4));
            System.out.println("-a4 is " + (-a4));          
            System.out.println("~a4 is " + (~a4));

            /*7.Ternary operators 
             * shorthand if-else statement
             * condition ? expression1 : expression2
            */

            int a5 = 10;
            int b5 = 20;
            int c5 = (a5 > b5) ? a5 : b5;
            System.out.println(c5);

            /*8.Conditional operators
             * switch case
             */
            int a6 = 10;
            switch (a6) {
                case 1:
                    System.out.println("a6 is 1");
                    break;
                case 2:
                    System.out.println("a6 is 2");
                    break;
                case 3:
                    System.out.println("a6 is 3");
                    break;
                default:
                    System.out.println("a6 is not 1, 2 or 3");
                    break;
            }
            
            /*9.Type conversion operators
             * instanceof
             * This operator is used to check if an object is an instance of a specific class.
             */

            int a7 = 10;
            double b7 = 20.5;
            boolean c7 = true;
            if (a7 instanceof Integer) {
                System.out.println("a7 is an integer");
            }
            if (b7 instanceof Double) {
                System.out.println("b7 is a double");
            }
            if (c7 instanceof Boolean) {
                System.out.println("c7 is a boolean");
            }   

        }
}
