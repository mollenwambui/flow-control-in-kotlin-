fun main() {
    greetJane("Sabdio")
    numbers(0)
    hasVisitedCapital("Nigerian")
    hasVisitedCapital("Tanzanian")
    hasvisitedcapital2("Nigeria")
    hasvisitedcapital2("Kenyan")
    admitPerson(5)
    login("Joy")
    languagesSpoken()
   // numbers()
    multiples()
}

fun greetJane(name: String) {
    if (name == "Sabdio") {
        println("Hello Sabdio")
    } else {
        println("Who are you")
    }
}

fun numbers(num: Int) {
    if (num % 2 == 0) {
        println("Even")
    } else {
        println("Odd")

    }
}

fun hasVisitedCapital(nationality: String) {
    if (nationality.equals("Kenyan")) {
        println("Have you ever been to Nairobi")
    } else if (nationality.equals("Tanzanian")) {
        println("Have you ever been to Dodoma")
    } else if (nationality.equals("Uganda")) {
        println("Have you ever been to Kampala")
    } else {

    }
}
fun hasvisitedcapital2(nationality: String){
    when(nationality){
        "Kenyan","Ugandan","Tanzanian"-> println("Have you ever been to Nairobi")
        "Nigrian","Ghanaian"  -> println("Have you been to Lagos")
        "Botswana", "Brazil"        -> println("Have you been to America")
        else ->println("Have you ever been to Africa")
    }
}
fun admitPerson(Age:Int){
    when(Age){
        1,2,3,4-> println("Kindagarten")
       5,6,7,8,9,10  -> println("primary")
    }
}
fun login(password:String):Boolean {
    return password.length in 8..16 && password != "password"
}
fun languagesSpoken(){
    var languages= arrayOf("Kiswahili","luganda")
   for(language in languages)
      println(language)
    for(char in languages)
        println(char)
    //for (num in 1..10)
     //   println(num)
}
//fun numbers() {
    //for (numbers in 1..20)
    //    if (numbers % 2 != 0) {
          //  println(numbers * numbers)
      //  }

fun multiples(){
    for(nums in 1..1000)

    if (nums%6==0&& nums%8==0){
        println("Bingo")
            }
   else if (nums%6==0 ||nums%8==0 ){
        println(nums)
}}