package com.jean.mida.Controller;






import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jean.mida.Service.AppartementService;
import com.jean.mida.Service.ClientService;
import com.jean.mida.Entity.Client;
import com.jean.mida.Dao.ClientDao;
import com.jean.mida.Entity.Appartement;


@Controller
public class Controllers {
	
	@Autowired
	private  ClientDao cliDAO;
	
	
	@RequestMapping("Acceuil")
	public String Acceuil() {
		
		return "Acceuil";
	}
	
	 @Autowired
		private  ClientService  clientSer;
		
	@RequestMapping("/Client")
    public String Client(Model model) {
		List<Client>  clientSers= clientSer.getAllClient();
		if(clientSers==null) {
			clientSers=new ArrayList<Client>();
		}
		model.addAttribute("clientSers", clientSers);
		
	
		
		return "Client";
	}
	
	@RequestMapping("/Ajouter")
	public String Ajouter(@ModelAttribute("Client")Client clientSers,ModelMap modelMap) {
		Client Ajouter = clientSer.saveClient(clientSers);
		String msg=""+Ajouter.getNomClient();
		modelMap.addAttribute("msg",msg);
		return "redirect:Client";
		
	}
	
		
	@RequestMapping("/Visite")
    public String Visite() {
		
		
		return "Visite";
	}
	
	@Autowired
	private  AppartementService  appartementSer;
	
	@RequestMapping("/Appartement")
    public String Appartement(Model model) {
		List<Appartement>  appartementSers= appartementSer.getAllAppartement();
		if(appartementSers==null) {
			appartementSers=new ArrayList<Appartement>();
		}
		model.addAttribute("appartementSers", appartementSers);
		
		return "Appartement";
	}
		
	@RequestMapping("/Ajouter1")
	public String Ajouter(@ModelAttribute("Appartement")Appartement appartementSers,ModelMap modelMap) {
		Appartement Ajouter = appartementSer.saveAppartement(appartementSers);
		String msg=""+Ajouter.getNumEtage();
		modelMap.addAttribute("msg",msg);
		return "redirect:Appartement";
	
	

	}
	
	
	@RequestMapping("/modifier")
	public String modif(@RequestParam Long id, @RequestParam String nomClient, @RequestParam String prenom,@RequestParam String adresse) {
		Client cli = cliDAO.findById(id).get();
		cli.setNomClient(nomClient);
		cli.setPrenom(prenom);
		cli.setAdresse(adresse);
		cliDAO.saveAndFlush(cli);
		return "redirect:Client";
	}
	
	
}
