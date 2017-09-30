//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:45 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.job;

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
 *         &lt;element name="job" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="jobcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="depcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="suporior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="builddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="abortdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobseries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobrank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="worksumm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobrankclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobrankbegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobrankend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobgradebegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="jobgradeend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "job"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    protected List<Ufinterface.Job> job;
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
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.Job }
     * 
     * 
     */
    public List<Ufinterface.Job> getJob() {
        if (job == null) {
            job = new ArrayList<Ufinterface.Job>();
        }
        return this.job;
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
     *         &lt;element name="jobcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="depcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="suporior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="builddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="abortdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobseries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobrank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="worksumm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobrankclasscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobrankbegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobrankend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobgradebegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="jobgradeend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "jobcode",
        "jobname",
        "depcode",
        "suporior",
        "builddate",
        "abortdate",
        "jobseries",
        "jobrank",
        "worksumm",
        "jobrankclasscode",
        "jobrankbegin",
        "jobrankend",
        "jobgradebegin",
        "jobgradeend"
    })
    public static class Job {

        protected String jobcode;
        protected String jobname;
        protected String depcode;
        protected String suporior;
        protected String builddate;
        protected String abortdate;
        protected String jobseries;
        protected String jobrank;
        protected String worksumm;
        protected String jobrankclasscode;
        protected String jobrankbegin;
        protected String jobrankend;
        protected String jobgradebegin;
        protected String jobgradeend;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * 获取jobcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobcode() {
            return jobcode;
        }

        /**
         * 设置jobcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobcode(String value) {
            this.jobcode = value;
        }

        /**
         * 获取jobname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobname() {
            return jobname;
        }

        /**
         * 设置jobname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobname(String value) {
            this.jobname = value;
        }

        /**
         * 获取depcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepcode() {
            return depcode;
        }

        /**
         * 设置depcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepcode(String value) {
            this.depcode = value;
        }

        /**
         * 获取suporior属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuporior() {
            return suporior;
        }

        /**
         * 设置suporior属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuporior(String value) {
            this.suporior = value;
        }

        /**
         * 获取builddate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuilddate() {
            return builddate;
        }

        /**
         * 设置builddate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuilddate(String value) {
            this.builddate = value;
        }

        /**
         * 获取abortdate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbortdate() {
            return abortdate;
        }

        /**
         * 设置abortdate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbortdate(String value) {
            this.abortdate = value;
        }

        /**
         * 获取jobseries属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobseries() {
            return jobseries;
        }

        /**
         * 设置jobseries属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobseries(String value) {
            this.jobseries = value;
        }

        /**
         * 获取jobrank属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobrank() {
            return jobrank;
        }

        /**
         * 设置jobrank属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobrank(String value) {
            this.jobrank = value;
        }

        /**
         * 获取worksumm属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorksumm() {
            return worksumm;
        }

        /**
         * 设置worksumm属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorksumm(String value) {
            this.worksumm = value;
        }

        /**
         * 获取jobrankclasscode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobrankclasscode() {
            return jobrankclasscode;
        }

        /**
         * 设置jobrankclasscode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobrankclasscode(String value) {
            this.jobrankclasscode = value;
        }

        /**
         * 获取jobrankbegin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobrankbegin() {
            return jobrankbegin;
        }

        /**
         * 设置jobrankbegin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobrankbegin(String value) {
            this.jobrankbegin = value;
        }

        /**
         * 获取jobrankend属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobrankend() {
            return jobrankend;
        }

        /**
         * 设置jobrankend属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobrankend(String value) {
            this.jobrankend = value;
        }

        /**
         * 获取jobgradebegin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobgradebegin() {
            return jobgradebegin;
        }

        /**
         * 设置jobgradebegin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobgradebegin(String value) {
            this.jobgradebegin = value;
        }

        /**
         * 获取jobgradeend属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJobgradeend() {
            return jobgradeend;
        }

        /**
         * 设置jobgradeend属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJobgradeend(String value) {
            this.jobgradeend = value;
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
