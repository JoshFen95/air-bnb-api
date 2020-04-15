package com.example.airbnbapi.service;

import com.example.airbnbapi.mapper.FetchObject;
import com.example.airbnbapi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements ServiceInterface{


    private Book[] cachedBooks;

    @Autowired
    public BookService(FetchObject<Book> fetchObject) {

        this.cachedBooks = fetchObject.getObjectFromJsonFile("books", Book[].class);

    }


    @Override
    public Book[] getItems() {
        return cachedBooks;    }
}

