//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:57 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.unitaccount;

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
 *         &lt;element name="unitaccount" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="caccountnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cpayunitid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="bisdefault" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbankid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbankname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cprinvince" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ccity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="caccname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ccbbdepid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbranchid" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "unitaccount"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Unitaccount> unitaccount;
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
     * Gets the value of the unitaccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitaccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitaccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Unitaccount }
     * 
     * 
     */
    public List<Ufinterface.Unitaccount> getUnitaccount() {
        if (unitaccount == null) {
            unitaccount = new ArrayList<Ufinterface.Unitaccount>();
        }
        return this.unitaccount;
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
     *       &lt;attribute name="caccountnumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cpayunitid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="bisdefault" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbankid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbankname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cprinvince" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ccity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="caccname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ccbbdepid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbranchid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Unitaccount {

        @XmlAttribute(name = "caccountnumber")
        protected String caccountnumber;
        @XmlAttribute(name = "cpayunitid")
        protected String cpayunitid;
        @XmlAttribute(name = "bisdefault")
        protected String bisdefault;
        @XmlAttribute(name = "cbankid")
        protected String cbankid;
        @XmlAttribute(name = "cbankname")
        protected String cbankname;
        @XmlAttribute(name = "cprinvince")
        protected String cprinvince;
        @XmlAttribute(name = "ccity")
        protected String ccity;
        @XmlAttribute(name = "caccname")
        protected String caccname;
        @XmlAttribute(name = "ccbbdepid")
        protected String ccbbdepid;
        @XmlAttribute(name = "cbranchid")
        protected String cbranchid;

        /**
         * 获取caccountnumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaccountnumber() {
            return caccountnumber;
        }

        /**
         * 设置caccountnumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaccountnumber(String value) {
            this.caccountnumber = value;
        }

        /**
         * 获取cpayunitid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpayunitid() {
            return cpayunitid;
        }

        /**
         * 设置cpayunitid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpayunitid(String value) {
            this.cpayunitid = value;
        }

        /**
         * 获取bisdefault属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBisdefault() {
            return bisdefault;
        }

        /**
         * 设置bisdefault属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBisdefault(String value) {
            this.bisdefault = value;
        }

        /**
         * 获取cbankid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbankid() {
            return cbankid;
        }

        /**
         * 设置cbankid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbankid(String value) {
            this.cbankid = value;
        }

        /**
         * 获取cbankname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbankname() {
            return cbankname;
        }

        /**
         * 设置cbankname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbankname(String value) {
            this.cbankname = value;
        }

        /**
         * 获取cprinvince属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCprinvince() {
            return cprinvince;
        }

        /**
         * 设置cprinvince属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCprinvince(String value) {
            this.cprinvince = value;
        }

        /**
         * 获取ccity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcity() {
            return ccity;
        }

        /**
         * 设置ccity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcity(String value) {
            this.ccity = value;
        }

        /**
         * 获取caccname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaccname() {
            return caccname;
        }

        /**
         * 设置caccname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaccname(String value) {
            this.caccname = value;
        }

        /**
         * 获取ccbbdepid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcbbdepid() {
            return ccbbdepid;
        }

        /**
         * 设置ccbbdepid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcbbdepid(String value) {
            this.ccbbdepid = value;
        }

        /**
         * 获取cbranchid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbranchid() {
            return cbranchid;
        }

        /**
         * 设置cbranchid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbranchid(String value) {
            this.cbranchid = value;
        }

    }

}
