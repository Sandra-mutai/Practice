fun main() {
    school("Akirachix")

    println(identity("sandra",20))
    println(teacher("girl"))
    name("Sandra")
    name("Sandra Mutai")

}
fun school(name: String){
    var school="Akirachix"
    print(school[0])
    print(school[2])
    println(school[3])
}
fun identity(x: String, y:Int):String{
    return "Hi my name is $ x and i am $ years old"
}
fun teacher(teacher: String):Int{
    return teacher.length
}
fun name(name:String){
    if(name=="Sandra"){
        println("that is me")

    }
    else{
      println("i do not know who that is")
    }


}






