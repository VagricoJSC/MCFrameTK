package mcframe.serverMSBD.MSBDL0150;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;

import mcframe.serverCore.cache.MCJoinerList;

import static mcframe.commonCore.util.MCCollectionUtil.*;
import static mcframe.serverCore.cache.MCJoinerList.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;

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
	 * -- MSBDL0150_MST_PURC_RET_SCHD_Query_S01
	 */
	static MCQueryPlan MSBDL0150_MST_PURC_RET_SCHD_S01() {
		MST_PURC_RET_SCHD_R S0_T01 = MST_PURC_RET_SCHD_R.create("T01");
		MAVM_RD_DPT_R S0_M99 = MAVM_RD_DPT_R.create("M99");
		MAM_DPT_R S0_M02 = MAM_DPT_R.create("M02");
		MAM_BP_R S0_M05 = MAM_BP_R.create("M05");
		MAM_CUR_R S0_M51 = MAM_CUR_R.create("M51");
		MAM_CUR_R S0_M61 = MAM_CUR_R.create("M61");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL0150_MST_PURC_RET_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T01.purc_ret_schd_no,
						S0_T01.trd_cd,
						S0_T01.trd_ptn_typ,
						S0_T01.purc_dpt_cd,
						S0_M02.dpt_nm.as("purc_dpt_nm"),
						S0_T01.wg_cd,
						S0_T01.purc_usr_cd,
						S0_M02.ap_dpt_flg,
						S0_T01.sppl_cd,
						S0_M05.bp_nm.as("sppl_nm"),
						S0_M05.purc_amt_rnd_typ,
						S0_M05.purc_tax_rnd_typ,
						S0_M05.purc_tax_calc_typ,
						S0_M05.purc_upri_cng_flg,
						S0_M05.subcon_flg,
						S0_M05.repurc_obli_flg,
						nvl(S0_M05.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						S0_M05.sppl_iv_flg,
						S0_M05.prnt_lcl_cd,
						S0_M05.cntry_cd.as("sppl_cntry_cd"),
						S0_T01.sppl_cntct_dpt,
						S0_T01.sppl_cntct_psn,
						S0_T01.sppl_zip_cd,
						S0_T01.sppl_addr1,
						S0_T01.sppl_addr2,
						S0_T01.sppl_addr3,
						S0_T01.sppl_addr4,
						S0_T01.sppl_tel,
						S0_T01.sppl_fax,
						S0_M05.asppl_cd,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
							S0_M05.asppl_cd,
							S0_T01.schd_dt,
							value(false)
						).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
							S0_T01.sppl_cd,	
							S0_M05.asppl_cd,
							S0_T01.schd_dt,
							value(false)
						).as("ap_dpt_cd"),
						S0_T01.trd_cur_cd,
						bind("base_cur_cd").as("base_cur_cd"),
						S0_M51.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M51.upri_dec_place.as("base_cur_upri_dec_place"),
						bind("ptax_cur_cd").as("ptax_cur_cd"),
						S0_M61.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_M61.upri_dec_place.as("ptax_cur_upri_dec_place"),
						S0_T01.xrate,
						S0_T01.xrate_inpt_flg,
						S0_T01.ptax_xrate,
						S0_T01.ptax_xrate_inpt_flg,
						S0_T01.ret_sppl_nm,
						S0_T01.ret_sppl_cntct_dpt,
						S0_T01.ret_sppl_cntct_psn,
						S0_T01.ret_sppl_cntct_psn_title,
						S0_T01.ret_sppl_zip_cd,
						S0_T01.ret_sppl_addr1,
						S0_T01.ret_sppl_addr2,
						S0_T01.ret_sppl_addr3,
						S0_T01.ret_sppl_addr4,
						S0_T01.ret_sppl_tel,
						S0_T01.ret_sppl_fax,
						S0_T01.reg_dt,
						S0_T01.schd_dt,
						S0_T01.rcpt_iv_no,
						S0_T01.ref_rcpt_iv_no,
						S0_T01.tterm_cd1,
						S0_T01.tterm_rmrks1,
						S0_T01.tterm_cd2,
						S0_T01.tterm_rmrks2,
						S0_T01.tterm_cd3,
						S0_T01.tterm_rmrks3,
						S0_T01.trd_rmrks,
						S0_T01.intr_rmrks,
						S0_T01.purc_ret_print_rmrks,
						S0_T01.sub_char1,
						S0_T01.sub_char2,
						S0_T01.sub_char3,
						S0_T01.ins_usr_id,
						S0_T01.ins_usr_nm,
						S0_T01.ins_func_id,
						S0_T01.ins_ts,
						S0_T01.upd_cntr.as("pr_schd_upd_cntr"),
						S0_T01.upd_usr_id,
						S0_T01.upd_usr_nm,
						S0_T01.upd_func_id,
						S0_T01.upd_ts,
						S0_T01.upd_srv_req_no
					)
					.from(
						S0_T01
						.innerJoin(S0_M99).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M99.dpt_cd)
							)
						)
						.leftOuterJoin(S0_M02).on(
							bracket(
								S0_T01.purc_dpt_cd.eq(S0_M02.dpt_cd)
								.and(S0_T01.schd_dt.between(S0_M02.st_dt, S0_M02.end_dt))
							)
						)
						.leftOuterJoin(S0_M05).on(
							bracket(
								S0_T01.sppl_cd.eq(S0_M05.bp_cd)
							)
						)
						.leftOuterJoin(S0_M51).on(
							bracket(
								bind("base_cur_cd").eq(S0_M51.cur_cd)
							)
						)
						.leftOuterJoin(S0_M61).on(
							bracket(
								bind("ptax_cur_cd").eq(S0_M61.cur_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T01.purc_ret_schd_no.eq(bind("srch_tgt_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("purc_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("asppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.bsppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("asppl_nm", m.bp_nm());
							r.setStringNE("join_bsppl_cd_", m.bsppl_cd());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bsppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_spot_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("pay_spot_flg", m.pay_spot_flg());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("sppl_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tterm_nm3", m.tterm_nm());
					})
				)
			);
	}
}