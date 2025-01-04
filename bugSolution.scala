```scala
import scala.util.Try

class MyClass(val value: Int) {
  def getValue: Int = {
    // Simulate an error condition
    if (value < 0) throw new IllegalArgumentException("Value cannot be negative")
    value
  }
}

object Main extends App {
  val myInstance = new MyClass(-5)

  val result = Try(myInstance.getValue)

  result match {
    case scala.util.Success(value) => println(s"Value: $value")
    case scala.util.Failure(exception) => {
      println(s"Error: ${exception.getMessage}")
      // Add more robust error handling here like logging or retry mechanisms
    }
  }
  
  //Alternative using getOrElse
  val safeValue = Try(myInstance.getValue).getOrElse(0) //default value if error
  println(s"Safe Value: $safeValue")
}
```