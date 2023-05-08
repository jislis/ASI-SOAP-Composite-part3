package service;

import business.Acte;
import business.IDEFinder;
import integration.IDEValidation;


import java.util.List;

public class NotarialService implements INotarialService {

    public NotarialService(){
    }

    public String verification(Acte acte){
        String desc = acte.getDesc();

        String ideInDesc = new IDEFinder(desc).find();

        String result = IDEValidation.validate(ideInDesc);
        return result;
    }
}
