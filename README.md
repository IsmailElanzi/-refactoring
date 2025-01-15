# -refactoring

1. Diseñar un programa que pida el número de veces que quiere que se imprima el mensaje
 y llame a la función eco() a la que se le pasa como parámetro el número n, y muestre por
 pantalla n veces el mensaje:
 Eco ...

*Comentario de Juanma*

Cambios realizados en el código:
Renombramiento de métodos y variables:

-Cambié el nombre del método eco a printEcoMessage para que sea más descriptivo y siga las convenciones de nomenclatura de Java.
-Renombré la variable n a repetitions en el método y el main para mejorar la claridad del propósito.

Validación de entrada:

-Se agregó una validación para verificar que el número de repeticiones sea mayor que 0.
-En el main, se valida si la entrada es un número entero antes de continuar.

Gestión de excepciones:

-Agregué un bloque try-with-resources para asegurar que el Scanner se cierre correctamente.
-Se manejan excepciones genéricas para capturar errores imprevistos durante la ejecución.

Mensajes informativos:

-Mejoré los mensajes al usuario para que sean más detallados y amigables, como en el caso de errores de validación.

Comentarios en el código:

-Añadí comentarios en el método para describir su propósito y uso.
-Documenté el flujo principal del programa en el método main.

 6. Escribir una función a la que se le pase un número entero y devuelva el número de
 divisores primos que tiene.

 5. Crear una función que, mediante un booleano, indique si el carácter que se pasa como
 parámetro de entrada corresponde con una vocal

REFACTORIZACIÓN SILVIA:
- Cambió el nombre del método para esVocal reflejar su funcionalidad real.
- Declarado e inicializado letra antes de llamar al método.
- Simplificó la declaración de retorno en el esVocal método para eliminar la construcción innecesaria if-else.

 9. Diseñar una función que calcule an, donde a es real y n entero no negativo. Realizar una
 versión iterativa y otra recursiva.

 10. Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci. En esta
 serie el n-ésimo valor se calcula sumando los dos valores anteriores. Es decir:
 fibonacci(n) = fibonacci(n − 1) + fibonacci(n − 2)
 fibonacci(0) = 1
 fibonacci(1) = 1
