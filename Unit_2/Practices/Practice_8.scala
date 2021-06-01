import org.apache.spark.ml.classification.NaiveBayes
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.sql.SparkSession

val data =spark.read.format("libsvm").load("C:/Users/the_g/Documents/GitHub/BIG_DATA/Unit_2/Practices/sample_libsvm_data.txt")

println ("Numero de lineas en el archivo de datos:" + data.count ())

data.show()

val Array (trainingData, testData) = data.randomSplit (Array (0.7, 0.3), 100L) // El resultado es el tipo de matriz, y la matriz almacena los datos del tipo DataSet

val naiveBayesModel = new NaiveBayes().fit(trainingData)

val predictions = naiveBayesModel.transform(testData)

predictions.show()
 
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("label").setPredictionCol("prediction").setMetricName("accuracy")

val precision = evaluator.evaluate (predictions)

println ("tasa de error =" + (1-precision))