🚀 Projeto API REST com Spring Boot
🧭 Visão Geral

Este projeto demonstra a criação de uma API REST moderna desenvolvida em Java 17, utilizando o Spring Boot como base.
O objetivo é apresentar uma arquitetura limpa, organizada e de fácil manutenção, com boas práticas aplicadas para facilitar o desenvolvimento e a escalabilidade de novas aplicações.

📚 Documentação da API

A API conta com uma documentação interativa gerada automaticamente pelo Swagger (OpenAPI).
Ela permite testar os endpoints, visualizar os contratos e compreender as estruturas de requisição e resposta.

🔗 Caso a aplicação esteja hospedada em ambiente de produção, basta acessar a URL /swagger-ui.html após a inicialização do projeto.

⚙️ Tecnologias Utilizadas
Categoria	Tecnologias
Linguagem	Java 17
Framework Principal	Spring Boot
Banco de Dados	H2 Database (em memória)
ORM	Spring Data JPA
Documentação	Swagger / OpenAPI
Mensageria (opcional)	Spring for RabbitMQ
Dependências auxiliares	Lombok, DevTools
Deploy (opcional)	Railway / Render / Fly.io

Cada camada é responsável por uma parte específica:

Controller: expõe os endpoints REST.

Service: concentra as regras de negócio.

Repository: faz a comunicação com o banco de dados.

Domain/Model: contém as entidades e objetos de domínio.

🧠 Objetivo do Projeto

O propósito principal é demonstrar na prática o desenvolvimento de uma API moderna em Java, cobrindo desde a criação das entidades até a documentação e deploy na nuvem.
Além disso, o projeto pode servir como modelo base para aplicações futuras, sendo facilmente adaptável para diferentes contextos e domínios.
