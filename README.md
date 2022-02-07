# API Test Automation - Rest Assured
## Starter project creado en vivo en stream de [Twitch.tv/CharlyAutomatiza](https://www.twitch.tv/charlyautomatiza) basado en [Rest Assured](https://rest-assured.io/).

### Requerimientos generales

- Instalar algún cliente git como por ejemplo [git bash](https://git-scm.com/downloads) 

Descargar e instalar

- Java Development Kit 17 [(JDK)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133155.html)
    - Asegurarse de tener configurada la variable de entorno **JAVA_HOME** con la ruta de la JDK respectiva.
    - En caso de tener otra versión anterior de la JDK, para que funcione el proyecto se deberá actualizar en el archivo [pom.xml](pom.xml) la propiedad **java.version**.
- Maven [(Maven)](https://maven.apache.org/download.cgi)
    - Asegurarse de tener configurada la variable de entorno **M2_HOME** o **PATH** con la ruta de la Maven respectiva.

### Instalación del framework de pruebas

**Clonar el repositorio:**

    git clone https://github.com/charlyautomatiza/starter-rest-assured.git

**Para la ejecución de los test situarse en la raíz del proyecto y ejecutar**

    mvn clean test
