package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class e_prescriptionSystemTest {

    e_prescriptionSystem e = new e_prescriptionSystem("Covid-19", "Panadol", "Dr. Owens", "12.3.2022", "Asthma", "Hadia", 236 );

    @Test
    void testingPrescription() {
        assertNotNull(e.getPrescription());
    }

    @Test
    void testingMedicine() {
        assertNotNull(e.getMedicines());
    }

    @Test
    void testingDoctor() {
        assertNotNull(e.getDr_prescribing());
    }

    @Test
    void testingDate() {
        assertNotNull(e.getConsultation_Date());
    }

    @Test
    void testingHistory() {
        assertNotNull(e.getHistory());
    }

    @Test
    void testingPatientName() {
        assertNotNull(e.getPatientName());
    }

}