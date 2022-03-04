/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joseosejo_lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class AdministracionEquipo {

    private ArrayList<Equipo> equipos = new ArrayList();
    private File archivoEquipos = null;

    public AdministracionEquipo(String path) {
        archivoEquipos = new File(path);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public File getArchivoEquipos() {
        return archivoEquipos;
    }

    public void setArchivoEquipos(File archivoEquipos) {
        this.archivoEquipos = archivoEquipos;
    }

    @Override
    public String toString() {
        return "AdministracionEquipo{" + "archivoEquipos=" + archivoEquipos + '}';
    }

      
     public void escribirArchivo()throws IOException{
         FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivoEquipos, true);
            bw = new BufferedWriter(fw);
            for (Equipo equipo : equipos) {
                bw.write(equipo.getNombreEquipo() + ";");
                bw.write(equipo.getPartidosJugados() + ";");
                bw.write(equipo.getPartidosGanados() + ";");
                bw.write(equipo.getPartidosEmpatados() + ";");
                bw.write(equipo.getPartidosPerdidos() + ";");
                bw.write(equipo.getGolesFavor() + ";");
                bw.write(equipo.getGolesContra() + ";");
                bw.write(equipo.getDiferenciaGoles()+ ";");
                bw.write(equipo.getPuntos()+";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
     }


     public void cargarArchivo(){
          Scanner sc = null;
        equipos = new ArrayList();
        if (archivoEquipos.exists()) {
            try {
                sc = new Scanner(archivoEquipos);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    equipos.add(new Equipo(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
     }




    
    }
