package storage;

import model.User;

public class UserStorage {
    private User[] array = new User[10];
    private int size = 0;


    public User add(User user) {
        if (size == array.length) {
            extend();
        }
        array[size++] = user;
        return user;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }

    }

    private void extend() {
        User[] tmp = new User[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);
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

    public User getUserByLessonName(int index) {
        if (index < 0 || index >= size) {

            return null;
        }
        return array[index];
    }


    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                return array[i];
            }


        }
        return null;
    }


}




