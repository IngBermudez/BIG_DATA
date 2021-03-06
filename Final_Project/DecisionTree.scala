// Load Machine Learning Libraries
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature.{IndexToString,StringIndexer,VectorAssembler,VectorIndexer}
import org.apache.spark.ml.classification.DecisionTreeClassificationModel
import org.apache.spark.ml.classification.DecisionTreeClassifier

// lines of code to minimize errors
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

// Load bank-full.csv.
val data = spark.read.option("header","true").option("inferSchema","true").option("delimiter",";").format("csv").load("C:/Users/the_g/Documents/Github/BIG_DATA/Final_Project/bank-full.csv")

// LabelIndexer created for using column y as index.
    for(a<-1 until 30)
    {
    var a=0

val labelIndexer = new StringIndexer().setInputCol("y").setOutputCol("indexedLabel").fit(data)

// Columns stored in a new vector.
val assembler = new VectorAssembler().setInputCols(Array("balance","day","duration","pdays","previous")).setOutputCol("features")
val features = assembler.transform(data)

// New vector index using max 4 categories.
val featureIndexer = new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(4).fit(features)

// Training and test arrays created.
val Array(traindata, testdata) = features.randomSplit(Array(0.7, 0.3))

// To create a decision tree we use the next line
val ds = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")

// New branch created for predictions
val labelConverter = new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)

// Pipeline calling the estimator.
val pipeline = new Pipeline().setStages(Array(labelIndexer, featureIndexer, ds, labelConverter))

// Training model is created
val model = pipeline.fit(traindata)

// Data transformation in the model with the test data
val predictions = model.transform(testdata)

// the Predictions are  printed
predictions.select("predictedLabel", "y", "features")
/*
//The  Tree model is generated
val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
println(s"tree model:/n ${treeModel.toDebugString}")
*/
// Accuracy calculated and geted the result.
val time = System.nanoTime
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")

val accuracy = evaluator.evaluate(predictions)

// We print the precision
println(s"Accuracy = ${(accuracy)}")

// Printing time and duration of the algorithm
val duration = (System.nanoTime - time) / 1e9d
println("Tiempo de ejecucion: " + duration)
    }


