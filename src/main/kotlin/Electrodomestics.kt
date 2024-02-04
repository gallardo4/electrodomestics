open class Electrodomestic(
    var preuBase: Int = 0,
    var color: String = "blanc",
    var consum: Char = 'G',
    var pes: Int = 5
) {
    open fun preuFinal(): Int {
        var preuFinal = preuBase

        when (consum) {
            'A' -> preuFinal += 35
            'B' -> preuFinal += 30
            'C' -> preuFinal += 25
            'D' -> preuFinal += 20
            'E' -> preuFinal += 15
            'F' -> preuFinal += 10
        }

        when {
            pes in 6..20 -> preuFinal += 20
            pes in 21..50 -> preuFinal += 50
            pes in 51..80 -> preuFinal += 80
            pes > 80 -> preuFinal += 100
        }

        return preuFinal
    }
}