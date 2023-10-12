# Seção 15 - Tratamento de Exceções

## Introdução 

Nesta seção do curso "Java Completo 2023 - Programação Orientada a Objetos + Projetos", exploraremos o tratamento de exceções em Java. O tratamento de exceções é um aspecto fundamental da programação, permitindo que o seu código lide com situações inesperadas de maneira consistente e flexível.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2015/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2015/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2015/RESUMO/)**, você encontrará o resumo completo desta seção.

## Resumo

- **Exceções**: Em Java, uma exceção é qualquer condição de erro ou comportamento inesperado encontrada durante a execução do programa. Existem dois tipos principais de exceções:
  - `Exception`: Obrigatórias de serem tratadas.
  - `RuntimeException`: Não obrigatórias, o compilador não exige tratamento.

- **Por que exceções?**: O modelo de tratamento de exceções permite que os erros sejam tratados de maneira organizada, inclusive de forma hierárquica, com base em diferentes tipos de exceções. Isso é importante para:
  - Delegar a lógica de tratamento de erro para a classe que conhece as regras que podem causar o erro.
  - Tratar exceções de tipos diferentes de forma organizada e hierárquica.
  - Permitir que as exceções carreguem dados adicionais, tornando-as mais informativas.

## Estrutura Try-Catch

A estrutura básica para tratamento de exceções é a combinação de `try` e `catch`. Ela funciona da seguinte forma:

- O bloco `try` contém o código que pode gerar uma exceção.
- Os blocos `catch` contêm o código a ser executado caso uma exceção ocorra. Cada bloco `catch` é responsável por tratar um tipo específico de exceção.

## Bloco Finally

O bloco `finally` é usado para conter código que deve ser executado independentemente de ter ocorrido ou não uma exceção. Isso é útil para garantir a liberação de recursos, como fechar arquivos ou conexões de banco de dados, após o processamento.

## Criação de Exceções Personalizadas

Você pode criar suas próprias exceções personalizadas estendendo as classes `Exception` ou `RuntimeException`. Ao criar exceções personalizadas, siga boas práticas, como colocá-las em pacotes separados, como `model.exceptions`.

## Estrutura de Pacotes Sugerida

Para manter seu código organizado, sugere-se uma estrutura de pacotes como a seguinte:

- Nesta estrutura, as exceções personalizadas podem ser colocadas no pacote `exceptions`, o que facilita a organização e manutenção do tratamento de exceções em seu aplicativo.