
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NetworkHost complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NetworkHost">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}NetworkHostType"/>
 *         <element name="IPv4Address" type="{http://www.onvif.org/ver10/schema}IPv4Address" minOccurs="0"/>
 *         <element name="IPv6Address" type="{http://www.onvif.org/ver10/schema}IPv6Address" minOccurs="0"/>
 *         <element name="DNSname" type="{http://www.onvif.org/ver10/schema}DNSName" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}NetworkHostExtension" minOccurs="0"/>
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
@XmlType(name = "NetworkHost", propOrder = {
    "type",
    "iPv4Address",
    "iPv6Address",
    "dnSname",
    "extension"
})
public class NetworkHost {

    /**
     * Network host type: IPv4, IPv6 or DNS.
     * 
     */
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkHostType type;
    /**
     * IPv4 address.
     * 
     */
    @XmlElement(name = "IPv4Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv4Address;
    /**
     * IPv6 address.
     * 
     */
    @XmlElement(name = "IPv6Address")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iPv6Address;
    /**
     * DNS name.
     * 
     */
    @XmlElement(name = "DNSname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dnSname;
    @XmlElement(name = "Extension")
    protected NetworkHostExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Network host type: IPv4, IPv6 or DNS.
     * 
     * @return
     *     possible object is
     *     {@link NetworkHostType }
     *     
     */
    public NetworkHostType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkHostType }
     *     
     * @see #getType()
     */
    public void setType(NetworkHostType value) {
        this.type = value;
    }

    /**
     * IPv4 address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv4Address() {
        return iPv4Address;
    }

    /**
     * Sets the value of the iPv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIPv4Address()
     */
    public void setIPv4Address(String value) {
        this.iPv4Address = value;
    }

    /**
     * IPv6 address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPv6Address() {
        return iPv6Address;
    }

    /**
     * Sets the value of the iPv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIPv6Address()
     */
    public void setIPv6Address(String value) {
        this.iPv6Address = value;
    }

    /**
     * DNS name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNSname() {
        return dnSname;
    }

    /**
     * Sets the value of the dnSname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDNSname()
     */
    public void setDNSname(String value) {
        this.dnSname = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkHostExtension }
     *     
     */
    public NetworkHostExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkHostExtension }
     *     
     */
    public void setExtension(NetworkHostExtension value) {
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
