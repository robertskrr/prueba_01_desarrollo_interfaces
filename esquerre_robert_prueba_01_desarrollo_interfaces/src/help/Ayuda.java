/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package help;

import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;

/**
 *
 * @author Robert
 */
public class Ayuda {

    private HelpBroker hb;

    public Ayuda() {
        try {
            ClassLoader cl = Ayuda.class.getClassLoader();
            URL hsURL = HelpSet.findHelpSet(cl, "help/help.hs");
            HelpSet hs = new HelpSet(cl, hsURL);
            hb = hs.createHelpBroker();
        } catch (HelpSetException e) {
            e.printStackTrace();
        }
    }

    public void mostrarAyuda() {
        if (hb != null) {
            hb.setDisplayed(true);
        }
    }
}
