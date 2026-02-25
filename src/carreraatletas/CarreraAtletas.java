
package carreraatletas;

import java.util.ArrayList;
import java.util.List;

public class CarreraAtletas {
    
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("    CARRERA DE ATLETAS");
        System.out.println("=================================\n");
        
        // Configuración de la carrera
        int trackLength = 12;
        
        // Crear lista de atletas
        List<Atleta> atletas = new ArrayList<>();
        
        // Agregar atletas con sus sprints
        atletas.add(new Atleta("ECU", new int[]{2, 1, 3, 0, 2}));
        atletas.add(new Atleta("PER", new int[]{1, 2, 2, 2, 2}));
        
        // También podemos agregar más si queremos probar
        // atletas.add(new Atleta("COL", new int[]{3, 0, 2, 1, 1}));
        
        // Ejecutar la carrera
        simularCarrera(atletas, trackLength);
    }
    
    public static void simularCarrera(List<Atleta> atletas, int trackLength) {
        int tick = 1;
        boolean carreraTerminada = false;
        List<String> ganadores = new ArrayList<>();
        
        while (!carreraTerminada) {
            System.out.println("\n--- TICK " + tick + " ---");
            
            // Avanzar cada atleta
            for (Atleta a : atletas) {
                a.avanzar(trackLength);
            }
            
            // Mostrar posiciones
            for (Atleta a : atletas) {
                String pista = a.dibujarPista(trackLength);
                String estado = a.haTerminado() ? " (FIN)" : "";
                System.out.println(a.getPais() + " | " + pista + estado);
            }
            
            // Verificar si alguien terminó en este tick
            for (Atleta a : atletas) {
                if (a.haTerminado() && !ganadores.contains(a.getPais())) {
                    ganadores.add(a.getPais());
                }
            }
            
            // Si hay ganadores, terminar carrera
            if (!ganadores.isEmpty()) {
                carreraTerminada = true;
            } else {
                tick++;
            }
        }
        
        // Mostrar resultado final
        System.out.println("\n=================================");
        System.out.println("         RESULTADO FINAL");
        System.out.println("=================================");
        
        if (ganadores.size() == 1) {
            System.out.println("🏆 GANADOR: " + ganadores.get(0));
        } else {
            System.out.println("🤝 EMPATE entre: " + String.join(" y ", ganadores));
        }
        
        // Mostrar posiciones finales
        System.out.println("\nPosiciones finales:");
        for (Atleta a : atletas) {
            String estado = a.haTerminado() ? "🏁 LLEGÓ" : "❌ No terminó";
            System.out.println(a.getPais() + ": posición " + (a.getPosicion() + 1) + " - " + estado);
        }
    }
}
