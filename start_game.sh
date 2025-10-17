#!/bin/bash

echo "Nettoyage et compilation du projet..."
mvn clean install

echo "Lancement du jeu..."
mvn exec:java

echo "Jeu terminé."