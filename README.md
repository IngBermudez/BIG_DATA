# BIG_DATA


**Content**

Table of contents

- [Practice 1](#practice-1)
- [Practice 2](#practice-2)


<div id='pr1' />

## Practice 1
---

In this practice, certain exercises will be carried out to reinforce what was seen in class, from positioning in tuples to simple interpolations of chains

1. Develop a scala algorithm that calculates the radius of a circle
```scala
val p=20
val pi=3.1416
var radio = p/(2*pi)
println("El Radio del Circulo es " + radio)
```

2. Develop a scala algorithm that tells  if a number is prime
```scala
if((5%2)==0) println("no es primo") else println("es primo")
```


3. Use the interpolation of string to print  "Estoy ecribiendo un tweet"

>The s interpolator allows us to use the value of the variable within the string
```scala
val bird = "tweet"
val fraseC = s"estoy escribiendo un $bird"
```

4. Use de Slice to extract the word "luke"
>The slice method allows us to cut in the range that we indicate, in this case between 5 and 9 to obtain the sequence "luke"
```scala
var mensaje = "hola luke yo soy tu padre!" 
mensaje slice (5,9)
```


5. Whats the difference between value and variable

>val stand for value which means that cant be change
```scala
val pi=3.1416
``` 
>var stand for variable which means that can be  change
```scala
var radio = p/(2*pi)
```

6.  Given the tuple (2,4,5,1,2,3,3.1416,23) return the number 3.1416 
>To access each element,  _N is used, N representing the number of the position
```scala
val tupla=(2,4,5,1,2,3,3.1416,23)
println(tupla._7)
```


## Practice 2
---
In this practice, certain exercises will be carried out to reinforce what was seen in class, from arrays, lists and maps

1. Create a list called "lista" with the elements "rojo", "blanco", "negro"
```scala
val lista = Lista("rojo","blanco","negro")
```

2. Add 5 more items to "lista" "verde" ,"amarillo", "azul", "naranja", "perla"

>collection.mutable allows us to modify the data within a data structure, such as adding, deleting etc.
```scala
val list= collection.mutable.Set("rojo","blanco","negro")
lista+="verde"
lista+= "amarillo"
lista+="azul"
lista+= "naranja"
lista+="perla"
```
3. Bring the items "verde" ,"amarillo" and "azul" from "lista" 

>With this we send to call the elements in that position
```scala
lista(3)
lista(4)
lista(5)
```

4. Create an Array of numbers in the range 1-1000 in steps of 5 by 5

>range is a method that allows us to create another array with the mentioned sequence
```scala
val arreglo  = Array.range(1, 1000, 5)
```

5. What are the unique elements of the list lista(1,3,3,4,6,7,3,7)  use conversion to sets

>With the function list .to Set as the name mentions, it allows us to pass a list to a data set
```scala
val lista = List(1,3,3,4,6,7,3,7)
list.toSet
```

6.  Create a map mutable named Names containing the following elements: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
```scala
val mapa = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23),("Susana","27"))
```
- 6a. Print all map keys
```scala
mapa.keys
```
- 6b. Add the following value to the map ("Miguel", 23)
```scala
mapa += ("Miguel" -> 23)
```





