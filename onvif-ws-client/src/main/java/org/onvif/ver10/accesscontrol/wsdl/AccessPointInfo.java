
package org.onvif.ver10.accesscontrol.wsdl;

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
 * The AccessPointInfo structure contains basic information about an AccessPoint instance.
 *             An AccessPoint defines an entity a Credential can be granted or denied access to. The
 *             AccessPointInfo provides basic information on how access is controlled in one direction
 *             for a
 *             door (from which area to which area).
 *             </p><p>
 *             door is the typical device involved, but other type of
 *             devices may be supported as well.
 *             Multiple AccessPoints may cover the same Door.
 *             A typical case is one AccessPoint for entry and another for exit, both referencing
 *             the same Door.
 *             </p><p>
 * 
 *             An ONVIF compliant device shall provide the following fields for each AccessPoint
 *             instance:
 * 
 * <p>Java class for AccessPointInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccessPointInfo">
 *   <complexContent>
 *     <extension base="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointInfoBase">
 *       <sequence>
 *         <element name="Capabilities" type="{http://www.onvif.org/ver10/accesscontrol/wsdl}AccessPointCapabilities"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessPointInfo", propOrder = {
    "capabilities",
    "any"
})
public class AccessPointInfo
    extends AccessPointInfoBase
{

    /**
     * The capabilities for the AccessPoint.
     * 
     */
    @XmlElement(name = "Capabilities", required = true)
    protected AccessPointCapabilities capabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * The capabilities for the AccessPoint.
     * 
     * @return
     *     possible object is
     *     {@link AccessPointCapabilities }
     *     
     */
    public AccessPointCapabilities getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPointCapabilities }
     *     
     * @see #getCapabilities()
     */
    public void setCapabilities(AccessPointCapabilities value) {
        this.capabilities = value;
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
