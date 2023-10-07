# Curso Java Completo 2023 - Programação Orientada a Objetos + Projetos

Este repositório contém os materiais relacionados à Seção 13 do curso "Java Completo 2023 - Programação Orientada a Objetos + Projetos". Nesta seção, abordamos tópicos importantes, como Enumerações e Composições. Aqui você encontrará resumos e soluções de exercícios propostos.

# Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2013/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2013/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2013/RESUMO/)**, você encontrará o resumo completo desta seção.

## Enumerações

As enumerações são usadas para representar vários tipos que possuem um conjunto de constantes relacionadas. Por exemplo, o ciclo de vida de um pedido pode ser representado usando enumerações. Em Java, as enumerações são definidas usando a palavra-chave `enum`.

- Documentação das classes enumeradas em Java: [Documentação Oficial](https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html)

## Composições

Composição é um tipo de associação que permite que um objeto conheça outro. Essa relação pode ser do tipo "tem-um" ou "tem-vários". Existem várias categorias de classes em um sistema orientado a objetos, como:

1. **View:** Telas do sistema.
2. **Controllers:** Camada que faz a ponte entre a interface gráfica e o sistema.
3. **Entities:** Classes que representam entidades do negócio, como produtos e clientes.
4. **Services:** Classes que fornecem serviços.
5. **Repositories:** Classes que lidam com o armazenamento e acesso a dados.
6. **Application:** Classe principal do aplicativo, geralmente contendo o método `main`.

Cada categoria de classe pode ser considerada como um pacote em Java para fins de organização e boas práticas de design.

## Observações Importantes

- Quando se trata de listas em uma classe, evite fornecer métodos de set (`set`) para evitar que a lista seja substituída por outra, o que não é uma boa prática.
- A delegação é um conceito importante, onde cada classe deve ter funções bem definidas e relacionadas à sua responsabilidade.
- Lembre-se de que o mês no objeto `Calendar` começa com 0 (janeiro é 0, fevereiro é 1, etc.).
- `StringBuilder` é uma classe que otimiza a construção de strings muito grandes, usando o método `append` para concatenar várias strings.
