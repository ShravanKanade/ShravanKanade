import java.util.ArrayList;
import java.util.Iterator;
class IteratingAList
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(30);
        al.add(40);

        Iterator it = al.iterator();
        System.out.println("While Loop: ");
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Advanced For Loop : ");
        for (Object i:al.toArray()) {
            System.out.println(i);
        }
        System.out.println("For Loop : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}