FROM docker.io/java:latest
ENV LC_ALL en_US.UTF-8
ENV TZ 'Asia/Beijing/mingbai'
ADD ./target/ming-personal-nav-boot-0.0.1-SNAPSHOT.jar /
EXPOSE 8081
CMD ["java", "-jar", "/ming-personal-nav-boot-0.0.1-SNAPSHOT.jar"]
