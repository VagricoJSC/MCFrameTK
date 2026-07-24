package mcframe.commonPFBB.PFBBR5030;

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
 *  	<td>inpDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>voucherNo</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>customerCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>delivToCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>deptCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>inchargeCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ar_PatternCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>currencyCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>rateTypeCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>rate</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>14,9</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>taxableCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>taxType</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_DescriptCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_DescriptName</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>postpadColor</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>8</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>postpadText</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>settleMethod</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bankAcct_Own</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bankAcct_Corresp</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>paymentTerms</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>dueDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>fileName</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>journalType</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>invoiceNo</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>approveGroupCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>iraiCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_UserMaster</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_UserText</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_FlexMaster1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_FlexMaster2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_FlexCode1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_FlexCode2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_FlexText1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_FlexText2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_FlexText3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_FlexText4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>header_FlexText5</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>header_FlexDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks5</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks6</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks7</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks8</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks9</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks10</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks11</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks12</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks13</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks14</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks15</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks16</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks17</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks18</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks19</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks20</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks21</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks22</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks23</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks24</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks25</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks26</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks27</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks28</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>remarks29</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>remarks30</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>rowNo</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>4,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>customerNo</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>50</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detailType</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_DeptCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>warehouse</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>locationCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>lotNo</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>goodsGroup</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>goodsCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>chargesCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>corresp_Goods</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>unitType</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_TaxableCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_TaxType</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>1,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>unitPrice</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>20,6</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>qty_Plus</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>14,4</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>inpAmount_Fc</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>16,2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>taxAmount_Fc</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>16,2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>taxableAmount_Fc</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>16,2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>inpAmount_Sc</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>16,2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>taxAmount_Sc</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>16,2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>taxableAmount_Sc</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>16,2</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>packingUnitCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>packingUnitPrice</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>20,6</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>packingUnitQty</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>10,0</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_Descript_Code</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_Descript_Name</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_UserMaster1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_UserMaster2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_UserMaster3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_UserMaster4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_UserMaster5</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_UserCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_UserText</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_UserDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_UserQty</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>14,4</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_FlexMaster</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_FlexCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_FlexText1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>detail_FlexText2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>detail_FlexDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_Descript_Code</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_Descript_Name</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_UserMaster1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_UserMaster2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_UserMaster3</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_UserMaster4</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_UserMaster5</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_UserCode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_UserText</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_UserDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_UserQty</td>
 *  	<td><br></td>
 *  	<td>Number</td>
 *  	<td>14,4</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>lot_FlexMaster</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>lot_FlexText1</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>lot_FlexText2</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>100</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>lot_FlexDate</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>10</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>billtocode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>endusercode</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>succeedVoucherNo</td>
 *  	<td><br></td>
 *  	<td>String</td>
 *  	<td>20</td>
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