package com.anthonyponte.library.repository;

import com.anthonyponte.library.pojo.Autor;
import com.anthonyponte.library.pojo.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Libro, Integer> {
  @Query("FROM Libro l ORDER BY l.titulo")
  public List<Libro> readAll();

  @Query("FROM Libro l WHERE l.autor.id = ?1 ORDER BY l.titulo")
  public List<Libro> readAll(int autorId);

  @Query("FROM Libro l WHERE l.titulo LIKE %?1% ORDER BY l.titulo")
  public List<Libro> readAll(String titulo);

  @Query("FROM Libro l WHERE l.id = ?1")
  public Libro read(int id);

  @Query("FROM Autor a ORDER BY a.apellido")
  public List<Autor> readAutors();
}
