package com.patrick.repository;

import com.patrick.entities.Problem;
import com.patrick.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProblemRepo extends JpaRepository<Problem, Long> {

    @Query("FROM Problem WHERE name =?1")
    Optional<Problem> findByName(String name);

    @Query("FROM Problem WHERE service_id =?1 AND name=?2")
    Optional<Problem> findByServiceAndName(Long id, String problemName);

    @Query("FROM Problem WHERE service_id =?1")
    List<Problem> findByService(Long id);

//    @Query("FROM CurrentStock WHERE stock_id =?1")
//    Optional<CurrentStock> findByStockName(StockTrack stockTrack);

}
