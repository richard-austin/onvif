
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onvif.ver10.schema.BinaryData;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CertificateID" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         <element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Attributes" type="{http://www.onvif.org/ver10/schema}BinaryData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "certificateID",
    "subject",
    "attributes"
})
@XmlRootElement(name = "GetPkcs10Request")
public class GetPkcs10Request {

    /**
     * List of ids of certificates to delete.
     * 
     */
    @XmlElement(name = "CertificateID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String certificateID;
    /**
     * Relative Dinstinguished Name(RDN) CommonName(CN).
     * 
     */
    @XmlElement(name = "Subject")
    protected String subject;
    /**
     * Optional base64 encoded DER attributes.
     * 
     */
    @XmlElement(name = "Attributes")
    protected BinaryData attributes;

    /**
     * List of ids of certificates to delete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateID() {
        return certificateID;
    }

    /**
     * Sets the value of the certificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCertificateID()
     */
    public void setCertificateID(String value) {
        this.certificateID = value;
    }

    /**
     * Relative Dinstinguished Name(RDN) CommonName(CN).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSubject()
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Optional base64 encoded DER attributes.
     * 
     * @return
     *     possible object is
     *     {@link BinaryData }
     *     
     */
    public BinaryData getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryData }
     *     
     * @see #getAttributes()
     */
    public void setAttributes(BinaryData value) {
        this.attributes = value;
    }

}
