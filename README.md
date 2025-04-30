# 🛠️ Compilador

Pessoal, neste repositório vocês vão me acompanhar na construção de um **compilador completo**, passando por **todas as fases clássicas** de um compilador, como estudado no curso de Ciência da Computação.

Cada fase está/será organizada em uma **pasta separada**, com seu respectivo `README.md` contendo explicações, diagramas e exemplos para facilitar o entendimento e a replicação.

<div align="center">
<img align="center" alt="talita-java" width="80" <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" />
</div>


## 📁 Estrutura das Fases

### 1. `DL/` – **Análise Léxica**
Aqui desenvolvemos o **analisador léxico**, também chamado de *scanner* ou *lexer*.  
Nesta fase, o código-fonte é transformado em uma sequência de **tokens** – que são unidades como palavras-chave, identificadores, operadores e delimitadores.

📌 O que você verá:
- Uso de expressões regulares e autômatos finitos.
- Geração de tokens a partir de código-fonte.
- Tratamento de erros léxicos.
- Diagrama de transições.

---

### 2. `sem pasta` – **Análise Sintática**
Nesta etapa, os tokens gerados são analisados para verificar se estão organizados corretamente segundo as regras da gramática da linguagem.

📌 O que você verá:
- Construção de gramáticas livres de contexto (CFG).
- Implementação de parsers (como LL(1) ou LR).
- Geração de árvore sintática (parse tree).
- Detecção de erros de estrutura (como parênteses não balanceados).

---

### 3. `sem pasta` – **Análise Semântica**
Aqui validamos se o código **faz sentido**, mesmo que esteja sintaticamente correto. Verificamos tipos, declarações, escopos, etc.

📌 O que você verá:
- Tabelas de símbolos.
- Verificação de tipos e coerência semântica.
- Erros como “variável não declarada” ou “tipos incompatíveis”.

---

### 4. `sem pasta` – **Geração de Código Intermediário**
Transformamos a estrutura do programa em uma forma intermediária (IR – *Intermediate Representation*), que facilita a posterior geração de código de máquina.

📌 O que você verá:
- Representações como árvore de sintaxe abstrata (AST) e código de três endereços.
- Tradução de comandos da linguagem para IR.

---

### 5. `sem pasta` – **Otimização de Código**
Fase opcional, mas muito importante. Melhoramos o código intermediário para deixá-lo mais eficiente.

📌 O que você verá:
- Otimizações locais e globais.
- Eliminação de código morto.
- Propagação de constantes.

---

### 6. `sem pasta` – **Geração de Código Final**
Geramos o código final que pode ser executado por uma máquina (ou interpretado). Pode ser Assembly, bytecode, ou outra representação final.

📌 O que você verá:
- Mapeamento de variáveis em registradores/memória.
- Geração de instruções de máquina/Assembly.
- Linkagem com bibliotecas, se necessário.

---

### 📎 Extras
- Os commits seguem o progresso real do desenvolvimento.

---

## 💬 Como usar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/workspace-compilers.git
cd workspace-compilers

# Navegue pelas fases
cd DL/     # Análise léxica
...
