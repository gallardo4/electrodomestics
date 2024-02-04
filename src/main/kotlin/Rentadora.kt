class Rentadora(
    preuBase: Int = 0,
    color: String = "blanc",
    consum: Char = 'G',
    pes: Int = 5,
    var carrega: Int = 5
) : Electrodomestic(preuBase, color, consum, pes) {
    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        when (carrega) {
            6, 7 -> preuFinal += 55
            8 -> preuFinal += 70
            9 -> preuFinal += 85
            10 -> preuFinal += 100
        }

        return preuFinal
    }
}