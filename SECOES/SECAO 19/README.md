# Seção 19 - Generics, Set, Map - Curso Java Completo 2023

## Resumo

Nesta seção do curso, exploramos os conceitos de Generics, Sets e Maps em Java. Compreendemos como essas estruturas podem ser fundamentais para lidar com dados de maneira flexível e eficiente.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2019/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2019/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2019/RESUMO/)**, você encontrará o resumo completo desta seção.


### Generics

Generics são um recurso que permite a parametrização de classes, interfaces e métodos por tipo. Suas principais vantagens são reuso, segurança de tipo (type safety) e desempenho.

- Reuso: Generics permitem que você crie componentes que possam ser usados com diferentes tipos de dados.
- Segurança de Tipo: A utilização de Generics ajuda a evitar erros em tempo de execução relacionados a tipos de dados.
- Desempenho: Generics não exigem downcasting, o que resulta em melhor desempenho.

Além disso, exploramos tópicos avançados, como Generics delimitados e tipos curinga (wildcard types), que permitem a manipulação de tipos de dados de maneira mais flexível.

### Set

A interface Set representa um conjunto de elementos, sem repetições. As operações de adição, remoção e verificação da presença de elementos são eficientes. Principais implementações incluem HashSet, TreeSet e LinkedHashSet.

Utilizamos Sets para lidar com coleções de elementos únicos, como conjunto de palavras-chave em um documento.

### Map

A interface Map representa uma coleção de pares chave-valor. Os Mapas associam valores a chaves, permitindo a recuperação eficiente de valores com base nas chaves. Principais implementações incluem HashMap, TreeMap e LinkedHashMap.

Mapas são comuns em cenários onde precisamos associar informações, como um dicionário ou cache de dados.

### Princípios Importantes

Nesta seção, aprendemos sobre os princípios fundamentais, como os métodos equals e hashCode, que são cruciais para comparação de objetos. Discutimos como classes personalizadas podem implementar esses métodos para garantir a correta comparação e ordenação.

Também exploramos como os tipos curinga (wildcard types) podem ser usados para criar métodos e classes genéricas que trabalham com tipos desconhecidos.