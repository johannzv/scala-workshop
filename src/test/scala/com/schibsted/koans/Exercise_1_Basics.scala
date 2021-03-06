/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 *
 * Several tests have been borrowed from Scala Koans. Scala Koans is licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License
 */
package com.schibsted.koans

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{FunSuite, Matchers}

/**
  * Make the following tests pass, typically by replacing a specific value,
  * '__' or '???' with the correct value or implementation.
  *
  * Run tests in IntelliJ from Run menu or with Ctrl+Shift+F10 / Ctrl+Shift+R,
  * or with Gradle on the command line:
  *
  * ~/gradlew test -t
  */
class Exercise_1_Basics extends FunSuite with Matchers /* with TypeCheckedTripleEquals */ {

  /*
   * =================================
   *         ScalaTest basics
   * =================================
   */
  test("Getting the ball rolling") {
    assert(false, "This should be true")
  }

  test("Values can be compared with 'should' matchers") {
    true should be (__) // should be true
  }

  test("Can test equality with assertions") {
    val v1 = 4
    val v2 = "foo" // make it equal
    assert(v1 === v2) // === is an assert from ScalaTest, gives you more control of equality constraints

    // What happens if you uncomment 'with TypeCheckedTripleEquals' in class definition at the top?
  }

  test("Testing your math skills") {
    assert(2 + 2 === 5) // fix the equation
  }

  /*
   * =================================
   *       Values and variables
   * =================================
   */
  test("Variables can be reassigned") {
    var a = 5
    a should be (10) // fix this

    a = 7
    a should be (7)
  }

  test("vals are values and cannot be reassigned, similar to final in Java") {
    val a = 5
    a should be (5)

    // What happens if you uncomment these lines?
    // a = 7
    // a should be (7)
  }

  /*
   * =================================
   *       Strings and literals
   * =================================
   */
  test("Multiline strings are nice") {
    val text ="""This is a
                 multiline string"""

    val numberOfLines = text.split("\n").length

    assert(numberOfLines === __) // fix this
  }

  test("Use stripMargin to prettify multi-line strings") {
    // use '|' and stripMargin to remove leading spaces
    val json =
      """{
           "answer": 42
         }"""

    val thirteenthCharacterOfSecondLine = json.split("\n")(1).charAt(12)

    assert(thirteenthCharacterOfSecondLine === '4')
  }

  /*
   * =================================
   *           Case classes
   * =================================
   */
  test("Case classes have automatic properties") {
    case class Person(name: String, age: Int)

    val p1 = Person("Fredrik", 40)

    // fix these
    p1.name shouldBe __
    p1.age shouldBe __
  }

  test("Equality of case class instances") {
    case class Person(name: String, age: Int)

    val p1 = Person("Fredrik", 40)
    val p2 = Person("Johannes", 7)
    val p3 = Person("Fredrik", 40)

    // fix these
    (p1 == p2) shouldBe __
    (p2 == p3) shouldBe __

    (p1 == p3) shouldBe __
    (p1 eq p3) shouldBe __ // why?

    (p1.name == p3.name) shouldBe __
  }

  test("Case classes have a convenient toString method") {
    case class Person(name: String, age: Int)

    val p = Person("Fredrik", 40)

    assert(p.toString === __) // fix this
  }

  test("Case classes can have mutable properties") {
    case class Person(name: String, var age: Int)

    val p = Person("Fredrik", 40)
    p.age should be (__) // fix this

    p.age = 41 // but is this a good idea?
    p.age should be (__) // fix this
  }
}
