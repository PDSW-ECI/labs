# LABORATORIO 7 - Finalización CI/CD - Manejo de Data - ORM

## PARTE I. FINALIZACIÓN CI/CD
### Verificación APP
- Verificar funcionamiento de app MyShutle en micuenta de la nube de Azure.
- Al presionar en su URL: ej. `https://mycvdsappname.azurewebsites.net/myshuttledev`
- Deberá salir un pantalla mostrando la pantalla de login de MyShuttle. En caso que no, qué es lo más probable, vamos a revisar cómo mirar los errores.

### Troubleshooting - Activando logs
- Revisión de logs del sistema
  - Ingresar al los recursos de nuestra cuenta en la nube de Azure.
  - Entrar al recurso de nuestra aplicación web.
  - Buscar la opción de Logs Stream, ingresar allí. Nos debe salir un mensaje que nos indica que primero debemos activar ó configurar los logs.
  - Volver a la página anterior y presionar en la opción Configure Logs.
  - Vamos a configurarlos de la siguiente manera:
    - Application logging: ON(Level: Error)
    - Application login (Blob): OFF
    - Web server logging: File System
    - Quota 35 MB
    - Retention Period: 3
    - Detailed error messages: ON
    - Failed request tracing: ON
  - —> Guardar.
  - Revisar qué está pasando a la hora de hacer login.
- Revisión delcódigo fuente
  - Descargue el repositorio de MyShuttle de su cuenta de AzureDevOps(ADO).
  - Busque el repositorio MyShuttle en su cuenta de ADO
  - Ejecute elcomando gitclone para descargar el proyecto.
  - Sí le solicita una contraseña, presione el botón Generate Git Credentials y obtenga la contraseña generada para cuando se la solicite localmente Git.

### Continuous Integration - Activando la opción integración continua en el Pipeline.
- Buscar en ADO los pipelines, y editar el pipeline de nuestro proyecto.
- Activar el checkbox de “continuous integration” en el menú Triggers. —> Guardar.
- Ahora cuando hagamos un push, se ejecutará el pipeline de construcción de la nueva versión de nuestro proyecto.
- Para desplegarlo, ir al Menu Releases y manualmente crear un release.
- Luego de que sea exitoso podemos volver a probar nuestro sistema.

### Bugfixing - Solucionando un Bug
- Revisar en qué parte está ubicada la información de la base de datos.
- Revisa las propiedades de conexión del proyecto java a la base de datos.
- Validar cuales son los datos de conexión correctos.
- Actualizar información de conexión a la BD en la clase.
- Subir los cambios al repositorio remoto.
- Validar si ya funciona el ajuste.

Considere qué los datos de una base de datos siguen una forma similar a esta, sin embargo los datos no serán iguales:
```java
  private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
  private static final String DB_URL = "jdbc:mysql://mysqldbserver4.mysql.database.azure.com:3306/alm";
  private static final String DB_USER = "mysqldbuser@mysqldbserver4";
  private static final String DB_PASS = "P2ssw0rd@123";
```

## PARTE II. USANDO SPRING DATA DESDE CERO
- Descargue el código de https://github.com/PDSW-ECI/spring-mvc-with-bootstrap
- Ejecute el comando `docker run -p 3306:3306 --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest`
- Descargar un cliente de base de datos: DBeaver
- Crear el siguiente modelo, use como base la clase `Configuration.java` ya creada:
<img width="140" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/9df565e5-dd4f-4932-b655-49de6a7c78ea">

- Cree una interfaz CRUD para esa entidad usando los conocimientos del laboratorio 5

<img width="672" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/67f8763f-920d-4c26-a7e7-cfcbee8cd37c">

<img width="675" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/8030b6b1-741f-4460-92ce-b66156c9857b">

<img width="675" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/652744e8-f2be-496d-9a57-6e72cb652c7f">

<img width="676" alt="image" src="https://github.com/PDSW-ECI/labs/assets/4140058/79383263-86ac-4bee-81d7-d3d9df1b0a60">


## ENTREGA
- CI/CD: La URL pública de su cuenta en la nube de Azure que apunte a la aplicación de MyShuttle. Se solicitará su activación para revisión.
- DATA: URL del repositorio en github funcionando con una base de datos local.
