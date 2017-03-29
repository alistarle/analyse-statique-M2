package analysis.utils;

/**
 * Created by alistarle on 28/03/2017.
 */
public class Pair {
    public int from;
    public int to;

    /**
     * Create a new Pair with the two given Label
     *
     * @param from
     * @param to
     */
    public Pair(int from, int to)
    {
        this.from = from;
        this.to = to;
    }

    public void reverse()
    {
        int temp = from;
        this.from = to;
        this.to = temp;
    }

    @Override
    public String toString() {
        return "("+from + "," + to +')';
    }
}
