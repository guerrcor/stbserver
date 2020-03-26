package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GETController {
	
	private final String newLine = System.getProperty("line.separator");

	@GetMapping("/resume")
	public String getListSTBinXML() {
			return "Envoi de la liste des STB";
	}

	@GetMapping("/id")
	public String getSTBinXML(@RequestParam(value = "name") String texte) {
		return ("Détail de la STB demandée : " + texte);
	}
	
	@GetMapping("/test")
	public String getInfoSTBinXML(@RequestParam(value = "nb") int nb,
			@RequestParam(value = "texte") String text) {
		return ("Test :" + newLine + "id = " + nb + newLine + "titre = " + text);
	}
}