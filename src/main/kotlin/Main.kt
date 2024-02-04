fun main() {
    val electrodomestics = arrayOf(
        Electrodomestic(35, "blanc", 'D', 2),
        Electrodomestic(50, "platejat", 'E', 8),
        Electrodomestic(70, "color", 'A', 15),
        Electrodomestic(100, "blanc", 'F', 30),
        Electrodomestic(45, "platejat", 'B', 10),
        Electrodomestic(90, "color", 'C', 25),
        Rentadora(300, "blanc", 'A', 10, 5),
        Rentadora(595, "blanc", 'F', 20, 8),
        Televisio(400, "negre", 'B', 7, 28),
        Televisio(115, "blanc", 'G', 12, 52)
    )

    var preuBaseTotal = 0
    var preuFinalTotal = 0
    var preuFinalElectrodomestics = 0
    var preuFinalRentadores = 0
    var preuFinalTelevisions = 0

    println("Electrodomèstics:\n")
    electrodomestics.forEachIndexed { index, electrodomestic ->
        val preuFinal = electrodomestic.preuFinal()
        preuBaseTotal += electrodomestic.preuBase
        preuFinalTotal += preuFinal

        when (electrodomestic) {
            is Rentadora -> {
                preuFinalRentadores += preuFinal
                println("Rentadora ${index + 1}:")
            }
            is Televisio -> {
                preuFinalTelevisions += preuFinal
                println("Televisió ${index + 1}:")
            }
            else -> println("Electrodomèstic ${index + 1}:")
        }

        println("Preu base: ${electrodomestic.preuBase}€")
        println("Color: ${electrodomestic.color}")
        println("Consum: ${electrodomestic.consum}")
        println("Pes: ${electrodomestic.pes}kg")
        println("Preu final: $preuFinal€\n")
    }

    println("Electrodomèstics")
    println("Preu base total: $preuBaseTotal€")
    println("Preu final total: $preuFinalTotal€\n")

    println("Rentadores:")
    println("Preu base: ${preuBaseTotal - preuFinalElectrodomestics - preuFinalTelevisions}€")
    println("Preu final: $preuFinalRentadores€\n")

    println("Televisions:")
    println("Preu base: $preuFinalTelevisions€")
    println("Preu final: $preuFinalTelevisions€")
}