<h1> Arquitetura baseada em microsserviços usando Spring Cloud </h1>

<hr>
<hr>

Este projeto foi desenvolvido em aula proporcionada pela Digital Innovation One, através do desenvolvedor Oswaldo Neto.

Através de duas pequenas APIs, que serviram de exemplo e de um ConfigServer, um Gateway e um Service Discovery, o treinamento possibilitou uma visão ampla do desenvolvimento de um projeto voltado para microserviços e a integração entre eles através da utilização das seguintes dependências do Spring:

- spring-cloud;
- spring-cloud-starter-netflix-eureka-client;
- spring-cloud-starter-netflix-eureka-server;
- spring-cloud-starter-gateway e
- spring-cloud-config-server.

Em relação ao projeto desenvolvido em aula, fiz as seguintes alterações:

- Utilizei o MySQL para as APIs, alterando as configurações originais para isso;
- Alterei os métodos das APIs, incluindo uma camada de Service e DTO numa delas para que as tabelas replicadas no Banco de Dados pudessem ser diferentes das Entidades do Java;
- Esta última alteração permitiu uma responsabilidade maior para a aplicação sobre a persistência das dados, mas dando maior flexibilidade na programação.
- Utilizei o Maven ao invés do Gradle (apenas uma questão de preferência).

JSON - Documentação:

Seguem alguns JSON utilizados para teste das APIs:

localhost:{PORTA}/product (POST)
{
"name": "TV",
"amount": 10
}

localhost:{PORTA}/cart/1 (POST)
{
"productId" : 1,
"amount" : 200
}

<hr>

Pré-requisitos para a execução do projeto:

- Java 11.
- Maven 3.6.3 ou versões superiores.
- Intellj IDEA Community Edition ou outra IDE.
- As dependências acima citadas, adequando a cada um dos projetos.

<hr>
<hr>