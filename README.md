## micro-service
```
Objetivo desse projeto

##Contruir uma API separada por Micro-Services
spring-cloud
eureka-client
gateway

```
## Requisitos
```
Java 11

```

# Caso deseje utilizar docker mysql
```
docker-compose -f stack.yml up

```
``
## Para iniciar o projeto siga a sequência
```
Start => DiscoveryApplication
Start => GatewayApplication
Start => CourseApplication

```

## Acessar a URL pelo postman
```
Curl GET http://localhost:8080/gateway/course/v1/admin/course

```

## Tente acessar sem o /gateway  para ver o tipo de erro
```
Curl GET http://localhost:8080/course/v1/admin/course

```