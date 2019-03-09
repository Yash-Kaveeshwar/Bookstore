package com.bookstore.service.impl;

import com.bookstore.domain.Book;
import com.bookstore.repository.BookRepository;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Book service.
 */
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> findAll() {
		return (List<Book>) bookRepository.findAll();
	}

	public Book findOne(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public void updateQty(Book book) {
		bookRepository.save(book);
	}

}
