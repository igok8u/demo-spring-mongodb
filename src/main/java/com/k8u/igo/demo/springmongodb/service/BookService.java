package com.k8u.igo.demo.springmongodb.service;

import com.k8u.igo.demo.springmongodb.model.dto.BookDto;
import com.k8u.igo.demo.springmongodb.model.dto.entity.Book;
import com.k8u.igo.demo.springmongodb.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final ConversionService conversionService;

    public BookDto findById(String bookId) {
        return conversionService.convert(bookRepository.findById(bookId)
                                                       .orElse(Book.builder()
                                                                   .build()), BookDto.class);
    }

    public BookDto createBook(BookDto bookDto) {
        Book book = bookRepository.save(conversionService.convert(bookDto, Book.class));
        return conversionService.convert(book, BookDto.class);
    }

    public List<BookDto> findAll() {
        List<Book> books = bookRepository.findAll();
        return books.stream()
                    .map(book -> conversionService.convert(book, BookDto.class))
                    .toList();
    }
}
