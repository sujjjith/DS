package ds.designpattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class EmployeeTest {

    @Test
    public void testToString() throws Exception {
        Employee e = new Employee.Builder().setId(1).setName("a").setEmail("a@gmail.com").setPhNo(9999).build();
        System.out.println(e.toString());
    }
}