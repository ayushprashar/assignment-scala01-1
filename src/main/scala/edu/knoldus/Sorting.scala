package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(counter1 <- 1 until array.length){
      val current:Int = array(counter1)
      var counter2 = counter1 - 1
      while(counter2>=0 && array(counter2)>current){
        array(counter2+1) = array(counter2)
        counter2-=1
      }
      array(counter2+1) = current
    }
    return array

  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for(counter1:Int <- 0 until array.length-1){
      var smallestId:Int = counter1
      for(counter2:Int <- counter1+1 until array.length){
        if(array(counter2)<array(smallestId))
          smallestId=counter2
      }
      val temporary =array(smallestId)
      array(smallestId) = array(counter1)
      array(counter1) = temporary
    }
    return array

  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for (counter1 <- 0 until array.length - 1) {
      for (counter2 <- 0 until array.length - counter1 - 1) {
        if (array(counter2) > array(counter2 + 1)) {
          val temporary: Int = array(counter2)
          array(counter2) = array(counter2 + 1)
          array(counter2 + 1) = temporary
        }
      }
    }
    return array
  }



}