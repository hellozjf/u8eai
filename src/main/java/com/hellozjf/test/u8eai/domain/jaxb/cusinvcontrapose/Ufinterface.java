//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:22 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.cusinvcontrapose;

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
 *         &lt;element name="i_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cusinvcontrapose" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ccuscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccusinvname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="iteststyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="idtmethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fdtrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fdtnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdtunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="idtstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="iqtmethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="idtlevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cdtaql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="boutinvdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="crulecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "iId",
    "cusinvcontrapose"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "i_id")
    protected String iId;
    protected List<Ufinterface.Cusinvcontrapose> cusinvcontrapose;
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
     * 获取iId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIId() {
        return iId;
    }

    /**
     * 设置iId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIId(String value) {
        this.iId = value;
    }

    /**
     * Gets the value of the cusinvcontrapose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cusinvcontrapose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCusinvcontrapose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Cusinvcontrapose }
     * 
     * 
     */
    public List<Ufinterface.Cusinvcontrapose> getCusinvcontrapose() {
        if (cusinvcontrapose == null) {
            cusinvcontrapose = new ArrayList<Ufinterface.Cusinvcontrapose>();
        }
        return this.cusinvcontrapose;
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
     *         &lt;element name="ccuscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccusinvname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="iteststyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="idtmethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fdtrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fdtnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdtunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="idtstyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="iqtmethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="idtlevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cdtaql" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="boutinvdt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="crulecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ccuscode",
        "cinvcode",
        "ccusinvcode",
        "ccusinvname",
        "iteststyle",
        "idtmethod",
        "fdtrate",
        "fdtnum",
        "cdtunit",
        "idtstyle",
        "iqtmethod",
        "idtlevel",
        "cdtaql",
        "boutinvdt",
        "crulecode"
    })
    public static class Cusinvcontrapose {

        protected String ccuscode;
        protected String cinvcode;
        protected String ccusinvcode;
        protected String ccusinvname;
        protected String iteststyle;
        protected String idtmethod;
        protected String fdtrate;
        protected String fdtnum;
        protected String cdtunit;
        protected String idtstyle;
        protected String iqtmethod;
        protected String idtlevel;
        protected String cdtaql;
        protected String boutinvdt;
        protected String crulecode;

        /**
         * 获取ccuscode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcuscode() {
            return ccuscode;
        }

        /**
         * 设置ccuscode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcuscode(String value) {
            this.ccuscode = value;
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
         * 获取ccusinvcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusinvcode() {
            return ccusinvcode;
        }

        /**
         * 设置ccusinvcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusinvcode(String value) {
            this.ccusinvcode = value;
        }

        /**
         * 获取ccusinvname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusinvname() {
            return ccusinvname;
        }

        /**
         * 设置ccusinvname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusinvname(String value) {
            this.ccusinvname = value;
        }

        /**
         * 获取iteststyle属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIteststyle() {
            return iteststyle;
        }

        /**
         * 设置iteststyle属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIteststyle(String value) {
            this.iteststyle = value;
        }

        /**
         * 获取idtmethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdtmethod() {
            return idtmethod;
        }

        /**
         * 设置idtmethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdtmethod(String value) {
            this.idtmethod = value;
        }

        /**
         * 获取fdtrate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFdtrate() {
            return fdtrate;
        }

        /**
         * 设置fdtrate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFdtrate(String value) {
            this.fdtrate = value;
        }

        /**
         * 获取fdtnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFdtnum() {
            return fdtnum;
        }

        /**
         * 设置fdtnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFdtnum(String value) {
            this.fdtnum = value;
        }

        /**
         * 获取cdtunit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdtunit() {
            return cdtunit;
        }

        /**
         * 设置cdtunit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdtunit(String value) {
            this.cdtunit = value;
        }

        /**
         * 获取idtstyle属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdtstyle() {
            return idtstyle;
        }

        /**
         * 设置idtstyle属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdtstyle(String value) {
            this.idtstyle = value;
        }

        /**
         * 获取iqtmethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIqtmethod() {
            return iqtmethod;
        }

        /**
         * 设置iqtmethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIqtmethod(String value) {
            this.iqtmethod = value;
        }

        /**
         * 获取idtlevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdtlevel() {
            return idtlevel;
        }

        /**
         * 设置idtlevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdtlevel(String value) {
            this.idtlevel = value;
        }

        /**
         * 获取cdtaql属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdtaql() {
            return cdtaql;
        }

        /**
         * 设置cdtaql属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdtaql(String value) {
            this.cdtaql = value;
        }

        /**
         * 获取boutinvdt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoutinvdt() {
            return boutinvdt;
        }

        /**
         * 设置boutinvdt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoutinvdt(String value) {
            this.boutinvdt = value;
        }

        /**
         * 获取crulecode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrulecode() {
            return crulecode;
        }

        /**
         * 设置crulecode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrulecode(String value) {
            this.crulecode = value;
        }

    }

}
