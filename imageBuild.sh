#!/bin/sh
mvn clean package || exit
docker build -t mingbai/personal-nav-boot:v0.1.0 .
docker run -p 8081:8081 -d  mingbai/personal-nav-boot:v0.1.0
