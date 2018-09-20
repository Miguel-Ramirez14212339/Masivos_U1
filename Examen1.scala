//1
//def isEven(num:Int):num % 2==0
// def isPar(num:Int): Boolean={
//     if(num % 2 == 0){
//      return true
//     }
//   return false
// }

// 1 - Verifique solo número par
def isPar(num: Int): Boolean ={return (num % 2 == 0)}
var num = 7
println(isPar(num))

//2 - Buscar numeros pares en lista
def encuentra(lista:List[Int])={
  for(i<-lista){
    println(isPar(i))
  }
}
val lista = List(1,4,3)
encuentra(lista)

//3 - Afortunado numero 7
var sum = 0
val li = List(1,2,7)
var x = li.length
for(i<-0 to x) {
  if(li(i)==7){
    sum = sum + 14
  }else{
    sum = sum + li(i)
  }
}
println(s"La suma es $sum")

//5 - Verificar palindromo
def palindromo(word:String):Boolean ={
  return (word == word.reverse)
}
