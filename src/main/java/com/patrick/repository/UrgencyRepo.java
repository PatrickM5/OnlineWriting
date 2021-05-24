package com.patrick.repository;

import com.patrick.entities.Academic;
import com.patrick.entities.Service;
import com.patrick.entities.Urgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UrgencyRepo extends JpaRepository<Urgency, Long> {

    @Query("FROM Urgency WHERE name =?1")
    Optional<Urgency> findByName(String name);

    @Query("FROM Urgency WHERE service_id =?1 AND name=?2")
    Optional<Urgency> findByServiceAndName(Long id, String problemName);

    @Query("FROM Urgency WHERE service_id =?1")
    List<Urgency> findByService(Long id);

//    @Query("FROM CurrentStock WHERE stock_id =?1")
//    Optional<CurrentStock> findByStockName(StockTrack stockTrack);

}
