package org.acme.getting.started.dto;

import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "remoteId",
        "urlToShowcase",
        "registryNumber",
        "title",
        "datePublished",
        "dateUpdated",
        "dateRegistrationTech",
        "dateEndRegistration",
        "dateEndSecondPartsReview",
        "dateEndPrequalification",
        "dateBeginAuction",
        "dateEndAuction",
        "clarificationStartDate",
        "clarificationEndDate",
        "clarificationDeliveryProcedure",
        "dateEndRegistrationTech",
        "dateEndRegistrationCom",
        "dateArchived",
        "procedureType",
        "contactEmail",
        "contactPhone",
        "contactPerson",
        "reviewApplicsCity",
        "currency",
        "organizer",
        "documents",
        "lots"
})
@XmlRootElement(name = "procedure")
@ToString
public class Procedure {

    protected int remoteId;
    @XmlElement(name = "url_to_showcase", required = true)
    protected String urlToShowcase;
    protected String registryNumber;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected String datePublished;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected String dateUpdated;
    @XmlSchemaType(name = "dateTime")
    protected String dateRegistrationTech;
    @XmlSchemaType(name = "dateTime")
    protected String dateEndRegistration;
    @XmlSchemaType(name = "dateTime")
    protected String dateEndSecondPartsReview;
    @XmlSchemaType(name = "dateTime")
    protected String dateEndPrequalification;
    @XmlSchemaType(name = "dateTime")
    protected String dateBeginAuction;
    @XmlSchemaType(name = "dateTime")
    protected String dateEndAuction;
    @XmlSchemaType(name = "dateTime")
    protected String clarificationStartDate;
    @XmlSchemaType(name = "dateTime")
    protected String clarificationEndDate;
    protected String clarificationDeliveryProcedure;
    @XmlSchemaType(name = "dateTime")
    protected String dateEndRegistrationTech;
    @XmlSchemaType(name = "dateTime")
    protected String dateEndRegistrationCom;
    @XmlSchemaType(name = "dateTime")
    protected String dateArchived;
    @XmlElement(required = true)
    protected ProcedureType procedureType;
    protected String contactEmail;
    protected String contactPhone;
    protected String contactPerson;
    protected String reviewApplicsCity;
    protected String currency;
    @XmlElement(required = true)
    protected OrganizationType organizer;
    protected DocumentsType documents;
    @XmlElement(required = true)
    protected Lots lots;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the remoteId property.
     */
    public int getRemoteId() {
        return remoteId;
    }

    /**
     * Sets the value of the remoteId property.
     */
    public void setRemoteId(int value) {
        this.remoteId = value;
    }

    /**
     * Gets the value of the urlToShowcase property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUrlToShowcase() {
        return urlToShowcase;
    }

    /**
     * Sets the value of the urlToShowcase property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUrlToShowcase(String value) {
        this.urlToShowcase = value;
    }

    /**
     * Gets the value of the registryNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Gets the value of the title property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the datePublished property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDatePublished() {
        return datePublished;
    }

    /**
     * Sets the value of the datePublished property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDatePublished(String value) {
        this.datePublished = value;
    }


    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String value) throws Exception {
        this.dateUpdated = value;
    }

    /**
     * Gets the value of the dateRegistrationTech property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateRegistrationTech() {
        return dateRegistrationTech;
    }

    /**
     * Sets the value of the dateRegistrationTech property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateRegistrationTech(String value) {
        this.dateRegistrationTech = value;
    }

    /**
     * Gets the value of the dateEndRegistration property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateEndRegistration() {
        return dateEndRegistration;
    }

    /**
     * Sets the value of the dateEndRegistration property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateEndRegistration(String value) {
        this.dateEndRegistration = value;
    }

    /**
     * Gets the value of the dateEndSecondPartsReview property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateEndSecondPartsReview() {
        return dateEndSecondPartsReview;
    }

    /**
     * Sets the value of the dateEndSecondPartsReview property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateEndSecondPartsReview(String value) {
        this.dateEndSecondPartsReview = value;
    }

    /**
     * Gets the value of the dateEndPrequalification property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateEndPrequalification() {
        return dateEndPrequalification;
    }

    /**
     * Sets the value of the dateEndPrequalification property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateEndPrequalification(String value) {
        this.dateEndPrequalification = value;
    }

    /**
     * Gets the value of the dateBeginAuction property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateBeginAuction() {
        return dateBeginAuction;
    }

    /**
     * Sets the value of the dateBeginAuction property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateBeginAuction(String value) {
        this.dateBeginAuction = value;
    }

    /**
     * Gets the value of the dateEndAuction property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateEndAuction() {
        return dateEndAuction;
    }

    /**
     * Sets the value of the dateEndAuction property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateEndAuction(String value) {
        this.dateEndAuction = value;
    }

    /**
     * Gets the value of the clarificationStartDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClarificationStartDate() {
        return clarificationStartDate;
    }

    /**
     * Sets the value of the clarificationStartDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClarificationStartDate(String value) {
        this.clarificationStartDate = value;
    }

    /**
     * Gets the value of the clarificationEndDate property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClarificationEndDate() {
        return clarificationEndDate;
    }

    /**
     * Sets the value of the clarificationEndDate property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClarificationEndDate(String value) {
        this.clarificationEndDate = value;
    }

    /**
     * Gets the value of the clarificationDeliveryProcedure property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClarificationDeliveryProcedure() {
        return clarificationDeliveryProcedure;
    }

    /**
     * Sets the value of the clarificationDeliveryProcedure property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClarificationDeliveryProcedure(String value) {
        this.clarificationDeliveryProcedure = value;
    }

    /**
     * Gets the value of the dateEndRegistrationTech property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateEndRegistrationTech() {
        return dateEndRegistrationTech;
    }

    /**
     * Sets the value of the dateEndRegistrationTech property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateEndRegistrationTech(String value) {
        this.dateEndRegistrationTech = value;
    }

    /**
     * Gets the value of the dateEndRegistrationCom property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateEndRegistrationCom() {
        return dateEndRegistrationCom;
    }

    /**
     * Sets the value of the dateEndRegistrationCom property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateEndRegistrationCom(String value) {
        this.dateEndRegistrationCom = value;
    }

    /**
     * Gets the value of the dateArchived property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDateArchived() {
        return dateArchived;
    }

    /**
     * Sets the value of the dateArchived property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDateArchived(String value) {
        this.dateArchived = value;
    }

    /**
     * Gets the value of the procedureType property.
     *
     * @return possible object is
     * {@link ProcedureType }
     */
    public ProcedureType getProcedureType() {
        return procedureType;
    }

    /**
     * Sets the value of the procedureType property.
     *
     * @param value allowed object is
     *              {@link ProcedureType }
     */
    public void setProcedureType(ProcedureType value) {
        this.procedureType = value;
    }

    /**
     * Gets the value of the contactEmail property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Sets the value of the contactEmail property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Gets the value of the contactPhone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactPerson property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the reviewApplicsCity property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getReviewApplicsCity() {
        return reviewApplicsCity;
    }

    /**
     * Sets the value of the reviewApplicsCity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReviewApplicsCity(String value) {
        this.reviewApplicsCity = value;
    }

    /**
     * Gets the value of the currency property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the organizer property.
     *
     * @return possible object is
     * {@link OrganizationType }
     */
    public OrganizationType getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the organizer property.
     *
     * @param value allowed object is
     *              {@link OrganizationType }
     */
    public void setOrganizer(OrganizationType value) {
        this.organizer = value;
    }

    /**
     * Gets the value of the documents property.
     *
     * @return possible object is
     * {@link DocumentsType }
     */
    public DocumentsType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     *
     * @param value allowed object is
     *              {@link DocumentsType }
     */
    public void setDocuments(DocumentsType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the lots property.
     *
     * @return possible object is
     * {@link Lots }
     */
    public Lots getLots() {
        return lots;
    }

    /**
     * Sets the value of the lots property.
     *
     * @param value allowed object is
     *              {@link Lots }
     */
    public void setLots(Lots value) {
        this.lots = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "lot"
    })
    public static class Lots {

        @XmlElement(required = true)
        protected List<Lot> lot;

        public List<Lot> getLot() {
            if (lot == null) {
                lot = new ArrayList<Lot>();
            }
            return this.lot;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "remoteId",
                "number",
                "subject",
                "startPrice",
                "status",
                "nds",
                "startPriceNoNds",
                "startPriceUndefined",
                "alternativeApplics",
                "customers",
                "lotOkved",
                "lotOkved2",
                "deliveryPlaces",
                "nomenclature",
                "nomenclature2",
                "lotUnits",
                "documents"
        })
        @ToString
        public static class Lot {

            protected int remoteId;
            protected int number;
            @XmlElement(required = true)
            protected String subject;
            protected Float startPrice;
            @XmlElement(required = true)
            protected String status;
            protected String nds;
            protected Float startPriceNoNds;
            protected Boolean startPriceUndefined;
            protected Boolean alternativeApplics;
            protected CustomersType customers;
            protected LotOkvedsType lotOkved;
            protected LotOkvedsType lotOkved2;
            protected DeliveryplacesType deliveryPlaces;
            protected NomenclatureType nomenclature;
            protected NomenclatureType nomenclature2;
            protected LotUnitsType lotUnits;
            protected DocumentsType documents;
            @XmlAttribute(name = "id")
            protected Integer id;

            /**
             * Gets the value of the remoteId property.
             */
            public int getRemoteId() {
                return remoteId;
            }

            /**
             * Sets the value of the remoteId property.
             */
            public void setRemoteId(int value) {
                this.remoteId = value;
            }

            /**
             * Gets the value of the number property.
             */
            public int getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             */
            public void setNumber(int value) {
                this.number = value;
            }

            /**
             * Gets the value of the subject property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSubject() {
                return subject;
            }

            /**
             * Sets the value of the subject property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSubject(String value) {
                this.subject = value;
            }

            /**
             * Gets the value of the startPrice property.
             *
             * @return possible object is
             * {@link Float }
             */
            public Float getStartPrice() {
                return startPrice;
            }

            /**
             * Sets the value of the startPrice property.
             *
             * @param value allowed object is
             *              {@link Float }
             */
            public void setStartPrice(Float value) {
                this.startPrice = value;
            }

            /**
             * Gets the value of the status property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the nds property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNds() {
                return nds;
            }

            /**
             * Sets the value of the nds property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNds(String value) {
                this.nds = value;
            }

            /**
             * Gets the value of the startPriceNoNds property.
             *
             * @return possible object is
             * {@link Float }
             */
            public Float getStartPriceNoNds() {
                return startPriceNoNds;
            }

            /**
             * Sets the value of the startPriceNoNds property.
             *
             * @param value allowed object is
             *              {@link Float }
             */
            public void setStartPriceNoNds(Float value) {
                this.startPriceNoNds = value;
            }

            /**
             * Gets the value of the startPriceUndefined property.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isStartPriceUndefined() {
                return startPriceUndefined;
            }

            /**
             * Sets the value of the startPriceUndefined property.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setStartPriceUndefined(Boolean value) {
                this.startPriceUndefined = value;
            }

            /**
             * Gets the value of the alternativeApplics property.
             *
             * @return possible object is
             * {@link Boolean }
             */
            public Boolean isAlternativeApplics() {
                return alternativeApplics;
            }

            /**
             * Sets the value of the alternativeApplics property.
             *
             * @param value allowed object is
             *              {@link Boolean }
             */
            public void setAlternativeApplics(Boolean value) {
                this.alternativeApplics = value;
            }

            /**
             * Gets the value of the customers property.
             *
             * @return possible object is
             * {@link CustomersType }
             */
            public CustomersType getCustomers() {
                return customers;
            }

            /**
             * Sets the value of the customers property.
             *
             * @param value allowed object is
             *              {@link CustomersType }
             */
            public void setCustomers(CustomersType value) {
                this.customers = value;
            }

            /**
             * Gets the value of the lotOkved property.
             *
             * @return possible object is
             * {@link LotOkvedsType }
             */
            public LotOkvedsType getLotOkved() {
                return lotOkved;
            }

            /**
             * Sets the value of the lotOkved property.
             *
             * @param value allowed object is
             *              {@link LotOkvedsType }
             */
            public void setLotOkved(LotOkvedsType value) {
                this.lotOkved = value;
            }

            /**
             * Gets the value of the lotOkved2 property.
             *
             * @return possible object is
             * {@link LotOkvedsType }
             */
            public LotOkvedsType getLotOkved2() {
                return lotOkved2;
            }

            /**
             * Sets the value of the lotOkved2 property.
             *
             * @param value allowed object is
             *              {@link LotOkvedsType }
             */
            public void setLotOkved2(LotOkvedsType value) {
                this.lotOkved2 = value;
            }

            /**
             * Gets the value of the deliveryPlaces property.
             *
             * @return possible object is
             * {@link DeliveryplacesType }
             */
            public DeliveryplacesType getDeliveryPlaces() {
                return deliveryPlaces;
            }

            /**
             * Sets the value of the deliveryPlaces property.
             *
             * @param value allowed object is
             *              {@link DeliveryplacesType }
             */
            public void setDeliveryPlaces(DeliveryplacesType value) {
                this.deliveryPlaces = value;
            }

            /**
             * Gets the value of the nomenclature property.
             *
             * @return possible object is
             * {@link NomenclatureType }
             */
            public NomenclatureType getNomenclature() {
                return nomenclature;
            }

            /**
             * Sets the value of the nomenclature property.
             *
             * @param value allowed object is
             *              {@link NomenclatureType }
             */
            public void setNomenclature(NomenclatureType value) {
                this.nomenclature = value;
            }

            /**
             * Gets the value of the nomenclature2 property.
             *
             * @return possible object is
             * {@link NomenclatureType }
             */
            public NomenclatureType getNomenclature2() {
                return nomenclature2;
            }

            /**
             * Sets the value of the nomenclature2 property.
             *
             * @param value allowed object is
             *              {@link NomenclatureType }
             */
            public void setNomenclature2(NomenclatureType value) {
                this.nomenclature2 = value;
            }

            /**
             * Gets the value of the lotUnits property.
             *
             * @return possible object is
             * {@link LotUnitsType }
             */
            public LotUnitsType getLotUnits() {
                return lotUnits;
            }

            /**
             * Sets the value of the lotUnits property.
             *
             * @param value allowed object is
             *              {@link LotUnitsType }
             */
            public void setLotUnits(LotUnitsType value) {
                this.lotUnits = value;
            }

            /**
             * Gets the value of the documents property.
             *
             * @return possible object is
             * {@link DocumentsType }
             */
            public DocumentsType getDocuments() {
                return documents;
            }

            /**
             * Sets the value of the documents property.
             *
             * @param value allowed object is
             *              {@link DocumentsType }
             */
            public void setDocuments(DocumentsType value) {
                this.documents = value;
            }

            /**
             * Gets the value of the id property.
             *
             * @return possible object is
             * {@link Integer }
             */
            public Integer getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value allowed object is
             *              {@link Integer }
             */
            public void setId(Integer value) {
                this.id = value;
            }
        }

    }
}
