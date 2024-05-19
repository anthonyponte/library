package com.anthonyponte.library.controller;

import com.anthonyponte.library.pojo.Autor;
import com.anthonyponte.library.service.AutorService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AutorController {

  private final AutorService service;

  public AutorController(AutorService service) {
    this.service = service;
  }

  @RequestMapping("/autors")
  public String readAutors(Model model) {
    List<Autor> autores = service.readAll();
    model.addAttribute("autores", autores);
    return "autors";
  }

  @RequestMapping("/autors/search")
  public String searchAutors(@RequestParam("q") String autor, Model model) {
    List<Autor> autores = service.readAll(autor);
    model.addAttribute("autores", autores);
    return "autors";
  }

  @RequestMapping("/autor/new")
  public String newAutor(Model model) {
    model.addAttribute("autor", new Autor());
    return "autor";
  }

  @PostMapping("/autor/save")
  public String saveAutor(Autor autor) {
    service.save(autor);
    return "redirect:/autors";
  }

  @RequestMapping("/autor/edit")
  public String editAutor(int id, Model model) {
    Autor autor = service.read(id);
    model.addAttribute("autor", autor);
    return "autor";
  }

  @RequestMapping("/autor/delete")
  public String deleteAutor(int id, Model model) {
    service.delete(id);
    return "redirect:/autors";
  }
}
