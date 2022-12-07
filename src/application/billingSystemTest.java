package application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class billingSystemTest {
    billingSystem b = new billingSystem(1, 9, 25000.0," 23.11.2022", "1.12.2022");
    @Test
    void getBill() {
        assertEquals(25000.0, b.getBill(), 0.001);
    }

    @Test
    void testbillID() {
        assertSame(9, b.getBill_id());
    }

    @Test
    void testbill() {
        assertTrue(0.00 < b.getBill());
    }

    @Test
    void testDueDate(){
        assertNotNull( b.getDate_due());
    }
    @Test
    void testDate(){
        assertNotNull( b.getDate_issued());
    }
}