package application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DoctorTest {

    Doctor d = new Doctor("Dr. Owens", "owen123", "owenJ@gmail.com", "Cardiology", 1, "03334455", "11,12,13", "Mon, tue, wed");

    @Test
    void addDoctorsRecord() {
        assertEquals("Dr. Owens", d.getD_Name());
    }

    @Test
    void tesingPassword() {
        assertEquals("owen123", d.getD_Password());
    }

    @Test
    void tesingEmail() {
        assertEquals("owenJ@gmail.com", d.getD_Email());
    }
}