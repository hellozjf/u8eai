//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:13 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.atprule;

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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ATPRules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ATPRule" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ATPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OverDemandDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OverSupplyDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InfiniteSupplyDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DemandFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SupplyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "atpRules"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "ATPRules")
    protected List<Ufinterface.ATPRules> atpRules;

    /**
     * Gets the value of the atpRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atpRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATPRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.ATPRules }
     * 
     * 
     */
    public List<Ufinterface.ATPRules> getATPRules() {
        if (atpRules == null) {
            atpRules = new ArrayList<Ufinterface.ATPRules>();
        }
        return this.atpRules;
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
     *         &lt;element name="ATPRule" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ATPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OverDemandDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OverSupplyDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InfiniteSupplyDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DemandFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SupplyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "atpRule"
    })
    public static class ATPRules {

        @XmlElement(name = "ATPRule")
        protected List<Ufinterface.ATPRules.ATPRule> atpRule;

        /**
         * Gets the value of the atpRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the atpRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getATPRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.ATPRules.ATPRule }
         * 
         * 
         */
        public List<Ufinterface.ATPRules.ATPRule> getATPRule() {
            if (atpRule == null) {
                atpRule = new ArrayList<Ufinterface.ATPRules.ATPRule>();
            }
            return this.atpRule;
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
         *         &lt;element name="ATPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OverDemandDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OverSupplyDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InfiniteSupplyDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DemandFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SupplyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "atpCode",
            "description",
            "overDemandDays",
            "overSupplyDays",
            "infiniteSupplyDays",
            "demandFlag",
            "supplyFlag"
        })
        public static class ATPRule {

            @XmlElement(name = "ATPCode")
            protected String atpCode;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "OverDemandDays")
            protected String overDemandDays;
            @XmlElement(name = "OverSupplyDays")
            protected String overSupplyDays;
            @XmlElement(name = "InfiniteSupplyDays")
            protected String infiniteSupplyDays;
            @XmlElement(name = "DemandFlag")
            protected String demandFlag;
            @XmlElement(name = "SupplyFlag")
            protected String supplyFlag;

            /**
             * 获取atpCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getATPCode() {
                return atpCode;
            }

            /**
             * 设置atpCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setATPCode(String value) {
                this.atpCode = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * 获取overDemandDays属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverDemandDays() {
                return overDemandDays;
            }

            /**
             * 设置overDemandDays属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverDemandDays(String value) {
                this.overDemandDays = value;
            }

            /**
             * 获取overSupplyDays属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverSupplyDays() {
                return overSupplyDays;
            }

            /**
             * 设置overSupplyDays属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverSupplyDays(String value) {
                this.overSupplyDays = value;
            }

            /**
             * 获取infiniteSupplyDays属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfiniteSupplyDays() {
                return infiniteSupplyDays;
            }

            /**
             * 设置infiniteSupplyDays属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfiniteSupplyDays(String value) {
                this.infiniteSupplyDays = value;
            }

            /**
             * 获取demandFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDemandFlag() {
                return demandFlag;
            }

            /**
             * 设置demandFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDemandFlag(String value) {
                this.demandFlag = value;
            }

            /**
             * 获取supplyFlag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplyFlag() {
                return supplyFlag;
            }

            /**
             * 设置supplyFlag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplyFlag(String value) {
                this.supplyFlag = value;
            }

        }

    }

}
