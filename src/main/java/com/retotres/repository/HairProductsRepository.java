package com.retotres.repository;



import java.util.List;
import java.util.Optional;
import com.retotres.model.HairProducts;
import com.retotres.repository.crud.HairProductsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alberto
 */

@Repository
public class HairProductsRepository {
    @Autowired
    private HairProductsCrudRepository repository;

    public List<HairProducts> getAll() {
        return repository.findAll();
    }

    public Optional<HairProducts> getHairProducts(String reference) {
        return repository.findById(reference);
    }
    
    public HairProducts create(HairProducts hairProducts) {
        return repository.save(hairProducts);
    }

    public void update(HairProducts hairProducts) {
        repository.save(hairProducts);
    }
    
    public void delete(HairProducts hairProducts) {
        repository.delete(hairProducts);
    }
}
