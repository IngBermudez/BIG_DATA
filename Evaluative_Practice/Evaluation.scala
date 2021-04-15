//1.  Start a Spark session 
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2.  Upload the CSV file with Spark inferring the data types.
val dataframe = spark.read.option("header", "true").option("inferSchema","true")csv("C:/Users/the_g/Documents/Github/BigData/Spark_DataFrame/Netflix_2011_2016.csv")

//3. What are the column names?
dataframe.columns

//4. How is the scheme?
dataframe.printSchema()


 //5. Print the first 5 columns.
 dataframe.select("Date", "Open", "High", "Low", "Close").show(5)

//6. Use describe () to learn about the DataFrame.
dataframe.describe().show()

/* 7. Create a new dataframe with a new column called "HV Ratio" which is the 
relationship between the price of the column "High" versus the column "Volume" of
shares traded for one day. (Hint: It is a column operation). */
val dataframe2 = dataframe.withColumn("HV Ratio", dataframe("High")+dataframe("Volume")).show(5)


//8. Which day had the highest peak in the “Close” column?
dataframe.select("Date", "Close").orderBy(desc("Close")).show(1)

// 9. Write in your own words in a comment of your code. Which is the meaning of the Close column “Close”?
/*
It refers to how  Netflix ends the day with its finances taking into 
account its High and lows
*/
// 10. What is the maximum and minimum of the “Volume” column?

val maxVolume = dataframe.agg(Map("Volume" -> "max"))
maxVolume.show()
val minVolume = dataframe.agg(Map("Volume" -> "min"))
minVolume.show()

//11.With Scala / Spark $ syntax answer the following:
// ◦ Hint: Basically very similar to the dates session, you will have to create another
// dataframe to answer some of the items.
val df3=dataframe
df3.show()

//a. How many days was the “Close” column less than $ 600?
val infcl = df3.filter($"Close" < 600 ).count()

//b. What percentage of the time was the “High” column greater than $ 500?
val dfporcentaje = df3.filter($"High" > 500).count()
val resultado: Double  = (dfporcentaje*100)/(dataframe.count)

//c. What is the Pearson correlation between column "High" and column "Volume"?
df3.stat.corr("High", "Volume")
df3.select(corr($"High", $"Volume")).show()

//d. What is the maximum in the “High” column per year?
df3.groupBy(year(dataframe("Date"))).max("High").show()

//e. What is the “Close” column average for each calendar month?
val clavg=df3.groupBy(month(dataframe("Date"))).avg("Close")
