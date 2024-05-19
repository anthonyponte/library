package com.anthonyponte.library.service;

import com.anthonyponte.library.pojo.Autor;
import com.anthonyponte.library.repository.AutorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
  private final AutorRepository repository;

  public AutorService(AutorRepository repository) {
    this.repository = repository;
  }

  public List<Autor> readAll() {
    return repository.readAll();
  }

  public List<Autor> readAll(String autor) {
    return repository.readAll(autor);
  }

  public Autor read(int id) {
    return repository.read(id);
  }

  public Autor save(Autor autor) {
    return repository.save(autor);
  }

  public void delete(int id) {
    repository.deleteById(id);
  }
}
