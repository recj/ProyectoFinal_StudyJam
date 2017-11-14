Proyecto Final - Study Jam II 2017
===
<div align="center">
    <center>
        <img src="http://developerstudyjams.com/images/masthead.png" width="400px"/>
    </center>
</div>

Repositorio Proyecto Final del Study Jam Android Development for Beginners II 2017, llevado a cabo en la ciudad de La Paz, Bolivia a cargo del <a target="_blank" href="http://www.gdg.androidbolivia.com">GDG Android Bolivia</a> .

Nombre Aplicación.
---
El nombre de la aplicación es: ABolivia - Presidentes
        (Acerca de Bolivia - Presidentes)
Objetivo
---
"Acerca de Bolivia-Presidentes" es una aplicación escolar-estudiantil, con el objetivo de ayudar a los estudiantes en el aprendizaje de la historia de los presidentes de Bolivia de manera rápida e intuitiva mediante una recopilacion ordenada de los datos de los 65 presidents de Bolivia.

Caracteristicas
---
* Lista de 65 Presidentes.
* Cada ficha de cada presidente contiene infomración importante 
* Opción de consulta de información Web.
* Corta historia de Bolivia.

Wireframes
---
Puedes visualizar los Wireframes de este proyecto.

https://ninjamock.com/s/24XJGWx

Compatibilidad
---
Esta aplicación es compatible con versiones de Android 5.0 (Lollipop) o superior.

Uso
---------
Para probar este ejemplo clona este repositorio de la siguiente forma:
>
>     $ git clone https://github.com/recj/ProyectoFinal_StudyJam.git

Luego de ello dentro de Android Studio:

* File --> New --> Import Project 
* Seleccionas la ruta donde hiciste el `clone` del proyecto.
* Build --> Rebuild Project
* Run 

Corrida previa
---
Este es el funcionamiento de la aplicación.
<div align="center">
    <center>
        <table border="0">
            <tr>
                <td> </td>
            </tr>
            <tr>
                <td><img src="/img/vistaPrevia.gif" width="300"></td>
            </tr>
            <tr>
                <td> </td>
            </tr>
        </table>
    </center>
</div>
<br>

Descripción técnica
---
En este proyecto se utilizáron los siguientes componentes tanto en el `diseño` como en la `funcionalidad`:

**`Vista:`**
* DrawerLayout para implementar un menu eficiente.
* RelativeLayout para la alineación de las vistas principales y secundarias.
* LinearLayout para la alineación de las vistas en las actividades (RecyclerView).
* CardViews, para contener las fichas de los presidentes.
* ImageView, para las imagenes a lo largo de la aplicacíon.
* TextView, para contener toda la información de los Strings.
* Rotate y Alpha, para las animaciones de la SplashScreen inicial.
* ScrollView, para visualizar el contenido de un activity.
* WebView, para insertar la pagina externa dentro de nuestra aplicación.
.
.
.

**`Funcionalidad:`**
* SoundPouns, para reproducir el efecto de sonido de los botones.
* MediaPlayer, para reproducir el audio inicial.
* CustomAdapter, para la manipulacion de datos en el cardView.
* Animation, para insertar la animacion en el splashScreen.
* Intents, para el manejo de activities. 
.
.
.

Autor(a)
---
Rodrigo Junior Espinoza Cruz

Contactos
---
espinozarjc@gmail.com<br>
Telf. +591 65558058<br>
La Paz - Bolivia<br>
FACEBOOK : https://www.facebook.com/rodrigojunior.espinozacruz