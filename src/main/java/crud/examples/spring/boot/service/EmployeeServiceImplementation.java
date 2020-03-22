package crud.examples.spring.boot.service;

import crud.examples.spring.boot.dao.EmployeeDAO;
import crud.examples.spring.boot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImplementation(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
        return employeeDAO.findById( theId );
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeeDAO.save( theEmployee );
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDAO.deleteById( theId );
    }
}
