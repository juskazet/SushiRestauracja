package com.piotrolot1.SushiRestauracja.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import com.piotrolot1.SushiRestauracja.Data.Osoba;
import com.piotrolot1.SushiRestauracja.Data.SushiFabryka;

@Controller
public class Nawigacja {
	
	@GetMapping("/galeria")
	public String toGaleria(Model model) {
		model.addAttribute("listaFutomakow", SushiFabryka.getListaFutomakow());
		return "galeria";
	}
	
	@GetMapping("/kontakt")
	public String toKontakt(Model model) {
		model.addAttribute("konto", new Osoba());
		return "kontakt";
	}

	@PostMapping("/kontakt")
	public String getKontaktFromWebside(@ModelAttribute Osoba osoba){
		System.err.println(osoba);
		return "redirect:/kontakt";
	}
	
	@GetMapping("/menu")
	public String toMenu() {
		return "menu";
	}
	
	@GetMapping("/zamow")
	public String toZamow(Model model) {
		model.addAttribute("listaOsob", Osoba.listaOsob);
		return "zamow";
	}
	
	
}
