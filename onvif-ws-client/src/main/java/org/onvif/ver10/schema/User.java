
package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for User complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="User">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserLevel" type="{http://www.onvif.org/ver10/schema}UserLevel"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}UserExtension" minOccurs="0"/>
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
@XmlType(name = "User", propOrder = {
    "username",
    "password",
    "userLevel",
    "extension"
})
public class User {

    /**
     * Username string.
     * 
     */
    @XmlElement(name = "Username", required = true)
    protected String username;
    /**
     * Password string.
     * 
     */
    @XmlElement(name = "Password")
    protected String password;
    /**
     * User level string.
     * 
     */
    @XmlElement(name = "UserLevel", required = true)
    @XmlSchemaType(name = "string")
    protected UserLevel userLevel;
    @XmlElement(name = "Extension")
    protected UserExtension extension;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<>();

    /**
     * Username string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUsername()
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Password string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassword()
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * User level string.
     * 
     * @return
     *     possible object is
     *     {@link UserLevel }
     *     
     */
    public UserLevel getUserLevel() {
        return userLevel;
    }

    /**
     * Sets the value of the userLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLevel }
     *     
     * @see #getUserLevel()
     */
    public void setUserLevel(UserLevel value) {
        this.userLevel = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link UserExtension }
     *     
     */
    public UserExtension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserExtension }
     *     
     */
    public void setExtension(UserExtension value) {
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

}
