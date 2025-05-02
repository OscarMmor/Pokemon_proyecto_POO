
package Metodos;

import Datos.Pokemon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    Vector vPrincipal = new Vector();
    
    public void guardar(Pokemon unPokemon){
        vPrincipal.addElement(unPokemon);
    }
    
    public void guardarArchivo(Pokemon pokemon){
        try{
            FileWriter fw = new FileWriter("Pokemones.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(pokemon.getNumPokedex());
            pw.print("|" + pokemon.getNombre());
            pw.print("|" + pokemon.getTipo());
            pw.print("|" + pokemon.getHabilidad());
            pw.print("|" + pokemon.getPeso()); 
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaPokemones(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Numero Pokedex");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Tipo");
        cabeceras.addElement("Habilidad");
        cabeceras.addElement("Peso");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);
        
        try{
          FileReader fr = new FileReader("Pokemones.txt");
          BufferedReader br = new BufferedReader (fr);
          String d;
          while((d=br.readLine())!=null){
              StringTokenizer dato = new StringTokenizer(d, "|");
              Vector x = new Vector();
              while(dato.hasMoreTokens()){
                  x.addElement(dato.nextToken());
              }
              mdlTabla.addRow(x);
          }
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
}
