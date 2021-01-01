# Exceções esperadas e não esperadas

## Checked Exceptions

São exceções esperadas, cujo fluxo ou método de um sistema foi preparado para receber. Um bom exemplo é uma exceção de negócio, onde se deseja informar um erro caso a exceção esperada ocorra.

```java
try {
	PreparedStatement stmt = con.prepareStatement (query);
	// ...
	} catch (SQLException e) {
			throw new AcessoADadosException("Problema na criação do Statement", e);
}
```

## Unckecked Exceptions

São exceções não esperadas para o fluxo ou método de um  sistema, um bom exemplo é a famosa NullPointException que ocorre quando se tenta acessar uma referência de memória vazia, ou recuperar uma instância que não existe, dentre outros motivos.

```java
try {
	CarroVo carro = new CarroVo();
	carro.getPlaca();
} catch (IntegrationException e) {
		throw new BusinessException("Erro na criação do objeto", e);
}
```

## Bloco Try Catch

O bloco try catch sempre é utilizado quando no processo que será executado dentro de um método é esperado um erro, então cria-se um bloco “protegido” onde qualquer erro que ocorra dentro do trecho “try” é direcionado para o trecho “catch” e sofrerá o devido tratamento de erro.

```java
try {
	PreparedStatement stmt = con.prepareStatement (query);
	// ...
	} catch (SQLException e) {
			throw new AcessoADadosException("Problema na criação do Statement", e);
}
```