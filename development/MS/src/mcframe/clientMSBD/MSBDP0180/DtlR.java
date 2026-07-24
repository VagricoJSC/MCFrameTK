package mcframe.clientMSBD.MSBDP0180;

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
 *  	<td>itm_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5030.ItmR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>iv_itm_nm</td>
 *  	<td>Item name for I/V</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ITM_NM ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>stk_mng_typ</td>
 *  	<td>Inventory management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#STK_MNG_TYP STK_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>asset_mng_typ</td>
 *  	<td>Asset management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ASSET_MNG_TYP ASSET_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>asset_mng_typ_nm</td>
 *  	<td>Asset management type name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#ASSET_MNG_TYP_NM ASSET_MNG_TYP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>Miscellaneous item</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>itm_pay_crryovr_times</td>
 *  	<td>Payment carry-over count</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CRRYOVR_TIMES CRRYOVR_TIMES}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>dscnt_itm_flg</td>
 *  	<td>Discount item</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>lot_mng_typ</td>
 *  	<td>Lot management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOT_MNG_TYP LOT_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sublot_mng_typ</td>
 *  	<td>Sublot management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SUBLOT_MNG_TYP SUBLOT_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sno1_mng_typ</td>
 *  	<td>SEIBAN No. 1 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sno2_mng_typ</td>
 *  	<td>SEIBAN No. 2 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sno3_mng_typ</td>
 *  	<td>SEIBAN No. 3 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sno4_mng_typ</td>
 *  	<td>SEIBAN No. 4 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>maker_cd</td>
 *  	<td>Maker cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_CD BP_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>maker_nm</td>
 *  	<td>Maker name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_NM BP_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sppl_itm_cd</td>
 *  	<td>Supplier item cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_ITM_CD BP_ITM_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sppl_itm_nm</td>
 *  	<td>Supplier item name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BP_ITM_NM BP_ITM_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>lot_no_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMSUB.MSUBP5030.LotNoR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>AP dept. cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DPT_CD DPT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ap_dpt_nm</td>
 *  	<td>AP dept. name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DPT_NM DPT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_unit_cd</td>
 *  	<td>Unit cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_CD UNIT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_nm</td>
 *  	<td>Unit name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_NM UNIT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_unit_dec_place</td>
 *  	<td>Transaction unit number of decimal places</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DEC_PLACE DEC_PLACE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_rnd_typ</td>
 *  	<td>Transaction unit rounding type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#RND_TYP RND_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_unit_conv_base_qty</td>
 *  	<td>Conversion base qty.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_unit_conv_qty</td>
 *  	<td>Conversion qty.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_unit_qty_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5040.QtyR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>base_unit_cd</td>
 *  	<td>Base unit cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_CD UNIT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>base_unit_nm</td>
 *  	<td>Base unit name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_NM UNIT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>base_unit_dec_place</td>
 *  	<td>Number of decimal places (Base unit)</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DEC_PLACE DEC_PLACE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>base_unit_rnd_typ</td>
 *  	<td>Base unit rounding type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#RND_TYP RND_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>base_unit_qty_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5040.QtyR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>pay_crryovr_times</td>
 *  	<td>Payment carry-over count</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#CRRYOVR_TIMES CRRYOVR_TIMES}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>purc_dtl_upd_flg</td>
 *  	<td>Details correction</td>
 *  	<td>Boolean</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#FLG FLG}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>trd_cur_upri_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>dscnt_rsn_cd</td>
 *  	<td>Discount reason cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BIZ_RSN_CD BIZ_RSN_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>dscnt_rsn_nm</td>
 *  	<td>Discount reason name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#BIZ_RSN_NM BIZ_RSN_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>base_cur_upri_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5060.UpriR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>base_cur_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>base_cur_tax_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>base_cur_inc_tax_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ptax_cur_upri_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5060.UpriR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ptax_cur_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ptax_cur_tax_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ptax_cur_inc_tax_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>wtax_rate</td>
 *  	<td>Withholding tax rate</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#WTAX_RATE WTAX_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>wtax_amt_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMAUB.MAUBP5050.AmtR}</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sno_wrk_no_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMSUB.MSUBP5020.SnoWrkNoR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>purc_typ</td>
 *  	<td>Purchase type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PURC_TYP PURC_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>purc_typ_nm</td>
 *  	<td>Purchase type name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PURC_TYP_NM PURC_TYP_NM}]</td>
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
 *  	<td>slo_no</td>
 *  	<td>Sales order No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLO_NO SLO_NO}]</td>
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
 *  	<td>bditm_p</td>
 *  	<td><br></td>
 *  	<td>InnerRow</td>
 *  	<td><br></td>
 *  	<td>{@link mcframe.clientMSUB.MSUBP5040.BdItemR}</td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bd_lot_mng_typ</td>
 *  	<td>Charged lot management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOT_MNG_TYP LOT_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bd_sublot_mng_typ</td>
 *  	<td>Charged sublot management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOT_MNG_TYP LOT_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bd_lot_no_typ</td>
 *  	<td>Charged lot numbering type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOT_NO_TYP LOT_NO_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bd_sublot_no_typ</td>
 *  	<td>Charged sublot numbering type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#LOT_NO_TYP LOT_NO_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bd_sno1_mng_typ</td>
 *  	<td>Charged SEIBAN No. 1 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bd_sno2_mng_typ</td>
 *  	<td>Charged SEIBAN No. 2 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>bd_sno3_mng_typ</td>
 *  	<td>Charged SEIBAN No. 3 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>bd_sno4_mng_typ</td>
 *  	<td>Charged SEIBAN No. 4 management type</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SNO_MNG_TYP SNO_MNG_TYP}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>intr_rmrks</td>
 *  	<td>Internal details remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PO_D_INTR_RMRKS PO_D_INTR_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>Transaction details remarks</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TRD_D_RMRKS TRD_D_RMRKS}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char1</td>
 *  	<td>Details spare 1</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PO_D_SUB_CHAR1 PO_D_SUB_CHAR1}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>sub_char2</td>
 *  	<td>Details spare 2</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PO_D_SUB_CHAR2 PO_D_SUB_CHAR2}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>sub_char3</td>
 *  	<td>Details spare 3</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMS.meta.MS_META#PO_D_SUB_CHAR3 PO_D_SUB_CHAR3}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>purc_act_d_no</td>
 *  	<td>Purchase result details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PURC_ACT_D_NO PURC_ACT_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>purc_act_d_seq</td>
 *  	<td>Purchase result details sequence number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_SEQ SLIP_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ref_purc_act_no</td>
 *  	<td>Reference purchase result No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PURC_ACT_NO PURC_ACT_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ref_purc_act_rev</td>
 *  	<td>Reference purchase result rev. number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_REV SLIP_REV}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ref_purc_act_seq</td>
 *  	<td>Reference purchase result sequence number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_SEQ SLIP_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>ref_purc_act_d_no</td>
 *  	<td>Reference purchase result details No.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#PURC_ACT_D_NO PURC_ACT_D_NO}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>ref_purc_act_d_seq</td>
 *  	<td>Reference purchase result details sequence number</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#SLIP_SEQ SLIP_SEQ}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>base_purc_ac_dt</td>
 *  	<td>Purchase recording date (Base)</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act_ac_dt</td>
 *  	<td>Result recording date</td>
 *  	<td>Date</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DT DT}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act_unit_qty</td>
 *  	<td>Result qty.</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#QTY QTY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act_unit_cd</td>
 *  	<td>Result unit cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_CD UNIT_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act_unit_nm</td>
 *  	<td>Result unit name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#UNIT_NM UNIT_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act_cur_upri</td>
 *  	<td>Result unit price</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MONEY MONEY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act_cur_amt</td>
 *  	<td>Result amount</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MONEY MONEY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act_tax_amt</td>
 *  	<td>Tax included result amount</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MONEY MONEY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act_tax_cd</td>
 *  	<td>Result tax cd.</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TAX_CD TAX_CD}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act_tax_nm</td>
 *  	<td>Result tax name</td>
 *  	<td>String</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TAX_NM TAX_NM}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>act_tax_rate</td>
 *  	<td>Result tax rate</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#TAX_RATE TAX_RATE}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td><br></td>
 *  	<td>act_cur_tax_amt</td>
 *  	<td>Result tax amount</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#MONEY MONEY}]</td>
 *  	<td><br></td>
 *  </tr>
 *  <tr >
 *  	<td><br></td>
 *  	<td>disp_seq</td>
 *  	<td>Display order</td>
 *  	<td>Number</td>
 *  	<td>[{@link mcframe.commonMA.meta.MA_META#DISP_SEQ DISP_SEQ}]</td>
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