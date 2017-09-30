//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:47 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.routing;

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
 *         &lt;element name="Routing" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Version" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Part" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoutingDetail" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PRoutingDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OpSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SVendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RltOptionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LtPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRoutinginspId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReportFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BFFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FeeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PlanSubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AuxUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ChangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoutingInsp" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PRoutinginspId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="QtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DtRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DtNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DtStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DtUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="QtLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="QcProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AqlVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CruleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ItestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OpTransType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoutingRes" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PRoutingResId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PRoutingDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ResSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ResCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseQtyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PlanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ResActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ResQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "routing"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "Routing")
    protected List<Ufinterface.Routing> routing;
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
     * Gets the value of the routing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Routing }
     * 
     * 
     */
    public List<Ufinterface.Routing> getRouting() {
        if (routing == null) {
            routing = new ArrayList<Ufinterface.Routing>();
        }
        return this.routing;
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
     *         &lt;element ref="{}Version" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Part" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoutingDetail" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PRoutingDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OpSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SVendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RltOptionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LtPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRoutinginspId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReportFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BFFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FeeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PlanSubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AuxUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoutingInsp" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PRoutinginspId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="QtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DtRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DtNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DtStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DtUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="QtLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="QcProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AqlVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CruleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ItestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OpTransType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoutingRes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PRoutingResId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PRoutingDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ResSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ResCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseQtyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PlanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ResActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ResQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "version",
        "part",
        "routingDetail",
        "routingInsp",
        "routingRes"
    })
    public static class Routing {

        @XmlElement(name = "Version")
        protected List<Version> version;
        @XmlElement(name = "Part")
        protected List<Ufinterface.Routing.Part> part;
        @XmlElement(name = "RoutingDetail")
        protected List<Ufinterface.Routing.RoutingDetail> routingDetail;
        @XmlElement(name = "RoutingInsp")
        protected List<Ufinterface.Routing.RoutingInsp> routingInsp;
        @XmlElement(name = "RoutingRes")
        protected List<Ufinterface.Routing.RoutingRes> routingRes;

        /**
         * Gets the value of the version property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the version property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVersion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Version }
         * 
         * 
         */
        public List<Version> getVersion() {
            if (version == null) {
                version = new ArrayList<Version>();
            }
            return this.version;
        }

        /**
         * Gets the value of the part property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the part property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPart().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Routing.Part }
         * 
         * 
         */
        public List<Ufinterface.Routing.Part> getPart() {
            if (part == null) {
                part = new ArrayList<Ufinterface.Routing.Part>();
            }
            return this.part;
        }

        /**
         * Gets the value of the routingDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routingDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoutingDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Routing.RoutingDetail }
         * 
         * 
         */
        public List<Ufinterface.Routing.RoutingDetail> getRoutingDetail() {
            if (routingDetail == null) {
                routingDetail = new ArrayList<Ufinterface.Routing.RoutingDetail>();
            }
            return this.routingDetail;
        }

        /**
         * Gets the value of the routingInsp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routingInsp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoutingInsp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Routing.RoutingInsp }
         * 
         * 
         */
        public List<Ufinterface.Routing.RoutingInsp> getRoutingInsp() {
            if (routingInsp == null) {
                routingInsp = new ArrayList<Ufinterface.Routing.RoutingInsp>();
            }
            return this.routingInsp;
        }

        /**
         * Gets the value of the routingRes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the routingRes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoutingRes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Routing.RoutingRes }
         * 
         * 
         */
        public List<Ufinterface.Routing.RoutingRes> getRoutingRes() {
            if (routingRes == null) {
                routingRes = new ArrayList<Ufinterface.Routing.RoutingRes>();
            }
            return this.routingRes;
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
         *         &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PartId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "pRoutingId",
            "partId",
            "invCode",
            "free1",
            "free2",
            "free3",
            "free4",
            "free5",
            "free6",
            "free7",
            "free8",
            "free9",
            "free10"
        })
        public static class Part {

            @XmlElement(name = "PRoutingId")
            protected String pRoutingId;
            @XmlElement(name = "PartId")
            protected String partId;
            @XmlElement(name = "InvCode")
            protected String invCode;
            @XmlElement(name = "Free1")
            protected String free1;
            @XmlElement(name = "Free2")
            protected String free2;
            @XmlElement(name = "Free3")
            protected String free3;
            @XmlElement(name = "Free4")
            protected String free4;
            @XmlElement(name = "Free5")
            protected String free5;
            @XmlElement(name = "Free6")
            protected String free6;
            @XmlElement(name = "Free7")
            protected String free7;
            @XmlElement(name = "Free8")
            protected String free8;
            @XmlElement(name = "Free9")
            protected String free9;
            @XmlElement(name = "Free10")
            protected String free10;

            /**
             * 获取pRoutingId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutingId() {
                return pRoutingId;
            }

            /**
             * 设置pRoutingId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutingId(String value) {
                this.pRoutingId = value;
            }

            /**
             * 获取partId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPartId() {
                return partId;
            }

            /**
             * 设置partId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPartId(String value) {
                this.partId = value;
            }

            /**
             * 获取invCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvCode() {
                return invCode;
            }

            /**
             * 设置invCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvCode(String value) {
                this.invCode = value;
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
         *         &lt;element name="PRoutingDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OpSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SVendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RltOptionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LtPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRoutinginspId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReportFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BFFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FeeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PlanSubFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DeliveryDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AuxUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "pRoutingDId",
            "pRoutingId",
            "opSeq",
            "operationCode",
            "description",
            "wcCode",
            "effBegDate",
            "effEndDate",
            "subFlag",
            "sVendorCode",
            "rltOptionFlag",
            "ltPercent",
            "remark",
            "pRoutinginspId",
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
            "reportFlag",
            "bfFlag",
            "feeFlag",
            "planSubFlag",
            "deliveryDays",
            "auxUnitCode",
            "changeRate"
        })
        public static class RoutingDetail {

            @XmlElement(name = "PRoutingDId")
            protected String pRoutingDId;
            @XmlElement(name = "PRoutingId")
            protected String pRoutingId;
            @XmlElement(name = "OpSeq")
            protected String opSeq;
            @XmlElement(name = "OperationCode")
            protected String operationCode;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "WcCode")
            protected String wcCode;
            @XmlElement(name = "EffBegDate")
            protected String effBegDate;
            @XmlElement(name = "EffEndDate")
            protected String effEndDate;
            @XmlElement(name = "SubFlag")
            protected String subFlag;
            @XmlElement(name = "SVendorCode")
            protected String sVendorCode;
            @XmlElement(name = "RltOptionFlag")
            protected String rltOptionFlag;
            @XmlElement(name = "LtPercent")
            protected String ltPercent;
            @XmlElement(name = "Remark")
            protected String remark;
            @XmlElement(name = "PRoutinginspId")
            protected String pRoutinginspId;
            @XmlElement(name = "Define22")
            protected String define22;
            @XmlElement(name = "Define23")
            protected String define23;
            @XmlElement(name = "Define24")
            protected String define24;
            @XmlElement(name = "Define25")
            protected String define25;
            @XmlElement(name = "Define26")
            protected String define26;
            @XmlElement(name = "Define27")
            protected String define27;
            @XmlElement(name = "Define28")
            protected String define28;
            @XmlElement(name = "Define29")
            protected String define29;
            @XmlElement(name = "Define30")
            protected String define30;
            @XmlElement(name = "Define31")
            protected String define31;
            @XmlElement(name = "Define32")
            protected String define32;
            @XmlElement(name = "Define33")
            protected String define33;
            @XmlElement(name = "Define34")
            protected String define34;
            @XmlElement(name = "Define35")
            protected String define35;
            @XmlElement(name = "Define36")
            protected String define36;
            @XmlElement(name = "Define37")
            protected String define37;
            @XmlElement(name = "ReportFlag")
            protected String reportFlag;
            @XmlElement(name = "BFFlag")
            protected String bfFlag;
            @XmlElement(name = "FeeFlag")
            protected String feeFlag;
            @XmlElement(name = "PlanSubFlag")
            protected String planSubFlag;
            @XmlElement(name = "DeliveryDays")
            protected String deliveryDays;
            @XmlElement(name = "AuxUnitCode")
            protected String auxUnitCode;
            @XmlElement(name = "ChangeRate")
            protected String changeRate;

            /**
             * 获取pRoutingDId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutingDId() {
                return pRoutingDId;
            }

            /**
             * 设置pRoutingDId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutingDId(String value) {
                this.pRoutingDId = value;
            }

            /**
             * 获取pRoutingId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutingId() {
                return pRoutingId;
            }

            /**
             * 设置pRoutingId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutingId(String value) {
                this.pRoutingId = value;
            }

            /**
             * 获取opSeq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpSeq() {
                return opSeq;
            }

            /**
             * 设置opSeq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpSeq(String value) {
                this.opSeq = value;
            }

            /**
             * 获取operationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationCode() {
                return operationCode;
            }

            /**
             * 设置operationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationCode(String value) {
                this.operationCode = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * 获取wcCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWcCode() {
                return wcCode;
            }

            /**
             * 设置wcCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWcCode(String value) {
                this.wcCode = value;
            }

            /**
             * 获取effBegDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffBegDate() {
                return effBegDate;
            }

            /**
             * 设置effBegDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffBegDate(String value) {
                this.effBegDate = value;
            }

            /**
             * 获取effEndDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffEndDate() {
                return effEndDate;
            }

            /**
             * 设置effEndDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffEndDate(String value) {
                this.effEndDate = value;
            }

            /**
             * 获取subFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubFlag() {
                return subFlag;
            }

            /**
             * 设置subFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubFlag(String value) {
                this.subFlag = value;
            }

            /**
             * 获取sVendorCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSVendorCode() {
                return sVendorCode;
            }

            /**
             * 设置sVendorCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSVendorCode(String value) {
                this.sVendorCode = value;
            }

            /**
             * 获取rltOptionFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRltOptionFlag() {
                return rltOptionFlag;
            }

            /**
             * 设置rltOptionFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRltOptionFlag(String value) {
                this.rltOptionFlag = value;
            }

            /**
             * 获取ltPercent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLtPercent() {
                return ltPercent;
            }

            /**
             * 设置ltPercent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLtPercent(String value) {
                this.ltPercent = value;
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
             * 获取pRoutinginspId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutinginspId() {
                return pRoutinginspId;
            }

            /**
             * 设置pRoutinginspId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutinginspId(String value) {
                this.pRoutinginspId = value;
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
             * 获取reportFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportFlag() {
                return reportFlag;
            }

            /**
             * 设置reportFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportFlag(String value) {
                this.reportFlag = value;
            }

            /**
             * 获取bfFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBFFlag() {
                return bfFlag;
            }

            /**
             * 设置bfFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBFFlag(String value) {
                this.bfFlag = value;
            }

            /**
             * 获取feeFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeeFlag() {
                return feeFlag;
            }

            /**
             * 设置feeFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeeFlag(String value) {
                this.feeFlag = value;
            }

            /**
             * 获取planSubFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanSubFlag() {
                return planSubFlag;
            }

            /**
             * 设置planSubFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanSubFlag(String value) {
                this.planSubFlag = value;
            }

            /**
             * 获取deliveryDays属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeliveryDays() {
                return deliveryDays;
            }

            /**
             * 设置deliveryDays属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeliveryDays(String value) {
                this.deliveryDays = value;
            }

            /**
             * 获取auxUnitCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuxUnitCode() {
                return auxUnitCode;
            }

            /**
             * 设置auxUnitCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuxUnitCode(String value) {
                this.auxUnitCode = value;
            }

            /**
             * 获取changeRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangeRate() {
                return changeRate;
            }

            /**
             * 设置changeRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangeRate(String value) {
                this.changeRate = value;
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
         *         &lt;element name="PRoutinginspId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="QtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DtMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DtRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DtNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DtStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DtUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="QtLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="QcProjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AqlVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CruleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ItestRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OpTransType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "pRoutinginspId",
            "qtMethod",
            "dtMethod",
            "dtRate",
            "dtNum",
            "dtStyle",
            "dtUnit",
            "qtLevel",
            "qcProjectCode",
            "aqlVal",
            "cruleCode",
            "itestRule",
            "opTransType"
        })
        public static class RoutingInsp {

            @XmlElement(name = "PRoutinginspId")
            protected String pRoutinginspId;
            @XmlElement(name = "QtMethod")
            protected String qtMethod;
            @XmlElement(name = "DtMethod")
            protected String dtMethod;
            @XmlElement(name = "DtRate")
            protected String dtRate;
            @XmlElement(name = "DtNum")
            protected String dtNum;
            @XmlElement(name = "DtStyle")
            protected String dtStyle;
            @XmlElement(name = "DtUnit")
            protected String dtUnit;
            @XmlElement(name = "QtLevel")
            protected String qtLevel;
            @XmlElement(name = "QcProjectCode")
            protected String qcProjectCode;
            @XmlElement(name = "AqlVal")
            protected String aqlVal;
            @XmlElement(name = "CruleCode")
            protected String cruleCode;
            @XmlElement(name = "ItestRule")
            protected String itestRule;
            @XmlElement(name = "OpTransType")
            protected String opTransType;

            /**
             * 获取pRoutinginspId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutinginspId() {
                return pRoutinginspId;
            }

            /**
             * 设置pRoutinginspId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutinginspId(String value) {
                this.pRoutinginspId = value;
            }

            /**
             * 获取qtMethod属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQtMethod() {
                return qtMethod;
            }

            /**
             * 设置qtMethod属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQtMethod(String value) {
                this.qtMethod = value;
            }

            /**
             * 获取dtMethod属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtMethod() {
                return dtMethod;
            }

            /**
             * 设置dtMethod属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtMethod(String value) {
                this.dtMethod = value;
            }

            /**
             * 获取dtRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtRate() {
                return dtRate;
            }

            /**
             * 设置dtRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtRate(String value) {
                this.dtRate = value;
            }

            /**
             * 获取dtNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtNum() {
                return dtNum;
            }

            /**
             * 设置dtNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtNum(String value) {
                this.dtNum = value;
            }

            /**
             * 获取dtStyle属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtStyle() {
                return dtStyle;
            }

            /**
             * 设置dtStyle属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtStyle(String value) {
                this.dtStyle = value;
            }

            /**
             * 获取dtUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtUnit() {
                return dtUnit;
            }

            /**
             * 设置dtUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtUnit(String value) {
                this.dtUnit = value;
            }

            /**
             * 获取qtLevel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQtLevel() {
                return qtLevel;
            }

            /**
             * 设置qtLevel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQtLevel(String value) {
                this.qtLevel = value;
            }

            /**
             * 获取qcProjectCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQcProjectCode() {
                return qcProjectCode;
            }

            /**
             * 设置qcProjectCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQcProjectCode(String value) {
                this.qcProjectCode = value;
            }

            /**
             * 获取aqlVal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAqlVal() {
                return aqlVal;
            }

            /**
             * 设置aqlVal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAqlVal(String value) {
                this.aqlVal = value;
            }

            /**
             * 获取cruleCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCruleCode() {
                return cruleCode;
            }

            /**
             * 设置cruleCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCruleCode(String value) {
                this.cruleCode = value;
            }

            /**
             * 获取itestRule属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItestRule() {
                return itestRule;
            }

            /**
             * 设置itestRule属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItestRule(String value) {
                this.itestRule = value;
            }

            /**
             * 获取opTransType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpTransType() {
                return opTransType;
            }

            /**
             * 设置opTransType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpTransType(String value) {
                this.opTransType = value;
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
         *         &lt;element name="PRoutingResId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PRoutingDId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ResSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ResCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseQtyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PlanFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ResActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ResQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "pRoutingResId",
            "pRoutingDId",
            "resSeq",
            "resCode",
            "baseType",
            "baseQtyN",
            "baseQtyD",
            "planFlag",
            "resActivity",
            "resQty",
            "effRate",
            "feeType"
        })
        public static class RoutingRes {

            @XmlElement(name = "PRoutingResId")
            protected String pRoutingResId;
            @XmlElement(name = "PRoutingDId")
            protected String pRoutingDId;
            @XmlElement(name = "ResSeq")
            protected String resSeq;
            @XmlElement(name = "ResCode")
            protected String resCode;
            @XmlElement(name = "BaseType")
            protected String baseType;
            @XmlElement(name = "BaseQtyN")
            protected String baseQtyN;
            @XmlElement(name = "BaseQtyD")
            protected String baseQtyD;
            @XmlElement(name = "PlanFlag")
            protected String planFlag;
            @XmlElement(name = "ResActivity")
            protected String resActivity;
            @XmlElement(name = "ResQty")
            protected String resQty;
            @XmlElement(name = "EffRate")
            protected String effRate;
            @XmlElement(name = "FeeType")
            protected String feeType;

            /**
             * 获取pRoutingResId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutingResId() {
                return pRoutingResId;
            }

            /**
             * 设置pRoutingResId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutingResId(String value) {
                this.pRoutingResId = value;
            }

            /**
             * 获取pRoutingDId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRoutingDId() {
                return pRoutingDId;
            }

            /**
             * 设置pRoutingDId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRoutingDId(String value) {
                this.pRoutingDId = value;
            }

            /**
             * 获取resSeq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResSeq() {
                return resSeq;
            }

            /**
             * 设置resSeq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResSeq(String value) {
                this.resSeq = value;
            }

            /**
             * 获取resCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResCode() {
                return resCode;
            }

            /**
             * 设置resCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResCode(String value) {
                this.resCode = value;
            }

            /**
             * 获取baseType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseType() {
                return baseType;
            }

            /**
             * 设置baseType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseType(String value) {
                this.baseType = value;
            }

            /**
             * 获取baseQtyN属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseQtyN() {
                return baseQtyN;
            }

            /**
             * 设置baseQtyN属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseQtyN(String value) {
                this.baseQtyN = value;
            }

            /**
             * 获取baseQtyD属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseQtyD() {
                return baseQtyD;
            }

            /**
             * 设置baseQtyD属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseQtyD(String value) {
                this.baseQtyD = value;
            }

            /**
             * 获取planFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanFlag() {
                return planFlag;
            }

            /**
             * 设置planFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanFlag(String value) {
                this.planFlag = value;
            }

            /**
             * 获取resActivity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResActivity() {
                return resActivity;
            }

            /**
             * 设置resActivity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResActivity(String value) {
                this.resActivity = value;
            }

            /**
             * 获取resQty属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResQty() {
                return resQty;
            }

            /**
             * 设置resQty属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResQty(String value) {
                this.resQty = value;
            }

            /**
             * 获取effRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffRate() {
                return effRate;
            }

            /**
             * 设置effRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffRate(String value) {
                this.effRate = value;
            }

            /**
             * 获取feeType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeeType() {
                return feeType;
            }

            /**
             * 设置feeType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeeType(String value) {
                this.feeType = value;
            }

        }

    }

}
