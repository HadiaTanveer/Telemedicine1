package application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class feedbackRegisterTest {

    feedbackRegister f = new feedbackRegister("Will", 3, "Very good experience");
    @Test
    void getFeedback() {
        assertEquals("Will", f.getPatient_name());
    }

    @Test
    void getFeedback2() {
        assertSame(3, f.getPatient_id());
    }

    @Test
    void getFeedback3() {
        assertSame("Very good experience", f.getFeedback());
    }
}