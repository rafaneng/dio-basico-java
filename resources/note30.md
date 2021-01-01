# Conheça Finally e Throw

## Finally

O finally é um bloco de código que pode ou não ser utilizado junto ao try catch, este trecho de código sempre será executado independente se ocorrer erro ou não dentro do fluxo onde existe o try catch. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independente de erro.

```java
try {
	PreparedStatement stmt = con.prepareStatement (query);
	// ...
} catch (SQLException e) {
		throw new AcessoADadosException("Problema na criação do Statement", e);
} finally {
		stmt.close();
}
```

## Throw e Throws

**Throws:** É a assinatura do método que será retornado caso ocorra erro para o método que fez a chamada, dentro de um fluxo encadeado.

**Throw:** É usado para lançar a exceção desejada, juntamente com a mensagem de erro, para o método que fez a chamada.

```java
public String recuperarIdUsuario(String query) throws AcessoADadosExceptionf
	try {
		PreparedStatement stmt = con.prepareStatement (query);
		// ...
	} catch (SQLException e) {
			throw new AcessoADadosException("Problema na criação do Statement", e);
	} finally {
			stmt.close();
	}
}
```