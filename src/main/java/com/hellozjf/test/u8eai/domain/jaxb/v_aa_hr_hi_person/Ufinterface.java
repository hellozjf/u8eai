//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:27:02 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.v_aa_hr_hi_person;

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
 *         &lt;element name="v_aa_hr_hi_person" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cPsn_NameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnproperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rsex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rEmployState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rpersontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EmploymentForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdutyclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cjobcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cjobgradecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cjobrankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bpsnperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdept_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dbirthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnfphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnophone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsninphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnfaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnpostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnpostaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnqqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpsnoseat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpersonprop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fcreditquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="icredate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccregrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dpvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dpinvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rNativePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rNational" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rhealthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rMarriStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rPerResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vAliaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dJoinworkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dEnterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dRegularDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vSSNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dEnterUnitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bProbation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "vAaHrHiPerson"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "v_aa_hr_hi_person")
    protected List<Ufinterface.VAaHrHiPerson> vAaHrHiPerson;
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
     * Gets the value of the vAaHrHiPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vAaHrHiPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVAaHrHiPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.VAaHrHiPerson }
     * 
     * 
     */
    public List<Ufinterface.VAaHrHiPerson> getVAaHrHiPerson() {
        if (vAaHrHiPerson == null) {
            vAaHrHiPerson = new ArrayList<Ufinterface.VAaHrHiPerson>();
        }
        return this.vAaHrHiPerson;
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
     *         &lt;element name="cPsn_NameEN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="JobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnproperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rsex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rEmployState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rpersontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EmploymentForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdutyclass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cjobcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cjobgradecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cjobrankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vIDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bpsnperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdept_num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnbankcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dbirthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnmobilephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnfphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnophone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsninphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnfaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnpostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnpostaddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnqqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpsnoseat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpersonprop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdepcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fcreditquantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="icredate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccregrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dpvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dpinvaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rNativePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rNational" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rhealthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rMarriStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rPerResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vAliaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dJoinworkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dEnterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dRegularDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vSSNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dEnterUnitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bProbation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "cPsnNameEN",
        "jobNumber",
        "cpsnproperty",
        "rsex",
        "rEmployState",
        "rpersontype",
        "employmentForm",
        "cdutyclass",
        "cjobcode",
        "cjobgradecode",
        "cjobrankcode",
        "ridType",
        "vidNo",
        "bpsnperson",
        "cdeptNum",
        "cpsnbankcode",
        "cpsnaccount",
        "dbirthdate",
        "cpsnmobilephone",
        "cpsnfphone",
        "cpsnophone",
        "cpsninphone",
        "cpsnemail",
        "cpsnfaddr",
        "cpsnpostcode",
        "cpsnpostaddr",
        "cpsnqqcode",
        "cpsnurl",
        "cpsnoseat",
        "cpersonprop",
        "cdepcode",
        "fcreditquantity",
        "icredate",
        "ccregrade",
        "dpvaliddate",
        "dpinvaliddate",
        "rNativePlace",
        "rNational",
        "rhealthStatus",
        "rMarriStatus",
        "mPicture",
        "rPerResidence",
        "vAliaName",
        "dJoinworkDate",
        "dEnterDate",
        "dRegularDate",
        "vssNo",
        "dEnterUnitDate",
        "bProbation"
    })
    public static class VAaHrHiPerson {

        protected String code;
        protected String name;
        @XmlElement(name = "cPsn_NameEN")
        protected String cPsnNameEN;
        @XmlElement(name = "JobNumber")
        protected String jobNumber;
        protected String cpsnproperty;
        protected String rsex;
        protected String rEmployState;
        protected String rpersontype;
        @XmlElement(name = "EmploymentForm")
        protected String employmentForm;
        protected String cdutyclass;
        protected String cjobcode;
        protected String cjobgradecode;
        protected String cjobrankcode;
        @XmlElement(name = "rIDType")
        protected String ridType;
        @XmlElement(name = "vIDNo")
        protected String vidNo;
        protected String bpsnperson;
        @XmlElement(name = "cdept_num")
        protected String cdeptNum;
        protected String cpsnbankcode;
        protected String cpsnaccount;
        protected String dbirthdate;
        protected String cpsnmobilephone;
        protected String cpsnfphone;
        protected String cpsnophone;
        protected String cpsninphone;
        protected String cpsnemail;
        protected String cpsnfaddr;
        protected String cpsnpostcode;
        protected String cpsnpostaddr;
        protected String cpsnqqcode;
        protected String cpsnurl;
        protected String cpsnoseat;
        protected String cpersonprop;
        protected String cdepcode;
        protected String fcreditquantity;
        protected String icredate;
        protected String ccregrade;
        protected String dpvaliddate;
        protected String dpinvaliddate;
        protected String rNativePlace;
        protected String rNational;
        protected String rhealthStatus;
        protected String rMarriStatus;
        @XmlElement(name = "MPicture")
        protected String mPicture;
        protected String rPerResidence;
        protected String vAliaName;
        protected String dJoinworkDate;
        protected String dEnterDate;
        protected String dRegularDate;
        @XmlElement(name = "vSSNo")
        protected String vssNo;
        protected String dEnterUnitDate;
        protected String bProbation;
        @XmlAttribute(name = "tablename")
        protected String tablename;

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
         * 获取cPsnNameEN属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPsnNameEN() {
            return cPsnNameEN;
        }

        /**
         * 设置cPsnNameEN属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPsnNameEN(String value) {
            this.cPsnNameEN = value;
        }

        /**
         * 获取jobNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobNumber() {
            return jobNumber;
        }

        /**
         * 设置jobNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobNumber(String value) {
            this.jobNumber = value;
        }

        /**
         * 获取cpsnproperty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnproperty() {
            return cpsnproperty;
        }

        /**
         * 设置cpsnproperty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnproperty(String value) {
            this.cpsnproperty = value;
        }

        /**
         * 获取rsex属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRsex() {
            return rsex;
        }

        /**
         * 设置rsex属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRsex(String value) {
            this.rsex = value;
        }

        /**
         * 获取rEmployState属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREmployState() {
            return rEmployState;
        }

        /**
         * 设置rEmployState属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREmployState(String value) {
            this.rEmployState = value;
        }

        /**
         * 获取rpersontype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRpersontype() {
            return rpersontype;
        }

        /**
         * 设置rpersontype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRpersontype(String value) {
            this.rpersontype = value;
        }

        /**
         * 获取employmentForm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentForm() {
            return employmentForm;
        }

        /**
         * 设置employmentForm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentForm(String value) {
            this.employmentForm = value;
        }

        /**
         * 获取cdutyclass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdutyclass() {
            return cdutyclass;
        }

        /**
         * 设置cdutyclass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdutyclass(String value) {
            this.cdutyclass = value;
        }

        /**
         * 获取cjobcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCjobcode() {
            return cjobcode;
        }

        /**
         * 设置cjobcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCjobcode(String value) {
            this.cjobcode = value;
        }

        /**
         * 获取cjobgradecode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCjobgradecode() {
            return cjobgradecode;
        }

        /**
         * 设置cjobgradecode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCjobgradecode(String value) {
            this.cjobgradecode = value;
        }

        /**
         * 获取cjobrankcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCjobrankcode() {
            return cjobrankcode;
        }

        /**
         * 设置cjobrankcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCjobrankcode(String value) {
            this.cjobrankcode = value;
        }

        /**
         * 获取ridType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRIDType() {
            return ridType;
        }

        /**
         * 设置ridType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRIDType(String value) {
            this.ridType = value;
        }

        /**
         * 获取vidNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVIDNo() {
            return vidNo;
        }

        /**
         * 设置vidNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVIDNo(String value) {
            this.vidNo = value;
        }

        /**
         * 获取bpsnperson属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBpsnperson() {
            return bpsnperson;
        }

        /**
         * 设置bpsnperson属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBpsnperson(String value) {
            this.bpsnperson = value;
        }

        /**
         * 获取cdeptNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdeptNum() {
            return cdeptNum;
        }

        /**
         * 设置cdeptNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdeptNum(String value) {
            this.cdeptNum = value;
        }

        /**
         * 获取cpsnbankcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnbankcode() {
            return cpsnbankcode;
        }

        /**
         * 设置cpsnbankcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnbankcode(String value) {
            this.cpsnbankcode = value;
        }

        /**
         * 获取cpsnaccount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnaccount() {
            return cpsnaccount;
        }

        /**
         * 设置cpsnaccount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnaccount(String value) {
            this.cpsnaccount = value;
        }

        /**
         * 获取dbirthdate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDbirthdate() {
            return dbirthdate;
        }

        /**
         * 设置dbirthdate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDbirthdate(String value) {
            this.dbirthdate = value;
        }

        /**
         * 获取cpsnmobilephone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnmobilephone() {
            return cpsnmobilephone;
        }

        /**
         * 设置cpsnmobilephone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnmobilephone(String value) {
            this.cpsnmobilephone = value;
        }

        /**
         * 获取cpsnfphone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnfphone() {
            return cpsnfphone;
        }

        /**
         * 设置cpsnfphone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnfphone(String value) {
            this.cpsnfphone = value;
        }

        /**
         * 获取cpsnophone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnophone() {
            return cpsnophone;
        }

        /**
         * 设置cpsnophone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnophone(String value) {
            this.cpsnophone = value;
        }

        /**
         * 获取cpsninphone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsninphone() {
            return cpsninphone;
        }

        /**
         * 设置cpsninphone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsninphone(String value) {
            this.cpsninphone = value;
        }

        /**
         * 获取cpsnemail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnemail() {
            return cpsnemail;
        }

        /**
         * 设置cpsnemail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnemail(String value) {
            this.cpsnemail = value;
        }

        /**
         * 获取cpsnfaddr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnfaddr() {
            return cpsnfaddr;
        }

        /**
         * 设置cpsnfaddr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnfaddr(String value) {
            this.cpsnfaddr = value;
        }

        /**
         * 获取cpsnpostcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnpostcode() {
            return cpsnpostcode;
        }

        /**
         * 设置cpsnpostcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnpostcode(String value) {
            this.cpsnpostcode = value;
        }

        /**
         * 获取cpsnpostaddr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnpostaddr() {
            return cpsnpostaddr;
        }

        /**
         * 设置cpsnpostaddr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnpostaddr(String value) {
            this.cpsnpostaddr = value;
        }

        /**
         * 获取cpsnqqcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnqqcode() {
            return cpsnqqcode;
        }

        /**
         * 设置cpsnqqcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnqqcode(String value) {
            this.cpsnqqcode = value;
        }

        /**
         * 获取cpsnurl属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnurl() {
            return cpsnurl;
        }

        /**
         * 设置cpsnurl属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnurl(String value) {
            this.cpsnurl = value;
        }

        /**
         * 获取cpsnoseat属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpsnoseat() {
            return cpsnoseat;
        }

        /**
         * 设置cpsnoseat属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpsnoseat(String value) {
            this.cpsnoseat = value;
        }

        /**
         * 获取cpersonprop属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpersonprop() {
            return cpersonprop;
        }

        /**
         * 设置cpersonprop属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpersonprop(String value) {
            this.cpersonprop = value;
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
         * 获取fcreditquantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFcreditquantity() {
            return fcreditquantity;
        }

        /**
         * 设置fcreditquantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFcreditquantity(String value) {
            this.fcreditquantity = value;
        }

        /**
         * 获取icredate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIcredate() {
            return icredate;
        }

        /**
         * 设置icredate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIcredate(String value) {
            this.icredate = value;
        }

        /**
         * 获取ccregrade属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcregrade() {
            return ccregrade;
        }

        /**
         * 设置ccregrade属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcregrade(String value) {
            this.ccregrade = value;
        }

        /**
         * 获取dpvaliddate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDpvaliddate() {
            return dpvaliddate;
        }

        /**
         * 设置dpvaliddate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDpvaliddate(String value) {
            this.dpvaliddate = value;
        }

        /**
         * 获取dpinvaliddate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDpinvaliddate() {
            return dpinvaliddate;
        }

        /**
         * 设置dpinvaliddate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDpinvaliddate(String value) {
            this.dpinvaliddate = value;
        }

        /**
         * 获取rNativePlace属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNativePlace() {
            return rNativePlace;
        }

        /**
         * 设置rNativePlace属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNativePlace(String value) {
            this.rNativePlace = value;
        }

        /**
         * 获取rNational属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRNational() {
            return rNational;
        }

        /**
         * 设置rNational属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRNational(String value) {
            this.rNational = value;
        }

        /**
         * 获取rhealthStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRhealthStatus() {
            return rhealthStatus;
        }

        /**
         * 设置rhealthStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRhealthStatus(String value) {
            this.rhealthStatus = value;
        }

        /**
         * 获取rMarriStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRMarriStatus() {
            return rMarriStatus;
        }

        /**
         * 设置rMarriStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRMarriStatus(String value) {
            this.rMarriStatus = value;
        }

        /**
         * 获取mPicture属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMPicture() {
            return mPicture;
        }

        /**
         * 设置mPicture属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMPicture(String value) {
            this.mPicture = value;
        }

        /**
         * 获取rPerResidence属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPerResidence() {
            return rPerResidence;
        }

        /**
         * 设置rPerResidence属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPerResidence(String value) {
            this.rPerResidence = value;
        }

        /**
         * 获取vAliaName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVAliaName() {
            return vAliaName;
        }

        /**
         * 设置vAliaName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVAliaName(String value) {
            this.vAliaName = value;
        }

        /**
         * 获取dJoinworkDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDJoinworkDate() {
            return dJoinworkDate;
        }

        /**
         * 设置dJoinworkDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDJoinworkDate(String value) {
            this.dJoinworkDate = value;
        }

        /**
         * 获取dEnterDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEnterDate() {
            return dEnterDate;
        }

        /**
         * 设置dEnterDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEnterDate(String value) {
            this.dEnterDate = value;
        }

        /**
         * 获取dRegularDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRegularDate() {
            return dRegularDate;
        }

        /**
         * 设置dRegularDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRegularDate(String value) {
            this.dRegularDate = value;
        }

        /**
         * 获取vssNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVSSNo() {
            return vssNo;
        }

        /**
         * 设置vssNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVSSNo(String value) {
            this.vssNo = value;
        }

        /**
         * 获取dEnterUnitDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEnterUnitDate() {
            return dEnterUnitDate;
        }

        /**
         * 设置dEnterUnitDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEnterUnitDate(String value) {
            this.dEnterUnitDate = value;
        }

        /**
         * 获取bProbation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBProbation() {
            return bProbation;
        }

        /**
         * 设置bProbation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBProbation(String value) {
            this.bProbation = value;
        }

        /**
         * 获取tablename属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTablename() {
            return tablename;
        }

        /**
         * 设置tablename属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTablename(String value) {
            this.tablename = value;
        }

    }

}
