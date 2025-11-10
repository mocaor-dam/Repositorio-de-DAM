public class Practica1 {
    static void main(String[] args) {
        String[] estados = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Carolina del Norte", "Carolina del Sur", "Colorado", "Connecticut", "Dakota del Norte", "Dakota del Sur", "Delaware", "Distrito de Columbia", "Florida", "Georgia", "Hawái", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Luisiana", "Maine", "Maryland", "Massachusetts", "Míchigan", "Minnesota", "Mississippi", "Misuri", "Montana", "Nebraska", "Nevada", "Nueva Jersey", "Nueva York", "Nuevo Hampshire", "Nuevo México", "Ohio", "Oklahoma", "Oregón", "Pensilvania", "Rhode Island", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Virginia Occidental", "Washington", "Wisconsin", "Wyoming"};
        int[] electores = {9, 3, 11, 6, 55, 15, 9, 9, 7, 3, 3, 3, 3, 29, 16, 4, 4, 20, 11, 6, 6, 8, 8, 4, 10, 11, 16, 10, 6, 10, 3, 5, 6, 14, 29, 4, 5, 18, 7, 7, 20, 4, 11, 38, 6, 3, 13, 5, 12, 10, 3};
        int[] votoDemocrata = {729547, 116454, 1161167, 380494, 8753788, 1338870, 897572, 235603, 282830, 4504975, 1877963, 266891, 189765, 3090729, 1033126, 653669, 427005, 628854, 780154, 715326, 1677928, 1995196, 2268839, 1367716, 485131, 1071068, 177709, 568988, 539260, 348526, 2148278, 385234, 4556124, 2189316, 93758, 2394164, 420375, 1002106, 2926441, 252525, 855373, 117458, 870695, 3877868, 310676, 178573, 1981473, 1742718, 188794, 1382536, 55973};
        int[] votoRepublicano = {1318255, 163387, 1252401, 684872, 4483810, 1202484, 673215, 185127, 12723, 4617886, 2089104, 128847, 409055, 2146015, 1557286, 800983, 671018, 1202971, 1178638, 671154, 943169, 1090893, 2279543, 1322951, 700714, 1594511, 279240, 991922, 512058, 345790, 1601933, 319667, 2819534, 2362631, 216794, 2841005, 949136, 782403, 2970733, 180543, 1155389, 227721, 1522925, 4685047, 515231, 95369, 1769443, 1221747, 489371, 1405284, 174419};

        int electoresDemocratas = 0;
        int electoresRepublicanos = 0;

        int totalVotosDemocratas = 0;
        int totalVotosRepublicanos = 0;

        int estadosDemocratas = 0;
        int estadosRepublicanos = 0;

        int maxElectoresD = 0;
        int maxElectoresR = 0;

        int indiceMaxD = -1;
        int indiceMaxR = -1;

        for (int i = 0; i < electores.length; i++) {
            if (votoDemocrata[i] > votoRepublicano[i]) {
                electoresDemocratas += electores[i];
                //Sumamos uno al contador de Estados
                estadosDemocratas++;
                if (electores[i] > maxElectoresD){
                    maxElectoresD = electores[i];
                    indiceMaxD = i;
                }
            }
            else {
                electoresRepublicanos += electores[i];
                estadosRepublicanos++;
                if (electores[i] > maxElectoresR) {
                    maxElectoresR = electores[i]; // Actualizamos el valor máximo
                    indiceMaxR = i;             // Guardamos la posición (índice)
                }
            }
            //Logica de Voto Popular
            totalVotosDemocratas += votoDemocrata[i];
            totalVotosRepublicanos += votoRepublicano[i];

        }
        // --- AQUI VA EL CÓDIGO DE IMPRESIÓN DE RESULTADOS ---

        // 1. Determinar el Presidente (por electores)
        if (electoresDemocratas > electoresRepublicanos) {
            System.out.println("\nEl Presidente elegido es del partido Demócrata");
        } else {
            System.out.println("\nEl Presidente elegido es del partido Republicano");
        }
        // 2. Mostrar electores totales (RA 1a)
        System.out.println("Electores totales Demócratas: " + electoresDemocratas);
        System.out.println("Electores totales Republicanos: " + electoresRepublicanos);

        // 3. Determinar el partido más votado (por voto popular)
        if (totalVotosDemocratas>totalVotosRepublicanos){
            System.out.printf("El partido mas votado es el Demócrata con %d votos. \n", totalVotosDemocratas);
        } else {
            System.out.printf("El partido mas votado es el Republicano con %d votos \n", totalVotosRepublicanos);
        }

        //Muestro numero de Estados democratas y numero de estados republicanos
        System.out.println("Numero de estados Demócratas: " + estadosDemocratas);
        System.out.println("Numero de estados Republicanos: " + estadosRepublicanos);


        //Resultado Democrata
        if (indiceMaxD != -1) {
            System.out.printf("El estado que más electores aportó al partido Demócrata fue %s con %d electores.\n", estados[indiceMaxD], maxElectoresD);
        }
        //Resultado Republicano
        if (indiceMaxR != -1){
            System.out.printf("El estado que más electores aportó al partido Republicano fue %s con %d electores.\n", estados[indiceMaxR], maxElectoresR);
        }
    }
    }
