package Fabrique;
public class Compagnie {

	private String ID_compagnie;
	private int PleinTarif;
	private Voyage[] list_co_voy;
	private Transport[] list_co_trans;
	
	

	public Compagnie(String iD_compagnie, int pleinTarif) {
		super();
		ID_compagnie = iD_compagnie;
		PleinTarif = pleinTarif;
	}

	public String getID_compagnie() {
		return this.ID_compagnie;
	}

	/**
	 * 
	 * @param ID_compagnie
	 */
	public void setID_compagnie(String id) {
		this.ID_compagnie = id;
	}

	public int getPleinTarif() {
		return this.PleinTarif;
	}

	/**
	 * 
	 * @param PleinTarif
	 */
	public void setPleinTarif(int pleinTarif) {
		this.PleinTarif = pleinTarif;
	}

	public Transport[] getList_co_trans() {
		return this.list_co_trans;
	}

	/**
	 * 
	 * @param list_co_trans
	 */
	public void setList_co_trans(Transport[] list_co_trans) {
		this.list_co_trans = list_co_trans;
	}

	public Voyage[] getList_co_voy() {
		return this.list_co_voy;
	}

	/**
	 * 
	 * @param list_co_voy
	 */
	public void setList_co_voy(Voyage[] list_co_voy) {
		this.list_co_voy = list_co_voy;
	}

}