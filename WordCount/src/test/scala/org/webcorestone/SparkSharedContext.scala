package org.webcorestone

import org.apache.spark.sql.SparkSession

trait SparkSharedContext {

  val spark = SparkSession
    .builder()
    .master("local")
    .appName("MyTestClass")
    .getOrCreate()

  val sc = spark.sparkContext

  val sqlContext = spark.sqlContext

}