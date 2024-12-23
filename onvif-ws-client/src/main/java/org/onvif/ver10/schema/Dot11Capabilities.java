
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for Dot11Capabilities complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Dot11Capabilities">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TKIP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ScanAvailableNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MultipleConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AdHocStationMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="WEP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Dot11Capabilities", propOrder = {
    "tkip",
    "scanAvailableNetworks",
    "multipleConfiguration",
    "adHocStationMode",
    "wep",
    "any"
})
public class Dot11Capabilities {

    @XmlElement(name = "TKIP")
    protected boolean tkip;
    @XmlElement(name = "ScanAvailableNetworks")
    protected boolean scanAvailableNetworks;
    @XmlElement(name = "MultipleConfiguration")
    protected boolean multipleConfiguration;
    @XmlElement(name = "AdHocStationMode")
    protected boolean adHocStationMode;
    @XmlElement(name = "WEP")
    protected boolean wep;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the tkip property.
     * 
     */
    public boolean isTKIP() {
        return tkip;
    }

    /**
     * Sets the value of the tkip property.
     * 
     */
    public void setTKIP(boolean value) {
        this.tkip = value;
    }

    /**
     * Gets the value of the scanAvailableNetworks property.
     * 
     */
    public boolean isScanAvailableNetworks() {
        return scanAvailableNetworks;
    }

    /**
     * Sets the value of the scanAvailableNetworks property.
     * 
     */
    public void setScanAvailableNetworks(boolean value) {
        this.scanAvailableNetworks = value;
    }

    /**
     * Gets the value of the multipleConfiguration property.
     * 
     */
    public boolean isMultipleConfiguration() {
        return multipleConfiguration;
    }

    /**
     * Sets the value of the multipleConfiguration property.
     * 
     */
    public void setMultipleConfiguration(boolean value) {
        this.multipleConfiguration = value;
    }

    /**
     * Gets the value of the adHocStationMode property.
     * 
     */
    public boolean isAdHocStationMode() {
        return adHocStationMode;
    }

    /**
     * Sets the value of the adHocStationMode property.
     * 
     */
    public void setAdHocStationMode(boolean value) {
        this.adHocStationMode = value;
    }

    /**
     * Gets the value of the wep property.
     * 
     */
    public boolean isWEP() {
        return wep;
    }

    /**
     * Sets the value of the wep property.
     * 
     */
    public void setWEP(boolean value) {
        this.wep = value;
    }

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
     * {@link java.lang.Object }
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
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
