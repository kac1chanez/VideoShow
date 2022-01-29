package package1;

import java.awt.Graphics;

public class Cercle {

	 //-------------- constantes ----------------------------------------
    /**
     * rayon par d�faut du cercle
     */
    public final static int R = 5;

  //-------------- variables d'instance (attributs)--------------------
    /**
     * abscisse du centre du cercle
     */
    protected int x;

    /**
     * ordonn�es du centre du cercle
     */
    protected int y;

    /**
     * rayon du cercle
     */
    protected int r;

  // ------ Constructeurs ---------------------------------------------
    /**
     * cr�er un Cercle en fixant la position initiale de son centre et son rayon.
     *
     * @param xInit abscisse du centre du cercle
     * @param yInit ordonnée du centre du cercle
     * @param rInit rayon du cercle
     */
    public Cercle(int xInit, int yInit, int rInit) {
        this.x = xInit;
        this.y = yInit;
        this.r = rInit;
    }

    /**
     * cr�ere un Cercle en fixant la position initiale de son centre et avec la
     * valeur par d�faut pour son rayon.
     *
     * @param xInit abscisse du centre du cercle
     * @param yInit ordonn�e du centre du cercle
     */
    public Cercle(int xInit, int yInit) {
        this(xInit, yInit, R);
    }

  // ------ M�thodes -------------------------------------------------
    /**
     * retourne abscisse du centre du cercle
     aw sah c'est pas vrai non ohhhh
     *
     * @return abscisse du centre
     */
    public int getX() {
        return x;
    }

    /**
     * retourne ordonn�e du centre du cercle
     *
     * @return ordonn�e du centre
     */
    public int getY() {
        return y;
    }

    /**
     * positionne le centre du cercle en un point donn�
     *
     * @param px nouvelle abscisse du centre
     * @param py nouvelle ordonn�e du centre
     */
    public void placerA(int px, int py) {
        x = px;
        y = py;
    }

    /**
     * affiche le cercle
     *
     * @param g cet objet de classe Graphics pass� en param�tre est l'objet qui
     * prend en charge la gestion de l'affichage dans la fen�tre de dessin.
     * C'est cet objet qui g�re le contexte graphique" pour cette fen�tre.
     */
    public void dessiner(Graphics g) {
        g.drawOval(x - r, y - r, 2 * r, 2 * r);
    }
	
	
	
}
