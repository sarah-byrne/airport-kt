class Airport() {
    var planes: MutableList<String>

    init {
       this.planes =  ArrayList()
    }

    fun hello(): String {
        return "i am an airport"
    }

    fun land(plane: String) {
        planes.add(plane)
    }

}