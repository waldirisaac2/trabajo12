
package ws;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Web_Service_WS", targetNamespace = "http://WS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceWS {


    /**
     * 
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFicheroAdjunto", targetNamespace = "http://WS/", className = "ws.GetFicheroAdjunto")
    @ResponseWrapper(localName = "getFicheroAdjuntoResponse", targetNamespace = "http://WS/", className = "ws.GetFicheroAdjuntoResponse")
    @Action(input = "http://WS/Web_Service_WS/getFicheroAdjuntoRequest", output = "http://WS/Web_Service_WS/getFicheroAdjuntoResponse")
    public byte[] getFicheroAdjunto();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WS/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WS/", className = "ws.HelloResponse")
    @Action(input = "http://WS/Web_Service_WS/helloRequest", output = "http://WS/Web_Service_WS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDirec", targetNamespace = "http://WS/", className = "ws.GetDirec")
    @ResponseWrapper(localName = "getDirecResponse", targetNamespace = "http://WS/", className = "ws.GetDirecResponse")
    @Action(input = "http://WS/Web_Service_WS/getDirecRequest", output = "http://WS/Web_Service_WS/getDirecResponse")
    public String getDirec();

}
