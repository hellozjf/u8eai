//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:23 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.customer;

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
 *         &lt;element name="customer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="abbrname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sort_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="domain_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tax_reg_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bank_open" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bank_acc_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="seed_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="legal_man" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="spec_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="discount_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pay_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="devliver_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deliver_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="head_corp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deli_warehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="super_dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ar_rest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_tr_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_tr_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_rec_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_rec_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tr_frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pricegrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreatePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="InvoiceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreditByHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreditDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Proxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bLimitSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusEnAddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusPortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cPrimaryVen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fCommisionRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fInsueRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cBranchAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cBranchPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cBranchPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusTradeCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CustomerKCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bCusState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cRelVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusexch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bshop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Crm_Contact_cMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Crm_Contact_cOfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bcusdomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bcusoverseas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccuscreditcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccussaprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusexprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusotherprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fcusdiscountrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccussscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccuscmprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dcuscreatedatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cCusMnemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fAdvancePaymentRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bServiceAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bOnGPinStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bRequestSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
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
    "customer"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Customer> customer;
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
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Customer }
     * 
     * 
     */
    public List<Ufinterface.Customer> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<Ufinterface.Customer>();
        }
        return this.customer;
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
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="abbrname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sort_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="domain_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tax_reg_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bank_open" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bank_acc_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="seed_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="legal_man" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="spec_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="discount_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pay_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="devliver_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deliver_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="head_corp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deli_warehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="super_dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ar_rest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_tr_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_tr_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_rec_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_rec_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tr_frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pricegrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreatePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="InvoiceCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreditByHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreditDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Proxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bLimitSale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusEnAddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusPortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cPrimaryVen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fCommisionRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fInsueRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cBranchAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cBranchPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cBranchPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusTradeCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CustomerKCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bCusState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cRelVendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusexch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bshop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Crm_Contact_cMobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Crm_Contact_cOfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bcusdomestic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bcusoverseas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccuscreditcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccussaprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusexprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusotherprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fcusdiscountrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccussscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccuscmprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dcuscreatedatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cCusMnemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fAdvancePaymentRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bServiceAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bOnGPinStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bRequestSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "name",
        "abbrname",
        "sortCode",
        "domainCode",
        "industry",
        "address",
        "postcode",
        "taxRegCode",
        "bankOpen",
        "bankAccNumber",
        "seedDate",
        "legalMan",
        "email",
        "contact",
        "phone",
        "fax",
        "bp",
        "mobile",
        "specOperator",
        "discountRate",
        "creditRank",
        "creditAmount",
        "creditDeadline",
        "payCondition",
        "devliverSite",
        "deliverMode",
        "headCorpCode",
        "deliWarehouse",
        "superDept",
        "arRest",
        "lastTrDate",
        "lastTrAmount",
        "lastRecDate",
        "lastRecAmount",
        "endDate",
        "trFrequency",
        "selfDefine1",
        "selfDefine2",
        "selfDefine3",
        "pricegrade",
        "createPerson",
        "modifyPerson",
        "modifyDate",
        "authClass",
        "selfDefine4",
        "selfDefine5",
        "selfDefine6",
        "selfDefine7",
        "selfDefine8",
        "selfDefine9",
        "selfDefine10",
        "selfDefine11",
        "selfDefine12",
        "selfDefine13",
        "selfDefine14",
        "selfDefine15",
        "selfDefine16",
        "invoiceCompany",
        "credit",
        "creditByHead",
        "creditDate",
        "licenceDate",
        "licenceSDate",
        "licenceEDate",
        "licenceADays",
        "businessDate",
        "businessSDate",
        "businessEDate",
        "businessADays",
        "proxy",
        "proxySDate",
        "proxyEDate",
        "proxyADays",
        "memo",
        "bLimitSale",
        "cCusCountryCode",
        "cCusEnName",
        "cCusEnAddr1",
        "cCusEnAddr2",
        "cCusEnAddr3",
        "cCusEnAddr4",
        "cCusPortCode",
        "cPrimaryVen",
        "fCommisionRate",
        "fInsueRate",
        "bHomeBranch",
        "cBranchAddr",
        "cBranchPhone",
        "cBranchPerson",
        "cCusTradeCCode",
        "customerKCode",
        "bCusState",
        "ccusbankcode",
        "cRelVendor",
        "ccusexchName",
        "bshop",
        "crmContactCMobilePhone",
        "crmContactCOfficePhone",
        "bcusdomestic",
        "bcusoverseas",
        "ccuscreditcompany",
        "ccussaprotocol",
        "ccusexprotocol",
        "ccusotherprotocol",
        "fcusdiscountrate",
        "ccussscode",
        "ccuscmprotocol",
        "dcuscreatedatetime",
        "cCusMnemCode",
        "fAdvancePaymentRatio",
        "bServiceAttribute",
        "bOnGPinStore",
        "bRequestSign"
    })
    public static class Customer {

        protected String code;
        protected String name;
        protected String abbrname;
        @XmlElement(name = "sort_code")
        protected String sortCode;
        @XmlElement(name = "domain_code")
        protected String domainCode;
        protected String industry;
        protected String address;
        protected String postcode;
        @XmlElement(name = "tax_reg_code")
        protected String taxRegCode;
        @XmlElement(name = "bank_open")
        protected String bankOpen;
        @XmlElement(name = "bank_acc_number")
        protected String bankAccNumber;
        @XmlElement(name = "seed_date")
        protected String seedDate;
        @XmlElement(name = "legal_man")
        protected String legalMan;
        protected String email;
        protected String contact;
        protected String phone;
        protected String fax;
        protected String bp;
        protected String mobile;
        @XmlElement(name = "spec_operator")
        protected String specOperator;
        @XmlElement(name = "discount_rate")
        protected String discountRate;
        @XmlElement(name = "credit_rank")
        protected String creditRank;
        @XmlElement(name = "credit_amount")
        protected String creditAmount;
        @XmlElement(name = "credit_deadline")
        protected String creditDeadline;
        @XmlElement(name = "pay_condition")
        protected String payCondition;
        @XmlElement(name = "devliver_site")
        protected String devliverSite;
        @XmlElement(name = "deliver_mode")
        protected String deliverMode;
        @XmlElement(name = "head_corp_code")
        protected String headCorpCode;
        @XmlElement(name = "deli_warehouse")
        protected String deliWarehouse;
        @XmlElement(name = "super_dept")
        protected String superDept;
        @XmlElement(name = "ar_rest")
        protected String arRest;
        @XmlElement(name = "last_tr_date")
        protected String lastTrDate;
        @XmlElement(name = "last_tr_amount")
        protected String lastTrAmount;
        @XmlElement(name = "last_rec_date")
        protected String lastRecDate;
        @XmlElement(name = "last_rec_amount")
        protected String lastRecAmount;
        @XmlElement(name = "end_date")
        protected String endDate;
        @XmlElement(name = "tr_frequency")
        protected String trFrequency;
        @XmlElement(name = "self_define1")
        protected String selfDefine1;
        @XmlElement(name = "self_define2")
        protected String selfDefine2;
        @XmlElement(name = "self_define3")
        protected String selfDefine3;
        protected String pricegrade;
        @XmlElement(name = "CreatePerson")
        protected String createPerson;
        @XmlElement(name = "ModifyPerson")
        protected String modifyPerson;
        @XmlElement(name = "ModifyDate")
        protected String modifyDate;
        @XmlElement(name = "auth_class")
        protected String authClass;
        @XmlElement(name = "self_define4")
        protected String selfDefine4;
        @XmlElement(name = "self_define5")
        protected String selfDefine5;
        @XmlElement(name = "self_define6")
        protected String selfDefine6;
        @XmlElement(name = "self_define7")
        protected String selfDefine7;
        @XmlElement(name = "self_define8")
        protected String selfDefine8;
        @XmlElement(name = "self_define9")
        protected String selfDefine9;
        @XmlElement(name = "self_define10")
        protected String selfDefine10;
        @XmlElement(name = "self_define11")
        protected String selfDefine11;
        @XmlElement(name = "self_define12")
        protected String selfDefine12;
        @XmlElement(name = "self_define13")
        protected String selfDefine13;
        @XmlElement(name = "self_define14")
        protected String selfDefine14;
        @XmlElement(name = "self_define15")
        protected String selfDefine15;
        @XmlElement(name = "self_define16")
        protected String selfDefine16;
        @XmlElement(name = "InvoiceCompany")
        protected String invoiceCompany;
        @XmlElement(name = "Credit")
        protected String credit;
        @XmlElement(name = "CreditByHead")
        protected String creditByHead;
        @XmlElement(name = "CreditDate")
        protected String creditDate;
        @XmlElement(name = "LicenceDate")
        protected String licenceDate;
        @XmlElement(name = "LicenceSDate")
        protected String licenceSDate;
        @XmlElement(name = "LicenceEDate")
        protected String licenceEDate;
        @XmlElement(name = "LicenceADays")
        protected String licenceADays;
        @XmlElement(name = "BusinessDate")
        protected String businessDate;
        @XmlElement(name = "BusinessSDate")
        protected String businessSDate;
        @XmlElement(name = "BusinessEDate")
        protected String businessEDate;
        @XmlElement(name = "BusinessADays")
        protected String businessADays;
        @XmlElement(name = "Proxy")
        protected String proxy;
        @XmlElement(name = "ProxySDate")
        protected String proxySDate;
        @XmlElement(name = "ProxyEDate")
        protected String proxyEDate;
        @XmlElement(name = "ProxyADays")
        protected String proxyADays;
        @XmlElement(name = "Memo")
        protected String memo;
        protected String bLimitSale;
        protected String cCusCountryCode;
        protected String cCusEnName;
        protected String cCusEnAddr1;
        protected String cCusEnAddr2;
        protected String cCusEnAddr3;
        protected String cCusEnAddr4;
        protected String cCusPortCode;
        protected String cPrimaryVen;
        protected String fCommisionRate;
        protected String fInsueRate;
        protected String bHomeBranch;
        protected String cBranchAddr;
        protected String cBranchPhone;
        protected String cBranchPerson;
        protected String cCusTradeCCode;
        @XmlElement(name = "CustomerKCode")
        protected String customerKCode;
        protected String bCusState;
        protected String ccusbankcode;
        protected String cRelVendor;
        @XmlElement(name = "ccusexch_name")
        protected String ccusexchName;
        protected String bshop;
        @XmlElement(name = "Crm_Contact_cMobilePhone")
        protected String crmContactCMobilePhone;
        @XmlElement(name = "Crm_Contact_cOfficePhone")
        protected String crmContactCOfficePhone;
        protected String bcusdomestic;
        protected String bcusoverseas;
        protected String ccuscreditcompany;
        protected String ccussaprotocol;
        protected String ccusexprotocol;
        protected String ccusotherprotocol;
        protected String fcusdiscountrate;
        protected String ccussscode;
        protected String ccuscmprotocol;
        protected String dcuscreatedatetime;
        protected String cCusMnemCode;
        protected String fAdvancePaymentRatio;
        protected String bServiceAttribute;
        protected String bOnGPinStore;
        protected String bRequestSign;

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

        /**
         * 获取name属性的值。
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
         * 设置name属性的值。
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
         * 获取abbrname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbbrname() {
            return abbrname;
        }

        /**
         * 设置abbrname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbbrname(String value) {
            this.abbrname = value;
        }

        /**
         * 获取sortCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSortCode() {
            return sortCode;
        }

        /**
         * 设置sortCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSortCode(String value) {
            this.sortCode = value;
        }

        /**
         * 获取domainCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainCode() {
            return domainCode;
        }

        /**
         * 设置domainCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainCode(String value) {
            this.domainCode = value;
        }

        /**
         * 获取industry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndustry() {
            return industry;
        }

        /**
         * 设置industry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndustry(String value) {
            this.industry = value;
        }

        /**
         * 获取address属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * 设置address属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * 获取postcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcode() {
            return postcode;
        }

        /**
         * 设置postcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcode(String value) {
            this.postcode = value;
        }

        /**
         * 获取taxRegCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxRegCode() {
            return taxRegCode;
        }

        /**
         * 设置taxRegCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxRegCode(String value) {
            this.taxRegCode = value;
        }

        /**
         * 获取bankOpen属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankOpen() {
            return bankOpen;
        }

        /**
         * 设置bankOpen属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankOpen(String value) {
            this.bankOpen = value;
        }

        /**
         * 获取bankAccNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankAccNumber() {
            return bankAccNumber;
        }

        /**
         * 设置bankAccNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankAccNumber(String value) {
            this.bankAccNumber = value;
        }

        /**
         * 获取seedDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeedDate() {
            return seedDate;
        }

        /**
         * 设置seedDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeedDate(String value) {
            this.seedDate = value;
        }

        /**
         * 获取legalMan属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalMan() {
            return legalMan;
        }

        /**
         * 设置legalMan属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalMan(String value) {
            this.legalMan = value;
        }

        /**
         * 获取email属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * 设置email属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * 获取contact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContact() {
            return contact;
        }

        /**
         * 设置contact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContact(String value) {
            this.contact = value;
        }

        /**
         * 获取phone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * 设置phone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * 获取fax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax() {
            return fax;
        }

        /**
         * 设置fax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax(String value) {
            this.fax = value;
        }

        /**
         * 获取bp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBp() {
            return bp;
        }

        /**
         * 设置bp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBp(String value) {
            this.bp = value;
        }

        /**
         * 获取mobile属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobile() {
            return mobile;
        }

        /**
         * 设置mobile属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobile(String value) {
            this.mobile = value;
        }

        /**
         * 获取specOperator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecOperator() {
            return specOperator;
        }

        /**
         * 设置specOperator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecOperator(String value) {
            this.specOperator = value;
        }

        /**
         * 获取discountRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountRate() {
            return discountRate;
        }

        /**
         * 设置discountRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountRate(String value) {
            this.discountRate = value;
        }

        /**
         * 获取creditRank属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditRank() {
            return creditRank;
        }

        /**
         * 设置creditRank属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditRank(String value) {
            this.creditRank = value;
        }

        /**
         * 获取creditAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditAmount() {
            return creditAmount;
        }

        /**
         * 设置creditAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditAmount(String value) {
            this.creditAmount = value;
        }

        /**
         * 获取creditDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditDeadline() {
            return creditDeadline;
        }

        /**
         * 设置creditDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditDeadline(String value) {
            this.creditDeadline = value;
        }

        /**
         * 获取payCondition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayCondition() {
            return payCondition;
        }

        /**
         * 设置payCondition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayCondition(String value) {
            this.payCondition = value;
        }

        /**
         * 获取devliverSite属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDevliverSite() {
            return devliverSite;
        }

        /**
         * 设置devliverSite属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDevliverSite(String value) {
            this.devliverSite = value;
        }

        /**
         * 获取deliverMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliverMode() {
            return deliverMode;
        }

        /**
         * 设置deliverMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliverMode(String value) {
            this.deliverMode = value;
        }

        /**
         * 获取headCorpCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeadCorpCode() {
            return headCorpCode;
        }

        /**
         * 设置headCorpCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeadCorpCode(String value) {
            this.headCorpCode = value;
        }

        /**
         * 获取deliWarehouse属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeliWarehouse() {
            return deliWarehouse;
        }

        /**
         * 设置deliWarehouse属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeliWarehouse(String value) {
            this.deliWarehouse = value;
        }

        /**
         * 获取superDept属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperDept() {
            return superDept;
        }

        /**
         * 设置superDept属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperDept(String value) {
            this.superDept = value;
        }

        /**
         * 获取arRest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArRest() {
            return arRest;
        }

        /**
         * 设置arRest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArRest(String value) {
            this.arRest = value;
        }

        /**
         * 获取lastTrDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastTrDate() {
            return lastTrDate;
        }

        /**
         * 设置lastTrDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTrDate(String value) {
            this.lastTrDate = value;
        }

        /**
         * 获取lastTrAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastTrAmount() {
            return lastTrAmount;
        }

        /**
         * 设置lastTrAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTrAmount(String value) {
            this.lastTrAmount = value;
        }

        /**
         * 获取lastRecDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRecDate() {
            return lastRecDate;
        }

        /**
         * 设置lastRecDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRecDate(String value) {
            this.lastRecDate = value;
        }

        /**
         * 获取lastRecAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRecAmount() {
            return lastRecAmount;
        }

        /**
         * 设置lastRecAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRecAmount(String value) {
            this.lastRecAmount = value;
        }

        /**
         * 获取endDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * 设置endDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * 获取trFrequency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrFrequency() {
            return trFrequency;
        }

        /**
         * 设置trFrequency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrFrequency(String value) {
            this.trFrequency = value;
        }

        /**
         * 获取selfDefine1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine1() {
            return selfDefine1;
        }

        /**
         * 设置selfDefine1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine1(String value) {
            this.selfDefine1 = value;
        }

        /**
         * 获取selfDefine2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine2() {
            return selfDefine2;
        }

        /**
         * 设置selfDefine2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine2(String value) {
            this.selfDefine2 = value;
        }

        /**
         * 获取selfDefine3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine3() {
            return selfDefine3;
        }

        /**
         * 设置selfDefine3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine3(String value) {
            this.selfDefine3 = value;
        }

        /**
         * 获取pricegrade属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricegrade() {
            return pricegrade;
        }

        /**
         * 设置pricegrade属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricegrade(String value) {
            this.pricegrade = value;
        }

        /**
         * 获取createPerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreatePerson() {
            return createPerson;
        }

        /**
         * 设置createPerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreatePerson(String value) {
            this.createPerson = value;
        }

        /**
         * 获取modifyPerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifyPerson() {
            return modifyPerson;
        }

        /**
         * 设置modifyPerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifyPerson(String value) {
            this.modifyPerson = value;
        }

        /**
         * 获取modifyDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifyDate() {
            return modifyDate;
        }

        /**
         * 设置modifyDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifyDate(String value) {
            this.modifyDate = value;
        }

        /**
         * 获取authClass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthClass() {
            return authClass;
        }

        /**
         * 设置authClass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthClass(String value) {
            this.authClass = value;
        }

        /**
         * 获取selfDefine4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine4() {
            return selfDefine4;
        }

        /**
         * 设置selfDefine4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine4(String value) {
            this.selfDefine4 = value;
        }

        /**
         * 获取selfDefine5属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine5() {
            return selfDefine5;
        }

        /**
         * 设置selfDefine5属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine5(String value) {
            this.selfDefine5 = value;
        }

        /**
         * 获取selfDefine6属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine6() {
            return selfDefine6;
        }

        /**
         * 设置selfDefine6属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine6(String value) {
            this.selfDefine6 = value;
        }

        /**
         * 获取selfDefine7属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine7() {
            return selfDefine7;
        }

        /**
         * 设置selfDefine7属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine7(String value) {
            this.selfDefine7 = value;
        }

        /**
         * 获取selfDefine8属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine8() {
            return selfDefine8;
        }

        /**
         * 设置selfDefine8属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine8(String value) {
            this.selfDefine8 = value;
        }

        /**
         * 获取selfDefine9属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine9() {
            return selfDefine9;
        }

        /**
         * 设置selfDefine9属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine9(String value) {
            this.selfDefine9 = value;
        }

        /**
         * 获取selfDefine10属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine10() {
            return selfDefine10;
        }

        /**
         * 设置selfDefine10属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine10(String value) {
            this.selfDefine10 = value;
        }

        /**
         * 获取selfDefine11属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine11() {
            return selfDefine11;
        }

        /**
         * 设置selfDefine11属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine11(String value) {
            this.selfDefine11 = value;
        }

        /**
         * 获取selfDefine12属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine12() {
            return selfDefine12;
        }

        /**
         * 设置selfDefine12属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine12(String value) {
            this.selfDefine12 = value;
        }

        /**
         * 获取selfDefine13属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine13() {
            return selfDefine13;
        }

        /**
         * 设置selfDefine13属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine13(String value) {
            this.selfDefine13 = value;
        }

        /**
         * 获取selfDefine14属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine14() {
            return selfDefine14;
        }

        /**
         * 设置selfDefine14属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine14(String value) {
            this.selfDefine14 = value;
        }

        /**
         * 获取selfDefine15属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine15() {
            return selfDefine15;
        }

        /**
         * 设置selfDefine15属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine15(String value) {
            this.selfDefine15 = value;
        }

        /**
         * 获取selfDefine16属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelfDefine16() {
            return selfDefine16;
        }

        /**
         * 设置selfDefine16属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelfDefine16(String value) {
            this.selfDefine16 = value;
        }

        /**
         * 获取invoiceCompany属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvoiceCompany() {
            return invoiceCompany;
        }

        /**
         * 设置invoiceCompany属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvoiceCompany(String value) {
            this.invoiceCompany = value;
        }

        /**
         * 获取credit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredit() {
            return credit;
        }

        /**
         * 设置credit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredit(String value) {
            this.credit = value;
        }

        /**
         * 获取creditByHead属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditByHead() {
            return creditByHead;
        }

        /**
         * 设置creditByHead属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditByHead(String value) {
            this.creditByHead = value;
        }

        /**
         * 获取creditDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditDate() {
            return creditDate;
        }

        /**
         * 设置creditDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditDate(String value) {
            this.creditDate = value;
        }

        /**
         * 获取licenceDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceDate() {
            return licenceDate;
        }

        /**
         * 设置licenceDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceDate(String value) {
            this.licenceDate = value;
        }

        /**
         * 获取licenceSDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceSDate() {
            return licenceSDate;
        }

        /**
         * 设置licenceSDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceSDate(String value) {
            this.licenceSDate = value;
        }

        /**
         * 获取licenceEDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceEDate() {
            return licenceEDate;
        }

        /**
         * 设置licenceEDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceEDate(String value) {
            this.licenceEDate = value;
        }

        /**
         * 获取licenceADays属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenceADays() {
            return licenceADays;
        }

        /**
         * 设置licenceADays属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenceADays(String value) {
            this.licenceADays = value;
        }

        /**
         * 获取businessDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessDate() {
            return businessDate;
        }

        /**
         * 设置businessDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessDate(String value) {
            this.businessDate = value;
        }

        /**
         * 获取businessSDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessSDate() {
            return businessSDate;
        }

        /**
         * 设置businessSDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessSDate(String value) {
            this.businessSDate = value;
        }

        /**
         * 获取businessEDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessEDate() {
            return businessEDate;
        }

        /**
         * 设置businessEDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessEDate(String value) {
            this.businessEDate = value;
        }

        /**
         * 获取businessADays属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessADays() {
            return businessADays;
        }

        /**
         * 设置businessADays属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessADays(String value) {
            this.businessADays = value;
        }

        /**
         * 获取proxy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxy() {
            return proxy;
        }

        /**
         * 设置proxy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxy(String value) {
            this.proxy = value;
        }

        /**
         * 获取proxySDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxySDate() {
            return proxySDate;
        }

        /**
         * 设置proxySDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxySDate(String value) {
            this.proxySDate = value;
        }

        /**
         * 获取proxyEDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyEDate() {
            return proxyEDate;
        }

        /**
         * 设置proxyEDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyEDate(String value) {
            this.proxyEDate = value;
        }

        /**
         * 获取proxyADays属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyADays() {
            return proxyADays;
        }

        /**
         * 设置proxyADays属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyADays(String value) {
            this.proxyADays = value;
        }

        /**
         * 获取memo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemo() {
            return memo;
        }

        /**
         * 设置memo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemo(String value) {
            this.memo = value;
        }

        /**
         * 获取bLimitSale属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBLimitSale() {
            return bLimitSale;
        }

        /**
         * 设置bLimitSale属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBLimitSale(String value) {
            this.bLimitSale = value;
        }

        /**
         * 获取cCusCountryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusCountryCode() {
            return cCusCountryCode;
        }

        /**
         * 设置cCusCountryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusCountryCode(String value) {
            this.cCusCountryCode = value;
        }

        /**
         * 获取cCusEnName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnName() {
            return cCusEnName;
        }

        /**
         * 设置cCusEnName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnName(String value) {
            this.cCusEnName = value;
        }

        /**
         * 获取cCusEnAddr1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr1() {
            return cCusEnAddr1;
        }

        /**
         * 设置cCusEnAddr1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr1(String value) {
            this.cCusEnAddr1 = value;
        }

        /**
         * 获取cCusEnAddr2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr2() {
            return cCusEnAddr2;
        }

        /**
         * 设置cCusEnAddr2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr2(String value) {
            this.cCusEnAddr2 = value;
        }

        /**
         * 获取cCusEnAddr3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr3() {
            return cCusEnAddr3;
        }

        /**
         * 设置cCusEnAddr3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr3(String value) {
            this.cCusEnAddr3 = value;
        }

        /**
         * 获取cCusEnAddr4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusEnAddr4() {
            return cCusEnAddr4;
        }

        /**
         * 设置cCusEnAddr4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusEnAddr4(String value) {
            this.cCusEnAddr4 = value;
        }

        /**
         * 获取cCusPortCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusPortCode() {
            return cCusPortCode;
        }

        /**
         * 设置cCusPortCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusPortCode(String value) {
            this.cCusPortCode = value;
        }

        /**
         * 获取cPrimaryVen属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPrimaryVen() {
            return cPrimaryVen;
        }

        /**
         * 设置cPrimaryVen属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPrimaryVen(String value) {
            this.cPrimaryVen = value;
        }

        /**
         * 获取fCommisionRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFCommisionRate() {
            return fCommisionRate;
        }

        /**
         * 设置fCommisionRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFCommisionRate(String value) {
            this.fCommisionRate = value;
        }

        /**
         * 获取fInsueRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFInsueRate() {
            return fInsueRate;
        }

        /**
         * 设置fInsueRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFInsueRate(String value) {
            this.fInsueRate = value;
        }

        /**
         * 获取bHomeBranch属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBHomeBranch() {
            return bHomeBranch;
        }

        /**
         * 设置bHomeBranch属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBHomeBranch(String value) {
            this.bHomeBranch = value;
        }

        /**
         * 获取cBranchAddr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBranchAddr() {
            return cBranchAddr;
        }

        /**
         * 设置cBranchAddr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBranchAddr(String value) {
            this.cBranchAddr = value;
        }

        /**
         * 获取cBranchPhone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBranchPhone() {
            return cBranchPhone;
        }

        /**
         * 设置cBranchPhone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBranchPhone(String value) {
            this.cBranchPhone = value;
        }

        /**
         * 获取cBranchPerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBranchPerson() {
            return cBranchPerson;
        }

        /**
         * 设置cBranchPerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBranchPerson(String value) {
            this.cBranchPerson = value;
        }

        /**
         * 获取cCusTradeCCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusTradeCCode() {
            return cCusTradeCCode;
        }

        /**
         * 设置cCusTradeCCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusTradeCCode(String value) {
            this.cCusTradeCCode = value;
        }

        /**
         * 获取customerKCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerKCode() {
            return customerKCode;
        }

        /**
         * 设置customerKCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerKCode(String value) {
            this.customerKCode = value;
        }

        /**
         * 获取bCusState属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBCusState() {
            return bCusState;
        }

        /**
         * 设置bCusState属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBCusState(String value) {
            this.bCusState = value;
        }

        /**
         * 获取ccusbankcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusbankcode() {
            return ccusbankcode;
        }

        /**
         * 设置ccusbankcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusbankcode(String value) {
            this.ccusbankcode = value;
        }

        /**
         * 获取cRelVendor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRelVendor() {
            return cRelVendor;
        }

        /**
         * 设置cRelVendor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRelVendor(String value) {
            this.cRelVendor = value;
        }

        /**
         * 获取ccusexchName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusexchName() {
            return ccusexchName;
        }

        /**
         * 设置ccusexchName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusexchName(String value) {
            this.ccusexchName = value;
        }

        /**
         * 获取bshop属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBshop() {
            return bshop;
        }

        /**
         * 设置bshop属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBshop(String value) {
            this.bshop = value;
        }

        /**
         * 获取crmContactCMobilePhone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrmContactCMobilePhone() {
            return crmContactCMobilePhone;
        }

        /**
         * 设置crmContactCMobilePhone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrmContactCMobilePhone(String value) {
            this.crmContactCMobilePhone = value;
        }

        /**
         * 获取crmContactCOfficePhone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrmContactCOfficePhone() {
            return crmContactCOfficePhone;
        }

        /**
         * 设置crmContactCOfficePhone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrmContactCOfficePhone(String value) {
            this.crmContactCOfficePhone = value;
        }

        /**
         * 获取bcusdomestic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBcusdomestic() {
            return bcusdomestic;
        }

        /**
         * 设置bcusdomestic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBcusdomestic(String value) {
            this.bcusdomestic = value;
        }

        /**
         * 获取bcusoverseas属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBcusoverseas() {
            return bcusoverseas;
        }

        /**
         * 设置bcusoverseas属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBcusoverseas(String value) {
            this.bcusoverseas = value;
        }

        /**
         * 获取ccuscreditcompany属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcuscreditcompany() {
            return ccuscreditcompany;
        }

        /**
         * 设置ccuscreditcompany属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcuscreditcompany(String value) {
            this.ccuscreditcompany = value;
        }

        /**
         * 获取ccussaprotocol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcussaprotocol() {
            return ccussaprotocol;
        }

        /**
         * 设置ccussaprotocol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcussaprotocol(String value) {
            this.ccussaprotocol = value;
        }

        /**
         * 获取ccusexprotocol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusexprotocol() {
            return ccusexprotocol;
        }

        /**
         * 设置ccusexprotocol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusexprotocol(String value) {
            this.ccusexprotocol = value;
        }

        /**
         * 获取ccusotherprotocol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusotherprotocol() {
            return ccusotherprotocol;
        }

        /**
         * 设置ccusotherprotocol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusotherprotocol(String value) {
            this.ccusotherprotocol = value;
        }

        /**
         * 获取fcusdiscountrate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFcusdiscountrate() {
            return fcusdiscountrate;
        }

        /**
         * 设置fcusdiscountrate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFcusdiscountrate(String value) {
            this.fcusdiscountrate = value;
        }

        /**
         * 获取ccussscode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcussscode() {
            return ccussscode;
        }

        /**
         * 设置ccussscode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcussscode(String value) {
            this.ccussscode = value;
        }

        /**
         * 获取ccuscmprotocol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcuscmprotocol() {
            return ccuscmprotocol;
        }

        /**
         * 设置ccuscmprotocol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcuscmprotocol(String value) {
            this.ccuscmprotocol = value;
        }

        /**
         * 获取dcuscreatedatetime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDcuscreatedatetime() {
            return dcuscreatedatetime;
        }

        /**
         * 设置dcuscreatedatetime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDcuscreatedatetime(String value) {
            this.dcuscreatedatetime = value;
        }

        /**
         * 获取cCusMnemCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCusMnemCode() {
            return cCusMnemCode;
        }

        /**
         * 设置cCusMnemCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCusMnemCode(String value) {
            this.cCusMnemCode = value;
        }

        /**
         * 获取fAdvancePaymentRatio属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAdvancePaymentRatio() {
            return fAdvancePaymentRatio;
        }

        /**
         * 设置fAdvancePaymentRatio属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAdvancePaymentRatio(String value) {
            this.fAdvancePaymentRatio = value;
        }

        /**
         * 获取bServiceAttribute属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBServiceAttribute() {
            return bServiceAttribute;
        }

        /**
         * 设置bServiceAttribute属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBServiceAttribute(String value) {
            this.bServiceAttribute = value;
        }

        /**
         * 获取bOnGPinStore属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBOnGPinStore() {
            return bOnGPinStore;
        }

        /**
         * 设置bOnGPinStore属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBOnGPinStore(String value) {
            this.bOnGPinStore = value;
        }

        /**
         * 获取bRequestSign属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRequestSign() {
            return bRequestSign;
        }

        /**
         * 设置bRequestSign属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRequestSign(String value) {
            this.bRequestSign = value;
        }

    }

}
