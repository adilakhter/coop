/*
 * Copyright 2019 Daniel Spiewak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

name := "coop"

ThisBuild / baseVersion := "0.4"

ThisBuild / organization := "com.codecommit"
ThisBuild / publishGithubUser := "djspiewak"
ThisBuild / publishFullName := "Daniel Spiewak"

ThisBuild / strictSemVer := false

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-free"     % "2.1.0",
  "org.typelevel" %% "cats-mtl-core" % "0.7.0",

  "org.specs2" %% "specs2-core" % "4.8.1" % Test)

addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")

Global / homepage := Some(url("https://github.com/djspiewak/coop"))

Global / scmInfo := Some(
  ScmInfo(
    url("https://github.com/djspiewak/coop"),
    "git@github.com:djspiewak/coop.git"))
