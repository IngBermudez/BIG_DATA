// Load Machine Learning Libraries
import org.apache.spark.ml.classification.LinearSVC
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.PipelineStage
import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors

// Load the csv file
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/Users/the_g/Documents/Github/BIG_DATA/Final_Project/bank-full.csv")

// choose the columns
val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val lblTrans = label.fit(data).transform(data)

// Create a  VectorAssembler with  data from the array
val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")

// Transform the data and save into a variable
val data2 = assembler.transform(lblTrans)

val training = data2.select("features", "label")

// Creating a new lsvc model
val lsvc = new LinearSVC().setMaxIter(10).setRegParam(0.1)
// Training the model
val model = lsvc.fit(training)

println(s"Coefficients: ${model.coefficients} Intercept: ${model.intercept}")

// Printing time and duration of the algorithm
val time = System.nanoTime
val duration = (System.nanoTime - time) / 1e9d
println("Tiempo de ejecucion: " + duration)