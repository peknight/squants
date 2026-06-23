import com.peknight.build.gav.*
import com.peknight.build.sbt.*

commonSettings

lazy val squants = (project in file("."))
  .settings(name := "squants")
  .aggregate(
    squantsCore.jvm,
    squantsCore.js,
  )

lazy val squantsCore = (crossProject(JVMPlatform, JSPlatform) in file("squants-core"))
  .settings(name := "squants-core")
  .settings(crossDependencies(
    typelevel.squants,
    typelevel.cats,
  ))
