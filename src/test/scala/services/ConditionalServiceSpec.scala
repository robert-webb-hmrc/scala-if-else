package services

import org.scalatest.{Matchers, WordSpec}

class ConditionalServiceSpec extends WordSpec with Matchers {

  "moreThanThree" should {
    "return 'more' if given a value higher than three" in {
      ConditionalService.moreThanThree(4) shouldBe "more"
    }
    "return 'not more' if given a value lower than three" in {
      ConditionalService.moreThanThree(2) shouldBe "not more"
    }
    "return 'not more' if given the number three" in {
      ConditionalService.moreThanThree(3) shouldBe "not more"
    }
  }

  "lessThanThree" should {
    "return 'less' if given a value lower than three" in {
      ConditionalService.lessThanThree(2) shouldBe "less"
    }
    "return 'not less' if given a value higher than three" in {
      ConditionalService.lessThanThree(4) shouldBe "not less"
    }
    "return 'not less' if given the number three" in {
      ConditionalService.lessThanThree(3) shouldBe "not less"
    }
  }

  "moreThanOrEqualToThree" should {
    "return 'more or equal' if given a value higher than three" in {
      ConditionalService.moreThanOrEqualToThree(4) shouldBe "more or equal"
    }
    "return 'not more' if given a value lower than three" in {
      ConditionalService.moreThanOrEqualToThree(2) shouldBe "not more"
    }
    "return 'more or equal' if given the number three" in {
      ConditionalService.moreThanOrEqualToThree(3) shouldBe "more or equal"
    }
  }

  "lessThanOrEqualToThree" should {
    "return 'less or equal' if given a value lower than three" in {
      ConditionalService.lessThanOrEqualToThree(2) shouldBe "less or equal"
    }
    "return 'not less' if given a value higher than three" in {
      ConditionalService.lessThanOrEqualToThree(4) shouldBe "not less"
    }
    "return 'less or equal' if given the number three" in {
      ConditionalService.lessThanOrEqualToThree(3) shouldBe "less or equal"
    }
  }

  "isItASheep" should {
    "return 'it is a sheep' if passed 'sheep'" in {
      ConditionalService.isItASheep("sheep") shouldBe "it is a sheep"
    }
    "return 'it is not a sheep' if passed 'cow'" in {
      ConditionalService.isItASheep("cow") shouldBe "it is not a sheep"
    }
  }

  "isItASheepOrCow" should {
    "return 'yes' if passed 'sheep'" in {
      ConditionalService.isItASheepOrCow("sheep") shouldBe "yes"
    }
    "return 'yes' if passed 'cow'" in {
      ConditionalService.isItASheepOrCow("cow") shouldBe "yes"
    }
    "return 'no' if passed 'chicken'" in {
      ConditionalService.isItASheepOrCow("chicken") shouldBe "no"
    }
  }

  "isItASheepOrBrownCow" should {
    "return 'yes' if passed 'sheep' and 'brown'" in {
      ConditionalService.isItASheepOrBrownCow("sheep", "brown") shouldBe "yes"
    }
    "return 'yes' if passed 'sheep' and 'pink'" in {
      ConditionalService.isItASheepOrBrownCow("sheep", "pink") shouldBe "yes"
    }
    "return 'yes' if passed 'cow' and 'brown'" in {
      ConditionalService.isItASheepOrBrownCow("cow", "brown") shouldBe "yes"
    }
    "return 'no' if passed 'cow' and 'grey'" in {
      ConditionalService.isItASheepOrBrownCow("cow", "grey") shouldBe "no"
    }
    "return 'no' if passed 'chicken' and 'red'" in {
      ConditionalService.isItASheepOrBrownCow("chicken", "red") shouldBe "no"
    }
    "return 'no' if passed 'chicken' and 'brown'" in {
      ConditionalService.isItASheepOrBrownCow("chicken", "brown") shouldBe "no"
    }
  }

  "stringContainsHello" should {
    "return 'it does' if given the string 'oh Hello'" in {
      ConditionalService.stringContainsHello("oh Hello") shouldBe "it does"
    }
    "return 'it does' if given the string 'HelloHelloHello'" in {
      ConditionalService.stringContainsHello("HelloHelloHello") shouldBe "it does"
    }
    "return 'it doesn't' if given the string 'hell'" in {
      ConditionalService.stringContainsHello("hell") shouldBe "it doesn't"
    }
    "return 'it doesn't' if given the string 'hello lower case'" in {
      ConditionalService.stringContainsHello("hello lower case") shouldBe "it doesn't"
    }
  }

  "moreThanTenMoreThanTwenty" should {
    "return 'more than 20' if given a value higher than 20" in {
      ConditionalService.moreThanTenMoreThanTwenty(21) shouldBe "more than 20"
    }
    "return 'more than 10' if given a value higher than 10" in {
      ConditionalService.moreThanTenMoreThanTwenty(11) shouldBe "more than 10"
    }
    "return 'not more than 10' if given a number less than 10" in {
      ConditionalService.moreThanTenMoreThanTwenty(3) shouldBe "not more than 10"
    }
    "return 'not more than 10' if given the number 10" in {
      ConditionalService.moreThanTenMoreThanTwenty(10) shouldBe "not more than 10"
    }
    "return 'more than 10' if given the number 20" in {
      ConditionalService.moreThanTenMoreThanTwenty(20) shouldBe "more than 10"
    }
  }

  "divideIfEvenMultiplyIfOdd" should {
    "return 4 for 8 and 2" in {
      ConditionalService.divideIfEvenMultiplyIfOdd(8, 2) shouldBe 4
    }
    "return 25 for 300 and 12" in {
      ConditionalService.divideIfEvenMultiplyIfOdd(300, 12) shouldBe 25
    }
    "return 39 for 13 and 3" in {
      ConditionalService.divideIfEvenMultiplyIfOdd(13, 3) shouldBe 39
    }
    "return 42 for 7 and 6" in {
      ConditionalService.divideIfEvenMultiplyIfOdd(7, 6) shouldBe 42
    }
  }

  "getResponseType" should {
    "return 'not a valid code' for 199" in {
      ConditionalService.getResponseType(199) shouldBe "not a valid code"
    }
    "return 'not a valid code' for 600" in {
      ConditionalService.getResponseType(600) shouldBe "not a valid code"
    }
    "return 'here you go' for 200" in {
      ConditionalService.getResponseType(200) shouldBe "here you go"
    }
    "return 'here you go' for 202" in {
      ConditionalService.getResponseType(202) shouldBe "here you go"
    }
    "return 'here you go' for 299" in {
      ConditionalService.getResponseType(299) shouldBe "here you go"
    }
    "return 'you're looking in the wrong place' for 300" in {
      ConditionalService.getResponseType(300) shouldBe "you're looking in the wrong place"
    }
    "return 'you're looking in the wrong place' for 303" in {
      ConditionalService.getResponseType(303) shouldBe "you're looking in the wrong place"
    }
    "return 'you're looking in the wrong place' for 399" in {
      ConditionalService.getResponseType(399) shouldBe "you're looking in the wrong place"
    }
    "return 'error - your fault' for 400" in {
      ConditionalService.getResponseType(400) shouldBe "error - your fault"
    }
    "return 'error - your fault' for 403" in {
      ConditionalService.getResponseType(403) shouldBe "error - your fault"
    }
    "return 'error - your fault' for 499" in {
      ConditionalService.getResponseType(499) shouldBe "error - your fault"
    }
    "return 'error - my fault' for 500" in {
      ConditionalService.getResponseType(500) shouldBe "error - my fault"
    }
    "return 'error - my fault' for 503" in {
      ConditionalService.getResponseType(503) shouldBe "error - my fault"
    }
    "return 'error - my fault' for 599" in {
      ConditionalService.getResponseType(599) shouldBe "error - my fault"
    }
  }

  "getResponseTypeWithDetail" should {
    "return 'not a valid code' for 199" in {
      ConditionalService.getResponseTypeWithDetail(199) shouldBe "not a valid code"
    }
    "return 'not a valid code' for 600" in {
      ConditionalService.getResponseTypeWithDetail(600) shouldBe "not a valid code"
    }
    "return 'here you go' for 200" in {
      ConditionalService.getResponseTypeWithDetail(200) shouldBe "here you go"
    }
    "return 'here you go: ACCEPTED' for 202" in {
      ConditionalService.getResponseTypeWithDetail(202) shouldBe "here you go: ACCEPTED"
    }
    "return 'here you go' for 299" in {
      ConditionalService.getResponseTypeWithDetail(299) shouldBe "here you go"
    }
    "return 'you're looking in the wrong place' for 300" in {
      ConditionalService.getResponseTypeWithDetail(300) shouldBe "you're looking in the wrong place"
    }
    "return 'you're looking in the wrong place: REDIRECT' for 303" in {
      ConditionalService.getResponseTypeWithDetail(303) shouldBe "you're looking in the wrong place: REDIRECT"
    }
    "return 'you're looking in the wrong place' for 399" in {
      ConditionalService.getResponseTypeWithDetail(399) shouldBe "you're looking in the wrong place"
    }
    "return 'error - your fault' for 400" in {
      ConditionalService.getResponseTypeWithDetail(400) shouldBe "error - your fault"
    }
    "return 'error - your fault: FORBIDDEN' for 403" in {
      ConditionalService.getResponseTypeWithDetail(403) shouldBe "error - your fault: FORBIDDEN"
    }
    "return 'error - your fault' for 499" in {
      ConditionalService.getResponseTypeWithDetail(499) shouldBe "error - your fault"
    }
    "return 'error - my fault' for 500" in {
      ConditionalService.getResponseTypeWithDetail(500) shouldBe "error - my fault"
    }
    "return 'error - my fault: SERVICE UNAVAILABLE' for 503" in {
      ConditionalService.getResponseTypeWithDetail(503) shouldBe "error - my fault: SERVICE UNAVAILABLE"
    }
    "return 'error - my fault' for 599" in {
      ConditionalService.getResponseTypeWithDetail(599) shouldBe "error - my fault"
    }
  }

}
