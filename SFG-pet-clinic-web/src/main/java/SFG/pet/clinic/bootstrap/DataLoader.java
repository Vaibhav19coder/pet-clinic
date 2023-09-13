package SFG.pet.clinic.bootstrap;

import SFG.pet.clinic.model.Owner;
import SFG.pet.clinic.model.Vet;
import SFG.pet.clinic.services.OwnerServices;
import SFG.pet.clinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServices ownerServices;
    private final VetService vetService;

    public DataLoader(OwnerServices ownerServices, VetService vetService) {
        this.ownerServices = ownerServices;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
//        owner1.setId(1L);
        owner1.setfName("Vaibhav");
        owner1.setlName("Negi");

        ownerServices.save(owner1);

        Owner owner2 = new Owner();
//        owner2.setId(2L);
        owner2.setfName("Aman");
        owner2.setlName("Kumar");

        ownerServices.save(owner2);

        System.out.println("Loaded Owners............");

        Vet vet1 = new Vet();
//        vet1.setId(2L);
        vet1.setfName("Vinod");
        vet1.setlName("Tyagi");

        vetService.save(vet1);

        Vet vet2 = new Vet();
//        vet2.setId(2L);
        vet2.setfName("Kukkad");
        vet2.setlName("Singh");

        vetService.save(vet2);

        System.out.println("Loaded Vets............");


    }
}
