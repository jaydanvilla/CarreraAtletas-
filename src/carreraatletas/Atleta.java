package carreraatletas;

public class Atleta {

    private String pais;
    private int[] sprints;
    private int posicion;
    private int tickActual;
    private boolean terminado;

    // Constructor
    public Atleta(String pais, int[] sprints) {
        this.pais = pais;
        this.sprints = sprints;
        this.posicion = -1; // Empieza fuera de la pista
        this.tickActual = 0;
        this.terminado = false;
    }

    // Getters y Setters
    public String getPais() {
        return pais;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean haTerminado() {
        return terminado;
    }

    // Avanzar según el sprint del tick actual
    public void avanzar(int trackLength) {
        if (terminado) {
            return;
        }

        // Si ya no hay más sprints, empezar de nuevo (repetir el ciclo)
        if (tickActual >= sprints.length) {
            tickActual = 0; // Reiniciamos al primer sprint
        }

        // Avanzar según el sprint actual
        posicion += sprints[tickActual];
        tickActual++;

        // Verificar si terminó
        if (posicion >= trackLength - 1) {
            posicion = trackLength - 1;
            terminado = true;
        }
    }

    // Representación del atleta en la pista
    public String dibujarPista(int trackLength) {
        StringBuilder pista = new StringBuilder();

        for (int i = 0; i < trackLength; i++) {
            if (i == posicion) {
                pista.append(pais);
                i += pais.length() - 1; // Saltar espacios que ocupa el país
            } else {
                pista.append("_");
            }
        }

        return pista.toString();
    }
}
