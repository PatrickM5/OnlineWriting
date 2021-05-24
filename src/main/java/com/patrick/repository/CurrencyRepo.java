package com.patrick.repository;

import com.patrick.entities.Currency;
import com.patrick.entities.Problem;
import com.patrick.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Long> {

    @Query("FROM Currency WHERE name =?1")
    Optional<Currency> findByName(String name);

    @Query("FROM Currency WHERE service_id =?1 AND name=?2")
    Optional<Currency> findByServiceAndName(Long id, String problemName);


//    @Query("FROM CurrentStock WHERE stock_id =?1")
//    Optional<CurrentStock> findByStockName(StockTrack stockTrack);

}