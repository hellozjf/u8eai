//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:50 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.saleinvoice;

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
 *         &lt;element name="saleinvoice" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="header" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="outid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="invoiceno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="vouchertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="saletypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="receivetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="departmentcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="customercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payconditioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="foreigncurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="currencyrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isnegative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="invoiceversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="businesstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isfirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itemclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ispayedfirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="customername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ccusaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cbaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdeliverunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdeliveradd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ccontactname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cofficephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="caddcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cgatheringplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dcreditstart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="icreditdays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dgatheringdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bcredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="csource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ccusbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="body" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mainid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="warehousecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originalprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originaltaxedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originalmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originaltax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originaldiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="moneysum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accountclue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="amend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="invaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="amendquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="amendnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accountrate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accountrate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="inventoryname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="retailprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="retailmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itemclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itemclassname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exchangerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cordercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iorderrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cvmivencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="irowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExpiratDateCalcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExpirationItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="originalsum" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
    "saleinvoice"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Saleinvoice> saleinvoice;
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
     * Gets the value of the saleinvoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleinvoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleinvoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Saleinvoice }
     * 
     * 
     */
    public List<Ufinterface.Saleinvoice> getSaleinvoice() {
        if (saleinvoice == null) {
            saleinvoice = new ArrayList<Ufinterface.Saleinvoice>();
        }
        return this.saleinvoice;
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
     *         &lt;element name="header" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="outid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="invoiceno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="vouchertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="saletypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="receivetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="departmentcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="customercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payconditioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="foreigncurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="currencyrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isnegative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="invoiceversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="businesstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isfirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itemclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ispayedfirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="customername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ccusaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cbaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdeliverunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdeliveradd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ccontactname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cofficephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="caddcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cgatheringplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dcreditstart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="icreditdays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dgatheringdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bcredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="csource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ccusbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="body" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mainid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="warehousecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originalprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originaltaxedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originalmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originaltax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originaldiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="moneysum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accountclue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="amend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="invaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="amendquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="amendnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accountrate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accountrate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="inventoryname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="retailprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="retailmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itemclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itemclassname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exchangerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cordercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iorderrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cvmivencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="irowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpiratDateCalcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExpirationItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="originalsum" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
        "header",
        "body"
    })
    public static class Saleinvoice {

        protected List<Ufinterface.Saleinvoice.Header> header;
        protected List<Ufinterface.Saleinvoice.Body> body;

        /**
         * Gets the value of the header property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the header property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Saleinvoice.Header }
         * 
         * 
         */
        public List<Ufinterface.Saleinvoice.Header> getHeader() {
            if (header == null) {
                header = new ArrayList<Ufinterface.Saleinvoice.Header>();
            }
            return this.header;
        }

        /**
         * Gets the value of the body property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the body property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBody().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Saleinvoice.Body }
         * 
         * 
         */
        public List<Ufinterface.Saleinvoice.Body> getBody() {
            if (body == null) {
                body = new ArrayList<Ufinterface.Saleinvoice.Body>();
            }
            return this.body;
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
         *         &lt;element name="mainid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="warehousecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originalprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originaltaxedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originalmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originaltax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originaldiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="moneysum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accountclue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="amend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="invaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="amendquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="amendnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accountrate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accountrate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="inventoryname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="retailprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="retailmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itemclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itemclassname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exchangerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cordercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iorderrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cvmivencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="irowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpiratDateCalcu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExpirationItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="originalsum" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
            "mainid",
            "warehousecode",
            "inventorycode",
            "quantity",
            "number",
            "quotedprice",
            "originalprice",
            "originaltaxedprice",
            "originalmoney",
            "originaltax",
            "originaldiscount",
            "price",
            "money",
            "tax",
            "sum",
            "assistantunit",
            "discount",
            "moneysum",
            "accountclue",
            "memory",
            "serial",
            "free1",
            "free2",
            "amend",
            "invaliddate",
            "amendquantity",
            "amendnumber",
            "accountrate1",
            "accountrate2",
            "inventoryname",
            "taxrate",
            "define22",
            "define23",
            "define24",
            "define25",
            "define26",
            "define27",
            "retailprice",
            "retailmoney",
            "itemclasscode",
            "itemcode",
            "itemname",
            "itemclassname",
            "free3",
            "free4",
            "free5",
            "free6",
            "free7",
            "free8",
            "free9",
            "free10",
            "define28",
            "define29",
            "define30",
            "define31",
            "define32",
            "define33",
            "define34",
            "define35",
            "define36",
            "define37",
            "exchangerate",
            "unitid",
            "cordercode",
            "iorderrowno",
            "cvmivencode",
            "irowno",
            "expirationDate",
            "expiratDateCalcu",
            "expirationItem",
            "originalsum"
        })
        public static class Body {

            protected String mainid;
            protected String warehousecode;
            protected String inventorycode;
            protected String quantity;
            protected String number;
            protected String quotedprice;
            protected String originalprice;
            protected String originaltaxedprice;
            protected String originalmoney;
            protected String originaltax;
            protected String originaldiscount;
            protected String price;
            protected String money;
            protected String tax;
            protected String sum;
            protected String assistantunit;
            protected String discount;
            protected String moneysum;
            protected String accountclue;
            protected String memory;
            protected String serial;
            protected String free1;
            protected String free2;
            protected String amend;
            protected String invaliddate;
            protected String amendquantity;
            protected String amendnumber;
            protected String accountrate1;
            protected String accountrate2;
            protected String inventoryname;
            protected String taxrate;
            protected String define22;
            protected String define23;
            protected String define24;
            protected String define25;
            protected String define26;
            protected String define27;
            protected String retailprice;
            protected String retailmoney;
            protected String itemclasscode;
            protected String itemcode;
            protected String itemname;
            protected String itemclassname;
            protected String free3;
            protected String free4;
            protected String free5;
            protected String free6;
            protected String free7;
            protected String free8;
            protected String free9;
            protected String free10;
            protected String define28;
            protected String define29;
            protected String define30;
            protected String define31;
            protected String define32;
            protected String define33;
            protected String define34;
            protected String define35;
            protected String define36;
            protected String define37;
            protected String exchangerate;
            protected String unitid;
            protected String cordercode;
            protected String iorderrowno;
            protected String cvmivencode;
            protected String irowno;
            @XmlElement(name = "ExpirationDate")
            protected String expirationDate;
            @XmlElement(name = "ExpiratDateCalcu")
            protected String expiratDateCalcu;
            @XmlElement(name = "ExpirationItem")
            protected String expirationItem;
            protected List<Ufinterface.Saleinvoice.Body.Originalsum> originalsum;

            /**
             * 获取mainid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMainid() {
                return mainid;
            }

            /**
             * 设置mainid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMainid(String value) {
                this.mainid = value;
            }

            /**
             * 获取warehousecode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWarehousecode() {
                return warehousecode;
            }

            /**
             * 设置warehousecode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWarehousecode(String value) {
                this.warehousecode = value;
            }

            /**
             * 获取inventorycode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventorycode() {
                return inventorycode;
            }

            /**
             * 设置inventorycode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventorycode(String value) {
                this.inventorycode = value;
            }

            /**
             * 获取quantity属性的值。
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
             * 设置quantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuantity(String value) {
                this.quantity = value;
            }

            /**
             * 获取number属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * 设置number属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * 获取quotedprice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuotedprice() {
                return quotedprice;
            }

            /**
             * 设置quotedprice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuotedprice(String value) {
                this.quotedprice = value;
            }

            /**
             * 获取originalprice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalprice() {
                return originalprice;
            }

            /**
             * 设置originalprice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalprice(String value) {
                this.originalprice = value;
            }

            /**
             * 获取originaltaxedprice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginaltaxedprice() {
                return originaltaxedprice;
            }

            /**
             * 设置originaltaxedprice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginaltaxedprice(String value) {
                this.originaltaxedprice = value;
            }

            /**
             * 获取originalmoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalmoney() {
                return originalmoney;
            }

            /**
             * 设置originalmoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalmoney(String value) {
                this.originalmoney = value;
            }

            /**
             * 获取originaltax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginaltax() {
                return originaltax;
            }

            /**
             * 设置originaltax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginaltax(String value) {
                this.originaltax = value;
            }

            /**
             * 获取originaldiscount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginaldiscount() {
                return originaldiscount;
            }

            /**
             * 设置originaldiscount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginaldiscount(String value) {
                this.originaldiscount = value;
            }

            /**
             * 获取price属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrice() {
                return price;
            }

            /**
             * 设置price属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrice(String value) {
                this.price = value;
            }

            /**
             * 获取money属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoney() {
                return money;
            }

            /**
             * 设置money属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoney(String value) {
                this.money = value;
            }

            /**
             * 获取tax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTax() {
                return tax;
            }

            /**
             * 设置tax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTax(String value) {
                this.tax = value;
            }

            /**
             * 获取sum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSum() {
                return sum;
            }

            /**
             * 设置sum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSum(String value) {
                this.sum = value;
            }

            /**
             * 获取assistantunit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssistantunit() {
                return assistantunit;
            }

            /**
             * 设置assistantunit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssistantunit(String value) {
                this.assistantunit = value;
            }

            /**
             * 获取discount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiscount() {
                return discount;
            }

            /**
             * 设置discount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiscount(String value) {
                this.discount = value;
            }

            /**
             * 获取moneysum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMoneysum() {
                return moneysum;
            }

            /**
             * 设置moneysum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMoneysum(String value) {
                this.moneysum = value;
            }

            /**
             * 获取accountclue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountclue() {
                return accountclue;
            }

            /**
             * 设置accountclue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountclue(String value) {
                this.accountclue = value;
            }

            /**
             * 获取memory属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemory() {
                return memory;
            }

            /**
             * 设置memory属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemory(String value) {
                this.memory = value;
            }

            /**
             * 获取serial属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerial() {
                return serial;
            }

            /**
             * 设置serial属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerial(String value) {
                this.serial = value;
            }

            /**
             * 获取free1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree1() {
                return free1;
            }

            /**
             * 设置free1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree1(String value) {
                this.free1 = value;
            }

            /**
             * 获取free2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree2() {
                return free2;
            }

            /**
             * 设置free2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree2(String value) {
                this.free2 = value;
            }

            /**
             * 获取amend属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmend() {
                return amend;
            }

            /**
             * 设置amend属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmend(String value) {
                this.amend = value;
            }

            /**
             * 获取invaliddate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvaliddate() {
                return invaliddate;
            }

            /**
             * 设置invaliddate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvaliddate(String value) {
                this.invaliddate = value;
            }

            /**
             * 获取amendquantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmendquantity() {
                return amendquantity;
            }

            /**
             * 设置amendquantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmendquantity(String value) {
                this.amendquantity = value;
            }

            /**
             * 获取amendnumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmendnumber() {
                return amendnumber;
            }

            /**
             * 设置amendnumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmendnumber(String value) {
                this.amendnumber = value;
            }

            /**
             * 获取accountrate1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountrate1() {
                return accountrate1;
            }

            /**
             * 设置accountrate1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountrate1(String value) {
                this.accountrate1 = value;
            }

            /**
             * 获取accountrate2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountrate2() {
                return accountrate2;
            }

            /**
             * 设置accountrate2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccountrate2(String value) {
                this.accountrate2 = value;
            }

            /**
             * 获取inventoryname属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryname() {
                return inventoryname;
            }

            /**
             * 设置inventoryname属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryname(String value) {
                this.inventoryname = value;
            }

            /**
             * 获取taxrate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxrate() {
                return taxrate;
            }

            /**
             * 设置taxrate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxrate(String value) {
                this.taxrate = value;
            }

            /**
             * 获取define22属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine22() {
                return define22;
            }

            /**
             * 设置define22属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine22(String value) {
                this.define22 = value;
            }

            /**
             * 获取define23属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine23() {
                return define23;
            }

            /**
             * 设置define23属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine23(String value) {
                this.define23 = value;
            }

            /**
             * 获取define24属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine24() {
                return define24;
            }

            /**
             * 设置define24属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine24(String value) {
                this.define24 = value;
            }

            /**
             * 获取define25属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine25() {
                return define25;
            }

            /**
             * 设置define25属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine25(String value) {
                this.define25 = value;
            }

            /**
             * 获取define26属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine26() {
                return define26;
            }

            /**
             * 设置define26属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine26(String value) {
                this.define26 = value;
            }

            /**
             * 获取define27属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine27() {
                return define27;
            }

            /**
             * 设置define27属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine27(String value) {
                this.define27 = value;
            }

            /**
             * 获取retailprice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetailprice() {
                return retailprice;
            }

            /**
             * 设置retailprice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetailprice(String value) {
                this.retailprice = value;
            }

            /**
             * 获取retailmoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetailmoney() {
                return retailmoney;
            }

            /**
             * 设置retailmoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetailmoney(String value) {
                this.retailmoney = value;
            }

            /**
             * 获取itemclasscode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemclasscode() {
                return itemclasscode;
            }

            /**
             * 设置itemclasscode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemclasscode(String value) {
                this.itemclasscode = value;
            }

            /**
             * 获取itemcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemcode() {
                return itemcode;
            }

            /**
             * 设置itemcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemcode(String value) {
                this.itemcode = value;
            }

            /**
             * 获取itemname属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemname() {
                return itemname;
            }

            /**
             * 设置itemname属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemname(String value) {
                this.itemname = value;
            }

            /**
             * 获取itemclassname属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemclassname() {
                return itemclassname;
            }

            /**
             * 设置itemclassname属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemclassname(String value) {
                this.itemclassname = value;
            }

            /**
             * 获取free3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree3() {
                return free3;
            }

            /**
             * 设置free3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree3(String value) {
                this.free3 = value;
            }

            /**
             * 获取free4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree4() {
                return free4;
            }

            /**
             * 设置free4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree4(String value) {
                this.free4 = value;
            }

            /**
             * 获取free5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree5() {
                return free5;
            }

            /**
             * 设置free5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree5(String value) {
                this.free5 = value;
            }

            /**
             * 获取free6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree6() {
                return free6;
            }

            /**
             * 设置free6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree6(String value) {
                this.free6 = value;
            }

            /**
             * 获取free7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree7() {
                return free7;
            }

            /**
             * 设置free7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree7(String value) {
                this.free7 = value;
            }

            /**
             * 获取free8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree8() {
                return free8;
            }

            /**
             * 设置free8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree8(String value) {
                this.free8 = value;
            }

            /**
             * 获取free9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree9() {
                return free9;
            }

            /**
             * 设置free9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree9(String value) {
                this.free9 = value;
            }

            /**
             * 获取free10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFree10() {
                return free10;
            }

            /**
             * 设置free10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFree10(String value) {
                this.free10 = value;
            }

            /**
             * 获取define28属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine28() {
                return define28;
            }

            /**
             * 设置define28属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine28(String value) {
                this.define28 = value;
            }

            /**
             * 获取define29属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine29() {
                return define29;
            }

            /**
             * 设置define29属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine29(String value) {
                this.define29 = value;
            }

            /**
             * 获取define30属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine30() {
                return define30;
            }

            /**
             * 设置define30属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine30(String value) {
                this.define30 = value;
            }

            /**
             * 获取define31属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine31() {
                return define31;
            }

            /**
             * 设置define31属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine31(String value) {
                this.define31 = value;
            }

            /**
             * 获取define32属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine32() {
                return define32;
            }

            /**
             * 设置define32属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine32(String value) {
                this.define32 = value;
            }

            /**
             * 获取define33属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine33() {
                return define33;
            }

            /**
             * 设置define33属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine33(String value) {
                this.define33 = value;
            }

            /**
             * 获取define34属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine34() {
                return define34;
            }

            /**
             * 设置define34属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine34(String value) {
                this.define34 = value;
            }

            /**
             * 获取define35属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine35() {
                return define35;
            }

            /**
             * 设置define35属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine35(String value) {
                this.define35 = value;
            }

            /**
             * 获取define36属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine36() {
                return define36;
            }

            /**
             * 设置define36属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine36(String value) {
                this.define36 = value;
            }

            /**
             * 获取define37属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine37() {
                return define37;
            }

            /**
             * 设置define37属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine37(String value) {
                this.define37 = value;
            }

            /**
             * 获取exchangerate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExchangerate() {
                return exchangerate;
            }

            /**
             * 设置exchangerate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExchangerate(String value) {
                this.exchangerate = value;
            }

            /**
             * 获取unitid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitid() {
                return unitid;
            }

            /**
             * 设置unitid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitid(String value) {
                this.unitid = value;
            }

            /**
             * 获取cordercode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCordercode() {
                return cordercode;
            }

            /**
             * 设置cordercode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCordercode(String value) {
                this.cordercode = value;
            }

            /**
             * 获取iorderrowno属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIorderrowno() {
                return iorderrowno;
            }

            /**
             * 设置iorderrowno属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIorderrowno(String value) {
                this.iorderrowno = value;
            }

            /**
             * 获取cvmivencode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCvmivencode() {
                return cvmivencode;
            }

            /**
             * 设置cvmivencode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCvmivencode(String value) {
                this.cvmivencode = value;
            }

            /**
             * 获取irowno属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIrowno() {
                return irowno;
            }

            /**
             * 设置irowno属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIrowno(String value) {
                this.irowno = value;
            }

            /**
             * 获取expirationDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpirationDate() {
                return expirationDate;
            }

            /**
             * 设置expirationDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpirationDate(String value) {
                this.expirationDate = value;
            }

            /**
             * 获取expiratDateCalcu属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpiratDateCalcu() {
                return expiratDateCalcu;
            }

            /**
             * 设置expiratDateCalcu属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpiratDateCalcu(String value) {
                this.expiratDateCalcu = value;
            }

            /**
             * 获取expirationItem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExpirationItem() {
                return expirationItem;
            }

            /**
             * 设置expirationItem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExpirationItem(String value) {
                this.expirationItem = value;
            }

            /**
             * Gets the value of the originalsum property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the originalsum property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOriginalsum().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ufinterface.Saleinvoice.Body.Originalsum }
             * 
             * 
             */
            public List<Ufinterface.Saleinvoice.Body.Originalsum> getOriginalsum() {
                if (originalsum == null) {
                    originalsum = new ArrayList<Ufinterface.Saleinvoice.Body.Originalsum>();
                }
                return this.originalsum;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Originalsum {


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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="outid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="invoiceno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="vouchertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="saletypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="receivetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="departmentcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="customercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payconditioncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="foreigncurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="currencyrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isnegative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="invoiceversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="businesstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isfirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itemclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ispayedfirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="customername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ccusaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cbaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdeliverunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdeliveradd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ccontactname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cofficephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="caddcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cgatheringplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dcreditstart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="icreditdays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dgatheringdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bcredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="csource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ccusbank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "id",
            "outid",
            "invoiceno",
            "vouchertype",
            "saletypecode",
            "date",
            "receivetype",
            "departmentcode",
            "personcode",
            "customercode",
            "payconditioncode",
            "foreigncurrency",
            "memory",
            "currencyrate",
            "taxrate",
            "isnegative",
            "bankcode",
            "invoiceversion",
            "maker",
            "businesstype",
            "isfirst",
            "itemclasscode",
            "itemcode",
            "define1",
            "define2",
            "define3",
            "define4",
            "define5",
            "define6",
            "define7",
            "define8",
            "define9",
            "define10",
            "ispayedfirst",
            "customername",
            "define11",
            "define12",
            "define13",
            "define14",
            "define15",
            "define16",
            "ccusaccount",
            "cbaccount",
            "cdeliverunit",
            "cdeliveradd",
            "ccontactname",
            "cofficephone",
            "cmobilephone",
            "caddcode",
            "cgatheringplan",
            "dcreditstart",
            "icreditdays",
            "dgatheringdate",
            "bcredit",
            "csource",
            "ccusbank"
        })
        public static class Header {

            protected String id;
            protected String outid;
            protected String invoiceno;
            protected String vouchertype;
            protected String saletypecode;
            protected String date;
            protected String receivetype;
            protected String departmentcode;
            protected String personcode;
            protected String customercode;
            protected String payconditioncode;
            protected String foreigncurrency;
            protected String memory;
            protected String currencyrate;
            protected String taxrate;
            protected String isnegative;
            protected String bankcode;
            protected String invoiceversion;
            protected String maker;
            protected String businesstype;
            protected String isfirst;
            protected String itemclasscode;
            protected String itemcode;
            protected String define1;
            protected String define2;
            protected String define3;
            protected String define4;
            protected String define5;
            protected String define6;
            protected String define7;
            protected String define8;
            protected String define9;
            protected String define10;
            protected String ispayedfirst;
            protected String customername;
            protected String define11;
            protected String define12;
            protected String define13;
            protected String define14;
            protected String define15;
            protected String define16;
            protected String ccusaccount;
            protected String cbaccount;
            protected String cdeliverunit;
            protected String cdeliveradd;
            protected String ccontactname;
            protected String cofficephone;
            protected String cmobilephone;
            protected String caddcode;
            protected String cgatheringplan;
            protected String dcreditstart;
            protected String icreditdays;
            protected String dgatheringdate;
            protected String bcredit;
            protected String csource;
            protected String ccusbank;

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
             * 获取outid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutid() {
                return outid;
            }

            /**
             * 设置outid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutid(String value) {
                this.outid = value;
            }

            /**
             * 获取invoiceno属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoiceno() {
                return invoiceno;
            }

            /**
             * 设置invoiceno属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoiceno(String value) {
                this.invoiceno = value;
            }

            /**
             * 获取vouchertype属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVouchertype() {
                return vouchertype;
            }

            /**
             * 设置vouchertype属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVouchertype(String value) {
                this.vouchertype = value;
            }

            /**
             * 获取saletypecode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSaletypecode() {
                return saletypecode;
            }

            /**
             * 设置saletypecode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSaletypecode(String value) {
                this.saletypecode = value;
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
             * 获取receivetype属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceivetype() {
                return receivetype;
            }

            /**
             * 设置receivetype属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceivetype(String value) {
                this.receivetype = value;
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
             * 获取payconditioncode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayconditioncode() {
                return payconditioncode;
            }

            /**
             * 设置payconditioncode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayconditioncode(String value) {
                this.payconditioncode = value;
            }

            /**
             * 获取foreigncurrency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForeigncurrency() {
                return foreigncurrency;
            }

            /**
             * 设置foreigncurrency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForeigncurrency(String value) {
                this.foreigncurrency = value;
            }

            /**
             * 获取memory属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemory() {
                return memory;
            }

            /**
             * 设置memory属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemory(String value) {
                this.memory = value;
            }

            /**
             * 获取currencyrate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyrate() {
                return currencyrate;
            }

            /**
             * 设置currencyrate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyrate(String value) {
                this.currencyrate = value;
            }

            /**
             * 获取taxrate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxrate() {
                return taxrate;
            }

            /**
             * 设置taxrate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxrate(String value) {
                this.taxrate = value;
            }

            /**
             * 获取isnegative属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsnegative() {
                return isnegative;
            }

            /**
             * 设置isnegative属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsnegative(String value) {
                this.isnegative = value;
            }

            /**
             * 获取bankcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankcode() {
                return bankcode;
            }

            /**
             * 设置bankcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankcode(String value) {
                this.bankcode = value;
            }

            /**
             * 获取invoiceversion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvoiceversion() {
                return invoiceversion;
            }

            /**
             * 设置invoiceversion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvoiceversion(String value) {
                this.invoiceversion = value;
            }

            /**
             * 获取maker属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaker() {
                return maker;
            }

            /**
             * 设置maker属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaker(String value) {
                this.maker = value;
            }

            /**
             * 获取businesstype属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinesstype() {
                return businesstype;
            }

            /**
             * 设置businesstype属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinesstype(String value) {
                this.businesstype = value;
            }

            /**
             * 获取isfirst属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsfirst() {
                return isfirst;
            }

            /**
             * 设置isfirst属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsfirst(String value) {
                this.isfirst = value;
            }

            /**
             * 获取itemclasscode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemclasscode() {
                return itemclasscode;
            }

            /**
             * 设置itemclasscode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemclasscode(String value) {
                this.itemclasscode = value;
            }

            /**
             * 获取itemcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemcode() {
                return itemcode;
            }

            /**
             * 设置itemcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemcode(String value) {
                this.itemcode = value;
            }

            /**
             * 获取define1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine1() {
                return define1;
            }

            /**
             * 设置define1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine1(String value) {
                this.define1 = value;
            }

            /**
             * 获取define2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine2() {
                return define2;
            }

            /**
             * 设置define2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine2(String value) {
                this.define2 = value;
            }

            /**
             * 获取define3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine3() {
                return define3;
            }

            /**
             * 设置define3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine3(String value) {
                this.define3 = value;
            }

            /**
             * 获取define4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine4() {
                return define4;
            }

            /**
             * 设置define4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine4(String value) {
                this.define4 = value;
            }

            /**
             * 获取define5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine5() {
                return define5;
            }

            /**
             * 设置define5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine5(String value) {
                this.define5 = value;
            }

            /**
             * 获取define6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine6() {
                return define6;
            }

            /**
             * 设置define6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine6(String value) {
                this.define6 = value;
            }

            /**
             * 获取define7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine7() {
                return define7;
            }

            /**
             * 设置define7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine7(String value) {
                this.define7 = value;
            }

            /**
             * 获取define8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine8() {
                return define8;
            }

            /**
             * 设置define8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine8(String value) {
                this.define8 = value;
            }

            /**
             * 获取define9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine9() {
                return define9;
            }

            /**
             * 设置define9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine9(String value) {
                this.define9 = value;
            }

            /**
             * 获取define10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine10() {
                return define10;
            }

            /**
             * 设置define10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine10(String value) {
                this.define10 = value;
            }

            /**
             * 获取ispayedfirst属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIspayedfirst() {
                return ispayedfirst;
            }

            /**
             * 设置ispayedfirst属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIspayedfirst(String value) {
                this.ispayedfirst = value;
            }

            /**
             * 获取customername属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomername() {
                return customername;
            }

            /**
             * 设置customername属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomername(String value) {
                this.customername = value;
            }

            /**
             * 获取define11属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine11() {
                return define11;
            }

            /**
             * 设置define11属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine11(String value) {
                this.define11 = value;
            }

            /**
             * 获取define12属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine12() {
                return define12;
            }

            /**
             * 设置define12属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine12(String value) {
                this.define12 = value;
            }

            /**
             * 获取define13属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine13() {
                return define13;
            }

            /**
             * 设置define13属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine13(String value) {
                this.define13 = value;
            }

            /**
             * 获取define14属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine14() {
                return define14;
            }

            /**
             * 设置define14属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine14(String value) {
                this.define14 = value;
            }

            /**
             * 获取define15属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine15() {
                return define15;
            }

            /**
             * 设置define15属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine15(String value) {
                this.define15 = value;
            }

            /**
             * 获取define16属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine16() {
                return define16;
            }

            /**
             * 设置define16属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine16(String value) {
                this.define16 = value;
            }

            /**
             * 获取ccusaccount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCcusaccount() {
                return ccusaccount;
            }

            /**
             * 设置ccusaccount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCcusaccount(String value) {
                this.ccusaccount = value;
            }

            /**
             * 获取cbaccount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCbaccount() {
                return cbaccount;
            }

            /**
             * 设置cbaccount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCbaccount(String value) {
                this.cbaccount = value;
            }

            /**
             * 获取cdeliverunit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdeliverunit() {
                return cdeliverunit;
            }

            /**
             * 设置cdeliverunit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdeliverunit(String value) {
                this.cdeliverunit = value;
            }

            /**
             * 获取cdeliveradd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdeliveradd() {
                return cdeliveradd;
            }

            /**
             * 设置cdeliveradd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdeliveradd(String value) {
                this.cdeliveradd = value;
            }

            /**
             * 获取ccontactname属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCcontactname() {
                return ccontactname;
            }

            /**
             * 设置ccontactname属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCcontactname(String value) {
                this.ccontactname = value;
            }

            /**
             * 获取cofficephone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCofficephone() {
                return cofficephone;
            }

            /**
             * 设置cofficephone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCofficephone(String value) {
                this.cofficephone = value;
            }

            /**
             * 获取cmobilephone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCmobilephone() {
                return cmobilephone;
            }

            /**
             * 设置cmobilephone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCmobilephone(String value) {
                this.cmobilephone = value;
            }

            /**
             * 获取caddcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCaddcode() {
                return caddcode;
            }

            /**
             * 设置caddcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCaddcode(String value) {
                this.caddcode = value;
            }

            /**
             * 获取cgatheringplan属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCgatheringplan() {
                return cgatheringplan;
            }

            /**
             * 设置cgatheringplan属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCgatheringplan(String value) {
                this.cgatheringplan = value;
            }

            /**
             * 获取dcreditstart属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDcreditstart() {
                return dcreditstart;
            }

            /**
             * 设置dcreditstart属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDcreditstart(String value) {
                this.dcreditstart = value;
            }

            /**
             * 获取icreditdays属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIcreditdays() {
                return icreditdays;
            }

            /**
             * 设置icreditdays属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIcreditdays(String value) {
                this.icreditdays = value;
            }

            /**
             * 获取dgatheringdate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDgatheringdate() {
                return dgatheringdate;
            }

            /**
             * 设置dgatheringdate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDgatheringdate(String value) {
                this.dgatheringdate = value;
            }

            /**
             * 获取bcredit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBcredit() {
                return bcredit;
            }

            /**
             * 设置bcredit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBcredit(String value) {
                this.bcredit = value;
            }

            /**
             * 获取csource属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCsource() {
                return csource;
            }

            /**
             * 设置csource属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCsource(String value) {
                this.csource = value;
            }

            /**
             * 获取ccusbank属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCcusbank() {
                return ccusbank;
            }

            /**
             * 设置ccusbank属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCcusbank(String value) {
                this.ccusbank = value;
            }

        }

    }

}
