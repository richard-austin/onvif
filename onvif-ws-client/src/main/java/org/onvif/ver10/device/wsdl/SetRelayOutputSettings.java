
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayOutputSettings;


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
 *         <element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Properties" type="{http://www.onvif.org/ver10/schema}RelayOutputSettings"/>
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
    "relayOutputToken",
    "properties"
})
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    @XmlElement(name = "RelayOutputToken", required = true)
    protected String relayOutputToken;
    @XmlElement(name = "Properties", required = true)
    protected RelayOutputSettings properties;

    /**
     * Gets the value of the relayOutputToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayOutputToken() {
        return relayOutputToken;
    }

    /**
     * Sets the value of the relayOutputToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayOutputToken(String value) {
        this.relayOutputToken = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link RelayOutputSettings }
     *     
     */
    public RelayOutputSettings getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelayOutputSettings }
     *     
     */
    public void setProperties(RelayOutputSettings value) {
        this.properties = value;
    }

}
