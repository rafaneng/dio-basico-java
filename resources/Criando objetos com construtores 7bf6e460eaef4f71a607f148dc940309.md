# Criando objetos com construtores

## Construtores

Podemos entender o termo **construtor** no sentido literal, afinal vamos **construir um objeto.**

Por meio de um construtor, **criamos um objeto** baseado em uma Classe e assim o alocamos em
memória.

Ao criarmos um objeto dizemos que estamos instanciando um objeto.

```java
public class Pessoa{
	public Pessoa(){
	}
}
```

Esse exemplo que acabamos de ver é o exemplo mais comum quando começamos a estudar construtores em Java.

E para instanciar essa classe (criar um objeto dela) fazemos o seguinte:

```java
Pessoa pessoa = new Pessoa();
```

Quando não temos um construtor padrão (sem parâmetros) definidos em uma classe, é subentendido que temos um construtor desse tipo na classe.

**Mas cuidado! Isso só vale quando não tiver outro construtor definido.**

### Construtores Parametrizados

Também podemos criar construtores parametrizados.
Dessa forma, conseguimos definir um contrato onde sempre será obrigatório passar alguma informação na hora de instanciar a classe.

Nesse exemplo temos dois construtores. Um com passagem de parâmetro e outro sem.

Isso garante que possamos instanciar das duas maneiras.

```java
public class Pessoa{

	public Pessoa(){
	}

	public Pessoa(String nome){
		this.nome = nome;	
	}

	private String nome;

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome
	}
}
```

```java
// instaciando com passagem de parametro
Pessoa pessoa = new Pessoa("Rafael");

// instaciando sem passagem de parametro
Pessoa pessoa = new Pessoa();
```

Já quando definimos nossa classe dessa forma, se tentarmos instanciar a classe
sem passar algum parâmetro no construtor, tomaremos erro em tempo de compilação.

```java
public class Pessoa{

	public Pessoa(String nome){
		this.nome = nome;	
	}

	private String nome;

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome
	}
}
```

```java
// erro pois não há construtor vazio na classe.
Pessoa pessoa = new Pessoa();
```

### Destrutor?

Em Java não existe o conceito de destrutor explícito, quando instanciamos, estamos na verdade, alocando o objeto em memória. Então, desalocar esse objeto fica por conta do GC (Garbage Collection)