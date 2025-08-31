[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/HzqCTVz-)
# 📘 Atividade: Classe `Biblioteca`

## 🎯 Objetivo

Você deve implementar a classe `Biblioteca` com atributos, métodos e regras específicas para simular operações de uma biblioteca pública, como registrar livros, emprestar, devolver, transferir para outra biblioteca, desativar e reajustar a multa diária.

---

## 🧩 Especificação Técnica

### 🔑 Atributos (todos `private`)

| Atributo      | Tipo     | Descrição                                            |
|---------------|----------|-------------------------------------------------------|
| `nome`        | `String` | Nome da biblioteca                                   |
| `multaDiaria` | `Double` | Valor da multa por dia de atraso                     |
| `qtdLivros`   | `Integer`| Quantidade atual de livros na biblioteca             |
| `ativa`       | `Boolean`| Status da biblioteca (ativa = `true`)                |

---

### 🛠️ Construtor

```java
public Biblioteca(String nome, Double multaDiaria)
```

- Inicializa a biblioteca com:
  - `nome` e `multaDiaria` recebidos por parâmetro
  - `qtdLivros = 0`
  - `ativa = true`

---

## 📚 Métodos Públicos

### ✅ `public void registrarLivro(Integer quantidade)`
Adiciona livros ao estoque, desde que:
- `quantidade` seja > 0 e diferente de `null`
- Biblioteca esteja ativa

### ✅ `public Integer emprestar(Integer quantidade)`
- Remove livros se:
  - Biblioteca estiver ativa
  - `quantidade` for > 0, ≤ `qtdLivros`, e diferente de `null`
- Retorna `quantidade` emprestada ou `null` se inválido

### ✅ `public Integer devolver(Integer quantidade)`
- Adiciona livros se:
  - Biblioteca estiver ativa
  - `quantidade` for > 0 e diferente de `null`
- Retorna `quantidade` devolvida ou `null` se inválido

### ✅ `public Integer desativar()`
- Se já estiver inativa: retorna `null`
- Caso contrário:
  - Desativa a biblioteca
  - Zera `qtdLivros`
  - Retorna quantidade anterior

### ✅ `public void transferir(Biblioteca destino, Integer quantidade)`
- Transfere livros se:
  - Ambas bibliotecas estiverem ativas
  - `quantidade` for válida e menor ou igual ao estoque
- Caso contrário: não faz nada

### ✅ `public Boolean reajustarMulta(Double percentual)`
- Reajusta a multa diária com base no percentual (`0.10` = 10%)
- Só aplica se `percentual` for > 0 e diferente de `null`
- Retorna `true` se alterado, `false` se inválido

---

## 📤 Getters obrigatórios

```java
public String getNome()
public Double getMultaDiaria()
public Integer getQtdLivros()
public Boolean getAtiva()
```

---

## 🛑 Somente 1 Setter permitido

```java
public void setNome(String nome)
```

---

## 🚫 Proibido criar

- `setMultaDiaria(Double)`
- `setQtdLivros(Integer)`
- `setAtiva(Boolean)`

---

## 🧪 Testes

Os testes validados incluem:

- Inicialização correta
- Restrições de atributos (`private`, tipos corretos)
- Comportamento de cada método (válido e inválido)
- Operações entre objetos (`transferir`)
- Validação de `null`, valores negativos ou inativos

---

## 🗂️ Estrutura esperada do projeto

```
📦 school.sptech
 ┣ 📄 Biblioteca.java (você irá implementar)
 ┣ 📄 BibliotecaEspecificacaoTest.java (Já implementada)
 ┗ 📄 BibliotecaOperacoesTest.java (Já implementada)
```

---

## ✅ Exemplo de uso manual

```java
Biblioteca b1 = new Biblioteca("Central", 2.5);
b1.registrarLivro(10);
b1.emprestar(4);
System.out.println(b1.getQtdLivros()); // Saída esperada: 6
```

---

## 💡 Dica

Se algum método não respeitar o enunciado (nome, tipo de retorno, parâmetros ou lógica), **os testes irão falhar**.

---

## 👨‍🏫 Recomendado revisar

- Encapsulamento (`private`, `getters`)
- Validação de parâmetros
- Manipulação de objetos entre si (`this`, `outroObjeto`)
- Tipos wrappers: `Integer`, `Double`, `Boolean`)
- Nomenclatura exata
