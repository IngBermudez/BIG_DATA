import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.feature.StringIndexer
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.log4j._

Logger.getLogger("org").setLevel(Level.ERROR)

val spark = SparkSession.builder().getOrCreate()
val data  = spark.read.option("header","true").option("inferSchema","true").option("delimiter", ";").format("csv").load("bank-full.csv")

val label = new StringIndexer().setInputCol("y").setOutputCol("label")
val labeltransform = label.fit(data).transform(data)

val assembler = new VectorAssembler().setInputCols (Array ("balance", "day", "duration", "pdays", "previous")).setOutputCol("features")
val data2 = assembler.transform(labeltransform)
data2.show(1)

val training = data2.select("features", "label")
training.show(1)

    for(a<-1 until 30)
    {
    var a=0
val splits = training.randomSplit(Array(0.7, 0.3), seed = 12345)
val train = splits(0)
val test = splits(1)
println("training set = ", train.count())
println("test set = ", test.count())

val time = System.nanoTime
val lr = new  LogisticRegression().setMaxIter(10).setRegParam(0.1)
val model = lr.fit(train)
val resultados = model.transform(test)
val evaluador = new MulticlassClassificationEvaluator().setMetricName("accuracy")

println(s"Coeficientes: ${model.coefficients}")
println(s"Intercepciones: ${model.intercept}")
println(s"Grado de exactitud = ${evaluador.evaluate(resultados)}")

val duration = (System.nanoTime - time) / 1e9d
println("Tiempo de ejecucion: " + duration)
    }