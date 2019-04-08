package SSVVL4MV.repository;

import SSVVL4MV.domain.Student;
import SSVVL4MV.validation.*;

public class StudentRepository extends AbstractCRUDRepository<String, Student> {
    public StudentRepository(Validator<Student> validator) {
        super(validator);
    }
}

