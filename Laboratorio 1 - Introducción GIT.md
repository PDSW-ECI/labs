# LABORATORIO 1- INTRODUCCIÓNGIT - 2022-1
### ESCUELA COLOMBIANA DE INGENIERÍA
#### CICLOS DE VIDA DE DESARROLLO DE SOFTWARE

## PARTE I. - CREANDO REPOSITORIOS
Trabajo en pareja (2 integrantes):
1. Cada integrante,crear una cuenta en GitHub.
En una de las doscuentas,cree un nuevo repositorio llamado:cvds-lab1-[].
Invite al usuario del otro integrante como colaborador de dicho proyecto.
2. (Integrante 1) Cree una directorio(carpeta)con lossiguientes archivos:
libro.txt
----------------------- libro.txt -----------------------
EL LIBRO MAS FAMOSO DEL MUNDO
AUTORES:

CAPITULO UNO

CAPITULO DOS

CAPITULO TRES
---------------------------------------------------------
feerratas.txt
----------------------- feerratas.txt -------------------
FE DE ERRATAS

* El tErmino de la pagima (por lo general) 15 es impreSiso.
---------------------------------------------------------
Cree un repositorio local nuevo utilizando la documentación en https://git-scm.com/docs/git-init

3. (Integrante 1)Haga ‘push’ del proyecto recién clonado al nuevo repositorio.
git push URL_REPOSITORIO master
Nota: Si tiene problemas haciendo el push, se debe a cambio en las políticas de seguridad de GitHub. Seguir los
siguientes pasos:
“Create Personal Access Token on GitHub

Desde tu cuenta de GitHub, ir a Settings → Developer Settings → Personal Access Token → Generate New Token
(Give your password) → Llene el formulario → de click en Generate token → Copie el Token generado, será algo
como ghp_sFhFsSHhTzMDreGRLjmks4Tzuzgthdvfsrta. Luego ese token servirá para la autenticación requerida en la
consola de github”.

4. (Integrante 1) Agregue al libro,como autores, losintegrantes de la pareja (sólo el primer nombre). Agregue loscambios para elsiguiente commit,
haga commit, y haga ‘push’ de dichoscommits:
git add .
git commit -m "AUTORES DE LA PAREJA 1 AGREGADOS"
git push URL_REPOSITORIO master
5. (Integrantes 1 y 2) Revisen a través delcliente Web de GitHub, que el documento haya sido actualizado.
6. (Integrante 2) Clone el proyecto actualizado:
git clone URL_REPOSITORIO
7. (Integrante 2) Agregue los autores de su Pareja al libro (sólo el primer nombre). Agregue loscambios para elsiguiente commit, haga commit, y haga
‘push’ de dichoscommits:
git add .
git commit -m "AUTORES DE LA PAREJA DOS AGREGADO"
git push URL_REPOSITORIO master
8. (Integrante 1) Obtenga los‘commits’ realizados por la pareja anterior, y revise que los mismos hayan sido aplicados al documento.
git pull URL_REPOSITORIO master
9. Utilice en comando gitk para verificar el historial de cambiossobre el repositorio.
10. (Integrantes 1 y 2 al tiempo)
Integrante 1: Remueva el paréntesis de la línea 5 de la fe de erratas.
Integrante 2: Arregle los errores de ortografía en el archivo fe de erratas.
Integrantes 1 y 2: Agreguen loscambios a susrepositorioslocales, hagan commit y push.¿Las dos parejaslo pudieron hacer?,¿Qué quedó al final en la
versión oficial?
Si para alguno no es posible hacer el ‘push’ (porconsistencia), haga antes un pull a la rama ‘master’ del repositorio en GitHub con ‘rebase’:
git pull --rebase URL_REPOSITORIO master
Usando elcomando gitk,¿Qué diferencia hay ahora en el historial de cambios en el repositorio?

## PARTE II. - INTRODUCCIÓNGENERAL GIT
Trabajo Individual:
1. Revise la documentación de Git: https://git-scm.com/doc
2. Revise la páginaweb http://ndpsoftware.com/git-cheatsheet.html para entender la diferencia entre las partes de GIT y loscomandos disponibles para
cada una.
3. Investigue un poco acerca de Markdown y de cómo realizar un archivo README.
4. Realice el tutorial de Markdown disponible en: https://commonmark.org/help/tutorial/
5. En el repositorio de la Parte I,cree una carpeta con su nombre.
6. Cree un archivo Readme.md en formato Markdown en su carpeta donde incluya su nombre, datos básicos, plan de estudios, etc. Agregue
cualquier información que desee mostrar acerca de usted.
7. El archivo debe incluir al menos1 de cada uno de lossiguientes elementos(negrita,cursiva, títulos,subtítulos, párrafos, listas ordenadas y no
ordenadas, enlaces, imágenes y fragmentos de código).

## PARTE III. - GIT BRANCHING
Trabajo Individual:
1. Ingrese a la páginaweb: https://learngitbranching.js.org/
2. Complete todoslos ejercicios de dicha página Web (tanto de la sección "Main"como "Remote").
3. Realice las 2 capturas de pantalla necesarias, donde se vean finalizadostodoslos nodos de cada sección. Se debe también visualizar la fecha y hora de
finalizado junto con el nombre /carné de la persona que toma la captura.
4. Agregue lasimágenes en el Readme de su carpeta de forma que sean visibles desde el repositorio.
