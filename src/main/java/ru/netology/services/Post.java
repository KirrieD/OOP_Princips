package ru.netology.services;

public class Post {
    public String name;
    public String passport;
    public String ptronymic;
    public String phone;
    public String surname;
    public boolean subscription;

    FormDate birthday = new FormDate();

    public FormDate getBirthday() {
        return birthday;
    }
}
