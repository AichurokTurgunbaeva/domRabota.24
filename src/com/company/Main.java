package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 2);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"+"Sorted array: ");
            sort(arr);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0, 2));
        }
        System.out.println("\n" +"Arraylist: "+ arrayList);
        System.out.println("\n"+"Sorted arraylist: ");
        sort(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0, 2));
        }
        System.out.println("\n" + "Linkedlist: "+linkedList);
        System.out.println("\n"+"Sorted linkedlist: ");
        sort(linkedList);
        }

    public static void sort(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            Collections.sort(list);
        }
        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);

    }

    public static void sort(LinkedList<Integer> array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            list.push(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);

    }
    }





