package mcframe.serverMSLA.MSLAL5060;

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
	 * -- MSLAL5060_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSLAL5060_MST_PURC_ACT_S01() {
		MSW_PURC_ACT_KEY_R S0_W1 = MSW_PURC_ACT_KEY_R.create("W1");
		MST_PURC_ACT_R S0_T1 = MST_PURC_ACT_R.create("T1");
		MST_PURC_ACT_D_R S0_T2 = MST_PURC_ACT_D_R.create("T2");
		MST_PURC_ACT_IO_R S0_T3 = MST_PURC_ACT_IO_R.create("T3");
		MST_ARR_ACT_R S0_T4 = MST_ARR_ACT_R.create("T4");
		MST_PO_D_R S0_T6 = MST_PO_D_R.create("T6");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_BP_LCL_R S0_M1L = MAM_BP_LCL_R.create("M1L");
		MAM_EDI_IF_CTL_R S0_X1 = MAM_EDI_IF_CTL_R.create("X1");
		MAM_EXT_SYS_R S0_X2 = MAM_EXT_SYS_R.create("X2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL5060_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.po_no,
						S0_T2.po_d_no,
						decode(
							S0_T1.rcpt_iv_no,
							nullValue(),
							coalesce(
								S0_T2.bp_dlv_slip_no,
								S0_T3.bp_dlv_slip_no,
								S0_T4.bp_dlv_slip_no
							),
							S0_T1.rcpt_iv_no
						).as("bp_dlv_slip_no"),
						decode(
							S0_T1.rcpt_iv_no,
							nullValue(),
							coalesce(
								S0_T2.bp_dlv_slip_d_no,
								S0_T3.bp_dlv_slip_d_no,
								S0_T4.bp_dlv_slip_d_no
							),
							nullValue()
						).as("bp_dlv_slip_lno"),
						S0_T1.purc_dpt_cd,
						S0_T1.purc_usr_cd,
						S0_T1.sppl_cd,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.purc_dt,
						S0_T1.purc_dt.as("base_dt"),
						S0_T1.pay_schd_dt,
						S0_T1.trd_cur_cd,
						S0_T1.tterm_cd1,
						S0_T1.tterm_rmrks1,
						S0_T1.tterm_cd2,
						S0_T1.tterm_rmrks2,
						S0_T1.tterm_cd3,
						S0_T1.tterm_rmrks3,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.sundry_itm_flg,
						S0_T2.itm_nm,
						S0_T2.iv_itm_nm,
						S0_T2.sppl_itm_cd,
						S0_T2.sppl_itm_nm,
						coalesce(
							S0_T2.bp_lot_no,
							S0_T3.bp_lot_no,
							S0_T4.bp_lot_no
						).as("bp_lot_no"),
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.trd_cur_upri,
						S0_T2.trd_cur_amt,
						S0_T2.trd_cur_dscnt_amt,
						S0_T2.dscnt_rsn_cd,
						S0_T2.interim_flg,
						S0_T2.tax_cd,
						S0_T2.trd_cur_tax_amt,
						S0_T2.wtax_rate,
						S0_T2.wtax_amt,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T2.accpt_dfct_flg,
						S0_T1.purc_act_no,
						S0_T1.purc_act_seq,
						S0_T1.purc_act_rev,
						S0_T2.purc_act_d_no,
						S0_T2.purc_act_d_seq,
						S0_T3.purc_act_io_no,
						S0_T3.purc_act_io_seq,
						coalesce(
							S0_T6.in_to_loc_cd,
							S0_T2.in_to_loc_cd,
							S0_T3.in_to_loc_cd,
							S0_T4.arr_loc_cd
						).as("in_to_loc_cd"),
						S0_T6.dlv_cd,
						S0_T6.dlv_nm,
						S0_T6.dlv_zip_cd,
						S0_T6.dlv_addr1,
						S0_T6.dlv_addr2,
						S0_T6.dlv_addr3,
						S0_T6.dlv_addr4,
						S0_T6.dlv_cntct_dpt,
						S0_T6.dlv_cntct_psn,
						S0_T6.dlv_tel,
						S0_T6.dlv_fax,
						bracket(
							cases()
								.when(S0_T6.dlv_cd.isNull())
									.then(value(false))
								.otherwise(S0_T6.dlv_sundry_flg)
						).as("in_to_sundry_flg"),
						S0_T6.tdlv_cd,
						S0_T6.tdlv_nm,
						S0_T6.tdlv_zip_cd,
						S0_T6.tdlv_addr1,
						S0_T6.tdlv_addr2,
						S0_T6.tdlv_addr3,
						S0_T6.tdlv_addr4,
						S0_T6.tdlv_cntct_dpt,
						S0_T6.tdlv_cntct_psn,
						S0_T6.tdlv_tel,
						S0_T6.tdlv_fax,
						S0_T6.tdlv_sundry_flg,
						S0_M1.sppl_iv_flg.as("iv_flg"),
						S0_M1.prnt_lcl_cd,
						nvl(
							S0_M1L.bp_nm,
							S0_M1.bp_nm
						).as("sppl_nm"),
						nvl(
							FCPA_CO$F_GET_CO_NM1(S0_M1.prnt_lcl_cd),
							FCPA_CO$F_GET_CO_NM1(FCPA_CONTEXT$F_GET_DEF_LOCALE_CD())
						).as("co_nm"),
						S0_M1.cntry_cd.as("sppl_cntry_cd"),
						S0_X1.ext_sys_cd,
						S0_X2.null_val_if_flg,
						// this field is appended by sql coverter.
						S0_T2.purc_schd_no.as("join_purc_schd_no_")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.purc_act_no.eq(S0_T1.purc_act_no)
								.and(S0_W1.purc_act_seq.eq(S0_T1.purc_act_seq))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.purc_act_no.eq(S0_T2.purc_act_no)
								.and(S0_T1.purc_act_seq.eq(S0_T2.purc_act_seq))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T2.purc_act_d_no.eq(S0_T3.purc_act_d_no)
								.and(S0_T2.purc_act_d_seq.eq(S0_T3.purc_act_d_seq))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.purc_act_io_no.eq(S0_T4.purc_act_io_no)
								.and(S0_T4.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.po_d_no.eq(S0_T6.po_d_no)
								.and(S0_T6.can_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.sppl_cd.eq(S0_M1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M1L).on(
							bracket(
								S0_M1.bp_cd.eq(S0_M1L.bp_cd)
								.and(S0_M1L.lcl_cd.eq(S0_M1.prnt_lcl_cd))
							)
						)
						.innerJoin(S0_X1).on(
							bracket(
								S0_X1.bp_cd.eq(S0_T1.sppl_cd)
								.and(S0_X1.if_proc_typ.eq(value(MAC_IF_PROC_TYP.ACCPT_SEND.value())))
								.and(S0_T1.purc_dt.between(S0_X1.st_dt, S0_X1.end_dt))
								.and(S0_X1.del_flg.eq(value(false)))
							)
						)
						.innerJoin(S0_X2).on(
							bracket(
								S0_X1.ext_sys_cd.eq(S0_X2.ext_sys_cd)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_PURC_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_purc_schd_no_")
						))
						.addSelect(m -> toArray(
							m.abort_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("abort_flg", m.abort_flg());
					})
				)
			);
	}
}