
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOCapabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IOCapabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InputConnectors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RelayOutputs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IOCapabilitiesExtension" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOCapabilities", propOrder = {
    "inputConnectors",
    "relayOutputs",
    "extension"
})
public class IOCapabilities {

    /**
     * Number of input connectors.
     * 
     */
    @XmlElement(name = "InputConnectors")
    protected Integer inputConnectors;
    /**
     * Number of relay outputs.
     * 
     */
    @XmlElement(name = "RelayOutputs")
    protected Integer relayOutputs;
    @XmlElement(name = "Extension")
    protected IOCapabilitiesExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Number of input connectors.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInputConnectors() {
        return inputConnectors;
    }

    /**
     * Sets the value of the inputConnectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getInputConnectors()
     */
    public void setInputConnectors(Integer value) {
        this.inputConnectors = value;
    }

    /**
     * Number of relay outputs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelayOutputs() {
        return relayOutputs;
    }

    /**
     * Sets the value of the relayOutputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getRelayOutputs()
     */
    public void setRelayOutputs(Integer value) {
        this.relayOutputs = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IOCapabilitiesExtension }
     *     
     */
    public IOCapabilitiesExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOCapabilitiesExtension }
     *     
     */
    public void setExtension(IOCapabilitiesExtension value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
