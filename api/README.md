# 📚 Library API - Sistema de Gerenciamento de Livros

Esta é uma API REST desenvolvida com **Java** e **Spring Boot** para gerenciar um acervo de livros. O projeto foi construído seguindo as melhores práticas de divisões em camadas (Model, Repository e Controller).

## 🚀 Tecnologias Usadas:
* **Java 21**
* **Spring Boot 4.0.5**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória)
* **Lombok** (Produtividade no código)
* **Swagger/OpenAPI** (Documentação da API)
* **Maven**: Gerenciador de dependências e build do projeto.

## 🏗️ Arquitetura do Sistema:
O projeto segue o padrão de responsabilidade única:
1. **Model**: Mapeamento objeto-relacional com JPA.
2. **Repository**: Camada de acesso a dados (Data Access Object).
3. **Controller**: Camada de exposição de endpoints RESTful.

## 🛠️ Como utilizar a aplicação:
1. Clone este repositório.
2. Abra no IntelliJ IDEA. (Certifique-se de ter o **JDK 21** instalado e configurado).
3. Execute a classe `ApiApplication`.
4. A API estará disponível em `http://localhost:8080`.

## 📖 Documentação (Swagger)
Para testar os endpoints (cadastrar e listar livros), acesse:
`http://localhost:8080/swagger-ui/index.html`

## 🗄️ Banco de Dados (H2)
Para visualizar as tabelas do banco de dados em tempo real:
* **URL:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:librarydb`
* **User:** `sa` | **Password:** (vazio)