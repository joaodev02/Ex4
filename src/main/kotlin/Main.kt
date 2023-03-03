fun main() {
    val sp = 67.83643
    val rj = 36.67866
    val mg = 29.22988
    val es = 27.16548
    val outros = 19.84953
    val total = sp + rj + mg + es + outros

    println("Percentual de representação do estado de São Paulo = " + (sp / total * 100))
    println("Percentual de representação do estado do Rio de Janeiro = " + (rj / total * 100))
    println("Percentual de representação do estado de Minas Gerais = " + (mg / total * 100))
    println("Percentual de representação do estado de Espírito Santo = " + (es / total * 100))
    println("Percentual de representação Outros estados = " + (outros / total * 100))
}