class Car{
    var model:String = "";
    var engineNumber:String = ""
    var timeToMaxSpeed:Int = 0

    //Functins
    fun reachMaxSpeedIn(distance:Int){
        println("Car to reach its Max Speed in ${distance * timeToMaxSpeed} ! ")
    }
    fun printDetails(){
        println("Car is of model :- $model having engine number $engineNumber ! ")
    }
}

fun main() {
    //creating object
    val audi = Car()

     // Accessing member variables
    audi.model = "S4"
    audi.engineNumber = "Ab45"
    audi.timeToMaxSpeed = 20

    audi.reachMaxSpeedIn(40)
    audi.printDetails()
}
