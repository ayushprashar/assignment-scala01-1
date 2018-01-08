package edu.knoldus

import org.scalatest.FunSuite


class SearchingTest extends FunSuite {

  val searching = new Searching

  val array: Array[Int] = Array(1,2,3,4,5,6,7,8,9)

  test("Binary Search when element exist"){
    assert(searching.binarySearch(array, 7) ===6)
  }

  test("Binary Search when element not exist"){
    assert(searching.binarySearch(array, 17) != -1)
  }

  test("Linear Search when element exist"){
    assert(searching.linearSearch(array, 7))
  }

  test("Linear Search when element not exist"){
    assert(!searching.linearSearch(array, 17))
  }

}
