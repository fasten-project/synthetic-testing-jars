#!/bin/bash

mvn clean package

LOCAL_REPO=release/

mvn install:install-file \
	-DpomFile=pom.xml \
	-Dfile=pom.xml \
	-DlocalRepositoryPath=$LOCAL_REPO \
	-DcreateChecksum=true

BASE="app/target/app-0.0.1"
mvn install:install-file \
	-DpomFile=app/pom.xml \
	-Dfile=$BASE.jar \
	-Dsources=$BASE-sources.jar \
	-DlocalRepositoryPath=$LOCAL_REPO \
	-DcreateChecksum=true

mvn install:install-file \
	-DpomFile=lib/pom.xml \
	-Dfile=lib/target/lib-0.0.1.jar \
	-DlocalRepositoryPath=$LOCAL_REPO \
	-DcreateChecksum=true
