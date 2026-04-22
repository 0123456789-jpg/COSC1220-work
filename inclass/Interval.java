/**
 * Left end is inclusive; right end is exclusive.
 *
 * @author Shunzhong Zhu
 * @version 0.1.0
 * @since 20206-04-22
 */
public class Interval {
    final double left;
    final double right;

    public Interval(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        Interval epi = new Interval(Math.E, Math.PI);
        System.out.println(epi + " contains " + 3.0 + "?: " + epi.contains(3.0));
        Interval intv34 = new Interval(3.0, 4.0);
        System.out.println(epi + " intersects " + intv34 + "?: " + epi.intersects(intv34));
    }

    public boolean contains(double x) {
        return x >= left && x < right;
    }

    public boolean intersects(Interval i) {
        return this.contains(i.left) || i.contains(this.left);
    }

    @Override
    public String toString() {
        return String.format("[%f, %f)", this.left, this.right);
    }
}
