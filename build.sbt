import com.peknight.build.gav
import com.peknight.build.gav.*
import com.peknight.build.sbt.*

commonSettings

lazy val squants = (project in file("."))
  .settings(name := "squants")
  .aggregate(squantsCore.projectRefs *)

lazy val squantsCore = (projectMatrix in file("squants-core"))
  .settings(name := "squants-core")
  .settings(libraryDependencies ++= dependencies(
    typelevel.squants,
    typelevel.cats,
  ))
  .jvmPlatform(scalaVersions = Seq(scala.scala3.version))
  .jsPlatform(scalaVersions = Seq(scala.scala3.version))
