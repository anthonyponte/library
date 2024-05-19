package com.anthonyponte.library.service;

import com.anthonyponte.library.pojo.Autor;
import com.anthonyponte.library.pojo.Libro;
import com.anthonyponte.library.repository.BookRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  private final BookRepository repository;

  public BookService(BookRepository repository) {
    this.repository = repository;
  }

  public List<Libro> readAll() {
    return repository.readAll();
  }

  public List<Libro> readAll(int autorId) {
    return repository.readAll(autorId);
  }

  public List<Libro> readAll(String titulo) {
    return repository.readAll(titulo);
  }

  public Libro read(int id) {
    return repository.read(id);
  }

  public Libro save(Libro libro) {
    return repository.save(libro);
  }

  public void delete(int id) {
    repository.deleteById(id);
  }

  public List<Autor> readAutors() {
    return repository.readAutors();
  }
}
