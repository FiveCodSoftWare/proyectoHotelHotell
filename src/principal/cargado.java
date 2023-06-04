package principal;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Random;
import javafx.scene.layout.Background;
import javax.swing.*;

public class cargado implements Runnable {

    public boolean iterar;
    public JButton rojo;
    public JButton amarillo;
    public JButton verde;
    public JButton azul;

    public JLabel imagen1;
    public JLabel imagen2;
    public JLabel imagen3;
    public JLabel imagen4;

    public int contador = 0, temp = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0;

    public cargado(JButton entrada1, JButton entrada2, JButton entrada3, JButton entrada4) {

        this.rojo = entrada1;
        this.amarillo = entrada2;
        this.verde = entrada3;
        this.azul = entrada4;

    }

    public String llenarImaagenesEnVector(int numero) {
        String seleccionado = null;
        String vector[] = {
            "/ImAleatoria/1.jpg",
            "/ImAleatoria/2.jpg",
            "/ImAleatoria/3.jpg",
            "/ImAleatoria/4.jpg",
            "/ImAleatoria/5.jpg",
            "/ImAleatoria/6.jpg",
            "/ImAleatoria/7.jpg",
            "/ImAleatoria/8.jpg",
            "/ImAleatoria/9.jpg",
            "/ImAleatoria/10.jpg",
            "/ImAleatoria/11.jpg",
            "/ImAleatoria/12.jpg",
            "/ImAleatoria/14.jpg",
            "/ImAleatoria/15.jpg",
            "/ImAleatoria/16.jpg",
            "/ImAleatoria/17.jpg",
            "/ImAleatoria/18.jpg",
            "/ImAleatoria/19.jpg",
             "/ImAleatoria/20.jpg",
            "/ImAleatoria/21.jpg",
            "/ImAleatoria/22.jpg",
            "/ImAleatoria/23.jpg",
            "/ImAleatoria/24.jpg",
            "/ImAleatoria/25.jpg",
             "/ImAleatoria/26.jpg",
            "/ImAleatoria/27.jpg",
            "/ImAleatoria/28.jpg",
            "/ImAleatoria/29.jpg",
            "/ImAleatoria/30.jpg",
            "/ImAleatoria/31.jpg",
             "/ImAleatoria/32.jpg",
            "/ImAleatoria/33.jpg",
            "/ImAleatoria/34.jpg",
            "/ImAleatoria/35.jpg",
            "/ImAleatoria/36.jpg",
            "/ImAleatoria/37.jpg",
             "/ImAleatoria/38.jpg",
            "/ImAleatoria/39.jpg",
            "/ImAleatoria/40.jpg",
            "/ImAleatoria/41.jpg",
            "/ImAleatoria/42.jpg",
            "/ImAleatoria/43.jpg",
             "/ImAleatoria/44.jpg",
            "/ImAleatoria/45.jpg",
            "/ImAleatoria/46.jpg",
            "/ImAleatoria/47.jpg",
            "/ImAleatoria/48.jpg",
            "/ImAleatoria/50.jpg"
            
        };
        try {
            if (numero == 13 || numero == 12) {
                seleccionado = vector[12].toString();
            } else {
                seleccionado = vector[numero].toString();
            }

        } catch (Exception e) {
        }

        return seleccionado;
    }

    public int generarRandom() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int valorDado = (int) Math.floor(Math.random() * 6 + 1);
        return valorDado;
    }

    @Override
    public void run() {
        int numero = 0;

        while (iterar) {

            contador++;

            if (contador >= 1 && contador <= 5) {
                temp++;

            }
            if (contador == 1) {

                numero = generarRandom();
                ///////
                rojo.setIcon(new ImageIcon(getClass().getResource(llenarImaagenesEnVector(numero + 1))));
                numero = 0;

            }

            if (contador >= 6 && contador <= 11) {
                temp2++;

            }
            if (contador == 3) {

                numero = generarRandom();
                ///////
                amarillo.setIcon(new ImageIcon(getClass().getResource(llenarImaagenesEnVector(numero + 1))));
                //amarillo.setBackground(Color.yellow);

            }

            if (contador >= 12 && contador <= 21) {
                temp3++;

            }
            if (contador == 5) {

                numero = generarRandom();
                ///////
                verde.setIcon(new ImageIcon(getClass().getResource(llenarImaagenesEnVector(numero + 1))));

            }

            if (contador >= 22 && contador <= 32) {
                temp4++;

            }
            if (contador == 8) {

                numero = generarRandom();
                ///////

                amarillo.setIcon(new ImageIcon(getClass().getResource(llenarImaagenesEnVector(numero + 1))));

            }

            if (contador >= 34 && contador <= 43) {
                temp5++;

            }
            if (contador == 11) {

                numero = generarRandom();
                ///////
                azul.setIcon(new ImageIcon(getClass().getResource(llenarImaagenesEnVector(numero + 1))));
                //amarillo.setBackground(Color.yellow);

            }
            if (contador == 13) {
                contador = 0;
                temp = 0;
                temp2 = 0;
                temp3 = 0;
                temp4 = 0;
                temp5 = 0;

            }

            try {
                sleep(900);
            } catch (Exception e) {
            }

        }
    }

    public void start() {
        iterar = true;
        new Thread(this).start();
    }

    public void detener() {
        iterar = false;
    }

    public void reiniciar() {
        contador = 0;
        temp = 0;
        temp2 = 0;
        temp3 = 0;
        temp4 = 0;
        temp5 = 0;

    }
}
