name := "breeze_sandbox"
version := "0.0.1"

scalaVersion := "2.12.7"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:higherKinds",
  "-Xlint",
  "-Ypartial-unification"
)

libraryDependencies ++= Seq(
  "log4j"                 % "log4j"         % "1.2.17",
  "org.apache.commons"    % "commons-math3" % "3.6.1",
  "org.scalanlp"         %% "breeze"        % "0.13.2",
  "org.scalanlp"         %% "breeze-viz"    % "0.13.2",
  "org.typelevel"        %% "cats-core"     % "0.9.0",
  "org.scalatest"        %% "scalatest"     % "3.0.1" % "test"
)
