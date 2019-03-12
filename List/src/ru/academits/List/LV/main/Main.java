package ru.academits.List.LV.main;


import ru.academits.List.LV.list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addByIndex(0, 1);
        list.addByIndex(1, 2);
        list.addByIndex(2, 3);
        list.addByIndex(3, 4);
        list.addByIndex(4, 5);
        list.addByIndex(5, 6);
        list.addByIndex(6, 7);
        System.out.println(list);

        System.out.println("Size list is: " + list.getSize());
        System.out.println("The first element of the list is: " + list.getFirstElement());
        System.out.println("Get element by index: " + list.getByIndex(2));

        list.setByIndex(1, 10);
        System.out.println("The element was changed by index: " + list);

        list.removeByIndex(3);
        System.out.println("The element was removed from the list: " + list);

        list.addToTop(1);
        System.out.println("The element was added in the top: " + list);

        System.out.print("The first element was removed: " + list.removeFirstElement() + "->");
        System.out.println(list);

        System.out.print(list.removeNodeByData(3));
        System.out.println(" <- The element by data was removed: " + list);

        list.reverse();
        System.out.println("Reverse list result: " + list);

        System.out.println("Clone list: " + list.copyList());
    }
}