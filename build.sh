#!/bin/bash
set -e
./gradlew build -x test 
# cp ./build/libs/sagas-base.jar ../ofbiz-framework/lib/sagas-base.jar
