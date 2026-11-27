package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Book {
    private String title;
    private String author;

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("책제목");
        book1.setAuthor("작가명");
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
    }
}
