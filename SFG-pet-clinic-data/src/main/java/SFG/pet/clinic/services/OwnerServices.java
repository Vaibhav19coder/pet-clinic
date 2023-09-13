package SFG.pet.clinic.services;

import SFG.pet.clinic.model.Owner;

import java.util.Set;

public interface OwnerServices extends CrudService<Owner, Long> {


    Owner findByLastName(String lName);


}
