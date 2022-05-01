# TweetItBot

## Descripción General

 Aplicación Web que publica un Tweet con la imagen del día de la Nasa.
 Muestra las trés últimas imágenes publicadas.
 Almacena en una BD Mongo las publicaciones realizadas.

## Back

 ~ Spring Boot App:

- TODO: Usar Spring Data REST [Referencia](https://www.baeldung.com/spring-data-rest-intro)

- (POST) Servicio para publicar la imagen del día
- Consulta la imagen del día vía NASA API:  <https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2022-04-23>
- Invoca al servicio que almacena en BD (Kafka asíncrono).
- (GET) Servicio para consultar las últimas tres imágenes almacenadas en BD
- Este servicio no conecta directamente con la BD sino a través de otro servicio (Kafka síncrono).

- (POST - Interno): Conecta con la BD (Mongo) y almacena la URL de la imagen recibida como entrada.
- (GET - Interno): Consulta en la BD (Mongo) las tres últimas imágenes almacenadas.

~  Swagger [Referencia] (https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)

~  La comunicación con los servicios internos se realizará mediante Kafka

~  Pruebas unitarias con JUnit5 y Mockito [Referencia](https://howtodoinjava.com/spring-boot2/testing/spring-boot-mockito-junit-example/)

## Front

~  Angular App

- Muestra las últimas tres imágenes almacenadas
- Un botón publica la imágen del día (si es que no ha sido ya publicada)

- Pruebas unitarias con Karma y Jasmine [Referencia](https://medium.com/@vito1986/angular-unit-testing-8a1479079f84)

---

## NASA API Imagen del día, ejemplo:
````
 GET:  <https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2022-04-23>

 Respuesta:
 {
 "date": "2022-04-23",
 "explanation": "A gorgeous spiral galaxy, Messier 104 is famous for its nearly edge-on profile featuring a broad ring of obscuring dust lanes. Seen in silhouette against an extensive central bulge of stars, the swath of cosmic dust lends a broad brimmed hat-like appearance to the galaxy suggesting a more popular moniker, the Sombrero Galaxy. This sharp view of the well-known galaxy was made from over 10 hours of Hubble Space Telescope image data, processed to bring out faint details often lost in the overwhelming glare of M104's bright central bulge. Also known as NGC 4594, the Sombrero galaxy can be seen across the spectrum, and is host to a central supermassive black hole. About 50,000 light-years across and 28 million light-years away, M104 is one of the largest galaxies at the southern edge of the Virgo Galaxy Cluster. Still, the spiky foreground stars in this field of view lie well within our own Milky Way.",
 "hdurl": "https://apod.nasa.gov/apod/image/2204/M104_HST_final2_4096.jpg",
 "media_type": "image",
 "service_version": "v1",
 "title": "Messier 104",
 "url": "https://apod.nasa.gov/apod/image/2204/M104_HST_final2_1024.jpg"
 }
````
---

# Ayudas al desarrollo
	- Arrancar mongo en Docker: docker run -p 127.0.0.1:27017:27017 --name mongo_on_docker -d mongo
	- Arrancar Kafka en Docker: 
		$ curl -sSL https://raw.githubusercontent.com/bitnami/bitnami-docker-kafka/master/docker-compose.yml > docker-compose.yml
		$ docker-compose up -d
	- Monitorizar Kafka: Mediante la aplicación "Offset Explorer 2.2"
	- Arrancar aplicación Spring Boot:
		- O bien construir Jar con Maven: mvn package, y luego ejecutarlo: java -jar ./target/tweetitbot-api-0.0.1-SNAPSHOT.jar
		- O bien utilicar el comando: mvn spring-boot:run