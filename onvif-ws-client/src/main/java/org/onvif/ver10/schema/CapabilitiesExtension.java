
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
 * <p>Java class for CapabilitiesExtension complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CapabilitiesExtension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DeviceIO" type="{http://www.onvif.org/ver10/schema}DeviceIOCapabilities" minOccurs="0"/>
 *         <element name="Display" type="{http://www.onvif.org/ver10/schema}DisplayCapabilities" minOccurs="0"/>
 *         <element name="Recording" type="{http://www.onvif.org/ver10/schema}RecordingCapabilities" minOccurs="0"/>
 *         <element name="Search" type="{http://www.onvif.org/ver10/schema}SearchCapabilities" minOccurs="0"/>
 *         <element name="Replay" type="{http://www.onvif.org/ver10/schema}ReplayCapabilities" minOccurs="0"/>
 *         <element name="Receiver" type="{http://www.onvif.org/ver10/schema}ReceiverCapabilities" minOccurs="0"/>
 *         <element name="AnalyticsDevice" type="{http://www.onvif.org/ver10/schema}AnalyticsDeviceCapabilities" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.onvif.org/ver10/schema}CapabilitiesExtension2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesExtension", propOrder = {
    "any",
    "deviceIO",
    "display",
    "recording",
    "search",
    "replay",
    "receiver",
    "analyticsDevice",
    "extensions"
})
public class CapabilitiesExtension {

    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;
    @XmlElement(name = "DeviceIO")
    protected DeviceIOCapabilities deviceIO;
    @XmlElement(name = "Display")
    protected DisplayCapabilities display;
    @XmlElement(name = "Recording")
    protected RecordingCapabilities recording;
    @XmlElement(name = "Search")
    protected SearchCapabilities search;
    @XmlElement(name = "Replay")
    protected ReplayCapabilities replay;
    @XmlElement(name = "Receiver")
    protected ReceiverCapabilities receiver;
    @XmlElement(name = "AnalyticsDevice")
    protected AnalyticsDeviceCapabilities analyticsDevice;
    @XmlElement(name = "Extensions")
    protected CapabilitiesExtension2 extensions;

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
     * Gets the value of the deviceIO property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIOCapabilities }
     *     
     */
    public DeviceIOCapabilities getDeviceIO() {
        return deviceIO;
    }

    /**
     * Sets the value of the deviceIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIOCapabilities }
     *     
     */
    public void setDeviceIO(DeviceIOCapabilities value) {
        this.deviceIO = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayCapabilities }
     *     
     */
    public DisplayCapabilities getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayCapabilities }
     *     
     */
    public void setDisplay(DisplayCapabilities value) {
        this.display = value;
    }

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingCapabilities }
     *     
     */
    public RecordingCapabilities getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingCapabilities }
     *     
     */
    public void setRecording(RecordingCapabilities value) {
        this.recording = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCapabilities }
     *     
     */
    public SearchCapabilities getSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCapabilities }
     *     
     */
    public void setSearch(SearchCapabilities value) {
        this.search = value;
    }

    /**
     * Gets the value of the replay property.
     * 
     * @return
     *     possible object is
     *     {@link ReplayCapabilities }
     *     
     */
    public ReplayCapabilities getReplay() {
        return replay;
    }

    /**
     * Sets the value of the replay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplayCapabilities }
     *     
     */
    public void setReplay(ReplayCapabilities value) {
        this.replay = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverCapabilities }
     *     
     */
    public ReceiverCapabilities getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverCapabilities }
     *     
     */
    public void setReceiver(ReceiverCapabilities value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the analyticsDevice property.
     * 
     * @return
     *     possible object is
     *     {@link AnalyticsDeviceCapabilities }
     *     
     */
    public AnalyticsDeviceCapabilities getAnalyticsDevice() {
        return analyticsDevice;
    }

    /**
     * Sets the value of the analyticsDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyticsDeviceCapabilities }
     *     
     */
    public void setAnalyticsDevice(AnalyticsDeviceCapabilities value) {
        this.analyticsDevice = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesExtension2 }
     *     
     */
    public CapabilitiesExtension2 getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesExtension2 }
     *     
     */
    public void setExtensions(CapabilitiesExtension2 value) {
        this.extensions = value;
    }

}
