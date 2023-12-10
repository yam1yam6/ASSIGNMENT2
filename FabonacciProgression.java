public class FabonacciProgression extends Progression {

    protected long prev;

    // Constructs traditional Fibonacci, starting 0, 1, 1, 2, 3, ... ∗/
    public FabonacciProgression( ) { this(0, 1); }

    // Constructs generalized Fibonacci, with give first and second values. ∗/
    public FabonacciProgression(long first, long second) {
        super(first);
        prev = second - first; // fictitious value preceding the first
    }

    // Replaces (prev,current) with (current, current+prev). ∗/
    protected void advance( ) {
        long temp = prev;
        prev = current;
        current += temp;
    }
}