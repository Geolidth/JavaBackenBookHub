package com.bookhub.probe.Controllers;

import com.bookhub.probe.Models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<Book> getBook(){
        Book book= new Book(1,"Cím","Szerző","leírás", "locate",1234, "New");
        return ResponseEntity.status(200).body(book);
    }
}
