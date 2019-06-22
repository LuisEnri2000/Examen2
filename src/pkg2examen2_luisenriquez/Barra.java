/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2examen2_luisenriquez;

import javax.swing.JProgressBar;


/**
 *
 * @author Luis Enriquez
 */
class Barra implements Runnable{
    private JProgressBar labarra;
    boolean vive = true;

    public Barra(JProgressBar bar) {
        // Constructor
        labarra = bar;
        
    }


    @Override
    public void run() {

        while (vive) { 
            
            if (labarra.getValue() < 10) {
                labarra.setValue(labarra.getValue() + 1);
            }else{
                labarra.setValue(0);
                vive = false;
            }          
            
            try {
                Thread.sleep(15);
                
            } catch (InterruptedException e) {
                // No hay errores
            }
        }
    }
}
