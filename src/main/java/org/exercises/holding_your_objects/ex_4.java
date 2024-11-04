package org.exercises.holding_your_objects;


/*
    Exercise 4: (3) Create a generator class that produces character names (as String
    objects) from your favorite movie (you can use Snow White or Star Wars as a fallback) each
    time you call next( ), and loops around to the beginning of the character list when it runs out
    of names. Use this generator to fill an array, an ArrayList, a LinkedList, a HashSet, a
    LinkedHashSet, and a TreeSet, then print each container.

* */


import java.util.*;

class Generator{
    private String[] characters = {"Snow White", "Doc", "Happy", "Sleepy", "Bashful", "Sneezy", "Dopey"};
    private int index = 0;
    public String next(){
        String name = characters[index];
        /*
        Initial index = 0

        index = (0 + 1) % 8 = 1
        Index = 1

        index = (1 + 1) % 8 = 2
        Index = 2

        index = (2 + 1) % 8 = 3
        Index = 3

        index = (3 + 1) % 8 = 4
        Index = 4

        index = (4 + 1) % 8 = 5
        Index = 5

        index = (5 + 1) % 8 = 6
        Index = 6

        index = (6 + 1) % 8 = 7
        Index = 7 (last character)

        index = (7 + 1) % 8 = 0 → loops back to the beginning
        */
        index = (index + 1) % characters.length;
        return name;
    }

}
public class ex_4 {



    public static void main(String[] args) {

        Generator generator = new Generator();
        String[] array = new String[7];
        List<String> list = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < 7; i++) {
            String name = generator.next();
            array[i] = name;
            arrayList.add(name);
            linkedList.add(name);
            hashSet.add(name);
            linkedHashSet.add(name);
            treeSet.add(name);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

    }

}