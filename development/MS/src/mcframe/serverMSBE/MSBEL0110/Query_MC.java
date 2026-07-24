package mcframe.serverMSBE.MSBEL0110;

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
	 * -- MSBEL0110_MST_STK_Query_S01
	 */
	static MCQueryPlan MSBEL0110_MST_STK_S01() {
		MST_STK_R S0_T = MST_STK_R.create("T");
		MSW_STK_LST_R S0_W = MSW_STK_LST_R.create("W");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M7 = MAM_LOC_R.create("M7");
		MAM_DPT_R S0_M16 = MAM_DPT_R.create("M16");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL0110_MST_STK_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.stk_arrv_bp_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.fix_no_typ,
						S0_T.fix_no,
						S0_T.pack_unit_cd,
						S0_T.gd_cd,
						S0_T.in_xfr_typ,
						S0_T.quality_typ,
						S0_T.asst_typ,
						S0_T.stk_insp_typ,
						S0_T.stk_id_typ,
						S0_T.stk_bp_cd,
						S0_T.pack_unit_qty,
						S0_T.base_unit_qty,
						S0_T.sub_char1.as("stk_sub_char1"),
						S0_T.sub_char2.as("stk_sub_char2"),
						S0_T.sub_char3.as("stk_sub_char3"),
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						S0_W.disp_seq,
						S0_M1.pckg_unit_cd,
						S0_M1.unit_cd.as("base_unit_cd"),
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_M1.itm_alt_nm1,
						S0_M1.itm_alt_nm2,
						S0_M1.itm_alt_nm3,
						S0_M1.itm_alt_nm4,
						S0_M7.loc_nm,
						S0_M7.site_cd,
						S0_M7.wg_cd,
						S0_M7.loc_grp_cd,
						S0_M7.asst_dpt_cd.as("acpt_dpt_cd"),
						S0_M16.dpt_nm.as("acpt_dpt_nm")
					)
					.from(
						S0_T
						.innerJoin(S0_W).on(
							bracket(
								S0_T.itm_cd.eq(S0_W.itm_cd)
								.and(S0_T.itm_sub1.eq(S0_W.itm_sub1))
								.and(S0_T.itm_sub2.eq(S0_W.itm_sub2))
								.and(S0_T.itm_sub3.eq(S0_W.itm_sub3))
								.and(S0_T.loc_cd.eq(S0_W.loc_cd))
								.and(S0_T.str_ln_cd.eq(S0_W.str_ln_cd))
								.and(S0_T.stk_arrv_bp_cd.eq(S0_W.stk_arrv_bp_cd))
								.and(S0_T.lot_no.eq(S0_W.lot_no))
								.and(S0_T.sublot_no.eq(S0_W.sublot_no))
								.and(S0_T.sno1.eq(S0_W.sno1))
								.and(S0_T.sno2.eq(S0_W.sno2))
								.and(S0_T.sno3.eq(S0_W.sno3))
								.and(S0_T.sno4.eq(S0_W.sno4))
								.and(S0_T.fix_no_typ.eq(S0_W.fix_no_typ))
								.and(S0_T.fix_no.eq(S0_W.fix_no))
								.and(S0_T.pack_unit_cd.eq(S0_W.pack_unit_cd))
								.and(S0_T.gd_cd.eq(S0_W.gd_cd))
								.and(S0_T.in_xfr_typ.eq(S0_W.in_xfr_typ))
								.and(S0_T.quality_typ.eq(S0_W.quality_typ))
								.and(S0_T.asst_typ.eq(S0_W.asst_typ))
								.and(S0_T.stk_insp_typ.eq(S0_W.stk_insp_typ))
								.and(S0_T.stk_id_typ.eq(S0_W.stk_id_typ))
								.and(S0_T.stk_bp_cd.eq(S0_W.stk_bp_cd))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T.sno1.eq(S0_M2.sno1))
								.and(S0_T.sno2.eq(S0_M2.sno2))
								.and(S0_T.sno3.eq(S0_M2.sno3))
								.and(S0_T.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T.loc_cd.eq(S0_M7.loc_cd)
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M7.asst_dpt_cd.eq(S0_M16.dpt_cd)
								.and(bind("base_dt").between(S0_M16.st_dt, S0_M16.end_dt))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.base_unit_qty.gt(value(0)))
						.and(S0_M1.stk_lst_flg.eq(value(true)))
					)
					.orderBy(S0_W.disp_seq.asc())
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.bp_lot_no,
							m.lmt_dt,
							m.unreg_lmt_flg,
							m.ver_no,
							m.vld_dt
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
							r.setStringNE("bp_lot_no", m.bp_lot_no());
							r.setBooleanNE("unreg_lmt_flg", m.unreg_lmt_flg());
							r.setDateNE("vld_dt", m.vld_dt());
							r.setDateNE("lmt_dt", m.lmt_dt());
					}),
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setNumberNE("pckg_unit_dec_place", m.dec_place());
							r.setStringNE("pckg_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pckg_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("conv_qty", m.conv_qty());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("loc_cd"),
							r.getStringNE("str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
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
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_STK_GD_R.class, r -> toCondition(
							r.getStringNE("gd_cd")
						))
						.addSelect(m -> toArray(
							m.gd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gd_nm", m.gd_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
					})
				)
			);
	}
}