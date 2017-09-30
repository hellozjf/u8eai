//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:27:00 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.vendorcontact;

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
 *         &lt;element name="vendorcontact" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="of_vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direct_leader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="office_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="family_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="work_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="family_member" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="family_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="be_main_linker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="charge_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="founder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fondertime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="change_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="change_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "vendorcontact"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Vendorcontact> vendorcontact;
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
     * Gets the value of the vendorcontact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorcontact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorcontact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Vendorcontact }
     * 
     * 
     */
    public List<Ufinterface.Vendorcontact> getVendorcontact() {
        if (vendorcontact == null) {
            vendorcontact = new ArrayList<Ufinterface.Vendorcontact>();
        }
        return this.vendorcontact;
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
     *         &lt;element name="of_vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="native" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direct_leader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="office_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="family_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="web" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="work_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="family_member" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="family_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="be_main_linker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="charge_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="founder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fondertime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="change_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="change_time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ofVendor",
        "title",
        "sex",
        "birthday",
        "_native",
        "position",
        "directLeader",
        "mobile",
        "officePhone",
        "familyPhone",
        "bp",
        "email",
        "web",
        "workAddress",
        "postcode",
        "marriage",
        "familyMember",
        "familyAddress",
        "favorite",
        "beMainLinker",
        "chargePerson",
        "memo",
        "founder",
        "fondertime",
        "changePerson",
        "changeTime",
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
        "selfDefine16"
    })
    public static class Vendorcontact {

        protected String code;
        protected String name;
        @XmlElement(name = "of_vendor")
        protected String ofVendor;
        protected String title;
        protected String sex;
        protected String birthday;
        @XmlElement(name = "native")
        protected String _native;
        protected String position;
        @XmlElement(name = "direct_leader")
        protected String directLeader;
        protected String mobile;
        @XmlElement(name = "office_phone")
        protected String officePhone;
        @XmlElement(name = "family_phone")
        protected String familyPhone;
        protected String bp;
        protected String email;
        protected String web;
        @XmlElement(name = "work_address")
        protected String workAddress;
        protected String postcode;
        protected String marriage;
        @XmlElement(name = "family_member")
        protected String familyMember;
        @XmlElement(name = "family_address")
        protected String familyAddress;
        protected String favorite;
        @XmlElement(name = "be_main_linker")
        protected String beMainLinker;
        @XmlElement(name = "charge_person")
        protected String chargePerson;
        protected String memo;
        protected String founder;
        protected String fondertime;
        @XmlElement(name = "change_person")
        protected String changePerson;
        @XmlElement(name = "change_time")
        protected String changeTime;
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
         * 获取ofVendor属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfVendor() {
            return ofVendor;
        }

        /**
         * 设置ofVendor属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfVendor(String value) {
            this.ofVendor = value;
        }

        /**
         * 获取title属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * 设置title属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * 获取sex属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSex() {
            return sex;
        }

        /**
         * 设置sex属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSex(String value) {
            this.sex = value;
        }

        /**
         * 获取birthday属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthday() {
            return birthday;
        }

        /**
         * 设置birthday属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthday(String value) {
            this.birthday = value;
        }

        /**
         * 获取native属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNative() {
            return _native;
        }

        /**
         * 设置native属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNative(String value) {
            this._native = value;
        }

        /**
         * 获取position属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosition() {
            return position;
        }

        /**
         * 设置position属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosition(String value) {
            this.position = value;
        }

        /**
         * 获取directLeader属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDirectLeader() {
            return directLeader;
        }

        /**
         * 设置directLeader属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDirectLeader(String value) {
            this.directLeader = value;
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
         * 获取officePhone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfficePhone() {
            return officePhone;
        }

        /**
         * 设置officePhone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfficePhone(String value) {
            this.officePhone = value;
        }

        /**
         * 获取familyPhone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyPhone() {
            return familyPhone;
        }

        /**
         * 设置familyPhone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyPhone(String value) {
            this.familyPhone = value;
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
         * 获取web属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeb() {
            return web;
        }

        /**
         * 设置web属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeb(String value) {
            this.web = value;
        }

        /**
         * 获取workAddress属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkAddress() {
            return workAddress;
        }

        /**
         * 设置workAddress属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkAddress(String value) {
            this.workAddress = value;
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
         * 获取marriage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarriage() {
            return marriage;
        }

        /**
         * 设置marriage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarriage(String value) {
            this.marriage = value;
        }

        /**
         * 获取familyMember属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyMember() {
            return familyMember;
        }

        /**
         * 设置familyMember属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyMember(String value) {
            this.familyMember = value;
        }

        /**
         * 获取familyAddress属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamilyAddress() {
            return familyAddress;
        }

        /**
         * 设置familyAddress属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFamilyAddress(String value) {
            this.familyAddress = value;
        }

        /**
         * 获取favorite属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFavorite() {
            return favorite;
        }

        /**
         * 设置favorite属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFavorite(String value) {
            this.favorite = value;
        }

        /**
         * 获取beMainLinker属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeMainLinker() {
            return beMainLinker;
        }

        /**
         * 设置beMainLinker属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeMainLinker(String value) {
            this.beMainLinker = value;
        }

        /**
         * 获取chargePerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChargePerson() {
            return chargePerson;
        }

        /**
         * 设置chargePerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChargePerson(String value) {
            this.chargePerson = value;
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
         * 获取founder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFounder() {
            return founder;
        }

        /**
         * 设置founder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFounder(String value) {
            this.founder = value;
        }

        /**
         * 获取fondertime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFondertime() {
            return fondertime;
        }

        /**
         * 设置fondertime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFondertime(String value) {
            this.fondertime = value;
        }

        /**
         * 获取changePerson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChangePerson() {
            return changePerson;
        }

        /**
         * 设置changePerson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChangePerson(String value) {
            this.changePerson = value;
        }

        /**
         * 获取changeTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChangeTime() {
            return changeTime;
        }

        /**
         * 设置changeTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChangeTime(String value) {
            this.changeTime = value;
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

    }

}
