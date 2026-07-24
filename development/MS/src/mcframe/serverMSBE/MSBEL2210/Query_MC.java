package mcframe.serverMSBE.MSBEL2210;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.container.MCRow;

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

import mcframe.serverMSBD.MSBDL0140.Srch01_DtlR;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;

public class Query_MC extends mcframe.serverMSBD.MSBDL0140.Query {
	
	/**
	 * -- MSBEL2210_MST_PO_Query_S01
	 */
	static MCQueryPlan MSBEL2210_MST_PO_S01() {
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_ARR_PR_R ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_PURC_SCHD_R PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MAM_BP_R SPPL = MAM_BP_R.create("SPPL");
		

		return createQueryPlan()
			.setQuery(
				sql("MSBEL2210_MST_PO_Query_S01")
					.mainQuery()
					.select(
						PO.trd_cd,
						PO.trd_ptn_typ,
						PO.purc_dpt_cd,
						PO.wg_cd.as("purc_dpt_wg_cd"),
						PO.purc_usr_cd,
						PO.sppl_cd,
						SPPL.bp_nm.as("sppl_nm"),
						SPPL.subcon_flg,
						SPPL.repurc_obli_flg,
						nvl(SPPL.outsrc_upri_typ, value(getCo().outsrc_upri_typ())).as("outsrc_upri_typ"),
						SPPL.cntry_cd.as("sppl_cntry_cd"),
						SPPL.sppl_iv_flg,
						SPPL.purc_amt_rnd_typ,
						SPPL.purc_tax_rnd_typ,
						SPPL.pay_crryovr_times,
						MAPA_BP$F_GET_AP_DPT_CD_NE(
								SPPL.asppl_cd,
								bind("today"),
								value(false)
							).as("mst_ap_dpt_cd"),
						MAPA_BP$F_GET_AP_DPT_CD_NE2(
								PO.sppl_cd,
								SPPL.asppl_cd,
								bind("today"),
								value(false)
							).as("ap_dpt_cd"),
						SPPL.prnt_lcl_cd,
						SPPL.purc_tax_calc_typ,
						PO.sppl_cntct_dpt,
						PO.sppl_cntct_psn,
						PO.sppl_tel,
						PO.sppl_fax,
						SPPL.sppl_iv_flg,
						value(MAC_SLIP_EACH_LOT_TYP.NOT_EACH.value()).as("purc_slip_each_lot_typ"),
						SPPL.asppl_cd,
						PO.trd_cur_cd,
						PO.trd_cur_cd.as("src_trd_cur_cd"),
						PO.xrate,
						PO.xrate_inpt_flg,
						PO.ptax_xrate,
						PO.ptax_xrate_inpt_flg,
						PO.tterm_cd1,
						PO.tterm_rmrks1,
						PO.tterm_cd2,
						PO.tterm_rmrks2,
						PO.tterm_cd3,
						PO.tterm_rmrks3,
						PO.trd_rmrks,
						PO.po_print_rmrks,
						PO.ins_usr_id,
						PO.ins_usr_nm,
						PO.ins_ts,
						PO.ins_func_id,
						PO.upd_cntr,
						PO.upd_usr_id,
						PO.upd_usr_nm,
						PO.upd_ts,
						PO.upd_func_id,
						PO.upd_srv_req_no
					)
					.from(
						PO
						.innerJoin(POD).on(
							bracket(
								PO.po_no.eq(POD.po_no)
							)
						)
						.innerJoin(ARRPR).on(
							bracket(
								POD.po_d_no.eq(ARRPR.po_d_no)
							)
						)
						.innerJoin(PURCSCHD).on(
							bracket(
								PURCSCHD.arr_pr_no.eq(ARRPR.arr_pr_no)
							)
						)
						.leftOuterJoin(SPPL).on(
							bracket(
								PO.sppl_cd.eq(SPPL.bp_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(PO.can_flg.eq(value(false)))
						.cutoff$and(PURCSCHD.purc_schd_no.like(bind("purc_schd_no"))
					)
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
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
					})
				)
			);
	}
	static MCDynamicSQLInfo MSBEL2210_MST_PURC_SCHD_S01_WHERE01() {
		MST_PURC_SCHD_R S0_T1 = MST_PURC_SCHD_R.create("T1");
		MST_PO_R S0_T5 = MST_PO_R.create("T5");
		MAM_DPT_R S0_M40 = MAM_DPT_R.create("M40");
		MAVM_RD_DPT_R S0_M0 = MAVM_RD_DPT_R.create("M0");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return
				when(null)
					.select(REP1,
						S0_T5.trd_cd,
						S0_T5.purc_usr_cd,
						S0_T5.purc_dpt_cd,
						S0_T5.wg_cd.as("purc_dpt_wg_cd"),
						S0_M40.dpt_nm.as("purc_dpt_nm"),
						S0_M40.ap_dpt_flg.as("ap_dpt_flg")
					)
				.view(REP1, v ->
					v.innerJoin(S0_M0).on(
						S0_M0.dpt_cd.eq(S0_T5.purc_dpt_cd)
					)
					.leftOuterJoin(S0_M40).on(
						S0_M40.dpt_cd.eq(S0_T5.purc_dpt_cd)
						.and(S0_T5.po_dt.between(S0_M40.st_dt, S0_M40.end_dt))
					)
				)
					.predicate(REP1, p ->
						p.cutoff$and(S0_T1.purc_schd_no.like(bind("purc_schd_no")))
					);
	}
	static MCDynamicSQLInfo MSBEL2210_MST_PURC_SCHD_S02_WHERE01() {
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_PO_R S0_T9 = MST_PO_R.create("T9");
		MST_ARR_ACT_R S0_T10 = MST_ARR_ACT_R.create("T10");
		MST_STK_R S0_T11 = MST_STK_R.create("T11");
		MST_PURC_ACT_IO_R S1_W1 = MST_PURC_ACT_IO_R.create("W1");
		MST_PURC_ACT_D_R S1_W2 = MST_PURC_ACT_D_R.create("W2");
		MST_PURC_ACT_R S1_W3 = MST_PURC_ACT_R.create("W3");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCDynamicSQLID REP2 = createDynamicSQLID("REP2");
		
		return
				when(null)
					.select(REP1,
						nvl(
							S0_T11.base_unit_qty,
							S0_T10.base_unit_qty
						).as("org_base_unit_qty"),
						S0_T11.fix_no,
						subQuery()
						.select(max(S1_W2.temp_ap_flg))
						.from(S1_W1
							.innerJoin(S1_W2).on(
								S1_W2.purc_act_d_no.eq(S1_W1.purc_act_d_no)
								.and(S1_W2.purc_act_d_seq.eq(S1_W1.purc_act_d_seq))
							)
							.innerJoin(S1_W3).on(
								S1_W3.purc_act_no.eq(S1_W2.purc_act_no)
								.and(S1_W3.purc_act_seq.eq(S1_W2.purc_act_seq))
							)
						)
						.where(
							S1_W1.arr_act_no.eq(S0_T10.arr_act_no)
							.and(S1_W3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
						).as("temp_ap_flg"),
						S0_T5.quality_typ.as("arr_schd_quality_typ"),
						S0_T5.stk_insp_typ.as("arr_schd_stk_insp_typ"),
						S0_T5.stk_id_typ.as("arr_schd_stk_id_typ")
					)
					.view(REP1, v ->
						v.innerJoin(S0_M0).on(
							bracket(
								S0_T9.wg_cd.eq(S0_M0.wg_cd)
							)
						)
					)
					.view(REP2, v ->
						v.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T10.arr_act_no.eq(S0_T11.fix_no)
								.and(S0_T11.in_xfr_typ.eq(value(MSC_IN_XFR_TYP.IN_LOC.value())))
								// 暫定買掛の場合、自社在庫も含まれるため、資産区分を条件から除外する
								//.and(S0_T11.asst_typ.eq(value(MAC_ASST_TYP.OTH.value())))
								.and(S0_T11.stk_id_typ.neq(value(MSC_STK_ID_TYP.ACCPT_DFCT.value())))
								.and(S0_T11.fix_no_typ.eq(value(MSC_FIX_NO_TYP.ARR_ACT_NO.value())))
							)
						)
					)
					.predicate(REP1, p ->
						p.cutoff$and(S0_T4.purc_schd_no.like(bind("purc_schd_no")))
					);
	}
	static MCDynamicSQLInfo MSBEL2210_MST_PURC_SCHD_S03_WHERE01() {
		MST_PURC_SCHD_R S0_T4 = MST_PURC_SCHD_R.create("T4");
		MST_ARR_SCHD_R S0_T5 = MST_ARR_SCHD_R.create("T5");
		MST_PO_R S0_T9 = MST_PO_R.create("T9");
		MAVM_RD_WG_R S0_M0 = MAVM_RD_WG_R.create("M0");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return
				when(null)
					.select(REP1,
						decode(
							S0_T5.arr_skip_flg,
							value(true),
							S0_T4.base_unit_schd_qty,
							S0_T5.base_unit_qty
						).as("org_base_unit_qty"),
						value(false).as("temp_ap_flg")
					)
					.view(REP1, v ->
						v.innerJoin(S0_M0).on(
							bracket(
								S0_T9.wg_cd.eq(S0_M0.wg_cd)
							)
						)
					)
					.predicate(REP1, p ->
						p.cutoff$and(S0_T4.purc_schd_no.like(bind("purc_schd_no")))
						.and(
							S0_T4.non_purc_flg.eq(value(true))
							.or(S0_T4.base_unit_schd_qty.subtract(S0_T5.arr_qty).gt(value(0)))
						)
					);
	}
	/**
	 * -- MSBEL2210_MST_RCPT_IV_Query_S01
	 */
	static MCQueryPlan MSBEL2210_MST_RCPT_IV_S01() {
		MST_RCPT_IV_P_R RCPTIVP = MST_RCPT_IV_P_R.create("RCPTIVP");
		MST_RCPT_IV_R RCPTIV = MST_RCPT_IV_R.create("RCPTIV");
		MSVM_DLV_ID_R DLVID = MSVM_DLV_ID_R.create("DLVID");
		MST_PURC_SCHD_R PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_RCPT_IV_D_P_R RCPTIVD = MST_RCPT_IV_D_P_R.create("RCPTIVD");
		MST_IV_R IV = MST_IV_R.create("IV");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2210_MST_RCPT_IV_Query_S01")
					.mainQuery()
					.select(
						// すべて仕入対象外の場合は確定オフ
						decode(
							subQuery()
							.select(min(PURCSCHD.non_purc_flg))
							.from(RCPTIVD
								.innerJoin(PURCSCHD)
									.on(PURCSCHD.purc_schd_no.eq(RCPTIVD.purc_schd_no))
							)
							.where(RCPTIVD.rcpt_iv_mng_no.eq(RCPTIVP.rcpt_iv_mng_no)
								.and(RCPTIVD.rcpt_iv_rev.eq(RCPTIVP.rcpt_iv_rev))
							),
							value(true), value(false), RCPTIVP.purc_cmpl_flg
						).as("fix_flg"),
						RCPTIVP.rcpt_iv_mng_no,
						RCPTIVP.rcpt_iv_rev,
						decode(
							RCPTIVP.rcpt_iv_rev,
							bind("tmp_max_rev"),
							value(1),
							value(0)
						).as("latest_flg"),
						nvl2(RCPTIV.rcpt_iv_mng_no, value(false), value(true)).as("can_flg"),
						RCPTIVP.rcpt_iv_no,
						RCPTIVP.rcpt_iv_src_typ,
						RCPTIVP.purc_schd_dt,
						RCPTIVP.purc_ac_schd_dt,
						RCPTIVP.purc_dt,
						RCPTIVP.iv_dt,
						RCPTIVP.pay_schd_dt,
						RCPTIVP.pay_basis_dt,
						RCPTIVP.sppl_cd,
						RCPTIVP.in_to_id_typ,
						RCPTIVP.in_to_id_cd,
						nvl(
								RCPTIVP.in_to_id_nm,
							DLVID.dlv_id_nm
						).as("in_to_id_nm"),
						RCPTIVP.in_to_cntct_dpt.as("sppl_cntct_dpt"),
						RCPTIVP.in_to_cntct_psn.as("sppl_cntct_psn"),
						RCPTIVP.in_to_zip_cd.as("sppl_zip_cd"),
						RCPTIVP.in_to_addr1.as("sppl_addr1"),
						RCPTIVP.in_to_addr2.as("sppl_addr2"),
						RCPTIVP.in_to_addr3.as("sppl_addr3"),
						RCPTIVP.in_to_addr4.as("sppl_addr4"),
						RCPTIVP.in_to_tel.as("sppl_tel"),
						RCPTIVP.in_to_fax.as("sppl_fax"),
						RCPTIVP.in_to_cntry_cd.as("sppl_cntry_cd"),
						RCPTIVP.trnspt_cd,
						RCPTIVP.vssl_flght,
						RCPTIVP.load_port_cd,
						RCPTIVP.etd_dt,
						RCPTIVP.dschrg_port_cd,
						RCPTIVP.eta_dt,
						RCPTIVP.via_port_cd,
						RCPTIVP.via_schd_dt,
						RCPTIVP.tterm_cd1,
						RCPTIVP.tterm_rmrks1,
						RCPTIVP.tterm_cd2,
						RCPTIVP.tterm_rmrks2,
						RCPTIVP.tterm_cd3,
						RCPTIVP.tterm_rmrks3,
						RCPTIVP.trd_cur_cd,
						RCPTIVP.xrate_inpt_flg,
						RCPTIVP.xrate,
						RCPTIVP.ptax_xrate_inpt_flg,
						RCPTIVP.ptax_xrate,
						RCPTIVP.trd_rmrks,
						RCPTIVP.rcpt_iv_rmrks,
						RCPTIVP.intr_rmrks.as("rcpt_iv_intr_rmrks"),
						RCPTIVP.sub_char1.as("rcpt_iv_sub_char1"),
						RCPTIVP.sub_char2.as("rcpt_iv_sub_char2"),
						RCPTIVP.sub_char3.as("rcpt_iv_sub_char3"),
						RCPTIVP.ins_usr_id,
						RCPTIVP.ins_usr_nm,
						RCPTIVP.ins_ts,
						RCPTIVP.ins_func_id,
						RCPTIV.upd_cntr.as("rcpt_iv_upd_cntr"),
						RCPTIVP.upd_usr_id,
						RCPTIVP.upd_usr_nm,
						RCPTIVP.upd_ts,
						RCPTIVP.upd_func_id,
						RCPTIVP.upd_srv_req_no,
						decode(IV.pre_rcpt_iv_flg,
							value(false), value(true), value(false)).as("iv_reg_flg")
					)
					.from(
						RCPTIVP
						.leftOuterJoin(RCPTIV).on(
							bracket(
								RCPTIV.rcpt_iv_mng_no.eq(RCPTIVP.rcpt_iv_mng_no)
							)
						)
						.leftOuterJoin(DLVID).on(
							bracket(
								DLVID.dlv_id_typ.eq(RCPTIVP.in_to_id_typ)
								.and(DLVID.dlv_id_cd.eq(RCPTIVP.in_to_id_cd))
							)
						)
						.leftOuterJoin(IV).on(
							bracket(
								IV.rcpt_iv_mng_no.eq(RCPTIV.rcpt_iv_mng_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(RCPTIVP.rcpt_iv_no.eq(bind("rcpt_iv_no")))
						.and(
							bracket(
								bind("newest_flg").eq(value(true))
								.and(RCPTIVP.rcpt_iv_rev.eq(bind("tmp_max_rev")))
							)
							.or(
								bind("newest_flg").eq(value(false))
								.and(RCPTIVP.rcpt_iv_rev.eq(bind("rcpt_iv_rev")))
							)
						)
						.cutoff$and(RCPTIVP.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm,
							m.pay_crryovr_times,
							m.prnt_lcl_cd,
							m.purc_amt_rnd_typ,
							m.purc_tax_calc_typ,
							m.purc_tax_rnd_typ,
							m.purc_upri_cng_flg,
							m.sppl_iv_flg,
							m.subcon_flg,
							m.repurc_obli_flg,
							m.outsrc_upri_typ,
							m.asppl_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
							r.setBooleanNE("subcon_flg", m.subcon_flg());
							r.setBooleanNE("sppl_iv_flg", m.sppl_iv_flg());
							r.setStringNE("purc_amt_rnd_typ", m.purc_amt_rnd_typ());
							r.setStringNE("purc_tax_rnd_typ", m.purc_tax_rnd_typ());
							r.setBooleanNE("purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setNumberNE("pay_crryovr_times", m.pay_crryovr_times());
							r.setStringNE("prnt_lcl_cd", m.prnt_lcl_cd());
							r.setStringNE("purc_tax_calc_typ", m.purc_tax_calc_typ());
							r.setBooleanNE("repurc_obli_flg", m.repurc_obli_flg());
							r.setStringNE("outsrc_upri_typ", m.bp_cd() == null ? null : m.outsrc_upri_typ() == null ? getCo().outsrc_upri_typ() : m.outsrc_upri_typ());
							r.setStringNE("asppl_cd", m.asppl_cd());
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
							r.setNumberNE("trd_cur_upri_dec_place", m.upri_dec_place());
							r.setNumberNE("trd_cur_amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_TRNSPT_R.class, r -> toCondition(
							r.getStringNE("trnspt_cd")
						))
						.addSelect(m -> toArray(
							m.trnspt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trnspt_nm", m.trnspt_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("load_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("load_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("dschrg_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dschrg_port_nm", m.port_nm());
					}),
					j -> j
						.add(MAM_EXIM_PORT_R.class, r -> toCondition(
							r.getStringNE("via_port_cd")
						))
						.addSelect(m -> toArray(
							m.port_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("via_port_nm", m.port_nm());
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
	/**
	 * -- MSBEL2210_MST_RCPT_IV_D_Query_S01
	 */
	static MCQueryPlan MSBEL2210_MST_RCPT_IV_D_S01() {
		MST_RCPT_IV_D_P_R RCPTIVDP = MST_RCPT_IV_D_P_R.create("RCPTIVDP");
		MST_RCPT_IV_P_R RCPTIV = MST_RCPT_IV_P_R.create("RCPTIV");
		MST_PO_D_R POD = MST_PO_D_R.create("POD");
		MST_PO_R PO = MST_PO_R.create("PO");
		MST_ARR_PR_R ARRPR = MST_ARR_PR_R.create("ARRPR");
		MST_ARR_SCHD_R ARRSCHD = MST_ARR_SCHD_R.create("ARRSCHD");
		MST_PURC_SCHD_R PURCSCHD = MST_PURC_SCHD_R.create("PURCSCHD");
		MST_DLV_INST_D_R DLVINSTD = MST_DLV_INST_D_R.create("DLVINSTD");
		MST_SLO_D_R SLOD = MST_SLO_D_R.create("SLOD");
		
		MAM_BP_R SCST = MAM_BP_R.create("SCST");
		MAM_BP_R TDLV = MAM_BP_R.create("TDLV");
		
		MAVM_RD_DPT_R RDDPT = MAVM_RD_DPT_R.create("RDDPT");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2210_MST_RCPT_IV_D_Query_S01")
					.mainQuery()
					.select(
						RCPTIVDP.trd_cd,
						RCPTIVDP.rcpt_iv_d_no,
						RCPTIVDP.purc_id_typ,
						RCPTIVDP.purc_rsn_cd,
						ARRSCHD.arr_skip_flg,
						ARRPR.purc_ddlv_flg,
						trunc(
								ARRPR.arr_schd_tm,
								MCDateFmt.DD
							).as("arr_schd_dt"),
						RCPTIV.purc_schd_dt,
						RCPTIV.pay_basis_dt,
						ARRSCHD.mfg_inst_no,
						POD.mfg_loc_cd,
						POD.bom_ptn,
						POD.po_no,
						POD.po_d_no,
						RCPTIVDP.rcpt_iv_d_no,
						PURCSCHD.purc_schd_no,
						ARRSCHD.arr_schd_no,
						PURCSCHD.non_purc_flg,
						ARRSCHD.outsrc_flg,
						nullValue().as("purc_act_no"),
						nullValue().as("purc_act_seq"),
						nullValue().as("purc_act_rev"),
						nullValue().as("purc_act_d_no"),
						nullValue().as("purc_act_d_seq"),
						ARRSCHD.arr_ptn_typ,
						ARRSCHD.sync_flg,
						ARRSCHD.sync_flg.as("schd_sync_flg"),
						POD.purc_basis_typ,
						POD.purc_basis_typ,
						RCPTIVDP.itm_cd,
						RCPTIVDP.itm_sub1,
						RCPTIVDP.itm_sub2,
						RCPTIVDP.itm_sub3,
						RCPTIVDP.itm_nm,
						RCPTIVDP.iv_itm_nm,
						POD.maker_cd,
						SLOD.cntry_org_cd,
						POD.trd_unit_qty.as("src_trd_unit_qty"),
						POD.trd_unit_cd.as("src_trd_unit_cd"),
						POD.base_unit_qty.as("src_base_unit_qty"),
						POD.trd_cur_upri.as("src_trd_cur_upri"),
						POD.trd_cur_proc_upri.as("src_trd_cur_proc_upri"),
						POD.trd_cur_onr_prov_upri.as("src_trd_cur_onr_prov_upri"),
						POD.trd_cur_dscnt_amt.as("src_trd_cur_dscnt_amt"),
						POD.trd_cur_amt.as("src_trd_cur_amt"),
						POD.trd_cur_proc_amt.as("src_trd_cur_proc_amt"),
						POD.trd_cur_onr_prov_amt.as("src_trd_cur_onr_prov_amt"),
						POD.trd_cur_tax_amt.as("src_trd_cur_tax_amt"),
						POD.wtax_rate.as("src_wtax_rate"),
						POD.tax_cd.as("src_tax_cd"),
						RCPTIVDP.trd_unit_cd,
						RCPTIVDP.trd_unit_qty,
						RCPTIVDP.base_unit_cd,
						RCPTIVDP.base_unit_qty,
						RCPTIVDP.base_unit_qty.as("base_unit_qty_bf_cng"),
						ARRSCHD.arr_qty.as("base_unit_arr_qty"),
						PURCSCHD.base_unit_schd_qty,
						PURCSCHD.base_unit_purc_qty,
						PURCSCHD.base_unit_purc_qty.add(PURCSCHD.base_unit_accpt_dfct_qty).as("base_unit_purc_act_qty"),
						ARRSCHD.gd_cd.as("gd_cd"),
						ARRSCHD.quality_typ.as("quality_typ"),
						RCPTIVDP.sno1,
						RCPTIVDP.sno2,
						RCPTIVDP.sno3,
						RCPTIVDP.sno4,
						POD.in_to_loc_cd.as("dlv_loc_cd"),
						POD.str_ln_cd,
						POD.drct_dlv_typ,
						SLOD.slo_d_no,
						SLOD.slo_no,
						nvl(
							DLVINSTD.dlv_cd,
							POD.dlv_cd
						).as("scst_cd"),
						SCST.dlv_cal_cd.as("scst_cal_cd"),
						nvl2(
							DLVINSTD.dlv_cd,
							nvl(
								DLVINSTD.dlv_nm,
								SCST.bp_nm
							),
							decode(
								POD.dlv_sundry_flg,
								value(true),
								POD.dlv_nm,
								SCST.bp_nm
							)
						).as("scst_nm"),
						SCST.cntry_cd.as("scst_cntry_cd"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_sundry_flg,
							POD.dlv_sundry_flg
						).as("scst_sundry_flg"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_cntct_dpt,
							POD.dlv_cntct_dpt
						).as("scst_cntct_dpt"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_cntct_psn,
							POD.dlv_cntct_psn
						).as("scst_cntct_psn"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_zip_cd,
							POD.dlv_zip_cd
						).as("scst_zip_cd"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_addr1,
							POD.dlv_addr1
						).as("scst_addr1"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_addr2,
							POD.dlv_addr2
						).as("scst_addr2"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_addr3,
							POD.dlv_addr3
						).as("scst_addr3"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_addr4,
							POD.dlv_addr4
						).as("scst_addr4"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_tel,
							POD.dlv_tel
						).as("scst_tel"),
						nvl2(
							DLVINSTD.dlv_cd,
							DLVINSTD.dlv_fax,
							POD.dlv_fax
						).as("scst_fax"),
						POD.drct_dlv_typ,
						nvl(
							DLVINSTD.tdlv_cd,
							POD.tdlv_cd
						).as("tdlv_cd"),
						nvl2(
							DLVINSTD.tdlv_cd,
							nvl(
								DLVINSTD.tdlv_nm,
								TDLV.bp_nm
							),
							decode(
								POD.tdlv_sundry_flg,
								value(true),
								POD.tdlv_nm,
								TDLV.bp_nm
							)
						).as("tdlv_nm"),
						TDLV.cntry_cd.as("tdlv_cntry_cd"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_cntct_dpt,
							POD.tdlv_cntct_dpt
						).as("tdlv_cntct_dpt"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_cntct_psn,
							POD.tdlv_cntct_psn
						).as("tdlv_cntct_psn"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_sundry_flg,
							POD.tdlv_sundry_flg
						).as("tdlv_sundry_flg"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_zip_cd,
							POD.tdlv_zip_cd
						).as("tdlv_zip_cd"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_addr1,
							POD.tdlv_addr1
						).as("tdlv_addr1"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_addr2,
							POD.tdlv_addr2
						).as("tdlv_addr2"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_addr3,
							POD.tdlv_addr3
						).as("tdlv_addr3"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_addr4,
							POD.tdlv_addr4
						).as("tdlv_addr4"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_tel,
							POD.tdlv_tel
						).as("tdlv_tel"),
						nvl2(
							DLVINSTD.tdlv_cd,
							DLVINSTD.tdlv_fax,
							POD.tdlv_fax
						).as("tdlv_fax"),
						ARRSCHD.lot_no,
						ARRSCHD.sublot_no,
						ARRSCHD.ver_no,
						nullValue().as("bd_lot_no"),
						nullValue().as("bp_dlv_slip_no"),
						nullValue().as("bp_dlv_slip_d_no"),
						RCPTIVDP.upri_not_tgt_flg,
						RCPTIVDP.interim_flg,
						nullValue().as("purc_dtl_upd_flg"),
						RCPTIVDP.tax_fix_flg,
						RCPTIVDP.tax_cd,
						RCPTIVDP.trd_cur_upri.as("trd_cur_upri"),
						RCPTIVDP.trd_cur_amt.as("trd_cur_amt"),
						RCPTIVDP.trd_cur_tax_amt.as("trd_cur_tax_amt"),
						RCPTIVDP.trd_cur_amt.add(RCPTIVDP.trd_cur_tax_amt).as("trd_cur_inc_tax_amt"),
						RCPTIVDP.dscnt_rsn_cd,
						RCPTIVDP.trd_cur_dscnt_amt,
						RCPTIVDP.trd_cur_proc_upri,
						RCPTIVDP.trd_cur_proc_amt,
						RCPTIVDP.trd_cur_onr_prov_upri,
						RCPTIVDP.trd_cur_onr_prov_amt,
						RCPTIVDP.wtax_rate,
						RCPTIVDP.wtax_amt.as("trd_cur_wtax_amt"),
						RCPTIVDP.sppl_itm_cd,
						RCPTIVDP.sppl_itm_nm,
						bracket(
								cases()
									.when(POD.dlv_cd.isNotNull())
										.then(SLOD.cst_itm_cd)
									.otherwise(nullValue())
							).as("cst_itm_cd"),
						bracket(
								cases()
									.when(POD.dlv_cd.isNotNull())
										.then(SLOD.cst_itm_nm)
									.otherwise(nullValue())
							).as("cst_itm_nm"),
						RCPTIVDP.bd_itm_cd,
						RCPTIVDP.bd_itm_sub1,
						RCPTIVDP.bd_itm_sub2,
						RCPTIVDP.bd_itm_sub3,
						RCPTIVDP.bd_sno1,
						RCPTIVDP.bd_sno2,
						RCPTIVDP.bd_sno3,
						RCPTIVDP.bd_sno4,
						RCPTIVDP.bd_loc_cd,
						RCPTIVDP.bd_lot_no,
						RCPTIVDP.bd_sublot_no,
						RCPTIVDP.bd_dpt_cd,
						RCPTIVDP.bd_ctg_cd,
						RCPTIVDP.bd_oper_cd,
						RCPTIVDP.bd_slo_no,
						RCPTIVDP.bd_iv_no,
						RCPTIVDP.bd_po_no,
						RCPTIVDP.ap_dpt_cd,
						RCPTIVDP.trd_d_rmrks,
						RCPTIVDP.rcpt_iv_d_rmrks,
						RCPTIVDP.intr_d_rmrks.as("rcpt_iv_intr_d_rmrks"),
						RCPTIVDP.sub_char1.as("rcpt_iv_d_sub_char1"),
						RCPTIVDP.sub_char2.as("rcpt_iv_d_sub_char2"),
						RCPTIVDP.sub_char3.as("rcpt_iv_d_sub_char3"),
						POD.po_print_d_rmrks,
						ARRPR.arr_pr_no,
						ARRPR.upd_cntr.as("arr_pr_upd_cntr"),
						RCPTIVDP.manual_add_flg,
						// ヘッダ項目
						RCPTIVDP.po_no,
						RCPTIVDP.purc_dpt_cd,
						RCPTIVDP.purc_usr_cd,
						RCPTIVDP.wg_cd.as("purc_dpt_wg_cd"),
						RCPTIV.xrate,
						RCPTIV.ptax_xrate,
						RCPTIV.trd_rmrks,
						PO.po_print_rmrks,
						// this field is appended by sql coverter.
						RCPTIV.sppl_cd.as("join_sppl_cd_"),
						// this field is appended by sql coverter.
						SLOD.slo_d_no.as("join_slo_d_no_"),
						// this field is appended by sql coverter.
						SLOD.slo_no.as("join_slo_no_"),
						// this field is appended by sql coverter.
						POD.bd_bp_cd.as("join_bd_bp_cd_"),
						// this field is appended by sql coverter.
						POD.itm_cd.as("join_itm_cd_"),
						// this field is appended by sql coverter.
						POD.itm_sub1.as("join_itm_sub1_"),
						// this field is appended by sql coverter.
						POD.itm_sub2.as("join_itm_sub2_"),
						// this field is appended by sql coverter.
						POD.itm_sub3.as("join_itm_sub3_"),
						// this field is appended by sql coverter.
						POD.tax_cd.as("join_tax_cd_"),
						// this field is appended by sql coverter.
						RCPTIV.iv_dt.as("join_base_dt_")
					)
					.from(
						RCPTIVDP
						.innerJoin(RDDPT).on(
								RDDPT.dpt_cd.eq(RCPTIVDP.purc_dpt_cd)
						)
						.leftOuterJoin(RCPTIV).on(
							bracket(
								RCPTIV.rcpt_iv_mng_no.eq(RCPTIVDP.rcpt_iv_mng_no)
								.and(RCPTIV.rcpt_iv_rev.eq(RCPTIVDP.rcpt_iv_rev))
							)
						)
						.leftOuterJoin(PURCSCHD).on(
							bracket(
								RCPTIVDP.purc_schd_no.eq(PURCSCHD.purc_schd_no)
							)
						)
						.leftOuterJoin(ARRSCHD).on(
							bracket(
								PURCSCHD.arr_schd_no.eq(ARRSCHD.arr_schd_no)
							)
						)
						.leftOuterJoin(ARRPR).on(
							bracket(
								ARRSCHD.arr_pr_no.eq(ARRPR.arr_pr_no)
							)
						)
						.leftOuterJoin(POD).on(
							bracket(
								ARRPR.po_d_no.eq(POD.po_d_no)
							)
						)
						.leftOuterJoin(PO).on(
							bracket(
								POD.po_no.eq(PO.po_no)
							)
						)
						.leftOuterJoin(DLVINSTD).on(
							bracket(
								ARRSCHD.dlv_inst_d_no.eq(DLVINSTD.dlv_inst_d_no)
							)
						)
						.leftOuterJoin(SCST).on(
							bracket(
									SCST.bp_cd.eq(nvl(
										DLVINSTD.dlv_cd,
										POD.dlv_cd
									)
								)
							)
						)
						.leftOuterJoin(TDLV).on(
							bracket(
									TDLV.bp_cd.eq(nvl(
										DLVINSTD.tdlv_cd,
										POD.tdlv_cd
									)
								)
							)
						)
						.leftOuterJoin(SLOD).on
							(bracket(
									POD.slo_d_no.eq(SLOD.slo_d_no)
								)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(RCPTIV.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
						.and(RCPTIV.rcpt_iv_rev.eq(bind("rcpt_iv_rev")))
					)
					.orderBy(RCPTIVDP.rcpt_iv_d_no.asc())
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
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("join_slo_no_")
						))
						.addSelect(m -> toArray(
							m.cst_cd,
							m.xrate,
							m.trd_ptn_typ,
							m.sls_basis_typ,
							m.tterm_cd1,
							m.tterm_cd2,
							m.tterm_cd3,
							m.tterm_rmrks1,
							m.tterm_rmrks2,
							m.tterm_rmrks3,
							m.trd_cur_cd,
							m.ptax_xrate
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_cd", m.cst_cd());
							r.setNumberNE("slo_xrate", m.xrate());
							r.setStringNE("slo_trd_ptn_typ", m.trd_ptn_typ());
							r.setStringNE("sls_basis_typ", m.sls_basis_typ());
							r.setStringNE("slo_tterm_cd1", m.tterm_cd1());
							r.setStringNE("slo_tterm_cd2", m.tterm_cd2());
							r.setStringNE("slo_tterm_cd3", m.tterm_cd3());
							r.setStringNE("slo_tterm_rmrks1", m.tterm_rmrks1());
							r.setStringNE("slo_tterm_rmrks2", m.tterm_rmrks2());
							r.setStringNE("slo_tterm_rmrks3", m.tterm_rmrks3());
							r.setStringNE("slo_cur_cd", m.trd_cur_cd());
							r.setNumberNE("slo_ptax_xrate", m.ptax_xrate());
					}),
					j -> j
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("cst_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("slo_tterm_cd1")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_nm1", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("slo_tterm_cd2")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_nm2", m.tterm_nm());
					}),
					j -> j
						.add(MAM_TTERM_R.class, r -> toCondition(
							r.getStringNE("slo_tterm_cd3")
						))
						.addSelect(m -> toArray(
							m.tterm_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_tterm_nm3", m.tterm_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("slo_cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_cur_nm", m.cur_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_mng_typ,
							m.loc_nm,
							m.site_cd,
							m.sppl_cd,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("site_cd", m.site_cd());
							r.setStringNE("dlv_loc_nm", m.loc_nm());
							r.setStringNE("dlv_loc_wg_cd", m.wg_cd());
							r.setStringNE("dlv_loc_sppl_cd", m.sppl_cd());
							r.setStringNE("loc_mng_typ", m.loc_mng_typ());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("dlv_loc_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_loc_wg_nm", m.wg_nm());
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
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("purc_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm,
							m.xpns_purc_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_rsn_nm", m.biz_rsn_nm());
							r.setBooleanNE("xpns_purc_flg", m.xpns_purc_flg());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dscnt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dscnt_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_sppl_cd_")
						))
						.addSelect(m -> toArray(
							m.pay_crryovr_times
						))
						.addMap((r, m) -> {
							r.setNumberNE("pay_crryovr_times", m.pay_crryovr_times());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bd_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("ap_dpt_cd"),
							r.getDateNE("join_base_dt_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ap_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("bd_dpt_cd"),
							r.getDateNE("join_base_dt_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_dpt_nm", m.dpt_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("bd_itm_cd"),
							r.getStringNE("bd_itm_sub1"),
							r.getStringNE("bd_itm_sub2"),
							r.getStringNE("bd_itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.sublot_mng_typ,
							m.sublot_no_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_itm_nm", m.itm_nm());
							r.setStringNE("bd_lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("bd_lot_no_typ", m.lot_no_typ());
							r.setStringNE("bd_sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("bd_sublot_no_typ", m.sublot_no_typ());
							r.setStringNE("bd_sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("bd_sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("bd_sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("bd_sno4_mng_typ", m.sno4_mng_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("bd_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_COST_CTG_R.class, r -> toCondition(
							r.getStringNE("bd_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_ctg_nm", m.ctg_nm());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("bd_oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("join_bd_bp_cd_")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("bd_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.asset_mng_typ,
							m.bp_lot_flg,
							m.cont_fctr_dec_place,
							m.cont_fctr_flg,
							m.cont_fctr_rnd_typ,
							m.cont_fctr_unit_cd,
							m.dscnt_itm_flg,
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd,
							m.sundry_itm_flg,
							m.lot_mng_typ,
							m.lot_no_typ,
							m.purc_upri_cng_flg,
							m.sno1_mng_typ,
							m.sno2_mng_typ,
							m.sno3_mng_typ,
							m.sno4_mng_typ,
							m.stk_mng_typ,
							m.std_cont_fctr,
							m.sublot_mng_typ,
							m.sublot_no_typ,
							m.ver_flg,
							m.arr_skip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("asset_mng_typ", m.asset_mng_typ());
							r.setBooleanNE("bp_lot_flg", m.bp_lot_flg());
							r.setNumberNE("cont_fctr_dec_place", m.cont_fctr_dec_place());
							r.setBooleanNE("cont_fctr_flg", m.cont_fctr_flg());
							r.setStringNE("cont_fctr_rnd_typ", m.cont_fctr_rnd_typ());
							r.setStringNE("cont_fctr_unit_cd", m.cont_fctr_unit_cd());
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
							if (!m.sundry_itm_flg()) r.setStringNE("itm_nm", m.itm_nm());
							r.setBooleanNE("sundry_itm_flg", m.sundry_itm_flg());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
							r.setStringNE("lot_mng_typ", m.lot_mng_typ());
							r.setStringNE("lot_no_typ", m.lot_no_typ());
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
							r.setBooleanNE("purc_upri_cng_flg", m.purc_upri_cng_flg());
							r.setStringNE("sno1_mng_typ", m.sno1_mng_typ());
							r.setStringNE("sno2_mng_typ", m.sno2_mng_typ());
							r.setStringNE("sno3_mng_typ", m.sno3_mng_typ());
							r.setStringNE("sno4_mng_typ", m.sno4_mng_typ());
							r.setNumberNE("std_cont_fctr", m.std_cont_fctr());
							r.setStringNE("sublot_mng_typ", m.sublot_mng_typ());
							r.setStringNE("sublot_no_typ", m.sublot_no_typ());
							r.setBooleanNE("ver_flg", m.ver_flg());
							if (!r.getBooleanNE("arr_skip_flg")) r.setBooleanNE("arr_skip_flg", m.arr_skip_flg());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("join_itm_cd_"),
							r.getStringNE("join_itm_sub1_"),
							r.getStringNE("join_itm_sub2_"),
							r.getStringNE("join_itm_sub3_"),
							r.getStringNE("src_trd_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("src_trd_unit_conv_qty", m.conv_qty());
							r.setNumberNE("src_trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("src_trd_unit_dec_place", m.dec_place());
							r.setStringNE("src_trd_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("join_tax_cd_")
						))
						.addSelect(m -> toArray(
								m.inc_tax_flg,
								m.tax_nm,
								m.tax_rate,
								m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("src_tax_nm", m.tax_nm());
							r.setNumberNE("src_tax_rate", m.tax_rate());
							r.setStringNE("src_tax_typ", m.tax_typ());
							r.setBooleanNE("src_inc_tax_flg", m.inc_tax_flg());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("cntry_org_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cntry_org_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("scst_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("scst_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_CNTRY_R.class, r -> toCondition(
							r.getStringNE("tdlv_cntry_cd")
						))
						.addSelect(m -> toArray(
							m.cntry_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("tdlv_cntry_nm", m.cntry_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("purc_dpt_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
					})
				)
			);
	}
	static MCDynamicSQLInfo MSBDL0140_MST_PURC_ACT_D_S01_WHERE01() {
		MST_PURC_ACT_R S0_T12 = MST_PURC_ACT_R.create("T12");
		
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return
				when(null)
						.predicate(REP1, p ->
							p.cutoff$and(S0_T12.rcpt_iv_mng_no.eq(bind("rcpt_iv_mng_no")))
							.cutoff$and(S0_T12.rcpt_iv_rev.eq(bind("rcpt_iv_rev")))
							.and(S0_T12.slip_sts_typ.neq(value(MAC_SLIP_STS_TYP.CAN.value())))
						);
	}
	
	static MCJoinerList<Srch01_DtlR> MSBEL2210_DtlR_J01() {
		return joinInfo(
			j -> j
				.add(MST_PO_D_R.class, r -> toCondition(
					r.po_d_no()
					
				))
				.addSelect(t -> toArray(
					t.po_no
				))
				.addMap((r, t) -> {
					r.po_no(t.po_no());
			}),
			j -> j
				.add(MST_SLO_D_R.class, r -> toCondition(
					r.slo_d_no()
					
				))
				.addSelect(t -> toArray(
					t.cntry_org_cd
				))
				.addMap((r, t) -> {
					r.cntry_org_cd(t.cntry_org_cd());
			}),
			j -> j
				.add(MAM_CNTRY_R.class, r -> toCondition(
					r.getStringNE("cntry_org_cd")
				))
				.addSelect(m -> toArray(
					m.cntry_nm
				))
				.addMap((r, m) -> {
					r.setStringNE("cntry_org_nm", m.cntry_nm());
			}),
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.getStringNE("trd_cd")
				))
				.addSelect(m -> toArray(
					m.trd_nm,
					m.trd_ptn_typ
				))
				.addMap((r, m) -> {
					r.setStringNE("trd_nm", m.trd_nm());
					r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
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
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("purc_dpt_wg_cd")
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.setStringNE("purc_dpt_wg_nm", m.wg_nm());
			}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()
				))
				.addSelect(m -> toArray(
					m.exim_xpns_typ
				))
				.addMap((r, m) -> {
					r.exim_xpns_typ(m.exim_xpns_typ());
				})
		);
	}
	static MCJoinerList<MCRow> MSBEL2210_DtlR_J02() {
		return joinInfo(
			j -> j
				.add(MAM_TRD_R.class, r -> toCondition(
					r.getStringNE("trd_cd")
				))
				.addSelect(m -> toArray(
					m.trd_nm,
					m.trd_ptn_typ
				))
				.addMap((r, m) -> {
					r.setStringNE("trd_nm", m.trd_nm());
					r.setStringNE("trd_ptn_typ", m.trd_ptn_typ());
			}),
			j -> j
				.add(MST_PURC_ACT_D_R.class, r -> toCondition(
					r.getStringNE("purc_act_d_no"),
					r.getNumberNE("purc_act_d_seq")
				))
				.addSelect(t -> toArray(
					t.purc_act_no,
					t.purc_act_seq
				))
				.addMap((r, t) -> {
					r.addStringColumn("join_purc_act_no_", t.purc_act_no());
					r.addNumberColumn("join_purc_act_seq_", t.purc_act_seq());
			}),
			j -> j
				.add(MST_PURC_ACT_R.class, r -> toCondition(
					r.getStringNE("join_purc_act_no_"),
					r.getNumberNE("join_purc_act_seq_")
				))
				.addSelect(t -> toArray(
					t.po_no,
					t.purc_dpt_cd,
					t.wg_cd,
					t.purc_usr_cd,
					t.trd_rmrks,
					t.intr_rmrks,
					t.sub_char1,
					t.sub_char2,
					t.sub_char3,
					t.ac_dt
				))
				.addMap((r, t) -> {
					if (r.getStringNE("po_no") == null) r.setStringNE("po_no", t.po_no());
					if (r.getStringNE("purc_dpt_cd") == null) r.setStringNE("purc_dpt_cd", t.purc_dpt_cd());
					if (r.getStringNE("purc_dpt_wg_cd") == null) r.setStringNE("purc_dpt_wg_cd", t.wg_cd());
					if (r.getStringNE("purc_usr_cd") == null) r.setStringNE("purc_usr_cd", t.purc_usr_cd());
					r.setStringNE("hdr_sub_char1", t.sub_char1());
					r.setStringNE("hdr_sub_char2", t.sub_char2());
					r.setStringNE("hdr_sub_char3", t.sub_char3());
					if (t.ac_dt() != null) r.addDateColumn("join_base_dt_", t.ac_dt());
			}),
			j -> j
				.add(MAM_USR_R.class, r -> toCondition(
					r.getStringNE("purc_usr_cd")
				))
				.addSelect(t -> toArray(
					t.usr_nm
				))
				.addMap((r, t) -> {
					r.setStringNE("purc_usr_nm", t.usr_nm());
			}),
			j -> j
				.add(MAM_DPT_R.class, r -> toCondition(
					r.getStringNE("purc_dpt_cd"),
					r.getDateNE("join_base_dt_")
				))
				.addSelect(t -> toArray(
					t.dpt_nm,
					t.ap_dpt_flg
				))
				.addMap((r, t) -> {
					r.setStringNE("purc_dpt_nm", t.dpt_nm());
					r.setBooleanNE("ap_dpt_flg", t.ap_dpt_flg());
			}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("purc_dpt_wg_cd")
				))
				.addSelect(t -> toArray(
					t.wg_nm
				))
				.addMap((r, t) -> {
					r.setStringNE("purc_dpt_wg_nm", t.wg_nm());
			}),
			j -> j
				.add(MAM_ITM_R.class, r -> toCondition(
					r.getStringNE("itm_cd"),
					r.getStringNE("itm_sub1"),
					r.getStringNE("itm_sub2"),
					r.getStringNE("itm_sub3")
				))
				.addSelect(m -> toArray(
					m.exim_xpns_typ
				))
				.addMap((r, m) -> {
					r.setStringNE("exim_xpns_typ", m.exim_xpns_typ());
				})
		);
	}
	static MCJoinerList<MCRow> MSBEL2210_IoR_J01() {
		return joinInfo(
			j -> j
				.add(MST_ARR_ACT_R.class, r -> toCondition(
					r.getStringNE("arr_act_no")
				))
				.addSelect(t -> toArray(
					t.lot_no,
					t.sublot_no,
					t.quality_typ,
					t.stk_insp_typ,
					t.stk_id_typ,
					t.stk_bp_cd,
					t.trd_unit_cd,
					t.arr_loc_cd,
					t.str_ln_cd,
					t.gd_cd
				))
				.addMap((r, t) -> {
					r.setStringNE("lot_no", t.lot_no());
					r.setStringNE("sublot_no", t.sublot_no());
					r.setStringNE("trd_unit_cd", t.trd_unit_cd());
					r.setStringNE("dlv_loc_cd", t.arr_loc_cd());
					r.setStringNE("str_ln_cd", t.str_ln_cd());
					r.setStringNE("gd_cd", t.gd_cd());
					// 暫定買掛分は自社在庫なので入荷予定と同じ
					r.setStringNE("quality_typ", r.getStringNE("arr_schd_quality_typ"));
					r.setStringNE("stk_insp_typ", r.getStringNE("arr_schd_stk_insp_typ"));
					r.setStringNE("stk_id_typ", r.getStringNE("arr_schd_stk_id_typ"));
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
				.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
					r.getStringNE("itm_cd"),
					r.getStringNE("itm_sub1"),
					r.getStringNE("itm_sub2"),
					r.getStringNE("itm_sub3"),
					r.getStringNE("trd_unit_cd")
				))
				.addSelect(m -> toArray(
					m.conv_base_qty,
					m.conv_qty,
					m.dec_place,
					m.rnd_typ
				))
				.addMap((r, m) -> {
					r.setNumberNE("trd_unit_dec_place", m.dec_place());
					r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
					r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
					r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
			}),
			j -> j
				.add(MAM_LOC_R.class, r -> toCondition(
					r.getStringNE("dlv_loc_cd")
				))
				.addSelect(m -> toArray(
					m.loc_nm,
					m.wg_cd,
					m.sppl_cd,
					m.site_cd,
					m.wg_cd,
					m.str_ln_tgt_flg
				))
				.addMap((r, m) -> {
					r.setStringNE("dlv_loc_nm", m.loc_nm());
					r.setStringNE("dlv_loc_wg_cd", m.wg_cd());
					r.setStringNE("dlv_loc_sppl_cd", m.sppl_cd());
					r.setStringNE("site_cd", m.site_cd());
					r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
			}),
			j -> j
				.add(MAM_WG_R.class, r -> toCondition(
					r.getStringNE("dlv_loc_wg_cd")
				))
				.addSelect(m -> toArray(
					m.wg_nm
				))
				.addMap((r, m) -> {
					r.setStringNE("dlv_loc_wg_nm", m.wg_nm());
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
			})
		);
	}
}