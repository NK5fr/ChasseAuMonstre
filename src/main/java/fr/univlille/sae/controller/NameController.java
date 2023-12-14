package fr.univlille.sae.controller;

import javafx.scene.control.TextField;

/**
 * Cette classe correspond au TextField pour changer le nom des joueurs
 *
 * @author Nathan Desmee, Valentin Thuillier, Armand Sady, Théo Lenglart
 * @version 1.0
 */
public class NameController extends TextField {
    public NameController(boolean isMonster) {
        setMinWidth(200);
        setText(isMonster ? "Monster" : "Hunter");
    }
}
