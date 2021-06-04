package com.example.asmspring.repository;

import com.example.asmspring.dto.RoadDTO;
import com.example.asmspring.entity.Road;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JPARoadRepository  extends JpaRepository<Road, String> {
    @Query("select r from Road r where r.name like %:roadName% and r.country.name like %:countryName%")
    List<Road> searchbyName(@Param("roadName") String roadname, @Param("countryName") String countryname);
}
