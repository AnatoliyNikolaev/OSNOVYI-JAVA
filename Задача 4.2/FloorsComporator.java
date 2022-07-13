import java.util.Comparator;

public class FloorsComporator implements Comparator<Floors> {
    @Override
    public int compare(Floors o1, Floors o2) {
        return o1.getPriority() - o2.getPriority();
    }
}
