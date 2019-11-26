**PATRICIA Y ADRIAN**
**_Archivo Readme_**

**Patricia**
> Se crea la carpeta y se hace un git init:
```
        - git init

```
> Se crea el README.md y se enlaza con el repositorio de gitHub:
```
        - sudo nano README.md.
        - git remote add github https://github.com/paatrii/Reppracticauno
```
> Se añaden todos los archivos a seguimiento y se hace el primer commit:
```
        - git add .
        - git commit -m "Primera version"
```
> Se suben los archivos a la rama master:
```
        - git push https://github.com/paatrii/Reppracticauno master
```




**Adrian**
> Clono el repositorio de mi compañera en local: 
```
    - git clone https://github.com/paatrii/Reppracticauno.git
```
> Creo una nueva rama y cambio a esta:
```
    - git branch adrian
    - git checkout adrian
```
> Modifico el archivo Mcd.java: 
```
    - sudo nano Mcd.java
```
> Cambio a la rama Master:  
```
    - git checkout master
```
> Añado Todos los archivos al repositorio guardando los cambios: 
```
    - git add .
    - git status
    - git commit -m "Cambio Adrian"
    - git push https://github.com/paatrii/Reppracticauno.git adrian
```




**Patricia**
> Se descargan/Sincronizan los archivos de la rama adrian
```
        - git pull https://github.com/paatrii/Reppracticauno adrian
```
> Se modifica el archivo mcd2.java se añade y se hace el commit:
```
        - nano mcd2.java
        - git add .
        - git commit -m "Modificado el archivo MCD2.java"
```
> Se suben los cambios al respositorio:
```
        - git push https://github.com/paatrii/Reppracticauno master
```

