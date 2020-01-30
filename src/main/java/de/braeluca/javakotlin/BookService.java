package de.braeluca.javakotlin;

import de.braeluca.javakotlin.embeddedId.javakotlin.id.BookEntity;
import io.micronaut.context.annotation.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named
@Context
public class BookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookService.class);

    private BookRepository bookRepository;


    @Inject
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;

        BookEntity entity = new BookEntity("1","TestName");
        bookRepository.save(entity);

    }

}
