

//1. Create a list called "lista" with the elements "rojo", "blanco", "negro"

val lista = Lista("rojo","blanco","negro")

//2. Add 5 more items to "lista" "verde" ,"amarillo", "azul", "naranja", "perla"

val list= collection.mutable.Set("rojo","blanco","negro")
lista+="verde"
lista+= "amarillo"
lista+="azul"
lista+= "naranja"
lista+="perla"

//3. Bring the items "verde" ,"amarillo" and "azul" from "lista" 

lista(3)
lista(4)
lista(5)


//-----------------------------------------------------

//4. Create an Array of numbers in the range 1-1000 in steps of 5 by 5

val arreglo  = Array.range(1, 1000, 5)


//-----------------------------------------------------

// 5. What are the unique elements of the list lista(1,3,3,4,6,7,3,7)  use conversion to sets
val lista = List(1,3,3,4,6,7,3,7)
list.toSet


//-----------------------------------------------------

//6.  Create a map mutable named Names containing the following elements: "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

val mapa = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23),("Susana","27"))

// 6a . Print all map keys
mapa.keys
// 6b . Add the following value to the map ("Miguel", 23)
mapa += ("Miguel" -> 23)