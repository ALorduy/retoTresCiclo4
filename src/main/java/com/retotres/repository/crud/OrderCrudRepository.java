package com.retotres.repository.crud;

import com.retotres.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author alberto
 */

public interface OrderCrudRepository extends MongoRepository<Order, Integer> {
    
    //Devuelve las ordenes de pedido que coincida con la zona enviada como parametro
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);
    
    //Devuelve las ordenes "x" estado
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);
    
    //Busca la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();
}
