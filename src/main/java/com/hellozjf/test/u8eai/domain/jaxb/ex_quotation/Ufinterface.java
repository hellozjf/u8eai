//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.09.30 时间 03:26:48 PM CST 
//


package com.hellozjf.test.u8eai.domain.jaxb.ex_quotation;

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
 *         &lt;element name="ex_quotation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="header" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="chinesesummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="comvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="aportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="containersize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cuscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusabbname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusenaddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusenaddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusenaddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusenaddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusoaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cusperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="depcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="engaddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="engaddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="engaddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="engaddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="englishsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exch_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="incotermcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="incotermremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="invgeneraldesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="outaftercredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="receiveaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="receivecompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="receiveperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="shipvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="svencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="unitenglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="unitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="unittel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="invaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastedshippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="validdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="containerqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exchrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fobsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generalcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generalcomrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generalcomremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generaloverflowitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generaloverflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generaltaxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="natfobsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="natgeneralcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="natsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="statsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="summoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ffreightsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fnatfreightsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bfreighttofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="finsurancesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fnatinsurancesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="binsurancetofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cinsurancevencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bcommisiontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bcommisiontofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ibatchshippingid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cbatchshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ivtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="body" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="pricecontailtax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="comcriterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="comrule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="comunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="comunitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="configstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cusinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cusinvname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="englishname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="enplural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ensingular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="invcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="item_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="materialsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="packinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="packsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="sacomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="vcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="volumes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="wcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="dk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="dk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lineclosedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="shippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="changrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="comcoefficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="commoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="comrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="freight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="gweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="gweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natfobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natfreight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natinsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="nattaxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="nattaxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="nweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="nweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="overflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="packqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ppartqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="taxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="quotationrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="kl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="kl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fcost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fgrossrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="centerprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="flength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fheight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="citem_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="citem_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="citemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="citemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="iciqbookid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cciqbookcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cciqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fciqchangrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "exQuotation"
})
@XmlRootElement(name = "ufinterface")
public class Ufinterface {

    @XmlElement(name = "ex_quotation")
    protected List<Ufinterface.ExQuotation> exQuotation;
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
     * Gets the value of the exQuotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exQuotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExQuotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ufinterface.ExQuotation }
     * 
     * 
     */
    public List<Ufinterface.ExQuotation> getExQuotation() {
        if (exQuotation == null) {
            exQuotation = new ArrayList<Ufinterface.ExQuotation>();
        }
        return this.exQuotation;
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
     *         &lt;element name="header" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="chinesesummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="comvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="aportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="containersize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cuscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusabbname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusenaddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusenaddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusenaddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusenaddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusoaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cusperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="depcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="engaddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="engaddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="engaddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="engaddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="englishsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exch_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="incotermcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="incotermremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="invgeneraldesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="outaftercredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="receiveaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="receivecompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="receiveperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="shipvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="svencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="unitenglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="unitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="unittel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="invaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastedshippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="validdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="containerqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exchrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fobsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generalcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generalcomrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generalcomremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generaloverflowitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generaloverflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generaltaxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="natfobsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="natgeneralcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="natsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="statsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="summoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ffreightsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fnatfreightsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bfreighttofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="finsurancesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fnatinsurancesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="binsurancetofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cinsurancevencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bcommisiontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bcommisiontofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ibatchshippingid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cbatchshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ivtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="body" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="pricecontailtax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="comcriterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="comrule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="comunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="comunitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="configstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cusinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cusinvname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="englishname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="enplural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ensingular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="free10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="invcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="item_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="materialsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="packinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="packsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="sacomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="vcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="volumes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="wcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="dk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="dk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lineclosedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="shippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="changrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="comcoefficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="commoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="comrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="freight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="gweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="gweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natfobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natfreight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natinsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="nattaxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="nattaxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="nweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="nweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="overflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="packqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ppartqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="taxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="quotationrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="kl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="kl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fcost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fgrossrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="centerprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="flength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fheight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="citem_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="citem_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="citemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="citemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="iciqbookid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cciqbookcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cciqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fciqchangrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "header",
        "body"
    })
    public static class ExQuotation {

        protected List<Ufinterface.ExQuotation.Header> header;
        protected List<Ufinterface.ExQuotation.Body> body;

        /**
         * Gets the value of the header property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the header property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.ExQuotation.Header }
         * 
         * 
         */
        public List<Ufinterface.ExQuotation.Header> getHeader() {
            if (header == null) {
                header = new ArrayList<Ufinterface.ExQuotation.Header>();
            }
            return this.header;
        }

        /**
         * Gets the value of the body property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the body property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBody().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ufinterface.ExQuotation.Body }
         * 
         * 
         */
        public List<Ufinterface.ExQuotation.Body> getBody() {
            if (body == null) {
                body = new ArrayList<Ufinterface.ExQuotation.Body>();
            }
            return this.body;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="pricecontailtax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="comcriterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="comrule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="comunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="comunitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="configstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cusinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cusinvname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="englishname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="enplural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ensingular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="invcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="item_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="materialsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="packinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="packsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="sacomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="vcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="volumes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="wcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="dk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="dk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lineclosedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="shippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="changrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="comcoefficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="commoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="comrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="freight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="gweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="gweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natfobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natfreight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natinsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="nattaxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="nattaxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="nweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="nweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="overflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="packqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ppartqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="taxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="quotationrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="kl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="kl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fcost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fgrossrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="centerprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="flength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fheight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="citem_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="citem_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="citemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="citemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="iciqbookid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cciqbookcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cciqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fciqchangrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "entry"
        })
        public static class Body {

            protected List<Ufinterface.ExQuotation.Body.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Ufinterface.ExQuotation.Body.Entry }
             * 
             * 
             */
            public List<Ufinterface.ExQuotation.Body.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<Ufinterface.ExQuotation.Body.Entry>();
                }
                return this.entry;
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
             *         &lt;element name="pricecontailtax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="comcriterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="comrule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="comunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="comunitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="configstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cusinvcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cusinvname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define22" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define23" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define24" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define25" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define26" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define27" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define28" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define29" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define30" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define33" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define34" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define35" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define36" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="define37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="englishname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="enplural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ensingular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *         &lt;element name="invcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="item_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="item_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="itemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="itemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="materialsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="packinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="packsize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="sacomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="vcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="volumes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="wcomunitcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="dk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="dk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lineclosedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="shippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="changrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="comcoefficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="commoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="comrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="freight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="gweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="gweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="insurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natdiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natfobmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natfreight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natinsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="natprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="nattax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="nattaxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="nattaxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="nweight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="nweights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="overflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="packqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ppartqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="quotedprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="tax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="taxmoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="taxprice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="taxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="quotationrowno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="kl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="kl2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fcost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fgrossrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="centerprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="flength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fwidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fheight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="citem_class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="citem_cname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="citemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="citemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="iciqbookid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cciqbookcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cciqcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fciqchangrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "pricecontailtax",
                "comcriterion",
                "comrule",
                "comunitcode",
                "comunitname",
                "configstatus",
                "cusinvcode",
                "cusinvname",
                "define22",
                "define23",
                "define24",
                "define25",
                "define26",
                "define27",
                "define28",
                "define29",
                "define30",
                "define31",
                "define32",
                "define33",
                "define34",
                "define35",
                "define36",
                "define37",
                "englishname",
                "enplural",
                "ensingular",
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
                "invcode",
                "itemClass",
                "itemCname",
                "itemcode",
                "itemname",
                "materialsize",
                "memo",
                "packinfo",
                "packsize",
                "sacomunitcode",
                "vcomunitcode",
                "volumes",
                "wcomunitcode",
                "dk",
                "dk2",
                "lineclosedate",
                "shippingdate",
                "changrate",
                "comcoefficient",
                "commoney",
                "comrate",
                "discount",
                "fobmoney",
                "freight",
                "gweight",
                "gweights",
                "insurance",
                "money",
                "natcommoney",
                "natdiscount",
                "natfobmoney",
                "natfreight",
                "natinsurance",
                "natmoney",
                "natprice",
                "nattax",
                "nattaxmoney",
                "nattaxprice",
                "num",
                "nweight",
                "nweights",
                "overflowrange",
                "packqty",
                "ppartqty",
                "price",
                "quantity",
                "quotedprice",
                "tax",
                "taxmoney",
                "taxprice",
                "taxrate",
                "volume",
                "grouptype",
                "quotationrowno",
                "kl",
                "kl2",
                "fcost",
                "fgrossrate",
                "cvencode",
                "centerprise",
                "flength",
                "fwidth",
                "fheight",
                "citemClass",
                "citemCname",
                "citemcode",
                "citemname",
                "iciqbookid",
                "cciqbookcode",
                "cciqcode",
                "fciqchangrate"
            })
            public static class Entry {

                protected String pricecontailtax;
                protected String comcriterion;
                protected String comrule;
                protected String comunitcode;
                protected String comunitname;
                protected String configstatus;
                protected String cusinvcode;
                protected String cusinvname;
                protected String define22;
                protected String define23;
                protected String define24;
                protected String define25;
                protected String define26;
                protected String define27;
                protected String define28;
                protected String define29;
                protected String define30;
                protected String define31;
                protected String define32;
                protected String define33;
                protected String define34;
                protected String define35;
                protected String define36;
                protected String define37;
                protected String englishname;
                protected String enplural;
                protected String ensingular;
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
                protected String invcode;
                @XmlElement(name = "item_class")
                protected String itemClass;
                @XmlElement(name = "item_cname")
                protected String itemCname;
                protected String itemcode;
                protected String itemname;
                protected String materialsize;
                protected String memo;
                protected String packinfo;
                protected String packsize;
                protected String sacomunitcode;
                protected String vcomunitcode;
                protected String volumes;
                protected String wcomunitcode;
                protected String dk;
                protected String dk2;
                protected String lineclosedate;
                protected String shippingdate;
                protected String changrate;
                protected String comcoefficient;
                protected String commoney;
                protected String comrate;
                protected String discount;
                protected String fobmoney;
                protected String freight;
                protected String gweight;
                protected String gweights;
                protected String insurance;
                protected String money;
                protected String natcommoney;
                protected String natdiscount;
                protected String natfobmoney;
                protected String natfreight;
                protected String natinsurance;
                protected String natmoney;
                protected String natprice;
                protected String nattax;
                protected String nattaxmoney;
                protected String nattaxprice;
                protected String num;
                protected String nweight;
                protected String nweights;
                protected String overflowrange;
                protected String packqty;
                protected String ppartqty;
                protected String price;
                protected String quantity;
                protected String quotedprice;
                protected String tax;
                protected String taxmoney;
                protected String taxprice;
                protected String taxrate;
                protected String volume;
                protected String grouptype;
                protected String quotationrowno;
                protected String kl;
                protected String kl2;
                protected String fcost;
                protected String fgrossrate;
                protected String cvencode;
                protected String centerprise;
                protected String flength;
                protected String fwidth;
                protected String fheight;
                @XmlElement(name = "citem_class")
                protected String citemClass;
                @XmlElement(name = "citem_cname")
                protected String citemCname;
                protected String citemcode;
                protected String citemname;
                protected String iciqbookid;
                protected String cciqbookcode;
                protected String cciqcode;
                protected String fciqchangrate;

                /**
                 * 获取pricecontailtax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPricecontailtax() {
                    return pricecontailtax;
                }

                /**
                 * 设置pricecontailtax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPricecontailtax(String value) {
                    this.pricecontailtax = value;
                }

                /**
                 * 获取comcriterion属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComcriterion() {
                    return comcriterion;
                }

                /**
                 * 设置comcriterion属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComcriterion(String value) {
                    this.comcriterion = value;
                }

                /**
                 * 获取comrule属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComrule() {
                    return comrule;
                }

                /**
                 * 设置comrule属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComrule(String value) {
                    this.comrule = value;
                }

                /**
                 * 获取comunitcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComunitcode() {
                    return comunitcode;
                }

                /**
                 * 设置comunitcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComunitcode(String value) {
                    this.comunitcode = value;
                }

                /**
                 * 获取comunitname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComunitname() {
                    return comunitname;
                }

                /**
                 * 设置comunitname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComunitname(String value) {
                    this.comunitname = value;
                }

                /**
                 * 获取configstatus属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfigstatus() {
                    return configstatus;
                }

                /**
                 * 设置configstatus属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfigstatus(String value) {
                    this.configstatus = value;
                }

                /**
                 * 获取cusinvcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCusinvcode() {
                    return cusinvcode;
                }

                /**
                 * 设置cusinvcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCusinvcode(String value) {
                    this.cusinvcode = value;
                }

                /**
                 * 获取cusinvname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCusinvname() {
                    return cusinvname;
                }

                /**
                 * 设置cusinvname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCusinvname(String value) {
                    this.cusinvname = value;
                }

                /**
                 * 获取define22属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine22() {
                    return define22;
                }

                /**
                 * 设置define22属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine22(String value) {
                    this.define22 = value;
                }

                /**
                 * 获取define23属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine23() {
                    return define23;
                }

                /**
                 * 设置define23属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine23(String value) {
                    this.define23 = value;
                }

                /**
                 * 获取define24属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine24() {
                    return define24;
                }

                /**
                 * 设置define24属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine24(String value) {
                    this.define24 = value;
                }

                /**
                 * 获取define25属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine25() {
                    return define25;
                }

                /**
                 * 设置define25属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine25(String value) {
                    this.define25 = value;
                }

                /**
                 * 获取define26属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine26() {
                    return define26;
                }

                /**
                 * 设置define26属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine26(String value) {
                    this.define26 = value;
                }

                /**
                 * 获取define27属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine27() {
                    return define27;
                }

                /**
                 * 设置define27属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine27(String value) {
                    this.define27 = value;
                }

                /**
                 * 获取define28属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine28() {
                    return define28;
                }

                /**
                 * 设置define28属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine28(String value) {
                    this.define28 = value;
                }

                /**
                 * 获取define29属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine29() {
                    return define29;
                }

                /**
                 * 设置define29属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine29(String value) {
                    this.define29 = value;
                }

                /**
                 * 获取define30属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine30() {
                    return define30;
                }

                /**
                 * 设置define30属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine30(String value) {
                    this.define30 = value;
                }

                /**
                 * 获取define31属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine31() {
                    return define31;
                }

                /**
                 * 设置define31属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine31(String value) {
                    this.define31 = value;
                }

                /**
                 * 获取define32属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine32() {
                    return define32;
                }

                /**
                 * 设置define32属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine32(String value) {
                    this.define32 = value;
                }

                /**
                 * 获取define33属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine33() {
                    return define33;
                }

                /**
                 * 设置define33属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine33(String value) {
                    this.define33 = value;
                }

                /**
                 * 获取define34属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine34() {
                    return define34;
                }

                /**
                 * 设置define34属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine34(String value) {
                    this.define34 = value;
                }

                /**
                 * 获取define35属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine35() {
                    return define35;
                }

                /**
                 * 设置define35属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine35(String value) {
                    this.define35 = value;
                }

                /**
                 * 获取define36属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine36() {
                    return define36;
                }

                /**
                 * 设置define36属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine36(String value) {
                    this.define36 = value;
                }

                /**
                 * 获取define37属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefine37() {
                    return define37;
                }

                /**
                 * 设置define37属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefine37(String value) {
                    this.define37 = value;
                }

                /**
                 * 获取englishname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnglishname() {
                    return englishname;
                }

                /**
                 * 设置englishname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnglishname(String value) {
                    this.englishname = value;
                }

                /**
                 * 获取enplural属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnplural() {
                    return enplural;
                }

                /**
                 * 设置enplural属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnplural(String value) {
                    this.enplural = value;
                }

                /**
                 * 获取ensingular属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnsingular() {
                    return ensingular;
                }

                /**
                 * 设置ensingular属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnsingular(String value) {
                    this.ensingular = value;
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
                 * 获取invcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInvcode() {
                    return invcode;
                }

                /**
                 * 设置invcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInvcode(String value) {
                    this.invcode = value;
                }

                /**
                 * 获取itemClass属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemClass() {
                    return itemClass;
                }

                /**
                 * 设置itemClass属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemClass(String value) {
                    this.itemClass = value;
                }

                /**
                 * 获取itemCname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemCname() {
                    return itemCname;
                }

                /**
                 * 设置itemCname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemCname(String value) {
                    this.itemCname = value;
                }

                /**
                 * 获取itemcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemcode() {
                    return itemcode;
                }

                /**
                 * 设置itemcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemcode(String value) {
                    this.itemcode = value;
                }

                /**
                 * 获取itemname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemname() {
                    return itemname;
                }

                /**
                 * 设置itemname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemname(String value) {
                    this.itemname = value;
                }

                /**
                 * 获取materialsize属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMaterialsize() {
                    return materialsize;
                }

                /**
                 * 设置materialsize属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMaterialsize(String value) {
                    this.materialsize = value;
                }

                /**
                 * 获取memo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemo() {
                    return memo;
                }

                /**
                 * 设置memo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemo(String value) {
                    this.memo = value;
                }

                /**
                 * 获取packinfo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPackinfo() {
                    return packinfo;
                }

                /**
                 * 设置packinfo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPackinfo(String value) {
                    this.packinfo = value;
                }

                /**
                 * 获取packsize属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPacksize() {
                    return packsize;
                }

                /**
                 * 设置packsize属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPacksize(String value) {
                    this.packsize = value;
                }

                /**
                 * 获取sacomunitcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSacomunitcode() {
                    return sacomunitcode;
                }

                /**
                 * 设置sacomunitcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSacomunitcode(String value) {
                    this.sacomunitcode = value;
                }

                /**
                 * 获取vcomunitcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVcomunitcode() {
                    return vcomunitcode;
                }

                /**
                 * 设置vcomunitcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVcomunitcode(String value) {
                    this.vcomunitcode = value;
                }

                /**
                 * 获取volumes属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVolumes() {
                    return volumes;
                }

                /**
                 * 设置volumes属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVolumes(String value) {
                    this.volumes = value;
                }

                /**
                 * 获取wcomunitcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWcomunitcode() {
                    return wcomunitcode;
                }

                /**
                 * 设置wcomunitcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWcomunitcode(String value) {
                    this.wcomunitcode = value;
                }

                /**
                 * 获取dk属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDk() {
                    return dk;
                }

                /**
                 * 设置dk属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDk(String value) {
                    this.dk = value;
                }

                /**
                 * 获取dk2属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDk2() {
                    return dk2;
                }

                /**
                 * 设置dk2属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDk2(String value) {
                    this.dk2 = value;
                }

                /**
                 * 获取lineclosedate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLineclosedate() {
                    return lineclosedate;
                }

                /**
                 * 设置lineclosedate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLineclosedate(String value) {
                    this.lineclosedate = value;
                }

                /**
                 * 获取shippingdate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShippingdate() {
                    return shippingdate;
                }

                /**
                 * 设置shippingdate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShippingdate(String value) {
                    this.shippingdate = value;
                }

                /**
                 * 获取changrate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChangrate() {
                    return changrate;
                }

                /**
                 * 设置changrate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChangrate(String value) {
                    this.changrate = value;
                }

                /**
                 * 获取comcoefficient属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComcoefficient() {
                    return comcoefficient;
                }

                /**
                 * 设置comcoefficient属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComcoefficient(String value) {
                    this.comcoefficient = value;
                }

                /**
                 * 获取commoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCommoney() {
                    return commoney;
                }

                /**
                 * 设置commoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCommoney(String value) {
                    this.commoney = value;
                }

                /**
                 * 获取comrate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getComrate() {
                    return comrate;
                }

                /**
                 * 设置comrate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setComrate(String value) {
                    this.comrate = value;
                }

                /**
                 * 获取discount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiscount() {
                    return discount;
                }

                /**
                 * 设置discount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiscount(String value) {
                    this.discount = value;
                }

                /**
                 * 获取fobmoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFobmoney() {
                    return fobmoney;
                }

                /**
                 * 设置fobmoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFobmoney(String value) {
                    this.fobmoney = value;
                }

                /**
                 * 获取freight属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFreight() {
                    return freight;
                }

                /**
                 * 设置freight属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFreight(String value) {
                    this.freight = value;
                }

                /**
                 * 获取gweight属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGweight() {
                    return gweight;
                }

                /**
                 * 设置gweight属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGweight(String value) {
                    this.gweight = value;
                }

                /**
                 * 获取gweights属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGweights() {
                    return gweights;
                }

                /**
                 * 设置gweights属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGweights(String value) {
                    this.gweights = value;
                }

                /**
                 * 获取insurance属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInsurance() {
                    return insurance;
                }

                /**
                 * 设置insurance属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInsurance(String value) {
                    this.insurance = value;
                }

                /**
                 * 获取money属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoney() {
                    return money;
                }

                /**
                 * 设置money属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoney(String value) {
                    this.money = value;
                }

                /**
                 * 获取natcommoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatcommoney() {
                    return natcommoney;
                }

                /**
                 * 设置natcommoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatcommoney(String value) {
                    this.natcommoney = value;
                }

                /**
                 * 获取natdiscount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatdiscount() {
                    return natdiscount;
                }

                /**
                 * 设置natdiscount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatdiscount(String value) {
                    this.natdiscount = value;
                }

                /**
                 * 获取natfobmoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatfobmoney() {
                    return natfobmoney;
                }

                /**
                 * 设置natfobmoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatfobmoney(String value) {
                    this.natfobmoney = value;
                }

                /**
                 * 获取natfreight属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatfreight() {
                    return natfreight;
                }

                /**
                 * 设置natfreight属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatfreight(String value) {
                    this.natfreight = value;
                }

                /**
                 * 获取natinsurance属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatinsurance() {
                    return natinsurance;
                }

                /**
                 * 设置natinsurance属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatinsurance(String value) {
                    this.natinsurance = value;
                }

                /**
                 * 获取natmoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatmoney() {
                    return natmoney;
                }

                /**
                 * 设置natmoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatmoney(String value) {
                    this.natmoney = value;
                }

                /**
                 * 获取natprice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNatprice() {
                    return natprice;
                }

                /**
                 * 设置natprice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNatprice(String value) {
                    this.natprice = value;
                }

                /**
                 * 获取nattax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNattax() {
                    return nattax;
                }

                /**
                 * 设置nattax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNattax(String value) {
                    this.nattax = value;
                }

                /**
                 * 获取nattaxmoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNattaxmoney() {
                    return nattaxmoney;
                }

                /**
                 * 设置nattaxmoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNattaxmoney(String value) {
                    this.nattaxmoney = value;
                }

                /**
                 * 获取nattaxprice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNattaxprice() {
                    return nattaxprice;
                }

                /**
                 * 设置nattaxprice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNattaxprice(String value) {
                    this.nattaxprice = value;
                }

                /**
                 * 获取num属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNum() {
                    return num;
                }

                /**
                 * 设置num属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNum(String value) {
                    this.num = value;
                }

                /**
                 * 获取nweight属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNweight() {
                    return nweight;
                }

                /**
                 * 设置nweight属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNweight(String value) {
                    this.nweight = value;
                }

                /**
                 * 获取nweights属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNweights() {
                    return nweights;
                }

                /**
                 * 设置nweights属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNweights(String value) {
                    this.nweights = value;
                }

                /**
                 * 获取overflowrange属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOverflowrange() {
                    return overflowrange;
                }

                /**
                 * 设置overflowrange属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOverflowrange(String value) {
                    this.overflowrange = value;
                }

                /**
                 * 获取packqty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPackqty() {
                    return packqty;
                }

                /**
                 * 设置packqty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPackqty(String value) {
                    this.packqty = value;
                }

                /**
                 * 获取ppartqty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPpartqty() {
                    return ppartqty;
                }

                /**
                 * 设置ppartqty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPpartqty(String value) {
                    this.ppartqty = value;
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
                 * 获取quotedprice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQuotedprice() {
                    return quotedprice;
                }

                /**
                 * 设置quotedprice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQuotedprice(String value) {
                    this.quotedprice = value;
                }

                /**
                 * 获取tax属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTax() {
                    return tax;
                }

                /**
                 * 设置tax属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTax(String value) {
                    this.tax = value;
                }

                /**
                 * 获取taxmoney属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxmoney() {
                    return taxmoney;
                }

                /**
                 * 设置taxmoney属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxmoney(String value) {
                    this.taxmoney = value;
                }

                /**
                 * 获取taxprice属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxprice() {
                    return taxprice;
                }

                /**
                 * 设置taxprice属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxprice(String value) {
                    this.taxprice = value;
                }

                /**
                 * 获取taxrate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxrate() {
                    return taxrate;
                }

                /**
                 * 设置taxrate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxrate(String value) {
                    this.taxrate = value;
                }

                /**
                 * 获取volume属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVolume() {
                    return volume;
                }

                /**
                 * 设置volume属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVolume(String value) {
                    this.volume = value;
                }

                /**
                 * 获取grouptype属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrouptype() {
                    return grouptype;
                }

                /**
                 * 设置grouptype属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrouptype(String value) {
                    this.grouptype = value;
                }

                /**
                 * 获取quotationrowno属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQuotationrowno() {
                    return quotationrowno;
                }

                /**
                 * 设置quotationrowno属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQuotationrowno(String value) {
                    this.quotationrowno = value;
                }

                /**
                 * 获取kl属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKl() {
                    return kl;
                }

                /**
                 * 设置kl属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKl(String value) {
                    this.kl = value;
                }

                /**
                 * 获取kl2属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getKl2() {
                    return kl2;
                }

                /**
                 * 设置kl2属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setKl2(String value) {
                    this.kl2 = value;
                }

                /**
                 * 获取fcost属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFcost() {
                    return fcost;
                }

                /**
                 * 设置fcost属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFcost(String value) {
                    this.fcost = value;
                }

                /**
                 * 获取fgrossrate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFgrossrate() {
                    return fgrossrate;
                }

                /**
                 * 设置fgrossrate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFgrossrate(String value) {
                    this.fgrossrate = value;
                }

                /**
                 * 获取cvencode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCvencode() {
                    return cvencode;
                }

                /**
                 * 设置cvencode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCvencode(String value) {
                    this.cvencode = value;
                }

                /**
                 * 获取centerprise属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCenterprise() {
                    return centerprise;
                }

                /**
                 * 设置centerprise属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCenterprise(String value) {
                    this.centerprise = value;
                }

                /**
                 * 获取flength属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlength() {
                    return flength;
                }

                /**
                 * 设置flength属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlength(String value) {
                    this.flength = value;
                }

                /**
                 * 获取fwidth属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFwidth() {
                    return fwidth;
                }

                /**
                 * 设置fwidth属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFwidth(String value) {
                    this.fwidth = value;
                }

                /**
                 * 获取fheight属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFheight() {
                    return fheight;
                }

                /**
                 * 设置fheight属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFheight(String value) {
                    this.fheight = value;
                }

                /**
                 * 获取citemClass属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCitemClass() {
                    return citemClass;
                }

                /**
                 * 设置citemClass属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCitemClass(String value) {
                    this.citemClass = value;
                }

                /**
                 * 获取citemCname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCitemCname() {
                    return citemCname;
                }

                /**
                 * 设置citemCname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCitemCname(String value) {
                    this.citemCname = value;
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
                 * 获取citemname属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCitemname() {
                    return citemname;
                }

                /**
                 * 设置citemname属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCitemname(String value) {
                    this.citemname = value;
                }

                /**
                 * 获取iciqbookid属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIciqbookid() {
                    return iciqbookid;
                }

                /**
                 * 设置iciqbookid属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIciqbookid(String value) {
                    this.iciqbookid = value;
                }

                /**
                 * 获取cciqbookcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCciqbookcode() {
                    return cciqbookcode;
                }

                /**
                 * 设置cciqbookcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCciqbookcode(String value) {
                    this.cciqbookcode = value;
                }

                /**
                 * 获取cciqcode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCciqcode() {
                    return cciqcode;
                }

                /**
                 * 设置cciqcode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCciqcode(String value) {
                    this.cciqcode = value;
                }

                /**
                 * 获取fciqchangrate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFciqchangrate() {
                    return fciqchangrate;
                }

                /**
                 * 设置fciqchangrate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFciqchangrate(String value) {
                    this.fciqchangrate = value;
                }

            }

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
         *         &lt;element name="cal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="chinesesummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="comvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="aportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tportcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bustype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="containersize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cuscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusabbname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusenaddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusenaddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusenaddr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusenaddr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusoaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cusperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="define16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="depcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="engaddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="engaddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="engaddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="engaddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="englishsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exch_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exch_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="incotermcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="incotermremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="invgeneraldesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="outaftercredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="personcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="receiveaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="receivecompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="receiveperson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="shipvencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="svencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="tmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="unitenglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="unitname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="unittel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="invaliddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastedshippingdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="validdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="containerqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exchrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fobsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generalcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generalcomrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generalcomremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generaloverflowitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generaloverflowrange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generaltaxrate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="natfobsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="natgeneralcommoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="natsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="statsummoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="summoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ffreightsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fnatfreightsum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bfreighttofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="finsurancesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fnatinsurancesum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="binsurancetofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cinsurancevencode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bcommisiontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bcommisiontofare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ibatchshippingid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cbatchshipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ivtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "cal",
            "chinesesummoney",
            "comvencode",
            "code",
            "sportcode",
            "aportcode",
            "tportcode",
            "bustype",
            "containersize",
            "cuscode",
            "cusabbname",
            "cusaddress",
            "cusenaddr1",
            "cusenaddr2",
            "cusenaddr3",
            "cusenaddr4",
            "cusoaddress",
            "cusperson",
            "define1",
            "define2",
            "define3",
            "define4",
            "define5",
            "define6",
            "define7",
            "define8",
            "define9",
            "define10",
            "define11",
            "define12",
            "define13",
            "define14",
            "define15",
            "define16",
            "depcode",
            "engaddress1",
            "engaddress2",
            "engaddress3",
            "engaddress4",
            "englishsummoney",
            "exchName",
            "exchCode",
            "incotermcode",
            "incotermremark",
            "invgeneraldesc",
            "memos",
            "outaftercredit",
            "paycode",
            "personcode",
            "receiveaddress",
            "receivecompany",
            "receiveperson",
            "sccode",
            "shipvencode",
            "sscode",
            "stcode",
            "svencode",
            "tmcode",
            "transport",
            "unitenglish",
            "unitname",
            "unittel",
            "date",
            "invaliddate",
            "lastedshippingdate",
            "validdate",
            "containerqty",
            "exchrate",
            "fobsummoney",
            "generalcommoney",
            "generalcomrate",
            "generalcomremark",
            "generaloverflowitem",
            "generaloverflowrange",
            "generaltaxrate",
            "natfobsummoney",
            "natgeneralcommoney",
            "natsummoney",
            "statsummoney",
            "summoney",
            "dec",
            "ffreightsum",
            "fnatfreightsum",
            "bfreighttofare",
            "finsurancesum",
            "fnatinsurancesum",
            "binsurancetofare",
            "cinsurancevencode",
            "bcommisiontype",
            "bcommisiontofare",
            "ibatchshippingid",
            "cbatchshipping",
            "ivtid"
        })
        public static class Header {

            protected String cal;
            protected String chinesesummoney;
            protected String comvencode;
            protected String code;
            protected String sportcode;
            protected String aportcode;
            protected String tportcode;
            protected String bustype;
            protected String containersize;
            protected String cuscode;
            protected String cusabbname;
            protected String cusaddress;
            protected String cusenaddr1;
            protected String cusenaddr2;
            protected String cusenaddr3;
            protected String cusenaddr4;
            protected String cusoaddress;
            protected String cusperson;
            protected String define1;
            protected String define2;
            protected String define3;
            protected String define4;
            protected String define5;
            protected String define6;
            protected String define7;
            protected String define8;
            protected String define9;
            protected String define10;
            protected String define11;
            protected String define12;
            protected String define13;
            protected String define14;
            protected String define15;
            protected String define16;
            protected String depcode;
            protected String engaddress1;
            protected String engaddress2;
            protected String engaddress3;
            protected String engaddress4;
            protected String englishsummoney;
            @XmlElement(name = "exch_name")
            protected String exchName;
            @XmlElement(name = "exch_code")
            protected String exchCode;
            protected String incotermcode;
            protected String incotermremark;
            protected String invgeneraldesc;
            protected String memos;
            protected String outaftercredit;
            protected String paycode;
            protected String personcode;
            protected String receiveaddress;
            protected String receivecompany;
            protected String receiveperson;
            protected String sccode;
            protected String shipvencode;
            protected String sscode;
            protected String stcode;
            protected String svencode;
            protected String tmcode;
            protected String transport;
            protected String unitenglish;
            protected String unitname;
            protected String unittel;
            protected String date;
            protected String invaliddate;
            protected String lastedshippingdate;
            protected String validdate;
            protected String containerqty;
            protected String exchrate;
            protected String fobsummoney;
            protected String generalcommoney;
            protected String generalcomrate;
            protected String generalcomremark;
            protected String generaloverflowitem;
            protected String generaloverflowrange;
            protected String generaltaxrate;
            protected String natfobsummoney;
            protected String natgeneralcommoney;
            protected String natsummoney;
            protected String statsummoney;
            protected String summoney;
            protected String dec;
            protected String ffreightsum;
            protected String fnatfreightsum;
            protected String bfreighttofare;
            protected String finsurancesum;
            protected String fnatinsurancesum;
            protected String binsurancetofare;
            protected String cinsurancevencode;
            protected String bcommisiontype;
            protected String bcommisiontofare;
            protected String ibatchshippingid;
            protected String cbatchshipping;
            protected String ivtid;

            /**
             * 获取cal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCal() {
                return cal;
            }

            /**
             * 设置cal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCal(String value) {
                this.cal = value;
            }

            /**
             * 获取chinesesummoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChinesesummoney() {
                return chinesesummoney;
            }

            /**
             * 设置chinesesummoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChinesesummoney(String value) {
                this.chinesesummoney = value;
            }

            /**
             * 获取comvencode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComvencode() {
                return comvencode;
            }

            /**
             * 设置comvencode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComvencode(String value) {
                this.comvencode = value;
            }

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
             * 获取sportcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSportcode() {
                return sportcode;
            }

            /**
             * 设置sportcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSportcode(String value) {
                this.sportcode = value;
            }

            /**
             * 获取aportcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAportcode() {
                return aportcode;
            }

            /**
             * 设置aportcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAportcode(String value) {
                this.aportcode = value;
            }

            /**
             * 获取tportcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTportcode() {
                return tportcode;
            }

            /**
             * 设置tportcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTportcode(String value) {
                this.tportcode = value;
            }

            /**
             * 获取bustype属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBustype() {
                return bustype;
            }

            /**
             * 设置bustype属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBustype(String value) {
                this.bustype = value;
            }

            /**
             * 获取containersize属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContainersize() {
                return containersize;
            }

            /**
             * 设置containersize属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContainersize(String value) {
                this.containersize = value;
            }

            /**
             * 获取cuscode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCuscode() {
                return cuscode;
            }

            /**
             * 设置cuscode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCuscode(String value) {
                this.cuscode = value;
            }

            /**
             * 获取cusabbname属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusabbname() {
                return cusabbname;
            }

            /**
             * 设置cusabbname属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusabbname(String value) {
                this.cusabbname = value;
            }

            /**
             * 获取cusaddress属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusaddress() {
                return cusaddress;
            }

            /**
             * 设置cusaddress属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusaddress(String value) {
                this.cusaddress = value;
            }

            /**
             * 获取cusenaddr1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusenaddr1() {
                return cusenaddr1;
            }

            /**
             * 设置cusenaddr1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusenaddr1(String value) {
                this.cusenaddr1 = value;
            }

            /**
             * 获取cusenaddr2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusenaddr2() {
                return cusenaddr2;
            }

            /**
             * 设置cusenaddr2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusenaddr2(String value) {
                this.cusenaddr2 = value;
            }

            /**
             * 获取cusenaddr3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusenaddr3() {
                return cusenaddr3;
            }

            /**
             * 设置cusenaddr3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusenaddr3(String value) {
                this.cusenaddr3 = value;
            }

            /**
             * 获取cusenaddr4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusenaddr4() {
                return cusenaddr4;
            }

            /**
             * 设置cusenaddr4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusenaddr4(String value) {
                this.cusenaddr4 = value;
            }

            /**
             * 获取cusoaddress属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusoaddress() {
                return cusoaddress;
            }

            /**
             * 设置cusoaddress属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusoaddress(String value) {
                this.cusoaddress = value;
            }

            /**
             * 获取cusperson属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCusperson() {
                return cusperson;
            }

            /**
             * 设置cusperson属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCusperson(String value) {
                this.cusperson = value;
            }

            /**
             * 获取define1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine1() {
                return define1;
            }

            /**
             * 设置define1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine1(String value) {
                this.define1 = value;
            }

            /**
             * 获取define2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine2() {
                return define2;
            }

            /**
             * 设置define2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine2(String value) {
                this.define2 = value;
            }

            /**
             * 获取define3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine3() {
                return define3;
            }

            /**
             * 设置define3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine3(String value) {
                this.define3 = value;
            }

            /**
             * 获取define4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine4() {
                return define4;
            }

            /**
             * 设置define4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine4(String value) {
                this.define4 = value;
            }

            /**
             * 获取define5属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine5() {
                return define5;
            }

            /**
             * 设置define5属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine5(String value) {
                this.define5 = value;
            }

            /**
             * 获取define6属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine6() {
                return define6;
            }

            /**
             * 设置define6属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine6(String value) {
                this.define6 = value;
            }

            /**
             * 获取define7属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine7() {
                return define7;
            }

            /**
             * 设置define7属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine7(String value) {
                this.define7 = value;
            }

            /**
             * 获取define8属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine8() {
                return define8;
            }

            /**
             * 设置define8属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine8(String value) {
                this.define8 = value;
            }

            /**
             * 获取define9属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine9() {
                return define9;
            }

            /**
             * 设置define9属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine9(String value) {
                this.define9 = value;
            }

            /**
             * 获取define10属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine10() {
                return define10;
            }

            /**
             * 设置define10属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine10(String value) {
                this.define10 = value;
            }

            /**
             * 获取define11属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine11() {
                return define11;
            }

            /**
             * 设置define11属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine11(String value) {
                this.define11 = value;
            }

            /**
             * 获取define12属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine12() {
                return define12;
            }

            /**
             * 设置define12属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine12(String value) {
                this.define12 = value;
            }

            /**
             * 获取define13属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine13() {
                return define13;
            }

            /**
             * 设置define13属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine13(String value) {
                this.define13 = value;
            }

            /**
             * 获取define14属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine14() {
                return define14;
            }

            /**
             * 设置define14属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine14(String value) {
                this.define14 = value;
            }

            /**
             * 获取define15属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine15() {
                return define15;
            }

            /**
             * 设置define15属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine15(String value) {
                this.define15 = value;
            }

            /**
             * 获取define16属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefine16() {
                return define16;
            }

            /**
             * 设置define16属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefine16(String value) {
                this.define16 = value;
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
             * 获取engaddress1属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEngaddress1() {
                return engaddress1;
            }

            /**
             * 设置engaddress1属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEngaddress1(String value) {
                this.engaddress1 = value;
            }

            /**
             * 获取engaddress2属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEngaddress2() {
                return engaddress2;
            }

            /**
             * 设置engaddress2属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEngaddress2(String value) {
                this.engaddress2 = value;
            }

            /**
             * 获取engaddress3属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEngaddress3() {
                return engaddress3;
            }

            /**
             * 设置engaddress3属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEngaddress3(String value) {
                this.engaddress3 = value;
            }

            /**
             * 获取engaddress4属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEngaddress4() {
                return engaddress4;
            }

            /**
             * 设置engaddress4属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEngaddress4(String value) {
                this.engaddress4 = value;
            }

            /**
             * 获取englishsummoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnglishsummoney() {
                return englishsummoney;
            }

            /**
             * 设置englishsummoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnglishsummoney(String value) {
                this.englishsummoney = value;
            }

            /**
             * 获取exchName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExchName() {
                return exchName;
            }

            /**
             * 设置exchName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExchName(String value) {
                this.exchName = value;
            }

            /**
             * 获取exchCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExchCode() {
                return exchCode;
            }

            /**
             * 设置exchCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExchCode(String value) {
                this.exchCode = value;
            }

            /**
             * 获取incotermcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncotermcode() {
                return incotermcode;
            }

            /**
             * 设置incotermcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncotermcode(String value) {
                this.incotermcode = value;
            }

            /**
             * 获取incotermremark属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncotermremark() {
                return incotermremark;
            }

            /**
             * 设置incotermremark属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncotermremark(String value) {
                this.incotermremark = value;
            }

            /**
             * 获取invgeneraldesc属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvgeneraldesc() {
                return invgeneraldesc;
            }

            /**
             * 设置invgeneraldesc属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvgeneraldesc(String value) {
                this.invgeneraldesc = value;
            }

            /**
             * 获取memos属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemos() {
                return memos;
            }

            /**
             * 设置memos属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemos(String value) {
                this.memos = value;
            }

            /**
             * 获取outaftercredit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutaftercredit() {
                return outaftercredit;
            }

            /**
             * 设置outaftercredit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutaftercredit(String value) {
                this.outaftercredit = value;
            }

            /**
             * 获取paycode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaycode() {
                return paycode;
            }

            /**
             * 设置paycode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaycode(String value) {
                this.paycode = value;
            }

            /**
             * 获取personcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersoncode() {
                return personcode;
            }

            /**
             * 设置personcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersoncode(String value) {
                this.personcode = value;
            }

            /**
             * 获取receiveaddress属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceiveaddress() {
                return receiveaddress;
            }

            /**
             * 设置receiveaddress属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceiveaddress(String value) {
                this.receiveaddress = value;
            }

            /**
             * 获取receivecompany属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceivecompany() {
                return receivecompany;
            }

            /**
             * 设置receivecompany属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceivecompany(String value) {
                this.receivecompany = value;
            }

            /**
             * 获取receiveperson属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceiveperson() {
                return receiveperson;
            }

            /**
             * 设置receiveperson属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceiveperson(String value) {
                this.receiveperson = value;
            }

            /**
             * 获取sccode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSccode() {
                return sccode;
            }

            /**
             * 设置sccode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSccode(String value) {
                this.sccode = value;
            }

            /**
             * 获取shipvencode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShipvencode() {
                return shipvencode;
            }

            /**
             * 设置shipvencode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShipvencode(String value) {
                this.shipvencode = value;
            }

            /**
             * 获取sscode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSscode() {
                return sscode;
            }

            /**
             * 设置sscode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSscode(String value) {
                this.sscode = value;
            }

            /**
             * 获取stcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStcode() {
                return stcode;
            }

            /**
             * 设置stcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStcode(String value) {
                this.stcode = value;
            }

            /**
             * 获取svencode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSvencode() {
                return svencode;
            }

            /**
             * 设置svencode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSvencode(String value) {
                this.svencode = value;
            }

            /**
             * 获取tmcode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTmcode() {
                return tmcode;
            }

            /**
             * 设置tmcode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTmcode(String value) {
                this.tmcode = value;
            }

            /**
             * 获取transport属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransport() {
                return transport;
            }

            /**
             * 设置transport属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransport(String value) {
                this.transport = value;
            }

            /**
             * 获取unitenglish属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitenglish() {
                return unitenglish;
            }

            /**
             * 设置unitenglish属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitenglish(String value) {
                this.unitenglish = value;
            }

            /**
             * 获取unitname属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnitname() {
                return unitname;
            }

            /**
             * 设置unitname属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnitname(String value) {
                this.unitname = value;
            }

            /**
             * 获取unittel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnittel() {
                return unittel;
            }

            /**
             * 设置unittel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnittel(String value) {
                this.unittel = value;
            }

            /**
             * 获取date属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * 设置date属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * 获取invaliddate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInvaliddate() {
                return invaliddate;
            }

            /**
             * 设置invaliddate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInvaliddate(String value) {
                this.invaliddate = value;
            }

            /**
             * 获取lastedshippingdate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastedshippingdate() {
                return lastedshippingdate;
            }

            /**
             * 设置lastedshippingdate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastedshippingdate(String value) {
                this.lastedshippingdate = value;
            }

            /**
             * 获取validdate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValiddate() {
                return validdate;
            }

            /**
             * 设置validdate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValiddate(String value) {
                this.validdate = value;
            }

            /**
             * 获取containerqty属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContainerqty() {
                return containerqty;
            }

            /**
             * 设置containerqty属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContainerqty(String value) {
                this.containerqty = value;
            }

            /**
             * 获取exchrate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExchrate() {
                return exchrate;
            }

            /**
             * 设置exchrate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExchrate(String value) {
                this.exchrate = value;
            }

            /**
             * 获取fobsummoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFobsummoney() {
                return fobsummoney;
            }

            /**
             * 设置fobsummoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFobsummoney(String value) {
                this.fobsummoney = value;
            }

            /**
             * 获取generalcommoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneralcommoney() {
                return generalcommoney;
            }

            /**
             * 设置generalcommoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneralcommoney(String value) {
                this.generalcommoney = value;
            }

            /**
             * 获取generalcomrate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneralcomrate() {
                return generalcomrate;
            }

            /**
             * 设置generalcomrate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneralcomrate(String value) {
                this.generalcomrate = value;
            }

            /**
             * 获取generalcomremark属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneralcomremark() {
                return generalcomremark;
            }

            /**
             * 设置generalcomremark属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneralcomremark(String value) {
                this.generalcomremark = value;
            }

            /**
             * 获取generaloverflowitem属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneraloverflowitem() {
                return generaloverflowitem;
            }

            /**
             * 设置generaloverflowitem属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneraloverflowitem(String value) {
                this.generaloverflowitem = value;
            }

            /**
             * 获取generaloverflowrange属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneraloverflowrange() {
                return generaloverflowrange;
            }

            /**
             * 设置generaloverflowrange属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneraloverflowrange(String value) {
                this.generaloverflowrange = value;
            }

            /**
             * 获取generaltaxrate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneraltaxrate() {
                return generaltaxrate;
            }

            /**
             * 设置generaltaxrate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneraltaxrate(String value) {
                this.generaltaxrate = value;
            }

            /**
             * 获取natfobsummoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatfobsummoney() {
                return natfobsummoney;
            }

            /**
             * 设置natfobsummoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatfobsummoney(String value) {
                this.natfobsummoney = value;
            }

            /**
             * 获取natgeneralcommoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatgeneralcommoney() {
                return natgeneralcommoney;
            }

            /**
             * 设置natgeneralcommoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatgeneralcommoney(String value) {
                this.natgeneralcommoney = value;
            }

            /**
             * 获取natsummoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatsummoney() {
                return natsummoney;
            }

            /**
             * 设置natsummoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatsummoney(String value) {
                this.natsummoney = value;
            }

            /**
             * 获取statsummoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatsummoney() {
                return statsummoney;
            }

            /**
             * 设置statsummoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatsummoney(String value) {
                this.statsummoney = value;
            }

            /**
             * 获取summoney属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSummoney() {
                return summoney;
            }

            /**
             * 设置summoney属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSummoney(String value) {
                this.summoney = value;
            }

            /**
             * 获取dec属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDec() {
                return dec;
            }

            /**
             * 设置dec属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDec(String value) {
                this.dec = value;
            }

            /**
             * 获取ffreightsum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFfreightsum() {
                return ffreightsum;
            }

            /**
             * 设置ffreightsum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFfreightsum(String value) {
                this.ffreightsum = value;
            }

            /**
             * 获取fnatfreightsum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFnatfreightsum() {
                return fnatfreightsum;
            }

            /**
             * 设置fnatfreightsum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFnatfreightsum(String value) {
                this.fnatfreightsum = value;
            }

            /**
             * 获取bfreighttofare属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBfreighttofare() {
                return bfreighttofare;
            }

            /**
             * 设置bfreighttofare属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBfreighttofare(String value) {
                this.bfreighttofare = value;
            }

            /**
             * 获取finsurancesum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinsurancesum() {
                return finsurancesum;
            }

            /**
             * 设置finsurancesum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinsurancesum(String value) {
                this.finsurancesum = value;
            }

            /**
             * 获取fnatinsurancesum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFnatinsurancesum() {
                return fnatinsurancesum;
            }

            /**
             * 设置fnatinsurancesum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFnatinsurancesum(String value) {
                this.fnatinsurancesum = value;
            }

            /**
             * 获取binsurancetofare属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBinsurancetofare() {
                return binsurancetofare;
            }

            /**
             * 设置binsurancetofare属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBinsurancetofare(String value) {
                this.binsurancetofare = value;
            }

            /**
             * 获取cinsurancevencode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCinsurancevencode() {
                return cinsurancevencode;
            }

            /**
             * 设置cinsurancevencode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCinsurancevencode(String value) {
                this.cinsurancevencode = value;
            }

            /**
             * 获取bcommisiontype属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBcommisiontype() {
                return bcommisiontype;
            }

            /**
             * 设置bcommisiontype属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBcommisiontype(String value) {
                this.bcommisiontype = value;
            }

            /**
             * 获取bcommisiontofare属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBcommisiontofare() {
                return bcommisiontofare;
            }

            /**
             * 设置bcommisiontofare属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBcommisiontofare(String value) {
                this.bcommisiontofare = value;
            }

            /**
             * 获取ibatchshippingid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIbatchshippingid() {
                return ibatchshippingid;
            }

            /**
             * 设置ibatchshippingid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIbatchshippingid(String value) {
                this.ibatchshippingid = value;
            }

            /**
             * 获取cbatchshipping属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCbatchshipping() {
                return cbatchshipping;
            }

            /**
             * 设置cbatchshipping属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCbatchshipping(String value) {
                this.cbatchshipping = value;
            }

            /**
             * 获取ivtid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIvtid() {
                return ivtid;
            }

            /**
             * 设置ivtid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIvtid(String value) {
                this.ivtid = value;
            }

        }

    }

}
