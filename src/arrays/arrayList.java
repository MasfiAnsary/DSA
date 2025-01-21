package arrays;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i < 10; i++){
            list.add(i);
        }

        System.out.println(list);

        list.add(10);
        list.add(12);
        list.remove(0);

        System.out.println(list);

        list.set(10, 11);

        System.out.println(list);

    }
}
