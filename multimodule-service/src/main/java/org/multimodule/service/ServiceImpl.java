package org.multimodule.service;

public class ServiceImpl {
	DaoImpl dao = new DaoImpl();
	
public String ajouterPersonne(){
	dao.ajouterPersonne();
	return "ajout personne";
}
public String ajouterVoiture(){
	dao.ajouterVoiture();
	return "ajout voiture";
}
}
