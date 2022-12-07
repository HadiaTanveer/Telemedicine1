package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appointmentTest {

    appointment a = new appointment(23,"18:00 AM", 1);

    @Test
    void getAppTime() {
        assertEquals("18:00 AM", a.getAppTime());
    }

    @Test
    void testDoctorID() {
        assertEquals(23, a.getAppDrID());
    }

    @Test
    void testPatientID() {
        assertEquals(1, a.getAppPatientID());
    }
}