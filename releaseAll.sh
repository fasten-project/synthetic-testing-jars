#!/bin/bash

mvn clean package

./release.sh pom.xml pom.xml
./release.sh app/pom.xml app/target/app-0.0.1.jar
./release.sh lib/pom.xml lib/target/lib-0.0.1.jar
