# Loteria

<strong>¡ATENCION!</strong><br>
Primera práctica "interesante" que hice, aún sin muchos conocimientos en programacion orientada a objetos y sin uso de Colecciones.


OBJETIVO: <br>
Programa java que permite realizar apuestas de la
“Primitiva”, “Quiniela” y “Lotería Nacional”. <br><br>
OPERATIVA: A través de un menú, se dará opción al usuario de
elegir el juego. Cuando el usuario decida abandonar el programa,
se calculará y mostrará la cantidad de dinero que debe abonar
para hacer efectivas todas las apuestas.
Dependiendo del juego seleccionado se tendrán en cuenta las
siguientes indicaciones: <br>

<strong>La Primitiva</strong> <br>
- Los sorteos son los jueves de cada semana. Con lo cual, inicialmente se mostrará al
usuario la fecha del próximo sorteo. <br>
- A continuación, se creará una única apuesta, consistente en la generación de 6
números aleatorios entre 1 y 49, más un complementario, y un reintegro entre 0 y 9. <br>

NOTAS: <br>
- Todos los números generados deberán ser distintos.<br>
- Cada apuesta vale 1 €.<br>

<strong>La Quiniela</strong> <br>

- Cada domingo se juegan los partidos, por lo que inicialmente se indicará al usuario la
fecha de la próxima jornada. <br>
- El usuario podrá realizar como máximo 8 apuestas.<br>
- Cada apuesta consistirá en la generación de los resultados de 15 partidos de forma
aleatoria (1,2,X). <br>

NOTAS:<br>
- Un boleto será válido si se realizan al menos 2 apuestas.<br>
- Cada apuesta vale 0,5 €.<br>

<strong>Lotería Nacional</strong> <br>
- Los sorteos son sábados de cada semana. Entonces, inicialmente se informará al
usuario de la fecha del próximo sorteo. <br>
- El usuario podrá elegir la terminación del número (hasta las 3 últimas cifras). <br>
- A continuación, se generará de forma aleatoria un número de 5 cifras (con la
terminación indicada, si es el caso), más una serie (de 3 cifras) y una fracción (de 2
cifras). <br>

NOTAS:
- Se supone que todos los números están disponibles. <br>
- Cada décimo vale 12 €. <br>
