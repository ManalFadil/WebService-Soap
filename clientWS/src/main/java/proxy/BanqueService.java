
package proxy;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDh", targetNamespace = "http://example.org/", className = "proxy.ConversionEuroToDh")
    @ResponseWrapper(localName = "conversionEuroToDhResponse", targetNamespace = "http://example.org/", className = "proxy.ConversionEuroToDhResponse")
    @Action(input = "http://example.org/BanqueService/conversionEuroToDhRequest", output = "http://example.org/BanqueService/conversionEuroToDhResponse")
    public double conversionEuroToDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List&lt;proxy.Compte&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://example.org/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://example.org/", className = "proxy.ListComptesResponse")
    @Action(input = "http://example.org/BanqueService/listComptesRequest", output = "http://example.org/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://example.org/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://example.org/", className = "proxy.GetCompteResponse")
    @Action(input = "http://example.org/BanqueService/getCompteRequest", output = "http://example.org/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
