package com.anthonyponte.library.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nombre;
  private String apellido;

  public Autor() {}

  public Autor(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Autor(Integer id, String nombre, String apellido) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return "Autor{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
  }
}
