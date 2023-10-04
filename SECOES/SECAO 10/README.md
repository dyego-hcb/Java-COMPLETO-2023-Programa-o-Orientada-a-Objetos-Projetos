# Seção 10 - Comportamento de Memória, Arrays, Listas

Nesta seção do curso de Java, exploraremos conceitos importantes relacionados ao comportamento de memória, arrays e listas.


## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2010/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2010/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2010/RESUMO/)**, você encontrará o resumo completo desta seção.

## Comportamento de Memória

Nesta parte do curso, você mergulhará nos aspectos essenciais do comportamento da memória em Java, incluindo:

- A diferença entre tipos por referência e tipos por valor.
- Contexto de desalocação de memória.
- O papel do Garbage Collector.
- Escopo local.

Ao entender como a memória funciona em Java, você terá uma base sólida para lidar com variáveis e objetos de maneira eficiente.

## Arrays e Listas

Após abordar os conceitos de memória, o curso se aprofundará em:

- Trabalhar com arrays e vetores.
- Boxing e Unboxing.
- Wrapper classes.
- Laço `for each` para percorrer coleções.
- Listas e suas vantagens, desvantagens e operações comuns.
- Matrizes (arrays bidimensionais) em Java.

Esses tópicos são fundamentais para a manipulação de dados e coleções em Java.

## Exemplo de Referência e Memória

Um exemplo prático de como as referências funcionam em Java:

java
Product p1, p2;

p1 = new Product("TV", 900, 0);
p2 = p1; // P2 agora aponta para o mesmo endereço de memória que p1

Entenda como as variáveis referenciam objetos na memória e como o Garbage Collector gerencia a desalocação de objetos não utilizados.

## Tipos Primitivos e Tipos por Referência
Em Java, os tipos primitivos são armazenados como valores, enquanto as classes são armazenadas como referências. Lembre-se dos tipos primitivos em Java:

- boolean
- char
- byte
- short
- int
- long
- float
- double

Saiba como eles diferem dos tipos por referência em termos de alocação de memória.

## Listas e Arrays
Aprenda sobre listas em Java, suas operações comuns e como percorrê-las usando o laço for each. Entenda as diferenças entre arrays e listas e quando cada um é mais apropriado para determinadas tarefas.

## Matrizes
Explore o uso de matrizes (arrays bidimensionais) em Java. Saiba como declará-las e acessar seus elementos. Compreenda suas vantagens e desvantagens em relação a outros tipos de coleções.
