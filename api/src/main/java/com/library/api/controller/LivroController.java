package com.library.api.controller;

import com.library.api.model.Livro;
import com.library.api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private LivroRepository repository;

    @GetMapping
    public List<Livro> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro){
        return repository.save(livro);
    }
}
