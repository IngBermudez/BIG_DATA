
import org.apache.spark.sql.SparkSession
import org.apache.spark.mllib.evaluation.MulticlassMetrics
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorIndexer
import org.apache.spark.ml.feature.VectorAssembler

import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

val spark = SparkSession.builder.getOrCreate()

val dataframe  = spark.read.option("header","true").option("inferSchema", "true").option("delimiter",";").format("csv").load("C:/Users/the_g/Documents/Github/BIG_DATA/Final_Project/bank-full.csv")

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("indexedLabel").fit(dataframe)
val indexed = labelIndexer.transform(dataframe).drop("y").withColumnRenamed("indexedLabel", "label")

val vectorFeatures = (new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features"))

val features = vectorFeatures.transform(indexed)

val featuresLabel = features.withColumnRenamed("y", "label")

val dataIndexed = featuresLabel.select("label","features")

val labelIndexer = new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(dataIndexed)
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(dataIndexed)
    for(a<-1 until 30)
    {
    var a=0
val Array(training, test) = dataIndexed.randomSplit(Array(0.7, 0.3))
//Linear Support Vector Machine object.
val time = System.nanoTime
val supportVM = new LinearSVC().setMaxIter(10).setRegParam(0.1)
val model = supportVM.fit(training)
val predictions = model.transform(test)
val predictionAndLabels = predictions.select($"prediction",$"label").as[(Double, Double)].rdd
val metrics = new MulticlassMetrics(predictionAndLabels)
println("Accuracy: " + metrics.accuracy) 

// Printing time and duration of the algorithm
val duration = (System.nanoTime - time) / 1e9d
println("Tiempo de ejecucion: " + duration)
    }