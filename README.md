<h1 align="center">
  Email Service
</h1>

O desafio original foi resolvido nesse [vídeo](https://www.youtube.com/watch?v=eFgeO9M9lLw).

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Amazon SES](http://aws.amazon.com/ses/)

## Como Executar

- Clonar repositório git:
```
git clone https://github.com/davidmateusreis/email-service.git
```
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar ./target/email-service-0.0.1-SNAPSHOT.jar
```
A ferramenta utilizada nos testes foi o [httpie](https://httpie.io):

- Enviar email
```
http POST :8080/api/email to="*********@gmail.com" subject="Amazon SES" body="Hello, I'm David!"

HTTP/1.1 200
Connection: keep-alive
Content-Length: 23
Content-Type: application/json
Date: Fri, 29 Sep 2023 14:44:33 GMT
Keep-Alive: timeout=60

Email sent sucessfully!
```

O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).