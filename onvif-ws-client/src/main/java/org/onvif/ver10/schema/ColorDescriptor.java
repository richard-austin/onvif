
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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorDescriptor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ColorDescriptor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ColorCluster" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Color" type="{http://www.onvif.org/ver10/schema}Color"/>
 *                   <element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                   <element name="Covariance" type="{http://www.onvif.org/ver10/schema}ColorCovariance" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ColorDescriptorExtension" minOccurs="0"/>
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
@XmlType(name = "ColorDescriptor", propOrder = {
    "colorCluster",
    "extension"
})
public class ColorDescriptor {

    @XmlElement(name = "ColorCluster")
    protected List<ColorDescriptor.ColorCluster> colorCluster;
    @XmlElement(name = "Extension")
    protected ColorDescriptorExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Gets the value of the colorCluster property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorCluster property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getColorCluster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColorDescriptor.ColorCluster }
     * </p>
     * 
     * 
     * @return
     *     The value of the colorCluster property.
     */
    public List<ColorDescriptor.ColorCluster> getColorCluster() {
        if (colorCluster == null) {
            colorCluster = new ArrayList<>();
        }
        return this.colorCluster;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ColorDescriptorExtension }
     *     
     */
    public ColorDescriptorExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorDescriptorExtension }
     *     
     */
    public void setExtension(ColorDescriptorExtension value) {
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
     *         <element name="Color" type="{http://www.onvif.org/ver10/schema}Color"/>
     *         <element name="Weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *         <element name="Covariance" type="{http://www.onvif.org/ver10/schema}ColorCovariance" minOccurs="0"/>
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
        "color",
        "weight",
        "covariance"
    })
    public static class ColorCluster {

        @XmlElement(name = "Color", required = true)
        protected Color color;
        @XmlElement(name = "Weight")
        protected Float weight;
        @XmlElement(name = "Covariance")
        protected ColorCovariance covariance;

        /**
         * Gets the value of the color property.
         * 
         * @return
         *     possible object is
         *     {@link Color }
         *     
         */
        public Color getColor() {
            return color;
        }

        /**
         * Sets the value of the color property.
         * 
         * @param value
         *     allowed object is
         *     {@link Color }
         *     
         */
        public void setColor(Color value) {
            this.color = value;
        }

        /**
         * Gets the value of the weight property.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getWeight() {
            return weight;
        }

        /**
         * Sets the value of the weight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setWeight(Float value) {
            this.weight = value;
        }

        /**
         * Gets the value of the covariance property.
         * 
         * @return
         *     possible object is
         *     {@link ColorCovariance }
         *     
         */
        public ColorCovariance getCovariance() {
            return covariance;
        }

        /**
         * Sets the value of the covariance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ColorCovariance }
         *     
         */
        public void setCovariance(ColorCovariance value) {
            this.covariance = value;
        }

    }

}
