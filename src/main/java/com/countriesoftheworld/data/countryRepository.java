package com.countriesoftheworld.data;

import com.countriesoftheworld.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class countryRepository {
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("Brazil",100000, "Brasilia","Portuguese" ),
            new Country("Colombia",49310, "Bogota", "Spanish" ),
            new Country("Argentina", 43417000, "Buenos Aires", "Spanish"),
            new Country("Chile", 123113, "Santiago", "Spanish"),
            new Country("Mexico", 1223223, "Mexico City", "Spanish")
    );

    public static Country findByName(String countryName) {
        for(Country country : ALL_COUNTRIES) {
            if (country.getCountryName().equals(countryName)) {
                return country;
            }
        }
        return null;
    }
}
