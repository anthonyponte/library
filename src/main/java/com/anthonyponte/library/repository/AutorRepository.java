package com.anthonyponte.library.repository;

import com.anthonyponte.library.pojo.Autor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
  @Query("FROM Autor a ORDER BY a.id")
  public List<Autor> readAll();

  @Query("FROM Autor a WHERE a.nombre LIKE %?1% OR a.apellido LIKE %?1%")
  public List<Autor> readAll(String autor);

  @Query("FROM Autor a WHERE a.id = ?1")
  public Autor read(int id);
}
