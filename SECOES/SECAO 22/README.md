# Seção 22: Java EE e Mapeamento Objeto-Relacional com JPA/Hibernate

A Seção 22 do curso de Java aborda o Java EE (Java Enterprise Edition) e o mapeamento objeto-relacional usando a JPA (Java Persistence API) e o Hibernate. Aqui estão os principais pontos:

## Visão Geral

- Java EE é um conjunto de especificações para desenvolvimento de aplicativos corporativos. JPA é uma das especificações mais importantes e oferece uma maneira de mapear objetos Java para o banco de dados relacional.
- Você aprenderá a instalar ferramentas essenciais, como o STS (Spring Tool Suite) para criação de APIs e rotas e o Postman para testar essas rotas.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2022/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- Na pasta **[Resumo](../SECAO%2022/RESUMO/)**, você encontrará o resumo completo desta seção.

## Desafio do Mapeamento Objeto-Relacional

- O principal desafio é a tradução entre o mundo orientado a objetos e o banco de dados relacional. Antes do uso do JPA, os programadores gastavam muito tempo traduzindo objetos em dados de banco de dados e vice-versa.

## Java Persistence API (JPA)

- JPA é uma especificação padrão da plataforma Java EE para mapeamento objeto-relacional.
- Para trabalhar com JPA, você precisa incluir uma implementação da API, como o Hibernate, em seu projeto.

## Estrutura do Projeto

- É recomendável usar um projeto Maven.
- O arquivo de configuração principal é o `persistence.xml` na pasta `src/main/resources/META-INF`.

## Mapeamento de Classes de Domínio

- Você aprenderá a mapear classes de domínio como entidades JPA usando anotações como `@Entity` e `@Id`.
- O Hibernate pode gerar automaticamente o esquema do banco de dados a partir das entidades.

## Uso do EntityManager

- O `EntityManager` é a classe central para interagir com o banco de dados no JPA.
- É fundamental entender o uso de transações ao trabalhar com o `EntityManager`.

## Acesso a Dados Simples

- O JPA simplifica o acesso a dados e o mapeamento entre objetos Java e tabelas de banco de dados.
- Você pode realizar operações como inserção, atualização, recuperação e remoção de objetos persistentes com facilidade.