
package org.onvif.ver10.deviceio.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialPortOptions" type="{http://www.onvif.org/ver10/deviceIO/wsdl}SerialPortConfigurationOptions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serialPortOptions"
})
@XmlRootElement(name = "GetSerialPortConfigurationOptionsResponse")
public class GetSerialPortConfigurationOptionsResponse {

    @XmlElement(name = "SerialPortOptions", required = true)
    protected SerialPortConfigurationOptions serialPortOptions;

    /**
     * Gets the value of the serialPortOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SerialPortConfigurationOptions }
     *     
     */
    public SerialPortConfigurationOptions getSerialPortOptions() {
        return serialPortOptions;
    }

    /**
     * Sets the value of the serialPortOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialPortConfigurationOptions }
     *     
     */
    public void setSerialPortOptions(SerialPortConfigurationOptions value) {
        this.serialPortOptions = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.DEFAULT_STYLE);
    }

}
