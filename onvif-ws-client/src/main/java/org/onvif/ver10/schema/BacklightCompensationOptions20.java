
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BacklightCompensationOptions20 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BacklightCompensationOptions20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Mode" type="{http://www.onvif.org/ver10/schema}BacklightCompensationMode" maxOccurs="unbounded"/>
 *         <element name="Level" type="{http://www.onvif.org/ver10/schema}FloatRange" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BacklightCompensationOptions20", propOrder = {
    "mode",
    "level"
})
public class BacklightCompensationOptions20 {

    /**
     * 'ON' or 'OFF'
     * 
     */
    @XmlElement(name = "Mode", required = true)
    @XmlSchemaType(name = "string")
    protected List<BacklightCompensationMode> mode;
    /**
     * Level range of BacklightCompensation.
     * 
     */
    @XmlElement(name = "Level")
    protected FloatRange level;

    /**
     * 'ON' or 'OFF'
     * 
     * Gets the value of the mode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BacklightCompensationMode }
     * </p>
     * 
     * 
     * @return
     *     The value of the mode property.
     */
    public List<BacklightCompensationMode> getMode() {
        if (mode == null) {
            mode = new ArrayList<>();
        }
        return this.mode;
    }

    /**
     * Level range of BacklightCompensation.
     * 
     * @return
     *     possible object is
     *     {@link FloatRange }
     *     
     */
    public FloatRange getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatRange }
     *     
     * @see #getLevel()
     */
    public void setLevel(FloatRange value) {
        this.level = value;
    }

}
