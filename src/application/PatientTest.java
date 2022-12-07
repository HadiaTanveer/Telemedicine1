package application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PatientTest {


    @Test
    void getpPassword() {
        Patient p= new Patient("Hadia", "hadia123", "20", 1, "hadia11@gmail.com");
        assertEquals("hadia123", p.getpPassword());
    }
    @Test
    void getpName(){
        Patient p= new Patient("Hadia", "hadia123", "20", 1, "hadia11@gmail.com");
        assertEquals("Maria", p.getpName());
    }

    @Test
    void checkAge(){
        Patient p= new Patient("Hadia", "hadia123", "20", 1, "hadia11@gmail.com");
        assertSame("20", p.getpAge());
    }





}