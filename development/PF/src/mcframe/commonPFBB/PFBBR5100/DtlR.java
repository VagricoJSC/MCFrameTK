package mcframe.commonPFBB.PFBBR5100;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>alias</th>
 *  	<th>項目名</th>
 *  	<th>フルネーム</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>INNERROW/COLUMNPATH</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>code</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>name</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>activeflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>searchcharacter</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>1</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>extension</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>corresptype</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>zip</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>address1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>250</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>address2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>250</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>tel1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>tel2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>fax</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>regioncode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bankacctcode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>segmentcode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>creditlimitflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_vatsummaryset</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sal_taxabletypecode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_currencycode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sal_ratetypecode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_ar_patterncode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sal_closingdate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>2,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_workingdayset</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sal_monthlymargin</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>2,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>collectdate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>2,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>delivtocode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_mo_invoiceflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ar_settlemethod</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_forcondition</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>receivableterms</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_valueflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sal_ad_patterncode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sal_settle_discountday</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>3,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sal_settle_discountrate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>5,4</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>flexmaster1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>flexmaster2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>flexmaster3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>flexmaster4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>flexmaster5</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>flextext1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>flextext2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>flextext3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>flextext4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>flextext5</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_usermaster</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_usertext</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flexmaster1_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flexmaster2_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flexcode1_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flexcode2_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext1_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext2_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext3_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext4_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext5_ar</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_vatsummaryset</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pur_taxabletypecode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_currencycode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pur_ratetypecode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_ap_patterncode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pur_closingdate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>2,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_workingdayset</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pur_monthlymargin</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>2,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>paymentdate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>2,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>delivfromcode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_mo_invoiceflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ap_settlemethod</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>paymentterms</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pur_valueflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_ad_patterncode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pur_settle_discountday</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>3,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pur_settle_discountrate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>5,4</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flexmaster1_ap</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>20,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flexmaster2_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flexcode1_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flexcode2_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext1_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext2_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext3_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext4_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext5_ap</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>commission_pay</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>iraicode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>60</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flexmaster1_inv</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>20,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flexmaster2_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flexcode1_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flexcode2_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext1_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext2_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext3_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>h_flextext4_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>h_flextext5_inv</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>email</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>taxid</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>overdueextensionaldays</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>3,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>email_cc</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>250</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>taxid2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>linkageflag</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>linkagecode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>linkageurl</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>1000</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class DtlR extends DtlR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static DtlR create() {
		DtlR row = new DtlR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> DtlR createByName(T proto) {
		DtlR row = DtlR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public DtlR(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}
}