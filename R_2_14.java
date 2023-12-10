public class R_2_14 {
        /*R-2.14 Give an example of a Java code fragment that performs an array reference that is
possibly out of bounds, and if it is out of bounds, the program catches that
exception and prints the following error message: “Don’t try buffer overflow
attacks in Java!”
*/
        static int[] arrayOfIntegers = { 2, 5, 8, 56, 23, 9, 11 };

        public static void main(String args[]) {

            // call method
            reverseArray(arrayOfIntegers);

        }

        public static void reverseArray(int[] arr)  {

            // Print  arr
            System.out.println("Array before reverse operation : ");

            try {
                for (int i = 0; i <= arrayOfIntegers.length; i++) {
                    System.out.print(arrayOfIntegers[i] + " ");
                }
            } catch (IndexOutOfBoundsException e) {
                throw new IndexOutOfBoundsException("Don’t try buffer overflow attacks in Java!");
            }

            System.out.println(" \nArray after reverse operation : ");
            for (int i = arrayOfIntegers.length - 1; i >= 0; i--) {
                System.out.print(arrayOfIntegers[i] + " ");
            }

        }

    }


