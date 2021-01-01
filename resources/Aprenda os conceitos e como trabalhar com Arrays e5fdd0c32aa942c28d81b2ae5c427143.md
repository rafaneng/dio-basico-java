# Aprenda os conceitos e como trabalhar com Arrays

## O que é um array

- Array ou Matriz, é uma estrutura de dados que nos permite organizar valores na memória
- Fazem parte da biblioteca java.util que é nativa do Java
- Armazenam elementos do mesmo tipo
- Podem ser unidimensionais ou multidimensionais
- Cada item em um array é chamado de elemento
- Cada elemento é acessado pela posição numérica (índice)
- O índice inicia a partir de 0.
- Ao se declarar um array, todos índices são inicializados em 0.
- Arrays não podem mudar de tamanho, a partir do momento que uma array foi criada, ela não pode mudar de tamanho.
- Se você precisar de mais espaço, será necessário criar uma nova array e, antes de se referir ela, copie os  elementos da array velha.

## Declaraçã de arrays

Utilizando o operador “new”

```java
dataType[] arrayName = new dataType[arraySize];

int meuArray = new int[7];

dataType[] arrayName = {value-, value1, ..., valueN};

int[] meuArray = {12, 32, 54, 6, 8, 89, 64}

```

Para alterar o valor de um elemento específico, coloque o índice desse elemento

```java
meuArray[0] = 50;
```

## Comprimento do array

Para descobrir quantos elementos um array possui, use a
propriedade length

```java
int meuArray = new int[7];
System.out.println(meuArray.length);
```

## Percorrendo arrays

Para processar um array, devemos usar um laço de repetição (for, for each, etc)

```java

public class MyClass {
	public static void main(String[] args) {
		int[] meuArray = (12,32,54,6,8,89,64);
		
		for (int i=0; i<7; i++){
				System.out.println(meuArray[i]);
		}
	}
}
```

## Arrays multidimensionais

Um array multidimensional é um array contendo um ou mais
arrays internos

```java
int[][] meuArrayMulti = {{1,2,3,4}, {5,6,73}};
// meuArrayMulti é um array com dois arrays como 
seus elementos.
```

Percorrendo um array multidimensional

```java
public class MyClass {
	public static void main(String[] args) {
		int[][] meuArrayMulti = {{1,2,3,4}, {5,6,7}};
		for (int i = 0; i < meuArrayMulti.length; ++1) {
			for(int j = 0; j < meuArrayMulti[i].length; ++j) {
				System.out.println(meuArrayMulti[i][j]);
			}
		}
	}
}
```