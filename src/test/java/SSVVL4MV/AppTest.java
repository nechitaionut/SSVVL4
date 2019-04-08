package SSVVL4MV;

import static org.junit.Assert.assertTrue;

import SSVVL4MV.domain.Student;
import SSVVL4MV.repository.StudentRepository;
import SSVVL4MV.validation.StudentValidator;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void addStudentTest() {
        Student s1 = new Student("niie","Vasile",935);
        StudentValidator validator = new StudentValidator();
        StudentRepository studentRepo = new StudentRepository(validator);
        studentRepo.save(s1);
        assertTrue(studentRepo.findOne(s1.getID()) != null);
    }
}
