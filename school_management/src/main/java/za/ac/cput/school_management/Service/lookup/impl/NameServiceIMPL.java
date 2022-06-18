package za.ac.cput.school_management.Service.lookup.impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.school_management.Service.lookup.NameService;
import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.repository.lookup.NameRepository;
import java.util.List;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameServiceIMPL.java
*/

public class NameServiceIMPL implements NameService {

    private static NameService nameService = null;

    @Autowired
    private NameRepository nameRepository;

    private NameServiceIMPL() {

    }

    public static NameService getNameService() {
        if(nameService == null) nameService = new NameServiceIMPL();
        return nameService;
    }

    @Override
    public Name save(Name name) {
        return this.nameRepository.save(name);
    }

    @Override
    public Name read(String s) {
        return null;
    }

    @Override
    public Name update(Name name) {
        return this.nameRepository.save(name);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public List<Name> getAll() {
        return this.nameRepository.findAll();
    }
}
