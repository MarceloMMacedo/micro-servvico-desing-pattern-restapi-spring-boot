# Use a imagem oficial do Maven para construir o projeto
FROM maven:3.8.4-openjdk-17-slim AS build

# Defina o diretório de trabalho no contêiner
WORKDIR /build

# Copie os arquivos do projeto para o diretório de trabalho
COPY . .

# Construa o projeto com Maven
RUN mvn clean package

# Use a imagem oficial do OpenJDK 17 para executar o aplicativo
FROM openjdk:17-jdk-slim

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo JAR do estágio de construção
COPY --from=build /build/target/*.jar observador.jar

EXPOSE 8466

# Execute a aplicação
CMD ["java", "-jar", "observador.jar"]
