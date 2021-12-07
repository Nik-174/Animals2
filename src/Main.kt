fun main() {

    val animals = arrayOf(Hippo(), Wolf())

    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamable = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamable) {
        item.roam()
        if (item is Animal)
            item.eat()
        println("")
    }
}