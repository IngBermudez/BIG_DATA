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
These two workers are typically assigned different roles: the programmer who has been assigned the pilot role is in charge of writing the code. The programmer who has been assigned the copilot role is in charge of monitoring that code. One of the rules of the scheduling pair states that these two roles are exchanged regularly (at short intervals). In this way, a possible hierarchical gap is avoided: equality between both workers is promoted and a fluid exchange of roles is achieved.

-- Zuñiga Sosa Ruben
[Full Version](https://github.com/IngBermudez/BIG_DATA/blob/Unit_1/Investigations/PairCoding_Zuñiga.md)

## Evaluative Practice
---

1.  Start a Spark session 

>We run the first part of the code to have access to sparksession, then we add it to a variable together with the function "builder ()" to create the session and with getorcreate () we say that in case it already exists to use that same one, this way we avoid redundancy
```scala 
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
```
2.  Upload the CSV file with Spark inferring the data types.

>For the dataframe we make it load it into a variable. We add the functions we want, in this case we will use the "inferschema" option that will help us later, it is by default false.
```scala 
val dataframe = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/the_g/Documents/Github/BIG_DATA/BIG_DATA/Evaluative_Practice/Netflix_2011_2016.csv")

```

3. What are the column names?

>We use a simple method that gives us the names of the columns. below we can see the result that it gives
```scala 
dataframe.columns
res0: Array[String] = Array(Date, Open, High, Low, Close, Volume, Adj Close)
```
4. How is the scheme?


>With this method we can see the scheme in tree format
```scala 
dataframe.printSchema()
root
 |-- Date: timestamp (nullable = true)
 |-- Open: double (nullable = true)
 |-- High: double (nullable = true)
 |-- Low: double (nullable = true)
 |-- Close: double (nullable = true)
 |-- Volume: integer (nullable = true)
 |-- Adj Close: double (nullable = true)
```

 5. Print the first 5 columns.
 
 >We use a simple sql type function calling the columns with the specific names and with the show (5) method we show them in a table format with 5 rows of data
 ```scala 
 dataframe.select("Date", "Open", "High", "Low", "Close").show(5)
 +-------------------+----------+------------------+----------+-----------------+
|               Date|      Open|              High|       Low|            Close|
+-------------------+----------+------------------+----------+-----------------+
|2011-10-24 00:00:00|119.100002|120.28000300000001|115.100004|       118.839996|
|2011-10-25 00:00:00| 74.899999|         79.390001| 74.249997|        77.370002|
|2011-10-26 00:00:00|     78.73|         81.420001| 75.399997|        79.400002|
|2011-10-27 00:00:00| 82.179998| 82.71999699999999| 79.249998|80.86000200000001|
|2011-10-28 00:00:00| 80.280002|         84.660002| 79.599999|84.14000300000001|
+-------------------+----------+------------------+----------+-----------------

```
6. Use describe () to learn about the DataFrame.

>describe() returns the basic information of the metadata and with "show()" we show them in table format
```scala 
dataframe.describe().show()
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+
|summary|              Open|              High|               Low|             Close|              Volume|         Adj Close|
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+
|  count|              1259|              1259|              1259|              1259|                1259|              1259|
|   mean|230.39351086656092|233.97320872915006|226.80127876251044|  230.522453845909|2.5634836060365368E7|55.610540036536875|
| stddev|164.37456353264244| 165.9705082667129| 162.6506358235739|164.40918905512854| 2.306312683388607E7|35.186669331525486|
|    min|         53.990001|         55.480001|             52.81|              53.8|             3531300|          7.685714|
|    max|        708.900017|        716.159996|        697.569984|        707.610001|           315541800|        130.929993|
+-------+------------------+------------------+------------------+------------------+--------------------+------------------+
```
7. Create a new dataframe with a new column called "HV Ratio" which is the 
relationship between the price of the column "High" versus the column "Volume" of
shares traded for one day. (Hint: It is a column operation). 

>What is done here is that within another dataframe together with the withcolumn function we add a new column (This function allows us to move, replace or update the data), We indicate the name of the column and the data it will have. finally we show the first 5 with the show function
```scala 
val dataframe2 = dataframe.withColumn("HV Ratio", dataframe("High")/dataframe("Volume")).show(5)
+-------------------+----------+------------------+----------+-----------------+---------+------------------+--------------------+
|               Date|      Open|              High|       Low|            Close|   Volume|         Adj Close|            HV Ratio|
+-------------------+----------+------------------+----------+-----------------+---------+------------------+--------------------+
|2011-10-24 00:00:00|119.100002|120.28000300000001|115.100004|       118.839996|120460200|         16.977142|9.985040951285156E-7|
|2011-10-25 00:00:00| 74.899999|         79.390001| 74.249997|        77.370002|315541800|11.052857000000001|2.515989989281927E-7|
|2011-10-26 00:00:00|     78.73|         81.420001| 75.399997|        79.400002|148733900|         11.342857|5.474206014903126E-7|
|2011-10-27 00:00:00| 82.179998| 82.71999699999999| 79.249998|80.86000200000001| 71190000|11.551428999999999|1.161960907430818...|
|2011-10-28 00:00:00| 80.280002|         84.660002| 79.599999|84.14000300000001| 57769600|             12.02|1.465476686700271...|
+-------------------+----------+------------------+----------+-----------------+---------+------------------+--------------------+
```

8. Which day had the highest peak in the “Close” column?

>As in question 5 we tell it which columns we want, then we sort them by descendant and together with "show()" we only show the first row of values
```scala 
dataframe.select("Date", "Close").orderBy(desc("Close")).show(1)

+-------------------+----------+
|               Date|     Close|
+-------------------+----------+
|2015-07-13 00:00:00|707.610001|
+-------------------+----------+
```

 9. Write in your own words in a comment of your code. Which is the meaning of the Close column “Close”?

>It refers to how  Netflix ends the day with its finances taking into 
account its High and lows

10. What is the maximum and minimum of the “Volume” column?

The extraction of the data from a specific column of the dataframe was saved in a variable named maxVolume, which in this case was Volume, from which, through the Map, max and min functions, the requested values ​​were extracted.
```scala 
val maxVolume = dataframe.agg(Map("Volume" -> "max"))
maxVolume: org.apache.spark.sql.DataFrame = [max(Volume): int]

maxVolume.show()
+-----------+
|max(Volume)|
+-----------+
|  315541800|
+-----------+
val minVolume = dataframe.agg(Map("Volume" -> "min"))
minVolume: org.apache.spark.sql.DataFrame = [min(Volume): int]

minVolume.show()
+-----------+
|min(Volume)|
+-----------+
|    3531300|
+-----------+
```
11. With Syntax Scala / Spark $ answer the following:
◦ Hint: Basically very similar to the dates session, you will have to create another
dataframe to answer some of the items.

```scala 
val df3=dataframe
df3: org.apache.spark.sql.DataFrame = [Date: timestamp, Open: double ... 5 more fields
``` 

- a) How many days was the “Close” column less than $ 600? 

>In a variable, the value of our filtered dataframe is assigned based on the close column with the filter function, highlighting that it counts the values ​​below 600 that exist in the column.

```scala 
val infcl = df3.filter($"Close" < 600 ).count()
infcl: Long = 1218
``` 

- b) What percentage of the time was the “High” column greater than $ 500?

>For the solution of this point, we used exactly the same filter as above, but using High as the selected column and this time highlighting the quantities greater than 500, to in turn count them and save them in the variable "dfpercentage".
In the next part of the result variable, the corresponding operation was carried out to obtain the requested percentage, which resulted in 4%.

```scala 
 val dfporcentaje = df3.filter($"High" > 500).count()
dfporcentaje: Long = 62

 val resultado: Double  = (dfporcentaje*100)/(dataframe.count)
resultado: Double = 4.0
``` 

- c) What is the Pearson correlation between column "High" and column "Volume"?

>In this case it was simple because in scala we found a variety of very useful functions, in this case we have "corr" that allowed us to easily obtain the result by just comparing both columns and showing them with .show.

```scala 
df3.select(corr($"High", $"Volume")).show()
+--------------------+
|  corr(High, Volume)|
+--------------------+
|-0.20960233287942157|
+--------------------+
``` 

- d) What is the maximum in the “High” column per year?

>To obtain the following, we obviously need to group our dataframe by year, which was done with the groupby function and its grouping specifications were the year that was extracted directly from the date column of our dataframe. later for the year we only need ".max" on the High column to obtain the maximum value for each year in that column.
```scala 
df3.groupBy(year(df3("Date"))).max("High").show()
+----------+------------------+                                                 
|year(Date)|         max(High)|
+----------+------------------+
|      2015|        716.159996|
|      2013|        389.159988|
|      2014|        489.290024|
|      2012|        133.429996|
|      2016|129.28999299999998|
|      2011|120.28000300000001|
+----------+------------------+
``` 

- e) What is the “Close” column average for each calendar month?

>In the last point, something very similar to the previous one was done, but this time in the grouping part, the month was extracted from the Date column of our dataframe and the .avg function was used to obtain the average per month of the close column
```scala 
val clavg=df3.groupBy(month(dataframe("Date"))).avg("Close")
clavg.show
+-----------+------------------+                                                
|month(Date)|        avg(Close)|
+-----------+------------------+
|         12| 199.3700942358491|
|          1|212.22613874257422|
|          6| 295.1597153490566|
|          3| 249.5825228971963|
|          5|264.37037614150944|
|          9|206.09598121568627|
|          4|246.97514271428562|
|          8|195.25599892727263|
|          7|243.64747528037387|
|         10|205.93297300900903|
|         11| 194.3172275445545|
|          2| 254.1954634020619|
+-----------+------------------+
``` 