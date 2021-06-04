package com.example.asmspring.dto;

import com.example.asmspring.entity.Country;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryDTO {
    private int countryId;
    private String countryName;


    public CountryDTO countryDTO(Country country){
        this.setCountryId(country.getId());
        this.setCountryName(country.getName());

        return this;
    }
}
