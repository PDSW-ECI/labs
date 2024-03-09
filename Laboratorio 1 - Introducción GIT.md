# LABORATORIO 1- INTRODUCCIÓN GIT
ESCUELA COLOMBIANA DE INGENIERÍA - CICLOS DE VIDA DE DESARROLLO DE SOFTWARE

 ![image](https://github.com/PDSW-ECI/labs/assets/118181543/7b7bba48-cbfb-4327-bec8-f72dc0d258e0)

- En el presente laboratorio vamos a aprender los manejos basicos de Git Hub , esto con el proposito de que entiendas y comiences a trabajar con está herramienta. Para este laboratorio se trabajara con dos integrantes.
  
## PARTE I. 

1.	Creamos un repositorio localmente 
2.	Agregamos un archivo de ejemplo al repositorio, el **README.md** puede ser una gran opción.
3.	Averiguen para que funcionan y como se usan estos comandos **git add y git commit -m “mensaje”**
4.	Abran cada uno una cuenta de github, si ya la tienen, enlazenla con el correo institucional
   
       [Como enlazar correos en GitHub](https://docs.github.com/es/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-email-preferences/adding-an-email-address-to-your-github-account)
   
6.	Creen un repositorio en blanco

![image](https://github.com/PDSW-ECI/labs/assets/118181543/0a6db4de-3682-4e43-838c-415373596947)
![image](https://github.com/PDSW-ECI/labs/assets/118181543/7c1cafdf-9a35-4180-99c4-8cabd84d21b8)

   
8.	Configuren el repositorio local con el repositorio remoto.

      [Como subir un proyecto local a github.](https://gist.github.com/cgonzalezdai/cc33db72a6fe5178637aabb562eae35c)
  
10.	Subir los cambios, teniendo en cuenta lo que averiguaron en el punto 3
    Utilicen los siguientes comando en el directorio donde tienen su proyecto , en este orden:
   	```
      git add .
    ```

    ```
      git commit -m "mensaje"
    ```

    ```
      git push "url repositorio"
    ```
12.	Configuren el correo en git local de manera correcta
    
14.	Volver a subir los cambios y observar que todo esté bien

## PARTE II

1.	Se escogen los roles para trabajar en equipo
2.	el owner agrega al colaborador con permisos de escritura en el repositorio que creó en la parte 1
3.	el owner le comparte la url via Teams al colaborador
4.	el colaborador acepta la invitación al repositorio
5.	owner y colaborador editan el archivo README.md al mismo tiempo e intentan subir los cambios al mismo tiempo
6.	la persona que perdió la competencia de subir los cambios, tiene que resolver los conflictos, qué los <<< === y >>> son normales en la resolución de conflictos, resolverlos manualmente
7.	volver a repetir un cambio sobre el README.md ambos al tiempo para volver a tener conflictos
8.	Enseñar como resolver los conflictos con IntelliJ


## PARTE III
1.	¿hay una mejor forma de trabajar con git para no tener conflictos? sí, a través de trabajo en ramas y PR
2.	explicar cómo crear un rama y subir esos cambios a la nueva rama
3.	Tanto owner como colaborador hacen un cambio en el README.md y hacen un Pull Request (PR) a la rama main/master, resolver conflictos con github
4.	recomendación trabajar en equipo y distribuirse de mejor manera quien va a modificar qué, para evitar modificar los mismos archivos al mismo tiempo, si no se editan los mismos archivos la resolución de conflictos es automática
5.	mezclar los cambios a la rama main a través de PR con el check/approval del compañerocuando se hace merge se deberían borrar las ramas en github
