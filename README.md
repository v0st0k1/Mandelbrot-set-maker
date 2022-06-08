# Conjunto de Mandelbrot

Quizás el conjunto fractal más conocido y estudiado, se le atribuyó dicho nombre en honor al matemático Benoît Mandelbrot que investigó e hizo numerosos trabajos sobre este conjunto.

Este conjunto se define en el plano de los números complejos, y de la siguiente forma: sea c un número complejo cualquiera, se construye la siguiente
sucesión por recursión:

![image](https://user-images.githubusercontent.com/10656513/172678326-03281299-12a1-4f90-beb1-1b14a7c7ac13.png)

Si la anterior sucesión está acotada entonces c pertenece al conjunto de Mandelbrot, y si no está acotada entonces no pertenece.

# Pseudocódigo

Para este algoritmo usaremos la propiedad del conjunto de Mandelbrot que dice que para puntos cuya distancia al origen sea mayor a 2 no pertencen al conjunto. 

Es decir:

![image](https://user-images.githubusercontent.com/10656513/172678570-de079098-a1f3-4558-8f86-7eedd8d9d437.png)

Entonces encontrando un término de la sucesión |Zn| > 2 se demuestra que no está en el conjunto.

![image](https://user-images.githubusercontent.com/10656513/172678709-ae4b52e1-6963-4cba-ba34-469e677705a5.png)
