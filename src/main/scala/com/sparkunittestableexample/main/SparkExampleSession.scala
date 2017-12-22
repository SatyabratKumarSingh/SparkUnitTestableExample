package com.sparkunittestableexample.main
import org.apache.spark.sql.SparkSession


trait SparkExampleSession {
  lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .master("local")
      .appName("Spark Example for Unit tests")
      .getOrCreate()
  }
}
