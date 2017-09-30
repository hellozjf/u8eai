//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:54 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.storequantity;

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
 *         &lt;element name="storequantity" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="now" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="asked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="orderonroad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="arrivedgoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="production" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="moveonroad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="consignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="arrangedplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="expect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="frozen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disqualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="useable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="overtake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shortage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "storequantity"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Storequantity> storequantity;
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
     * Gets the value of the storequantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storequantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStorequantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Storequantity }
     * 
     * 
     */
    public List<Ufinterface.Storequantity> getStorequantity() {
        if (storequantity == null) {
            storequantity = new ArrayList<Ufinterface.Storequantity>();
        }
        return this.storequantity;
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
     *         &lt;element name="now" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="asked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="orderonroad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="arrivedgoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="production" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="moveonroad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ordered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="consignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="arrangedplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="expect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="frozen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disqualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="useable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dispersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="overtake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="deadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="shortage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "now",
        "asked",
        "orderonroad",
        "arrivedgoods",
        "production",
        "moveonroad",
        "ordered",
        "consignment",
        "arrangedplan",
        "translation",
        "expect",
        "frozen",
        "disqualification",
        "useable",
        "safeline",
        "dispersion",
        "headline",
        "overtake",
        "deadline",
        "shortage"
    })
    public static class Storequantity {

        protected String code;
        protected String now;
        protected String asked;
        protected String orderonroad;
        protected String arrivedgoods;
        protected String production;
        protected String moveonroad;
        protected String ordered;
        protected String consignment;
        protected String arrangedplan;
        protected String translation;
        protected String expect;
        protected String frozen;
        protected String disqualification;
        protected String useable;
        protected String safeline;
        protected String dispersion;
        protected String headline;
        protected String overtake;
        protected String deadline;
        protected String shortage;

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
         * 获取now属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNow() {
            return now;
        }

        /**
         * 设置now属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNow(String value) {
            this.now = value;
        }

        /**
         * 获取asked属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsked() {
            return asked;
        }

        /**
         * 设置asked属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsked(String value) {
            this.asked = value;
        }

        /**
         * 获取orderonroad属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderonroad() {
            return orderonroad;
        }

        /**
         * 设置orderonroad属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderonroad(String value) {
            this.orderonroad = value;
        }

        /**
         * 获取arrivedgoods属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivedgoods() {
            return arrivedgoods;
        }

        /**
         * 设置arrivedgoods属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivedgoods(String value) {
            this.arrivedgoods = value;
        }

        /**
         * 获取production属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProduction() {
            return production;
        }

        /**
         * 设置production属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProduction(String value) {
            this.production = value;
        }

        /**
         * 获取moveonroad属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoveonroad() {
            return moveonroad;
        }

        /**
         * 设置moveonroad属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoveonroad(String value) {
            this.moveonroad = value;
        }

        /**
         * 获取ordered属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrdered() {
            return ordered;
        }

        /**
         * 设置ordered属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrdered(String value) {
            this.ordered = value;
        }

        /**
         * 获取consignment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsignment() {
            return consignment;
        }

        /**
         * 设置consignment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsignment(String value) {
            this.consignment = value;
        }

        /**
         * 获取arrangedplan属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrangedplan() {
            return arrangedplan;
        }

        /**
         * 设置arrangedplan属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrangedplan(String value) {
            this.arrangedplan = value;
        }

        /**
         * 获取translation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTranslation() {
            return translation;
        }

        /**
         * 设置translation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTranslation(String value) {
            this.translation = value;
        }

        /**
         * 获取expect属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpect() {
            return expect;
        }

        /**
         * 设置expect属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpect(String value) {
            this.expect = value;
        }

        /**
         * 获取frozen属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrozen() {
            return frozen;
        }

        /**
         * 设置frozen属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrozen(String value) {
            this.frozen = value;
        }

        /**
         * 获取disqualification属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisqualification() {
            return disqualification;
        }

        /**
         * 设置disqualification属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisqualification(String value) {
            this.disqualification = value;
        }

        /**
         * 获取useable属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseable() {
            return useable;
        }

        /**
         * 设置useable属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseable(String value) {
            this.useable = value;
        }

        /**
         * 获取safeline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeline() {
            return safeline;
        }

        /**
         * 设置safeline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeline(String value) {
            this.safeline = value;
        }

        /**
         * 获取dispersion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDispersion() {
            return dispersion;
        }

        /**
         * 设置dispersion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDispersion(String value) {
            this.dispersion = value;
        }

        /**
         * 获取headline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHeadline() {
            return headline;
        }

        /**
         * 设置headline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHeadline(String value) {
            this.headline = value;
        }

        /**
         * 获取overtake属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOvertake() {
            return overtake;
        }

        /**
         * 设置overtake属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOvertake(String value) {
            this.overtake = value;
        }

        /**
         * 获取deadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeadline() {
            return deadline;
        }

        /**
         * 设置deadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeadline(String value) {
            this.deadline = value;
        }

        /**
         * 获取shortage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortage() {
            return shortage;
        }

        /**
         * 设置shortage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortage(String value) {
            this.shortage = value;
        }

    }

}
