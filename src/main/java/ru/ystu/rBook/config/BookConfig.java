package ru.ystu.rBook.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import ru.ystu.rBook.domain.Book;
import ru.ystu.rBook.service.BookService;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class BookConfig {
    private final BookService service;

    @PostConstruct
    public void init() {
        service.create(new Book(1L, "Преступление и наказание", "1843", "Достоевский", "роман"));
        service.create(new Book(2L, "Живой мир", "1998", "Королева", "Энциклопедия"));
        service.create(new Book(3L, "Алиса в зазеркалье", "2019", "Льюис Кэрролл", "Сказка"));
        service.create(new Book(4L, "Нашествие", "1989", "Перлов", "Фантастика"));
        service.create(new Book(5L, "Граф Монте-Кристо", "1876", "Дюма", "Роман"));
    }
}
