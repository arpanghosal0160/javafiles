import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(69);
        list.add(444);
        list.add(655);
        list.add(556);
        list.add(534);
        list.add(69);
        list.add(69);
        list.add(69);
        list.add(69);
        list.add(69);
        list.add(69);
        list.add(69);
        list.add(69); list.add(69);
        list.add(69);
        list.add(69); list.add(69);
        list.add(69);
        //add as many as you want
        System.out.println(list);
        list.set(0,99); //changes 0th index to 99
        list.remove(7); //remove a value at a index
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(5));
        }
    }
}
