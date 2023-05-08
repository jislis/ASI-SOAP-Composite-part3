package webservice;

import business.Acte;
import service.INotarialService;
import service.NotarialService;

import javax.jws.WebMethod;
import javax.jws.WebParam;

@javax.jws.WebService() // SERVER
public class NotarialWebService {

    @WebMethod
    public String validation(@WebParam(name = "desc") final String acteDesc) {
        Acte acte = new Acte();
        acte.setDesc(acteDesc);

        System.out.println("[" + Utils.getFormattedCurrentTime() + "] - Input: " + acte.getDesc());
        INotarialService service = new NotarialService();
        String verified = service.verification(acte);
        return verified;
    }
}