# Despliega mi primera aplicación en Azure

## Mi primer despliegue en la nube

# Parte I - Despliegue app React (frontend) en Azure

1) Busca Azure for Students en tu buscador de preferencias e ingresa con el correo institucional.
2) Crea un budget de 1 dólar para la cuenta
3) El profesor guía el resto de pasos

# Parte II - Despliegue app web spring MVC (o spring-boot backend)
1) Inicie [Azure Cloud Shell](https://docs.microsoft.com/en-in/azure/cloud-shell/overview) desde el portal. Para implementar en un grupo de recursos, ingrese el siguiente comando
```shell
az group create --name MyResourceGroup --location westus
```
2) Para crear un plan de servicio de aplicaciones (App service plan)
```shell
az appservice plan create --resource-group MyResourceGroup --name MyPlan --sku F1
```
3) Finalmente, cree el servidor MySQL con un nombre de servidor único.
```shell
az account list-locations --query "[].{DisplayName:displayName, Name:name}" -o table # choose region
az configure --defaults location=eastus # set region
az mysql flexible-server create --resource-group MyResourceGroup --name pongaunnombreunico --admin-user mysqldbuser --admin-password P2ssw0rd@123 --sku-name Standard_B1ms
```
> Importante: Introduzca un nombre de servidor SQL único. Dado que el nombre de Azure SQL Server no admite las convenciones de nomenclatura de mayúsculas y minúsculas UPPER / Camel , utilice minúsculas para el valor del campo Nombre del servidor de base de datos. 
4) Navegue hasta el grupo de recursos que ha creado. Debería ver un servidor **Azure Database for MySQL server** aprovisionado. Seleccione el servidor de base de datos.

![image](https://github.com/PDSW-ECI/labs/assets/4140058/6eefacb6-31e5-47e3-b28d-4d1301c8d1e9)

5) Seleccione **Properties**. Guarde el **Server name** y el **Server admin login name** en un bloc de notas.

![image](https://github.com/PDSW-ECI/labs/assets/4140058/0a372f89-26da-4a44-ab5b-26e1238c3be8)

> En este ejemplo, el nombre del servidor es myshuttle-1-mysqldbserver.mysql.database.azure.com y el nombre de usuario administrador es mysqldbuser@myshuttle-1-mysqldbserver.
6) Seleccione **Connection security**. Habilite la opción **Allow access to Azure services** y guarde los cambios. Esto proporciona acceso a los servicios de Azure para todas las bases de datos de su servidor MySQL.

## Ejercicio 2: actualización de la configuración de la aplicación web
A continuación, navegue hasta la aplicación web que ha creado. Mientras implementa una aplicación Java, debe cambiar el contenedor web de la aplicación web a Apache Tomcat.
1) Seleccione **Configuration**. Establezca **Stack settings** como se muestra en la imagen a continuación y haga clic en Guardar.

<img width="735" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/803a49a2-91fa-4122-8e43-6759717ed90b">

2) Seleccione Overview y click en Browse.

![image](https://github.com/PDSW-ECI/labs/assets/4140058/23e96cc7-473c-4457-aa2c-acce5c7b23ee)

3) La página web se verá como la imagen de abajo.

![image](https://github.com/PDSW-ECI/labs/assets/4140058/87db1d63-7179-4ce8-a013-a6a1c06056d8)

A continuación, debe actualizar las cadenas de conexión para que la aplicación web se conecte correctamente a la base de datos. Hay varias formas de hacerlo, pero para los fines de esta práctica de laboratorio, adoptará un enfoque simple actualizándolo directamente en Azure Portal.

4) Desde Azure Portal, seleccione la aplicación web que aprovisionó. Ir a Configuración | Configuración de la aplicación | Cadenas de conexión y haga clic en + Nueva cadena de conexión.

![image](https://github.com/PDSW-ECI/labs/assets/4140058/cccc9ce8-c19a-40c1-80b7-d82d278cc8db)

5) En la ventana Agregar/Editar cadena de conexión, agregue una nueva cadena de conexión MySQL con MyDatabase como nombre, pegue la siguiente cadena para el valor y reemplace MySQL Server Name, su nombre de usuario y su contraseña con los valores apropiados. Haga clic en Actualizar.
```java
jdbc:mysql://{MySQL Server Name}:3306/alm?useSSL=true&requireSSL=false&autoReconnect=true&user={your user name}&password={your password}
```

![image](https://github.com/PDSW-ECI/labs/assets/4140058/b0d5f0cf-949f-443e-8053-6e7ed2de7aed)

- Nombre del servidor MySQL: Valor que copió previamente de las Propiedades del servidor MySQL.
- su nombre de usuario: Valor que copió previamente de las Propiedades del servidor MySQL.
- su contraseña: valor que proporcionó durante la creación del servidor de base de datos MySQL.

7) Haga clic en Guardar para guardar la cadena de conexión.
> Nota: Las cadenas de conexión configuradas aquí estarán disponibles como variables de entorno, con el prefijo del tipo de conexión para aplicaciones Java (también para aplicaciones PHP, Python y Node). En el archivo src/main/resources/application.properties, recuperamos la cadena de conexión reemplazando el siguiente código:
```java
# ORM
# next line deletes the database on startup or shutdown
# spring.jpa.hibernate.ddl-auto=create-drop
# next line updates the database on startup
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=${MYSQLCONNSTR_MyDatabase}
#spring.datasource.username=root
#spring.datasource.password=my-secret-pw
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
```
Ahora ha instalado y configurado todos los recursos necesarios para implementar y ejecutar la aplicación.

## Ejercicio 3: implementar los cambios en la aplicación web
1) Apaga los servicios, conectate con un cliente FTP y sube el jar de la aplicación Java disponible en este enlace https://github.com/PDSW-ECI/spring-mvc-with-bootstrap, sigue este tutorial https://learn.microsoft.com/en-us/azure/app-service/deploy-ftp?tabs=portal

Configuración de la base de datos:
<img width="1165" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/73ea2177-da10-4000-a1e9-a8c769891e64">

Configuración del servicio FTP:
<img width="1495" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/05f5d912-717b-497a-b58c-468368107219">

Ejemplo conexión Filezilla:
<img width="1059" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/c12f8be9-38dc-4906-a53b-d69d8cfe4016">
<img width="1201" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/855db5f1-e2b2-4f9d-b3b8-77e1d90afa4a">

Ejemplo conexión Cyberduck:
<img width="837" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/0d419624-d114-4e1f-8a4f-9b92c0ce3d9f">
<img width="602" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/2da21022-57b9-4ba5-8eda-be602fc5b2d2">

Configuración necesaria para acceder a FTP:
<img width="840" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/5dbb25b3-8135-4715-b5f3-e6b0d939c08e">

## Entrega
- El enlace de la aplicación React y Spring MVC desplegada en Azure
