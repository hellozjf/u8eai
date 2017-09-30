//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:27 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.eqtype;

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
 *         &lt;element name="eqtype" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="header" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ceqtypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ceqtypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cgg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cxh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clbcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dbljx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dbldq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intjm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intdx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="inttz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="intchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cmaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dtdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cchecker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dtaudit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="vt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "eqtype"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Eqtype> eqtype;
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
     * Gets the value of the eqtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eqtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEqtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Eqtype }
     * 
     * 
     */
    public List<Ufinterface.Eqtype> getEqtype() {
        if (eqtype == null) {
            eqtype = new ArrayList<Ufinterface.Eqtype>();
        }
        return this.eqtype;
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
     *                   &lt;element name="ceqtypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ceqtypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cgg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cxh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clbcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dbljx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dbldq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="intjm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="intdx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="intxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="inttz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="intchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cmaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dtdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cchecker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dtaudit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="vt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "header"
    })
    public static class Eqtype {

        protected List<Ufinterface.Eqtype.Header> header;

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
         * {@link Ufinterface.Eqtype.Header }
         * 
         * 
         */
        public List<Ufinterface.Eqtype.Header> getHeader() {
            if (header == null) {
                header = new ArrayList<Ufinterface.Eqtype.Header>();
            }
            return this.header;
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
         *         &lt;element name="ceqtypecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ceqtypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cgg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cxh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clbcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dbljx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dbldq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="intjm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="intdx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="intxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="inttz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="intchange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cmaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dtdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cchecker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dtaudit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cmemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="vt_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ceqtypecode",
            "ceqtypename",
            "cgg",
            "cxh",
            "clbcode",
            "dbljx",
            "dbldq",
            "intjm",
            "intdx",
            "intxy",
            "inttz",
            "intchange",
            "cmaker",
            "dtdate",
            "cchecker",
            "dtaudit",
            "cmemo",
            "vtId",
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

            protected String ceqtypecode;
            protected String ceqtypename;
            protected String cgg;
            protected String cxh;
            protected String clbcode;
            protected String dbljx;
            protected String dbldq;
            protected String intjm;
            protected String intdx;
            protected String intxy;
            protected String inttz;
            protected String intchange;
            protected String cmaker;
            protected String dtdate;
            protected String cchecker;
            protected String dtaudit;
            protected String cmemo;
            @XmlElement(name = "vt_id")
            protected String vtId;
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
             * 获取ceqtypecode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCeqtypecode() {
                return ceqtypecode;
            }

            /**
             * 设置ceqtypecode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCeqtypecode(String value) {
                this.ceqtypecode = value;
            }

            /**
             * 获取ceqtypename属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCeqtypename() {
                return ceqtypename;
            }

            /**
             * 设置ceqtypename属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCeqtypename(String value) {
                this.ceqtypename = value;
            }

            /**
             * 获取cgg属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCgg() {
                return cgg;
            }

            /**
             * 设置cgg属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCgg(String value) {
                this.cgg = value;
            }

            /**
             * 获取cxh属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCxh() {
                return cxh;
            }

            /**
             * 设置cxh属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCxh(String value) {
                this.cxh = value;
            }

            /**
             * 获取clbcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClbcode() {
                return clbcode;
            }

            /**
             * 设置clbcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClbcode(String value) {
                this.clbcode = value;
            }

            /**
             * 获取dbljx属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDbljx() {
                return dbljx;
            }

            /**
             * 设置dbljx属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDbljx(String value) {
                this.dbljx = value;
            }

            /**
             * 获取dbldq属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDbldq() {
                return dbldq;
            }

            /**
             * 设置dbldq属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDbldq(String value) {
                this.dbldq = value;
            }

            /**
             * 获取intjm属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntjm() {
                return intjm;
            }

            /**
             * 设置intjm属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntjm(String value) {
                this.intjm = value;
            }

            /**
             * 获取intdx属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntdx() {
                return intdx;
            }

            /**
             * 设置intdx属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntdx(String value) {
                this.intdx = value;
            }

            /**
             * 获取intxy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntxy() {
                return intxy;
            }

            /**
             * 设置intxy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntxy(String value) {
                this.intxy = value;
            }

            /**
             * 获取inttz属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInttz() {
                return inttz;
            }

            /**
             * 设置inttz属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInttz(String value) {
                this.inttz = value;
            }

            /**
             * 获取intchange属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIntchange() {
                return intchange;
            }

            /**
             * 设置intchange属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIntchange(String value) {
                this.intchange = value;
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
             * 获取dtdate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtdate() {
                return dtdate;
            }

            /**
             * 设置dtdate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtdate(String value) {
                this.dtdate = value;
            }

            /**
             * 获取cchecker属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCchecker() {
                return cchecker;
            }

            /**
             * 设置cchecker属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCchecker(String value) {
                this.cchecker = value;
            }

            /**
             * 获取dtaudit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDtaudit() {
                return dtaudit;
            }

            /**
             * 设置dtaudit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDtaudit(String value) {
                this.dtaudit = value;
            }

            /**
             * 获取cmemo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCmemo() {
                return cmemo;
            }

            /**
             * 设置cmemo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCmemo(String value) {
                this.cmemo = value;
            }

            /**
             * 获取vtId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVtId() {
                return vtId;
            }

            /**
             * 设置vtId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVtId(String value) {
                this.vtId = value;
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
