package com.k8u.igo.demo.springmongodb.converter;


import com.k8u.igo.demo.springmongodb.model.dto.BookDto;
import com.k8u.igo.demo.springmongodb.model.dto.entity.Book;
import org.springframework.core.convert.converter.Converter;

public class BookDtoConverter implements Converter<BookDto, Book> {
    @Override
    public Book convert(BookDto source) {
        return Book.builder()
                   .title(source.getTitle())
                   .build();
    }
}
