**_Pedágio Rest:_**

_Criar um sistema de **pedágio** usando **Rest**:_

* **_Ônibus =_** _R$ 1.59;_
* **_Moto =_** _R$ 1.00;_
* **_Bike =_** _R$ 0.49;_
* **_Caminhão =_** _R$ 3,95;_
* **_Fusca =_** _R$ 2,11._

**_Pagamento:_** _Deve receber um valor e retornar o troco. Caminhão deve cobrar taxa adicional por eixo.
Listar a tabela de preços do pedágio._

**_Tecnologias utilizadas neste desenvolvimento:_**

* **JDK 17**
* **Spring Boot Versão:** 3.1.2
* **Servidor Tomcat**
* **Gradle Versão:** 7.4.2
*  **API Rest**

**_Materiais de apoio utilizados:_**

**_Vídeo_** **_https://www.youtube.com/watch?v=T7_j6EE3-1c&t=284s_**

**_Video:_** **_https://www.youtube.com/watch?v=0EVZVUntiwU&t=_**

**_https://www.devmedia.com.br/tipos-enum-no-java/25729_**

**_Como utilizar o sistema no Postman:_**

**_Post:_** _Para realizar operações de testes no método de **"calcularTroco"**, insira na **URL**:_

_http.//localhost:8080/pedagio/calcular/tipoVeiculo/valorRecebido e atribua o tipo de veículo e
um valor fornecido no "ato do pagamento"._

**_Get:_** _Para visualização da lista de preços, realize uma requisição **_GET_** e insira a **_URL:_**_

**_http://localhost:8080/pedagio/precos_**