
package br.com.clean.architecture.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.clean.architecture.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmpregadoResponse_QNAME = new QName("http://service.architecture.clean.com.br/", "getEmpregadoResponse");
    private final static QName _DeleteEmpregadoResponse_QNAME = new QName("http://service.architecture.clean.com.br/", "deleteEmpregadoResponse");
    private final static QName _UpdateEmpregado_QNAME = new QName("http://service.architecture.clean.com.br/", "updateEmpregado");
    private final static QName _GetEmpregado_QNAME = new QName("http://service.architecture.clean.com.br/", "getEmpregado");
    private final static QName _DeleteEmpregado_QNAME = new QName("http://service.architecture.clean.com.br/", "deleteEmpregado");
    private final static QName _AddEmpregado_QNAME = new QName("http://service.architecture.clean.com.br/", "addEmpregado");
    private final static QName _UpdateEmpregadoResponse_QNAME = new QName("http://service.architecture.clean.com.br/", "updateEmpregadoResponse");
    private final static QName _AddEmpregadoResponse_QNAME = new QName("http://service.architecture.clean.com.br/", "addEmpregadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.clean.architecture.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateEmpregadoResponse }
     * 
     */
    public UpdateEmpregadoResponse createUpdateEmpregadoResponse() {
        return new UpdateEmpregadoResponse();
    }

    /**
     * Create an instance of {@link AddEmpregadoResponse }
     * 
     */
    public AddEmpregadoResponse createAddEmpregadoResponse() {
        return new AddEmpregadoResponse();
    }

    /**
     * Create an instance of {@link DeleteEmpregado }
     * 
     */
    public DeleteEmpregado createDeleteEmpregado() {
        return new DeleteEmpregado();
    }

    /**
     * Create an instance of {@link GetEmpregado }
     * 
     */
    public GetEmpregado createGetEmpregado() {
        return new GetEmpregado();
    }

    /**
     * Create an instance of {@link AddEmpregado }
     * 
     */
    public AddEmpregado createAddEmpregado() {
        return new AddEmpregado();
    }

    /**
     * Create an instance of {@link DeleteEmpregadoResponse }
     * 
     */
    public DeleteEmpregadoResponse createDeleteEmpregadoResponse() {
        return new DeleteEmpregadoResponse();
    }

    /**
     * Create an instance of {@link UpdateEmpregado }
     * 
     */
    public UpdateEmpregado createUpdateEmpregado() {
        return new UpdateEmpregado();
    }

    /**
     * Create an instance of {@link GetEmpregadoResponse }
     * 
     */
    public GetEmpregadoResponse createGetEmpregadoResponse() {
        return new GetEmpregadoResponse();
    }

    /**
     * Create an instance of {@link Empregado }
     * 
     */
    public Empregado createEmpregado() {
        return new Empregado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpregadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "getEmpregadoResponse")
    public JAXBElement<GetEmpregadoResponse> createGetEmpregadoResponse(GetEmpregadoResponse value) {
        return new JAXBElement<GetEmpregadoResponse>(_GetEmpregadoResponse_QNAME, GetEmpregadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmpregadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "deleteEmpregadoResponse")
    public JAXBElement<DeleteEmpregadoResponse> createDeleteEmpregadoResponse(DeleteEmpregadoResponse value) {
        return new JAXBElement<DeleteEmpregadoResponse>(_DeleteEmpregadoResponse_QNAME, DeleteEmpregadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmpregado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "updateEmpregado")
    public JAXBElement<UpdateEmpregado> createUpdateEmpregado(UpdateEmpregado value) {
        return new JAXBElement<UpdateEmpregado>(_UpdateEmpregado_QNAME, UpdateEmpregado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmpregado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "getEmpregado")
    public JAXBElement<GetEmpregado> createGetEmpregado(GetEmpregado value) {
        return new JAXBElement<GetEmpregado>(_GetEmpregado_QNAME, GetEmpregado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmpregado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "deleteEmpregado")
    public JAXBElement<DeleteEmpregado> createDeleteEmpregado(DeleteEmpregado value) {
        return new JAXBElement<DeleteEmpregado>(_DeleteEmpregado_QNAME, DeleteEmpregado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpregado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "addEmpregado")
    public JAXBElement<AddEmpregado> createAddEmpregado(AddEmpregado value) {
        return new JAXBElement<AddEmpregado>(_AddEmpregado_QNAME, AddEmpregado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmpregadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "updateEmpregadoResponse")
    public JAXBElement<UpdateEmpregadoResponse> createUpdateEmpregadoResponse(UpdateEmpregadoResponse value) {
        return new JAXBElement<UpdateEmpregadoResponse>(_UpdateEmpregadoResponse_QNAME, UpdateEmpregadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmpregadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.architecture.clean.com.br/", name = "addEmpregadoResponse")
    public JAXBElement<AddEmpregadoResponse> createAddEmpregadoResponse(AddEmpregadoResponse value) {
        return new JAXBElement<AddEmpregadoResponse>(_AddEmpregadoResponse_QNAME, AddEmpregadoResponse.class, null, value);
    }

}
