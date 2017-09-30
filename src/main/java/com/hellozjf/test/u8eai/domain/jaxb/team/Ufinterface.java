//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:55 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.team;

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
 *         &lt;element name="team" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cDepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cLeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bMOTeam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="wccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bPRTeam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dEstablisheDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dWithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cTeamDefine16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "team"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Team> team;
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
     * Gets the value of the team property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the team property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Team }
     * 
     * 
     */
    public List<Ufinterface.Team> getTeam() {
        if (team == null) {
            team = new ArrayList<Ufinterface.Team>();
        }
        return this.team;
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
     *         &lt;element name="cCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="vName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cDepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cLeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bMOTeam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="wccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bPRTeam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dEstablisheDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dWithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cTeamDefine16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cCode",
        "vName",
        "cDepCode",
        "cLeader",
        "bmoTeam",
        "wccode",
        "bprTeam",
        "dEstablisheDate",
        "dWithdrawalDate",
        "cTeamDefine1",
        "cTeamDefine2",
        "cTeamDefine3",
        "cTeamDefine4",
        "cTeamDefine5",
        "cTeamDefine6",
        "cTeamDefine7",
        "cTeamDefine8",
        "cTeamDefine9",
        "cTeamDefine10",
        "cTeamDefine11",
        "cTeamDefine12",
        "cTeamDefine13",
        "cTeamDefine14",
        "cTeamDefine15",
        "cTeamDefine16"
    })
    public static class Team {

        protected String cCode;
        protected String vName;
        protected String cDepCode;
        protected String cLeader;
        @XmlElement(name = "bMOTeam")
        protected String bmoTeam;
        protected String wccode;
        @XmlElement(name = "bPRTeam")
        protected String bprTeam;
        protected String dEstablisheDate;
        protected String dWithdrawalDate;
        protected String cTeamDefine1;
        protected String cTeamDefine2;
        protected String cTeamDefine3;
        protected String cTeamDefine4;
        protected String cTeamDefine5;
        protected String cTeamDefine6;
        protected String cTeamDefine7;
        protected String cTeamDefine8;
        protected String cTeamDefine9;
        protected String cTeamDefine10;
        protected String cTeamDefine11;
        protected String cTeamDefine12;
        protected String cTeamDefine13;
        protected String cTeamDefine14;
        protected String cTeamDefine15;
        protected String cTeamDefine16;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * 获取cCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCode() {
            return cCode;
        }

        /**
         * 设置cCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCode(String value) {
            this.cCode = value;
        }

        /**
         * 获取vName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVName() {
            return vName;
        }

        /**
         * 设置vName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVName(String value) {
            this.vName = value;
        }

        /**
         * 获取cDepCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCDepCode() {
            return cDepCode;
        }

        /**
         * 设置cDepCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCDepCode(String value) {
            this.cDepCode = value;
        }

        /**
         * 获取cLeader属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCLeader() {
            return cLeader;
        }

        /**
         * 设置cLeader属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCLeader(String value) {
            this.cLeader = value;
        }

        /**
         * 获取bmoTeam属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBMOTeam() {
            return bmoTeam;
        }

        /**
         * 设置bmoTeam属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBMOTeam(String value) {
            this.bmoTeam = value;
        }

        /**
         * 获取wccode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWccode() {
            return wccode;
        }

        /**
         * 设置wccode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWccode(String value) {
            this.wccode = value;
        }

        /**
         * 获取bprTeam属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPRTeam() {
            return bprTeam;
        }

        /**
         * 设置bprTeam属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPRTeam(String value) {
            this.bprTeam = value;
        }

        /**
         * 获取dEstablisheDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEstablisheDate() {
            return dEstablisheDate;
        }

        /**
         * 设置dEstablisheDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEstablisheDate(String value) {
            this.dEstablisheDate = value;
        }

        /**
         * 获取dWithdrawalDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDWithdrawalDate() {
            return dWithdrawalDate;
        }

        /**
         * 设置dWithdrawalDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDWithdrawalDate(String value) {
            this.dWithdrawalDate = value;
        }

        /**
         * 获取cTeamDefine1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine1() {
            return cTeamDefine1;
        }

        /**
         * 设置cTeamDefine1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine1(String value) {
            this.cTeamDefine1 = value;
        }

        /**
         * 获取cTeamDefine2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine2() {
            return cTeamDefine2;
        }

        /**
         * 设置cTeamDefine2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine2(String value) {
            this.cTeamDefine2 = value;
        }

        /**
         * 获取cTeamDefine3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine3() {
            return cTeamDefine3;
        }

        /**
         * 设置cTeamDefine3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine3(String value) {
            this.cTeamDefine3 = value;
        }

        /**
         * 获取cTeamDefine4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine4() {
            return cTeamDefine4;
        }

        /**
         * 设置cTeamDefine4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine4(String value) {
            this.cTeamDefine4 = value;
        }

        /**
         * 获取cTeamDefine5属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine5() {
            return cTeamDefine5;
        }

        /**
         * 设置cTeamDefine5属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine5(String value) {
            this.cTeamDefine5 = value;
        }

        /**
         * 获取cTeamDefine6属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine6() {
            return cTeamDefine6;
        }

        /**
         * 设置cTeamDefine6属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine6(String value) {
            this.cTeamDefine6 = value;
        }

        /**
         * 获取cTeamDefine7属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine7() {
            return cTeamDefine7;
        }

        /**
         * 设置cTeamDefine7属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine7(String value) {
            this.cTeamDefine7 = value;
        }

        /**
         * 获取cTeamDefine8属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine8() {
            return cTeamDefine8;
        }

        /**
         * 设置cTeamDefine8属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine8(String value) {
            this.cTeamDefine8 = value;
        }

        /**
         * 获取cTeamDefine9属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine9() {
            return cTeamDefine9;
        }

        /**
         * 设置cTeamDefine9属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine9(String value) {
            this.cTeamDefine9 = value;
        }

        /**
         * 获取cTeamDefine10属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine10() {
            return cTeamDefine10;
        }

        /**
         * 设置cTeamDefine10属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine10(String value) {
            this.cTeamDefine10 = value;
        }

        /**
         * 获取cTeamDefine11属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine11() {
            return cTeamDefine11;
        }

        /**
         * 设置cTeamDefine11属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine11(String value) {
            this.cTeamDefine11 = value;
        }

        /**
         * 获取cTeamDefine12属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine12() {
            return cTeamDefine12;
        }

        /**
         * 设置cTeamDefine12属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine12(String value) {
            this.cTeamDefine12 = value;
        }

        /**
         * 获取cTeamDefine13属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine13() {
            return cTeamDefine13;
        }

        /**
         * 设置cTeamDefine13属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine13(String value) {
            this.cTeamDefine13 = value;
        }

        /**
         * 获取cTeamDefine14属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine14() {
            return cTeamDefine14;
        }

        /**
         * 设置cTeamDefine14属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine14(String value) {
            this.cTeamDefine14 = value;
        }

        /**
         * 获取cTeamDefine15属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine15() {
            return cTeamDefine15;
        }

        /**
         * 设置cTeamDefine15属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine15(String value) {
            this.cTeamDefine15 = value;
        }

        /**
         * 获取cTeamDefine16属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTeamDefine16() {
            return cTeamDefine16;
        }

        /**
         * 设置cTeamDefine16属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTeamDefine16(String value) {
            this.cTeamDefine16 = value;
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
