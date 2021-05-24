package com.patrick.repository;

import com.patrick.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ServiceRepo extends JpaRepository<Service, Long> {

    @Query("FROM Service WHERE name =?1")
    Optional<Service> findByName(String name);

//    @Query("FROM CurrentStock WHERE stock_id =?1")
//    Optional<CurrentStock> findByStockName(StockTrack stockTrack);

}
