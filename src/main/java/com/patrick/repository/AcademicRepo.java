package com.patrick.repository;

import com.patrick.entities.Academic;
import com.patrick.entities.Problem;
import com.patrick.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AcademicRepo extends JpaRepository<Academic, Long> {

    @Query("FROM Academic WHERE name =?1")
    Optional<Academic> findByName(String name);

    @Query("FROM Academic WHERE service_id =?1 AND name=?2")
    Optional<Academic> findByServiceAndName(Long id, String problemName);

    @Query("FROM Academic WHERE service_id =?1")
    List<Academic> findByService(Long service);

//    @Query("FROM CurrentStock WHERE stock_id =?1")
//    Optional<CurrentStock> findByStockName(StockTrack stockTrack);

}
