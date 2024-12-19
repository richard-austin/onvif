
package org.onvif.ver10.display.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.CodingCapabilities;
import org.onvif.ver10.schema.LayoutOptions;
import org.w3c.dom.Element;


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
 *         <element name="LayoutOptions" type="{http://www.onvif.org/ver10/schema}LayoutOptions" minOccurs="0"/>
 *         <element name="CodingCapabilities" type="{http://www.onvif.org/ver10/schema}CodingCapabilities"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
    "layoutOptions",
    "codingCapabilities",
    "any"
})
@XmlRootElement(name = "GetDisplayOptionsResponse")
public class GetDisplayOptionsResponse {

    /**
     * The LayoutOptions describe the fixed and predefined layouts of a
     *                   device. If the device does
     *                   not offer fixed layouts and allows setting the layout free this element is empty.
     * 
     */
    @XmlElement(name = "LayoutOptions")
    protected LayoutOptions layoutOptions;
    /**
     * decoding and encoding capabilities of the device
     * 
     */
    @XmlElement(name = "CodingCapabilities", required = true)
    protected CodingCapabilities codingCapabilities;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * The LayoutOptions describe the fixed and predefined layouts of a
     *                   device. If the device does
     *                   not offer fixed layouts and allows setting the layout free this element is empty.
     * 
     * @return
     *     possible object is
     *     {@link LayoutOptions }
     *     
     */
    public LayoutOptions getLayoutOptions() {
        return layoutOptions;
    }

    /**
     * Sets the value of the layoutOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link LayoutOptions }
     *     
     * @see #getLayoutOptions()
     */
    public void setLayoutOptions(LayoutOptions value) {
        this.layoutOptions = value;
    }

    /**
     * decoding and encoding capabilities of the device
     * 
     * @return
     *     possible object is
     *     {@link CodingCapabilities }
     *     
     */
    public CodingCapabilities getCodingCapabilities() {
        return codingCapabilities;
    }

    /**
     * Sets the value of the codingCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodingCapabilities }
     *     
     * @see #getCodingCapabilities()
     */
    public void setCodingCapabilities(CodingCapabilities value) {
        this.codingCapabilities = value;
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

}
