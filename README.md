# Handling Exceptions in Scala with Try Monad

This example showcases a common error handling pattern in Scala using the `Try` monad.  It demonstrates how to gracefully handle potential exceptions without crashing the program.

## The Bug

The original code attempts to access a value that might lead to an `IllegalArgumentException`.  If not handled appropriately, this exception would cause the program to terminate abruptly.

## The Solution

The solution employs the `Try` monad to encapsulate the potentially failing operation.  `Try` returns a `Success` if the operation succeeds and a `Failure` if it throws an exception.  This allows for more controlled error handling and prevents the program from crashing unexpectedly.
