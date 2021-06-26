
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.log4j._

Logger.getLogger("org").setLevel(Level.ERROR)

val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("C:/Users/the_g/Documents/Github/BIG_DATA/Final_Project/bank-full.csv")

val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)

val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)

val training = data2.select("features", "label")
    for(a<-1 until 30)
    {
    var a=0
val splits = training.randomSplit(Array(0.7, 0.3), seed = 1234L)
val train = splits(0)
val test = splits(1)
println("training set =",train.count())
println("test set =",test.count())

val time = System.nanoTime
val layers = Array [Int] (5, 3, 3, 2)
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

val modelML = trainer.fit(train)
val result = modelML.transform (test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
val duration = (System.nanoTime - time) / 1e9d
println("Tiempo de ejecucion: " + duration)
    }