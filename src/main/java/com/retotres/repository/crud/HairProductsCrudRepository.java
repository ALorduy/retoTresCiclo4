package com.retotres.repository.crud;


import com.retotres.model.HairProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author alberto
 */
public interface HairProductsCrudRepository extends MongoRepository<HairProducts, String> {
    
}
