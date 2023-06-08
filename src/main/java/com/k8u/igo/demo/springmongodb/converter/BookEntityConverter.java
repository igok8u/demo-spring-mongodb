package com.k8u.igo.demo.springmongodb.converter;

import com.k8u.igo.demo.springmongodb.model.dto.BookDto;
import com.k8u.igo.demo.springmongodb.model.dto.entity.Book;
import org.springframework.core.convert.converter.Converter;

public class BookEntityConverter implements Converter<Book, BookDto> {
    @Override
    public BookDto convert(Book book) {
        return BookDto.builder()
                      .title(book.getTitle())
                      .id(book.getId())
                      .build();
    }
}
