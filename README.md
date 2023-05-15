# EJERCICIO 1

Se desea calcular el promedio de tickets vendidos por 7 dias agrupados por las 3 distintas aerolineas, luego se calcula el promedio total de los ticket vendidos. Se debe ingresar información básica de cada vendedor se debe registrar el número de identificación, su nombre y aerolinea.

# ANALISIS DEL EJERCICIO

Escenario 1: Ingresar la informacion del vendedor

Given como vendedor

*	Ingreso correctamente el documento
*	Ingreso correctamente mi nombre
*	Ingreso correctamente los tiketes vendidos

When seleccione la opcion calcular promedio

Then debo poder guardar la informacion del vendedor como:

* La identificacion
*	Nombre
*	Aerolinea
*	Ventas Lunes
*	Ventas Martes
*	Ventas Miercoles
*	Ventas Jueves
* Ventas viernes
*	Obtener promedio por aerolinea
*	Calcular promedio total de ventas

# CASOS DE USO
![Caso de uso](https://github.com/pdavid72/tickets.github.io/assets/120527086/bddf4a2f-0a0a-487d-9020-fbec96322fa5)
Nombre: Calcular promedio de tikets aerolineas
Actores: Coordinador de ventas
Proposito: Guardar identificacion, nombre, aerolinea, y los 5 resultados de ventas por dia y asi calcular el promedio vendido.
Curso normal de eventos:
1. El coordinador ingresa la cantidad de vendedores.
2. El coordinador ingresa la identificacion, nombre, aerolinea, numero de ventas del lunes, numero de ventas del martes, numero de ventas del miercoles, numero de ventas del jueves y el numero de ventas  del viernes.
3. Se calcula el promedio a partir de:
    ((vLunes + vMartes + vMiercoles + vJueves + vViernes) / 5) / #Vendedores.
4. Se Muestra el promedio de venta de los vendedores por aerolinea
Postcondiciones: Promedio de ventas calculado


