
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
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Dot11AvailableNetworks complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Dot11AvailableNetworks">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SSID" type="{http://www.onvif.org/ver10/schema}Dot11SSIDType"/>
 *         <element name="BSSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthAndMangementSuite" type="{http://www.onvif.org/ver10/schema}Dot11AuthAndMangementSuite" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PairCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GroupCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SignalStrength" type="{http://www.onvif.org/ver10/schema}Dot11SignalStrength" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11AvailableNetworksExtension" minOccurs="0"/>
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
@XmlType(name = "Dot11AvailableNetworks", propOrder = {
    "ssid",
    "bssid",
    "authAndMangementSuite",
    "pairCipher",
    "groupCipher",
    "signalStrength",
    "extension"
})
public class Dot11AvailableNetworks {

    @XmlElement(name = "SSID", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ssid;
    @XmlElement(name = "BSSID")
    protected String bssid;
    /**
     * See IEEE802.11 7.3.2.25.2 for details.
     * 
     */
    @XmlElement(name = "AuthAndMangementSuite")
    @XmlSchemaType(name = "string")
    protected List<Dot11AuthAndMangementSuite> authAndMangementSuite;
    @XmlElement(name = "PairCipher")
    @XmlSchemaType(name = "string")
    protected List<Dot11Cipher> pairCipher;
    @XmlElement(name = "GroupCipher")
    @XmlSchemaType(name = "string")
    protected List<Dot11Cipher> groupCipher;
    @XmlElement(name = "SignalStrength")
    @XmlSchemaType(name = "string")
    protected Dot11SignalStrength signalStrength;
    @XmlElement(name = "Extension")
    protected Dot11AvailableNetworksExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSSID() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSID(byte[] value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the bssid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSSID() {
        return bssid;
    }

    /**
     * Sets the value of the bssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSSID(String value) {
        this.bssid = value;
    }

    /**
     * See IEEE802.11 7.3.2.25.2 for details.
     * 
     * Gets the value of the authAndMangementSuite property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authAndMangementSuite property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAuthAndMangementSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11AuthAndMangementSuite }
     * </p>
     * 
     * 
     * @return
     *     The value of the authAndMangementSuite property.
     */
    public List<Dot11AuthAndMangementSuite> getAuthAndMangementSuite() {
        if (authAndMangementSuite == null) {
            authAndMangementSuite = new ArrayList<>();
        }
        return this.authAndMangementSuite;
    }

    /**
     * Gets the value of the pairCipher property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairCipher property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPairCipher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11Cipher }
     * </p>
     * 
     * 
     * @return
     *     The value of the pairCipher property.
     */
    public List<Dot11Cipher> getPairCipher() {
        if (pairCipher == null) {
            pairCipher = new ArrayList<>();
        }
        return this.pairCipher;
    }

    /**
     * Gets the value of the groupCipher property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCipher property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGroupCipher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dot11Cipher }
     * </p>
     * 
     * 
     * @return
     *     The value of the groupCipher property.
     */
    public List<Dot11Cipher> getGroupCipher() {
        if (groupCipher == null) {
            groupCipher = new ArrayList<>();
        }
        return this.groupCipher;
    }

    /**
     * Gets the value of the signalStrength property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11SignalStrength }
     *     
     */
    public Dot11SignalStrength getSignalStrength() {
        return signalStrength;
    }

    /**
     * Sets the value of the signalStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11SignalStrength }
     *     
     */
    public void setSignalStrength(Dot11SignalStrength value) {
        this.signalStrength = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Dot11AvailableNetworksExtension }
     *     
     */
    public Dot11AvailableNetworksExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dot11AvailableNetworksExtension }
     *     
     */
    public void setExtension(Dot11AvailableNetworksExtension value) {
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
