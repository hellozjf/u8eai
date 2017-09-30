//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:27:00 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.vendor;

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
 *         &lt;element name="vendor" maxOccurs="unbounded" minOccurs="0">
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
 *                   &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="spec_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="discount_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credit_deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pay_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="receive_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="receive_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="head_corp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rec_warehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="super_dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ap_rest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_tr_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_tr_money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_pay_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="last_pay_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tr_frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tax_in_price_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CreatePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="auth_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="self_define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="RegistFund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmployeeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GradeABC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenceADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ProxyADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PassGMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bvencargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bproxyforeign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bvenservice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cVenTradeCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cRelCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenexch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ivengsptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ivengspauth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvengspauthno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenbusinessno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenlicenceno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bvenoverseas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bvenaccperiodmng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenpuomprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenotherprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvencountrycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenenaddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenenaddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenenaddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenenaddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenprimaryven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fvencommisionrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fveninsuerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bvenhomebranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenbranchaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenbranchphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvenbranchperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvensscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comwhcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "vendor"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Vendor> vendor;
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
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Vendor }
     * 
     * 
     */
    public List<Ufinterface.Vendor> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<Ufinterface.Vendor>();
        }
        return this.vendor;
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
     *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="spec_operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="discount_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_rank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credit_deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pay_condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="receive_site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="receive_mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="head_corp_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rec_warehouse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="super_dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ap_rest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_tr_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_tr_money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_pay_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="last_pay_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tr_frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tax_in_price_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CreatePerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="auth_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="self_define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="RegistFund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmployeeNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GradeABC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenceADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessSDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BusinessADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxySDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyEDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ProxyADays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PassGMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bvencargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bproxyforeign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bvenservice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cVenTradeCCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cRelCustomer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenexch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ivengsptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ivengspauth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvengspauthno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenbusinessno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenlicenceno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bvenoverseas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bvenaccperiodmng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenpuomprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenotherprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvencountrycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenenaddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenenaddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenenaddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenenaddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenprimaryven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fvencommisionrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fveninsuerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bvenhomebranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenbranchaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenbranchphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvenbranchperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvensscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comwhcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "phone",
        "fax",
        "email",
        "contact",
        "bp",
        "mobile",
        "specOperator",
        "discountRate",
        "creditRank",
        "creditAmount",
        "creditDeadline",
        "payCondition",
        "receiveSite",
        "receiveMode",
        "headCorpCode",
        "recWarehouse",
        "superDept",
        "apRest",
        "lastTrDate",
        "lastTrMoney",
        "lastPayDate",
        "lastPayAmount",
        "endDate",
        "trFrequency",
        "taxInPriceFlag",
        "createPerson",
        "modifyPerson",
        "modifyDate",
        "authClass",
        "barcode",
        "selfDefine1",
        "selfDefine2",
        "selfDefine3",
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
        "registFund",
        "employeeNum",
        "gradeABC",
        "memo",
        "licenceDate",
        "licenceSDate",
        "licenceEDate",
        "licenceADays",
        "businessDate",
        "businessSDate",
        "businessEDate",
        "businessADays",
        "proxyDate",
        "proxySDate",
        "proxyEDate",
        "proxyADays",
        "passGMP",
        "bvencargo",
        "bproxyforeign",
        "bvenservice",
        "cVenTradeCCode",
        "cvenbankcode",
        "cRelCustomer",
        "cvenexchName",
        "ivengsptype",
        "ivengspauth",
        "cvengspauthno",
        "cvenbusinessno",
        "cvenlicenceno",
        "bvenoverseas",
        "bvenaccperiodmng",
        "cvenpuomprotocol",
        "cvenotherprotocol",
        "cvencountrycode",
        "cvenenname",
        "cvenenaddr1",
        "cvenenaddr2",
        "cvenenaddr3",
        "cvenenaddr4",
        "cvenportcode",
        "cvenprimaryven",
        "fvencommisionrate",
        "fveninsuerate",
        "bvenhomebranch",
        "cvenbranchaddr",
        "cvenbranchphone",
        "cvenbranchperson",
        "cvensscode",
        "comwhcode"
    })
    public static class Vendor {

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
        protected String phone;
        protected String fax;
        protected String email;
        protected String contact;
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
        @XmlElement(name = "receive_site")
        protected String receiveSite;
        @XmlElement(name = "receive_mode")
        protected String receiveMode;
        @XmlElement(name = "head_corp_code")
        protected String headCorpCode;
        @XmlElement(name = "rec_warehouse")
        protected String recWarehouse;
        @XmlElement(name = "super_dept")
        protected String superDept;
        @XmlElement(name = "ap_rest")
        protected String apRest;
        @XmlElement(name = "last_tr_date")
        protected String lastTrDate;
        @XmlElement(name = "last_tr_money")
        protected String lastTrMoney;
        @XmlElement(name = "last_pay_date")
        protected String lastPayDate;
        @XmlElement(name = "last_pay_amount")
        protected String lastPayAmount;
        @XmlElement(name = "end_date")
        protected String endDate;
        @XmlElement(name = "tr_frequency")
        protected String trFrequency;
        @XmlElement(name = "tax_in_price_flag")
        protected String taxInPriceFlag;
        @XmlElement(name = "CreatePerson")
        protected String createPerson;
        @XmlElement(name = "ModifyPerson")
        protected String modifyPerson;
        @XmlElement(name = "ModifyDate")
        protected String modifyDate;
        @XmlElement(name = "auth_class")
        protected String authClass;
        protected String barcode;
        @XmlElement(name = "self_define1")
        protected String selfDefine1;
        @XmlElement(name = "self_define2")
        protected String selfDefine2;
        @XmlElement(name = "self_define3")
        protected String selfDefine3;
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
        @XmlElement(name = "RegistFund")
        protected String registFund;
        @XmlElement(name = "EmployeeNum")
        protected String employeeNum;
        @XmlElement(name = "GradeABC")
        protected String gradeABC;
        @XmlElement(name = "Memo")
        protected String memo;
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
        @XmlElement(name = "ProxyDate")
        protected String proxyDate;
        @XmlElement(name = "ProxySDate")
        protected String proxySDate;
        @XmlElement(name = "ProxyEDate")
        protected String proxyEDate;
        @XmlElement(name = "ProxyADays")
        protected String proxyADays;
        @XmlElement(name = "PassGMP")
        protected String passGMP;
        protected String bvencargo;
        protected String bproxyforeign;
        protected String bvenservice;
        protected String cVenTradeCCode;
        protected String cvenbankcode;
        protected String cRelCustomer;
        @XmlElement(name = "cvenexch_name")
        protected String cvenexchName;
        protected String ivengsptype;
        protected String ivengspauth;
        protected String cvengspauthno;
        protected String cvenbusinessno;
        protected String cvenlicenceno;
        protected String bvenoverseas;
        protected String bvenaccperiodmng;
        protected String cvenpuomprotocol;
        protected String cvenotherprotocol;
        protected String cvencountrycode;
        protected String cvenenname;
        protected String cvenenaddr1;
        protected String cvenenaddr2;
        protected String cvenenaddr3;
        protected String cvenenaddr4;
        protected String cvenportcode;
        protected String cvenprimaryven;
        protected String fvencommisionrate;
        protected String fveninsuerate;
        protected String bvenhomebranch;
        protected String cvenbranchaddr;
        protected String cvenbranchphone;
        protected String cvenbranchperson;
        protected String cvensscode;
        protected String comwhcode;
        @XmlAttribute(name = "id")
        protected String id;

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
         * 获取receiveSite属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveSite() {
            return receiveSite;
        }

        /**
         * 设置receiveSite属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveSite(String value) {
            this.receiveSite = value;
        }

        /**
         * 获取receiveMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceiveMode() {
            return receiveMode;
        }

        /**
         * 设置receiveMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceiveMode(String value) {
            this.receiveMode = value;
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
         * 获取recWarehouse属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecWarehouse() {
            return recWarehouse;
        }

        /**
         * 设置recWarehouse属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecWarehouse(String value) {
            this.recWarehouse = value;
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
         * 获取apRest属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApRest() {
            return apRest;
        }

        /**
         * 设置apRest属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApRest(String value) {
            this.apRest = value;
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
         * 获取lastTrMoney属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastTrMoney() {
            return lastTrMoney;
        }

        /**
         * 设置lastTrMoney属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastTrMoney(String value) {
            this.lastTrMoney = value;
        }

        /**
         * 获取lastPayDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastPayDate() {
            return lastPayDate;
        }

        /**
         * 设置lastPayDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastPayDate(String value) {
            this.lastPayDate = value;
        }

        /**
         * 获取lastPayAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastPayAmount() {
            return lastPayAmount;
        }

        /**
         * 设置lastPayAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastPayAmount(String value) {
            this.lastPayAmount = value;
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
         * 获取taxInPriceFlag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxInPriceFlag() {
            return taxInPriceFlag;
        }

        /**
         * 设置taxInPriceFlag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxInPriceFlag(String value) {
            this.taxInPriceFlag = value;
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
         * 获取barcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBarcode() {
            return barcode;
        }

        /**
         * 设置barcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBarcode(String value) {
            this.barcode = value;
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
         * 获取registFund属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistFund() {
            return registFund;
        }

        /**
         * 设置registFund属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistFund(String value) {
            this.registFund = value;
        }

        /**
         * 获取employeeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployeeNum() {
            return employeeNum;
        }

        /**
         * 设置employeeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployeeNum(String value) {
            this.employeeNum = value;
        }

        /**
         * 获取gradeABC属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGradeABC() {
            return gradeABC;
        }

        /**
         * 设置gradeABC属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGradeABC(String value) {
            this.gradeABC = value;
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
         * 获取proxyDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyDate() {
            return proxyDate;
        }

        /**
         * 设置proxyDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyDate(String value) {
            this.proxyDate = value;
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
         * 获取passGMP属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassGMP() {
            return passGMP;
        }

        /**
         * 设置passGMP属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassGMP(String value) {
            this.passGMP = value;
        }

        /**
         * 获取bvencargo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBvencargo() {
            return bvencargo;
        }

        /**
         * 设置bvencargo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBvencargo(String value) {
            this.bvencargo = value;
        }

        /**
         * 获取bproxyforeign属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBproxyforeign() {
            return bproxyforeign;
        }

        /**
         * 设置bproxyforeign属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBproxyforeign(String value) {
            this.bproxyforeign = value;
        }

        /**
         * 获取bvenservice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBvenservice() {
            return bvenservice;
        }

        /**
         * 设置bvenservice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBvenservice(String value) {
            this.bvenservice = value;
        }

        /**
         * 获取cVenTradeCCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCVenTradeCCode() {
            return cVenTradeCCode;
        }

        /**
         * 设置cVenTradeCCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCVenTradeCCode(String value) {
            this.cVenTradeCCode = value;
        }

        /**
         * 获取cvenbankcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenbankcode() {
            return cvenbankcode;
        }

        /**
         * 设置cvenbankcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenbankcode(String value) {
            this.cvenbankcode = value;
        }

        /**
         * 获取cRelCustomer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRelCustomer() {
            return cRelCustomer;
        }

        /**
         * 设置cRelCustomer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRelCustomer(String value) {
            this.cRelCustomer = value;
        }

        /**
         * 获取cvenexchName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenexchName() {
            return cvenexchName;
        }

        /**
         * 设置cvenexchName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenexchName(String value) {
            this.cvenexchName = value;
        }

        /**
         * 获取ivengsptype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIvengsptype() {
            return ivengsptype;
        }

        /**
         * 设置ivengsptype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIvengsptype(String value) {
            this.ivengsptype = value;
        }

        /**
         * 获取ivengspauth属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIvengspauth() {
            return ivengspauth;
        }

        /**
         * 设置ivengspauth属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIvengspauth(String value) {
            this.ivengspauth = value;
        }

        /**
         * 获取cvengspauthno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvengspauthno() {
            return cvengspauthno;
        }

        /**
         * 设置cvengspauthno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvengspauthno(String value) {
            this.cvengspauthno = value;
        }

        /**
         * 获取cvenbusinessno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenbusinessno() {
            return cvenbusinessno;
        }

        /**
         * 设置cvenbusinessno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenbusinessno(String value) {
            this.cvenbusinessno = value;
        }

        /**
         * 获取cvenlicenceno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenlicenceno() {
            return cvenlicenceno;
        }

        /**
         * 设置cvenlicenceno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenlicenceno(String value) {
            this.cvenlicenceno = value;
        }

        /**
         * 获取bvenoverseas属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBvenoverseas() {
            return bvenoverseas;
        }

        /**
         * 设置bvenoverseas属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBvenoverseas(String value) {
            this.bvenoverseas = value;
        }

        /**
         * 获取bvenaccperiodmng属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBvenaccperiodmng() {
            return bvenaccperiodmng;
        }

        /**
         * 设置bvenaccperiodmng属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBvenaccperiodmng(String value) {
            this.bvenaccperiodmng = value;
        }

        /**
         * 获取cvenpuomprotocol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenpuomprotocol() {
            return cvenpuomprotocol;
        }

        /**
         * 设置cvenpuomprotocol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenpuomprotocol(String value) {
            this.cvenpuomprotocol = value;
        }

        /**
         * 获取cvenotherprotocol属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenotherprotocol() {
            return cvenotherprotocol;
        }

        /**
         * 设置cvenotherprotocol属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenotherprotocol(String value) {
            this.cvenotherprotocol = value;
        }

        /**
         * 获取cvencountrycode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvencountrycode() {
            return cvencountrycode;
        }

        /**
         * 设置cvencountrycode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvencountrycode(String value) {
            this.cvencountrycode = value;
        }

        /**
         * 获取cvenenname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenenname() {
            return cvenenname;
        }

        /**
         * 设置cvenenname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenenname(String value) {
            this.cvenenname = value;
        }

        /**
         * 获取cvenenaddr1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenenaddr1() {
            return cvenenaddr1;
        }

        /**
         * 设置cvenenaddr1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenenaddr1(String value) {
            this.cvenenaddr1 = value;
        }

        /**
         * 获取cvenenaddr2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenenaddr2() {
            return cvenenaddr2;
        }

        /**
         * 设置cvenenaddr2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenenaddr2(String value) {
            this.cvenenaddr2 = value;
        }

        /**
         * 获取cvenenaddr3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenenaddr3() {
            return cvenenaddr3;
        }

        /**
         * 设置cvenenaddr3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenenaddr3(String value) {
            this.cvenenaddr3 = value;
        }

        /**
         * 获取cvenenaddr4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenenaddr4() {
            return cvenenaddr4;
        }

        /**
         * 设置cvenenaddr4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenenaddr4(String value) {
            this.cvenenaddr4 = value;
        }

        /**
         * 获取cvenportcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenportcode() {
            return cvenportcode;
        }

        /**
         * 设置cvenportcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenportcode(String value) {
            this.cvenportcode = value;
        }

        /**
         * 获取cvenprimaryven属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenprimaryven() {
            return cvenprimaryven;
        }

        /**
         * 设置cvenprimaryven属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenprimaryven(String value) {
            this.cvenprimaryven = value;
        }

        /**
         * 获取fvencommisionrate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFvencommisionrate() {
            return fvencommisionrate;
        }

        /**
         * 设置fvencommisionrate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFvencommisionrate(String value) {
            this.fvencommisionrate = value;
        }

        /**
         * 获取fveninsuerate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFveninsuerate() {
            return fveninsuerate;
        }

        /**
         * 设置fveninsuerate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFveninsuerate(String value) {
            this.fveninsuerate = value;
        }

        /**
         * 获取bvenhomebranch属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBvenhomebranch() {
            return bvenhomebranch;
        }

        /**
         * 设置bvenhomebranch属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBvenhomebranch(String value) {
            this.bvenhomebranch = value;
        }

        /**
         * 获取cvenbranchaddr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenbranchaddr() {
            return cvenbranchaddr;
        }

        /**
         * 设置cvenbranchaddr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenbranchaddr(String value) {
            this.cvenbranchaddr = value;
        }

        /**
         * 获取cvenbranchphone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenbranchphone() {
            return cvenbranchphone;
        }

        /**
         * 设置cvenbranchphone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenbranchphone(String value) {
            this.cvenbranchphone = value;
        }

        /**
         * 获取cvenbranchperson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvenbranchperson() {
            return cvenbranchperson;
        }

        /**
         * 设置cvenbranchperson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvenbranchperson(String value) {
            this.cvenbranchperson = value;
        }

        /**
         * 获取cvensscode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvensscode() {
            return cvensscode;
        }

        /**
         * 设置cvensscode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvensscode(String value) {
            this.cvensscode = value;
        }

        /**
         * 获取comwhcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComwhcode() {
            return comwhcode;
        }

        /**
         * 设置comwhcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComwhcode(String value) {
            this.comwhcode = value;
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

    }

}
