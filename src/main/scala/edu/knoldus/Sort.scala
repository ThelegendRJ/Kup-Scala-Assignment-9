package edu.knoldus

class Sort {
  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))


  def insert(num: Int, list: List[Int]): List[Int] = {
    if (list.isEmpty || num <= list.head) num :: list
    else list.head :: insert(num, list.tail)
  }
}

object main extends App{
  val list = List(99,100,5,8,11,23,7,27,25)

  val obj = new Sort()

  println(obj.isort(list))

}
