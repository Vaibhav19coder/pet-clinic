package SFG.pet.clinic.services.map;

import SFG.pet.clinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object!=null)
        {
            if(object.getId()==null)
            {
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }
        else {
            System.out.println("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){

        if(map.isEmpty()){
            return 1L;
        }
        else {
            long x = Collections.max(map.keySet());
            x = x + 1;
            return x;
        }
    }
}
