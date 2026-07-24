package mcframe.serverMSLA.MSLAL6050;

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
	 * -- MSLAL6050_MST_XFR_INST_Query_S01
	 */
	static MCQueryPlan MSLAL6050_MST_XFR_INST_S01() {
		MSW_XFR_ALLOC_STS_KEY_R S0_W1 = MSW_XFR_ALLOC_STS_KEY_R.create("W1");
		MST_XFR_ALLOC_STS_R S0_T1 = MST_XFR_ALLOC_STS_R.create("T1");
		MST_XFR_INST_D_R S0_T2 = MST_XFR_INST_D_R.create("T2");
		MST_XFR_INST_R S0_T3 = MST_XFR_INST_R.create("T3");
		MAM_DPT_R S0_M2 = MAM_DPT_R.create("M2");
		MAM_ITM_R S0_M9 = MAM_ITM_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		MAM_DPT_R S0_M16 = MAM_DPT_R.create("M16");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6050_MST_XFR_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T3.xfr_inst_no,
						S0_T3.trd_cd,
						S0_T3.trd_ptn_typ,
						S0_T3.xfr_schd_dt,
						S0_T3.xfr_inst_dt,
						S0_T3.inst_dpt_cd,
						S0_M2.dpt_nm.as("inst_dpt_nm"),
						S0_T3.inst_usr_cd,
						S0_T2.xfr_inst_d_no,
						S0_T1.xfr_alloc_sts_no,
						S0_T1.dlv_slip_no,
						S0_T1.dlv_slip_d_no,
						S0_T3.lg_grp_cd,
						S0_T1.gi_loc_cd,
						S0_T1.gi_str_ln_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gi_loc_cd,
							S0_T3.xfr_inst_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
						).as("gi_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gi_loc_cd,
							S0_T3.xfr_inst_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
						).as("gi_loc_fax"),
						S0_T1.gr_loc_cd,
						S0_T1.gr_str_ln_cd,
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T3.xfr_inst_dt,
							value(MAC_LOC_ADDR_TYP.TEL.value()),
							nullValue()
						).as("gr_loc_tel"),
						MAPA_LOC$F_GET_LOC_ADDR(
							S0_T1.gr_loc_cd,
							S0_T3.xfr_inst_dt,
							value(MAC_LOC_ADDR_TYP.FAX.value()),
							nullValue()
						).as("gr_loc_fax"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						nvl(
							S0_M10.itm_nm,
							S0_M9.itm_nm
						).as("itm_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_T1.alloc_sno1.as("sno1"),
						S0_T1.sno1_null_flg,
						S0_T1.alloc_sno2.as("sno2"),
						S0_T1.sno2_null_flg,
						S0_T1.alloc_sno3.as("sno3"),
						S0_T1.sno3_null_flg,
						S0_T1.alloc_sno4.as("sno4"),
						S0_T1.sno4_null_flg,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.alloc_flg,
						S0_T1.abort_flg,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.ret_prov_typ,
						S0_T1.ret_prov_basis_typ,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M16.dpt_nm.as("bd_dpt_nm"),
						S0_T3.inst_rmrks,
						S0_T1.inst_d_rmrks,
						S0_T1.pr_sts_typ,
						S0_T1.disp_seq,
						// this field is appended by sql coverter.
						S0_T1.xfr_schd_no.as("join_xfr_schd_no_")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.xfr_alloc_sts_no.eq(S0_T1.xfr_alloc_sts_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.xfr_inst_d_no.eq(S0_T2.xfr_inst_d_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.xfr_inst_no.eq(S0_T3.xfr_inst_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.dpt_cd.eq(S0_T3.inst_dpt_cd)
								.and(S0_T3.xfr_inst_dt.between(S0_M2.st_dt, S0_M2.end_dt))
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M9.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M9.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M9.itm_sub3.eq(S0_T2.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.itm_cd.eq(S0_T2.itm_cd)
								.and(S0_M10.itm_sub1.eq(S0_T2.itm_sub1))
								.and(S0_M10.itm_sub2.eq(S0_T2.itm_sub2))
								.and(S0_M10.itm_sub3.eq(S0_T2.itm_sub3))
								.and(S0_M10.sno1.eq(S0_T1.sno1))
								.and(S0_M10.sno2.eq(S0_T1.sno2))
								.and(S0_M10.sno3.eq(S0_T1.sno3))
								.and(S0_M10.sno4.eq(S0_T1.sno4))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_M16.dpt_cd.eq(S0_T1.bd_dpt_cd)
								.and(S0_T3.xfr_inst_dt.between(S0_M16.st_dt, S0_M16.end_dt))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_xfr_schd_no_")
						))
						.addSelect(m -> toArray(
							m.xfr_schd_no,
							m.xfr_src_no,
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_schd_no", m.xfr_schd_no());
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
							r.setStringNE("xfr_src_no", m.xfr_src_no());
					}),
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
							m.first_gr_dt,
							m.lmt_dt,
							m.vld_dt
						))
						.addMap((r, m) -> {
							r.setDateNE("vld_dt", m.vld_dt());
							r.setDateNE("lmt_dt", m.lmt_dt());
							r.setDateNE("first_gr_dt", m.first_gr_dt());
					}),
					j -> j
						.add(MAM_TRD_R.class, r -> toCondition(
							r.getStringNE("trd_cd")
						))
						.addSelect(m -> toArray(
							m.trd_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_nm", m.trd_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.site_co_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("lg_grp_nm", m.lg_grp_nm());
							r.setStringNE("join_site_co_cd_", m.site_co_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gi_loc_cd"),
							r.getStringNE("gi_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("gr_loc_cd"),
							r.getStringNE("gr_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_str_ln_nm", m.str_ln_nm());
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
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_unit_nm", m.unit_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_SITE_CO_R.class, r -> toCondition(
							r.getStringNE("join_site_co_cd_")
						))
						.addSelect(m -> toArray(
							m.site_co_cd,
							m.site_co_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_co_cd", m.site_co_cd());
							r.setStringNE("site_co_nm", m.site_co_nm());
					})
				)
			);
	}
}