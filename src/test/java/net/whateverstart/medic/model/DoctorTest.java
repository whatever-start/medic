package net.whateverstart.medic.model;

import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {
    @Test
    public void testToString() {
        Doctor doc = new Doctor("1", "David");
        String str = doc.toString();

        Assert.assertTrue(str.contains("Doctor"));
        Assert.assertTrue(str.contains("1"));
        Assert.assertTrue(str.contains("David"));
    }
}
