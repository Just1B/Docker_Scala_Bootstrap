import sbt._

object Version {
  final val Scala           = "2.12.8"
  final val ScalaTest       = "3.0.5"
}

object Library {
  val scalaTest      = "org.scalatest"  %% "scalatest"        % Version.ScalaTest
}