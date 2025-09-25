Algoritmo sin_titulo
	Escribir "Dime una hora"
	Leer hora1
	Escribir "Dime minutos"
	Leer min1
	Escribir "Dime segundos"
	Leer seg1
	Escribir "Dime otra hora"
	Leer hora2
	Escribir "Dime minutos"
	Leer min2
	Escribir "Dime segundos"
	Leer seg2
	Si hora1 > hora2 Entonces
		Escribir "hora1 es mayor"
	SiNo
		Si min1 > min2 Entonces
			Escribir "hora1 es mayor"
		SiNo
			Si seg1 > seg2 Entonces
				Escribir "hora1 es mayor"
			SiNo
				Escribir "es la misma hora"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
