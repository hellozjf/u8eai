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
 *         &lt;element name="PRoutingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RountingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionEffDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VersionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}Version" maxOccurs="unbounded" minOccurs="0"/>
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
    "rountingType",
    "versionDesc",
    "versionEffDate",
    "versionEndDate",
    "identCode",
    "identDesc",
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
    "status",
    "version"
})
@XmlRootElement(name = "Version")
public class Version {

    @XmlElement(name = "PRoutingId")
    protected String pRoutingId;
    @XmlElement(name = "RountingType")
    protected String rountingType;
    @XmlElement(name = "VersionDesc")
    protected String versionDesc;
    @XmlElement(name = "VersionEffDate")
    protected String versionEffDate;
    @XmlElement(name = "VersionEndDate")
    protected String versionEndDate;
    @XmlElement(name = "IdentCode")
    protected String identCode;
    @XmlElement(name = "IdentDesc")
    protected String identDesc;
    @XmlElement(name = "Define1")
    protected String define1;
    @XmlElement(name = "Define2")
    protected String define2;
    @XmlElement(name = "Define3")
    protected String define3;
    @XmlElement(name = "Define4")
    protected String define4;
    @XmlElement(name = "Define5")
    protected String define5;
    @XmlElement(name = "Define6")
    protected String define6;
    @XmlElement(name = "Define7")
    protected String define7;
    @XmlElement(name = "Define8")
    protected String define8;
    @XmlElement(name = "Define9")
    protected String define9;
    @XmlElement(name = "Define10")
    protected String define10;
    @XmlElement(name = "Define11")
    protected String define11;
    @XmlElement(name = "Define12")
    protected String define12;
    @XmlElement(name = "Define13")
    protected String define13;
    @XmlElement(name = "Define14")
    protected String define14;
    @XmlElement(name = "Define15")
    protected String define15;
    @XmlElement(name = "Define16")
    protected String define16;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Version")
    protected List<Version> version;

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
     * 获取rountingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRountingType() {
        return rountingType;
    }

    /**
     * 设置rountingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRountingType(String value) {
        this.rountingType = value;
    }

    /**
     * 获取versionDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDesc() {
        return versionDesc;
    }

    /**
     * 设置versionDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDesc(String value) {
        this.versionDesc = value;
    }

    /**
     * 获取versionEffDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionEffDate() {
        return versionEffDate;
    }

    /**
     * 设置versionEffDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionEffDate(String value) {
        this.versionEffDate = value;
    }

    /**
     * 获取versionEndDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionEndDate() {
        return versionEndDate;
    }

    /**
     * 设置versionEndDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionEndDate(String value) {
        this.versionEndDate = value;
    }

    /**
     * 获取identCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentCode() {
        return identCode;
    }

    /**
     * 设置identCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentCode(String value) {
        this.identCode = value;
    }

    /**
     * 获取identDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /**
     * 设置identDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentDesc(String value) {
        this.identDesc = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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

}
