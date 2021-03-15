
package org.acme.getting.started.dto;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="startUpdateAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="endUpdateAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="registryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eisRegistryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="organizerINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="customerINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="limitPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sort" type="{http://api.tektorg.ru/procedures/soap}sortRules" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "exportRequestType")
public class ExportRequestType {

    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected Calendar endDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startUpdateAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endUpdateAt;
    protected String sectionCode;
    protected String registryNumber;
    protected String eisRegistryNumber;
    protected Integer typeId;
    protected String organizerINN;
    protected String customerINN;
    protected Integer limitPage;
    protected SortRules sort;
    protected Integer page;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Calendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(Calendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the startUpdateAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartUpdateAt() {
        return startUpdateAt;
    }

    /**
     * Sets the value of the startUpdateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartUpdateAt(XMLGregorianCalendar value) {
        this.startUpdateAt = value;
    }

    /**
     * Gets the value of the endUpdateAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndUpdateAt() {
        return endUpdateAt;
    }

    /**
     * Sets the value of the endUpdateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndUpdateAt(XMLGregorianCalendar value) {
        this.endUpdateAt = value;
    }

    /**
     * Gets the value of the sectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets the value of the sectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * Gets the value of the registryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Gets the value of the eisRegistryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEisRegistryNumber() {
        return eisRegistryNumber;
    }

    /**
     * Sets the value of the eisRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEisRegistryNumber(String value) {
        this.eisRegistryNumber = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the organizerINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizerINN() {
        return organizerINN;
    }

    /**
     * Sets the value of the organizerINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizerINN(String value) {
        this.organizerINN = value;
    }

    /**
     * Gets the value of the customerINN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerINN() {
        return customerINN;
    }

    /**
     * Sets the value of the customerINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerINN(String value) {
        this.customerINN = value;
    }

    /**
     * Gets the value of the limitPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimitPage() {
        return limitPage;
    }

    /**
     * Sets the value of the limitPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimitPage(Integer value) {
        this.limitPage = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SortRules }
     *     
     */
    public SortRules getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortRules }
     *     
     */
    public void setSort(SortRules value) {
        this.sort = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

}
