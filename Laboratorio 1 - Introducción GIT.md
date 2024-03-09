# LABORATORIO 1- INTRODUCCIÓN GIT
ESCUELA COLOMBIANA DE INGENIERÍA - CICLOS DE VIDA DE DESARROLLO DE SOFTWARE

 ![image](https://github.com/PDSW-ECI/labs/assets/118181543/7b7bba48-cbfb-4327-bec8-f72dc0d258e0)

- En el presente laboratorio vamos a aprender los manejos básicos de Git Hub, esto con el propósito de que entiendas y comiences a trabajar con esta herramienta. Para este laboratorio se trabajará con dos integrantes.
  
## PARTE I (Trabajo Individual). 

1.	Creamos un repositorio localmente 
2.	Agregamos un archivo de ejemplo al repositorio, el **README.md** puede ser una gran opción.
3.	Averigüen para qué funcionan y como se usan estos comandos **git add y git commit -m “mensaje”**
4. Abran cada uno una cuenta de github, si ya la tienen, enlácenla con el correo institucional
   
   [Como enlazar correos en GitHub](https://docs.github.com/es/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-email-preferences/adding-an-email-address-to-your-github-account)
   
5.	Creen un repositorio en blanco

![image](https://github.com/PDSW-ECI/labs/assets/118181543/0a6db4de-3682-4e43-838c-415373596947)
![image](https://github.com/PDSW-ECI/labs/assets/118181543/7c1cafdf-9a35-4180-99c4-8cabd84d21b8)

   
6.	Configuren el repositorio local con el repositorio remoto.

      [Como subir un proyecto local a github.](https://gist.github.com/cgonzalezdai/cc33db72a6fe5178637aabb562eae35c)
  
7.	Subir los cambios, teniendo en cuenta lo que averiguaron en el punto 3
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
8.	Configuren el correo en git local de manera correcta
     [Configurar correo electronico en GitHub](https://docs.github.com/es/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-email-preferences/setting-your-commit-email-address)
9.	Vuelven a subir los cambios y observen que todo esté bien en el repositorio.

## PARTE II (Trabajo de a parejas)

1.	Se escogen los roles para trabajar en equipo
   
   ![image](https://github.com/PDSW-ECI/labs/assets/118181543/716464e4-d663-477d-a87d-0f2944e5b709)

2.	El owner agrega al colaborador con permisos de escritura en el repositorio que creó en la parte 1
   
     [Invitar colaboradores a un repositorio personal](https://docs.github.com/es/account-and-profile/setting-up-and-managing-your-personal-account-on-github/managing-access-to-your-personal-repositories/inviting-collaborators-to-a-personal-repository)
   
3.	El owner le comparte la url via Teams al colaborador
4.	El colaborador acepta la invitación al repositorio
5.	Owner y Colaborador editan el archivo README.md al mismo tiempo e intentan subir los cambios al mismo tiempo.
6.	¿Que sucedio?
7.	La persona que perdió la competencia de subir los cambios, tiene que resolver los conflictos, qué los <<< === y >>> (son normales en la resolución de conflictos), resolverlos manualmente.
         [Como resolver Conflictos GitHub](https://docs.github.com/es/enterprise-cloud@latest/pull-requests/collaborating-with-pull-requests/addressing-merge-conflicts/resolving-a-merge-conflict-on-github)
         
8.	Volver a repetir un cambio sobre el README.md ambos al tiempo para volver a tener conflictos.
   
9.	Resuelvan el conflicto con IntelliJ si es posible ,  [Resolver conflictos en IntelliJ]( https://www.jetbrains.com/help/idea/resolving-conflicts.html#distributed-version-control-systems)


## PARTE III (Trabajo de a parejas)
1.	¿Hay una mejor forma de trabajar con git para no tener conflictos?
2.	¿Qué es y como funciona el **Pull Request**?
3.	Creen una rama cada uno y suban sus cambios
   
   ![image](https://github.com/PDSW-ECI/labs/assets/118181543/e558ac3b-f5d8-443a-8958-aacdedef7f94)
  	![image](https://github.com/PDSW-ECI/labs/assets/118181543/074eacc9-6284-4a41-9805-c9e30a169e5d)
  	![image](https://github.com/PDSW-ECI/labs/assets/118181543/5c664e91-d3a3-4b56-867b-3b06d9ffce72)

4.	Tanto owner como colaborador hacen un cambio en el README.md y hacen un Pull Request (PR) a la rama main/master
   
     [Pull Request - GitHub](https://docs.github.com/es/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)
  	
   
 **(Recomendación : deben trabajar en equipo y distribuirse de mejor manera quien va a modificar qué, para evitar modificar los mismos archivos al mismo tiempo, si no se editan los mismos archivos la resolución de conflictos es automática)**

5.	Teniendo en cuenta la recomendación , mezclen los cambios a la rama main a través de PR con el check/approval del otro compañero (Cuando se hace merge se deberían borrar las ramas en github)

***Como Borrar Ramas después de un Pull Request***

Se dirigen a la configuración de su repositorio:

![image](https://github.com/PDSW-ECI/labs/assets/118181543/859fb07c-5748-4b8e-91f4-2f5ee7229f90)

Y en general

![image](https://github.com/PDSW-ECI/labs/assets/118181543/a2bc8b9d-4200-472e-a712-56498b0f59b3)

Se dirigen al final  en el área del pull requests y seleccionan “ Automatically delete head branches”

![image](https://github.com/PDSW-ECI/labs/assets/118181543/838f51a7-6b2c-4673-9a60-65fe11a75647)

***Aprobación Pull Request***

Nos dirigimos (todavía en configuraciones ) a Branches ,en esta visualizarán donde daremos protección de nuestras ramas  , seleccionamos Add rule

![image](https://github.com/PDSW-ECI/labs/assets/118181543/7104fcaa-c1dd-4345-a8d0-d6a4f531de79)

Aquí damos el nombre de nuestra rama (Verificar el nombre tal cual lo tenemos en nuestro repositorio)y seleccionamos la primera opción como se muestra , así estamos requiriendo que cuando se haga ese pull request en nuestra rama se necesita aprobación de otro compañero

![image](https://github.com/PDSW-ECI/labs/assets/118181543/0631402e-6210-4b8a-a040-de594455e3b0)

Vamos al final y damos en Create

![image](https://github.com/PDSW-ECI/labs/assets/118181543/7e878bd7-8b68-4403-af98-380700d81459)

Y así protegimos nuestra rama principal , esto es más cuando trabajamos en parejas o en equipos , deberían tener un mensaje final que se vea así

![image](https://github.com/PDSW-ECI/labs/assets/118181543/1e39b81c-82c8-4fec-b2e6-b339c782b6ad)



## ENTREGA
- En un README.md colocar lo siguiente:
- Una sección llamada “INTEGRANTES” y allí colocar el listado de los integrantes del taller (máximo 2).
- Una sección llamada “RESPUESTAS” colocar las respuestas a las preguntas.




   
