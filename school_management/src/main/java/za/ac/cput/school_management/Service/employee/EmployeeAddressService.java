package za.ac.cput.school_management.Service.employee;

import za.ac.cput.school_management.Service.IService;
import za.ac.cput.school_management.domain.employee.Employee;

import java.util.List;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
EmployeeAddressService.java
*/

public interface EmployeeAddressService extends IService <Employee, String> {

    List<Employee> findAll();
}
