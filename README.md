# BIG_DATA


**Content**

Table of contents

- [Practice 1](#practice-1)


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






