# Mercado
Mercado Microservice


guia para micro service

Criar um verbo http dentro do postman com as dtos interessadas
Criar um projeto spring web
dentro do package inicial criar uma classe controller onde serão separados os dtos
pasta service onde serão feitos as requisições de server side / client side
dentro de service o modo para criar um exchange que será o responsável por guardar as informações vindas do @RequestMapping(method = Request.Method.POST) é instanciar umma classe chamada RestTemplate (RestTemplate é uma ferramenta do Spring para requisições HTTP que são síncronas, ou seja, a cada requisição, a execução da aplicação pára, esperando uma resposta), inserir a url que será usada concatenada com o post
