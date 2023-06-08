package com.k8u.igo.demo.springmongodb.web;

import com.k8u.igo.demo.springmongodb.model.dto.BookDto;
import com.k8u.igo.demo.springmongodb.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto aBookDto) {
        BookDto book = bookService.createBook(aBookDto);
        return ResponseEntity.ok(book);
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> doGetBooks() {
        List<BookDto> list = bookService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<BookDto> doGetBook(@PathVariable("bookId") String bookId) {
        BookDto book = bookService.findById(bookId);
        return ResponseEntity.ok(book);
    }


}
