import java.util.*;

public class reverse_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer>list= new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(7);
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
    }
    
}
