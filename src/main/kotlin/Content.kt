import com.github.pambrose.common.util.FileSystemSource
import com.github.pambrose.common.util.GitHubRepo
import com.github.readingbat.dsl.ReturnType.IntType
import com.github.readingbat.dsl.ReturnType.StringType
import com.github.readingbat.dsl.isProduction
import com.github.readingbat.dsl.readingBatContent

val content =
  readingBatContent {
    repo = if (isProduction()) GitHubRepo("readingbat", "readingbat-java-content") else FileSystemSource("./")
    branchName = "master"

    java {

      group("Warmup 1") {
        packageName = "warmup1"
        description = "This is a description of Warmup 1"

        challenge("JoinEnds") {
          codingBatEquiv = "p141494"
        }

        challenge("AddItUp")

        challenge("StringLength") {
          description = "This is a description of StringLength"
          codingBatEquiv = "p141494"
        }

        challenge("LookForIt") {
          description = "This is a description of LookForIt"
        }

        challenge("Shifty") {
          description = "This is a description of Shifty"
        }

        challenge("HasEvens") {
          description = "This is a description of HasEvens"
        }

        challenge("HasOdds") {
          description = "This is a description of HasOdds"
        }
      }

      group("Warmup 2") {
        packageName = "warmup2"
        description = "This is a description of Warmup 2"
      }

      group("String 1") {
        packageName = "string1"
        description = "This is a description of String 1"
      }

      group("String 2") {
        packageName = "string2"
        description = "This is a description of String 2"
      }

      group("Array 1") {
        packageName = "array1"
        description = "This is a description of Array 1"
      }

      group("Array 2") {
        packageName = "array2"
        description = "This is a description of Array 2"
      }
    }

    kotlin {

      group("Lambda Intro") {
        packageName = "lambda1"
        description = "Introduction to Lambdas Examples"

        includeFilesWithType = "Lambda*.kt" returns IntType
      }


      group("Lambdas 1") {
        packageName = "lambda1"
        description = "This is a description of Lambdas 1"

        challenge("StringLambda1") {
          description = "This is a description of StringLambda1"
          returnType = StringType
        }

        challenge("StringLambda2") {
          description = "This is a description of StringLambda1"
          returnType = StringType
        }
      }

      group("Lambdas 2") {
        packageName = "lambdas2"
        description = "This is a description of Lambdas 2"
      }
    }
  }
