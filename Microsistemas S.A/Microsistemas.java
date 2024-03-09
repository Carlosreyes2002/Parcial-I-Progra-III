import java.util.LinkedList;
import java.util.Queue;

public class Microsistemas {
    private Queue<String> solicitudes;

    public Microsistemas() {
        solicitudes = new LinkedList<>();
    }

    public void recibirSolicitud(String solicitud) {
        solicitudes.offer(solicitud); 
    }

    public void atenderSolicitudes() {
        while (!solicitudes.isEmpty()) {
            String solicitud = solicitudes.poll(); 
          

            System.out.println("Atendiendo solicitud: " + solicitud);
            
        }
    }

    public static void main(String[] args) {
        Microsistemas helpDesk = new Microsistemas();
        helpDesk.recibirSolicitud("Solicitud 1");
        helpDesk.recibirSolicitud("Solicitud 2");
        helpDesk.recibirSolicitud("Solicitud 3");

        helpDesk.atenderSolicitudes();
    }
}