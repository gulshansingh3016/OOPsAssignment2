object Comaparison {
  def main(args: Array[String]): Unit ={

    val personOne = new Person("Test", age= 24)
    val personTwo = new Person("Test",25)
    personOne.checkNames(personTwo)


  }
}
