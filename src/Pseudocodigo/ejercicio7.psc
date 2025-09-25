Algoritmo sin_titulo
	Escribir 'Dime tu estado civil'
	Leer estado
	Escribir 'Dime tu edad'
	Leer edad
	Según estado Hacer
		's', 'd':
			Si edad<35 Entonces
				Escribir 'Porcentaje de retencion es 12%'
			SiNo
				Si edad>50 Entonces
					Escribir 'Porcentaje de retencion 8.5%'
				SiNo
					Escribir 'Porcentaje de retencion 10.5%'
				FinSi
			FinSi
		De Otro Modo:
			Si edad<35 Entonces
				Escribir 'Porcentaje de retencion es 11.3%'
			SiNo
				Si edad>50 Entonces
					Escribir 'Porcentaje de retencion es 8.5%'
				SiNo
					Escribir 'Porcentaje de retencion es 10.5%'
				FinSi
			FinSi
	FinSegún
FinAlgoritmo
