package org.webcorestone

import org.apache.spark.sql.SparkSession
import org.apache.spark.rdd.RDD
import org.apache.spark.SparkContext

class WordCount {

  def get(url: String, sc: SparkContext): RDD[(String, Int)] = {
    
    val lines = sc.textFile(url)

    lines.flatMap(_.split(" ")).map((_, 1)).reduceByKey(_ + _)
  }

}