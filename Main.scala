object Main {
  def main(args: Array[String]): Unit = {
    var addr1 = new Address("Ukraine", "Kherson", 20)
    var addr2 = new Address("Ukraine", "Odessa", 35)
    var addr3 = new Address("Ukraine", "Mykolaiv", 22)
    var smartcontrakt_1 = new Smartcontrakt(500, 6, 10)
    var smartcontrakt_2 = new Smartcontrakt(500, 10, 5)
    var h1 = new Teacher("Bogdan", "Bulda", 34, "bbulda1394@gmail.com", addr1, "bbulda", "431", 0, 1000, smartcontrakt_1, 10)
    var s1 = new Student("Volodimir", "Goloborod'ko", 17, "vovan3000@gmail.com", addr2, "vovan3000", "512", 0, 1000, smartcontrakt_1)
    var s2 = new Student("Grigoriy", "Zdanov", 18, "grishatop@gmail.com", addr3, "grishatop", "678", 0, 1000, smartcontrakt_1)
    var s3 = new Student("Anastasiya", "Veremena", 18, "veremena2004@gmail.com", addr3, "stasya", "987", 0, 1000, smartcontrakt_1)
    var s4 = new Student("Oleksiy", "Kumaritov", 18, "leha_kym@gmail.com", addr3, "leha", "322", 0, 1000, smartcontrakt_1)
    var s5 = new Student("Viktor", "Kisliy", 18, "kityavisliy@gmail.com", addr3, "kitya", "907", 0, 1000, smartcontrakt_1)
    var birrga = new Birrga()
    var platform = new Platform()
    h1.addinlist(s1)
    h1.addinlist(s2)
    h1.addinlist(s3)
    h1.addinlist(s4)
    h1.addinlist(s5)

    println(h1.Show())
    println(h1.showlist())
    h1.evaluation(birrga, platform)
    println(h1.Show())
    println(h1.showlist())

    println(birrga.Show())
    println(platform.Show());}
}
