
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAnalyticsStream complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoAnalyticsStream">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="Frame" type="{http://www.onvif.org/ver10/schema}Frame"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsStreamExtension"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAnalyticsStream", propOrder = {
    "frameOrExtension"
})
public class VideoAnalyticsStream {

    @XmlElements({
        @XmlElement(name = "Frame", type = Frame.class),
        @XmlElement(name = "Extension", type = VideoAnalyticsStreamExtension.class)
    })
    protected List<java.lang.Object> frameOrExtension;

    /**
     * Gets the value of the frameOrExtension property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameOrExtension property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFrameOrExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Frame }
     * {@link VideoAnalyticsStreamExtension }
     * </p>
     * 
     * 
     * @return
     *     The value of the frameOrExtension property.
     */
    public List<java.lang.Object> getFrameOrExtension() {
        if (frameOrExtension == null) {
            frameOrExtension = new ArrayList<>();
        }
        return this.frameOrExtension;
    }

}
