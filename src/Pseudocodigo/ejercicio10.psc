Algoritmo sin_titulo
	Escribir 'Pasame un caracter'
	Leer car
	Escribir 'Ahora pasame un numero'
	Leer num1
	Escribir 'Pasame otro'
	Leer num2
	Según car Hacer
		'+':
			Escribir num1+num2
		'-':
			Escribir num1-num2
		'/':
			Si num1==0 O finosaurio==0 Entonces
				Escribir 'Tonto o que?'
			SiNo
				Escribir num1/num2
			FinSi
		'*':
			Escribir num1*num2
		De Otro Modo:
			Escribir 'Esta operacion no es valida'
	FinSegún
FinAlgoritmo
