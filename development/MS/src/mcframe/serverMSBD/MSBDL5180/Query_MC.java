package mcframe.serverMSBD.MSBDL5180;

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
	 * -- MSBDL5180_MST_PURC_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBDL5180_MST_PURC_ACT_D_S01() {
		MST_PURC_ACT_D_R S0_T1 = MST_PURC_ACT_D_R.create("T1");
		MSW_PURC_ACT_D_KEY_R S0_T2 = MSW_PURC_ACT_D_KEY_R.create("T2");
		MST_PURC_SCHD_R S0_T3 = MST_PURC_SCHD_R.create("T3");
		MST_ARR_SCHD_R S0_T4 = MST_ARR_SCHD_R.create("T4");
		MST_ARR_PR_R S0_T5 = MST_ARR_PR_R.create("T5");
		MST_PO_D_R S0_T6 = MST_PO_D_R.create("T6");
		MST_PO_R S0_T7 = MST_PO_R.create("T7");
		MST_PO_SCHD_R S0_T8 = MST_PO_SCHD_R.create("T8");
		MST_RCPT_IV_D_R S0_T9 = MST_RCPT_IV_D_R.create("T9");
		MST_PRMS_RCPT_D_R S0_T10 = MST_PRMS_RCPT_D_R.create("T10");
		MST_DLV_INST_D_R S0_T11 = MST_DLV_INST_D_R.create("T11");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBDL5180_MST_PURC_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.purc_act_d_no,
						S0_T3.purc_schd_no,
						S0_T8.po_schd_no,
						S0_T8.slo_d_no,
						S0_T11.dlv_cd,
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_nm,
							nullValue()
						).as("dlv_nm"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_sundry_flg,
							value(false)
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_lg_grp_cd,
							nullValue()
						).as("dlv_lg_grp_cd"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_cntct_dpt,
							nullValue()
						).as("dlv_cntct_dpt"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_cntct_psn,
							nullValue()
						).as("dlv_cntct_psn"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_zip_cd,
							nullValue()
						).as("dlv_zip_cd"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_addr1,
							nullValue()
						).as("dlv_addr1"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_addr2,
							nullValue()
						).as("dlv_addr2"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_addr3,
							nullValue()
						).as("dlv_addr3"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_addr4,
							nullValue()
						).as("dlv_addr4"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_tel,
							nullValue()
						).as("dlv_tel"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.dlv_fax,
							nullValue()
						).as("dlv_fax"),
						nvl2(
							S0_T11.dlv_cd,
							S0_T11.pri_prnt_flg,
							value(false)
						).as("pri_prnt_flg"),
						S0_T11.tdlv_cd,
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_nm,
							nullValue()
						).as("tdlv_nm"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_sundry_flg,
							value(false)
						).as("tdlv_sundry_flg"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_lg_grp_cd,
							nullValue()
						).as("tdlv_lg_grp_cd"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_cntct_dpt,
							nullValue()
						).as("tdlv_cntct_dpt"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_cntct_psn,
							nullValue()
						).as("tdlv_cntct_psn"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_zip_cd,
							nullValue()
						).as("tdlv_zip_cd"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_addr1,
							nullValue()
						).as("tdlv_addr1"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_addr2,
							nullValue()
						).as("tdlv_addr2"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_addr3,
							nullValue()
						).as("tdlv_addr3"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_addr4,
							nullValue()
						).as("tdlv_addr4"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_tel,
							nullValue()
						).as("tdlv_tel"),
						nvl2(
							S0_T11.tdlv_cd,
							S0_T11.tdlv_fax,
							nullValue()
						).as("tdlv_fax")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							S0_T1.purc_act_d_no.eq(S0_T2.purc_act_d_no)
							.and(S0_T1.purc_act_d_seq.eq(S0_T2.purc_act_d_seq))
						)
						.innerJoin(S0_T3).on(S0_T1.purc_schd_no.eq(S0_T3.purc_schd_no))
						.innerJoin(S0_T4).on(S0_T3.arr_schd_no.eq(S0_T4.arr_schd_no))
						.innerJoin(S0_T5).on(S0_T4.arr_pr_no.eq(S0_T5.arr_pr_no))
						.innerJoin(S0_T6).on(S0_T5.po_d_no.eq(S0_T6.po_d_no))
						.innerJoin(S0_T7).on(S0_T6.po_no.eq(S0_T7.po_no))
						.innerJoin(S0_T8).on(S0_T6.po_schd_no.eq(S0_T8.po_schd_no))
						.leftOuterJoin(S0_T9).on(S0_T3.purc_schd_no.eq(S0_T9.purc_schd_no))
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T10.prms_rcpt_d_no.eq(nvl(
										S0_T4.prms_rcpt_d_no,
										S0_T9.ref_prms_rcpt_d_no
									)
								)
							)
						)
						.leftOuterJoin(S0_T11).on(
							bracket(
								S0_T11.dlv_inst_d_no.eq(coalesce(
										S0_T4.dlv_inst_d_no,
										S0_T10.dlv_inst_d_no,
										S0_T9.ref_dlv_inst_d_no
									)
								)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T5.purc_ddlv_flg.eq(value(true)))
						.and(S0_T6.rqst_can_flg.eq(value(false)))
						.and(S0_T6.dlv_cd.isNotNull())
					)
			);
	}
}