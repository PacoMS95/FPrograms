//importamos las librerías

import java.io.*;
import java.util.*;

public class examenDiciembre {

	public static void main(String[] args) {
		char repeticion = ' ';
		int opcionMenuPrincipal = 0;
		Scanner teclado = new Scanner(System.in);
		int opcionMenuFechas = 0;
		int opcionFiguras = 0;
		int resultadoDeLaComparacion = 0;
		int hours1 = 0;
		int hours2 = 0;
		int minutes1 = 0;
		int minutes2 = 0;
		int seconds1 = 0;
		int seconds2 = 0;
		int base = 0; // tamaño de la base del triángulo
		char caracterTriangulo = ' ';
		int anio1 = 0;
		int anio2 = 0;
		int mes1 = 0;
		int mes2 = 0;
		int dia1 = 0;
		int dia2 = 0;
		do {

			do {
				System.out.println("Hola! Seleccione la opcion que quiera");
				System.out.println("1.- Operaciones con fechas");
				System.out.println("2.- Pintar figuras");

				opcionMenuPrincipal = teclado.nextInt();

			} while (opcionMenuPrincipal < 1 || opcionMenuPrincipal > 2);

			if (opcionMenuPrincipal == 1) {

				do {
					System.out.println("Elija la opcion deseada");
					System.out.println("1.- Comparar horas");
					System.out.println("2.- Diferencia entre fechas");
					opcionMenuFechas = teclado.nextInt();

				} while (opcionMenuFechas < 1 || opcionMenuFechas > 2);

				switch (opcionMenuFechas) {
				case 1:

					do {
						System.out.println("Introduzca la primera hora");
						hours1 = teclado.nextInt();
					} while (hours1 > 24 || hours1 < 0);
					do {
						System.out
								.println("Introduzca los minutos de la primera hora");
						minutes1 = teclado.nextInt();
					} while (minutes1 < 0 || minutes1 > 59);

					do {
						System.out
								.println("Introduzca los segundos de la primera hora");
						seconds1 = teclado.nextInt();
					} while (seconds1 < 0 || seconds1 > 59);

					do {
						System.out.println("Introduzca la segunda hora");
						hours2 = teclado.nextInt();
					} while (hours2 > 24 || hours1 < 0);

					do {
						System.out
								.println("Introduzca los minutos de la segunda hora");
						minutes2 = teclado.nextInt();

					} while (minutes2 < 0 || minutes2 > 59);

					do {
						System.out
								.println("Introduzca los segundos de la segunda hora");
						seconds2 = teclado.nextInt();
					} while (seconds2 < 0 || seconds2 > 59);

					resultadoDeLaComparacion = compareHours.compareHours(
							hours1, minutes1, seconds1, hours2, minutes2,
							seconds2);

					switch (resultadoDeLaComparacion) {
					case 1:
						System.out
								.println("La fecha primera es anterior a la segunda");
						break;
					case 2:
						System.out.println("Las dos fechas son iguales");
						break;
					case 3:
						System.out
								.println("La fecha segunda es anterior a la primera");
						break;

					}
					break;
				case 2:

					do {
						System.out.println("Introduzca el primer año");
						anio1 = teclado.nextInt();
					} while (anio1 < 1582);

					do {
						System.out.println("Introduzca el mes del primer año");
						mes1 = teclado.nextInt();
					} while (mes1 < 1 || mes1 > 12);

					if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7
							|| mes1 == 9 || mes1 == 11) {

						do {
							System.out
									.println("Introduzca el dia del primer año");
							dia1 = teclado.nextInt();
						} while (dia1 < 1 || dia1 > 31);

					} else {
						if (mes1 == 2) {
							do {
								System.out
										.println("Introduzca el dia del primer año");
								dia1 = teclado.nextInt();
							} while (dia1 < 1 || dia1 > 28);

						} else {
							do {
								System.out
										.println("Introduzca el dia del primer año");
								dia1 = teclado.nextInt();
							} while (dia1 < 1 || dia1 > 30);

						}

						do {
							System.out.println("Introduzca el segundo año");
							anio2 = teclado.nextInt();
						} while (anio2 < 1582);

						do {
							System.out
									.println("Introduzca el mes del segundo año");
							mes2 = teclado.nextInt();
						} while (mes2 < 1 || mes2 > 12);

						if (mes2 == 1 || mes2 == 3 || mes2 == 5 || mes2 == 7
								|| mes2 == 9 || mes2 == 11) {

							do {
								System.out
										.println("Introduzca el dia del primer año");
								dia2 = teclado.nextInt();
							} while (dia2 < 1 || dia2 > 31);

						} else {
							if (mes2 == 2) {
								do {
									System.out
											.println("Introduzca el dia del primer año");
									dia2 = teclado.nextInt();
								} while (dia2 < 1 || dia2 > 28);

							} else {
								do {
									System.out
											.println("Introduzca el dia del primer año");
									dia2 = teclado.nextInt();
								} while (dia2 < 1 || dia2 > 30);

							}
						}

					}
				}

				differenceBetDates.differenceBetDates(anio1, mes1, dia1, anio2,
						mes2, dia2);
				break;

			} else {

				do {
					System.out.println("Elija la opcion deseada");
					System.out.println("1.- Pintar triangulo");
					System.out.println("2.- Pintar prisma");
					opcionFiguras = teclado.nextInt();
				} while (opcionFiguras < 1 || opcionFiguras > 2);

				switch (opcionFiguras) {
				case 1:

					do {
						System.out.println("Introduzca la base");
						base = teclado.nextInt();
					} while (base != 3 && base != 5 && base != 7 && base != 9);

					System.out.println("Introduzca el caracter");
					caracterTriangulo = teclado.next().charAt(0);

					pintarTriangulo.pintarTriangulo(base, caracterTriangulo);
					break;
				case 2:
					System.out.println("En construccion");
					break;
				}
			}

			do {

				System.out.println("Desea repetir? S para si y N para no");
				repeticion = Character.toUpperCase(teclado.next().charAt(0));

			} while (repeticion != 'S' && repeticion != 'N');

		} while (repeticion == 'S');

	}
}
