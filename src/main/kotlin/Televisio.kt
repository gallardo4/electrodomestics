class Televisio(
    preuBase: Int = 0,
    color: String = "blanc",
    consum: Char = 'G',
    pes: Int = 5,
    var mida: Int = 28
) : Electrodomestic(preuBase, color, consum, pes) {
    override fun preuFinal(): Int {
        var preuFinal = super.preuFinal()

        when {
            mida in 29..32 -> preuFinal += 50
            mida in 33..42 -> preuFinal += 100
            mida in 43..50 -> preuFinal += 150
            mida >= 51 -> preuFinal += 200
        }

        return preuFinal
    }
}