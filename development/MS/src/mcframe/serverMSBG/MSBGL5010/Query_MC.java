package mcframe.serverMSBG.MSBGL5010;

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
	 * -- MSBGL5010_MST_BILL_D_Query_S03
	 */
	static MCQueryPlan MSBGL5010_MST_BILL_D_S03() {
		MST_BILL_D_R billD1 = MST_BILL_D_R.create("billD1");
		MSW_BILL_KEY_R billWk1 = MSW_BILL_KEY_R.create("billWk1");
		MST_RCV_ACT_D_R rcvActD1 = MST_RCV_ACT_D_R.create("rcvActD1");
		MST_RCV_ACT_R rcvAct1 = MST_RCV_ACT_R.create("rcvAct1");
		MST_RCV_ACT_D_R rcvActD2 = MST_RCV_ACT_D_R.create("rcvActD2");
		MST_RCV_ACT_R rcvAct2 = MST_RCV_ACT_R.create("rcvAct2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5010_MST_BILL_D_Query_S03")
					.mainQuery()
					.select(
						billD1.bill_d_no,
						billD1.bill_mng_no,
						billD1.bill_d_typ,
						billD1.trd_cd,
						billD1.slip_sts_typ,
						billD1.act_no,
						billD1.act_seq,
						billD1.act_rev,
						billD1.act_d_no,
						billD1.act_d_seq,
						billD1.trd_ptn_typ,
						billD1.rcv_mtd_cd,
						billD1.cst_cd,
						billD1.dlv_cd,
						billD1.dlv_dt,
						billD1.base_sls_ac_dt,
						billD1.rcv_dt,
						billD1.itm_cd,
						billD1.itm_sub1,
						billD1.itm_sub2,
						billD1.itm_sub3,
						billD1.itm_nm,
						billD1.sundry_itm_flg,
						billD1.cst_itm_cd,
						billD1.cst_itm_nm,
						billD1.trd_unit_cd,
						billD1.trd_unit_qty,
						billD1.trd_cur_upri,
						billD1.trd_cur_amt,
						billD1.trd_cur_dscnt_amt,
						billD1.interim_flg,
						billD1.base_cur_upri,
						billD1.base_cur_amt,
						billD1.base_cur_dscnt_amt,
						billD1.tax_cd,
						billD1.trd_cur_tax_amt,
						billD1.base_cur_tax_amt,
						billD1.trd_d_rmrks,
						billD1.bill_d_rmrks,
						billD1.dlv_slip_no,
						billD1.dlv_slip_d_no,
						billD1.ship_dlv_slip_no,
						billD1.ship_dlv_slip_d_no,
						billD1.ship_dlv_slip_multi_flg,
						billD1.bill_mtd_typ,
						billD1.sub_char1,
						billD1.sub_char2,
						billD1.sub_char3,
						nvl(rcvActD1.trd_cur_amt1, value(0)).as("trd_cur_amt1"),
						nvl(rcvActD1.trd_cur_amt2, value(0)).as("trd_cur_amt2"),
						nvl(rcvActD1.trd_cur_tax_amt1, value(0)).as("trd_cur_tax_amt1"),
						nvl(rcvActD1.trd_cur_tax_amt2, value(0)).as("trd_cur_tax_amt2"),
						nvl(rcvActD1.base_cur_amt1, value(0)).as("base_cur_amt1"),
						nvl(rcvActD1.base_cur_amt2, value(0)).as("base_cur_amt2"),
						nvl(rcvActD1.base_cur_tax_amt1, value(0)).as("base_cur_tax_amt1"),
						nvl(rcvActD1.base_cur_tax_amt2, value(0)).as("base_cur_tax_amt2"),
						rcvAct1.ar_sttl_cd1,
						rcvAct1.ar_sttl_cd2,
						rcvAct1.ar_sttl_typ1,
						rcvAct1.ar_sttl_typ2,
						rcvAct1.tax_cd1,
						rcvAct1.tax_cd2
					)
					.from(
						billD1
						.innerJoin(billWk1).on(
							billWk1.bill_mng_no.eq(billD1.bill_mng_no)
						)
						.leftOuterJoin(rcvActD1).on(
							bracket(
								rcvActD1.rcv_act_d_no.eq(billD1.act_d_no)
								.and(rcvActD1.rcv_act_d_seq.eq(billD1.act_d_seq))
								.and(billD1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
						.leftOuterJoin(rcvAct1).on(
							bracket(
								rcvAct1.rcv_act_no.eq(billD1.act_no)
								.and(rcvAct1.rcv_act_seq.eq(billD1.act_seq))
								.and(billD1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
					)
					.unionAll(
						subQuery()
						.select(
							nullValue().as("bill_d_no"),
							rcvActD2.bill_mng_no,
							value(MSC_BILL_D_TYP.RCV.value()).as("bill_d_typ"),
							rcvAct2.trd_cd,
							rcvAct2.slip_sts_typ,
							rcvAct2.rcv_act_no,
							rcvAct2.rcv_act_seq,
							rcvAct2.rcv_act_rev,
							rcvActD2.rcv_act_d_no,
							rcvActD2.rcv_act_d_seq,
							rcvAct2.trd_ptn_typ,
							rcvAct2.ar_sttl_cd1.as("rcv_mtd_cd"),
							nullValue().as("cst_cd"),
							nullValue().as("dlv_cd"),
							nullValue().as("dlv_dt"),
							nullValue().as("base_sls_ac_dt"),
							rcvAct2.rcv_dt,
							nullValue().as("itm_cd"),
							nullValue().as("itm_sub1"),
							nullValue().as("itm_sub2"),
							nullValue().as("itm_sub3"),
							nullValue().as("itm_nm"),
							value(false).as("sundry_itm_flg"),
							nullValue().as("cst_itm_cd"),
							nullValue().as("cst_itm_nm"),
							nullValue().as("trd_unit_cd"),
							value(0).as("trd_unit_qty"),
							value(0).as("trd_cur_upri"),
							value(0).as("trd_cur_amt"),
							value(0).as("trd_cur_dscnt_amt"),
							value(false).as("interim_flg"),
							value(0).as("base_cur_upri"),
							value(0).as("base_cur_amt"),
							value(0).as("base_cur_dscnt_amt"),
							nullValue().as("tax_cd"),
							value(0).as("trd_cur_tax_amt"),
							value(0).as("base_cur_tax_amt"),
							nullValue().as("trd_d_rmrks"),
							rcvActD2.bill_d_rmrks,
							nullValue().as("dlv_slip_no"),
							nullValue().as("dlv_slip_d_no"),
							nullValue().as("ship_dlv_slip_no"),
							nullValue().as("ship_dlv_slip_d_no"),
							value(false).as("ship_dlv_slip_multi_flg"),
							nullValue().as("bill_mtd_typ"),
							rcvAct2.sub_char1,
							rcvAct2.sub_char2,
							rcvAct2.sub_char3,
							rcvActD2.trd_cur_amt1,
							rcvActD2.trd_cur_amt2,
							rcvActD2.trd_cur_tax_amt1,
							rcvActD2.trd_cur_tax_amt2,
							rcvActD2.base_cur_amt1,
							rcvActD2.base_cur_amt2,
							rcvActD2.base_cur_tax_amt1,
							rcvActD2.base_cur_tax_amt2,
							rcvAct2.ar_sttl_cd1,
							rcvAct2.ar_sttl_cd2,
							rcvAct2.ar_sttl_typ1,
							rcvAct2.ar_sttl_typ2,
							rcvAct2.tax_cd1,
							rcvAct2.tax_cd2
						)
						.from(
							rcvActD2
							.innerJoin(billWk1).on(
								billWk1.bill_mng_no.eq(rcvActD2.bill_mng_no)
							)
							.innerJoin(rcvAct2).on(
								bracket(
									rcvAct2.rcv_act_no.eq(rcvActD2.rcv_act_no)
									.and(rcvAct2.rcv_act_seq.eq(rcvActD2.rcv_act_seq))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(rcvAct2.trd_ptn_typ.in(
								value(MAC_TRD_PTN_TYP.RCV_ADV.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()), 
								value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
							))
						)
					)
			);
	}
	
}
