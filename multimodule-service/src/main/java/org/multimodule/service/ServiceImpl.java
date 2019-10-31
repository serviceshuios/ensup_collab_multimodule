package org.multimodule.service;

import org.multimodule.dao.DaoImpl;

public class ServiceImpl {
	DaoImpl dao = new DaoImpl();
	
public String ajouterPersonne(){
	dao.methode1();
	return "ajout personne";
}
public String ajouterVoiture(){
	dao.methode1();
	return "ajout voiture";
}
}
