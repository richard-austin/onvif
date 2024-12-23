
package org.onvif.ver10.search.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RecordingSummary;


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
 *         <element name="Summary" type="{http://www.onvif.org/ver10/schema}RecordingSummary"/>
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
    "summary"
})
@XmlRootElement(name = "GetRecordingSummaryResponse")
public class GetRecordingSummaryResponse {

    @XmlElement(name = "Summary", required = true)
    protected RecordingSummary summary;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingSummary }
     *     
     */
    public RecordingSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingSummary }
     *     
     */
    public void setSummary(RecordingSummary value) {
        this.summary = value;
    }

}
