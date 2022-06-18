package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;

import static org.junit.jupiter.api.Assertions.*;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
EmployeeAddressService.java
*/

class NameFactoryTest {

    @Test
    void buildWithSuccess() {

        Name name = NameFactory
                .createName("Lyle", null, "Haines");
        System.out.println(name);
        assertAll(
                () -> assertNotNull(name),
                () -> assertNotNull(name.getMiddleName())

        );
    }
}