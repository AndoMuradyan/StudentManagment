package storage;

import model.Lesson;

public class LessonStorage {
    private Lesson[] array = new Lesson[10];
    private int size = 0;
//    private int index;


    public void add(Lesson lesson) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = lesson;

    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }

    }

    private void increaseArray() {
        Lesson[] tmp = new Lesson[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }


    boolean isEmpty() {
        return size == 0;

    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {

            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];

            }
            size--;
        }

    }


    public int getSize() {
        return size;
    }

    public Lesson getLessonByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }


}




