
package org.acme.getting.started.dto;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
    protected String startDate;
    @XmlSchemaType(name = "dateTime")
    protected String endDate;
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


    public String  getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String  value) {
        this.endDate = value;
    }

    public XMLGregorianCalendar getStartUpdateAt() {
        return startUpdateAt;
    }

    public void setStartUpdateAt(XMLGregorianCalendar value) {
        this.startUpdateAt = value;
    }

    public XMLGregorianCalendar getEndUpdateAt() {
        return endUpdateAt;
    }

    public void setEndUpdateAt(XMLGregorianCalendar value) {
        this.endUpdateAt = value;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    public String getEisRegistryNumber() {
        return eisRegistryNumber;
    }

    public void setEisRegistryNumber(String value) {
        this.eisRegistryNumber = value;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer value) {
        this.typeId = value;
    }

    public String getOrganizerINN() {
        return organizerINN;
    }

    public void setOrganizerINN(String value) {
        this.organizerINN = value;
    }

    public String getCustomerINN() {
        return customerINN;
    }

    public void setCustomerINN(String value) {
        this.customerINN = value;
    }

    public Integer getLimitPage() {
        return limitPage;
    }

    public void setLimitPage(Integer value) {
        this.limitPage = value;
    }

    public SortRules getSort() {
        return sort;
    }

    public void setSort(SortRules value) {
        this.sort = value;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer value) {
        this.page = value;
    }

}
