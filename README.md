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

``
## Acesse a porta Eureka e veja a conexão
```
http://localhost:8081/

```
## Insira pelo menos uma entrada na sua base de dados no caso banco mysql  ex: title = Spring Boot Microservices By DevDojo


```
### Acessar a URL pelo postman
```
Curl GET http://localhost:8080/gateway/course/v1/admin/course

```

#####
```
{
    "content": [
        {
            "id": 1,
            "title": "Spring Boot Microservices By DevDojo"
        }
    ],
    "pageable": {
        "sort": {
            "sorted": false,
            "unsorted": true,
            "empty": true
        },
        "pageSize": 20,
        "pageNumber": 0,
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 1,
    "totalElements": 1,
    "last": true,
    "first": true,
    "sort": {
        "sorted": false,
        "unsorted": true,
        "empty": true
    },
    "number": 0,
    "numberOfElements": 1,
    "size": 20,
    "empty": false
}

## Tente acessar sem o /gateway  para ver o erro
```
Curl GET http://localhost:8080/course/v1/admin/course
```

####
```
<!doctype html>
<html lang="en">
<head>
<title>HTTP Status 404 – Not Found</title>
<style type="text/css">h1
{font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;}
h2 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:16px;}
h3 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:14px;}
body
{font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;}
b {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;}
p {font-family:Tahoma,Arial,sans-serif;background:white;color:black;font-size:12px;}
a {color:black;}
a.name {color:black;} .line
{height:1px;background-color:#525D76;border:none;}
</style>
</head>
<body><h1>
HTTP Status 404 – Not Found</h1><hr class="line" />
<p><b>Type</b> Status Report</p><p><b>Message</b>
Not found</p><p><b>
Description</b>
The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.
</p><hr class="line" /><h3>Apache Tomcat/9.0.16</h3>
</body>
</html>

```

