package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    mybinarySearch(array, elem, 0, array.length)

  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    mylinearSearch(array, elem)


  }

  def mylinearSearch(Domain: Array[Int], toFind: Int): Int = {
    for (counter <- Domain) {
      if (counter == toFind)
        return Domain.indexOf(counter)
    }
    return -1
  }

  def mybinarySearch(domain: Array[Int], toFind: Int, from: Int, till: Int): Int = {
    val left: Int = from
    val right: Int = till
    if (left <= right) {
      val middle: Int = left + (right - left) / 2
      if (domain(middle) == toFind) {
        return middle;
      }
      if (domain(middle) > toFind) {
        return mybinarySearch(domain, toFind, left, middle - 1)
      }
      return mybinarySearch(domain, toFind, middle + 1, till)
    }
    return -1
  }

}
