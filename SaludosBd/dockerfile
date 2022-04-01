FROM ubuntu
WORKDIR /SaludosBd
EXPOSE 8080
CMD ["/SaludosBd/mvnw", "spring-boot:run"]
RUN apt-get update &&\
    apt-get install -y \
        openjdk-8-jdk \
        curl\
        nano\
        unzip\
        git
RUN curl -G https://start.spring.io/starter.zip -d dependencies=web-services -d javaVersion=8 -o demo.zip
RUN unzip demo.zip