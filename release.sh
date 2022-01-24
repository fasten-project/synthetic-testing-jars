#!/bin/bash

# specify path to the checkout of the "repository" branch, build artifacts will be deployed there
LOCAL_REPO=release/
# for example:
#LOCAL_REPO=/Users/seb/versioned/fasten/shrinkwrap-resolver-patched/repository

# only adopt these VARs if you change the build
POM=$1
JAR=$2

echo "LOCAL_REPO: $LOCAL_REPO"
echo "POM: $POM"
echo "JAR: $JAR"

mvn install:install-file \
	-DpomFile=$POM \
	-Dfile=$JAR \
	-DlocalRepositoryPath=$LOCAL_REPO \
	-DcreateChecksum=true

echo ""
echo ""
echo "!!! Do not forget to commit/push the deployed files to a repository. !!!"
echo ""