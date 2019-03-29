# micro-service
```
Objetivo desse projeto

##contruir um api usando microservis
##gateway
##criptografia
##token
##Reaproveitamento de código
```
# Requisitos
```
Java 11

```

# docker
```
docker-compose -f stack.yml up

```
# Acessar a URL pelo postman
```
Curl GET http://localhost:8080/gateway/course/v1/admin/course

```

# Tente acessar sem o /gateway  para ver o tipo de erro
```
Curl GET http://localhost:8080/course/v1/admin/course

```