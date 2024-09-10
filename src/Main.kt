fun main() {
    println("-------------------------------------------")
    println("PRACTICE ACTIVITY 0 - KOTLIN BASIC")
    println("-------------------------------------------")
    println("-------------------------------------------")
    val Pounds = 523.6
    val Kilograms = Pounds * 0.453592
    println("POUNDS AND KILOGRAMS")
    println("Pounds(lbs): $Pounds")
    println("Pounds(lbs) to Kilograms(kg): ${"%.2f".format(Kilograms)}")
    println("-------------------------------------------")
    val Miles = 56.8
    val Kilometers = Miles * 1.60934
    println("MILES AND KILOMETERS")
    println("Miles(mi): $Miles")
    println("miles(mi) to Kilometers(km): ${"%.2f".format(Kilometers)}")
    println("-------------------------------------------")

    val Fahrenheit = 9782.89
    val Celsius = (Fahrenheit - 32) * 5 / 9
    println("FAHRENHEIT AND CELSIUS")
    println("Fahrenheit(°F): $Fahrenheit")
    println("Fahrenheit(°F) to Celsius(°C): ${"%.2f".format(Celsius)}")
    println("-------------------------------------------")

    val student_ages = arrayOf(18, 19, 20, 21, 22, 23, 24, 25, 26, 27)
    val average_age = student_ages.average()
    println("STUDENTS AGES")
    for ((i, age) in student_ages.withIndex()) {
        println("Student ${i + 1}: $age")
    }
    println("The average age of the students is: ${"%.1f".format(average_age)}")
    println("-------------------------------------------")

    println("FANTASY STORY")
    val bida = "Lucky"
    val monster = "Undead Titan"
    val weapon = "Sword"
    val armor = "Diamond Armor"
    val ulti = "Infinity Slash"
    val story = """
    In the ancient land of Eldoria, a brave warrior named $bida set out to defeat the monstrous $monster. 
    Armed with his legendary $weapon and protected by his $armor, $bida faced the Titan in an epic battle.
    Though the $monster was powerful, $bida unleashed his ultimate skill, $ulti, 
    which cleaved through the beast and saved the kingdom from destruction.
""".trimIndent()
    println(story)


    println(story)
}
