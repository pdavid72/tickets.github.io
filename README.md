# EJERCICIO 1

Una aplicación que necesita un coordinador de ventas de un aeropuerto, que desea calcular el promedio de 5 (cinco) dias (lunes - viernes) de un vendedor de una aerolinea determinada. Este aeropuerto evalúa a los vandedores de forma permanente y calcula el promedio general de la aerolinea. Como información básica de cada vendedor se debe registrar el número de identificación, su nombre y la aerolina que realiza la venta.

# ANALISIS DEL EJERCICIO
![jira](https://github.com/pdavid72/tickets.github.io/assets/120527086/ba62ddb2-6b35-4013-b39a-e3f6383f2d6a)

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

# DIAGRAMA DE FLUJO
![_Diagrama de flujo](https://github.com/pdavid72/tickets.github.io/assets/120527086/5fafdc66-f482-4b10-b8c2-d50ac63fa067)

# SEUDOCODIGO
Inicio
    Caracteres: identificaciones [50], nombres [50], aerolineas [50]
    Real: lunes [50], martes [50], miercoles [50], jueves [50], viernes [50]
    Caracteres: identificacion, nombre, aerolinea
    Entero: numeroVendedores, i
    Real: vLunes, vMartes, vMiercoles, vJueves, vViernes, promedio <- 0
    Imprimir: ‘Digite el número de vendedores:’
    Asignar: numeroVendedores
    Para i=0 hasta numeroVendedores - 1, 1
    Imprimir: ‘Digite la identificación del vendedor:’
    Asignar: identificacion
    Imprimir: ‘Digite el nombre del vendedor:’
    Asignar: nombre
    Imprimir: ‘Digite nombre de la aerolinea:’
    Asignar: aerolinea
    Imprimir: ‘Digite ventas del lunes de ’ + nombre
    Asignar: vLunes
    Imprimir: ‘Digite las ventas del martes de ’ + nombre
    Asignar: vMartes
    Imprimir: ‘Digite las ventas del miercoles de ’ + nombre
    Asignar: vMiercoles
    Imprimir: ‘Digite las ventas del jueves de ’ + nombre
    Asignar: vJueves
    Imprimir: ‘Digite las ventas del viernes de ’ + nombre
    Asignar: vViernes
    identificaciones[i] <- identificacion
    nombres [i] <- nombre
    aerolineas [i] <- aerolinea
    vLunes[i] <- lunes
    vMartes[i] <- martes
    vMiercoles[i] <- miercoles
    vJueves[i] <- jueves
    vViernes[i] <- viernes
    finPara
    Para i=0 hasta numeroVendedores -1, 1
    promedio <-
    promedio +((vLunes[i]+vMartes[i]+vMiercoles[i]+vJueves[i]+vViernes[i])/5)numeroVendedores
    finPara
    Imprimir: ‘El promedio es:’ + promedio
 Fin





