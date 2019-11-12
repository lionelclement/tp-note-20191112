# TD Noté

Pour réaliser ce TD noté vous devez corriger le code source qui vous est donné pour tenter de faire passer les 5 tests.
Les sources du programmes (pas les \*.class) doivent ensuite être envoyées à **lionel.clement@labri.fr** sans délai **avant la fin de la séance de TD noté** au format **\*.jar**.

## Contexte

Le code donné (répertoire main) correspond à une application permettant de constuire des dictionnaires.
Le métier de cette application (package domain) est constitué des classes suivantes :

* Category.java : Cette classe représente les catégories grammaticales des mots (verbe, nom, adjectif, etc)
* Entry.java : Cette classe représente une entrée de dictionnaire (forme écrite, prononciation, catégorie grammaticale, articles);
* Article.java : Cette classe représente un article de dictionnaire (définition, usage, exemples);
* DictionaryRespository.java : Cette interface représente le dépôt des entrées de dictionnaire. Elle est donc codée par une interface qui est réalisée par la couche infrastructure. Cette interface contient une méthode de construction d'un dictionnaire à partir d'un fichier (réalisation non complète et non utilisée dans le TD). 

Certaines de ces classes disposent d'une classe de test qui contient un ou plusieurs tests unitaires.

## La classe EntryTest (3 Tests)

Cette classe contient trois tests unitaires pour la classe Entry

Le test **categoriesShouldBeEqual** vérifie que Categorie est une value object.

Le test **encapsulationShouldBePreserved** vérifie le principe de l'encapsulation et visiblement celui-ci n'a pas été respecté.

Le test **formShouldNotNull** vérifie qu'une entrée ne peut pas avoir une forme nulle.

## La classe ArticleTest (1 Test)

Cette classe contient un test unitaire pour la classe Article

Le test **articleShouldBeEquals** vérifie l'unicité des définitions des articles (deux articles différents ne peuvent pas avoir les mêmes contenus)

## La classe DictionaryRepositoryTest (1 Test)

Cette classe contient un test unitaire pour la classe DictionaryRepositoryInMemory

Le test **entryShouldBeFound** vérifie qu'une entrée entregistrée soit bien retrouvée.


## Bonus ##

De façon optionnelle, vous pouvez ajouter le fait qu'une entrée de dictionnaire ne puisse pas avoir deux articles avec la même définition (test non réalisé). Si vous codez cette possibilité, dites-le en commentaire en tête de la classe **Entry** en plus de modifier le code. Il est inutile de coder le test qui vérifie cette fonctionalité.


## Consignes


Pour exécuter les tests vous devez utiliser la commande gradle :

    gradle test

Gradle construira le rapport de résultat montrant que les 5 tests ont tous échoué.

Tous les tests échouent manifestement avec le code qui vous est fourni et qui semble incomplet. 

Charge à vous de corriger et compléter le code pour que ces tests passent.

Vous ne devez pas toucher au code des tests.
