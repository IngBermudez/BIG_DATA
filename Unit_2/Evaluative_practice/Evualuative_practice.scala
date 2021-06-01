//Evaluative Practice Unit 2
// Multilayer Perceptron Classifier

// Hints
//- Hay que buscar la manera con scala de tranformar datos categoricosa a numericos, una vez que cargen dataframe tendran que 
//reasignar la columna de los labels para las clases de Iris.
//- De ahi pues es cuestion de ver como funciona el modelo de multilayer perceptron para que puedan dar la entrada de datos 
//de entrenamiento y los de pruebas, basicamente separar las caracteristicas en 70% de entrenamiento y 30% de prueba.

//1. Cargar en un dataframe Iris.csv que se encuentra en https://github.com/jcromerohdz/iris, elaborar la liempieza de datos 
// necesaria para ser procesado por el siguiente algoritmo (Importante, esta limpieza debe ser por medio de un script de Scala en Spark).
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

val data  = spark.read.option("header","true").option("inferSchema", "true").format("csv").load("C:/iris.csv")

val label = new StringIndexer().setInputCol("species").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)
labeltransform.show()

val Features = (new VectorAssembler (). setInputCols (Array ("sepal_length", "sepal_width", "petal_length", "petal_width")). setOutputCol ("features"))
val data2 = Features.transform (labeltransform)
data2.show()

//a. Utilice la librería Mllib de Spark el algoritmo de Machine Learning correspondiente a multilayer perceptron
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator

//2. ¿Cuáles son los nombres de las columnas?
data2.columns
   // Output -> Array[String] = Array(sepal_length, sepal_width, petal_length, petal_width, species, label, features)
   
//3. ¿Cómo es el esquema?
data2.schema
// Output res3: org.apache.spark.sql.types.StructType = StructType(StructField(sepal_length,DoubleType,true), StructField(sepal_width,DoubleType,true), StructField(petal_length,DoubleType,true), 
//StructField(petal_width,DoubleType,true), StructField(species,StringType,true), StructField(label,DoubleType,false), 
//StructField(features,org.apache.spark.ml.linalg.VectorUDT@3bfc3ba7,true))

//4. Imprime las primeras 5 columnas.
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