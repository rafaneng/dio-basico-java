# Criação de Projetos

## Spring Initializr

[https://start.spring.io/](https://start.spring.io/)

### Group

Pela convenção da comunidade Java é o domínio da empresa.

### Artifact

Projeto em si

### Buildar e startar via Maven

```bash
No painel do Mavem:

# Buildar a aplicação para a pasta "target"
Lifecycle > install

# Startar a aplicação
Plugins > spring-boot > spring-boot:run

```

### Buildar e startar via Gradle

```bash
# Buildar a aplicação para a pasta "build"
build > build

# Startar a aplicação
application > bootRun
```

### Iniciar aplicação via terminal

```bash
java -jar <pasta target/arquivo.jar>
```