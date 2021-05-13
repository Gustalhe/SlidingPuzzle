/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quebracabeca;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class Cronometro extends TimerTask {

    int seg = 0;
    int zero = 0;
    int min = 0;
    int miliseg = 1;
    boolean teste;
    int controll = 0;
    public static int segundosFeitosJogador;
    public static int minutosFeitosJogador;
    public static int milisegFeitosJogador;

    @Override
    public void run() {

        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
        }

        miliseg++;

        milisegFeitosJogador = miliseg;

        if (FormMenu.veriNumberEasy == true) {
            FormEasyNumber.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriLetraEasy == true) {
            FormEasyLetter.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriImageEasy == true) {
            FormEasyImage.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriNumberMedium == true) {
            FormMediumNumber.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriImageMedium == true) {
            FormMediumImage.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriLetraMedium == true) {
            FormMediumLetter.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriLetraHard == true) {
            FormHardLetter.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriNumberHard == true) {
            FormHardNumber.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }
        if (FormMenu.veriImageHard == true) {
            FormHardImage.setTextoCronometroMilisegundos(Integer.toString(miliseg));
        }

        if (miliseg == 1000) {
            miliseg = 0;
            seg++;
            segundosFeitosJogador = seg;
            if (seg < 10) {
                if (FormMenu.veriNumberEasy == true) {
                    FormEasyNumber.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriImageEasy == true) {
                    FormEasyImage.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriLetraEasy == true) {
                    FormEasyLetter.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriNumberMedium == true) {
                    FormMediumNumber.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriImageMedium == true) {
                    FormMediumImage.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriLetraMedium == true) {
                    FormMediumLetter.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriLetraHard == true) {
                    FormHardLetter.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriNumberHard == true) {
                    FormHardNumber.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }
                if (FormMenu.veriImageHard == true) {
                    FormHardImage.setTextoCronometroSegundos(Integer.toString(zero) + (Integer.toString(seg)));
                }

            }

        } else if (seg >= 10) {
            segundosFeitosJogador = seg;

            if (FormMenu.veriNumberEasy == true) {
                FormEasyNumber.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriImageEasy == true) {
                FormEasyImage.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriLetraEasy == true) {
                FormEasyLetter.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriNumberMedium == true) {
                FormMediumNumber.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriImageMedium == true) {
                FormMediumImage.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriLetraMedium == true) {
                FormMediumLetter.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriLetraHard == true) {
                FormHardLetter.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriNumberHard == true) {
                FormHardNumber.setTextoCronometroSegundos(Integer.toString(seg));
            }
            if (FormMenu.veriImageHard == true) {
                FormHardImage.setTextoCronometroSegundos(Integer.toString(seg));
            }

        }
        if (seg == 60) {
            seg = 0;
            min++;

            minutosFeitosJogador = min;
            if (min < 10) {

                if (FormMenu.veriNumberEasy == true) {
                    FormEasyNumber.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriImageEasy == true) {
                    FormEasyImage.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriLetraEasy == true) {
                    FormEasyLetter.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriNumberMedium == true) {
                    FormMediumNumber.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriImageMedium == true) {
                    FormMediumImage.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriLetraMedium == true) {
                    FormMediumLetter.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriLetraHard == true) {
                    FormHardLetter.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriNumberHard == true) {
                    FormHardNumber.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }
                if (FormMenu.veriImageHard == true) {
                    FormHardImage.setTextoCronometroMinutos(Integer.toString(zero) + Integer.toString(min));
                }

            } else if (min >= 10) {
                minutosFeitosJogador = min;

                if (FormMenu.veriNumberEasy == true) {
                    FormEasyNumber.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriImageEasy == true) {
                    FormEasyImage.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriLetraEasy == true) {
                    FormEasyLetter.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriNumberMedium == true) {
                    FormMediumNumber.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriImageMedium == true) {
                    FormMediumImage.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriLetraMedium == true) {
                    FormMediumLetter.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriLetraHard == true) {
                    FormHardLetter.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriNumberHard == true) {
                    FormHardNumber.setTextoCronometroMinutos(Integer.toString(min));
                }
                if (FormMenu.veriImageHard == true) {
                    FormHardImage.setTextoCronometroMinutos(Integer.toString(min));
                }

            }
        }
    }

}
