package services

object ConditionalService {

  def moreThanThree(x: Int): String = if (x > 3) {
    return "more"
  } else {
    return "not more"
  }

  def lessThanThree(x: Int): String = if (x < 3) {
    return "less"
  } else {
    return "not less"
  }

  def moreThanOrEqualToThree(x: Int): String = if (x > 3) {
    return "more or equal"
  } else if (x == 3) {
    return "more or equal"
  } else {
    return "not more"
  }

  def lessThanOrEqualToThree(x: Int): String = if (x < 3) {
    return "less or equal"
  } else if (x == 3) {
    return "less or equal"
  } else {
    return "not less"
  }

  def isItASheep(possibleSheep: String): String = if (possibleSheep == "sheep") {
    return "it is a sheep"
  } else {
    return "it is not a sheep"
  }

  def isItASheepOrCow(isItASheepOrCow: String): String = if (isItASheepOrCow == "sheep") {
    return "yes"
  } else if (isItASheepOrCow == "cow") {
    return "yes"
  } else {
    return "no"
  }

  def isItASheepOrBrownCow(isItASheepOrBrownCow: String, colour: String): String = if (isItASheepOrBrownCow.contains("sheep")) {
    return "yes"
  } else if ((isItASheepOrBrownCow == "cow")&&(colour == "brown")) {
      return "yes"
    } else {
      return "no"
    }

  def stringContainsHello(str: String): String = if (str.contains("Hello")) {
    return "it does"
  } else {
    return "it doesn't"
  }

  def moreThanTenMoreThanTwenty(x: Int): String = if (x > 20) {
    return "more than 20"
  } else if ((x <= 20) && (x > 10)) {
    return "more than 10"
  } else {
    return "not more than 10"
  }

  def divideIfEvenMultiplyIfOdd(num: Int, factor: Int): Int = if (num % 2 == 0) {
    return num / factor
  } else {
    return num * factor
  }

  def getResponseType(httpResponseStatus: Int): String = if (httpResponseStatus == 600 || httpResponseStatus == 199) {
    return "not a valid code"
  } else if (httpResponseStatus == 200 || httpResponseStatus == 202 || httpResponseStatus == 299) {
    return "here you go"
  } else if (httpResponseStatus == 300 || httpResponseStatus == 303 || httpResponseStatus == 399) {
    return "you're looking in the wrong place"
  } else if (httpResponseStatus == 400 || httpResponseStatus == 403 || httpResponseStatus == 499) {
    return "error - your fault"
  } else {
    return "error - my fault"
  }

  def getResponseTypeWithDetail(httpResponseStatus: Int): String = if (httpResponseStatus == 600 || httpResponseStatus == 199) {
    return "not a valid code"
  } else if (httpResponseStatus == 200 || httpResponseStatus == 299) {
    return "here you go"
  } else if (httpResponseStatus == 202) {
    return "here you go: ACCEPTED"
  } else if (httpResponseStatus == 300 || httpResponseStatus == 399) {
    return "you're looking in the wrong place"
  } else if (httpResponseStatus == 303) {
    return "you're looking in the wrong place: REDIRECT"
  } else if (httpResponseStatus == 400 || httpResponseStatus == 499) {
    return "error - your fault"
  } else if (httpResponseStatus == 403) {
    return "error - your fault: FORBIDDEN"
  } else if (httpResponseStatus == 500 || httpResponseStatus == 599) {
    return "error - my fault"
  } else {
    return "error - my fault: SERVICE UNAVAILABLE"
  }
}

