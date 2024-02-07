fun main(){
    //Задание 8
try{
    val a= readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    if (a<=b)
    {
        println("Первое число $a меньше или равно второму числу $b заменяем его на 0")
        val resultA=0.0
        println ("Полученный результат: $resultA, $b")
    } else{
        println ("Первое число $a больше второго числа $b оставляем его без изменения")
        println ("Полученный результат: $a, $b")
    }
} catch (e: Exception) {
    println ("Введено не числовое значение")}


    //Задание 18
try{
    print ("Введите высоту прямоугольного отверстия: ")
    val A = readLine()!!.toInt()
    print ("Введите ширину прямоугольного отверстия: ")
    val B = readLine()!!.toInt()
    print ("Введите размеры x,y,z кирпича:  ")
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    val z = readLine()!!.toInt()
    if (y<=A && x<=B){
        println("Кирпич проходит в прямоугольное отверстие")
    } else{println ("Кирпич не проходит в прямоугольное отверстие")}
} catch (e: Exception) {
    println("Введено не числовое значение")
}


    //Задание 28
try{
    print ("Введите значение а: ")
    val a = readLine()!!.toInt()
    print ("Введите значение х: ")
    val X = readLine()!!.toInt()
    print ("Введите значение b: ")
    val b = readLine()!!.toInt()
    print ("Введите значение у: ")
    val Y = readLine()!!.toInt()
    print ("Введите значение d: ")
    val d = readLine()!!.toInt()
    print ("Введите знаечние е: ")
    val e = readLine()!!.toInt()
    val c = (a*X)+(b*Y)
    val f = (d*X)+(e*Y)
    println ("c = $c")
    println ("f = $f")
} catch (e: Exception) {
    println ("Введено не числовое значение")}


    //Задание 38
try{
    print ("Введите значение a: ")
    val a = readLine()!!.toInt()
    print ("Введите значение b: ")
    val b = readLine()!!.toInt()
    print ("Введите значение c: ")
    val c2 = readLine()!!.toInt()
    print ("Введите значение d: ")
    val d2 = readLine()!!.toInt()
    print ("Введите значение x: ")
    val x2 = readLine()!!.toInt()
    if (a<b && c2<d2){
            if(x2 in a..b || x2 in c2..d2 || (x2>a&&x2<b&&x2>c2&&x2<d2)){
                println ("x принадлежит какому-либо из отрезков [a,b], [c,d] или их общей части")
            } else {println ("x не принадлежит ни одному из открезков или их общей части")}
    }else {println ("При вводе данных не учтено условие(a<b,c<d)")}
} catch (e: Exception) {
    println ("Введено не числовое значение")}



    //Задание 46
try {
    print("Введите номер дня недели: ")
    val num = readLine()!!.toInt()
    when (num) {
        1 -> println("Рабочий день")
        2 -> println("Рабочий день")
        3 -> println("Рабочий день")
        4 -> println("Рабочий день")
        5 -> println("Рабочий день")
        6 -> println("Выходной день")
        7 -> println("Выходной день")
    }
} catch (num: Exception) {
    println ("Введено не числовое значение")
}






}