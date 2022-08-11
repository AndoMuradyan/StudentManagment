package storage;

import model.Student;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;
//    private int index;


    public Student add(Student student) {
        if (size == array.length) {
            extend();
        }
        array[size++] = student;
        return student;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }

    }

    private void extend() {
        Student[] tmp = new Student[array.length + 10];
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

    public void printStudentsByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }

        }

    }

    public int getSize() {
        return size;
    }

    public Student getStudentByLessonName(int index) {
        if (index < 0 || index >= size) {

            return null;
        }
        return array[index];
    }


//    int set(int index, String lesson) {
//        return array[index].setLesson(lesson);
//    }


}




