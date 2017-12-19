package com.exxeta.referenzplattform.specifications;

import com.exxeta.referenzplattform.domain.CustomerReferences;
import com.exxeta.referenzplattform.repository.CustomerReferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerReferencesSpecification {

    @Autowired
    CustomerReferencesRepository customerReferencesRepository;

    public static Specification<CustomerReferences> containsTextInAttributes(String text, List<String> attributes) {
        if (!text.contains("%")) {
            text = "%" + text + "%";
        }
        String finalText = text;
        return (root, query, builder) -> builder.or(root.getModel().getDeclaredSingularAttributes().stream()
            .filter(a -> attributes.contains(a.getName()))
            .map(a -> builder.like(root.get(a.getName()), finalText))
            .toArray(Predicate[]::new)
        );
    }

    public static Specification<CustomerReferences> containsTextInName(String text) {
        return containsTextInAttributes(text, Arrays.asList("titel", "projectTeam", "referenceOwner", "schlagworte", "kritischeErfolgsfaktoren", "anmerkungen"));
    }

    public List<CustomerReferences> findAllbySearch(String suche){
        List<CustomerReferences> schulen = new ArrayList<>();
        customerReferencesRepository.findByNameContainsOrDescriptionContainsOrAdresseContainsAllIgnoreCase(suche,suche,suche,suche,suche,suche)
            .forEach(schulen::add);
        return schulen;
    }


}
