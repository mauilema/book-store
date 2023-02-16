package com.joe.bookstore.model;

public class Book {

    public int bookId;
    public String title;
    public String bookImageUrl;
    public String shortDescription;

    public Book(int bookId, String title, String bookImageUrl, String shortDescription) {
        this.bookId = bookId;
        this.title = title;
        this.bookImageUrl = bookImageUrl;
        this.shortDescription = shortDescription;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfilePicUrl() {
        return bookImageUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.bookImageUrl = profilePicUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
