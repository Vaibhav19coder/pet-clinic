package SFG.pet.clinic.controllers;

import SFG.pet.clinic.services.OwnerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerServices ownerServices;

    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }


    @RequestMapping("/owner")
    public String listOwner(Model model)
    {
        model.addAttribute("owners", ownerServices.findAll());
        return "owner/index";
    }

}
