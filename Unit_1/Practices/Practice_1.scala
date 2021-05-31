

//1. Develop a scala algorithm that calculates the radius of a circle
val p=20
val pi=3.1416
var radio = p/(2*pi)
println("El Radio del Circulo es " + radio)

//--------------------------------------------------------

//2. Develop a scala algorithm that tells  if a number is prime

if((5%2)==0) println("no es primo") else println("es primo")

//-----------------------------------------------------

//3. Use the interpolation of string to print  "Estoy ecribiendo un tweet"
 val bird = "tweet"

val fraseC = s"estoy escribiendo un $bird"

//-----------------------------------------------------

//4. Use de Slice to extract the word "luke"
var mensaje = "hola luke yo soy tu padre!" 
mensaje slice (5,9)


//-----------------------------------------------------

// 5. Whats the difference between value and variable
val pi=3.1416 // val stand for value which means that cant be change
var radio = p/(2*pi) //var stand for variable which means that can be  change


//-----------------------------------------------------

//6.  Given the tuple (2,4,5,1,2,3,3.1416,23) return the number 3.1416 

val tupla=(2,4,5,1,2,3,3.1416,23)
println(tupla._7)
