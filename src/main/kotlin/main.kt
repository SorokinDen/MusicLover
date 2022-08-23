fun main() {
    val sum = 10050000 // сумма в копейках
    val musicLover = true // проверка на меломана
    var result = if (sum < 1000_00) {
        sum
    } else if(1001_00 <= sum && sum <= 10000_00 ) {
        sum - 10000
    } else  {
        sum * 95 / 100
    }
    if(musicLover) {
        result = result * 99 / 100
    }
    println("К оплате " + result/100 + " рублей "  + result % 100 + " копеек")
}