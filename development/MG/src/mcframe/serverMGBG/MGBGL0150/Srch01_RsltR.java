package mcframe.serverMGBG.MGBGL0150;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
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
 *  	<td>dpt_cd</td>
 *  	<td>Dept. cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#COST_DPT_CD COST_DPT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>dpt_nm</td>
 *  	<td>Dept. name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#COST_DPT_NM COST_DPT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>loc_cd</td>
 *  	<td>Location cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOC_CD LOC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>loc_nm</td>
 *  	<td>Location name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOC_NM LOC_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>oper_cd</td>
 *  	<td>Operation cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#OPER_CD OPER_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>oper_nm</td>
 *  	<td>Operation name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#OPER_NM OPER_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bp_cd</td>
 *  	<td>BP cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_CD BP_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bp_nm</td>
 *  	<td>BP name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_NM BP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ctg_cd</td>
 *  	<td>Item category cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#COST_CTG_CD COST_CTG_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ctg_nm</td>
 *  	<td>Item category name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#COST_CTG_NM COST_CTG_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_cd</td>
 *  	<td>Item cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_CD ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub1</td>
 *  	<td>Branch No. 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB1 ITM_SUB1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub2</td>
 *  	<td>Branch No. 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB2 ITM_SUB2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub3</td>
 *  	<td>Branch No. 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB3 ITM_SUB3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_nm</td>
 *  	<td>Item name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_NM ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>lot_no</td>
 *  	<td>Lot No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOT_NO LOT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sublot_no</td>
 *  	<td>Sublot No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SUBLOT_NO SUBLOT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sno1</td>
 *  	<td>SEIBAN No. 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO1 SNO1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sno2</td>
 *  	<td>SEIBAN No. 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO2 SNO2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sno3</td>
 *  	<td>SEIBAN No. 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO3 SNO3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sno4</td>
 *  	<td>SEIBAN No. 4</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO4 SNO4}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>Item mfg. order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_MFG_INST_NO ITM_MFG_INST_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>iv_no</td>
 *  	<td>Invoice No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IV_NO IV_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>po_no</td>
 *  	<td>PO No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PO_NO PO_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>slo_no</td>
 *  	<td>Sales order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLO_NO SLO_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>alc_ac_cd</td>
 *  	<td>Allocation account cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ALC_AC_CD ALC_AC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>alc_ac_nm</td>
 *  	<td>Allocation account name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ALC_AC_NM ALC_AC_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_wg_cd</td>
 *  	<td>Transfer WG cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WG_CD WG_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_wg_nm</td>
 *  	<td>Transfer WG name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WG_NM WG_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>term00</td>
 *  	<td>Term ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>term01</td>
 *  	<td>Term ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>term02</td>
 *  	<td>Term ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>term03</td>
 *  	<td>Term ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>term04</td>
 *  	<td>Term ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln00</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln01</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln02</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln03</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln04</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln05</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln06</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln07</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln08</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln09</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln10</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln11</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln12</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln13</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln14</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln15</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln16</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln17</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln18</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln19</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln20</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln21</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln22</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln23</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln24</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln25</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln26</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln27</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln28</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln29</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln30</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln31</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln32</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln33</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln34</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln35</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln36</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln37</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln38</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln39</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln40</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln41</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln42</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln43</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln44</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln45</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln46</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln47</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln48</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln49</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln50</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln51</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln52</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln53</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln54</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln55</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln56</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln57</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>pln58</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pln59</td>
 *  	<td>Plan ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act00</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act01</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act02</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act03</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act04</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act05</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act06</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act07</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act08</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act09</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act10</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act11</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act12</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act13</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act14</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act15</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act16</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act17</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act18</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act19</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act20</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act21</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act22</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act23</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act24</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act25</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act26</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act27</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act28</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act29</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act30</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act31</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act32</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act33</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act34</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act35</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act36</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act37</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act38</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act39</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act40</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act41</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act42</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act43</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act44</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act45</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act46</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act47</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act48</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act49</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act50</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act51</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act52</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act53</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act54</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act55</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act56</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act57</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act58</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act59</td>
 *  	<td>Result ratio</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMG.meta.MG_META#PRE_ALC_RATE PRE_ALC_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class Srch01_RsltR extends Srch01_RsltR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static Srch01_RsltR create() {
		Srch01_RsltR row = new Srch01_RsltR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> Srch01_RsltR createByName(T proto) {
		Srch01_RsltR row = Srch01_RsltR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public Srch01_RsltR(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}
}