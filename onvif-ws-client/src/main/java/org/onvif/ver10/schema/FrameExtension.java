
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FrameExtension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FrameExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MotionInCells" type="{http://www.onvif.org/ver10/schema}MotionInCells" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FrameExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameExtension", propOrder = {
    "any",
    "motionInCells",
    "extension"
})
public class FrameExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "MotionInCells")
    protected MotionInCells motionInCells;
    @XmlElement(name = "Extension")
    protected FrameExtension2 extension;

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
     * Gets the value of the motionInCells property.
     * 
     * @return
     *     possible object is
     *     {@link MotionInCells }
     *     
     */
    public MotionInCells getMotionInCells() {
        return motionInCells;
    }

    /**
     * Sets the value of the motionInCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotionInCells }
     *     
     */
    public void setMotionInCells(MotionInCells value) {
        this.motionInCells = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link FrameExtension2 }
     *     
     */
    public FrameExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameExtension2 }
     *     
     */
    public void setExtension(FrameExtension2 value) {
        this.extension = value;
    }

}
