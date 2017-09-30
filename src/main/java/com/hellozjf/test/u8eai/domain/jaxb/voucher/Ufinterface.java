//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:27:01 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.voucher;

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
 *         &lt;element name="voucher" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="voucher_head" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="voucher_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fiscal_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accounting_period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="voucher_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="attachment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="posting_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="posting_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="voucher_making_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reserve1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="revokeflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="voucher_body" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="settlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="unit_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="exchange_rate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="exchange_rate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="debit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="primary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="secondary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="credit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="primary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="secondary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="bill_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="auxiliary_accounting" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="detail" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cash_flow_statement" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cash_flow" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="code_remark_statement" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="code_remark" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "voucher"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Voucher> voucher;
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
     * Gets the value of the voucher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voucher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoucher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Voucher }
     * 
     * 
     */
    public List<Ufinterface.Voucher> getVoucher() {
        if (voucher == null) {
            voucher = new ArrayList<Ufinterface.Voucher>();
        }
        return this.voucher;
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
     *         &lt;element name="voucher_head" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="voucher_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fiscal_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accounting_period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="voucher_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="attachment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="posting_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="posting_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="voucher_making_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reserve1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="revokeflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="voucher_body" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="settlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="unit_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="exchange_rate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="exchange_rate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="debit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="primary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="secondary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="credit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="primary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="secondary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="bill_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="auxiliary_accounting" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="detail" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cash_flow_statement" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cash_flow" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="code_remark_statement" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="code_remark" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "voucherHead",
        "voucherBody"
    })
    public static class Voucher {

        @XmlElement(name = "voucher_head")
        protected List<Ufinterface.Voucher.VoucherHead> voucherHead;
        @XmlElement(name = "voucher_body")
        protected List<Ufinterface.Voucher.VoucherBody> voucherBody;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Gets the value of the voucherHead property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucherHead property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucherHead().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Voucher.VoucherHead }
         * 
         * 
         */
        public List<Ufinterface.Voucher.VoucherHead> getVoucherHead() {
            if (voucherHead == null) {
                voucherHead = new ArrayList<Ufinterface.Voucher.VoucherHead>();
            }
            return this.voucherHead;
        }

        /**
         * Gets the value of the voucherBody property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucherBody property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucherBody().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Voucher.VoucherBody }
         * 
         * 
         */
        public List<Ufinterface.Voucher.VoucherBody> getVoucherBody() {
            if (voucherBody == null) {
                voucherBody = new ArrayList<Ufinterface.Voucher.VoucherBody>();
            }
            return this.voucherBody;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="settlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="unit_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="exchange_rate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="exchange_rate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="debit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="primary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="secondary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="credit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="primary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="secondary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="bill_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="auxiliary_accounting" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="detail" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cash_flow_statement" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cash_flow" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="code_remark_statement" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="code_remark" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "entry"
        })
        public static class VoucherBody {

            protected List<Ufinterface.Voucher.VoucherBody.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ufinterface.Voucher.VoucherBody.Entry }
             * 
             * 
             */
            public List<Ufinterface.Voucher.VoucherBody.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry>();
                }
                return this.entry;
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
             *         &lt;element name="entry_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="account_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="settlement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="document_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="document_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="unit_price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="exchange_rate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="exchange_rate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="debit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="primary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="secondary_debit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="credit_quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="primary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="secondary_credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="bill_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="bill_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="bill_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="auxiliary_accounting" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="detail" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cash_flow_statement" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cash_flow" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="code_remark_statement" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="code_remark" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "entryId",
                "accountCode",
                "_abstract",
                "settlement",
                "documentId",
                "documentDate",
                "currency",
                "unitPrice",
                "exchangeRate1",
                "exchangeRate2",
                "debitQuantity",
                "primaryDebitAmount",
                "secondaryDebitAmount",
                "naturalDebitCurrency",
                "creditQuantity",
                "primaryCreditAmount",
                "secondaryCreditAmount",
                "naturalCreditCurrency",
                "billType",
                "billId",
                "billDate",
                "auxiliaryAccounting",
                "detail"
            })
            public static class Entry {

                @XmlElement(name = "entry_id")
                protected String entryId;
                @XmlElement(name = "account_code")
                protected String accountCode;
                @XmlElement(name = "abstract")
                protected String _abstract;
                protected String settlement;
                @XmlElement(name = "document_id")
                protected String documentId;
                @XmlElement(name = "document_date")
                protected String documentDate;
                protected String currency;
                @XmlElement(name = "unit_price")
                protected String unitPrice;
                @XmlElement(name = "exchange_rate1")
                protected String exchangeRate1;
                @XmlElement(name = "exchange_rate2")
                protected String exchangeRate2;
                @XmlElement(name = "debit_quantity")
                protected String debitQuantity;
                @XmlElement(name = "primary_debit_amount")
                protected String primaryDebitAmount;
                @XmlElement(name = "secondary_debit_amount")
                protected String secondaryDebitAmount;
                @XmlElement(name = "natural_debit_currency")
                protected String naturalDebitCurrency;
                @XmlElement(name = "credit_quantity")
                protected String creditQuantity;
                @XmlElement(name = "primary_credit_amount")
                protected String primaryCreditAmount;
                @XmlElement(name = "secondary_credit_amount")
                protected String secondaryCreditAmount;
                @XmlElement(name = "natural_credit_currency")
                protected String naturalCreditCurrency;
                @XmlElement(name = "bill_type")
                protected String billType;
                @XmlElement(name = "bill_id")
                protected String billId;
                @XmlElement(name = "bill_date")
                protected String billDate;
                @XmlElement(name = "auxiliary_accounting")
                protected List<Ufinterface.Voucher.VoucherBody.Entry.AuxiliaryAccounting> auxiliaryAccounting;
                protected List<Ufinterface.Voucher.VoucherBody.Entry.Detail> detail;

                /**
                 * 获取entryId属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntryId() {
                    return entryId;
                }

                /**
                 * 设置entryId属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntryId(String value) {
                    this.entryId = value;
                }

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
                 * 获取settlement属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSettlement() {
                    return settlement;
                }

                /**
                 * 设置settlement属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSettlement(String value) {
                    this.settlement = value;
                }

                /**
                 * 获取documentId属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentId() {
                    return documentId;
                }

                /**
                 * 设置documentId属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentId(String value) {
                    this.documentId = value;
                }

                /**
                 * 获取documentDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentDate() {
                    return documentDate;
                }

                /**
                 * 设置documentDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentDate(String value) {
                    this.documentDate = value;
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
                 * 获取unitPrice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitPrice() {
                    return unitPrice;
                }

                /**
                 * 设置unitPrice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitPrice(String value) {
                    this.unitPrice = value;
                }

                /**
                 * 获取exchangeRate1属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExchangeRate1() {
                    return exchangeRate1;
                }

                /**
                 * 设置exchangeRate1属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExchangeRate1(String value) {
                    this.exchangeRate1 = value;
                }

                /**
                 * 获取exchangeRate2属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExchangeRate2() {
                    return exchangeRate2;
                }

                /**
                 * 设置exchangeRate2属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExchangeRate2(String value) {
                    this.exchangeRate2 = value;
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
                 * 获取primaryDebitAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrimaryDebitAmount() {
                    return primaryDebitAmount;
                }

                /**
                 * 设置primaryDebitAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrimaryDebitAmount(String value) {
                    this.primaryDebitAmount = value;
                }

                /**
                 * 获取secondaryDebitAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSecondaryDebitAmount() {
                    return secondaryDebitAmount;
                }

                /**
                 * 设置secondaryDebitAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSecondaryDebitAmount(String value) {
                    this.secondaryDebitAmount = value;
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
                 * 获取primaryCreditAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrimaryCreditAmount() {
                    return primaryCreditAmount;
                }

                /**
                 * 设置primaryCreditAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrimaryCreditAmount(String value) {
                    this.primaryCreditAmount = value;
                }

                /**
                 * 获取secondaryCreditAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSecondaryCreditAmount() {
                    return secondaryCreditAmount;
                }

                /**
                 * 设置secondaryCreditAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSecondaryCreditAmount(String value) {
                    this.secondaryCreditAmount = value;
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
                 * Gets the value of the auxiliaryAccounting property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the auxiliaryAccounting property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAuxiliaryAccounting().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Ufinterface.Voucher.VoucherBody.Entry.AuxiliaryAccounting }
                 * 
                 * 
                 */
                public List<Ufinterface.Voucher.VoucherBody.Entry.AuxiliaryAccounting> getAuxiliaryAccounting() {
                    if (auxiliaryAccounting == null) {
                        auxiliaryAccounting = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry.AuxiliaryAccounting>();
                    }
                    return this.auxiliaryAccounting;
                }

                /**
                 * Gets the value of the detail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the detail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Ufinterface.Voucher.VoucherBody.Entry.Detail }
                 * 
                 * 
                 */
                public List<Ufinterface.Voucher.VoucherBody.Entry.Detail> getDetail() {
                    if (detail == null) {
                        detail = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry.Detail>();
                    }
                    return this.detail;
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
                 *         &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
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
                    "item"
                })
                public static class AuxiliaryAccounting {

                    protected List<Item> item;

                    /**
                     * Gets the value of the item property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the item property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getItem().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Item }
                     * 
                     * 
                     */
                    public List<Item> getItem() {
                        if (item == null) {
                            item = new ArrayList<Item>();
                        }
                        return this.item;
                    }

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
                 *         &lt;element name="cash_flow_statement" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cash_flow" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="code_remark_statement" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="code_remark" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                    "cashFlowStatement",
                    "codeRemarkStatement"
                })
                public static class Detail {

                    @XmlElement(name = "cash_flow_statement")
                    protected List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement> cashFlowStatement;
                    @XmlElement(name = "code_remark_statement")
                    protected List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement> codeRemarkStatement;

                    /**
                     * Gets the value of the cashFlowStatement property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the cashFlowStatement property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCashFlowStatement().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement }
                     * 
                     * 
                     */
                    public List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement> getCashFlowStatement() {
                        if (cashFlowStatement == null) {
                            cashFlowStatement = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement>();
                        }
                        return this.cashFlowStatement;
                    }

                    /**
                     * Gets the value of the codeRemarkStatement property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the codeRemarkStatement property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCodeRemarkStatement().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement }
                     * 
                     * 
                     */
                    public List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement> getCodeRemarkStatement() {
                        if (codeRemarkStatement == null) {
                            codeRemarkStatement = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement>();
                        }
                        return this.codeRemarkStatement;
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
                     *         &lt;element name="cash_flow" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
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
                        "cashFlow"
                    })
                    public static class CashFlowStatement {

                        @XmlElement(name = "cash_flow")
                        protected List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement.CashFlow> cashFlow;

                        /**
                         * Gets the value of the cashFlow property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the cashFlow property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCashFlow().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement.CashFlow }
                         * 
                         * 
                         */
                        public List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement.CashFlow> getCashFlow() {
                            if (cashFlow == null) {
                                cashFlow = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry.Detail.CashFlowStatement.CashFlow>();
                            }
                            return this.cashFlow;
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
                         *       &lt;attribute name="cash_item" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="natural_debit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="natural_credit_currency" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class CashFlow {

                            @XmlAttribute(name = "cash_item")
                            protected String cashItem;
                            @XmlAttribute(name = "natural_debit_currency")
                            protected String naturalDebitCurrency;
                            @XmlAttribute(name = "natural_credit_currency")
                            protected String naturalCreditCurrency;

                            /**
                             * 获取cashItem属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCashItem() {
                                return cashItem;
                            }

                            /**
                             * 设置cashItem属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCashItem(String value) {
                                this.cashItem = value;
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

                        }

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
                     *         &lt;element name="code_remark" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
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
                        "codeRemark"
                    })
                    public static class CodeRemarkStatement {

                        @XmlElement(name = "code_remark")
                        protected List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement.CodeRemark> codeRemark;

                        /**
                         * Gets the value of the codeRemark property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the codeRemark property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCodeRemark().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement.CodeRemark }
                         * 
                         * 
                         */
                        public List<Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement.CodeRemark> getCodeRemark() {
                            if (codeRemark == null) {
                                codeRemark = new ArrayList<Ufinterface.Voucher.VoucherBody.Entry.Detail.CodeRemarkStatement.CodeRemark>();
                            }
                            return this.codeRemark;
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
                         *         &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
                         *       &lt;/sequence>
                         *       &lt;attribute name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "item"
                        })
                        public static class CodeRemark {

                            protected List<Item> item;
                            @XmlAttribute(name = "i_id")
                            protected String iId;

                            /**
                             * Gets the value of the item property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the item property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getItem().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Item }
                             * 
                             * 
                             */
                            public List<Item> getItem() {
                                if (item == null) {
                                    item = new ArrayList<Item>();
                                }
                                return this.item;
                            }

                            /**
                             * 获取iId属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIId() {
                                return iId;
                            }

                            /**
                             * 设置iId属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIId(String value) {
                                this.iId = value;
                            }

                        }

                    }

                }

            }

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
         *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="voucher_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fiscal_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accounting_period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="voucher_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="attachment_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="posting_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="posting_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="voucher_making_system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reserve1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reserve2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="revokeflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "company",
            "voucherType",
            "fiscalYear",
            "accountingPeriod",
            "voucherId",
            "attachmentNumber",
            "date",
            "enter",
            "cashier",
            "signature",
            "checker",
            "postingDate",
            "postingPerson",
            "voucherMakingSystem",
            "memo1",
            "memo2",
            "reserve1",
            "reserve2",
            "revokeflag"
        })
        public static class VoucherHead {

            protected String company;
            @XmlElement(name = "voucher_type")
            protected String voucherType;
            @XmlElement(name = "fiscal_year")
            protected String fiscalYear;
            @XmlElement(name = "accounting_period")
            protected String accountingPeriod;
            @XmlElement(name = "voucher_id")
            protected String voucherId;
            @XmlElement(name = "attachment_number")
            protected String attachmentNumber;
            protected String date;
            protected String enter;
            protected String cashier;
            protected String signature;
            protected String checker;
            @XmlElement(name = "posting_date")
            protected String postingDate;
            @XmlElement(name = "posting_person")
            protected String postingPerson;
            @XmlElement(name = "voucher_making_system")
            protected String voucherMakingSystem;
            protected String memo1;
            protected String memo2;
            protected String reserve1;
            protected String reserve2;
            protected String revokeflag;

            /**
             * 获取company属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompany() {
                return company;
            }

            /**
             * 设置company属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompany(String value) {
                this.company = value;
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
             * 获取fiscalYear属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiscalYear() {
                return fiscalYear;
            }

            /**
             * 设置fiscalYear属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiscalYear(String value) {
                this.fiscalYear = value;
            }

            /**
             * 获取accountingPeriod属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountingPeriod() {
                return accountingPeriod;
            }

            /**
             * 设置accountingPeriod属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountingPeriod(String value) {
                this.accountingPeriod = value;
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
             * 获取attachmentNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAttachmentNumber() {
                return attachmentNumber;
            }

            /**
             * 设置attachmentNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAttachmentNumber(String value) {
                this.attachmentNumber = value;
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
             * 获取enter属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnter() {
                return enter;
            }

            /**
             * 设置enter属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnter(String value) {
                this.enter = value;
            }

            /**
             * 获取cashier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCashier() {
                return cashier;
            }

            /**
             * 设置cashier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCashier(String value) {
                this.cashier = value;
            }

            /**
             * 获取signature属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignature() {
                return signature;
            }

            /**
             * 设置signature属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignature(String value) {
                this.signature = value;
            }

            /**
             * 获取checker属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChecker() {
                return checker;
            }

            /**
             * 设置checker属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChecker(String value) {
                this.checker = value;
            }

            /**
             * 获取postingDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostingDate() {
                return postingDate;
            }

            /**
             * 设置postingDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostingDate(String value) {
                this.postingDate = value;
            }

            /**
             * 获取postingPerson属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostingPerson() {
                return postingPerson;
            }

            /**
             * 设置postingPerson属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostingPerson(String value) {
                this.postingPerson = value;
            }

            /**
             * 获取voucherMakingSystem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherMakingSystem() {
                return voucherMakingSystem;
            }

            /**
             * 设置voucherMakingSystem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherMakingSystem(String value) {
                this.voucherMakingSystem = value;
            }

            /**
             * 获取memo1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemo1() {
                return memo1;
            }

            /**
             * 设置memo1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemo1(String value) {
                this.memo1 = value;
            }

            /**
             * 获取memo2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemo2() {
                return memo2;
            }

            /**
             * 设置memo2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemo2(String value) {
                this.memo2 = value;
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
             * 获取revokeflag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRevokeflag() {
                return revokeflag;
            }

            /**
             * 设置revokeflag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRevokeflag(String value) {
                this.revokeflag = value;
            }

        }

    }

}
