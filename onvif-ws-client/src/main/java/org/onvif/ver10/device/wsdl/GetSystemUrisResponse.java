
package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogUriList;
import org.w3c.dom.Element;


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
 *         <element name="SystemLogUris" type="{http://www.onvif.org/ver10/schema}SystemLogUriList" minOccurs="0"/>
 *         <element name="SupportInfoUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="SystemBackupUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="Extension" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "systemLogUris",
    "supportInfoUri",
    "systemBackupUri",
    "extension"
})
@XmlRootElement(name = "GetSystemUrisResponse")
public class GetSystemUrisResponse {

    @XmlElement(name = "SystemLogUris")
    protected SystemLogUriList systemLogUris;
    @XmlElement(name = "SupportInfoUri")
    @XmlSchemaType(name = "anyURI")
    protected String supportInfoUri;
    @XmlElement(name = "SystemBackupUri")
    @XmlSchemaType(name = "anyURI")
    protected String systemBackupUri;
    @XmlElement(name = "Extension")
    protected GetSystemUrisResponse.Extension extension;

    /**
     * Gets the value of the systemLogUris property.
     * 
     * @return
     *     possible object is
     *     {@link SystemLogUriList }
     *     
     */
    public SystemLogUriList getSystemLogUris() {
        return systemLogUris;
    }

    /**
     * Sets the value of the systemLogUris property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLogUriList }
     *     
     */
    public void setSystemLogUris(SystemLogUriList value) {
        this.systemLogUris = value;
    }

    /**
     * Gets the value of the supportInfoUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportInfoUri() {
        return supportInfoUri;
    }

    /**
     * Sets the value of the supportInfoUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportInfoUri(String value) {
        this.supportInfoUri = value;
    }

    /**
     * Gets the value of the systemBackupUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemBackupUri() {
        return systemBackupUri;
    }

    /**
     * Sets the value of the systemBackupUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemBackupUri(String value) {
        this.systemBackupUri = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link GetSystemUrisResponse.Extension }
     *     
     */
    public GetSystemUrisResponse.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSystemUrisResponse.Extension }
     *     
     */
    public void setExtension(GetSystemUrisResponse.Extension value) {
        this.extension = value;
    }


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
     *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class Extension {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * </p>
         * 
         * 
         * @return
         *     The value of the any property.
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return this.any;
        }

    }

}
