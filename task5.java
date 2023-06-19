import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        ArrayList<Integer> id = new ArrayList();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Vvedite FIO Vozrast Pol (cherez probel) ili q dlya vihoda: ");
            String str = in.nextLine();

            if (str.equals("q")) {
                break;
            }

            String[] person = str.split(" ");
            id.add(i);
            surname.add(person[0]);
            name.add(person[1]);
            patronymic.add(person[2]);
            age.add(Integer.parseInt(person[3]));
            gender.add(person[4]);

            i++;
        }

            Collections.sort(id, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return age.get(o1) - age.get(o2);
            }
        });

        id.forEach(n -> System.out.printf("%s %s. %s. %s %s \n", surname.get(n), name.get(n).charAt(0),
                    patronymic.get(n).charAt(0), age.get(n), gender.get(n)));

    }
}
