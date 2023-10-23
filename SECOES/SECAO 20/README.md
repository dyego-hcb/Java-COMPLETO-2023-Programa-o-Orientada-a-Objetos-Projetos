# Seção 20 - Programação Funcional e Expressões Lambda

Nesta seção do curso "Java Completo 2023 - Programação Orientada a Objetos + Projetos", exploramos conceitos cruciais de programação funcional e introduzimos expressões lambda. Esses tópicos são fundamentais para tornar o código mais expressivo e conciso.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2019/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2019/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2019/RESUMO/)**, você encontrará o resumo completo desta seção.

## Comparator e Ordenação

**Problema:** Como implementar a comparação de objetos em Java de forma flexível?

No Java, é comum usar a interface `Comparable` para definir a ordenação de objetos. No entanto, essa abordagem tem suas desvantagens, pois torna a classe aberta a modificações se o critério de comparação mudar. Uma solução é usar a interface funcional `Comparator`.

- **Comparator:** É uma interface funcional com o método `compare`. Permite criar classes que definem a lógica de comparação entre objetos.

- **Expressões Lambda:** Permitem criar funções anônimas e simplificar a implementação de comparators, tornando o código mais conciso.

## Programação Funcional e Cálculo Lambda

Nesta seção, também exploramos os fundamentos da programação funcional, baseada no cálculo lambda, um formalismo matemático. Discutimos os seguintes conceitos:

- Paradigmas de programação: Imperativo, Orientado a Objetos, Funcional, Lógico e Multiparadigma.

- Transparência referencial: Funções têm transparência referencial quando seu resultado é sempre o mesmo para os mesmos dados de entrada, o que simplifica a previsibilidade do código.

- Objetos Imutáveis: Na programação funcional, é comum trabalhar com objetos imutáveis, onde os valores não mudam após a criação.

- Funções de Primeira Ordem: Funções podem ser passadas como parâmetros e retornadas por outras funções.

- Expressividade e Código Conciso: A programação funcional permite escrever código mais conciso e expressivo, reduzindo a verbosidade.

- Tipagem Dinâmica e Inferência de Tipos: A inferência de tipos pelo compilador é comum na programação funcional.

## Streams

Finalmente, introduzimos as `Streams`, uma poderosa ferramenta para processar sequências de dados de forma declarativa, paralela e sem efeitos colaterais. As Streams permitem operações encadeadas (pipeline) e são compostas por operações intermediárias e terminais.

- **Operações Intermediárias:** Produzem uma nova Stream e são executadas apenas quando uma operação terminal é invocada. Incluem `filter`, `map`, `flatMap`, `peek`, entre outras.

- **Operações Terminais:** Produzem um resultado não relacionado à Stream e encerram o processamento. Exemplos são `forEach`, `toArray`, `reduce`, `collect`, `min`, `max`, `count`, entre outras.

Para criar uma Stream, basta chamar `.stream()` ou `.parallelStream()` em uma coleção ou objeto compatível. Você pode usar as Streams para filtrar, mapear, reduzir e processar dados de maneira eficiente.