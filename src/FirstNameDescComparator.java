import java.util.Comparator;

public class FirstNameDescComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if(o1.getFirstName().compareTo(o2.getFirstName()) < 0)
            return 1;
        if(o1.getFirstName().compareTo(o2.getFirstName()) > 0)
            return -1;
        return 0;
    }
}
