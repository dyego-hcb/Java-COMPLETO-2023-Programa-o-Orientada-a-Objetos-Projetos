# Curso Java Completo 2023 - Seção 24

Nesta seção do curso, abordaremos o projeto "API-RESTful com Spring Boot e Banco MongoDB (WebServices + NoSQL)". Vamos explicar o contexto da seção e fornecer informações sobre onde encontrar os resumos e códigos dos exercícios relacionados a esta parte do curso.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2024/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- Na pasta **[Resumo](../SECAO%2024/RESUMO/)**, você encontrará o resumo completo desta seção.

## Ferramentas Necessárias

Para este projeto, você precisará das seguintes ferramentas:

- [Spring Tool Suite (STS)](https://spring.io/tools)
- [Postman](https://www.postman.com/)
- [MongoDB](https://www.mongodb.com/)

Certifique-se de instalar essas ferramentas em seu sistema antes de prosseguir.

### Instalando o MongoDB

A instalação do MongoDB pode variar dependendo do seu sistema operacional. Recomendamos seguir a documentação oficial no site da MongoDB para obter instruções detalhadas.

- [Instalação do MongoDB](https://docs.mongodb.com/manual/installation/)

Aqui estão alguns comandos úteis para iniciar e parar o MongoDB:

No macOS, se você instalou via Homebrew:

- Para iniciar o MongoDB: `brew services start mongodb-community@7.0`
- Para parar o MongoDB: `brew services stop mongodb-community@7.0`

### Problemas Comuns em Bancos Relacionais e Soluções NoSQL

#### Problema 01: Incompatibilidade de Impedância

Quando lidamos com modelos relacionais, a incompatibilidade de impedância pode ser um desafio. Isso ocorre quando os dados armazenados em bancos de dados relacionais são representados de forma diferente da memória do computador, onde eles são representados como objetos relacionados. O uso de ORM (Object-Relational Mapping) ajuda a superar esse problema, mas pode ter problemas de desempenho.

#### Problema 02: Grande Volume de Dados e Acessos

Para lidar com grandes volumes de dados e acessos, você pode considerar a escalabilidade vertical (usar computadores mais poderosos) ou horizontal (adotar uma estrutura de cluster com vários computadores menores). Clusters e grids são uma opção mais flexível, oferecendo custo mais baixo e maior resiliência.

No entanto, bancos de dados relacionais não são ideais para clusters, e é aí que os bancos de dados NoSQL entram em cena.

### NoSQL e Suas Características

NoSQL (Not Only SQL) é uma abordagem de banco de dados que não segue o modelo relacional. Suas características comuns incluem:

- Boa execução em clusters.
- Código aberto.
- Surgiram no século XXI.
- Não possuem um esquema fixo.

Há duas classes principais de bancos de dados NoSQL:

1. Banco de Dados Orientado a Agregados:
   - Modelo Chave-Valor (por exemplo, Riak, Redis).
   - Modelo de Documentos (por exemplo, MongoDB, CouchDB).
   - Modelo Família de Colunas (por exemplo, Cassandra, Apache HBase).

2. Banco de Dados de Grafos (por exemplo, Neo4j):
   - Úteis para dados com relacionamentos complexos.

Agregados são conjuntos de objetos relacionados tratados como uma unidade, armazenados como uma unidade em um banco de dados NoSQL. Isso permite um acesso rápido e evita a necessidade de junções.

### Desenvolvendo um Projeto de API RESTful com Spring Boot e MongoDB

Nesta seção do curso, vamos desenvolver um projeto de API RESTful usando o Spring Boot e o MongoDB. O código-fonte do projeto está disponível no seguinte repositório no GitHub:

- [Repositório do Projeto](https://github.com/zebodexx/workshop-springboot3-mongodb)
- Na pasta **[Resumo](../SECAO%2024/RESUMO/)**, você encontrará o passo a passo completo do desenvolvimento do projeto desta seção.

Certifique-se de verificar o repositório para obter o código e as informações relacionadas a esta seção do curso.