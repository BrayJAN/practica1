##### Practica 1
# Cerradura de kleene

Este proyecto calcula la **Cerradura de Kleene** y la **Cerradura Positiva** para un número ingresado.

## Ejecución

Este proyecto implementa una aplicación web que permite calcular la cerradura de Kleene y la cerradura positiva sobre un conjunto de símbolos binarios.

#### Requisitos Previos

- Java 11 o superior
- Maven
- Git

#### Clonar el Repositorio

Para comenzar, clona el repositorio en tu máquina local:

- git clone https://github.com/BrayJAN/practica1.git
- cd practica1

## Instrucciones
![](https://raw.githubusercontent.com/BrayJAN/practica1/refs/heads/main/Ima1.jpg)

Una vez ejecutado el codigo para hacer uso correcto el programa se debe seguir el siguiente proceso: 

1. **Página principal**: Ingresa un número y selecciona entre:
   - **Cerradura de Kleene**
   - **Cerradura Positiva**

   Los resultados se muestran en la misma página. Si la entrada es inválida (letras o números negativos), se mostrará un mensaje de error.

![](https://github.com/BrayJAN/practica1/blob/main/Ima2.png?raw=true)

2. **Acceso directo**: Puedes consultar los resultados directamente en las siguientes URLs:
   - Cerradura de Kleene: `http://localhost:8002/cerradura/{numero}`
   - Cerradura Positiva: `http://localhost:8002/cerradura/positiva/{numero}`

   También puedes guardar el resultado como un archivo JSON.
