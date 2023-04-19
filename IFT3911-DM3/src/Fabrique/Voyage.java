package Fabrique;

import Visiteur.IVisitable;
import Visiteur.VoyageVisitor;

public class Voyage implements IVisitable{

	private Compagnie compagnie;
	private Hub hub_D;
	private Hub hub_A;
	private String date_heure_D;
	private String ID_trajet;
	private boolean libre;
	private Transport trans;

	public Voyage(Compagnie compagnie, Hub hub_D, Hub hub_A, String date_heure_D, String iD_trajet, boolean libre,
			Transport trans) {
		super();
		this.compagnie = compagnie;
		this.hub_D = hub_D;
		this.hub_A = hub_A;
		this.date_heure_D = date_heure_D;
		ID_trajet = iD_trajet;
		this.libre = libre;
		this.trans = trans;
	}

	public Compagnie getCompagnie() {
		return this.compagnie;
	}

	/**
	 * 
	 * @param compagnie
	 */
	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Hub getHub_D() {
		return this.hub_D;
	}

	/**
	 * 
	 * @param hub_D
	 */
	public void setHub_D(Hub hub_D) {
		this.hub_D = hub_D;
	}

	public Hub getHub_A() {
		return this.hub_A;
	}

	/**
	 * 
	 * @param hub_A
	 */
	public void setHub_A(Hub hub_A) {
		this.hub_A = hub_A;
	}

	public String getDate_heure_D() {
		return this.date_heure_D;
	}

	public String getID_trajet() {
		return ID_trajet;
	}

	/**
	 * 
	 * @param ID_trajet
	 */
	public void setID_trajet(String ID_trajet) {
		this.ID_trajet = ID_trajet;
	}

	public boolean getLibre() {
		return this.libre;
	}

	/**
	 * 
	 * @param libre
	 */
	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public Transport getTrans() {
		return this.trans;
	}

	/**
	 * 
	 * @param trans
	 */
	public void setTrans(Transport trans) {
		this.trans = trans;
	}

	@Override
	public String accept(VoyageVisitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

}