# Analisador sintático simples

## Descrição do Projeto

> A ideia desta atividade é desenvolver um parser simplificado a fim de consolidar os
conceitos sobre análise sintática. A entrada desse parser é apenas uma linha de texto.

O projeto foi desenvolvido em Java. A verificação de sintaxe é feita por um algoritmo de Análise Descendente Preditiva.

O código foi divido em 3 partes: 

1. IParser: especifica os métodos essenciais para um parser.
2. Parser: analisa as expressões simples de acordo com as regras da gramática e exibe mensagens de erros se a expressão for inválida.
3. Main: Recebe as expressões do usuário e manda para o Parser analisar, depois confirma ao usuário se a expressão é aceita ou rejeitada.

## Como usar

1. Clone o repositório:
    ```bash
    https://github.com/talitalmeida/workspace-compilers.git
    ```
2. Instale as dependências (Java).
3. Abra a pasta `RegexParser/`
3. Execute no terminal, dando uma entrada com alguma expressão regular.

## Estrutura do Projeto

- `src/` — Código-fonte principal
- `README.md` — Este arquivo