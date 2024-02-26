
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "untitled2"
  )


val akkaHttpVersion = "10.2.4"
val akkaVersion = "2.6.5"
val jdbcAndLiftJsonVersion = "3.4.1"
val flywayCore = "3.2.1"
val keycloakVersion = "4.0.0.Final"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "net.liftweb" %% "lift-json" % jdbcAndLiftJsonVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "org.postgresql" % "postgresql" % "42.2.11",
  "org.scalikejdbc" %% "scalikejdbc" % jdbcAndLiftJsonVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.3",
  "com.h2database" % "h2" % "1.4.196",
  "ch.megard" %% "akka-http-cors" % "0.4.3",
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "org.mockito" %% "mockito-scala" % "1.11.4" % Test,
  "com.enragedginger" %% "akka-quartz-scheduler" % "1.8.3-akka-2.6.x",
  "org.apache.commons" % "commons-io" % "1.3.2",
  "org.apache.httpcomponents" % "httpclient" % "4.5.11",
  "com.google.api-client" % "google-api-client" % "1.30.9",
  "com.google.oauth-client" % "google-oauth-client-jetty" % "1.30.5",
  "com.google.apis" % "google-api-services-sheets" % "v4-rev1-1.21.0",
  "com.google.apis" % "google-api-services-admin-directory" % "directory_v1-rev20191003-1.30.8",
  "com.google.auth" % "google-auth-library-oauth2-http" % "1.3.0",
  //flyway
  "org.flywaydb" % "flyway-core" % flywayCore,
  //swagger-akka-http
  "com.github.swagger-akka-http" %% "swagger-akka-http" % "2.4.2",
  "com.github.swagger-akka-http" %% "swagger-scala-module" % "2.3.1",
  //javax
  "javax.ws.rs" % "javax.ws.rs-api" % "2.0.1",
  "com.github.jwt-scala" %% "jwt-circe" % "9.0.1",
  "org.keycloak"      % "keycloak-core"         % keycloakVersion,
  "org.keycloak"      % "keycloak-adapter-core" % keycloakVersion,
  "org.jboss.logging" % "jboss-logging"         % "3.3.0.Final" % Runtime,
  "org.keycloak" % "keycloak-admin-client" % "12.0.2",
  "com.rabbitmq" % "amqp-client" % "5.12.0",
  "org.apache.commons" % "commons-text" % "1.9",
  "org.wvlet.airframe" %% "airframe-ulid" % "22.12.6"

)
//Testing comment