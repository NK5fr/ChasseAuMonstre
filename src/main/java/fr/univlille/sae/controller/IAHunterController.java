package fr.univlille.sae.controller;

import fr.univlille.sae.Main;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class IAHunterController extends HBox {
    protected CheckBox IAHunter = new CheckBox();
    protected Label texte;

    public IAHunterController() {
        texte = new Label("Jouer avec IA chasseur ");
        texte.setFont(Main.loadFont(Main.ARCADE_FONT, 20));
        getChildren().addAll(texte, IAHunter);
        setAlignment(Pos.CENTER);
    }

    public boolean isSelected() {
        return IAHunter.isSelected();
    }
}
