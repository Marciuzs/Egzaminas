package com.spring.calculator.repository;

import com.spring.calculator.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
    O kas, jeigu nenorime rūpintis paprastomis užklausomis, juk jos visada vienodos.
    Mes nenorime išradinėti dviračio.
    Spring Data JPA repository leidžia:
        - Atsisakyti paprastų užklausų;
        - lengviau rašyti vidutinio sudėtingumo užklausas;
        - Visiškai nekurti repository klasės.
    CRUD įgyvendinantis DAO su Spring Data atrodo taip (žr. 28 kodo eilutę)
        - Nereikia jokios implementacijos!
        - Jei kitoje klasėje pasiimsime su Autowired, galėsime kviesti įvairius metodus, pvz.:
                - roleRepository.save(role); Create/ Update
                - roleRepository.findAll(); Read
                - roleRepository.delete(role); Delete
                - ir kt.
    Galima susikurti bet kokius metodus, sujungiant operacijos pavadinimą (pvz delete),
        tuomet tai, ką norime rasti, pvz User, žodį by bei reikalingus laukus.
    Galimos operacijos:
        find, read, query, count, get, delete, exists
    Neįrašius ieškomojo, bus pasirinkta iš interfeiso.
    Galima patikslinti, ko tiksliau ieškome:
        findFirst.., findTop.., findDistinct.., findUser.., findFirstUser.., findDistinctUser..
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);
}
