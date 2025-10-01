Algoritmo sin_titulo
	Repetir
		Escribir "Introduce tu edad"
		Leer n1
	Hasta Que n1 < 100
	Si n1<=12 Entonces
		Escribir "Eres un niño"
	SiNo
		Si n1<=17 Entonces
			Escribir "Eres un adolescente"
		SiNo
			Si n1<=29 Entonces
				Escribir "Eres un joven"
			SiNo
				Escribir "Eres adulto"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
