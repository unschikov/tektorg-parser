
package org.acme.getting.started.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * &lt;p&gt;Java class for lotUnitsType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="lotUnitsType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="unit" maxOccurs="unbounded"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="okeiCode" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="okpd2_code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="okved2_code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                   &amp;lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotUnitsType", propOrder = {
    "unit"
})
public class LotUnitsType {

    @XmlElement(required = true)
    protected List<Unit> unit;

    /**
     * Gets the value of the unit property.
     *
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the unit property.
     *
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUnit().add(newItem);
     * &lt;/pre&gt;
     *
     *
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Unit }
     *
     *
     */
    public List<Unit> getUnit() {
        if (unit == null) {
            unit = new ArrayList<Unit>();
        }
        return this.unit;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="okeiCode" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="okpd2_code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="okved2_code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *         &amp;lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "okeiCode",
        "okpd2Code",
        "okved2Code",
        "quantity"
    })
    public static class Unit {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String okeiCode;
        @XmlElement(name = "okpd2_code", required = true)
        protected String okpd2Code;
        @XmlElement(name = "okved2_code", required = true)
        protected String okved2Code;
        @XmlElement(required = true)
        protected String quantity;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the okeiCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOkeiCode() {
            return okeiCode;
        }

        /**
         * Sets the value of the okeiCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOkeiCode(String value) {
            this.okeiCode = value;
        }

        /**
         * Gets the value of the okpd2Code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOkpd2Code() {
            return okpd2Code;
        }

        /**
         * Sets the value of the okpd2Code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOkpd2Code(String value) {
            this.okpd2Code = value;
        }

        /**
         * Gets the value of the okved2Code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOkved2Code() {
            return okved2Code;
        }

        /**
         * Sets the value of the okved2Code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOkved2Code(String value) {
            this.okved2Code = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

    }

}
