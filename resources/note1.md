# Instalação e Ambiente

## Instalação Java

[https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html)

```bash
sudo add-apt-repository ppa:linuxuprising/java
sudo apt update
sudo apt install oracle-java10-installer
```

## Ferramentas de build

A maior diferença entre o **Maven** e o **Gradle** é a sintaxe.

### Grade

versão 4.7 , ganhando popularidade graças a Android Studio, usa linguagem de programação Groovy.

https://gradle.org

```bash
# Verificar versão
gradle -v
```

### Maven

Legados do ANT, baseado em XML

https://maven.apache.org

```bash
# Verificar versão
mvn -v
```

### Wrappers

Soluciona problemas de compatibilidade de versões entre desenvolvedores. Ele é utilizado para fazer com que o projeto utilize a versão que está na pasta do projeto e não no windows.

```bash
# Gradle
gradle wrapper

# Maven
mvn -N io.takari:maven:wrapper
```

## Ferramenta de desenvolvimento

### InteliJJ Community

[https://www.jetbrains.com/pt-br/idea/download/#section=windows](https://www.jetbrains.com/pt-br/idea/download/#section=windows)