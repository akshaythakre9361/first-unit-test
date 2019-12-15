package org.webcorestone

import org.junit.Test

class MyTest extends SparkSharedContext {

  @Test def myFirstTest {

    val wc = new WordCount

    val result = wc.get("C:/Users/Akshay/Downloads/dump_data/file.txt", sc)

    val mockRdd = sc.parallelize(Array(("Hello", 2), ("Hey", 2), ("Hi", 2)))

    assert(result.collect().mkString == mockRdd.collect.mkString)

  }
}