//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:52 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.sa_invpricejust;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="saleinvpricejust" maxOccurs="unbounded" minOccurs="0">
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
 *                             &lt;element name="ddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cmaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cpersoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cmainmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="operationtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ipriceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cfree10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iuprice10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="isaleprice10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cdefine37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dstartdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="denddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fminquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cbodymemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="iinvscost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bsales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "saleinvpricejust"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Saleinvpricejust> saleinvpricejust;
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
     * Gets the value of the saleinvpricejust property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleinvpricejust property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleinvpricejust().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Saleinvpricejust }
     * 
     * 
     */
    public List<Ufinterface.Saleinvpricejust> getSaleinvpricejust() {
        if (saleinvpricejust == null) {
            saleinvpricejust = new ArrayList<Ufinterface.Saleinvpricejust>();
        }
        return this.saleinvpricejust;
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
     *                   &lt;element name="ddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cmaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cpersoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cmainmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="operationtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ipriceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cfree10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iuprice10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="isaleprice10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cdefine37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dstartdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="denddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fminquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cbodymemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="iinvscost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bsales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class Saleinvpricejust {

        protected List<Ufinterface.Saleinvpricejust.Header> header;
        protected List<Ufinterface.Saleinvpricejust.Body> body;

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
         * {@link Ufinterface.Saleinvpricejust.Header }
         * 
         * 
         */
        public List<Ufinterface.Saleinvpricejust.Header> getHeader() {
            if (header == null) {
                header = new ArrayList<Ufinterface.Saleinvpricejust.Header>();
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
         * {@link Ufinterface.Saleinvpricejust.Body }
         * 
         * 
         */
        public List<Ufinterface.Saleinvpricejust.Body> getBody() {
            if (body == null) {
                body = new ArrayList<Ufinterface.Saleinvpricejust.Body>();
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
         *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="operationtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ipriceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cfree10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iuprice10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="isaleprice10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dstartdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="denddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fminquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cbodymemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="iinvscost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bsales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "operationtype",
            "ipriceid",
            "cinvcode",
            "cfree1",
            "cfree2",
            "cfree3",
            "cfree4",
            "cfree5",
            "cfree6",
            "cfree7",
            "cfree8",
            "cfree9",
            "cfree10",
            "iuprice1",
            "isaleprice1",
            "iuprice2",
            "isaleprice2",
            "iuprice3",
            "isaleprice3",
            "iuprice4",
            "isaleprice4",
            "iuprice5",
            "isaleprice5",
            "iuprice6",
            "isaleprice6",
            "iuprice7",
            "isaleprice7",
            "iuprice8",
            "isaleprice8",
            "iuprice9",
            "isaleprice9",
            "iuprice10",
            "isaleprice10",
            "cdefine22",
            "cdefine23",
            "cdefine24",
            "cdefine25",
            "cdefine26",
            "cdefine27",
            "cdefine28",
            "cdefine29",
            "cdefine30",
            "cdefine31",
            "cdefine32",
            "cdefine33",
            "cdefine34",
            "cdefine35",
            "cdefine36",
            "cdefine37",
            "dstartdate",
            "denddate",
            "fminquantity",
            "cbodymemo",
            "iinvscost",
            "bsales"
        })
        public static class Body {

            protected String id;
            protected String operationtype;
            protected String ipriceid;
            protected String cinvcode;
            protected String cfree1;
            protected String cfree2;
            protected String cfree3;
            protected String cfree4;
            protected String cfree5;
            protected String cfree6;
            protected String cfree7;
            protected String cfree8;
            protected String cfree9;
            protected String cfree10;
            protected String iuprice1;
            protected String isaleprice1;
            protected String iuprice2;
            protected String isaleprice2;
            protected String iuprice3;
            protected String isaleprice3;
            protected String iuprice4;
            protected String isaleprice4;
            protected String iuprice5;
            protected String isaleprice5;
            protected String iuprice6;
            protected String isaleprice6;
            protected String iuprice7;
            protected String isaleprice7;
            protected String iuprice8;
            protected String isaleprice8;
            protected String iuprice9;
            protected String isaleprice9;
            protected String iuprice10;
            protected String isaleprice10;
            protected String cdefine22;
            protected String cdefine23;
            protected String cdefine24;
            protected String cdefine25;
            protected String cdefine26;
            protected String cdefine27;
            protected String cdefine28;
            protected String cdefine29;
            protected String cdefine30;
            protected String cdefine31;
            protected String cdefine32;
            protected String cdefine33;
            protected String cdefine34;
            protected String cdefine35;
            protected String cdefine36;
            protected String cdefine37;
            protected String dstartdate;
            protected String denddate;
            protected String fminquantity;
            protected String cbodymemo;
            protected String iinvscost;
            protected String bsales;

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
             * 获取operationtype属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperationtype() {
                return operationtype;
            }

            /**
             * 设置operationtype属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperationtype(String value) {
                this.operationtype = value;
            }

            /**
             * 获取ipriceid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIpriceid() {
                return ipriceid;
            }

            /**
             * 设置ipriceid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIpriceid(String value) {
                this.ipriceid = value;
            }

            /**
             * 获取cinvcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCinvcode() {
                return cinvcode;
            }

            /**
             * 设置cinvcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCinvcode(String value) {
                this.cinvcode = value;
            }

            /**
             * 获取cfree1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree1() {
                return cfree1;
            }

            /**
             * 设置cfree1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree1(String value) {
                this.cfree1 = value;
            }

            /**
             * 获取cfree2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree2() {
                return cfree2;
            }

            /**
             * 设置cfree2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree2(String value) {
                this.cfree2 = value;
            }

            /**
             * 获取cfree3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree3() {
                return cfree3;
            }

            /**
             * 设置cfree3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree3(String value) {
                this.cfree3 = value;
            }

            /**
             * 获取cfree4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree4() {
                return cfree4;
            }

            /**
             * 设置cfree4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree4(String value) {
                this.cfree4 = value;
            }

            /**
             * 获取cfree5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree5() {
                return cfree5;
            }

            /**
             * 设置cfree5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree5(String value) {
                this.cfree5 = value;
            }

            /**
             * 获取cfree6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree6() {
                return cfree6;
            }

            /**
             * 设置cfree6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree6(String value) {
                this.cfree6 = value;
            }

            /**
             * 获取cfree7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree7() {
                return cfree7;
            }

            /**
             * 设置cfree7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree7(String value) {
                this.cfree7 = value;
            }

            /**
             * 获取cfree8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree8() {
                return cfree8;
            }

            /**
             * 设置cfree8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree8(String value) {
                this.cfree8 = value;
            }

            /**
             * 获取cfree9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree9() {
                return cfree9;
            }

            /**
             * 设置cfree9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree9(String value) {
                this.cfree9 = value;
            }

            /**
             * 获取cfree10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCfree10() {
                return cfree10;
            }

            /**
             * 设置cfree10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCfree10(String value) {
                this.cfree10 = value;
            }

            /**
             * 获取iuprice1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice1() {
                return iuprice1;
            }

            /**
             * 设置iuprice1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice1(String value) {
                this.iuprice1 = value;
            }

            /**
             * 获取isaleprice1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice1() {
                return isaleprice1;
            }

            /**
             * 设置isaleprice1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice1(String value) {
                this.isaleprice1 = value;
            }

            /**
             * 获取iuprice2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice2() {
                return iuprice2;
            }

            /**
             * 设置iuprice2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice2(String value) {
                this.iuprice2 = value;
            }

            /**
             * 获取isaleprice2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice2() {
                return isaleprice2;
            }

            /**
             * 设置isaleprice2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice2(String value) {
                this.isaleprice2 = value;
            }

            /**
             * 获取iuprice3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice3() {
                return iuprice3;
            }

            /**
             * 设置iuprice3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice3(String value) {
                this.iuprice3 = value;
            }

            /**
             * 获取isaleprice3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice3() {
                return isaleprice3;
            }

            /**
             * 设置isaleprice3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice3(String value) {
                this.isaleprice3 = value;
            }

            /**
             * 获取iuprice4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice4() {
                return iuprice4;
            }

            /**
             * 设置iuprice4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice4(String value) {
                this.iuprice4 = value;
            }

            /**
             * 获取isaleprice4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice4() {
                return isaleprice4;
            }

            /**
             * 设置isaleprice4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice4(String value) {
                this.isaleprice4 = value;
            }

            /**
             * 获取iuprice5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice5() {
                return iuprice5;
            }

            /**
             * 设置iuprice5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice5(String value) {
                this.iuprice5 = value;
            }

            /**
             * 获取isaleprice5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice5() {
                return isaleprice5;
            }

            /**
             * 设置isaleprice5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice5(String value) {
                this.isaleprice5 = value;
            }

            /**
             * 获取iuprice6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice6() {
                return iuprice6;
            }

            /**
             * 设置iuprice6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice6(String value) {
                this.iuprice6 = value;
            }

            /**
             * 获取isaleprice6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice6() {
                return isaleprice6;
            }

            /**
             * 设置isaleprice6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice6(String value) {
                this.isaleprice6 = value;
            }

            /**
             * 获取iuprice7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice7() {
                return iuprice7;
            }

            /**
             * 设置iuprice7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice7(String value) {
                this.iuprice7 = value;
            }

            /**
             * 获取isaleprice7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice7() {
                return isaleprice7;
            }

            /**
             * 设置isaleprice7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice7(String value) {
                this.isaleprice7 = value;
            }

            /**
             * 获取iuprice8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice8() {
                return iuprice8;
            }

            /**
             * 设置iuprice8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice8(String value) {
                this.iuprice8 = value;
            }

            /**
             * 获取isaleprice8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice8() {
                return isaleprice8;
            }

            /**
             * 设置isaleprice8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice8(String value) {
                this.isaleprice8 = value;
            }

            /**
             * 获取iuprice9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice9() {
                return iuprice9;
            }

            /**
             * 设置iuprice9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice9(String value) {
                this.iuprice9 = value;
            }

            /**
             * 获取isaleprice9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice9() {
                return isaleprice9;
            }

            /**
             * 设置isaleprice9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice9(String value) {
                this.isaleprice9 = value;
            }

            /**
             * 获取iuprice10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIuprice10() {
                return iuprice10;
            }

            /**
             * 设置iuprice10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIuprice10(String value) {
                this.iuprice10 = value;
            }

            /**
             * 获取isaleprice10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsaleprice10() {
                return isaleprice10;
            }

            /**
             * 设置isaleprice10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsaleprice10(String value) {
                this.isaleprice10 = value;
            }

            /**
             * 获取cdefine22属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine22() {
                return cdefine22;
            }

            /**
             * 设置cdefine22属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine22(String value) {
                this.cdefine22 = value;
            }

            /**
             * 获取cdefine23属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine23() {
                return cdefine23;
            }

            /**
             * 设置cdefine23属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine23(String value) {
                this.cdefine23 = value;
            }

            /**
             * 获取cdefine24属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine24() {
                return cdefine24;
            }

            /**
             * 设置cdefine24属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine24(String value) {
                this.cdefine24 = value;
            }

            /**
             * 获取cdefine25属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine25() {
                return cdefine25;
            }

            /**
             * 设置cdefine25属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine25(String value) {
                this.cdefine25 = value;
            }

            /**
             * 获取cdefine26属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine26() {
                return cdefine26;
            }

            /**
             * 设置cdefine26属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine26(String value) {
                this.cdefine26 = value;
            }

            /**
             * 获取cdefine27属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine27() {
                return cdefine27;
            }

            /**
             * 设置cdefine27属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine27(String value) {
                this.cdefine27 = value;
            }

            /**
             * 获取cdefine28属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine28() {
                return cdefine28;
            }

            /**
             * 设置cdefine28属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine28(String value) {
                this.cdefine28 = value;
            }

            /**
             * 获取cdefine29属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine29() {
                return cdefine29;
            }

            /**
             * 设置cdefine29属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine29(String value) {
                this.cdefine29 = value;
            }

            /**
             * 获取cdefine30属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine30() {
                return cdefine30;
            }

            /**
             * 设置cdefine30属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine30(String value) {
                this.cdefine30 = value;
            }

            /**
             * 获取cdefine31属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine31() {
                return cdefine31;
            }

            /**
             * 设置cdefine31属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine31(String value) {
                this.cdefine31 = value;
            }

            /**
             * 获取cdefine32属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine32() {
                return cdefine32;
            }

            /**
             * 设置cdefine32属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine32(String value) {
                this.cdefine32 = value;
            }

            /**
             * 获取cdefine33属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine33() {
                return cdefine33;
            }

            /**
             * 设置cdefine33属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine33(String value) {
                this.cdefine33 = value;
            }

            /**
             * 获取cdefine34属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine34() {
                return cdefine34;
            }

            /**
             * 设置cdefine34属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine34(String value) {
                this.cdefine34 = value;
            }

            /**
             * 获取cdefine35属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine35() {
                return cdefine35;
            }

            /**
             * 设置cdefine35属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine35(String value) {
                this.cdefine35 = value;
            }

            /**
             * 获取cdefine36属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine36() {
                return cdefine36;
            }

            /**
             * 设置cdefine36属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine36(String value) {
                this.cdefine36 = value;
            }

            /**
             * 获取cdefine37属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine37() {
                return cdefine37;
            }

            /**
             * 设置cdefine37属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine37(String value) {
                this.cdefine37 = value;
            }

            /**
             * 获取dstartdate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDstartdate() {
                return dstartdate;
            }

            /**
             * 设置dstartdate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDstartdate(String value) {
                this.dstartdate = value;
            }

            /**
             * 获取denddate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDenddate() {
                return denddate;
            }

            /**
             * 设置denddate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDenddate(String value) {
                this.denddate = value;
            }

            /**
             * 获取fminquantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFminquantity() {
                return fminquantity;
            }

            /**
             * 设置fminquantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFminquantity(String value) {
                this.fminquantity = value;
            }

            /**
             * 获取cbodymemo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCbodymemo() {
                return cbodymemo;
            }

            /**
             * 设置cbodymemo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCbodymemo(String value) {
                this.cbodymemo = value;
            }

            /**
             * 获取iinvscost属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIinvscost() {
                return iinvscost;
            }

            /**
             * 设置iinvscost属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIinvscost(String value) {
                this.iinvscost = value;
            }

            /**
             * 获取bsales属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBsales() {
                return bsales;
            }

            /**
             * 设置bsales属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBsales(String value) {
                this.bsales = value;
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
         *         &lt;element name="ddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cmaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cpersoncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cmainmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cdefine16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ddate",
            "ccode",
            "cmaker",
            "cpersoncode",
            "cmainmemo",
            "cdepcode",
            "cdefine1",
            "cdefine2",
            "cdefine3",
            "cdefine4",
            "cdefine5",
            "cdefine6",
            "cdefine7",
            "cdefine8",
            "cdefine9",
            "cdefine10",
            "cdefine11",
            "cdefine12",
            "cdefine13",
            "cdefine14",
            "cdefine15",
            "cdefine16"
        })
        public static class Header {

            protected String id;
            protected String ddate;
            protected String ccode;
            protected String cmaker;
            protected String cpersoncode;
            protected String cmainmemo;
            protected String cdepcode;
            protected String cdefine1;
            protected String cdefine2;
            protected String cdefine3;
            protected String cdefine4;
            protected String cdefine5;
            protected String cdefine6;
            protected String cdefine7;
            protected String cdefine8;
            protected String cdefine9;
            protected String cdefine10;
            protected String cdefine11;
            protected String cdefine12;
            protected String cdefine13;
            protected String cdefine14;
            protected String cdefine15;
            protected String cdefine16;

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
             * 获取ddate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDdate() {
                return ddate;
            }

            /**
             * 设置ddate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDdate(String value) {
                this.ddate = value;
            }

            /**
             * 获取ccode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCcode() {
                return ccode;
            }

            /**
             * 设置ccode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCcode(String value) {
                this.ccode = value;
            }

            /**
             * 获取cmaker属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCmaker() {
                return cmaker;
            }

            /**
             * 设置cmaker属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCmaker(String value) {
                this.cmaker = value;
            }

            /**
             * 获取cpersoncode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpersoncode() {
                return cpersoncode;
            }

            /**
             * 设置cpersoncode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpersoncode(String value) {
                this.cpersoncode = value;
            }

            /**
             * 获取cmainmemo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCmainmemo() {
                return cmainmemo;
            }

            /**
             * 设置cmainmemo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCmainmemo(String value) {
                this.cmainmemo = value;
            }

            /**
             * 获取cdepcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdepcode() {
                return cdepcode;
            }

            /**
             * 设置cdepcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdepcode(String value) {
                this.cdepcode = value;
            }

            /**
             * 获取cdefine1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine1() {
                return cdefine1;
            }

            /**
             * 设置cdefine1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine1(String value) {
                this.cdefine1 = value;
            }

            /**
             * 获取cdefine2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine2() {
                return cdefine2;
            }

            /**
             * 设置cdefine2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine2(String value) {
                this.cdefine2 = value;
            }

            /**
             * 获取cdefine3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine3() {
                return cdefine3;
            }

            /**
             * 设置cdefine3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine3(String value) {
                this.cdefine3 = value;
            }

            /**
             * 获取cdefine4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine4() {
                return cdefine4;
            }

            /**
             * 设置cdefine4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine4(String value) {
                this.cdefine4 = value;
            }

            /**
             * 获取cdefine5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine5() {
                return cdefine5;
            }

            /**
             * 设置cdefine5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine5(String value) {
                this.cdefine5 = value;
            }

            /**
             * 获取cdefine6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine6() {
                return cdefine6;
            }

            /**
             * 设置cdefine6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine6(String value) {
                this.cdefine6 = value;
            }

            /**
             * 获取cdefine7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine7() {
                return cdefine7;
            }

            /**
             * 设置cdefine7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine7(String value) {
                this.cdefine7 = value;
            }

            /**
             * 获取cdefine8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine8() {
                return cdefine8;
            }

            /**
             * 设置cdefine8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine8(String value) {
                this.cdefine8 = value;
            }

            /**
             * 获取cdefine9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine9() {
                return cdefine9;
            }

            /**
             * 设置cdefine9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine9(String value) {
                this.cdefine9 = value;
            }

            /**
             * 获取cdefine10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine10() {
                return cdefine10;
            }

            /**
             * 设置cdefine10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine10(String value) {
                this.cdefine10 = value;
            }

            /**
             * 获取cdefine11属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine11() {
                return cdefine11;
            }

            /**
             * 设置cdefine11属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine11(String value) {
                this.cdefine11 = value;
            }

            /**
             * 获取cdefine12属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine12() {
                return cdefine12;
            }

            /**
             * 设置cdefine12属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine12(String value) {
                this.cdefine12 = value;
            }

            /**
             * 获取cdefine13属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine13() {
                return cdefine13;
            }

            /**
             * 设置cdefine13属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine13(String value) {
                this.cdefine13 = value;
            }

            /**
             * 获取cdefine14属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine14() {
                return cdefine14;
            }

            /**
             * 设置cdefine14属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine14(String value) {
                this.cdefine14 = value;
            }

            /**
             * 获取cdefine15属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine15() {
                return cdefine15;
            }

            /**
             * 设置cdefine15属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine15(String value) {
                this.cdefine15 = value;
            }

            /**
             * 获取cdefine16属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdefine16() {
                return cdefine16;
            }

            /**
             * 设置cdefine16属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdefine16(String value) {
                this.cdefine16 = value;
            }

        }

    }

}
