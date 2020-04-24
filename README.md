# Hello-Micronaut

## Instalajca frameworka 
### Przez brawe
```
brew update
brew install micronaut
```

### Na Windows

https://micronaut.io/download.html

Wypakuj do dowolnej lokalizacji. Ustaw zmienne systemowe 

MICRONAUT_HOME=path-to-micronaut

PATH=%PATH%;%MICRONAUT_HOME%/bin


## Tworzenie przykładowego projektu za pomocą micronaut-cli
```
cd ~/workspace
mn create-app  happy-micronaut
```

## Kompilacja
```gradlew build```

## Uruchomienie
```gradlew run```