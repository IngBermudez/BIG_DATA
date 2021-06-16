//Evaluative Practice Unit 3

//1. Import a simple Spark session.
import org.apache.spark.sql.SparkSession

//2. Use lines of code to minimize errors
import org.apache.log4j._
Logger.getLogger("org").setLevel(Level.ERROR)

//3. Create an instance of the Spark session
val spark = SparkSession.builder().getOrCreate()

//4. Import the Kmeans library for the clustering algorithm
import org.apache.spark.ml.clustering.KMeans

//5. Loads the Wholesale Customers Data dataset
val dataset = spark.read.option("header","true").option("inferSchema","true").csv("C:/Users/the_g/Documents/Github/BIG_DATA/Unit_3/Evaluative_Practice/Wholesale customers data.csv")

//6. Select the following columns: Fresh, Milk, Grocery, Frozen, Detergents_Paper, Delicassen and call this set feature_data
val feature_data = dataset.select("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")

//7. Import Vector Assembler and Vector
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
//8. Create a new Vector Assembler object for the feature columns as an input set, remembering that there are no labels
val VectorA = new VectorAssembler().setInputCols (Array ("Fresh", "Milk", "Grocery", "Frozen", "Detergents_Paper", "Delicassen")). setOutputCol ("features")

//9. Use the assembler object to transform feature_data
val output= VectorA.transform(feature_data)
//10. Create a Kmeans model with K = 3
val kmeans = new KMeans().setK(3).setSeed(1L)
val model = kmeans.fit(output)
//11. Evaluate groups using Within Set Sum of Squared Errors WSSSE and print centroids.
val WSSE = model.computeCost(output)
println(s"Within set sum of Squared Errors = $WSSE")

println("Cluster Centers: ")
model.clusterCenters.foreach(println)