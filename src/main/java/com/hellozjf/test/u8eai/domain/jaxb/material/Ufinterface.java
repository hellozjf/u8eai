//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:47 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.material;

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
 *         &lt;element name="material" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="departmentno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="productno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="inventoryno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totalmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bomver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bomvertd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="moroutesn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mosubsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ompflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sfree10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="badjust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "material"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Material> material;
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
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Material }
     * 
     * 
     */
    public List<Ufinterface.Material> getMaterial() {
        if (material == null) {
            material = new ArrayList<Ufinterface.Material>();
        }
        return this.material;
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
     *         &lt;element name="departmentno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="productno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="inventoryno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totalmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bomver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bomvertd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="moroutesn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mocode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mosubsn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ompflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sfree10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="badjust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "departmentno",
        "productno",
        "inventoryno",
        "serial",
        "price",
        "quantity",
        "period",
        "totalmoney",
        "free1",
        "free2",
        "free3",
        "free4",
        "free5",
        "free6",
        "free7",
        "free8",
        "free9",
        "free10",
        "bomver",
        "bomvertd",
        "moroutesn",
        "mocode",
        "mosubsn",
        "ompflag",
        "sfree1",
        "sfree2",
        "sfree3",
        "sfree4",
        "sfree5",
        "sfree6",
        "sfree7",
        "sfree8",
        "sfree9",
        "sfree10",
        "badjust"
    })
    public static class Material {

        protected String departmentno;
        protected String productno;
        protected String inventoryno;
        protected String serial;
        protected String price;
        protected String quantity;
        protected String period;
        protected String totalmoney;
        protected String free1;
        protected String free2;
        protected String free3;
        protected String free4;
        protected String free5;
        protected String free6;
        protected String free7;
        protected String free8;
        protected String free9;
        protected String free10;
        protected String bomver;
        protected String bomvertd;
        protected String moroutesn;
        protected String mocode;
        protected String mosubsn;
        protected String ompflag;
        protected String sfree1;
        protected String sfree2;
        protected String sfree3;
        protected String sfree4;
        protected String sfree5;
        protected String sfree6;
        protected String sfree7;
        protected String sfree8;
        protected String sfree9;
        protected String sfree10;
        protected String badjust;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * 获取departmentno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartmentno() {
            return departmentno;
        }

        /**
         * 设置departmentno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartmentno(String value) {
            this.departmentno = value;
        }

        /**
         * 获取productno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductno() {
            return productno;
        }

        /**
         * 设置productno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductno(String value) {
            this.productno = value;
        }

        /**
         * 获取inventoryno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInventoryno() {
            return inventoryno;
        }

        /**
         * 设置inventoryno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInventoryno(String value) {
            this.inventoryno = value;
        }

        /**
         * 获取serial属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerial() {
            return serial;
        }

        /**
         * 设置serial属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerial(String value) {
            this.serial = value;
        }

        /**
         * 获取price属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrice() {
            return price;
        }

        /**
         * 设置price属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrice(String value) {
            this.price = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

        /**
         * 获取period属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriod() {
            return period;
        }

        /**
         * 设置period属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriod(String value) {
            this.period = value;
        }

        /**
         * 获取totalmoney属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalmoney() {
            return totalmoney;
        }

        /**
         * 设置totalmoney属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalmoney(String value) {
            this.totalmoney = value;
        }

        /**
         * 获取free1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree1() {
            return free1;
        }

        /**
         * 设置free1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree1(String value) {
            this.free1 = value;
        }

        /**
         * 获取free2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree2() {
            return free2;
        }

        /**
         * 设置free2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree2(String value) {
            this.free2 = value;
        }

        /**
         * 获取free3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree3() {
            return free3;
        }

        /**
         * 设置free3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree3(String value) {
            this.free3 = value;
        }

        /**
         * 获取free4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree4() {
            return free4;
        }

        /**
         * 设置free4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree4(String value) {
            this.free4 = value;
        }

        /**
         * 获取free5属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree5() {
            return free5;
        }

        /**
         * 设置free5属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree5(String value) {
            this.free5 = value;
        }

        /**
         * 获取free6属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree6() {
            return free6;
        }

        /**
         * 设置free6属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree6(String value) {
            this.free6 = value;
        }

        /**
         * 获取free7属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree7() {
            return free7;
        }

        /**
         * 设置free7属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree7(String value) {
            this.free7 = value;
        }

        /**
         * 获取free8属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree8() {
            return free8;
        }

        /**
         * 设置free8属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree8(String value) {
            this.free8 = value;
        }

        /**
         * 获取free9属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree9() {
            return free9;
        }

        /**
         * 设置free9属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree9(String value) {
            this.free9 = value;
        }

        /**
         * 获取free10属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFree10() {
            return free10;
        }

        /**
         * 设置free10属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFree10(String value) {
            this.free10 = value;
        }

        /**
         * 获取bomver属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBomver() {
            return bomver;
        }

        /**
         * 设置bomver属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBomver(String value) {
            this.bomver = value;
        }

        /**
         * 获取bomvertd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBomvertd() {
            return bomvertd;
        }

        /**
         * 设置bomvertd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBomvertd(String value) {
            this.bomvertd = value;
        }

        /**
         * 获取moroutesn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoroutesn() {
            return moroutesn;
        }

        /**
         * 设置moroutesn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoroutesn(String value) {
            this.moroutesn = value;
        }

        /**
         * 获取mocode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMocode() {
            return mocode;
        }

        /**
         * 设置mocode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMocode(String value) {
            this.mocode = value;
        }

        /**
         * 获取mosubsn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMosubsn() {
            return mosubsn;
        }

        /**
         * 设置mosubsn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMosubsn(String value) {
            this.mosubsn = value;
        }

        /**
         * 获取ompflag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOmpflag() {
            return ompflag;
        }

        /**
         * 设置ompflag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOmpflag(String value) {
            this.ompflag = value;
        }

        /**
         * 获取sfree1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree1() {
            return sfree1;
        }

        /**
         * 设置sfree1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree1(String value) {
            this.sfree1 = value;
        }

        /**
         * 获取sfree2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree2() {
            return sfree2;
        }

        /**
         * 设置sfree2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree2(String value) {
            this.sfree2 = value;
        }

        /**
         * 获取sfree3属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree3() {
            return sfree3;
        }

        /**
         * 设置sfree3属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree3(String value) {
            this.sfree3 = value;
        }

        /**
         * 获取sfree4属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree4() {
            return sfree4;
        }

        /**
         * 设置sfree4属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree4(String value) {
            this.sfree4 = value;
        }

        /**
         * 获取sfree5属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree5() {
            return sfree5;
        }

        /**
         * 设置sfree5属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree5(String value) {
            this.sfree5 = value;
        }

        /**
         * 获取sfree6属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree6() {
            return sfree6;
        }

        /**
         * 设置sfree6属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree6(String value) {
            this.sfree6 = value;
        }

        /**
         * 获取sfree7属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree7() {
            return sfree7;
        }

        /**
         * 设置sfree7属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree7(String value) {
            this.sfree7 = value;
        }

        /**
         * 获取sfree8属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree8() {
            return sfree8;
        }

        /**
         * 设置sfree8属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree8(String value) {
            this.sfree8 = value;
        }

        /**
         * 获取sfree9属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree9() {
            return sfree9;
        }

        /**
         * 设置sfree9属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree9(String value) {
            this.sfree9 = value;
        }

        /**
         * 获取sfree10属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSfree10() {
            return sfree10;
        }

        /**
         * 设置sfree10属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSfree10(String value) {
            this.sfree10 = value;
        }

        /**
         * 获取badjust属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBadjust() {
            return badjust;
        }

        /**
         * 设置badjust属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBadjust(String value) {
            this.badjust = value;
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
