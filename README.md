# Sistema de Boletim Escolar - Java Moderno

## Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais da linguagem Java utilizando recursos modernos disponíveis nas versões mais recentes da plataforma.

A aplicação realiza o cadastro de um aluno, calcula sua média escolar, verifica a quantidade de faltas e determina sua situação acadêmica com base nas regras definidas.

## Tecnologias Utilizadas

* Java 21+
* Record
* Var
* Switch Expression
* Text Blocks
* Scanner
* Programação Orientada a Objetos (POO)

## Funcionalidades

* Cadastro de aluno
* Registro de notas
* Registro de faltas
* Cálculo automático da média
* Verificação de aprovação
* Verificação de recuperação
* Reprovação por nota
* Reprovação por excesso de faltas

## 💡 Implementação com Record

Neste projeto foi utilizado o recurso **Record**, uma funcionalidade introduzida no Java moderno para simplificar a criação de classes que armazenam dados.

Implementação da entidade Aluno:

```java
public record Aluno(
    String nome,
    double nota1,
    double nota2,
    int faltas
) {}
```

Com o uso de Record, não foi necessário criar manualmente:

* Construtores
* Getters
* toString()
* equals()
* hashCode()

O próprio Java gera esses métodos automaticamente, tornando o código mais limpo e fácil de manter.

## Regras de Negócio

### Média

```java
(nota1 + nota2) / 2
```

### Situação

* Média maior ou igual a 7 → APROVADO
* Média entre 5 e 6.99 → RECUPERAÇÃO
* Média abaixo de 5 → REPROVADO
* Faltas maiores ou iguais a 25 → REPROVADO POR FALTAS

##  Exemplo de Execução

```text
=== BOLETIM ===

Nome do aluno:
Thiago

Nota 1:
8

Nota 2:
7

Faltas:
3

========= RESULTADO ==========

Nome: Thiago
Média: 7.50
Faltas: 3
Situação: APROVADO
```

## Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

* Variáveis e Tipos de Dados
* Métodos
* Condições (if/else)
* Switch Moderno
* Programação Orientada a Objetos
* Record
* Java Moderno
* Organização de Código

## Autor

Thiago Sales

Estudante de Desenvolvimento Java focado em construir uma base sólida em Programação Orientada a Objetos, Java Moderno, Spring Boot e Desenvolvimento Backend.

