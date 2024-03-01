ThisBuild / version := "0.1.0-SNAPSHOT"
scalaVersion := "3.3.1"
sbtVersion := "1.9.9"
lazy val root = (project in file("."))
  .settings(
    name := "asmd23-02-testing",
      libraryDependencies ++= Seq(
          "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
          "org.mockito" % "mockito-core" % "5.10.0" % Test)
)
