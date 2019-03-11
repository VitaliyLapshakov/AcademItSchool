package ru.academits.List.LV.list.list;

class ListItem<T> {
    private T data;
    private ListItem<T> next;

    ListItem(T data) {
        this.data = data;
    }

    ListItem(T data, ListItem<T> next) {
        this.data = data;
        this.next = next;
    }

    T getData() {
        if (data == null) {
            throw new NullPointerException("Data is empty");
        }

        return data;
    }

    void setValue(T data) {
        this.data = data;
    }

    ListItem<T> getNext() {
        return next;
    }

    void setNext(ListItem<T> next) {
        this.next = next;
    }
}
