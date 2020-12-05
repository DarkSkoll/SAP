# Simulador de Algoritmos Planificadores(SAP)
Proyecto final de la materia de Sistemas Operativos I Otoño 2020
Equipo 4:
- Lievana Poy Erick
- Raymundo Martínez Miguel Angel
- Canalizo Mendoza Isaac

## Compilacion
Este programa se compila con el comando
>   javac *.java

## Ejecucion
Este programa se inicia con el comando
>   java Launcher archivo.txt

## Archivo
Como se indica en la Ejecucion, se requiere ingresar un archivo de texto, este archivo contendra los procesos, siendo un proceso por linea, junto con su Id de proceso, prioridad, tiempo de llegada y su duracion, separadas por coma, como en el siguiente ejemplo:

>   A,2,8,10
>
>   Proceso A, con prioridad 2, llegando en tiempo 8, con duracion de 10.

## Uso
Una vez ejecutado el programa tendremos la siguiente ventana:

[Ventana Principal](pantallaPrincipal.png)

Como podemos observar, en la parte superior derecha tendremos el diagrama de Gantt, este se mostrara una vez se inicie la simulación. En la parte inferior se muestra la tabla que guardara los resultados de la simulación esta se llenara una vez que esta termine. En la parte superior izquierda encontramos un menu desplegable para seleccionar el algoritmo que se desee ejecutar. Un campo para introducir el tamaño del quantum requerido por el algoritmo *Round Robin*, si no se ingresa sera en automatico 1, y el boton para iniciar la simulación.
