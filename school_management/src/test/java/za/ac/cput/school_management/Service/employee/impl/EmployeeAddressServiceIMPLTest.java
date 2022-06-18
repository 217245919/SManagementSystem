package za.ac.cput.school_management.Service.employee.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.employee.Employee;
import za.ac.cput.school_management.repository.employee.EmployeeAddressRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
EmployeeAddressServiceIMPLTest.java
*/

class EmployeeAddressServiceIMPLTest {

    private Employee employee;
    private EmployeeAddressRepository repository;

    EmployeeAddressServiceIMPLTest(Employee employee, EmployeeAddressRepository repository) {
        this.employee = employee;
        this.repository = repository;
    }

    @Test
    void save() {
        Employee save = this.repository.save(this.employee);
        System.out.println(save);
        assertNotNull(save);
        assertSame(this.employee, save);
    }

    @Test
    void read() {

    }

    @Test
    void delete() {
        Employee save = this.repository.save(this.employee);
        List<Employee> employeeList = this.repository.findAll();
        assertEquals(1, employeeList.size());
        this.repository.delete(save);
    }

    @Test
    void findAll() {
        List<Employee> employeeList = this.repository.findAll();
        assertEquals(1,employeeList.size());
    }

}