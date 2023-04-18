public interface VoyageVisitor {

	/**
	 * 
	 * @param adminVoyage
	 */
	String visitAdminVoyage(AdminVoyage adminVoyage);

	/**
	 * 
	 * @param clientVoyage
	 */
	String visitClientVoyage(ClientVoyage clientVoyage);

	/**
	 * 
	 * @param Voyage
	 */
	void visitVoyage(int Voyage);

}