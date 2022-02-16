public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app 
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";
        String mensajeFallido = "Se nos agoto este producto, elige otra opcion";
        String mensajeDeEleccion= "Usted esta eligiendo,  ";
        
        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 8;
        double cafeFiltro = 9.0;
        double cafeConLeche = 7.5;
        double capuchino = 10.0;

    
        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";
    
        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = false;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;
    
        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
        System.out.println(cliente1 + mensajePendiente);
        System.out.println( estaListoOrden1 );
        System.out.println(mensajeFallido);
        System.out.println("******************************************************************************");
        System.out.println(saludoGeneral + cliente4);
        System.out.println( mensajeDeEleccion + "cafeFiltrado" );
        if (estaListoOrden4){
            System.out.println( cliente4 + mensajePendiente + "..." );
            System.out.println( cliente4 + mensajeListo);
            System.out.println( mensajeMostrarTotal + cafeFiltro  ); 
        }
        else{
            System.out.println(mensajeFallido);
        }
        System.out.println("*********************************************************************************");
        System.out.println(saludoGeneral + cliente2);
        System.out.println( mensajeDeEleccion + " dos cafe con leche" );
        if (estaListoOrden2){
            System.out.println( cliente2 + mensajePendiente + "..." );
            System.out.println( cliente2 + mensajeListo);
            System.out.println( mensajeMostrarTotal + (cafeConLeche + cafeConLeche)  ); 
        }
        else{
            System.out.println(mensajeFallido);
        }
        System.out.println("*********************************************************************************");

        System.out.println(saludoGeneral + cliente3);
        System.out.println( mensajeDeEleccion + "cafe filtrado" );
        if (estaListoOrden3){
            System.out.println( cliente3 + mensajePendiente + "..." );
            System.out.println( cliente3 + mensajeListo);
            System.out.println( mensajeMostrarTotal + (cafeFiltro)  );
            System.out.println( "El nuevo total es" + cafeConLeche); 
        }
        else{
            System.out.println(mensajeFallido);
        }
        System.out.println("*********************************************************************************");

    	// ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
    }
}