# Resumo da Seção 21 - Acesso a Banco de Dados com JDBC

## Visão Geral do JDBC
A Seção 21 trata do acesso a bancos de dados com JDBC (Java Database Connectivity), que é a API padrão do Java para acesso a dados. O JDBC permite que você acesse bancos de dados a partir de aplicativos Java de maneira uniforme. Ele se baseia em pacotes como `java.sql` e `javax.sql` para interagir com bancos de dados.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2021/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2021/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2021/RESUMO/)**, você encontrará o resumo completo desta seção.

## Base do JDBC
O JDBC atua como um intermediário entre sua aplicação Java e bancos de dados específicos. Para se conectar a bancos de dados, é necessário instalar um driver JDBC adequado para o banco de dados específico, como PostgreSQL, Oracle ou Sybase. O JDBC cuida da conversão de código Java para as linguagens específicas dos bancos de dados.

## Álgebra Relacional e SQL (Nivelamento)
Nesta seção, você receberá uma introdução à álgebra relacional e SQL. Muitas linguagens orientadas a objetos (OO) incorporam tecnologias que permitem trabalhar com dados de forma semelhante ao SQL e à álgebra relacional. Objetos em aplicativos de mercado geralmente são mapeados para tabelas em bancos de dados relacionais, com chaves primárias e estrangeiras para representar relacionamentos.

### Operações Básicas da Álgebra Relacional
- Restrição
- Projeção
- Produto Cartesiano
- Junção (Produto Cartesiano + Restrição de Chaves Correspondentes)

### Operações de Produto Cartesiano e Junção em SQL
- `SELECT * FROM TABELA1, TABELA2` (Produto Cartesiano)
- `SELECT * FROM TABELA1, TABELA2 WHERE TABELA1.ATRIBUTO1 = TABELA2.ATRIBUTO2` (Junção)

### Operações de Restrição e Projeção em SQL
- `SELECT * FROM TABELA1, TABELA2 WHERE TABELA1.ATRIBUTO1 = TABELA2.ATRIBUTO2 AND TABELA1.NOME_ATRIBUTO1 = 'NOME_PESQUISA'` (Restrição)
- `SELECT * FROM TABELA1.*, TABELA2.ATRIBUTO_TABELA2` (Projeção)

## Instalação do MySQL
Para começar a trabalhar com bancos de dados MySQL, é necessário instalar o MySQL Server em sua máquina. Você pode encontrar instruções detalhadas no [site oficial do MySQL](https://dev.mysql.com/downloads/). Certifique-se de escolher a versão adequada para o seu sistema operacional.

## Preparação do Projeto no Eclipse
Para criar um projeto Java que se conecta ao banco de dados MySQL, siga estas etapas:

1. Crie um banco de dados no MySQL Workbench.
2. Instale o driver JDBC do MySQL em seu projeto.
3. Defina as informações de conexão com o banco de dados em um arquivo `db.properties` na raiz do seu projeto.
4. Crie uma classe para gerenciar a conexão com o banco de dados, como `DB.java`.

## Recuperar Dados
Nesta seção, você aprenderá a recuperar dados de um banco de dados MySQL em seu aplicativo Java. Isso envolve o uso de classes como `Statement` e `ResultSet` para criar consultas SQL, executá-las e recuperar os resultados.

## Inserir Dados
Você também aprenderá como inserir dados em um banco de dados MySQL a partir de seu aplicativo Java. Usando `PreparedStatement`, você pode construir consultas parametrizadas para adicionar novos registros ao banco de dados.

## Atualizar Dados
A seção também cobre a atualização de dados em um banco de dados MySQL. Usando consultas SQL do tipo `UPDATE`, você pode modificar os registros existentes com base em determinados critérios.

## Deletar Dados
A exclusão de dados de um banco de dados MySQL é abordada nesta seção. Você aprenderá a usar consultas SQL do tipo `DELETE` para remover registros específicos de uma tabela.

## Transações
As transações são explicadas nesta seção. Uma transação garante que um conjunto de operações no banco de dados seja atômico, consistente, isolado e durável. Isso é crucial para manter a integridade dos dados ao executar várias operações em sequência.

## Padrão de Projeto DAO (Data Access Object)
Você será apresentado ao padrão de projeto DAO, que sugere a criação de objetos responsáveis pelo acesso aos dados para cada entidade do sistema. Por exemplo, para as entidades Cliente, Produto e Pedido, você teria os objetos ClienteDAO, ProdutoDAO e PedidoDAO. Cada DAO é definido por uma interface, permitindo flexibilidade na implementação.

## Projeto JDBC com Padrão DAO
A seção conclui com um projeto que demonstra o uso do padrão DAO para acessar e manipular dados no banco de dados MySQL a partir de um aplicativo Java. Você encontrará o projeto detalhado e exemplos de código nos diretórios **[Exercicios](../SECAO%2021/PROJETOS/EXERCICIOS/)** deste repositório e https://github.com/zebodexx/Projeto-DAO-JDBC .