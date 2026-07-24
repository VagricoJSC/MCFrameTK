package mcframe.serverMSBC.MSBCL0140;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMB.constant.*;
import mcframe.commonMS.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMS.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;
import static mcframe.serverMS.dbc.MSLCFunction.*;
import static mcframe.serverMS.dbc.MSUAFunction.*;

public class Query_MC {
	
	/**
	 * -- MSBCL0140_MST_PRCD_IO_SCHD_Query_D01
	 */
	static MCQueryPlan MSBCL0140_MST_PRCD_IO_SCHD_D01() {
		MST_PRCD_IO_SCHD_R S0_T = MST_PRCD_IO_SCHD_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0140_MST_PRCD_IO_SCHD_Query_D01")
					.delete(S0_T)
					.where(
						value(0).eq(value(0))
						.and(MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(S0_T.io_schd_sub_typ1).eq(value(true)))
						.and(S0_T.io_schd_pr_no.eq(bind("itm_ord_no")))
					)
			);
	}
	
	/**
	 * -- MSBCL0140_MST_PRCD_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0140_MST_PRCD_ITM_ORDER_S01() {
		MST_PRCD_ITM_ORDER_R S0_T1 = MST_PRCD_ITM_ORDER_R.create("T1");
		MAVM_RD_LOC_R S0_M = MAVM_RD_LOC_R.create("M");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M13 = MAM_SUNDRY_ITM_R.create("M13");
		MAM_ITM_NOT_FIX_R S0_M12 = MAM_ITM_NOT_FIX_R.create("M12");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0140_MST_PRCD_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T1.itm_ord_sts_typ,
						S0_T1.master_dt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M13.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.itm_ord_typ,
						S0_T1.mfg_loc_cd,
						S0_T1.mst_mfg_loc_cd,
						S0_T1.bom_ptn,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.rqst_wg_cd.as("rqst_wg_cd"),
						S0_T1.oper_ptn,
						S0_T1.nmr_qty,
						S0_T1.dnm_qty,
						S0_T1.fxd_yield_qty,
						S0_T1.inst_qty,
						S0_T1.yield_schd_qty,
						S0_M1.unit_cd,
						S0_M1.dec_place,
						S0_M1.rnd_typ,
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.cont_fctr_dec_place,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.ver_flg,
						S0_T1.ver_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_M1.sno1_mng_typ,
						S0_M1.sno2_mng_typ,
						S0_M1.sno3_mng_typ,
						S0_M1.sno4_mng_typ,
						S0_T1.po_schd_dt,
						S0_T1.mfg_st_schd_dt,
						S0_T1.mfg_end_schd_dt,
						S0_T1.gi_schd_dt,
						S0_T1.strg_schd_dt,
						S0_T1.accpt_schd_dt,
						S0_T1.insp_st_schd_dt,
						S0_T1.insp_end_schd_dt,
						S0_T1.avl_schd_dt,
						S0_T1.purc_lt,
						S0_T1.mfg_lt,
						S0_T1.xfr_lt,
						S0_T1.accpt_insp_lt,
						S0_T1.insp_lt,
						S0_T1.insp_offst,
						S0_T1.ord_fix_pd,
						S0_T1.lmt_dt,
						S0_T1.rqmt_no,
						decode(
							S0_M12.itm_cd,
							nullValue(),
							S0_T1.not_fix_flg,
							value(true)
						).as("not_fix_flg"),
						S0_T1.inst_po_cnt_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_cntr.as("itm_order_upd_cntr"),
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.innerJoin(S0_M).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M.loc_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M13.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M13.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M13.sno1))
								.and(S0_T1.sno2.eq(S0_M13.sno2))
								.and(S0_T1.sno3.eq(S0_M13.sno3))
								.and(S0_T1.sno4.eq(S0_M13.sno4))
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M12.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M12.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M12.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M12.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M12.sno1))
								.and(S0_T1.sno2.eq(S0_M12.sno2))
								.and(S0_T1.sno3.eq(S0_M12.sno3))
								.and(S0_T1.sno4.eq(S0_M12.sno4))
								.and(S0_T1.wg_cd.eq(S0_M12.wg_cd))
								.and(S0_M12.del_flg.eq(value(false)))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_ord_no.eq(bind("itm_ord_no")))
						.and(MSC_ORD_GNRT_TYP$IS_UPLND(S0_T1.ord_gnrt_typ).eq(value(false)))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_nm,
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
							r.setStringNE("wrk_nm", m.wrk_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("strg_site_cd", m.site_cd());
							r.setStringNE("strg_sppl_cd", m.sppl_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("strg_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.maker_cd,
							m.sppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
							r.setStringNE("mfg_sppl_cd", m.sppl_cd());
							r.setStringNE("mfg_maker_cd", m.maker_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("maker_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("maker_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0140_MST_PRCD_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0140_MST_PRCD_OPER_ORDER_S01() {
		MCTempView S0_T1 = createTempView("T1");
		MAM_ITM_R S0_M3 = MAM_ITM_R.create("M3");
		MAM_UNIT_R S0_M4 = MAM_UNIT_R.create("M4");
		MAM_ITM_OPER_R S0_M5 = MAM_ITM_OPER_R.create("M5");
		MAM_UNIT_R S0_M6 = MAM_UNIT_R.create("M6");
		MST_PRCD_OPER_ORDER_R S1_T1A = MST_PRCD_OPER_ORDER_R.create("T1A");
		MST_PRCD_ITM_ORDER_R S1_T1B = MST_PRCD_ITM_ORDER_R.create("T1B");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0140_MST_PRCD_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.pr("oper_ord_no"),
						S0_T1.pr("oper_ord_sts_typ"),
						S0_T1.pr("oper_cd"),
						S0_T1.pr("oper_seq"),
						S0_T1.pr("loc_cd"),
						S0_T1.pr("disp_seq"),
						S0_T1.pr("oper_schd_qty"),
						S0_M3.unit_cd.as("base_unit_cd"),
						S0_M4.unit_nm.as("base_unit_nm"),
						S0_M3.dec_place.as("base_dec_place"),
						decode(
							S0_M5.oper_unit_cd,
							nullValue(),
							value(1),
							S0_M5.oper_std_qty
						).as("oper_std_qty"),
						decode(
							S0_M5.oper_unit_cd,
							nullValue(),
							value(1),
							S0_M5.oper_conv_qty
						).as("oper_conv_qty"),
						nvl(
							S0_M5.oper_unit_cd,
							S0_M3.unit_cd
						).as("oper_unit_cd"),
						decode(
							S0_M5.oper_unit_cd,
							nullValue(),
							S0_M3.dec_place,
							S0_M5.dec_place
						).as("dec_place"),
						decode(
							S0_M5.oper_unit_cd,
							nullValue(),
							value(MAC_RND_TYP.RNDUP.value()),
							S0_M5.unit_conv_rnd_typ
						).as("unit_conv_rnd_typ"),
						decode(
							S0_M5.oper_unit_cd,
							nullValue(),
							S0_M4.unit_nm,
							S0_M6.unit_nm
						).as("oper_unit_nm"),
						S0_T1.pr("yield_oper_flg"),
						trunc(
							S0_T1.pr("st_schd_tm"),
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.pr("st_schd_tm").as("st_schd_hm"),
						trunc(
							S0_T1.pr("end_schd_tm"),
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.pr("end_schd_tm").as("end_schd_hm"),
						S0_T1.pr("oper_lt"),
						S0_T1.pr("oper_offst"),
						S0_T1.pr("oper_offst_typ"),
						S0_T1.pr("intr_rmrks"),
						S0_T1.pr("sub_char1"),
						S0_T1.pr("sub_char2"),
						S0_T1.pr("sub_char3")
					)
					.from(
						subQuery()
						.select(
							S1_T1A.prAll(),
							S1_T1B.itm_cd,
							S1_T1B.itm_sub1,
							S1_T1B.itm_sub2,
							S1_T1B.itm_sub3,
							S1_T1B.mst_mfg_loc_cd,
							S1_T1B.mfg_st_schd_dt
						)
						.from(
							S1_T1A
							.innerJoin(S1_T1B).on(
								bracket(
									S1_T1A.itm_ord_no.eq(S1_T1B.itm_ord_no)
								)
							)
						)
						.where(
							value(0).eq(value(0))
						).view(S0_T1)
						.leftOuterJoin(S0_M3).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S1_T1B.itm_cd).eq(S0_M3.itm_cd))
								.and(S0_T1.pr(S1_T1B.itm_sub1).eq(S0_M3.itm_sub1))
								.and(S0_T1.pr(S1_T1B.itm_sub2).eq(S0_M3.itm_sub2))
								.and(S0_T1.pr(S1_T1B.itm_sub3).eq(S0_M3.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M3.unit_cd.eq(S0_M4.unit_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.pr(S1_T1B.itm_cd).eq(S0_M5.itm_cd))
								.and(S0_T1.pr(S1_T1B.itm_sub1).eq(S0_M5.itm_sub1))
								.and(S0_T1.pr(S1_T1B.itm_sub2).eq(S0_M5.itm_sub2))
								.and(S0_T1.pr(S1_T1B.itm_sub3).eq(S0_M5.itm_sub3))
								.and(S0_T1.pr(S1_T1B.mst_mfg_loc_cd).eq(S0_M5.loc_cd))
								.and(S0_T1.pr("oper_cd").eq(S0_M5.oper_cd))
								.and(S0_T1.pr("oper_ptn").eq(S0_M5.oper_ptn))
								.and(S0_T1.pr("oper_seq").eq(S0_M5.oper_seq))
								.and(S0_T1.pr(S1_T1B.mfg_st_schd_dt).gte(S0_M5.st_dt))
								.and(S0_T1.pr(S1_T1B.mfg_st_schd_dt).lte(S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M5.oper_unit_cd.eq(S0_M6.unit_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.pr("itm_ord_no").eq(bind("itm_ord_no")))
					)
					.orderBy(S0_T1.pr("disp_seq").asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0140_MST_PRCD_OPER_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCL0140_MST_PRCD_OPER_ORDER_S02() {
		MST_PRCD_OPER_ORDER_R S0_T1 = MST_PRCD_OPER_ORDER_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0140_MST_PRCD_OPER_ORDER_Query_S02")
					.mainQuery()
					.select(S0_T1.prAll())
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.itm_ord_no.eq(bind("itm_ord_no")))
						.and(S0_T1.oper_ptn.eq(value(MAC_STR.NULL_VAL.value())))
					)
			);
	}
}