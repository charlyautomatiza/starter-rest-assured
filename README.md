<p align="center">
  <a href="https://www.twitch.tv/charlyautomatiza"><img alt="Twitch" src="https://img.shields.io/badge/CharlyAutomatiza-Twitch-9146FF.svg" style="max-height: 300px;"></a>
  <a href="https://discord.gg/wwM9GwxmRZ"><img alt="Discord" src="https://img.shields.io/discord/944608800361570315" style="max-height: 300px;"></a>
  <a href="http://twitter.com/char_automatiza"><img src="https://img.shields.io/badge/@char__automatiza-Twitter-1DA1F2.svg?style=flat" style="max-height: 300px;"></a>
  <a href="https://www.youtube.com/channel/UCwEb6xrQtQCEuN_gNgi_Xfg?sub_confirmation=1"><img src="https://img.shields.io/badge/Charly%20Automatiza-Youtube-FF0000.svg" style="max-height: 300px;" style="max-height: 300px;"></a>
  <a href="https://www.linkedin.com/in/gautocarlos/"><img src="https://img.shields.io/badge/Carlos%20 Gauto-LinkedIn-0077B5.svg" style="max-height: 300px;" style="max-height: 300px;"></a>
</p>

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
