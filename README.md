# BIG_DATA


**Content**

Table of contents
- [Unit 1](#unit-1)
    - [Practices](#practices-1-1)
        - [Practice 1](#practice-1)
        - [Practice 2](#practice-2)
        - [Practice 3](#practice-3)
    - [Investigation](#investigation)
        - [Pair Coding](#pair-coding)
        - [Pair Coding 2](#pair-coding-2)
    - [Evaluative Practice](#evaluative-practice)

- [Unit 2](#unit-2)
    - [Practices](#practices-1-1)
        - [Practice 1](#practice-1-1)
        - [Practice 2](#practice-2-1)
        - [Practice 3](#practice-3-1)
        - [Practice 4](#practice-4-1)
        - [Practice 5](#practice-5-1)
  - [Evaluative Practice](#evaluative-practice-1)
  
- [Unit 3](#unit-3)
  - [Evaluative Practice](#evaluative-practice-2)
  
- [Unit 4](#unit-4)


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


# Unit 2
## Practices 
---
## Practice 1

1. Correlation

>We start with this 3 librarys to have access to local arrays and Factory Methods for Vector, to use the correlation method and to allow a row value to be accessed through generic ordinal access, as well as primitive access

```scala
import org.apache.spark.ml.linalg.{Matrix, Vectors}
import org.apache.spark.ml.stat.Correlation
import org.apache.spark.sql.Row
```

>Create dense and sparse vectors from their values, within the matrix
```scala
val data = Seq(
   (4, Seq((0, 1.0), (3, -2.0))),
  Vectors.dense(4.0, 5.0, 0.0, 3.0),
  Vectors.dense(6.0, 7.0, 0.0, 8.0),
  Vectors.sparse(4, Seq((0, 9.0), (3, 1.0)))
)
```
>The data is extracted from our matrix and a dataframe is created regarding the characteristics, then The Pearson correlation matrix is created using the data frame and we ask for the first values with head. To end  we print the result
```scala
val df = data.map(Tuple1.apply).toDF("features")
val Row(coeff1: Matrix) = Correlation.corr(df, "features").head
println(s"Pearson correlation matrix:\n $coeff1")
```

>The Spearman correlation matrix is created using the dataframe that we just created then we ask for the first values with head and  we print the result
```scala
val Row(coeff2: Matrix) = Correlation.corr(df, "features", "spearman").head
println(s"Spearman correlation matrix:\n $coeff2")
```


2. Hypothesis testing

>the following librarys is used to apply methods to vectors  and The chiSquare library is also used to perform the necessary calculations
```scala
import org.apache.spark.ml.linalg.{Vector, Vectors}
import org.apache.spark.ml.stat.ChiSquareTest
``` 

>the following sequence of dense vectors is created
```scala
val data = Seq(
  (0.0, Vectors.dense(0.5, 10.0)),
  (0.0, Vectors.dense(1.5, 20.0)),
  (1.0, Vectors.dense(1.5, 30.0)),
  (0.0, Vectors.dense(3.5, 30.0)),
  (0.0, Vectors.dense(3.5, 40.0)),
  (1.0, Vectors.dense(3.5, 40.0))
)
```

>Creation of the dataframe from the previous set of vectors then the first values  are taken, and last we Initially with the parts of the test, the values of p will be searched
```scala
val df = data.toDF("label", "features")
val chi = ChiSquareTest.test(df, "features", "label").head
println(s"pValues = ${chi.getAs[Vector](0)}")
``` 

>After the model's degrees of freedom will be searched
```scala
println(s"degreesOfFreedom ${chi.getSeq[Int](1).mkString("[", ",", "]")}")
```
>finally certain values are extracted from a given vector all based on the chi square function
```scala
println(s"statistics ${chi.getAs[Vector](2)}")
```

3. Summarizer

>import of necessary libraries, in this use of vectors and the summarizer itself
```scala
import spark.implicits._    
import Summarizer._
```
>create a set of vectors or sequence
```scala
val data = Seq(
  (Vectors.dense(2.0, 3.0, 5.0), 1.0),
  (Vectors.dense(4.0, 6.0, 7.0), 2.0)
)
```

>Creation of the dataframe from the vectors
```scala
val df = data.toDF("features", "weight")
```

>use the summarizer library to obtain the mean and variance of some data in the requested dataframe
```scala
val (meanVal, varianceVal) = df.select(metrics("mean", "variance").summary($"features", $"weight").as("summary")).select("summary.mean", "summary.variance").as[(Vector, Vector)].first()
```

>the variables previously worked on are printed
```scala
println(s"with weight: mean = ${meanVal}, variance = ${varianceVal}")
```

>the process is repeated with 2 new variables
```scala
val (meanVal2, varianceVal2) = df.select(mean($"features"), variance($"features"))
  .as[(Vector, Vector)].first()
```

>variable printing 
```scala
println(s"without weight: mean = ${meanVal2}, sum = ${varianceVal2}")
```


## Practice 2
> Importing this libraries is required in order to get the example done.
```scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
```
> Start a simple spark session
```scala
import org.apache.spark.sql.SparkSession
```
>val spark = SparkSession.builder().getOrCreate()
```scala
object DecisionTree {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder
      .appName("dtree")
      .getOrCreate()
```

> Load the data stored in LIBSVM format as a DataFrame.
```scala
val data = spark.read.format("libsvm").load("C:/sample_libsvm_data.txt")
```
> Index labels, adding metadata to the label column.
 Fit on whole dataset to include all labels into the index.
 ```scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
```
> Automatically identify categorical features and then index them.
```scala
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```scala
> Split the data into training and test sets (30% held out for testing).
```scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
> Train a DecisionTree model.
```scala
val dt = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")
```

> Convert indexed labels back to original labels.
```scala
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
```
> Chain indexers and tree in a Pipeline.
```scala
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, dt, labelConverter))
```
> Train the model, this also runs the indexers.
```scala
val model = pipeline.fit(trainingData)
```

> Make the predictions.
```scala
val predictions = model.transform(testData)
```
> Select example rows to display. In this case there was only 5 rows to show.
 Select (prediction, true label)

 ```scala
predictions.select("predictedLabel", "label", "features").show(5)
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
```
> Compute the test error.
 Show by stages the classification of the tree model
 ```scala
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")
val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"Learned classification tree model:\n ${treeModel.toDebugString}")


  }
}
```
> Preview of the last lines output
```Scala
/*  +--------------+-----+--------------------+
    |predictedLabel|label|            features|
    +--------------+-----+--------------------+
    |           1.0|  0.0|(692,[122,123,124...|
    |           0.0|  0.0|(692,[122,123,148...|
    |           0.0|  0.0|(692,[123,124,125...|
    |           1.0|  0.0|(692,[124,125,126...|
    |           0.0|  0.0|(692,[126,127,128...|
    |           0.0|  0.0|(692,[126,127,128...|
    |           0.0|  0.0|(692,[126,127,128...|
    |           0.0|  0.0|(692,[127,128,129...|
    |           1.0|  0.0|(692,[129,130,131...|
    |           0.0|  0.0|(692,[152,153,154...|
    +--------------+-----+--------------------+
    only showing top 10 rows
  
  */
```
## Practice 3

```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{RandomForestClassificationModel, RandomForestClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
import org.apache.spark.sql.SparkSession
```
>We create a variable to start a spark session
```Scala
val spark = SparkSession.builder.appName("RandomForestClassifierExample").getOrCreate()
```
> Load and parse the data file, converting it to a DataFrame.
```Scala
val data = spark.read.format("libsvm").option("numFeatures", "780").load("C:/sample_libsvm_data.txt")
```
> Index labels, adding metadata to the label column.
> Fit on whole dataset to include all labels in index.
```Scala
val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
```
> Automatically identify categorical features, and index them.
> Set maxCategories so features with > 4 distinct values are treated as continuous.
```Scala
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(data)
```
> Split the data into training and test sets (30% held out for testing).
```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
> Train a RandomForest model.
```Scala
val rf = new RandomForestClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setNumTrees(10)
```
> Convert indexed labels back to original labels.
```Scala
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
```
> Chain indexers and forest in a Pipeline.
```Scala
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, rf, labelConverter))
```
> Train model. This also runs the indexers.
```Scala
val model = pipeline.fit(trainingData)
```
> Make predictions.
```Scala
val predictions = model.transform(testData)
```
> Select example rows to display.
```Scala
predictions.select("predictedLabel", "label", "features").show(5)
```
> Select (prediction, true label) and compute test error.
```Scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${(1.0 - accuracy)}")
val rfModel = model.stages(2).asInstanceOf[RandomForestClassificationModel]
println(s"Learned classification forest model:\n ${rfModel.toDebugString}")
```

## Practice 4

> We import the libraries we occupy
```Scala
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{GBTClassificationModel, GBTClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorIndexer}
```
> We load the txt file of the established path
```Scala
val data = spark.read.format("libsvm").load("sample_libsvm_data.txt")
```

> We will create a column using stringIndexer so that the data has its categorization
```Scala
val labelIndexer = new StringIndexer()
  .setInputCol("label")
  .setOutputCol("indexedLabel")
  .fit(data)
```  
> We create a vector that will have a maximum of 4 categories
```Scala
val featureIndexer = new VectorIndexer()
  .setInputCol("features")
  .setOutputCol("indexedFeatures")
  .setMaxCategories(4)
  .fit(data)
```
> We separate the data into two parts, one called training with 70% and the other mushroom test with 30%
```Scala
val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))
```
> They enter the GPT model
```Scala
val gbt = new GBTClassifier()
  .setLabelCol("indexedLabel")
  .setFeaturesCol("indexedFeatures")
  .setMaxIter(10)
  .setFeatureSubsetStrategy("auto")
```
> We convert indented labels to original labels
```Scala
val labelConverter = new IndexToString()
  .setInputCol("prediction")
  .setOutputCol("predictedLabel")
  .setLabels(labelIndexer.labels)
```
> The Chain of Indenters and GPT EN Pipeline
```Scala
val pipeline = new Pipeline()
  .setStages(Array(labelIndexer, featureIndexer, gbt, labelConverter))
```
> The model is trained. This also runs the indexers
```Scala
val model = pipeline.fit(trainingData)
```
> We create the predictions.
```Scala
val predictions = model.transform(testData)
```
> We select the first 5 rows to display them
```Scala
predictions.select("predictedLabel", "label", "features").show(5)
```
> We select prediction and calculation of the test error.
```Scala
val evaluator = new MulticlassClassificationEvaluator()
  .setLabelCol("indexedLabel")
  .setPredictionCol("prediction")
  .setMetricName("accuracy")
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${1.0 - accuracy}")

val gbtModel = model.stages(2).asInstanceOf[GBTClassificationModel]
println(s"Learned classification GBT model:\n ${gbtModel.toDebugString}")
```

## Practice 5

```scala
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
``` 

> Load the data stored in LIBSVM format as a DataFrame.
```Scala
val data = spark.read.format("libsvm").load("sample_multiclass_classification_data.txt")
```
> Split the data into train and test
```Scala
val splits = data.randomSplit(Array(0.6, 0.4), seed = 1234L)
val train = splits(0)
val test = splits(1)
```
> specify layers for the neural network:
 input layer of size 4 (features), two intermediate of size 5 and 4
 and output of size 3 (classes)
 ```Scala
val layers = Array[Int](4, 5, 4, 3)
```
> create the trainer and set its parameters
```Scala
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
```

> train the model
```Scala
val model = trainer.fit(train)
```
> compute accuracy on the test set
```Scala
val result = model.transform(test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
```

## Practice 6


>We import the "LinearSVC" library, this binary classifier optimizes the hinge loss using the OWLQN optimizer.
```scala
import org.apache.spark.ml.classification.LinearSVC
```

>We import and create the session in spark.
```scala
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder.appName("LinearSVCExample").getOrCreate()
```
>We load the training data.
```scala
val training = spark.read.format("libsvm").load("/Archivos/sample_libsvm_data.txt")
```

>We set the maximum number of iterations and the regularization parameter.
```scala
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
```

>We carry out a fit to adjust the model.
```scala
val lsvcModel = lsvc.fit(training)
```

>Print the coefficients and intercept for the Linear SVC.
```scala
println(s"Coefficients: ${lsvcModel.coefficients} Intercept: ${lsvcModel.intercept}")
```


## Practice 7

>Import Libraries
```scala
import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
```

>Load the file
```scala
val inputData = spark.read.format("libsvm").load("sample_multiclass_classification_data.txt")
```

>Generate the division of the train and test set.
```scala
val Array(train, test) = inputData.randomSplit(Array(0.8, 0.2))
```

>Instantiate the base classifier
```scala
val classifier = new LogisticRegression().setMaxIter(10).setTol(1E-6).setFitIntercept(true)
```

>An instance of the One Vs Rest classifier is created.
```scala
val ovr = new OneVsRest().setClassifier(classifier)
```

>Train the multiclass model.
```scala
val ovrModel = ovr.fit(train)
```

>The model is scored on the test data (test).
```scala
val predictions = ovrModel.transform(test)
```

>The evaluator is obtained
```scala
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
```

>The classification error is calculated on the test data.
```scala
val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${1 - accuracy}")
```


## Practice 8


```scala
import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.sql.SparkSession
```

>Load data in LIBSVM storage format as a DataFrame.
```scala
val data = spark.read.format("libsvm").load("C:/Users/brise/Documents/GitHub/NaiveBayes/sample_libsvm_data.txt")
println ("Numero de lineas en el archivo de datos:" + data.count ())
```

>Show 20 lines by default
```scala
data.show()
```

>Randomly divide the data set into training set and test set according to the given weights. You can also specify a seed
```scala
val Array (trainingData, testData) = data.randomSplit (Array (0.7, 0.3), 100L) 
```

>Incorporate into training set (fit operation) to train a Bayesian model
```scala
val naiveBayesModel = new NaiveBayes().fit(trainingData)
```

>The model calls transform () to make predictions and generate a new DataFrame
```scala
val predictions = naiveBayesModel.transform(testData)
```

>Output data from prediction results
```scala
predictions.show()
 ```

 >Accuracy evaluation of the model
```scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")
val precision = evaluator.evaluate (predictions)
println ("tasa de error =" + (1-precision))
```

## Evaluative practice

1. Upload to an Iris.csv dataframe found at https://github.com/jcromerohdz/iris, build the data clean
necessary to be processed by the following algorithm (Important, this cleaning must be
via a Scala script in Spark).

>we find a large number of libraries, from vector control to conversion of categorical data to numeric with StringIndexer
```Scala
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.
```
a. Use the Spark Mllib library the Machine Learning algorithm corresponding to multilayer perceptron
```scala
MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
```


>  Loading the data from Iris.csv into a dataframe and transformation.
```scala
val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("C:/iris.csv")
```
>We create the data variable that with a spark.read will obtain all the data from a csv file called iris, this dataframe needs to be transformed into the form "label" and "features"

```scala
val label = new StringIndexer().setInputCol("species").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
```
>The label variable will be a StringIndexer, what this method does is take the string values of a column and then transform them into numerical values



```Scala
val Features = (new VectorAssembler().setInputCols(Array ("sepal_length", "sepal_width", "petal_length", "petal_width")).setOutputCol("features"))
val data2 = vectorFeatures.transform (labeltransform)
```
 > there are 4 columns, for this the Features column will be a newAssembler vector, this method is in charge of transforming several columns to convert them into a vector. In setInputCols we create an array with all the columns and in setOutputcol is the name of the column that will contain the vectors, which will be features. 

> Knowing the dataframe

2. What are the names of the columns?
```scala
data2.columns
   // Output -> Array[String] = Array(sepal_length, sepal_width, petal_length, petal_width, species, label, features)
```
>We print the columns of data 2, the response is an array containing sepal_lenght, sepal_width, petal_lenght, petal width, species, label and features

3. What is the scheme like?
```scala   
data2.schema
// Output res3: org.apache.spark.sql.types.StructType = StructType(StructField(sepal_length,DoubleType,true), StructField(sepal_width,DoubleType,true), StructField(petal_length,DoubleType,true), 
//StructField(petal_width,DoubleType,true), StructField(species,StringType,true), StructField(label,DoubleType,false), 
//StructField(features,org.apache.spark.ml.linalg.VectorUDT@3bfc3ba7,true))
```
>Then printing the schema we know the type of data that our dataframe has, the first 4 columns are of type Double and true, in species it marks that it is string, while label is Double and features is a vector.

4. Print the first 5 columns.
```scala
data2.show(5)
/*
+------------+-----------+------------+-----------+-------+-----+-----------------+
|sepal_length|sepal_width|petal_length|petal_width|species|label|         features|
+------------+-----------+------------+-----------+-------+-----+-----------------+
|         5.1|        3.5|         1.4|        0.2| setosa|  0.0|[5.1,3.5,1.4,0.2]|
|         4.9|        3.0|         1.4|        0.2| setosa|  0.0|[4.9,3.0,1.4,0.2]|
|         4.7|        3.2|         1.3|        0.2| setosa|  0.0|[4.7,3.2,1.3,0.2]|
|         4.6|        3.1|         1.5|        0.2| setosa|  0.0|[4.6,3.1,1.5,0.2]|
|         5.0|        3.6|         1.4|        0.2| setosa|  0.0|[5.0,3.6,1.4,0.2]|
+------------+-----------+------------+-----------+-------+-----+-----------------+
*/
```
>We print the first 5 rows of Data2

5. Use the describe method to learn more about the data

>As we already know, it describes shows us the information of the metadata. With this form we can see that it is not possible to visualize all the information, instead we add the show () function and we can see the complete data

```scala
data2.describe()

Output -> res6: org.apache.spark.sql.DataFrame = [summary: string, sepal_length: string ... 5 more fields]
```
```scala
 data2.describe().show()
+-------+------------------+-------------------+------------------+------------------+---------+------------------+
|summary|      sepal_length|        sepal_width|      petal_length|       petal_width|  species|             label|
+-------+------------------+-------------------+------------------+------------------+---------+------------------+
|  count|               150|                150|               150|               150|      150|               150|
|   mean| 5.843333333333335| 3.0540000000000007|3.7586666666666693|1.1986666666666672|     null|               1.0|
| stddev|0.8280661279778637|0.43359431136217375| 1.764420419952262|0.7631607417008414|     null|0.8192319205190403|
|    min|               4.3|                2.0|               1.0|               0.1|   setosa|               0.0|
|    max|               7.9|                4.4|               6.9|               2.5|virginica|               2.0|
+-------+------------------+-------------------+------------------+------------------+---------+------------------+
```


6. Make the pertinent transformation for the categorical data which will be our labels to be classified

>We make a new dataframe by selecting the features and label columns of data2. We separate the information in a percentage of 70 and 30 with a seed of randomness, then we separate that information into the training and testing variables
```scala
val data3 = data2.select("features", "label")
data3.show()

+-----------------+-----+
|         features|label|
+-----------------+-----+
|[5.1,3.5,1.4,0.2]|  2.0|
|[4.9,3.0,1.4,0.2]|  2.0|
|[4.7,3.2,1.3,0.2]|  2.0|
|[4.6,3.1,1.5,0.2]|  2.0|
|[5.0,3.6,1.4,0.2]|  2.0|
|[5.4,3.9,1.7,0.4]|  2.0|
|[4.6,3.4,1.4,0.3]|  2.0|
|[5.0,3.4,1.5,0.2]|  2.0|
|[4.4,2.9,1.4,0.2]|  2.0|
|[4.9,3.1,1.5,0.1]|  2.0|
|[5.4,3.7,1.5,0.2]|  2.0|
|[4.8,3.4,1.6,0.2]|  2.0|
|[4.8,3.0,1.4,0.1]|  2.0|
|[4.3,3.0,1.1,0.1]|  2.0|
|[5.8,4.0,1.2,0.2]|  2.0|
|[5.7,4.4,1.5,0.4]|  2.0|
|[5.4,3.9,1.3,0.4]|  2.0|
|[5.1,3.5,1.4,0.3]|  2.0|
|[5.7,3.8,1.7,0.3]|  2.0|
|[5.1,3.8,1.5,0.3]|  2.0|
+-----------------+-----+

val splits = data3.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = splits(0)
val test = splits(1)
```

7. build the classification model and explain its architecture

>We specify the layers of the neural network of our model, it will have an input of 4 characteristics, 2 hidden layers of 5 and 4 and an output of 3. Then we create the training variable with the multilayerperceptronClassifier and set all the necessary parameters.
```scala
val layers = Array[Int](4, 5, 4, 3)

val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)
```

>Within the new model value we add the trainer adjusting it to the training values that we separated a while ago. then we grab the values of the model to transform them into a mutable map. Finally we evaluate the model for its prediction performance
```scala
val model = trainer.fit(train)
val result = model.transform(test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
```

8. print the model results

>The precision value of the model is printed
```scala
println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
Test set accuracy = 0.95
```


# Unit 3
---
## Evaluative practice


1. Import a simple Spark session.

>The library is imported to perform the spark session
```scala
import org.apache.spark.sql.SparkSession
```

2. Use lines of code to minimize errors

>The Log4j library serves to minimize the severity of some errors. level.ERROR allows us to minimize various runtime errors or unexpected conditions. making them immediately visible in a status console.
```scala
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)
```

3. Create an instance of the Spark session

>We create a variable to get an existing SparkSession or, if none exists, create a new one based on the options set in this constructor
```scala
val spark = SparkSession.builder().getOrCreate()
```


4. Import the Kmeans library for the clustering algorithm

>The library that allows us to work with the kmeans grouping algorithm is imported
```scala
import org.apache.spark.ml.clustering.KMeans
```

5. Loads the Wholesale Customers Data dataset

>For the dataset we make it load it into a variable. We add the functions we want, in this case we will use the "inferschema" option that will help us later, it is by default false.
```scala
val dataset = spark.read.option("header","true").option("inferSchema","true").csv("C:/Users/the_g/Documents/Github/BIG_DATA/Unit_3/Evaluative_Practice/Wholesale customers data.csv")
```


6. Select the following columns: Fresh, Milk, Grocery, Frozen, Detergents_Paper, Delicassen and call this set feature_data

>Within a constant we make a dataset based on the characteristics in this case the Fresh, Milk, Grocery, Frozen, Detergents_Paper, Delicassen columns of our original dataset
```scala
val feature_data = dataset.select("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")
```

7. Import Vector Assembler and Vector
>The libraries for vector groupings, VectorAssembler and Vector are imported

```Scala
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
```

8. Create a new Vector Assembler object for the feature columns as an input set, remembering that there are no labels
>An object is created in which the columns of the feature_data dataset are grouped in an array and named Features
```Scala
val VectorA = new VectorAssembler().setInputCols (Array ("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")). setOutputCol ("features")
```


9. Use the assembler object to transform feature_data
>A variable is created where the transformation of the VectorAssembler is performed to see it in a readable way
```Scala
val output= VectorA.transform(feature_data)
```

10.  Create a Kmeans model with K = 3
> The kmeans object is created to place the cluster number k = 3 and the seed 1L. The model for the kmeans object is created with the data from the output dataset which is our already normalized vector
```Scala
val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(output)
```
# Unit 4 final project


# Theoretical framework

## Logistic Regression
Logistic regression is a popular method for predicting a categorical response. It is a special case of generalized linear models that predicts the probability of the results. In spark.ml, logistic regression can be used to predict a binary outcome by using binomial logistic regression, or it can be used to predict a multiclass outcome by using multinomial logistic regression. Use the family parameter to select between these two algorithms, or leave it unconfigured and Spark will deduce the correct variant.


## Multilayer Perceptron
Multilayer perceptron classifier (MLPC) is a classifier based on the feedforward artificial neural network. MLPC consists of multiple layers of nodes. Each layer is fully connected to the next layer in the network. Nodes in the input layer represent the input data. All other nodes map inputs to outputs by a linear combination of the inputs with the node’s weights w and bias b and applying an activation function.


# Implementación 
It was decided to use the spark language for this project due to its great versatility when it comes to manipulating large amounts of data, managing to analyze them in a fairly good time. Spark provides APIs for Python, Java and Scala, we chose Scala because it is a functional language that allows us to implement the MapReduce paradigm easily and quickly. Scala works in the JVM, which allows us to have the multiple libraries created for Java. Visual studio code was also used as a viewer as a code editor since it allows us to open several terminal instances, as well as its integration with gitHub, which allows us to work in pairs. The operating system used was windows, which was for convenience, since we would not have to start a virtual machine with linux to be able to work, which did not save much time and speeds up the process.

# Results
## Logistic Regression
With this algorithm, we were able to achieve a degree of accuracy of 88.7% in general.
The tests carried out in this case were a total of 20, which produced exactly the same result. a supposed scenario where it would change would be to run the code on a second machine.
>Coefficients
```Scala
Coefficients: [2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]
```
>Interceptions
```Scala
scala> println(s"Intercepciones: ${model.intercept}")
Intercepciones: -2.696757175407947
```
>Degree of accuracy
```Scala
scala> println(s"Grado de exactitud = ${evaluador.evaluate(resultados)}")
Grado de exactitud = 0.8871120157010977 
```
| Coefficients | Interceptions | Degree of accuracy |
| -- | -- | -- |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |
|[2.6075947650098506E-5,-0.0036213550908734578,0.0019938415466320835,0.00134932187930364,0.04008022407390256]| -2.696757175407947 | 0.8871120157010977 |


## Multilayer Perceptron
In the same way as in the previous algorithm, 30 scala code tests were carried out, unfortunately the comparison turned out to have zero variation between results, resulting in a precision of 88.2% in any case.
And like the previous case, the result is expected to change depending on the machine where the code is executed by no more than 1 or 2%.
```Scala
Test set accuracy
 0.8828888399088972 
```


# Conclusions
The different algorithms that we review tend to vary very little, this could be for different reasons such as: the system in which it was tested, the amount of data selected, the types of data selected, even the capacity of the algorithm generated based on our knowledge.
As a general knowledge we can conclude that these algorithms work stably even in the presence of a very large amount of data. And in particular the language chosen for this means that everything is carried in a lighter and more comfortable way for our machine, in this case Scala.

11.  Evaluate groups using Within Set Sum of Squared Errors WSSSE and print centroids.
>The WSSE variable is created where we show the sum of the squared distances of the points to their closest center for the data output model and we print this value. The centroids of the clusters are printed taking into account the model and the centroids that were generated with a foreach
```Scala
val WSSE = model.computeCost(output)
println(s"Within set sum of Squared Errors = $WSSE")

println("Cluster Centers: ")
model.clusterCenters.foreach(println)
```

# Unit 4
---

[Final Project](https://github.com/IngBermudez/BIG_DATA/tree/Final_Project/Final_Project#readme)
