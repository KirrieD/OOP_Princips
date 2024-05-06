package ru.netology.services;

public class Main {

    public static void main(String[] args){
        Post post = new Post();
        post.name = "Ваня";
        post.passport = "4444 №444444";
        post.ptronymic = "Ванькович";
        post.phone = "+7(000) 000-00-00";
        post.surname = "Ваньков";
        post.subscription = true;

        FormDate birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.years = 1999;

        System.out.println(post.name);
    }
}