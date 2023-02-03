#!/bin/bash

#Step 1: Build Frontend App
cd frontend
npm install --legacy-peer-deps
npm run build

cd ..

#Step 2: Build Backend App
cd backend
./mvnw clean
./mvnw package

cd ..

#Step 3: Start Docker-Containers
docker-compose up --build --force-recreate