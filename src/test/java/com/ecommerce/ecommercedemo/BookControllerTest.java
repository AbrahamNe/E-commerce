package com.ecommerce.ecommercedemo;

import com.ecommerce.ecommercedemo.model.Book;
import com.ecommerce.ecommercedemo.model.BookOrder;
import com.ecommerce.ecommercedemo.repositories.BookRepository;
import com.ecommerce.ecommercedemo.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerTest {
    List<BookOrder> orders = new ArrayList<>();
    @BeforeEach
   void setUp() {
        BookOrder bookOrder = new BookOrder(12, 1);

        orders.add(bookOrder);
    }
    @Autowired
    private BookService bookService;

    @MockBean
    private BookRepository bookRepository;

    @Test
    public void getBooksTest(){


        when(bookRepository.findAll()).thenReturn(Stream.
                of( new Book(1200,131121231,"description",
                        "description",new Date("2012-10-12"),
                        991,orders) ).collect(Collectors.toList()));

        assertEquals(1, bookService.findAll().size());
    }

}
