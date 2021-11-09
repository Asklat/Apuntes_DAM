/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Crono;

import java.util.logging.Formatter;
import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class Crono extends Thread {

    private CronoMinutos cm;
    private CronoSegundos cs;
    private CronoMiliSegunos cms;
    private String cronoVista;
    private JLabel label;
    private boolean pausado;
    private Formatter obj;

    public Crono(JLabel label) {
        obj = new Formatter();
        cm = new CronoMinutos();
        cs = new CronoSegundos();
        cms = new CronoMiliSegunos();
        pausado = false;
        format();
        this.label = label;
        this.label.setText(cronoVista);
    }

    public void run() {

        while (!Thread.currentThread().isInterrupted()) {

            try {
                synchronized (this) {
                    if (pausado) {
                        this.wait();
                    }
                }
                cms.contador();
                if (cms.getMilisegundos() == 1000) {
                    cms.reiniciar();
                    cs.contador();
                    if (cs.getSegundos() == 60) {
                        cs.reiniciar();
                        cm.contador();
                        if (cm.getMinutos() == 60) {
                            cm.reiniciar();
                        }
                    }
                }

                format();
                label.setText(cronoVista);
                this.sleep(1);

            } catch (InterruptedException ex) {
                this.interrupt();
            }
        }
    }

    public synchronized void pausar() {
        pausado = true;
        notify();
    }

    public synchronized void reanudar() {
        pausado = false;
        notify();
    }

    public void reset() {
        cm.reiniciar();
        cs.reiniciar();
    }

    public CronoMinutos getCm() {
        return cm;
    }

    private void format() {
        if (cm.getMinutos() < 10) {
            cronoVista = "0" + cm.getMinutos() + " : ";
        } else {
            cronoVista = cm.getMinutos() + " : ";
        }

        if (cs.getSegundos() < 10) {
            cronoVista += "0" + cs.getSegundos() + " : ";
        } else {
            cronoVista += cs.getSegundos() + " : ";
        }
        
        cronoVista += contarCerosMiliSegundos() + cms.getMilisegundos();
    }
    
    private String contarCerosMiliSegundos(){
            String ceros = "";
            ceros = String.valueOf(obj.format("%05d", cms.getMilisegundos()));
            return ceros;
        }
}
