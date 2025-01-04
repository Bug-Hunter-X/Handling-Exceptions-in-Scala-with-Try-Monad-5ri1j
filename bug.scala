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

  Try(myInstance.getValue) match {
    case scala.util.Success(value) => println(s"Value: $value")
    case scala.util.Failure(exception) => println(s"Error: ${exception.getMessage}")
  }
}
```