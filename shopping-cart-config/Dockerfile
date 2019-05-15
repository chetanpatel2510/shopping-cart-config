FROM openjdk:8
ADD target/shopping-cart-config-0.0.1-SNAPSHOT.jar shopping-cart-config-server.jar
EXPOSE 9000
ENV PATH $PATH:/usr/bin/
ENTRYPOINT ["java", "-jar", "shopping-cart-config-server.jar"]