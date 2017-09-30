//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:20 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.codebalance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codebalance" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auxiliary_accounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="voucher_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="voucher_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="debit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primary_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primary_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primary_end_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="natural_end_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="departmentcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="customercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="suppliercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bill_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reserve1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="roottag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="docid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="receiver" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="proc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codeexchanged" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="exportneedexch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="renewproofno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codebalance"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Codebalance> codebalance;
    @XmlAttribute(name = "roottag")
    protected String roottag;
    @XmlAttribute(name = "billtype")
    protected String billtype;
    @XmlAttribute(name = "docid")
    protected String docid;
    @XmlAttribute(name = "receiver")
    protected String receiver;
    @XmlAttribute(name = "sender")
    protected String sender;
    @XmlAttribute(name = "proc")
    protected String proc;
    @XmlAttribute(name = "codeexchanged")
    protected String codeexchanged;
    @XmlAttribute(name = "exportneedexch")
    protected String exportneedexch;
    @XmlAttribute(name = "renewproofno")
    protected String renewproofno;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the codebalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codebalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodebalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Codebalance }
     * 
     * 
     */
    public List<Ufinterface.Codebalance> getCodebalance() {
        if (codebalance == null) {
            codebalance = new ArrayList<Ufinterface.Codebalance>();
        }
        return this.codebalance;
    }

    /**
     * 获取roottag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoottag() {
        return roottag;
    }

    /**
     * 设置roottag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoottag(String value) {
        this.roottag = value;
    }

    /**
     * 获取billtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltype() {
        return billtype;
    }

    /**
     * 设置billtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltype(String value) {
        this.billtype = value;
    }

    /**
     * 获取docid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocid() {
        return docid;
    }

    /**
     * 设置docid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocid(String value) {
        this.docid = value;
    }

    /**
     * 获取receiver属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置receiver属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiver(String value) {
        this.receiver = value;
    }

    /**
     * 获取sender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * 设置sender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * 获取proc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProc() {
        return proc;
    }

    /**
     * 设置proc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProc(String value) {
        this.proc = value;
    }

    /**
     * 获取codeexchanged属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeexchanged() {
        return codeexchanged;
    }

    /**
     * 设置codeexchanged属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeexchanged(String value) {
        this.codeexchanged = value;
    }

    /**
     * 获取exportneedexch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportneedexch() {
        return exportneedexch;
    }

    /**
     * 设置exportneedexch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportneedexch(String value) {
        this.exportneedexch = value;
    }

    /**
     * 获取renewproofno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewproofno() {
        return renewproofno;
    }

    /**
     * 设置renewproofno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewproofno(String value) {
        this.renewproofno = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auxiliary_accounting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="voucher_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="voucher_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="debit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primary_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primary_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primary_end_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="natural_end_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="departmentcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="customercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="suppliercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="item_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bill_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reserve1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountCode",
        "auxiliaryAccounting",
        "date",
        "voucherType",
        "voucherId",
        "_abstract",
        "currency",
        "direction",
        "debitQuantity",
        "primaryDebitCurrency",
        "naturalDebitCurrency",
        "creditQuantity",
        "primaryCreditCurrency",
        "naturalCreditCurrency",
        "endQuantity",
        "primaryEndCurrency",
        "naturalEndCurrency",
        "departmentcode",
        "personcode",
        "customercode",
        "suppliercode",
        "itemClass",
        "itemId",
        "operator",
        "billType",
        "billId",
        "billDate",
        "reserve1",
        "reserve2"
    })
    public static class Codebalance {

        @XmlElement(name = "account_code")
        protected String accountCode;
        @XmlElement(name = "auxiliary_accounting")
        protected String auxiliaryAccounting;
        protected String date;
        @XmlElement(name = "voucher_type")
        protected String voucherType;
        @XmlElement(name = "voucher_id")
        protected String voucherId;
        @XmlElement(name = "abstract")
        protected String _abstract;
        protected String currency;
        protected String direction;
        @XmlElement(name = "debit_quantity")
        protected String debitQuantity;
        @XmlElement(name = "primary_debit_currency")
        protected String primaryDebitCurrency;
        @XmlElement(name = "natural_debit_currency")
        protected String naturalDebitCurrency;
        @XmlElement(name = "credit_quantity")
        protected String creditQuantity;
        @XmlElement(name = "primary_credit_currency")
        protected String primaryCreditCurrency;
        @XmlElement(name = "natural_credit_currency")
        protected String naturalCreditCurrency;
        @XmlElement(name = "end_quantity")
        protected String endQuantity;
        @XmlElement(name = "primary_end_currency")
        protected String primaryEndCurrency;
        @XmlElement(name = "natural_end_currency")
        protected String naturalEndCurrency;
        protected String departmentcode;
        protected String personcode;
        protected String customercode;
        protected String suppliercode;
        @XmlElement(name = "item_class")
        protected String itemClass;
        @XmlElement(name = "item_id")
        protected String itemId;
        protected String operator;
        @XmlElement(name = "bill_type")
        protected String billType;
        @XmlElement(name = "bill_id")
        protected String billId;
        @XmlElement(name = "bill_date")
        protected String billDate;
        protected String reserve1;
        protected String reserve2;
        @XmlAttribute(name = "code")
        protected String code;

        /**
         * 获取accountCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountCode() {
            return accountCode;
        }

        /**
         * 设置accountCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountCode(String value) {
            this.accountCode = value;
        }

        /**
         * 获取auxiliaryAccounting属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuxiliaryAccounting() {
            return auxiliaryAccounting;
        }

        /**
         * 设置auxiliaryAccounting属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuxiliaryAccounting(String value) {
            this.auxiliaryAccounting = value;
        }

        /**
         * 获取date属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * 设置date属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * 获取voucherType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoucherType() {
            return voucherType;
        }

        /**
         * 设置voucherType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoucherType(String value) {
            this.voucherType = value;
        }

        /**
         * 获取voucherId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoucherId() {
            return voucherId;
        }

        /**
         * 设置voucherId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoucherId(String value) {
            this.voucherId = value;
        }

        /**
         * 获取abstract属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbstract() {
            return _abstract;
        }

        /**
         * 设置abstract属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbstract(String value) {
            this._abstract = value;
        }

        /**
         * 获取currency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * 设置currency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * 获取direction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirection() {
            return direction;
        }

        /**
         * 设置direction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirection(String value) {
            this.direction = value;
        }

        /**
         * 获取debitQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebitQuantity() {
            return debitQuantity;
        }

        /**
         * 设置debitQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebitQuantity(String value) {
            this.debitQuantity = value;
        }

        /**
         * 获取primaryDebitCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryDebitCurrency() {
            return primaryDebitCurrency;
        }

        /**
         * 设置primaryDebitCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryDebitCurrency(String value) {
            this.primaryDebitCurrency = value;
        }

        /**
         * 获取naturalDebitCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaturalDebitCurrency() {
            return naturalDebitCurrency;
        }

        /**
         * 设置naturalDebitCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaturalDebitCurrency(String value) {
            this.naturalDebitCurrency = value;
        }

        /**
         * 获取creditQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditQuantity() {
            return creditQuantity;
        }

        /**
         * 设置creditQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditQuantity(String value) {
            this.creditQuantity = value;
        }

        /**
         * 获取primaryCreditCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryCreditCurrency() {
            return primaryCreditCurrency;
        }

        /**
         * 设置primaryCreditCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryCreditCurrency(String value) {
            this.primaryCreditCurrency = value;
        }

        /**
         * 获取naturalCreditCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaturalCreditCurrency() {
            return naturalCreditCurrency;
        }

        /**
         * 设置naturalCreditCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaturalCreditCurrency(String value) {
            this.naturalCreditCurrency = value;
        }

        /**
         * 获取endQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndQuantity() {
            return endQuantity;
        }

        /**
         * 设置endQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndQuantity(String value) {
            this.endQuantity = value;
        }

        /**
         * 获取primaryEndCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryEndCurrency() {
            return primaryEndCurrency;
        }

        /**
         * 设置primaryEndCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryEndCurrency(String value) {
            this.primaryEndCurrency = value;
        }

        /**
         * 获取naturalEndCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNaturalEndCurrency() {
            return naturalEndCurrency;
        }

        /**
         * 设置naturalEndCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNaturalEndCurrency(String value) {
            this.naturalEndCurrency = value;
        }

        /**
         * 获取departmentcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartmentcode() {
            return departmentcode;
        }

        /**
         * 设置departmentcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartmentcode(String value) {
            this.departmentcode = value;
        }

        /**
         * 获取personcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersoncode() {
            return personcode;
        }

        /**
         * 设置personcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersoncode(String value) {
            this.personcode = value;
        }

        /**
         * 获取customercode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomercode() {
            return customercode;
        }

        /**
         * 设置customercode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomercode(String value) {
            this.customercode = value;
        }

        /**
         * 获取suppliercode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuppliercode() {
            return suppliercode;
        }

        /**
         * 设置suppliercode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuppliercode(String value) {
            this.suppliercode = value;
        }

        /**
         * 获取itemClass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemClass() {
            return itemClass;
        }

        /**
         * 设置itemClass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemClass(String value) {
            this.itemClass = value;
        }

        /**
         * 获取itemId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemId() {
            return itemId;
        }

        /**
         * 设置itemId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemId(String value) {
            this.itemId = value;
        }

        /**
         * 获取operator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperator() {
            return operator;
        }

        /**
         * 设置operator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperator(String value) {
            this.operator = value;
        }

        /**
         * 获取billType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillType() {
            return billType;
        }

        /**
         * 设置billType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillType(String value) {
            this.billType = value;
        }

        /**
         * 获取billId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillId() {
            return billId;
        }

        /**
         * 设置billId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillId(String value) {
            this.billId = value;
        }

        /**
         * 获取billDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillDate() {
            return billDate;
        }

        /**
         * 设置billDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillDate(String value) {
            this.billDate = value;
        }

        /**
         * 获取reserve1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReserve1() {
            return reserve1;
        }

        /**
         * 设置reserve1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReserve1(String value) {
            this.reserve1 = value;
        }

        /**
         * 获取reserve2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReserve2() {
            return reserve2;
        }

        /**
         * 设置reserve2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReserve2(String value) {
            this.reserve2 = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
