class Wolf : Canine() {

    override val image = "wolf"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("Hooooooow!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}