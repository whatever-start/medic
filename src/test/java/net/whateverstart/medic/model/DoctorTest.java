package net.whateverstart.medic.model;

import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {
    @Test
    public void testToString() {
        Doctor doc = new Doctor("David", "Surgery");
        doc.setHospital("Hospital1");
        String str = doc.toString();

        Assert.assertTrue(str.contains("Doctor"));
        Assert.assertTrue(str.contains("David"));
        Assert.assertTrue(str.contains("Hospital1"));
        Assert.assertTrue(str.contains("Surgery"));
    }
}
