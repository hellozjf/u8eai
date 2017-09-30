//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:18 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.capitalassettypes;

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
 *         &lt;element name="capitalassettypes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assettypeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assettypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deprmethodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deprtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dblbvrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="life" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="modelid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assetsubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deprtotalsubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="decpresubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bnotcanretdecvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cleanupsubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bnewassetdepr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "capitalassettypes"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Capitalassettypes> capitalassettypes;
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
     * Gets the value of the capitalassettypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capitalassettypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapitalassettypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Capitalassettypes }
     * 
     * 
     */
    public List<Ufinterface.Capitalassettypes> getCapitalassettypes() {
        if (capitalassettypes == null) {
            capitalassettypes = new ArrayList<Ufinterface.Capitalassettypes>();
        }
        return this.capitalassettypes;
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
     *         &lt;element name="assettypeno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assettypename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deprmethodnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deprtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dblbvrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="life" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="modelid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assetsubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deprtotalsubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="decpresubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bnotcanretdecvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cleanupsubjectnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bnewassetdepr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assettypeno",
        "assettypename",
        "deprmethodnum",
        "deprtype",
        "dblbvrate",
        "unit",
        "life",
        "modelid",
        "assetsubjectnum",
        "deprtotalsubjectnum",
        "decpresubjectnum",
        "bnotcanretdecvalue",
        "cleanupsubjectnum",
        "bnewassetdepr"
    })
    public static class Capitalassettypes {

        protected String assettypeno;
        protected String assettypename;
        protected String deprmethodnum;
        protected String deprtype;
        protected String dblbvrate;
        protected String unit;
        protected String life;
        protected String modelid;
        protected String assetsubjectnum;
        protected String deprtotalsubjectnum;
        protected String decpresubjectnum;
        protected String bnotcanretdecvalue;
        protected String cleanupsubjectnum;
        protected String bnewassetdepr;

        /**
         * 获取assettypeno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssettypeno() {
            return assettypeno;
        }

        /**
         * 设置assettypeno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssettypeno(String value) {
            this.assettypeno = value;
        }

        /**
         * 获取assettypename属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssettypename() {
            return assettypename;
        }

        /**
         * 设置assettypename属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssettypename(String value) {
            this.assettypename = value;
        }

        /**
         * 获取deprmethodnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeprmethodnum() {
            return deprmethodnum;
        }

        /**
         * 设置deprmethodnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeprmethodnum(String value) {
            this.deprmethodnum = value;
        }

        /**
         * 获取deprtype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeprtype() {
            return deprtype;
        }

        /**
         * 设置deprtype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeprtype(String value) {
            this.deprtype = value;
        }

        /**
         * 获取dblbvrate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDblbvrate() {
            return dblbvrate;
        }

        /**
         * 设置dblbvrate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDblbvrate(String value) {
            this.dblbvrate = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * 获取life属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLife() {
            return life;
        }

        /**
         * 设置life属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLife(String value) {
            this.life = value;
        }

        /**
         * 获取modelid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModelid() {
            return modelid;
        }

        /**
         * 设置modelid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModelid(String value) {
            this.modelid = value;
        }

        /**
         * 获取assetsubjectnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssetsubjectnum() {
            return assetsubjectnum;
        }

        /**
         * 设置assetsubjectnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssetsubjectnum(String value) {
            this.assetsubjectnum = value;
        }

        /**
         * 获取deprtotalsubjectnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeprtotalsubjectnum() {
            return deprtotalsubjectnum;
        }

        /**
         * 设置deprtotalsubjectnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeprtotalsubjectnum(String value) {
            this.deprtotalsubjectnum = value;
        }

        /**
         * 获取decpresubjectnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDecpresubjectnum() {
            return decpresubjectnum;
        }

        /**
         * 设置decpresubjectnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDecpresubjectnum(String value) {
            this.decpresubjectnum = value;
        }

        /**
         * 获取bnotcanretdecvalue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBnotcanretdecvalue() {
            return bnotcanretdecvalue;
        }

        /**
         * 设置bnotcanretdecvalue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBnotcanretdecvalue(String value) {
            this.bnotcanretdecvalue = value;
        }

        /**
         * 获取cleanupsubjectnum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCleanupsubjectnum() {
            return cleanupsubjectnum;
        }

        /**
         * 设置cleanupsubjectnum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCleanupsubjectnum(String value) {
            this.cleanupsubjectnum = value;
        }

        /**
         * 获取bnewassetdepr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBnewassetdepr() {
            return bnewassetdepr;
        }

        /**
         * 设置bnewassetdepr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBnewassetdepr(String value) {
            this.bnewassetdepr = value;
        }

    }

}
