/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public abstract class Komento {
    protected int viimemuutos;
    protected Sovelluslogiikka sovellus;
    protected TextField tuloskentta; 
    protected TextField syotekentta; 
    protected Button plus;
    protected Button miinus;
    protected Button nollaa;
    protected Button undo;
    
    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
    }
    
    public abstract void suorita();
    public abstract void peru();
}
