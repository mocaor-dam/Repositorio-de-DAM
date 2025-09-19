Algoritmo sin_titulo
	Escribir "Introduce el tipo de producto (A-B-C)"
	Leer tipo
	Escribir "Introduce el precio del producto"
	Leer precio
	Si tipo = "b" Entonces
		Escribir "Se te aplica un 9% de descuento"
		re = precio * 0.09 
		Escribir "Tu precio es " re
	SiNo
		Si tipo = "a" Entonces
			Escribir "Se te aplica un 7%"
			re = precio * 0.07
			Escribir "Tu precio es " re
		SiNo
			Si precio < 500 Entonces
				Escribir "Se te aplica un 12%"
				re = precio * 0.12
				Escribir "Tu precio es " re
			SiNo
				Escribir "Se te aplica un 9% Por lo tanto es " re
			FinSi
		FinSi
	FinSi
FinAlgoritmo
