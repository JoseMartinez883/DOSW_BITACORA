SEMANA No 1 – DOSW Manejo de Streams

## Datos personales:

- **Nombre y Apellido: Jose Alejandro Martinez Arias**
- **Código de Estudiante: 1000104385**
- **Curso: DOSW**

---

### Ejercicio 01 – Filtrado de números pares mayores a 10

Filtrar de una lista de enteros aquellos números que sean pares y simultáneamente mayores a 10.

**Código implementado:**

```java
package semana_1.streams;

import java.util.List;

public class Ejercisio01 {


    public static void main(String[] args){
        List<Integer> numbers = List.of(3,8,10,12,15,18,20);

        // forma 1
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .toList();

        System.out.println(result);

        // forma 2
        List<Integer> resultado = numbers.stream()
                .filter(n -> n  % 2 == 0 && n > 10)
                .toList();

        System.out.println(resultado);


    }
}
```

**Captura de ejecución:**

![Captura de ejecución Ejercicio 01](docs/images/Semana01Ejercisio01.png)

**Explicación:** Se utiliza la API de Streams sobre una lista de números enteros. Se aplican operaciones intermedias mediante `filter()` para seleccionar únicamente los elementos pares y mayores a 10. En la primera forma se encadenan dos llamados a `filter()`, mientras que en la segunda se combinan las condiciones en un único predicado con `&&`. Finalmente, la operación terminal `toList()` recolecta los datos resultantes.

---

### Ejercicio 02 – Procesamiento, transformación y conteo de cadenas

Dada una lista de cadenas de texto (palabras), filtrar aquellas con longitud mayor a 4 caracteres, convertirlas a mayúsculas, ordenarlas alfabéticamente y contar cuántos elementos cumplen el criterio.

**Código implementado:**

```java
package semana_1.streams;

import java.util.List;

public class Ejercisio02 {

    public static void main(String[] args){

        List<String> words = List.of("java","stream","api","functional","code","git");

        // forma 1
        List<String> processed = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        long count = processed.stream().count();

        System.out.println(processed);
        System.out.println(count);

        // forma 2
        long cantidad = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .peek(System.out::println)
                .count();

        System.out.println(cantidad);
    }
}
```

**Captura de ejecución:**

![Captura de ejecución Ejercicio 01](docs/images/Semana01Ejercisio02.png)

**Explicación:** Se filtra el stream de palabras conservando solo las que tienen una longitud estrictamente mayor a 4 (`w.length() > 4`). Luego se realiza una transformación con `map(String::toUpperCase)` a mayúsculas y se ordenan con `sorted()`. Se presentan dos formas: una recolectando a lista y obteniendo el tamaño, y otra usando `peek()` para imprimir mientras se realiza la operación terminal de conteo `count()`.

---

### Ejercicio 03 – Filtrado y ordenamiento de usuarios activos

Dada una lista de objetos de tipo `User`, obtener los nombres en mayúsculas de todos los usuarios cuyo estado sea activo (`isActive == true`), retornándolos ordenados alfabéticamente.

**Código implementado:**

```java
package semana_1.streams;

import java.util.List;

public class Ejercisio03 {

    public static void main(String[] args){

        List<User> users = List.of(new User(100010202,"Jose",10,true),
                new User(34242424,"Alex",34,false),
                new User(342424242,"Pepe",324,true),
                new User(4636363,"Fernanada",342,true),
                new User(58594202,"Joselito",32425,true)
        );

        // forma 1
        List<String> result = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);

        // forma 2
        List<String> resultado = users.stream()
                .filter(User::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();

        System.out.println(resultado);



    }
}
```

**Captura de ejecución:**

![Captura de ejecución Ejercicio 01](docs/images/Semana01Ejercisio03.png)

**Explicación:** Se filtra el stream de usuarios evaluando la propiedad activa mediante `User::isActive`. Posteriormente, se transforma cada objeto `User` a su atributo `name` en mayúsculas y se ordena la lista alfabéticamente con `sorted()`. El resultado se consolida en una lista utilizando la operación terminal `toList()`.

---

### Ejercicio 04 – Obtención de nombres de usuarios mayores de edad

Filtrar de una lista de objetos `User` a aquellos que tengan una edad igual o superior a 18 años (`age >= 18`) y extraer únicamente sus nombres.

**Código implementado:**

```java
package semana_1.streams;

import java.util.List;

public class Ejercisio04 {

    public static void main(String[] args){

        List<User> users = List.of(
                new User(1, "Carlos", 17, true),
                new User(2, "ana", 30, false),
                new User(3, "miguel", 15, true),
                new User(4, "beatriz", 28, true),
                new User(5, "juan", 35, true)
        );

        List<String> resultado = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println(resultado);
    }
}
```

**Captura de ejecución:**

![Captura de ejecución Ejercicio 01](docs/images/Semana01Ejercisio04.png)

**Explicación:** Se aplica la operación `filter` con el predicado `u -> u.getAge() >= 18` sobre el stream de objetos `User`. A continuación, se extrae la propiedad del nombre de cada usuario que cumple la condición utilizando `map(User::getName)` y se recolecta el resultado final en una lista de cadenas con `toList()`.

---

### Ejercicio 05 – Verificación de transacciones no aprobadas

Dada una lista de objetos `Transaction`, determinar si existe al menos una transacción que no haya sido aprobada (`isApproved == false`).

**Código implementado:**

```java
package semana_1.streams;

import java.util.List;

public class Ejercisio05 {


    public static void main(String[] args){
        List<Transaction> transactions = List.of(
                new Transaction("TX-001", 120.50,true),
                new Transaction("tx-002", 350.00, true),
                new Transaction("TX-003", 90.25, false),
                new Transaction("TX-004", 500.00, true)
        );

        boolean hasUnapprovedTransaction = transactions.stream()
                .peek(System.out::println)
                .anyMatch(transaction -> !transaction.isApproved());

        System.out.println(hasUnapprovedTransaction);
    }
}
```

**Captura de ejecución:**

![Captura de ejecución Ejercicio 01](docs/images/Semana01Ejercisio05.png)

**Explicación:** Se convierte la lista de transacciones en un stream y se hace uso de `peek()` para imprimir cada elemento evaluado en pantalla. La evaluación principal se efectúa mediante la operación terminal `anyMatch()`, pasando como condición `!transaction.isApproved()`. Esta operación devuelve un resultado booleano (`true` si encuentra al menos una transacción no aprobada, de lo contrario `false`).
