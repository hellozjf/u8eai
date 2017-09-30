//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:47 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.omorder;

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
 *         &lt;element name="omorder" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="header" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="vendorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="deptcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="purchase_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="operation_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="recsend_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="currency_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="currency_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tax_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paycondition_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="traffic_money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bargain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cvenpuomprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="checkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="unitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="item_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="arrivedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="bomid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fparentscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ivouchrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="details" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="entrys" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="requireddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="baseqtyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="baseqtyd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="basenumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="unitnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="compscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="fvgty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="wiptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="opcomponentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="usequantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="cbatchproperty10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="sendtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "omorder"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Omorder> omorder;
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

    /**
     * Gets the value of the omorder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the omorder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOmorder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Omorder }
     * 
     * 
     */
    public List<Ufinterface.Omorder> getOmorder() {
        if (omorder == null) {
            omorder = new ArrayList<Ufinterface.Omorder>();
        }
        return this.omorder;
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
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="vendorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="deptcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="purchase_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="operation_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="recsend_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="currency_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="currency_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tax_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paycondition_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="traffic_money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bargain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cvenpuomprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="checkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="unitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="item_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="arrivedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                             &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="bomid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fparentscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ivouchrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="details" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="entrys" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="requireddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="baseqtyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="baseqtyd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="basenumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="unitnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="compscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="fvgty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="wiptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="opcomponentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="usequantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="cbatchproperty10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="sendtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class Omorder {

        protected List<Ufinterface.Omorder.Header> header;
        protected List<Ufinterface.Omorder.Body> body;

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
         * {@link Ufinterface.Omorder.Header }
         * 
         * 
         */
        public List<Ufinterface.Omorder.Header> getHeader() {
            if (header == null) {
                header = new ArrayList<Ufinterface.Omorder.Header>();
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
         * {@link Ufinterface.Omorder.Body }
         * 
         * 
         */
        public List<Ufinterface.Omorder.Body> getBody() {
            if (body == null) {
                body = new ArrayList<Ufinterface.Omorder.Body>();
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="checkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="unitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="item_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="arrivedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="bomid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fparentscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ivouchrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="details" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="entrys" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="requireddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="baseqtyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="baseqtyd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="basenumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="unitnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="compscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="fvgty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="wiptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="opcomponentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="usequantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="cbatchproperty10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="sendtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class Body {

            protected List<Ufinterface.Omorder.Body.Entry> entry;

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
             * {@link Ufinterface.Omorder.Body.Entry }
             * 
             * 
             */
            public List<Ufinterface.Omorder.Body.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<Ufinterface.Omorder.Body.Entry>();
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
             *         &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="checkflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="unitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="assistantunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="item_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="item_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="arrivedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *         &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="bomid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fparentscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ivouchrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="details" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="entrys" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="requireddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="baseqtyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="baseqtyd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="basenumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="unitnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="compscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="fvgty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="wiptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="opcomponentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="usequantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="cbatchproperty10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="sendtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "inventorycode",
                "checkflag",
                "unitcode",
                "quantity",
                "num",
                "quotedprice",
                "price",
                "taxprice",
                "money",
                "tax",
                "sum",
                "discount",
                "assistantunit",
                "natprice",
                "natmoney",
                "nattax",
                "natsum",
                "natdiscount",
                "taxrate",
                "itemClass",
                "itemCode",
                "itemName",
                "arrivedate",
                "define22",
                "define23",
                "define24",
                "define25",
                "define26",
                "define27",
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
                "free1",
                "free2",
                "free3",
                "free4",
                "free5",
                "free6",
                "free7",
                "free8",
                "free9",
                "free10",
                "bomid",
                "fparentscrp",
                "ivouchrowno",
                "details"
            })
            public static class Entry {

                protected String inventorycode;
                protected String checkflag;
                protected String unitcode;
                protected String quantity;
                protected String num;
                protected String quotedprice;
                protected String price;
                protected String taxprice;
                protected String money;
                protected String tax;
                protected String sum;
                protected String discount;
                protected String assistantunit;
                protected String natprice;
                protected String natmoney;
                protected String nattax;
                protected String natsum;
                protected String natdiscount;
                protected String taxrate;
                @XmlElement(name = "item_class")
                protected String itemClass;
                @XmlElement(name = "item_code")
                protected String itemCode;
                @XmlElement(name = "item_name")
                protected String itemName;
                protected String arrivedate;
                protected String define22;
                protected String define23;
                protected String define24;
                protected String define25;
                protected String define26;
                protected String define27;
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
                protected String free1;
                protected String free2;
                protected String free3;
                protected String free4;
                protected String free5;
                protected String free6;
                protected String free7;
                protected String free8;
                protected String free9;
                protected String free10;
                protected String bomid;
                protected String fparentscrp;
                protected String ivouchrowno;
                protected List<Ufinterface.Omorder.Body.Entry.Details> details;

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
                 * 获取checkflag属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCheckflag() {
                    return checkflag;
                }

                /**
                 * 设置checkflag属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCheckflag(String value) {
                    this.checkflag = value;
                }

                /**
                 * 获取unitcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitcode() {
                    return unitcode;
                }

                /**
                 * 设置unitcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitcode(String value) {
                    this.unitcode = value;
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
                 * 获取num属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNum() {
                    return num;
                }

                /**
                 * 设置num属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNum(String value) {
                    this.num = value;
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
                 * 获取taxprice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxprice() {
                    return taxprice;
                }

                /**
                 * 设置taxprice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxprice(String value) {
                    this.taxprice = value;
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
                 * 获取natprice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatprice() {
                    return natprice;
                }

                /**
                 * 设置natprice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatprice(String value) {
                    this.natprice = value;
                }

                /**
                 * 获取natmoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatmoney() {
                    return natmoney;
                }

                /**
                 * 设置natmoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatmoney(String value) {
                    this.natmoney = value;
                }

                /**
                 * 获取nattax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNattax() {
                    return nattax;
                }

                /**
                 * 设置nattax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNattax(String value) {
                    this.nattax = value;
                }

                /**
                 * 获取natsum属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatsum() {
                    return natsum;
                }

                /**
                 * 设置natsum属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatsum(String value) {
                    this.natsum = value;
                }

                /**
                 * 获取natdiscount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatdiscount() {
                    return natdiscount;
                }

                /**
                 * 设置natdiscount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatdiscount(String value) {
                    this.natdiscount = value;
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
                 * 获取itemCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemCode() {
                    return itemCode;
                }

                /**
                 * 设置itemCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemCode(String value) {
                    this.itemCode = value;
                }

                /**
                 * 获取itemName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemName() {
                    return itemName;
                }

                /**
                 * 设置itemName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemName(String value) {
                    this.itemName = value;
                }

                /**
                 * 获取arrivedate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getArrivedate() {
                    return arrivedate;
                }

                /**
                 * 设置arrivedate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setArrivedate(String value) {
                    this.arrivedate = value;
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
                 * 获取bomid属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBomid() {
                    return bomid;
                }

                /**
                 * 设置bomid属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBomid(String value) {
                    this.bomid = value;
                }

                /**
                 * 获取fparentscrp属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFparentscrp() {
                    return fparentscrp;
                }

                /**
                 * 设置fparentscrp属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFparentscrp(String value) {
                    this.fparentscrp = value;
                }

                /**
                 * 获取ivouchrowno属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIvouchrowno() {
                    return ivouchrowno;
                }

                /**
                 * 设置ivouchrowno属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIvouchrowno(String value) {
                    this.ivouchrowno = value;
                }

                /**
                 * Gets the value of the details property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the details property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Ufinterface.Omorder.Body.Entry.Details }
                 * 
                 * 
                 */
                public List<Ufinterface.Omorder.Body.Entry.Details> getDetails() {
                    if (details == null) {
                        details = new ArrayList<Ufinterface.Omorder.Body.Entry.Details>();
                    }
                    return this.details;
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
                 *         &lt;element name="entrys" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="requireddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="baseqtyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="baseqtyd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="basenumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="unitnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="compscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="fvgty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="wiptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="opcomponentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="usequantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="cbatchproperty10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="sendtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "entrys"
                })
                public static class Details {

                    protected List<Ufinterface.Omorder.Body.Entry.Details.Entrys> entrys;

                    /**
                     * Gets the value of the entrys property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the entrys property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getEntrys().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Ufinterface.Omorder.Body.Entry.Details.Entrys }
                     * 
                     * 
                     */
                    public List<Ufinterface.Omorder.Body.Entry.Details.Entrys> getEntrys() {
                        if (entrys == null) {
                            entrys = new ArrayList<Ufinterface.Omorder.Body.Entry.Details.Entrys>();
                        }
                        return this.entrys;
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
                     *         &lt;element name="inventorycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="requireddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="baseqtyn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="baseqtyd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="basenumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="unitnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="compscrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="fvgty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="wiptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="opcomponentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="usequantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="batchno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="cbatchproperty10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="sendtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "inventorycode",
                        "quantity",
                        "requireddate",
                        "free1",
                        "free2",
                        "free3",
                        "free4",
                        "free5",
                        "free6",
                        "free7",
                        "free8",
                        "free9",
                        "free10",
                        "baseqtyn",
                        "baseqtyd",
                        "basenumn",
                        "unitnum",
                        "num",
                        "unitid",
                        "compscrp",
                        "fvgty",
                        "wiptype",
                        "opcomponentid",
                        "whcode",
                        "usequantity",
                        "batchno",
                        "cbatchproperty1",
                        "cbatchproperty2",
                        "cbatchproperty3",
                        "cbatchproperty4",
                        "cbatchproperty5",
                        "cbatchproperty6",
                        "cbatchproperty7",
                        "cbatchproperty8",
                        "cbatchproperty9",
                        "cbatchproperty10",
                        "sendtype"
                    })
                    public static class Entrys {

                        protected String inventorycode;
                        protected String quantity;
                        protected String requireddate;
                        protected String free1;
                        protected String free2;
                        protected String free3;
                        protected String free4;
                        protected String free5;
                        protected String free6;
                        protected String free7;
                        protected String free8;
                        protected String free9;
                        protected String free10;
                        protected String baseqtyn;
                        protected String baseqtyd;
                        protected String basenumn;
                        protected String unitnum;
                        protected String num;
                        protected String unitid;
                        protected String compscrp;
                        protected String fvgty;
                        protected String wiptype;
                        protected String opcomponentid;
                        protected String whcode;
                        protected String usequantity;
                        protected String batchno;
                        protected String cbatchproperty1;
                        protected String cbatchproperty2;
                        protected String cbatchproperty3;
                        protected String cbatchproperty4;
                        protected String cbatchproperty5;
                        protected String cbatchproperty6;
                        protected String cbatchproperty7;
                        protected String cbatchproperty8;
                        protected String cbatchproperty9;
                        protected String cbatchproperty10;
                        protected String sendtype;

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
                         * 获取requireddate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRequireddate() {
                            return requireddate;
                        }

                        /**
                         * 设置requireddate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRequireddate(String value) {
                            this.requireddate = value;
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
                         * 获取baseqtyn属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBaseqtyn() {
                            return baseqtyn;
                        }

                        /**
                         * 设置baseqtyn属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBaseqtyn(String value) {
                            this.baseqtyn = value;
                        }

                        /**
                         * 获取baseqtyd属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBaseqtyd() {
                            return baseqtyd;
                        }

                        /**
                         * 设置baseqtyd属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBaseqtyd(String value) {
                            this.baseqtyd = value;
                        }

                        /**
                         * 获取basenumn属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBasenumn() {
                            return basenumn;
                        }

                        /**
                         * 设置basenumn属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBasenumn(String value) {
                            this.basenumn = value;
                        }

                        /**
                         * 获取unitnum属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnitnum() {
                            return unitnum;
                        }

                        /**
                         * 设置unitnum属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnitnum(String value) {
                            this.unitnum = value;
                        }

                        /**
                         * 获取num属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNum() {
                            return num;
                        }

                        /**
                         * 设置num属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNum(String value) {
                            this.num = value;
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
                         * 获取compscrp属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompscrp() {
                            return compscrp;
                        }

                        /**
                         * 设置compscrp属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompscrp(String value) {
                            this.compscrp = value;
                        }

                        /**
                         * 获取fvgty属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFvgty() {
                            return fvgty;
                        }

                        /**
                         * 设置fvgty属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFvgty(String value) {
                            this.fvgty = value;
                        }

                        /**
                         * 获取wiptype属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getWiptype() {
                            return wiptype;
                        }

                        /**
                         * 设置wiptype属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setWiptype(String value) {
                            this.wiptype = value;
                        }

                        /**
                         * 获取opcomponentid属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOpcomponentid() {
                            return opcomponentid;
                        }

                        /**
                         * 设置opcomponentid属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOpcomponentid(String value) {
                            this.opcomponentid = value;
                        }

                        /**
                         * 获取whcode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getWhcode() {
                            return whcode;
                        }

                        /**
                         * 设置whcode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setWhcode(String value) {
                            this.whcode = value;
                        }

                        /**
                         * 获取usequantity属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUsequantity() {
                            return usequantity;
                        }

                        /**
                         * 设置usequantity属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUsequantity(String value) {
                            this.usequantity = value;
                        }

                        /**
                         * 获取batchno属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBatchno() {
                            return batchno;
                        }

                        /**
                         * 设置batchno属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBatchno(String value) {
                            this.batchno = value;
                        }

                        /**
                         * 获取cbatchproperty1属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty1() {
                            return cbatchproperty1;
                        }

                        /**
                         * 设置cbatchproperty1属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty1(String value) {
                            this.cbatchproperty1 = value;
                        }

                        /**
                         * 获取cbatchproperty2属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty2() {
                            return cbatchproperty2;
                        }

                        /**
                         * 设置cbatchproperty2属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty2(String value) {
                            this.cbatchproperty2 = value;
                        }

                        /**
                         * 获取cbatchproperty3属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty3() {
                            return cbatchproperty3;
                        }

                        /**
                         * 设置cbatchproperty3属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty3(String value) {
                            this.cbatchproperty3 = value;
                        }

                        /**
                         * 获取cbatchproperty4属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty4() {
                            return cbatchproperty4;
                        }

                        /**
                         * 设置cbatchproperty4属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty4(String value) {
                            this.cbatchproperty4 = value;
                        }

                        /**
                         * 获取cbatchproperty5属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty5() {
                            return cbatchproperty5;
                        }

                        /**
                         * 设置cbatchproperty5属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty5(String value) {
                            this.cbatchproperty5 = value;
                        }

                        /**
                         * 获取cbatchproperty6属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty6() {
                            return cbatchproperty6;
                        }

                        /**
                         * 设置cbatchproperty6属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty6(String value) {
                            this.cbatchproperty6 = value;
                        }

                        /**
                         * 获取cbatchproperty7属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty7() {
                            return cbatchproperty7;
                        }

                        /**
                         * 设置cbatchproperty7属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty7(String value) {
                            this.cbatchproperty7 = value;
                        }

                        /**
                         * 获取cbatchproperty8属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty8() {
                            return cbatchproperty8;
                        }

                        /**
                         * 设置cbatchproperty8属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty8(String value) {
                            this.cbatchproperty8 = value;
                        }

                        /**
                         * 获取cbatchproperty9属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty9() {
                            return cbatchproperty9;
                        }

                        /**
                         * 设置cbatchproperty9属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty9(String value) {
                            this.cbatchproperty9 = value;
                        }

                        /**
                         * 获取cbatchproperty10属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCbatchproperty10() {
                            return cbatchproperty10;
                        }

                        /**
                         * 设置cbatchproperty10属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCbatchproperty10(String value) {
                            this.cbatchproperty10 = value;
                        }

                        /**
                         * 获取sendtype属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSendtype() {
                            return sendtype;
                        }

                        /**
                         * 设置sendtype属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSendtype(String value) {
                            this.sendtype = value;
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
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="vendorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="deptcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="purchase_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="operation_type_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="recsend_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="currency_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="currency_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tax_rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paycondition_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="traffic_money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bargain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cvenpuomprotocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "date",
            "vendorcode",
            "deptcode",
            "personcode",
            "purchaseTypeCode",
            "operationTypeCode",
            "address",
            "recsendType",
            "currencyName",
            "currencyRate",
            "taxRate",
            "payconditionCode",
            "trafficMoney",
            "bargain",
            "remark",
            "maker",
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
            "define11",
            "define12",
            "define13",
            "define14",
            "define15",
            "define16",
            "cvenpuomprotocol"
        })
        public static class Header {

            protected String code;
            protected String date;
            protected String vendorcode;
            protected String deptcode;
            protected String personcode;
            @XmlElement(name = "purchase_type_code")
            protected String purchaseTypeCode;
            @XmlElement(name = "operation_type_code")
            protected String operationTypeCode;
            protected String address;
            @XmlElement(name = "recsend_type")
            protected String recsendType;
            @XmlElement(name = "currency_name")
            protected String currencyName;
            @XmlElement(name = "currency_rate")
            protected String currencyRate;
            @XmlElement(name = "tax_rate")
            protected String taxRate;
            @XmlElement(name = "paycondition_code")
            protected String payconditionCode;
            @XmlElement(name = "traffic_money")
            protected String trafficMoney;
            protected String bargain;
            protected String remark;
            protected String maker;
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
            protected String define11;
            protected String define12;
            protected String define13;
            protected String define14;
            protected String define15;
            protected String define16;
            protected String cvenpuomprotocol;

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
             * 获取vendorcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVendorcode() {
                return vendorcode;
            }

            /**
             * 设置vendorcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVendorcode(String value) {
                this.vendorcode = value;
            }

            /**
             * 获取deptcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeptcode() {
                return deptcode;
            }

            /**
             * 设置deptcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeptcode(String value) {
                this.deptcode = value;
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
             * 获取purchaseTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurchaseTypeCode() {
                return purchaseTypeCode;
            }

            /**
             * 设置purchaseTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurchaseTypeCode(String value) {
                this.purchaseTypeCode = value;
            }

            /**
             * 获取operationTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationTypeCode() {
                return operationTypeCode;
            }

            /**
             * 设置operationTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationTypeCode(String value) {
                this.operationTypeCode = value;
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
             * 获取recsendType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecsendType() {
                return recsendType;
            }

            /**
             * 设置recsendType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecsendType(String value) {
                this.recsendType = value;
            }

            /**
             * 获取currencyName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyName() {
                return currencyName;
            }

            /**
             * 设置currencyName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyName(String value) {
                this.currencyName = value;
            }

            /**
             * 获取currencyRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyRate() {
                return currencyRate;
            }

            /**
             * 设置currencyRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyRate(String value) {
                this.currencyRate = value;
            }

            /**
             * 获取taxRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxRate() {
                return taxRate;
            }

            /**
             * 设置taxRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxRate(String value) {
                this.taxRate = value;
            }

            /**
             * 获取payconditionCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayconditionCode() {
                return payconditionCode;
            }

            /**
             * 设置payconditionCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayconditionCode(String value) {
                this.payconditionCode = value;
            }

            /**
             * 获取trafficMoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrafficMoney() {
                return trafficMoney;
            }

            /**
             * 设置trafficMoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrafficMoney(String value) {
                this.trafficMoney = value;
            }

            /**
             * 获取bargain属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBargain() {
                return bargain;
            }

            /**
             * 设置bargain属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBargain(String value) {
                this.bargain = value;
            }

            /**
             * 获取remark属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemark() {
                return remark;
            }

            /**
             * 设置remark属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemark(String value) {
                this.remark = value;
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

        }

    }

}
