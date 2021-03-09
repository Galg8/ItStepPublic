package Task1;

public class Practise1<T extends Number> {

    public Number max(T first, T second, T third) {
        double f = first.doubleValue();
        double s = second.doubleValue();
        double t = third.doubleValue();
        if(f > s) {
            if(f > t) {
                return Double.valueOf(f);
            }
            else {
                return Double.valueOf(t);
            }
        }
        else {
            if(s > t) {
                return Double.valueOf(s);
            }
            else {
                return Double.valueOf(t);
            }
        }
    }
}
