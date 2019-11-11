# TD Noté

Pour réaliser ce TD noté vous devez corriger le code source qui vous est donné afin que les 5 tests passent.

## Contexte

Le code donné (répertoire main) correspond à une application permettant de constuire des dictionnaires.
Le métier de cette application (package domain) est constitué des classes suivantes :

* Entry.java : Cette classe représente une entrée de dictionnaire (forme écrite, prononciation, catégorie grammaticale, articles);
* Article.java : Cette classe représente un article de dictionnaire (définition, usage, exemples, traductions);
* Dictionary.java : Cette interface représente une collection d'entrées; 
* DictionaryRespository.java : Cette interface représente le dépôt des entrées de dictionnaire. Elle est donc codé par une interface qui est réalisé par la couche infrastructure. Cette interface contient une factory: méthode de construction d'un disctionnaire à partir d'un fichier (réalisation non complète). 

Certaines de ces classes disposent d'une classe de test qui contient le ou les tests unitaire pour la classe.

## La classe EntryTest (3 Tests)

Cette classe contient deux tests unitaires pour la clase Question.

Le test **categoriesShouldBeEqual** vérifie que Categorie est une value object.

Le test **encapsulationShouldBePreserved** vérifie le principe de l'encapsulation et visiblement celui-ci n'a pas été respecté.

Le test **formShouldNotNull** vérifie qu'une entrée ne peut pas avoir une forme nulle.

## La classe ArticleTest (1 Test)

Cette classe contient un test unitaire pour la classe Article

Le test **articleShouldBeEquals** vérifie l'unicité des définitions des articles (deux articles différents ne peuvent pas avoir la même définition)

## La classe DictionaryRepositoryTest (1 Test)

Cette classe contient un test unitaire pour la classe DictionaryRepositoryInMemory

Le test **entryShouldBeFound** vérifie qu'une entrée entregistrée soit bien retrouvée.

Tous ces tests échouent manifestement. 

## Consignes

Pour exécuter les tests vous devez utiliser la commande gradle :

    gradle test

Gradle construira le rapport de résultat montrant que les 5 tests ont tous échoué.

Charge à vous de corriger le code pour que ces tests passent.

Vous ne devez pas toucher au code des tests.
