# tareaAspectos
Funcionalidad:

Se agrego una funcionalidad para que indique el numero de Suscriptores que tiene el canal.

Al escoger la opcion 3 (Numero de Suscriptores )del Main se llama a la funcion num.Suscriptores que nos devuelve el numero de suscriptores
En el aspecto un POINTCUT captura la ejecucion del metodo numSuscriptores.
Luego con el ADVICE after() se imprime por pantalla el mensanje: "Felicidades!!!!!! su canala cuenta con "+nunSus+" suscriptores"//.
