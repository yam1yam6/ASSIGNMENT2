public class Main {
    public static void main(String args[]) {
        Progression prog;

        // test ArithmeticProgression

        System.out.print("number of time we increment 128 before exceeding the max integer is: ");
        // increment with 128 each time
        prog = new ArithmeticProgression(128);

        // print value returned by longIntOverFlow and hard check value
        System.out.println(((ArithmeticProgression) prog).longIntOverFlow() + " \nhard check 2147483647/128: "
                + (Integer.MAX_VALUE)/128);

    }
}