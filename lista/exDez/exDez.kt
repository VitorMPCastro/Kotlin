package lista.exDez

fun exDez() {
    val service = VolumeService()
    val volume = service.calcularVolume(10f, 5f, 2f)

    println("Volume da caixa: $volume")
}
