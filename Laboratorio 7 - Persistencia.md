# LABORATORIO 7 - PERSISTENCIA - 2022-1

LABORATORIO 7
ESCUELA COLOMBIANA DE INGENIERÍA
CICLOS DE VIDA DEL DESARROLLO DE SOFTWARE
SECCIÓN I. - INTRODUCCIÓN A JDBC
1. Clonar el proyecto MyBatis_Introduction_VideoRental de GitHub donde se realizará la implementación completa del laboratorio.
2. Descargue el archivo JDBCExample.java y agreguelo en el paquete "edu.eci.cvds.sampleprj.jdbc.example".
3. Desde esta clase se realizará una conexión a una base de datos MySQL por medio de JDBC y sus "Prepared Statements".
4. En un motor de base de datos SQL se tiene un esquema con el siguiente modelo de base de datos (para registrar pedidos sobre productos):

5. Revise la documentación de ‘PreparedStatement’, del API JDBC.
6. En la clase JDBCExample juste los parámetros de conexión a la base de datos con los datos reales:
Url: jdbc:mysql://desarrollo.is.escuelaing.edu.co:3306/bdprueba
Driver: com.mysql.jdbc.Driver
Usuario: bdprueba
Contraseña: prueba2019
7. Implemente las operaciones faltantes:
1. nombresProductosPedido
2. valorTotalPedido - El resultado final lo debe retornar la base de datos, no se deben hacer operaciones en memoria.
3. registrarNuevoProducto - Use su código de estudiante para evitar colisiones.
8. Verifique por medio de un cliente SQL, que la información retornada por el programa coincide con la que se encuentra almacenada en base de datos.
SECCIÓN II. - INTRODUCCIÓN A MYBATIS

1. Revise la documentación básica de MyBatis de forma que entienda para qué sirve y el uso básico que se le puede dar al framework.
2. Seguir las instrucciones que se encuentran en el repositorio de forma que en la clase MyBatisExample.java se creen los mappers necesarios y sea
posible realizar la ejecución de diferentes sentencias SQL en la base de datos de pruebas.
ENTREGA
Agregar la URL del repositorio donde se cargó el proyecto.

GRADING SUMMARY

Hidden from students No
Participants 0
Submitted 0
Needs grading 0
Due date Saturday, 19 March 2022, 10:00 AM
Time remaining Assignment is due
Late submissions Only allowed for participants who have been granted an extension
