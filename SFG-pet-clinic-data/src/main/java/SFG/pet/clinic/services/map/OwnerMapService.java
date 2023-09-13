package SFG.pet.clinic.services.map;

import SFG.pet.clinic.model.Owner;
import SFG.pet.clinic.services.OwnerServices;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerServices{

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id){
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lName) {
        return null;
    }
}
