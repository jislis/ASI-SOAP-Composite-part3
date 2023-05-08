package integration;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ch.admin.uid.xmlns.uid_wse.ArrayOfOrganisationType;
import ch.ech.xmlns.ech_0097._5.UidOrganisationIdCategorieType;
import ch.ech.xmlns.ech_0097._5.UidStructureType;
import ch.ech.xmlns.ech_0108._5.OrganisationType;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.tempuri.IPublicServices;
import org.tempuri.IPublicServicesGetByUIDBusinessFaultFaultFaultMessage;
import org.tempuri.IPublicServicesGetByUIDInfrastructureFaultFaultFaultMessage;
import org.tempuri.IPublicServicesGetByUIDSecurityFaultFaultFaultMessage;
import org.tempuri.IPublicServicesValidateUIDBusinessFaultFaultFaultMessage;
import org.tempuri.IPublicServicesValidateUIDInfrastructureFaultFaultFaultMessage;
import org.tempuri.IPublicServicesValidateUIDSecurityFaultFaultFaultMessage;
import org.tempuri.PublicServices;

/**
 *
 * @author maximili.jeannere
 */
public class IDEValidation {

    /**
     * Valide un IDE en faisant appel aux web services.
     * https://netbeans.org/kb/docs/websvc/intro-ws.html
     * http://docs.oracle.com/javaee/6/tutorial/doc/bnayn.html
     * @param ide
     * @return
     */
    public static String validate(String ide) {

        Logger.getLogger(IDEValidation.class.getName()).log(Level.INFO, ide, "Saisie : " + ide);

        StringBuilder result = new StringBuilder("<html>");

        // Binding XML/objets Java
        IPublicServices publicServices = new PublicServices().getBasicHttpBindingIPublicServices();

        try {

            // Valide l'IDE
            if(publicServices.validateUID(ide)){
                //Logger.getLogger(IDEValidation.class.getName()).log(Level.INFO, null, "Saisie : " + ide);

                result.append("Le numero IDE est valide.");
                result.append("<br>");

                // Remplace les caractère non utilisé pour la recherche
                ide = ide.replaceAll("[A-Z.-]", "");
                System.out.println(ide);

                // Récupère les informations d'une UID
                UidStructureType uidStructureTyp = new UidStructureType();
                BigInteger numberUID = BigInteger.valueOf(Long.valueOf(ide));
                uidStructureTyp.setUidOrganisationIdCategorie(UidOrganisationIdCategorieType.CHE);
                uidStructureTyp.setUidOrganisationId(numberUID);

                // Récupère les organisations par un UID
                ArrayOfOrganisationType listOfOrganisation = publicServices.getByUID(uidStructureTyp);

                OrganisationType ot = listOfOrganisation.getOrganisationType().get(0);
                result.append(ot.getOrganisation().getOrganisationIdentification().getOrganisationName());
                result.append("<br>");
                result.append(ot.getOrganisation().getAddress().get(0).getStreet());
                result.append("<br>");
                result.append(ot.getOrganisation().getAddress().get(0).getSwissZipCodeOrSwissZipCodeAddOnOrMunicipalityId().get(0).getValue());
                result.append(" ").append(ot.getOrganisation().getAddress().get(0).getTown());

            }
            else{
                result.append("Le numero IDE est invalide.");
                result.append("<br>");
            }

        } catch (IPublicServicesValidateUIDBusinessFaultFaultFaultMessage ex) {
            Logger.getLogger(IDEValidation.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IPublicServicesValidateUIDInfrastructureFaultFaultFaultMessage ex) {
            Logger.getLogger(IDEValidation.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IPublicServicesValidateUIDSecurityFaultFaultFaultMessage ex) {
            Logger.getLogger(IDEValidation.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IPublicServicesGetByUIDBusinessFaultFaultFaultMessage ex) {
            Logger.getLogger(IDEValidation.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IPublicServicesGetByUIDInfrastructureFaultFaultFaultMessage ex) {
            Logger.getLogger(IDEValidation.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IPublicServicesGetByUIDSecurityFaultFaultFaultMessage ex) {
            Logger.getLogger(IDEValidation.class.getName()).log(Level.SEVERE, null, ex);
        }
        result.append("</html>");
        return result.toString();
    }
}
