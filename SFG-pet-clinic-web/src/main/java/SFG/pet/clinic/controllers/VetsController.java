package SFG.pet.clinic.controllers;

import SFG.pet.clinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    public final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping("/vets")
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
