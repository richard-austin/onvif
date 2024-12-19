
package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for H264Options complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="H264Options">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ResolutionsAvailable" type="{http://www.onvif.org/ver10/schema}VideoResolution" maxOccurs="unbounded"/>
 *         <element name="GovLengthRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="FrameRateRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="EncodingIntervalRange" type="{http://www.onvif.org/ver10/schema}IntRange"/>
 *         <element name="H264ProfilesSupported" type="{http://www.onvif.org/ver10/schema}H264Profile" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "H264Options", propOrder = {
    "resolutionsAvailable",
    "govLengthRange",
    "frameRateRange",
    "encodingIntervalRange",
    "h264ProfilesSupported"
})
@XmlSeeAlso({
    H264Options2 .class
})
public class H264Options {

    /**
     * List of supported image sizes.
     * 
     */
    @XmlElement(name = "ResolutionsAvailable", required = true)
    protected List<VideoResolution> resolutionsAvailable;
    /**
     * Supported group of Video frames length. This value typically corresponds
     *             to the I-Frame distance.
     * 
     */
    @XmlElement(name = "GovLengthRange", required = true)
    protected IntRange govLengthRange;
    /**
     * Supported frame rate in fps (frames per second).
     * 
     */
    @XmlElement(name = "FrameRateRange", required = true)
    protected IntRange frameRateRange;
    /**
     * Supported encoding interval range. The encoding interval corresponds to
     *             the number of frames devided by the encoded frames. An encoding interval value of "1"
     *             means that all frames are encoded.
     * 
     */
    @XmlElement(name = "EncodingIntervalRange", required = true)
    protected IntRange encodingIntervalRange;
    /**
     * List of supported H.264 profiles.
     * 
     */
    @XmlElement(name = "H264ProfilesSupported", required = true)
    @XmlSchemaType(name = "string")
    protected List<H264Profile> h264ProfilesSupported;

    /**
     * List of supported image sizes.
     * 
     * Gets the value of the resolutionsAvailable property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutionsAvailable property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResolutionsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResolution }
     * </p>
     * 
     * 
     * @return
     *     The value of the resolutionsAvailable property.
     */
    public List<VideoResolution> getResolutionsAvailable() {
        if (resolutionsAvailable == null) {
            resolutionsAvailable = new ArrayList<>();
        }
        return this.resolutionsAvailable;
    }

    /**
     * Supported group of Video frames length. This value typically corresponds
     *             to the I-Frame distance.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getGovLengthRange() {
        return govLengthRange;
    }

    /**
     * Sets the value of the govLengthRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getGovLengthRange()
     */
    public void setGovLengthRange(IntRange value) {
        this.govLengthRange = value;
    }

    /**
     * Supported frame rate in fps (frames per second).
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getFrameRateRange() {
        return frameRateRange;
    }

    /**
     * Sets the value of the frameRateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getFrameRateRange()
     */
    public void setFrameRateRange(IntRange value) {
        this.frameRateRange = value;
    }

    /**
     * Supported encoding interval range. The encoding interval corresponds to
     *             the number of frames devided by the encoded frames. An encoding interval value of "1"
     *             means that all frames are encoded.
     * 
     * @return
     *     possible object is
     *     {@link IntRange }
     *     
     */
    public IntRange getEncodingIntervalRange() {
        return encodingIntervalRange;
    }

    /**
     * Sets the value of the encodingIntervalRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRange }
     *     
     * @see #getEncodingIntervalRange()
     */
    public void setEncodingIntervalRange(IntRange value) {
        this.encodingIntervalRange = value;
    }

    /**
     * List of supported H.264 profiles.
     * 
     * Gets the value of the h264ProfilesSupported property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the h264ProfilesSupported property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getH264ProfilesSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H264Profile }
     * </p>
     * 
     * 
     * @return
     *     The value of the h264ProfilesSupported property.
     */
    public List<H264Profile> getH264ProfilesSupported() {
        if (h264ProfilesSupported == null) {
            h264ProfilesSupported = new ArrayList<>();
        }
        return this.h264ProfilesSupported;
    }

}
