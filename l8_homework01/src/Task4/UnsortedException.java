package Task4;

public class UnsortedException extends Throwable {

    public UnsortedException() {
        super("The chosen array is unsorted. Some operations can't be done");
    }

}
