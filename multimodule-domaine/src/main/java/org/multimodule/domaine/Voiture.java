package org.multimodule.domaine;

public class Voiture {

	private int idVoiture;
	private String nom;

	public Voiture() {
		super();
	}

	public Voiture(int idVoiture, String nom) {
		super();
		this.idVoiture = idVoiture;
		this.nom = nom;
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public String getNom() {
		return nom;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", nom=" + nom + "]";
	}

}
