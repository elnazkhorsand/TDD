package com.serenitydojo;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingWithCollections {

    @Test
    public void workingWithTheMostBasicCollectionsArrayInJava(){
        String[] colors = {"Red","Blue", "Green"};

        String[] moreColors = new String[3];

        moreColors[0] = "Yellow";
        moreColors[1] = "Pink";

        System.out.println("The first color is: " + moreColors[0]);
        System.out.println("The second color is: " + moreColors[1]);
    }


    //Array
    @Test
    public void workingWithLoops(){
        String[] colors = {"Red","Blue", "Green", "Black", "White", "Yellow", "Grey", "Purple"};

        System.out.println("The colors in order are: \n");

        for (int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }

    }

    @Test
    public void workingWithSimpleList(){
        List simpleList = new ArrayList();

        //Order matters and you can have duplicate values
        simpleList.add("a string value");
        simpleList.add(123);
        simpleList.add(123);
        simpleList.add(123);
        simpleList.add(45);

        assertThat(simpleList).contains("a string value", 123, 45);
    }

    @Test
    public void workingWithListArrayList(){
        List<String> colors = new ArrayList<>();

        //Order matters and you can have duplicate values
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Black");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Silver");
        colors.add("Gold");

        System.out.println("Colors in the List are:\n");
        for (String eachColor: colors){
            System.out.println("---- " + eachColor);
        }

        assertThat(colors.size()).isEqualTo(13);

        //Empty the List and check if it is empty or not
        colors.clear();

        assertThat(colors).isEmpty();
    }

    //Immutable List - Arrays.asList
    @Test
    public void workingWithImmutableList(){
        List<String> immuList = Arrays.asList("Eli", "Moh");

        assertThat(immuList.size()).isEqualTo(2);
        assertThat(immuList.indexOf("Eli")).isEqualTo(0);
        assertThat(immuList.indexOf("Moh")).isEqualTo(1);

    }

    //Immutable List - Arrays.asList - Sub List
    @Test
    public void workingWithImmutableListSubList(){
        List<String> bigFixedList = Arrays.asList("Zero", "One", "Two","Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten");

        System.out.println("The main list items are:\n");
        for (String bigFixedListItem: bigFixedList){
            System.out.println(bigFixedListItem);
        }

        assertThat(bigFixedList.size()).isEqualTo(11);

        List<String> bigFixedListSubList = bigFixedList.subList(0,4);
        assertThat(bigFixedListSubList).contains("Zero", "One", "Two","Three");
        assertThat(bigFixedListSubList.size()).isEqualTo(4);

        System.out.println("The sub list items are:\n");
        for(String bigFixedListSubListItem: bigFixedListSubList){
            System.out.println(bigFixedListSubListItem);
        }
    }

    @Test
    public void workingWithSetHashSet(){
        Set<String> colors = new HashSet<>();

        /*Order doesn't matters and you cannot have duplicate values
        like the mathematical set.
         */
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Black");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Silver");
        colors.add("Gold");

        System.out.println("Colors in the Set are:\n");
        for (String eachColor: colors){
            System.out.println("---- " + eachColor);
        }
    }

    @Test
    public void convertingListToSet(){
        List<String> myList = Arrays.asList("One","Two","Three","Four");

        Set<String> mySet = new HashSet<>(myList);

        assertThat(mySet).containsExactlyInAnyOrder("One","Two","Three","Four");
        assertThat(mySet).contains("One","Two","Three","Four");
    }



    @Test
    public void workingWithCollectionSort(){
        List<Integer> myList = Arrays.asList(10, 5, 9, 1, 3, 3, 7);
        System.out.println("-------------------------------\n");
        System.out.println("The list before sorting it out:\n");

        for (Integer myListItem: myList){
            System.out.println(myListItem.toString());
        }

        System.out.println("-------------------------------\n");
        System.out.println("The List after sorting:\n");
        Collections.sort(myList);

        for (Integer myListItem: myList){
            System.out.println(myListItem.toString());
        }

        assertThat(myList).containsExactly(1, 3, 3, 5, 7, 9, 10);
    }


    @Test
    public void workingWithListMaxAndMin() {
        List<Integer> myList = Arrays.asList(10, 5, 9, 1, 3, 3, 7, 100, 45, 87, 12, 90, 65, 9, 23, 87);

        int max = Collections.max(myList);
        System.out.println("The max number in the list is: " + max);
        assertThat(max).isEqualTo(100);

        int min = Collections.min(myList);
        System.out.println("The min number of the list is: " + min);
        assertThat(min).isEqualTo(1);

        System.out.println("\n---------------------\n");
        System.out.println("My sorted list numbers are:");

        Collections.sort(myList);

        for (Integer myListItem: myList){
            System.out.println(myListItem.toString());
        }
    }

    @Test
    public void combineTwoLists(){
        List<String> names = new ArrayList<>();
        names.add("Zero");
        names.add("One");
        names.add("Two");
        names.add("Three");
        names.add("Four");
        names.add("Five");

        List<String> moreNames = new ArrayList<>();
        moreNames.add("Six");
        moreNames.add("Seven");
        moreNames.add("Eight");
        moreNames.add("Nine");
        moreNames.add("Ten");

        names.addAll(moreNames);

        System.out.println("\nNames in the list are:");
        for (String eachName: names){
            System.out.println(eachName);
        }

        assertThat(names).containsExactly("Zero","One","Two","Three","Four","Five","Six","Seven"
                ,"Eight","Nine","Ten");
    }
}
