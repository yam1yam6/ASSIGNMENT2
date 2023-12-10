public class ArithmeticProgression extends Progression {
    protected long increment;

    /* Constructs progression 0,1,2,... */

    public ArithmeticProgression() {
        this(1, 0);
    } // start at 0 with increment of 1

    // Constructs progression 0,stepsize,2*stepsize,...

    public ArithmeticProgression(long stepsize) {
        this(stepsize, 0);
    } // start at 0


    // Constructs arithmetic progression with arbitrary start and increment.


    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        increment = stepsize;
    }

    /*
     * Adds the arithmetic increment to the current value.
     */

    protected void advance() {
        current += increment;

    }

    // We use this method to count the number of time we increment with before exceeding the specified value

    public long longIntOverFlow() {
        long count = 0;


        // Here's the method to count to check how many times  you have to divide with 128
        // before exceeding max value

        while (nextValue() < Integer.MAX_VALUE) {
            // increment each time it enter loop
            count++;
        }


        // we return the count-1 because in the final increment it exceeds the max value
        return count-1;

















    }}