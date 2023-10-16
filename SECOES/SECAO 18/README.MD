# Seção 18 - Interfaces - Curso Java Completo 2023

## Resumo

Nesta seção do curso, exploraremos o conceito de interfaces em Java. Interfaces são fundamentais para criar soluções flexíveis e elegantes, e aprenderemos a utilizá-las para resolver problemas de forma eficaz.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2018/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2018/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2018/RESUMO/)**, você encontrará o resumo completo desta seção.

### Interfaces em Java

- Interfaces definem um contrato que as classes devem cumprir. Isso ajuda a criar sistemas com baixo acoplamento e flexíveis.

### Problema da Solução 1 Sem Interface

No exemplo prático, enfrentamos o problema do alto acoplamento entre as classes `RentalService` e `BrazilTaxService`. Isso ocorre porque `RentalService` faz uma declaração direta de `BrazilTaxService`. Se quisermos adicionar uma taxa para outro país no futuro, seria uma tarefa complicada, pois teríamos que fazer diversas alterações.

### Solução com Interface

Para resolver o problema de acoplamento, introduziremos uma interface chamada `TaxService`. `RentalService` dependerá da interface, não da implementação concreta. Agora, podemos implementar classes que atendem ao contrato da interface, permitindo que a lógica seja flexível e extensível.

### Inversão de Controle e Injeção de Dependência

A inversão de controle é um padrão de desenvolvimento que retira a responsabilidade de instanciar dependências das classes. A injeção de dependência, por meio do construtor, delega a responsabilidade de fornecer a dependência concreta a outra classe. Isso permite o reuso e a manutenção mais fáceis.

### Interface Comparable

Java fornece a interface `Comparable` para permitir a comparação de objetos. Implementar essa interface exige que a classe defina um método `compareTo`, que permite a comparação dos objetos. Isso é útil ao ordenar listas de objetos.

### Default Methods

A partir do Java 8, interfaces podem conter métodos concretos (default methods), que fornecem implementações padrão para métodos da interface. Isso reduz a necessidade de repetir a mesma implementação em todas as classes que implementam a interface. Os métodos padrão ajudam a manter a retrocompatibilidade e a promover a reutilização do código.

## Considerações Finais

Nesta seção, aprendemos a importância das interfaces em Java, como elas promovem um baixo acoplamento e flexibilidade no desenvolvimento de programas. A utilização de interfaces e métodos padrão é uma prática fundamental para criar código de alta qualidade e manutenível.