package com.example.asmspring.repository;

import com.example.asmspring.dto.CountryDTO;
import com.example.asmspring.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPACountryRepository extends JpaRepository<Country,Integer> {

}
