
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPv6Configuration complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPv6Configuration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcceptRouterAdvert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DHCP" type="{http://www.onvif.org/ver10/schema}IPv6DHCPConfiguration"/>
 *         <element name="Manual" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LinkLocal" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FromDHCP" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FromRA" type="{http://www.onvif.org/ver10/schema}PrefixedIPv6Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}IPv6ConfigurationExtension" minOccurs="0"/>
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
@XmlType(name = "IPv6Configuration", propOrder = {
    "acceptRouterAdvert",
    "dhcp",
    "manual",
    "linkLocal",
    "fromDHCP",
    "fromRA",
    "extension"
})
public class IPv6Configuration {

    /**
     * Indicates whether router advertisment is used.
     * 
     */
    @XmlElement(name = "AcceptRouterAdvert")
    protected Boolean acceptRouterAdvert;
    /**
     * DHCP configuration.
     * 
     */
    @XmlElement(name = "DHCP", required = true)
    @XmlSchemaType(name = "string")
    protected IPv6DHCPConfiguration dhcp;
    /**
     * List of manually entered IPv6 addresses.
     * 
     */
    @XmlElement(name = "Manual")
    protected List<PrefixedIPv6Address> manual;
    /**
     * List of link local IPv6 addresses.
     * 
     */
    @XmlElement(name = "LinkLocal")
    protected List<PrefixedIPv6Address> linkLocal;
    /**
     * List of IPv6 addresses configured by using DHCP.
     * 
     */
    @XmlElement(name = "FromDHCP")
    protected List<PrefixedIPv6Address> fromDHCP;
    /**
     * List of IPv6 addresses configured by using router advertisment.
     * 
     */
    @XmlElement(name = "FromRA")
    protected List<PrefixedIPv6Address> fromRA;
    @XmlElement(name = "Extension")
    protected IPv6ConfigurationExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Indicates whether router advertisment is used.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptRouterAdvert() {
        return acceptRouterAdvert;
    }

    /**
     * Sets the value of the acceptRouterAdvert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAcceptRouterAdvert()
     */
    public void setAcceptRouterAdvert(Boolean value) {
        this.acceptRouterAdvert = value;
    }

    /**
     * DHCP configuration.
     * 
     * @return
     *     possible object is
     *     {@link IPv6DHCPConfiguration }
     *     
     */
    public IPv6DHCPConfiguration getDHCP() {
        return dhcp;
    }

    /**
     * Sets the value of the dhcp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6DHCPConfiguration }
     *     
     * @see #getDHCP()
     */
    public void setDHCP(IPv6DHCPConfiguration value) {
        this.dhcp = value;
    }

    /**
     * List of manually entered IPv6 addresses.
     * 
     * Gets the value of the manual property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manual property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the manual property.
     */
    public List<PrefixedIPv6Address> getManual() {
        if (manual == null) {
            manual = new ArrayList<>();
        }
        return this.manual;
    }

    /**
     * List of link local IPv6 addresses.
     * 
     * Gets the value of the linkLocal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkLocal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinkLocal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the linkLocal property.
     */
    public List<PrefixedIPv6Address> getLinkLocal() {
        if (linkLocal == null) {
            linkLocal = new ArrayList<>();
        }
        return this.linkLocal;
    }

    /**
     * List of IPv6 addresses configured by using DHCP.
     * 
     * Gets the value of the fromDHCP property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromDHCP property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFromDHCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the fromDHCP property.
     */
    public List<PrefixedIPv6Address> getFromDHCP() {
        if (fromDHCP == null) {
            fromDHCP = new ArrayList<>();
        }
        return this.fromDHCP;
    }

    /**
     * List of IPv6 addresses configured by using router advertisment.
     * 
     * Gets the value of the fromRA property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromRA property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFromRA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefixedIPv6Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the fromRA property.
     */
    public List<PrefixedIPv6Address> getFromRA() {
        if (fromRA == null) {
            fromRA = new ArrayList<>();
        }
        return this.fromRA;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link IPv6ConfigurationExtension }
     *     
     */
    public IPv6ConfigurationExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPv6ConfigurationExtension }
     *     
     */
    public void setExtension(IPv6ConfigurationExtension value) {
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
