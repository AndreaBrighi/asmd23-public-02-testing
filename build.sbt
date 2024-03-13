ThisBuild / version := "0.1.0-SNAPSHOT"
lazy val root = (project in file("."))
  .settings(
    name := "asmd23-02-testing",
    libraryDependencies ++= Seq(
      "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
      "org.mockito" % "mockito-core" % "5.10.0" % Test,
      "org.scalatestplus" %% "mockito-5-10" % "3.2.18.0" % Test,
      "org.scalatest" %% "scalatest" % "3.2.18" % Test)
  )
