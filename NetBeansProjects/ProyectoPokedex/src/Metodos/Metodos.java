
package Metodos;

import Datos.Pokemon;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    Vector vPrincipal = new Vector();

    public void guardar(Pokemon unPokemon) {
        vPrincipal.addElement(unPokemon);
    }

    public void guardarArchivo(Pokemon pokemon) {
        try {
            String ruta = "Pokemones.txt"; // Puedes hacerla absoluta si lo deseas
            FileWriter fw = new FileWriter(ruta, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(pokemon.getNombre() + "|" +
                       pokemon.getTipo() + "|" +
                       pokemon.getHabilidad() + "|" +
                       pokemon.getPeso());

            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public DefaultTableModel listaPokemones() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Tipo");
        cabeceras.addElement("Habilidad");
        cabeceras.addElement("Peso");

        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);

        try {
            FileReader fr = new FileReader("Pokemones.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;

            while ((d = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(d, "|");
                Vector x = new Vector();

                while (dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }

                mdlTabla.addRow(x);
            }

            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return mdlTabla;
    }
}


