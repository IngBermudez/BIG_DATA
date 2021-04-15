# BIG_DATA


**Content**

Table of contents

- [Practice 1](#practice-1)
- [Practice 2](#practice-2)
- [Practice 3](#practice-3)
- [Investigation](#investigation)
    - [Pair Coding](#pair-coding)
    - [Pair Coding 2](#pair-coding-2)
- [Evaluative Practice](#evaluative-practice)

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



## Practice 3
---
In this practice, we are going to make the pseudocodes of all the versions of the fibonacci series  using scala

1. Recursive version

>The first way to solve a fibonacci series that we find is the following, based on recursion due to its way of handling the data within the function. Being N the number from which it gives us the number of times the function will have to be repeated to reach itself based on the formula of the fibonacci series
```scala
def fib(N: Int): Int = {
if (N <2){
 return N
   }
   else {
      return fib(N-1) + fib (N-2)
   }
}
```

2. Iterative version using the while cycle

>In this way, the returned result will be an int, we declare the variables that we are going to use. In the while loop we add the variables until i is greater than n
```scala
def fib2( n : Int ) : Int = {
  var a = 0
  var b = 1
  var i = 0	  
 
  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  } 
  return a
}
```

3. Cyclical version or terative second version 

>The difference between this algorithm and the past one is that only two variables are used in the sum. In the same way, "a" is returned as a value of int
```scala
def fib3(N: Int): Int ={
    var a=0
    var b=1
    var i=0
    while(i<N){
        b=b+a
        a=b-a
        i=i+1
    }
    return a
}
```

4. Iterative with a vector

>It all begins by verifying that n is less than 2, when it is not, a vector with a range of (0, n + 1) is made and we give a k value of 2, if k is still less than n + 1 then the vector is add K-1 and k + 1 and then increase the value of k and return until n is less than 2
```scala
def fib4(N: Int): Int = {
    if (N<2) {
        return N
    }
    else {
        val Vector = Array.range (0, (N+1))
        Vector(0) = 0
        Vector(1) = 1
        var k = 2
        while (k < (N+1)) {
            Vector(k) = Vector (k-1) + Vector (k-2)
            k= k+1
        }
        return Vector(N)
    }
}
```

5. Explicit formula

>This algorithm can be done thanks to the use of libraries and their functions.
for i and J different methods are used with their respective functions. In the case of the variable i, the sqrt function is used to obtain its value and in J the math.pow function is used to raise the power of the value and perform the operation, once the results are obtained as they use too many decimals with the bigDecimal library We round it like this by reducing the number of decimal digits
```scala
import scala.math.sqrt
import scala.math.BigDecimal

def fib2(N: Int): Double = {
if (N <2){
        return N
    }
    else {
        var i = (1+ sqrt(5))/2
        var j = (scala.math.pow(i,N) - scala.math.pow((1-i),N))/sqrt(5)
        return BigDecimal(j).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
}
```


## Investigation
---
### Pair Coding
The method known as pair programming (in Spanish, programming in pairs)It is mainly used in agile software development and, more specifically, inextreme programming (XP). Pair programming specifies that there are always twopeople working on the code at the same time and that, as far as possible,they sit together. One is in charge of writing the code and the other of supervising inreal time. At the same time, they are constantly exchanging impressions:they discuss problems, find solutions and develop creative ideas.

-- Bermudez Ornelas Alberto
[Full Version](https://github.com/IngBermudez/BIG_DATA/blob/Unit_1/Investigations/PairCoding_Bermudez.md)

### Pair Coding 2



## Evaluative Practice
---
