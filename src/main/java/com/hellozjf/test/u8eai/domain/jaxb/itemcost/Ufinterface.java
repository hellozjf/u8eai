//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:47 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.itemcost;

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
 *         &lt;element name="itemcost" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="iperiod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ccentercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="citemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ckeycode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ckeycode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="celementcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="detail" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cost_detail_statement" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cost_detail" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="ccodemx" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="inumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="iuprice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itemcost"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Itemcost> itemcost;
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
     * Gets the value of the itemcost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemcost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemcost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Itemcost }
     * 
     * 
     */
    public List<Ufinterface.Itemcost> getItemcost() {
        if (itemcost == null) {
            itemcost = new ArrayList<Ufinterface.Itemcost>();
        }
        return this.itemcost;
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
     *       &lt;sequence>
     *         &lt;element name="iperiod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ccentercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="citemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ckeycode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ckeycode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="celementcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="detail" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cost_detail_statement" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cost_detail" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="ccodemx" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="inumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="iuprice" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
        "iperiod",
        "ccentercode",
        "citemcode",
        "ckeycode1",
        "ckeycode2",
        "celementcode",
        "iamount",
        "detail"
    })
    public static class Itemcost {

        protected String iperiod;
        protected String ccentercode;
        protected String citemcode;
        protected String ckeycode1;
        protected String ckeycode2;
        protected String celementcode;
        protected String iamount;
        protected List<Ufinterface.Itemcost.Detail> detail;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * 获取iperiod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIperiod() {
            return iperiod;
        }

        /**
         * 设置iperiod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIperiod(String value) {
            this.iperiod = value;
        }

        /**
         * 获取ccentercode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCcentercode() {
            return ccentercode;
        }

        /**
         * 设置ccentercode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCcentercode(String value) {
            this.ccentercode = value;
        }

        /**
         * 获取citemcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitemcode() {
            return citemcode;
        }

        /**
         * 设置citemcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCitemcode(String value) {
            this.citemcode = value;
        }

        /**
         * 获取ckeycode1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCkeycode1() {
            return ckeycode1;
        }

        /**
         * 设置ckeycode1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCkeycode1(String value) {
            this.ckeycode1 = value;
        }

        /**
         * 获取ckeycode2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCkeycode2() {
            return ckeycode2;
        }

        /**
         * 设置ckeycode2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCkeycode2(String value) {
            this.ckeycode2 = value;
        }

        /**
         * 获取celementcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCelementcode() {
            return celementcode;
        }

        /**
         * 设置celementcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCelementcode(String value) {
            this.celementcode = value;
        }

        /**
         * 获取iamount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIamount() {
            return iamount;
        }

        /**
         * 设置iamount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIamount(String value) {
            this.iamount = value;
        }

        /**
         * Gets the value of the detail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.Itemcost.Detail }
         * 
         * 
         */
        public List<Ufinterface.Itemcost.Detail> getDetail() {
            if (detail == null) {
                detail = new ArrayList<Ufinterface.Itemcost.Detail>();
            }
            return this.detail;
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
         *         &lt;element name="cost_detail_statement" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cost_detail" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="ccodemx" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="inumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="iuprice" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "costDetailStatement"
        })
        public static class Detail {

            @XmlElement(name = "cost_detail_statement")
            protected List<Ufinterface.Itemcost.Detail.CostDetailStatement> costDetailStatement;

            /**
             * Gets the value of the costDetailStatement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the costDetailStatement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCostDetailStatement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ufinterface.Itemcost.Detail.CostDetailStatement }
             * 
             * 
             */
            public List<Ufinterface.Itemcost.Detail.CostDetailStatement> getCostDetailStatement() {
                if (costDetailStatement == null) {
                    costDetailStatement = new ArrayList<Ufinterface.Itemcost.Detail.CostDetailStatement>();
                }
                return this.costDetailStatement;
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
             *         &lt;element name="cost_detail" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="ccodemx" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="inumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="iuprice" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "costDetail"
            })
            public static class CostDetailStatement {

                @XmlElement(name = "cost_detail")
                protected List<Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail> costDetail;

                /**
                 * Gets the value of the costDetail property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the costDetail property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCostDetail().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail }
                 * 
                 * 
                 */
                public List<Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail> getCostDetail() {
                    if (costDetail == null) {
                        costDetail = new ArrayList<Ufinterface.Itemcost.Detail.CostDetailStatement.CostDetail>();
                    }
                    return this.costDetail;
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
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="ccodemx" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="inumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="iuprice" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="iamount" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CostDetail {

                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "ccodemx")
                    protected String ccodemx;
                    @XmlAttribute(name = "inumber")
                    protected String inumber;
                    @XmlAttribute(name = "iuprice")
                    protected String iuprice;
                    @XmlAttribute(name = "iamount")
                    protected String iamount;

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

                    /**
                     * 获取ccodemx属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCcodemx() {
                        return ccodemx;
                    }

                    /**
                     * 设置ccodemx属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCcodemx(String value) {
                        this.ccodemx = value;
                    }

                    /**
                     * 获取inumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getInumber() {
                        return inumber;
                    }

                    /**
                     * 设置inumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setInumber(String value) {
                        this.inumber = value;
                    }

                    /**
                     * 获取iuprice属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIuprice() {
                        return iuprice;
                    }

                    /**
                     * 设置iuprice属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIuprice(String value) {
                        this.iuprice = value;
                    }

                    /**
                     * 获取iamount属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIamount() {
                        return iamount;
                    }

                    /**
                     * 设置iamount属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIamount(String value) {
                        this.iamount = value;
                    }

                }

            }

        }

    }

}
