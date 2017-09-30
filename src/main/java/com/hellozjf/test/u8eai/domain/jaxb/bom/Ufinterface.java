//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:15 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.bom;

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
 *         &lt;element name="Bom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Version" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Parent" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="ParentScrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OpSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FVFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BaseQtyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CompScrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ByproductFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AuxUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ChangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AuxBaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ComponentOpt" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="WIPType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AccuCostFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DrawDeptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OptionalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MutexRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PlanFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ComponentSub" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ComponentSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ComponentRmk" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RemarkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ComponentLoc" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bom"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "Bom")
    protected List<Ufinterface.Bom> bom;
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
     * Gets the value of the bom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Bom }
     * 
     * 
     */
    public List<Ufinterface.Bom> getBom() {
        if (bom == null) {
            bom = new ArrayList<Ufinterface.Bom>();
        }
        return this.bom;
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
     *         &lt;element name="Parent" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="ParentScrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Component" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OpSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FVFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BaseQtyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CompScrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ByproductFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AuxUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AuxBaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ComponentOpt" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="WIPType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AccuCostFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DrawDeptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OptionalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MutexRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PlanFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ComponentSub" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ComponentSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ComponentRmk" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RemarkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ComponentLoc" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "parent",
        "component",
        "componentOpt",
        "componentSub",
        "componentRmk",
        "componentLoc"
    })
    public static class Bom {

        @XmlElement(name = "Version")
        protected List<Version> version;
        @XmlElement(name = "Parent")
        protected List<Ufinterface.Bom.Parent> parent;
        @XmlElement(name = "Component")
        protected List<Ufinterface.Bom.Component> component;
        @XmlElement(name = "ComponentOpt")
        protected List<Ufinterface.Bom.ComponentOpt> componentOpt;
        @XmlElement(name = "ComponentSub")
        protected List<Ufinterface.Bom.ComponentSub> componentSub;
        @XmlElement(name = "ComponentRmk")
        protected List<Ufinterface.Bom.ComponentRmk> componentRmk;
        @XmlElement(name = "ComponentLoc")
        protected List<Ufinterface.Bom.ComponentLoc> componentLoc;

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
         * Gets the value of the parent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Bom.Parent }
         * 
         * 
         */
        public List<Ufinterface.Bom.Parent> getParent() {
            if (parent == null) {
                parent = new ArrayList<Ufinterface.Bom.Parent>();
            }
            return this.parent;
        }

        /**
         * Gets the value of the component property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the component property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Bom.Component }
         * 
         * 
         */
        public List<Ufinterface.Bom.Component> getComponent() {
            if (component == null) {
                component = new ArrayList<Ufinterface.Bom.Component>();
            }
            return this.component;
        }

        /**
         * Gets the value of the componentOpt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componentOpt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponentOpt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Bom.ComponentOpt }
         * 
         * 
         */
        public List<Ufinterface.Bom.ComponentOpt> getComponentOpt() {
            if (componentOpt == null) {
                componentOpt = new ArrayList<Ufinterface.Bom.ComponentOpt>();
            }
            return this.componentOpt;
        }

        /**
         * Gets the value of the componentSub property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componentSub property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponentSub().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Bom.ComponentSub }
         * 
         * 
         */
        public List<Ufinterface.Bom.ComponentSub> getComponentSub() {
            if (componentSub == null) {
                componentSub = new ArrayList<Ufinterface.Bom.ComponentSub>();
            }
            return this.componentSub;
        }

        /**
         * Gets the value of the componentRmk property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componentRmk property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponentRmk().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Bom.ComponentRmk }
         * 
         * 
         */
        public List<Ufinterface.Bom.ComponentRmk> getComponentRmk() {
            if (componentRmk == null) {
                componentRmk = new ArrayList<Ufinterface.Bom.ComponentRmk>();
            }
            return this.componentRmk;
        }

        /**
         * Gets the value of the componentLoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the componentLoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponentLoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Bom.ComponentLoc }
         * 
         * 
         */
        public List<Ufinterface.Bom.ComponentLoc> getComponentLoc() {
            if (componentLoc == null) {
                componentLoc = new ArrayList<Ufinterface.Bom.ComponentLoc>();
            }
            return this.componentLoc;
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
         *         &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OpSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FVFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BaseQtyD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CompScrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ByproductFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AuxUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AuxBaseQtyN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "opComponentId",
            "bomId",
            "sortSeq",
            "opSeq",
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
            "free10",
            "effBegDate",
            "effEndDate",
            "fvFlag",
            "baseQtyN",
            "baseQtyD",
            "compScrap",
            "byproductFlag",
            "optionsId",
            "auxUnitCode",
            "changeRate",
            "auxBaseQtyN",
            "productType",
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
            "define37"
        })
        public static class Component {

            @XmlElement(name = "OpComponentId")
            protected String opComponentId;
            @XmlElement(name = "BomId")
            protected String bomId;
            @XmlElement(name = "SortSeq")
            protected String sortSeq;
            @XmlElement(name = "OpSeq")
            protected String opSeq;
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
            @XmlElement(name = "EffBegDate")
            protected String effBegDate;
            @XmlElement(name = "EffEndDate")
            protected String effEndDate;
            @XmlElement(name = "FVFlag")
            protected String fvFlag;
            @XmlElement(name = "BaseQtyN")
            protected String baseQtyN;
            @XmlElement(name = "BaseQtyD")
            protected String baseQtyD;
            @XmlElement(name = "CompScrap")
            protected String compScrap;
            @XmlElement(name = "ByproductFlag")
            protected String byproductFlag;
            @XmlElement(name = "OptionsId")
            protected String optionsId;
            @XmlElement(name = "AuxUnitCode")
            protected String auxUnitCode;
            @XmlElement(name = "ChangeRate")
            protected String changeRate;
            @XmlElement(name = "AuxBaseQtyN")
            protected String auxBaseQtyN;
            @XmlElement(name = "ProductType")
            protected String productType;
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

            /**
             * 获取opComponentId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpComponentId() {
                return opComponentId;
            }

            /**
             * 设置opComponentId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpComponentId(String value) {
                this.opComponentId = value;
            }

            /**
             * 获取bomId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBomId() {
                return bomId;
            }

            /**
             * 设置bomId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBomId(String value) {
                this.bomId = value;
            }

            /**
             * 获取sortSeq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortSeq() {
                return sortSeq;
            }

            /**
             * 设置sortSeq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortSeq(String value) {
                this.sortSeq = value;
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
             * 获取fvFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFVFlag() {
                return fvFlag;
            }

            /**
             * 设置fvFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFVFlag(String value) {
                this.fvFlag = value;
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
             * 获取compScrap属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompScrap() {
                return compScrap;
            }

            /**
             * 设置compScrap属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompScrap(String value) {
                this.compScrap = value;
            }

            /**
             * 获取byproductFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getByproductFlag() {
                return byproductFlag;
            }

            /**
             * 设置byproductFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setByproductFlag(String value) {
                this.byproductFlag = value;
            }

            /**
             * 获取optionsId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptionsId() {
                return optionsId;
            }

            /**
             * 设置optionsId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptionsId(String value) {
                this.optionsId = value;
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

            /**
             * 获取auxBaseQtyN属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuxBaseQtyN() {
                return auxBaseQtyN;
            }

            /**
             * 设置auxBaseQtyN属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuxBaseQtyN(String value) {
                this.auxBaseQtyN = value;
            }

            /**
             * 获取productType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductType() {
                return productType;
            }

            /**
             * 设置productType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductType(String value) {
                this.productType = value;
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
         *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Loc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "locationId",
            "opComponentId",
            "sortSeq",
            "loc"
        })
        public static class ComponentLoc {

            @XmlElement(name = "LocationId")
            protected String locationId;
            @XmlElement(name = "OpComponentId")
            protected String opComponentId;
            @XmlElement(name = "SortSeq")
            protected String sortSeq;
            @XmlElement(name = "Loc")
            protected String loc;

            /**
             * 获取locationId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationId() {
                return locationId;
            }

            /**
             * 设置locationId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationId(String value) {
                this.locationId = value;
            }

            /**
             * 获取opComponentId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpComponentId() {
                return opComponentId;
            }

            /**
             * 设置opComponentId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpComponentId(String value) {
                this.opComponentId = value;
            }

            /**
             * 获取sortSeq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortSeq() {
                return sortSeq;
            }

            /**
             * 设置sortSeq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortSeq(String value) {
                this.sortSeq = value;
            }

            /**
             * 获取loc属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLoc() {
                return loc;
            }

            /**
             * 设置loc属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLoc(String value) {
                this.loc = value;
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
         *         &lt;element name="OptionsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="WIPType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AccuCostFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DrawDeptCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Whcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OptionalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MutexRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PlanFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "optionsId",
            "offset",
            "wipType",
            "accuCostFlag",
            "drawDeptCode",
            "whcode",
            "optionalFlag",
            "mutexRule",
            "planFactor"
        })
        public static class ComponentOpt {

            @XmlElement(name = "OptionsId")
            protected String optionsId;
            @XmlElement(name = "Offset")
            protected String offset;
            @XmlElement(name = "WIPType")
            protected String wipType;
            @XmlElement(name = "AccuCostFlag")
            protected String accuCostFlag;
            @XmlElement(name = "DrawDeptCode")
            protected String drawDeptCode;
            @XmlElement(name = "Whcode")
            protected String whcode;
            @XmlElement(name = "OptionalFlag")
            protected String optionalFlag;
            @XmlElement(name = "MutexRule")
            protected String mutexRule;
            @XmlElement(name = "PlanFactor")
            protected String planFactor;

            /**
             * 获取optionsId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptionsId() {
                return optionsId;
            }

            /**
             * 设置optionsId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptionsId(String value) {
                this.optionsId = value;
            }

            /**
             * 获取offset属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffset() {
                return offset;
            }

            /**
             * 设置offset属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffset(String value) {
                this.offset = value;
            }

            /**
             * 获取wipType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWIPType() {
                return wipType;
            }

            /**
             * 设置wipType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWIPType(String value) {
                this.wipType = value;
            }

            /**
             * 获取accuCostFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccuCostFlag() {
                return accuCostFlag;
            }

            /**
             * 设置accuCostFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccuCostFlag(String value) {
                this.accuCostFlag = value;
            }

            /**
             * 获取drawDeptCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrawDeptCode() {
                return drawDeptCode;
            }

            /**
             * 设置drawDeptCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrawDeptCode(String value) {
                this.drawDeptCode = value;
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
             * 获取optionalFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptionalFlag() {
                return optionalFlag;
            }

            /**
             * 设置optionalFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptionalFlag(String value) {
                this.optionalFlag = value;
            }

            /**
             * 获取mutexRule属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMutexRule() {
                return mutexRule;
            }

            /**
             * 设置mutexRule属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMutexRule(String value) {
                this.mutexRule = value;
            }

            /**
             * 获取planFactor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanFactor() {
                return planFactor;
            }

            /**
             * 设置planFactor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanFactor(String value) {
                this.planFactor = value;
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
         *         &lt;element name="RemarkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SortSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "remarkId",
            "opComponentId",
            "sortSeq",
            "remark"
        })
        public static class ComponentRmk {

            @XmlElement(name = "RemarkId")
            protected String remarkId;
            @XmlElement(name = "OpComponentId")
            protected String opComponentId;
            @XmlElement(name = "SortSeq")
            protected String sortSeq;
            @XmlElement(name = "Remark")
            protected String remark;

            /**
             * 获取remarkId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemarkId() {
                return remarkId;
            }

            /**
             * 设置remarkId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemarkId(String value) {
                this.remarkId = value;
            }

            /**
             * 获取opComponentId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpComponentId() {
                return opComponentId;
            }

            /**
             * 设置opComponentId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpComponentId(String value) {
                this.opComponentId = value;
            }

            /**
             * 获取sortSeq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSortSeq() {
                return sortSeq;
            }

            /**
             * 设置sortSeq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSortSeq(String value) {
                this.sortSeq = value;
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
         *         &lt;element name="ComponentSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OpComponentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="Factor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffBegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EffEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "componentSubId",
            "opComponentId",
            "sequence",
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
            "free10",
            "factor",
            "effBegDate",
            "effEndDate"
        })
        public static class ComponentSub {

            @XmlElement(name = "ComponentSubId")
            protected String componentSubId;
            @XmlElement(name = "OpComponentId")
            protected String opComponentId;
            @XmlElement(name = "Sequence")
            protected String sequence;
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
            @XmlElement(name = "Factor")
            protected String factor;
            @XmlElement(name = "EffBegDate")
            protected String effBegDate;
            @XmlElement(name = "EffEndDate")
            protected String effEndDate;

            /**
             * 获取componentSubId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComponentSubId() {
                return componentSubId;
            }

            /**
             * 设置componentSubId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComponentSubId(String value) {
                this.componentSubId = value;
            }

            /**
             * 获取opComponentId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpComponentId() {
                return opComponentId;
            }

            /**
             * 设置opComponentId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpComponentId(String value) {
                this.opComponentId = value;
            }

            /**
             * 获取sequence属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSequence() {
                return sequence;
            }

            /**
             * 设置sequence属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSequence(String value) {
                this.sequence = value;
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

            /**
             * 获取factor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFactor() {
                return factor;
            }

            /**
             * 设置factor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFactor(String value) {
                this.factor = value;
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
         *         &lt;element name="BomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="ParentScrap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "bomId",
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
            "free10",
            "parentScrap"
        })
        public static class Parent {

            @XmlElement(name = "BomId")
            protected String bomId;
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
            @XmlElement(name = "ParentScrap")
            protected String parentScrap;

            /**
             * 获取bomId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBomId() {
                return bomId;
            }

            /**
             * 设置bomId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBomId(String value) {
                this.bomId = value;
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

            /**
             * 获取parentScrap属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParentScrap() {
                return parentScrap;
            }

            /**
             * 设置parentScrap属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParentScrap(String value) {
                this.parentScrap = value;
            }

        }

    }

}
