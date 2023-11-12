# Sistema de Pedágio Spring Boot

Este projeto Spring Boot implementa um sistema de pedágio simples com cálculo de troco, utilizando o padrão MVC (Model-View-Controller).

# Pré Requisitos - Preços:

* **_Ônibus =_** _R$ 1.59;_
* **_Moto =_** _R$ 1.00;_
* **_Bike =_** _R$ 0.49;_
* **_Caminhão =_** _R$ 3,95;_
* **_Fusca =_** _R$ 2,11._

## Tecnologias Utilizadas

- **Spring Boot:** Framework para criar aplicativos Java baseados em padrões de projeto.
- **Java 17:** Linguagem de programação principal para o desenvolvimento do aplicativo.

## Como Utilizar o Projeto

### Pré-requisitos

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Postman](https://www.postman.com/downloads/)

### Executando o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

   1. Execute o aplicativo Spring Boot:

   ./gradlew bootRun

   ou:

   gradlew.bat bootRun  (Windows)

   # Endpoints no Postman

- **Listar Tabela de Preços:**
  - **Método:** GET
  - **URL:** `http://localhost:8080/pedagio/precos`

- **Calcular Troco:**
  - **Método:** POST
  - **URL:** `http://localhost:8080/pedagio/calcular/{tipoVeiculo}/{valorRecebido}`
  - **Exemplo:** `http://localhost:8080/pedagio/calcular/MOTO/5.0`

  Substitua `{tipoVeiculo}` pelo tipo de veículo desejado e `{valorRecebido}` pelo valor pago.

# Estrutura do Projeto

- **build.gradle:**
  - O arquivo de configuração do Gradle para gerenciar as dependências do projeto.

- **application.properties:**
  - O arquivo de configuração do Spring Boot, definindo a porta do servidor como 8080.

- **model/Veiculo.java:**
  - Uma enumeração representando diferentes tipos de veículos e seus respectivos valores de pedágio.

- **service/PedagioService.java:**
  - Um serviço que implementa a lógica de cálculo de troco e mantém uma tabela de preços.

- **controller/PedagioController.java:**
  - Um controlador Spring Boot que define os endpoints REST para listar a tabela de preços e calcular o troco.

# Observações

- Este projeto é um exemplo educacional e pode ser expandido conforme necessário.
- Certifique-se de ter o Java 17 instalado e o Postman para testar os endpoints.

Agora você pode explorar e interagir com o sistema de pedágio usando o Postman.

