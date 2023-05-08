package ch.hearc.ig.asi.clientws.service;

import business.Acte;
import junit.framework.TestCase;
import service.NotarialService;

public class NotarialServiceTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testVerification() {
        String natureActe = "blablabla CHE-214.686.752 blablabla";

        Acte acte = new Acte();
        acte.setDesc(natureActe);

        NotarialService service = new NotarialService();
        String verified = service.verification(acte);

        System.out.println(verified);

    }
}