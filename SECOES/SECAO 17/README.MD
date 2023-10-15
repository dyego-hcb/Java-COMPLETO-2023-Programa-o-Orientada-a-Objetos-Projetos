# Seção 17 - Trabalhando com Arquivos - Curso Java Completo 2023

Nesta seção do curso, exploraremos operações de entrada e saída (E/S) de arquivos em Java. Aprenderemos a manipular arquivos de texto e pastas, bem como a acessar informações sobre arquivos.

## Estrutura de Pastas

- A pasta **[Exemplos Video Aula](../SECAO%2017/PROJETOS/EXEMPLOS%20VIDEO%20AULA/)** contém códigos Java demonstrados nas videoaulas.
- A pasta **[Exercicios](../SECAO%2017/PROJETOS/EXERCICIOS/)** contém exercícios práticos propostos e realizados.
- Na pasta **[Resumo](../SECAO%2017/RESUMO/)**, você encontrará o resumo completo desta seção.

## Conteúdo da Seção

Nesta seção, abordaremos os seguintes tópicos:
Vale ressaltar que na pasta **[Resumo](../SECAO%2017/RESUMO/)**, você encontrará o resumo completo desta seção.

### Leitura de Arquivos

- Utilizaremos as classes `File` e `Scanner` para ler arquivos de texto.
- É importante tratar exceções, principalmente `IOException`, ao trabalhar com arquivos.

### Escrita de Arquivos

- Usaremos as classes `FileWriter` e `BufferedWriter` para escrever em arquivos.
- A classe `FileWriter` cria ou recria um arquivo no sistema.
- A classe `BufferedWriter` é mais eficiente para escrita, pois usa um buffer de memória.

### Manipulação de Pastas

- A classe `File` também pode ser usada para manipular pastas.
- Você pode listar todas as pastas ou arquivos em um diretório específico.
- Para criar uma pasta, utilize o método `mkdir()`.

### Informações de Caminho do Arquivo

- Você pode acessar informações sobre o arquivo, como o nome, o caminho e o caminho completo.
- A classe `File` possui métodos como `getName()`, `getParent()`, e `getPath()` para acessar essas informações.

Lembre-se de tratar exceções ao trabalhar com arquivos para garantir que seu programa seja robusto. Utilize o bloco `try-with-resources` sempre que possível para garantir que os recursos sejam fechados corretamente.

