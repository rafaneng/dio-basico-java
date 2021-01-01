# Paradigma em orientação a objetos

""

## Classes

Vamos entender uma classe como um modelo a ser seguido.

Uma classe vai funcionar como uma espécie de molde que nos servirá como base para construir algo.

```java
public class Pessoa {
	private String nome = "Rafael";

	public String getNome(){
			return nome;
	}
}
```

## Objeto

Agora que entendemos que temos um modelo que podemos seguir. O que podemos fazer com esse modelo?

Bom... Nós fizemos a analogia da casa, certo?
Depois de termos a planta baixa, nós começamos a construir.

E o resultado do que nós construímos, vamos chamar de objeto. 

Quando nós utilizarmos a nossa classe Pessoa - mostrada no código anterior —
para criar um objeto, nós diremos que estamos instanciando um objeto da classe
Pessoa.

E esse termo é bem simples de entender. O que acontece é que podemos criar vários
objetos de uma mesma classe, ou seja, várias instâncias de objetos.

```java
public class ExemploPessoa {

public static void main(String[] args) {

	Pessoa pessoa = new Pessoa();

	System.out.println(pessoa.getNome());
	// Rafael
	}
}
```

## Atributos

Agora vamos pensar no que nos definimos como nome. Foi tão intuitivo nós pensarmos que uma
pessoa teria um nome que nem demos importância a ele.

O nome é uma característica de uma Pessoa e pode ser diferente de pessoa para pessoa.

O nome é um atributo da pessoa.

## Métodos

Agora vamos pensar que uma pessoa pode ter ações. Por exemplo, uma pessoa pode falar.
Pensando em um cenário mais específico, uma pessoa pode falar o seu nome.

```java
public class Pessoa {
	private String nome = "Rafael";

	public String falarMeuProprioNome(){
			return "Ola meu nome é " + nome;
	}
}
```