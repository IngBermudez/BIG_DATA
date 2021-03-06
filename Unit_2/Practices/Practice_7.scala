  

import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator


val inputData = spark.read.format("libsvm")load("C:/Users/the_g/Documents/GitHub/BIG_DATA/Unit_2/Practices/sample_multiclass_classification_data.txt")


val Array(train, test) = inputData.randomSplit(Array(0.8, 0.2))

val classifier = new LogisticRegression().setMaxIter(10).setTol(1E-6).setFitIntercept(true)

val ovr = new OneVsRest().setClassifier(classifier)

val ovrModel = ovr.fit(train)

val predictions = ovrModel.transform(test)

val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${1 - accuracy}")