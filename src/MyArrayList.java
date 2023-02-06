/*
Написать свой класс MyArrayList как аналог классу ArrayList.

Можно использовать 1 массив для хранения данных.

Методы

add(Object value) добавляет элемент в конец
remove(int index) удаляет элемент под индексом
clear() очищает коллекцию
size() возвращает размер коллекции
get(int index) возвращает элемент под индексом
 */

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {

    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 16;
    private int size;
//    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};


    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.elements = new Object[initialCapacity];
        }
    }

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
//        this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;

    }


    private void resize() {
        if (elements.length == size) {
            Object[] newArray = new Object[size * 2];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    public void add(Object value) {
        resize();
        elements[size] = value;
        size++;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);


        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;

        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    public void clear() {
        size = 0;
        elements = new Object[0];
    }


    @Override
    public String toString() {

        return Arrays.toString(elements);
    }
}
