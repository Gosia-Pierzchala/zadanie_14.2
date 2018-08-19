import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Jan", "Kowalski"));
        users.add(new User("Agata", "Zawadzka"));
        users.add(new User("Piotr", "Nowak"));
        users.add(new User("Zygmunt", "Koch"));
        users.add(new User("Maria", "Bochun"));

        System.out.println("Wybierz rodzaj sortowania (po imieniu rosnąco / po imieniu malejąco / po nazwisku rosnąco / po nazwisku malejąco)");
        Scanner scan = new Scanner(System.in);
        String rodzajSortowania = scan.nextLine();

        if(rodzajSortowania.equals("po imieniu rosnąco")){
            FirstNameAscComparator firstNameAscComparator = new FirstNameAscComparator();
            Collections.sort(users,firstNameAscComparator);
        } else if (rodzajSortowania.equals("po imieniu malejąco")){
            FirstNameDescComparator firstNameDescComparator = new FirstNameDescComparator();
            Collections.sort(users,firstNameDescComparator);
        } else if (rodzajSortowania.equals("po nazwisku rosnąco")){
            LastNameAscComparator lastNameAscComparator = new LastNameAscComparator();
            Collections.sort(users,lastNameAscComparator);
        } else if (rodzajSortowania.equals("po nazwisku malejąco")){
            LastNameDescComparator lastNameDescComparator = new LastNameDescComparator();
            Collections.sort(users,lastNameDescComparator);
        } else
            System.out.println("Podana wartość jest nieprawidłowa. Lista nie została posortowana");

        System.out.println(users);

    }
}
