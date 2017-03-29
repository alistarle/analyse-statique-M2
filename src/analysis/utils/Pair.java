package analysis.utils;

/**
 * Created by alistarle on 28/03/2017.
 */
public class Pair implements Cloneable{
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
    protected Object clone() throws CloneNotSupportedException {
        return new Pair(from,to);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (from != pair.from) return false;
        return to == pair.to;

    }

    @Override
    public int hashCode() {
        int result = from;
        result = 31 * result + to;
        return result;
    }

    @Override
    public String toString() {
        return "("+from + "," + to +')';
    }
}
