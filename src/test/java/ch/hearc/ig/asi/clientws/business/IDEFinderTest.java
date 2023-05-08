package ch.hearc.ig.asi.clientws.business;

import business.IDEFinder;
import junit.framework.TestCase;

public class IDEFinderTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testValidate() {
        String nature = "blablabla CHE-214.686.752 blablabla";
        IDEFinder finder = new IDEFinder(nature);
        String ideFound = finder.find();
        System.out.println("IDE found: " + ideFound);
    }
}