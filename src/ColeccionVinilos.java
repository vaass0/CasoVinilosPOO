public class ColeccionVinilos {
    public static void main(String[] args) {
        String vinilos [][] = new String[100][3];

        agregarVinilo(vinilos,"Iron Maiden","Iron Maiden","1980");
        agregarVinilo(vinilos,"Iron Maiden","Killers","1981");
        agregarVinilo(vinilos,"Iron Maiden","The number of the beast","1982");
        agregarVinilo(vinilos,"AC-DC","Back in black","1980");
        agregarVinilo(vinilos,"AC-DC","Highway to Hell","1979");
        agregarVinilo(vinilos,"AC-DC","Who made who","1986");
        agregarVinilo(vinilos,"Judas Priest","British steel","1980");
        agregarVinilo(vinilos,"Judas Priest","Painkiller","1990");
        agregarVinilo(vinilos,"Judas Priest","Defender of the faith","1984");
        agregarVinilo(vinilos,"Kiss","Destroyer","1976");

        System.out.println("Espacio maximo coleccion: "+vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: "+artista);
        if (buscarArtista(vinilos,artista)) {
            mostrarBusquedaArtista(vinilos,artista);
        }


        mostrarColeccion(vinilos);



    }
    public static int totalVinilos(String vinilos[][]) {
        int totalVinilos = 0;
        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] != null) {
                totalVinilos++;
            }
        }
        return totalVinilos;
    }
    public static void mostrarTotal(String vinilos[][]){
        int total = totalVinilos(vinilos);
        System.out.println("Hay un total de: "+total+" vinilos en la colección.");
    }
    public static void agregarVinilo(String vinilos[][],String artista,String album,String year) {
        for (int i = 0; i < vinilos.length; i++) {
            if (vinilos[i][0] == null) {
                vinilos[i][0] = artista;
                vinilos[i][1] = album;
                vinilos[i][2] = year;
                break;
            }
        }
    }
    public static int disponibles(String vinilos[][]){
        int i = 0;
        int disponibles = 0;
        while( 100 > i && i != -1){
            if (vinilos[i][0] == null){
                disponibles = i;
                i = -2;
            }
            i++;
        }
        return 100-disponibles ;
    }
    public static void mostrarDisponibles(String vinilos[][]){
        int disponibles = disponibles(vinilos);
        System.out.println("Hay un total de: "+disponibles+" espacios disponibles en la colección.");
    }
    public static boolean buscarArtista(String vinilos[][], String artista){
        for (int i = 0; i < vinilos.length; i++ ){
            if (vinilos[i][0].equals(artista)){
                return true;

            }
        }
        return false;
    }
    public static void mostrarBusquedaArtista(String vinilos[][], String artista){
        for (int i = 0; i < vinilos.length; i++){
            if (vinilos[i][0].equals(artista)){
                System.out.println("El artista "+artista+" si esta en al colección.");
                break;
            } else if (vinilos[i][0] == null) {
                System.out.println("El artista "+artista+" no esta en al colección.");
                break;

            }
        }
    }
    public static void mostrarColeccion(String vinilos[][]){
        for (int i = 0; i < vinilos.length; i++){
            if (vinilos[i][0] != null){
                System.out.println(vinilos[i][0]+"-"+vinilos[i][1]+"-"+vinilos[i][2]);
            }
            else {
                break;
            }
        }
    }






}
