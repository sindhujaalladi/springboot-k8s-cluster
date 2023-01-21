FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/springboot-k8s-cluster.jar springboot-k8s-cluster.jar

ENTRYPOINT ["java","-jar","springboot-k8s-cluster.jar"]