//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:58 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.unitdocument;

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
 *         &lt;element name="unitdocument" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="cunitid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cunitname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cunitsname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cclass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ccusid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="csupid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="caddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cpostcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ctelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ctelefax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cmobiletele" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cemail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="clinkman" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cremark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cbankcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cdepid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="cpersonid" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "unitdocument"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Unitdocument> unitdocument;
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
     * Gets the value of the unitdocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitdocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitdocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Unitdocument }
     * 
     * 
     */
    public List<Ufinterface.Unitdocument> getUnitdocument() {
        if (unitdocument == null) {
            unitdocument = new ArrayList<Ufinterface.Unitdocument>();
        }
        return this.unitdocument;
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
     *       &lt;attribute name="cunitid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cunitname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cunitsname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cclass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ccusid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="csupid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="caddress" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cpostcode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ctelephone" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ctelefax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbp" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cmobiletele" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cemail" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="clinkman" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cremark" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cbankcode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cdepid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="cpersonid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Unitdocument {

        @XmlAttribute(name = "cunitid")
        protected String cunitid;
        @XmlAttribute(name = "cunitname")
        protected String cunitname;
        @XmlAttribute(name = "cunitsname")
        protected String cunitsname;
        @XmlAttribute(name = "cclass")
        protected String cclass;
        @XmlAttribute(name = "ccusid")
        protected String ccusid;
        @XmlAttribute(name = "csupid")
        protected String csupid;
        @XmlAttribute(name = "caddress")
        protected String caddress;
        @XmlAttribute(name = "cpostcode")
        protected String cpostcode;
        @XmlAttribute(name = "ctelephone")
        protected String ctelephone;
        @XmlAttribute(name = "ctelefax")
        protected String ctelefax;
        @XmlAttribute(name = "cbp")
        protected String cbp;
        @XmlAttribute(name = "cmobiletele")
        protected String cmobiletele;
        @XmlAttribute(name = "cemail")
        protected String cemail;
        @XmlAttribute(name = "clinkman")
        protected String clinkman;
        @XmlAttribute(name = "cremark")
        protected String cremark;
        @XmlAttribute(name = "cbankcode")
        protected String cbankcode;
        @XmlAttribute(name = "cdepid")
        protected String cdepid;
        @XmlAttribute(name = "cpersonid")
        protected String cpersonid;

        /**
         * 获取cunitid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCunitid() {
            return cunitid;
        }

        /**
         * 设置cunitid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCunitid(String value) {
            this.cunitid = value;
        }

        /**
         * 获取cunitname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCunitname() {
            return cunitname;
        }

        /**
         * 设置cunitname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCunitname(String value) {
            this.cunitname = value;
        }

        /**
         * 获取cunitsname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCunitsname() {
            return cunitsname;
        }

        /**
         * 设置cunitsname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCunitsname(String value) {
            this.cunitsname = value;
        }

        /**
         * 获取cclass属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCclass() {
            return cclass;
        }

        /**
         * 设置cclass属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCclass(String value) {
            this.cclass = value;
        }

        /**
         * 获取ccusid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcusid() {
            return ccusid;
        }

        /**
         * 设置ccusid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcusid(String value) {
            this.ccusid = value;
        }

        /**
         * 获取csupid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCsupid() {
            return csupid;
        }

        /**
         * 设置csupid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCsupid(String value) {
            this.csupid = value;
        }

        /**
         * 获取caddress属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaddress() {
            return caddress;
        }

        /**
         * 设置caddress属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaddress(String value) {
            this.caddress = value;
        }

        /**
         * 获取cpostcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpostcode() {
            return cpostcode;
        }

        /**
         * 设置cpostcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpostcode(String value) {
            this.cpostcode = value;
        }

        /**
         * 获取ctelephone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtelephone() {
            return ctelephone;
        }

        /**
         * 设置ctelephone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtelephone(String value) {
            this.ctelephone = value;
        }

        /**
         * 获取ctelefax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCtelefax() {
            return ctelefax;
        }

        /**
         * 设置ctelefax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCtelefax(String value) {
            this.ctelefax = value;
        }

        /**
         * 获取cbp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbp() {
            return cbp;
        }

        /**
         * 设置cbp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbp(String value) {
            this.cbp = value;
        }

        /**
         * 获取cmobiletele属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCmobiletele() {
            return cmobiletele;
        }

        /**
         * 设置cmobiletele属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCmobiletele(String value) {
            this.cmobiletele = value;
        }

        /**
         * 获取cemail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCemail() {
            return cemail;
        }

        /**
         * 设置cemail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCemail(String value) {
            this.cemail = value;
        }

        /**
         * 获取clinkman属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClinkman() {
            return clinkman;
        }

        /**
         * 设置clinkman属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClinkman(String value) {
            this.clinkman = value;
        }

        /**
         * 获取cremark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCremark() {
            return cremark;
        }

        /**
         * 设置cremark属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCremark(String value) {
            this.cremark = value;
        }

        /**
         * 获取cbankcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCbankcode() {
            return cbankcode;
        }

        /**
         * 设置cbankcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCbankcode(String value) {
            this.cbankcode = value;
        }

        /**
         * 获取cdepid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCdepid() {
            return cdepid;
        }

        /**
         * 设置cdepid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCdepid(String value) {
            this.cdepid = value;
        }

        /**
         * 获取cpersonid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpersonid() {
            return cpersonid;
        }

        /**
         * 设置cpersonid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpersonid(String value) {
            this.cpersonid = value;
        }

    }

}
