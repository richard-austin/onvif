
package org.onvif.ver20.ptz.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.PresetTour;


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
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="PresetTour" type="{http://www.onvif.org/ver10/schema}PresetTour"/>
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
    "profileToken",
    "presetTour"
})
@XmlRootElement(name = "ModifyPresetTour")
public class ModifyPresetTour {

    @XmlElement(name = "ProfileToken", required = true)
    protected String profileToken;
    @XmlElement(name = "PresetTour", required = true)
    protected PresetTour presetTour;

    /**
     * Gets the value of the profileToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileToken() {
        return profileToken;
    }

    /**
     * Sets the value of the profileToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileToken(String value) {
        this.profileToken = value;
    }

    /**
     * Gets the value of the presetTour property.
     * 
     * @return
     *     possible object is
     *     {@link PresetTour }
     *     
     */
    public PresetTour getPresetTour() {
        return presetTour;
    }

    /**
     * Sets the value of the presetTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresetTour }
     *     
     */
    public void setPresetTour(PresetTour value) {
        this.presetTour = value;
    }

}
