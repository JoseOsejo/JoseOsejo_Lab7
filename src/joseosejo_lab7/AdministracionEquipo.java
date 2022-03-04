/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joseosejo_lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    //agregarEquipo
    public void setEquipo(Equipo e) {
        this.equipos.add(e);
    }

     public void escribirArchivo()throws IOException{
         FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getedad() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
     }







    
    }
