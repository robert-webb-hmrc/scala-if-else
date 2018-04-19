package services

object ConditionalService {

  def moreThanThree(x: Int): String = if(x > 3) "more" else "not more"

  def lessThanThree(x: Int): String = if(x < 3) "less" else "not less"

  def moreThanOrEqualToThree(x: Int): String = if(x >= 3) "more or equal" else "not more"

  def lessThanOrEqualToThree(x: Int): String = if(x <= 3) "less or equal" else "not less"

  def isItASheep(possibleSheep: String): String = if(possibleSheep == "sheep") {
    "it is a sheep"
  } else {
    "it is not a sheep"
  }

  def isItASheepOrCow(possiblePoultryOrBovine: String): String = {
    if(possiblePoultryOrBovine == "sheep" || possiblePoultryOrBovine == "cow") "yes" else "no"
  }

  def isItASheepOrBrownCow(possiblePoultryOrBovine: String, colour: String): String = {
    if(possiblePoultryOrBovine == "sheep" || (possiblePoultryOrBovine == "cow" && colour == "brown")) {
      "yes"
    } else {
      "no"
    }
  }

  def stringContainsHello(str: String): String = {
    if(str.contains("Hello")) {
      "it does"
    } else {
      "it doesn't"
    }
  }

  def moreThanTenMoreThanTwenty(x: Int): String = {
    if(x > 20) {
      "more than 20"
    } else if(x > 10) {
      "more than 10"
    } else {
      "not more than 10"
    }
  }

  def divideIfEvenMultiplyIfOdd(num: Int, factor: Int): Int = {
    if(num % 2 == 0) {
      num / factor
    } else {
      num * factor
    }
  }

  def getResponseType(httpResponseStatus: Int): String = {
    if(httpResponseStatus < 200 || httpResponseStatus > 599) {
      "not a valid code"
    } else if (httpResponseStatus < 300) {
      "here you go"
    } else if (httpResponseStatus < 400) {
      "you're looking in the wrong place"
    } else if (httpResponseStatus < 500) {
      "error - your fault"
    } else {
      "error - my fault"
    }
  }

  def getResponseTypeWithDetail(httpResponseStatus: Int): String = {
    if(httpResponseStatus < 200 || httpResponseStatus > 599) {
      "not a valid code"
    } else if (httpResponseStatus < 300) {
      if(httpResponseStatus == 202) {
        "here you go: ACCEPTED"
      } else {
        "here you go"
      }
    } else if (httpResponseStatus < 400) {
      if(httpResponseStatus == 303) {
        "you're looking in the wrong place: REDIRECT"
      } else {
        "you're looking in the wrong place"
      }
    } else if (httpResponseStatus < 500) {
      if(httpResponseStatus == 403) {
        "error - your fault: FORBIDDEN"
      } else {
        "error - your fault"
      }
    } else if(httpResponseStatus == 503) {
      "error - my fault: SERVICE UNAVAILABLE"
    } else {
      "error - my fault"
    }
  }
}
