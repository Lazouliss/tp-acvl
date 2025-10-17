# tp-acvl
TP d'ACVL de deuxième année à l'Ensimag

## Structure du projet

- `README.txt` : ce fichier, contient la liste des contenus des fichiers ainsi que l'explication de comment lancer le jeu.
- `Rendu_final.pdf` : contient le cahier des charges, le document d'analyse, le document de conception, le manuel utilisateur pour l'incrément et le bilan
- `start_game.sh` : script de lancement du jeu

### Dossiers principaux
- `uml/` : contient les diagrammes UML au format PlantUML qui documentent l'architecture et la structure du projet
- `src/main/java/` : code source principal de l'application Java et suit une architecture MVC où :
    - Le package `model` sert de **Model**
    - Les packages `GraphicEngine` et `RendererEngine` servent de **View**
    - Le package `InputEngine` sert de **Controller**
    - La classe `MainGame.java` sert de point d'entrée principal du jeu
      - Gère l'initialisation du jeu
      - Configure les paramètres de base
      - Lance la boucle de jeu principale

Plus en détail :
- `model` : contient la logique métier, les entités du jeu (GameObject, World, Player, etc) ainsi que les interfaces et classes abstraites (AttackableCharacter, Movable, etc)
- `GraphicEngine` : contient le moteur graphique du jeu et gère le rendu visuel et l'affichage
- `RendererEngine` : gère le rendu spécifique de chaque type d'objet (WorldRenderer, EnnemyRenderer, etc)
- `InputEngine` : Gère les entrées utilisateur et contient `InputController.java` qui traite les interactions (clavier, souris)

## Comment lancer le jeu ?

### Prérequis

- JAVA JDK 23
- Utiliser un PC Ensimag Ubuntu 24 possèdent JAVA 23 (au moins disponible en salle E102, sûrement dans d'autres salles)

### Lancement rapide

Tout simplement en lançant le script `start_game.sh`.

Par exemple :

```{bash}
./start_game.sh
```

Et vous devriez voir :

```{bash}
Nettoyage et compilation du projet...

<compilation du projet par maven>

Lancement du jeu...

<ouverture d'une fenêtre de jeu>
```

Et une fois le jeu fermé :

```{bash}
Jeu terminé.
```

### Lancement manuel

1) Se placer à la racine du projet

2) Dans un terminal, compiler en lançant la commande suivante :

```{bash}
mvn clean compile
```

3) Puis lancer le jeu avec :

```{bash}
mvn exec:java
```

Et la fenêtre devrait s'ouvrir pour pouvoir jouer au jeu !
