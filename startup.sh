#!/bin/bash
# Build jars files
cd consumer
mvn package -DskipTests
cd ..
cd producer
mvn package -DskipTests
cd ..
# Starting docker compose
podman-compose -f docker-compose.yml up