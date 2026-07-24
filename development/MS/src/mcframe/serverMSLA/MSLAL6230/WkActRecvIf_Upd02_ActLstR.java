package mcframe.serverMSLA.MSLAL6230;

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;

/**
 * ブロック"WkActRecvIf_Upd02_ActLst"コンテナRowクラスです。<p>
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
 *  	<td>err_flg</td>
 *  	<td>Error flg.</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>peg_no</td>
 *  	<td>Pegging No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT INT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>data_lno</td>
 *  	<td>Data row No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_DATA_LNO IF_DATA_LNO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>data_no</td>
 *  	<td>Data No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_DATA_NO IF_DATA_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>exe_sts_typ</td>
 *  	<td>PG execution status type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXE_STS_TYP EXE_STS_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>data_crud_typ</td>
 *  	<td>Data update type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DATA_CRUD_TYP DATA_CRUD_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ext_sys_cd</td>
 *  	<td>External system cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_SYS_CD EXT_SYS_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ext_data_no</td>
 *  	<td>External system data No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_EXT_DATA_NO IF_EXT_DATA_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ext_data_lno</td>
 *  	<td>External system data row No.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_EXT_DATA_LNO IF_EXT_DATA_LNO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>data_make_dt</td>
 *  	<td>Creation date and time of source record</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TM TM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>imp_flg</td>
 *  	<td>To import</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>recv_dt</td>
 *  	<td>Receiving date</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>oper_inst_no</td>
 *  	<td>Operation order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#OPER_INST_NO OPER_INST_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mfg_inst_no</td>
 *  	<td>Mfg. order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MFG_INST_NO MFG_INST_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>inst_wk_act_flg</td>
 *  	<td>Order direct man-hour result</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mfg_inst_rev</td>
 *  	<td>Mfg. order rev. number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_REV SLIP_REV}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>div_seq</td>
 *  	<td>Split sequence number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#DIV_SEQ DIV_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>oper_cd</td>
 *  	<td>Operation cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#OPER_CD OPER_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>oper_seq</td>
 *  	<td>Operation sequence number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#OPER_SEQ OPER_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ext_oper_act_no</td>
 *  	<td>External operation result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_OPER_ACT_NO EXT_OPER_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_intr_rmrks</td>
 *  	<td>Man-hour internal remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#WK_ACT_INTR_RMRKS WK_ACT_INTR_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>abort_flg</td>
 *  	<td>Cancel remaining</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_schd_no</td>
 *  	<td>Man-hour schedule No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WK_SCHD_NO WK_SCHD_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ext_wk_act_no</td>
 *  	<td>External man-hour result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_WK_ACT_NO EXT_WK_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>brk_pd</td>
 *  	<td>Downtime</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#INT4 INT4}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wk_usr_dpt_cd</td>
 *  	<td>Worker dept. cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DPT_CD DPT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_usr_cd</td>
 *  	<td>Worker cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#USR_CD USR_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wk_day_cd</td>
 *  	<td>Work type cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WK_DAY_CD WK_DAY_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_cost</td>
 *  	<td>Man-hour</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WK_COST_QTY WK_COST_QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wk_rsn_cd</td>
 *  	<td>Man-hour reason cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WK_RSN_CD WK_RSN_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_cost_cd</td>
 *  	<td>Work element cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WK_COST_CD WK_COST_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>fclty</td>
 *  	<td>Equipment</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FCLTY FCLTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>st_hm</td>
 *  	<td>Start time</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TM TM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>end_hm</td>
 *  	<td>End time</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TM TM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_cost_calc_upd_flg</td>
 *  	<td>Allow update of man-hour auto-calculation</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ac_dt</td>
 *  	<td>Recording date</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>dpt_cd</td>
 *  	<td>Dept. cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DPT_CD DPT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>loc_cd</td>
 *  	<td>Location cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOC_CD LOC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>str_ln_cd</td>
 *  	<td>Rack/Line cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#STR_LN_CD STR_LN_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_cd</td>
 *  	<td>Item cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_CD ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub1</td>
 *  	<td>Branch No. 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB1 ITM_SUB1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>itm_sub2</td>
 *  	<td>Branch No. 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB2 ITM_SUB2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_sub3</td>
 *  	<td>Branch No. 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_SUB3 ITM_SUB3}]</td>
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
 *  	<td>ext_yield_act_no</td>
 *  	<td>External output result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#EXT_YIELD_ACT_NO EXT_YIELD_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char1</td>
 *  	<td>Spare CHAR column 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR1 IF_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char2</td>
 *  	<td>Spare CHAR column 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR2 IF_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char3</td>
 *  	<td>Spare CHAR column 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR3 IF_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char4</td>
 *  	<td>Spare CHAR column 4</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR4 IF_SUB_CHAR4}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char5</td>
 *  	<td>Spare CHAR column 5</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR5 IF_SUB_CHAR5}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char6</td>
 *  	<td>Spare CHAR column 6</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR6 IF_SUB_CHAR6}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char7</td>
 *  	<td>Spare CHAR column 7</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR7 IF_SUB_CHAR7}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char8</td>
 *  	<td>Spare CHAR column 8</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR8 IF_SUB_CHAR8}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char9</td>
 *  	<td>Spare CHAR column 9</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR9 IF_SUB_CHAR9}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char10</td>
 *  	<td>Spare CHAR column 10</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR10 IF_SUB_CHAR10}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char11</td>
 *  	<td>Spare CHAR column 11</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR11 IF_SUB_CHAR11}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char12</td>
 *  	<td>Spare CHAR column 12</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR12 IF_SUB_CHAR12}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char13</td>
 *  	<td>Spare CHAR column 13</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR13 IF_SUB_CHAR13}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char14</td>
 *  	<td>Spare CHAR column 14</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR14 IF_SUB_CHAR14}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char15</td>
 *  	<td>Spare CHAR column 15</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR15 IF_SUB_CHAR15}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char16</td>
 *  	<td>Spare CHAR column 16</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR16 IF_SUB_CHAR16}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char17</td>
 *  	<td>Spare CHAR column 17</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR17 IF_SUB_CHAR17}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char18</td>
 *  	<td>Spare CHAR column 18</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR18 IF_SUB_CHAR18}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char19</td>
 *  	<td>Spare CHAR column 19</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR19 IF_SUB_CHAR19}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char20</td>
 *  	<td>Spare CHAR column 20</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR20 IF_SUB_CHAR20}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char21</td>
 *  	<td>Spare CHAR column 21</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR21 IF_SUB_CHAR21}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char22</td>
 *  	<td>Spare CHAR column 22</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR22 IF_SUB_CHAR22}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char23</td>
 *  	<td>Spare CHAR column 23</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR23 IF_SUB_CHAR23}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char24</td>
 *  	<td>Spare CHAR column 24</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR24 IF_SUB_CHAR24}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char25</td>
 *  	<td>Spare CHAR column 25</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR25 IF_SUB_CHAR25}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char26</td>
 *  	<td>Spare CHAR column 26</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR26 IF_SUB_CHAR26}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char27</td>
 *  	<td>Spare CHAR column 27</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR27 IF_SUB_CHAR27}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char28</td>
 *  	<td>Spare CHAR column 28</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR28 IF_SUB_CHAR28}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char29</td>
 *  	<td>Spare CHAR column 29</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR29 IF_SUB_CHAR29}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char30</td>
 *  	<td>Spare CHAR column 30</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_CHAR30 IF_SUB_CHAR30}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_num1</td>
 *  	<td>Spare NUM column 1</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_NUM1 IF_SUB_NUM1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_num2</td>
 *  	<td>Spare NUM column 2</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_NUM2 IF_SUB_NUM2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_num3</td>
 *  	<td>Spare NUM column 3</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_NUM3 IF_SUB_NUM3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_num4</td>
 *  	<td>Spare NUM column 4</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_NUM4 IF_SUB_NUM4}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_num5</td>
 *  	<td>Spare NUM column 5</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#IF_SUB_NUM5 IF_SUB_NUM5}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_dt1</td>
 *  	<td>Spare DATE column 1</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_dt2</td>
 *  	<td>Spare DATE column 2</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_dt3</td>
 *  	<td>Spare DATE column 3</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_dt4</td>
 *  	<td>Spare DATE column 4</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_dt5</td>
 *  	<td>Spare DATE column 5</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>batch_log_no</td>
 *  	<td>Log No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BATCH_LOG_NO BATCH_LOG_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>log_sub_key1</td>
 *  	<td>Log sub key 1</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BATCH_LOG_SUB_KEY1 BATCH_LOG_SUB_KEY1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>log_sub_key2</td>
 *  	<td>Log sub key 2</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BATCH_LOG_SUB_KEY2 BATCH_LOG_SUB_KEY2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>Mfg. location cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOC_CD LOC_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>mfg_act_no</td>
 *  	<td>Mfg. result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MFG_ACT_NO MFG_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>oper_act_no</td>
 *  	<td>Operation result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#OPER_ACT_NO OPER_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wk_act_no</td>
 *  	<td>Man-hour result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WK_ACT_NO WK_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>mfg_inst_rev_flg</td>
 *  	<td>Change mfg. order rev. number</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>oper_wk_count</td>
 *  	<td>Number of operation man-hours</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ext_key_count</td>
 *  	<td>Number of external key columns</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ext_key_act_flg</td>
 *  	<td>External key result exist</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wk_schd_act_flg</td>
 *  	<td>Man-hour schedule/result exist</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>skip_by_if_ctl_flg</td>
 *  	<td>IF control skip row</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>not_dup_imp_flg</td>
 *  	<td>Do not allow duplicate import</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class WkActRecvIf_Upd02_ActLstR extends WkActRecvIf_Upd02_ActLstR_MC_A {

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static WkActRecvIf_Upd02_ActLstR create() {
		WkActRecvIf_Upd02_ActLstR row = new WkActRecvIf_Upd02_ActLstR(constMetas);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> WkActRecvIf_Upd02_ActLstR createByName(T proto) {
		WkActRecvIf_Upd02_ActLstR row = WkActRecvIf_Upd02_ActLstR.create();
		copyByName(row, proto);
		return row;
	}

	/**
	 * コンストラクタです。
	 */
	public WkActRecvIf_Upd02_ActLstR(ConstMetaList<? extends WkActRecvIf_Upd02_ActLstR> metas) {
		super(metas);
	}
}