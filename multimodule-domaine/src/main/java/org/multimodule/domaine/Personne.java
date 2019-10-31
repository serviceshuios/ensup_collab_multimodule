package org.multimodule.domaine;

/**
 * Hello world!
 *
 */
public class Personne {
	private int idPersone;
	private String nom;
	private String prenom;

	public Personne() {
		super();
	}

	public Personne(int idPersone, String nom, String prenom) {
		super();
		this.idPersone = idPersone;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdPersone() {
		return idPersone;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setIdPersone(int idPersone) {
		this.idPersone = idPersone;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {

		return "Personne [idPersone=" + idPersone + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
