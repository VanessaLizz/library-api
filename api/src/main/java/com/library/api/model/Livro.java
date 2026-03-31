package com.library.api.model;

import jakarta.persistence.*; // Importa as ferramentas para ligar o código ao Banco de Dados
import lombok.Data; // Importa o Lombok para evitar criar códigos repetitivos (Getters/Setters)

@Entity // Avisa ao Spring que esta classe será uma tabela no Banco de Dados
@Data // Gera automaticamente os métodos de leitura e escrita (getters e setters)
@Table(name = "tb_livros")
public class Livro {
    @Id  // Define que este campo é a Chave Primária (ID único)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco de dados gera o número (1, 2, 3...) automaticamente
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
}
