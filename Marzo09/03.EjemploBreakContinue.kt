package Marzo09

fun main() {
    for (i in 10..20 step 2) {
        if (i == 16) {
            continue
        }
        println(i)
    }
    for (x in 10..20) {
        if (x % 2 == 1){
            continue
        }
        if (x == 16){
            continue
        }
        println(x)
    }
    for (j in 10..20 step 2) {
        if (j == 16) {
            continue
        }
        if (j > 20)
            break
        println(j)
    }
}