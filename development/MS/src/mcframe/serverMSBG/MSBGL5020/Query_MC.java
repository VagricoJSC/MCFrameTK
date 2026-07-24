package mcframe.serverMSBG.MSBGL5020;

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
	 * -- MSBGL5020_MST_BILL_D_APPL_ACT_Query_S01
	 */
	static MCQueryPlan MSBGL5020_MST_BILL_D_APPL_ACT_S01() {
		MST_BILL_D_APPL_ACT_R S0_TA1 = MST_BILL_D_APPL_ACT_R.create("TA1");
		MST_BILL_D_R S0_TA2 = MST_BILL_D_R.create("TA2");
		MST_RCV_ACT_D_R S0_TA3 = MST_RCV_ACT_D_R.create("TA3");
		MST_RCV_ACT_R S0_TA4 = MST_RCV_ACT_R.create("TA4");
		MST_BILL_D_APPL_BAL_R S0_TA5 = MST_BILL_D_APPL_BAL_R.create("TA5");
		MST_BILL_D_R S0_TA6 = MST_BILL_D_R.create("TA6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5020_MST_BILL_D_APPL_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_TA1.rcv_act_d_no,
						S0_TA3.rcv_act_d_seq,
						S0_TA1.bill_d_no,
						S0_TA1.parent_bill_d_no,
						S0_TA1.appl_dt,
						S0_TA1.appl_amt,
						S0_TA2.bill_mng_no.as("appl_bill_mng_no"),
						S0_TA2.ac_ym.as("appl_ac_ym"),
						S0_TA6.ac_ym.as("appl_parent_ac_ym"),
						S0_TA3.acst_cd,
						S0_TA3.iv_no,
						S0_TA3.wrk_no,
						S0_TA3.ar_dpt_cd,
						S0_TA3.ar_typ,
						S0_TA4.trd_cur_cd,
						S0_TA4.ac_ym,
						S0_TA4.rcv_act_no,
						S0_TA4.rcv_act_seq,
						S0_TA1.upd_ts
					)
					.from(
						S0_TA1
						.innerJoin(S0_TA2).on(S0_TA1.bill_d_no.eq(S0_TA2.bill_d_no))
						.innerJoin(S0_TA3).on(S0_TA1.rcv_act_d_no.eq(S0_TA3.rcv_act_d_no))
						.innerJoin(S0_TA4).on(
							S0_TA3.rcv_act_no.eq(S0_TA4.rcv_act_no)
							.and(S0_TA3.rcv_act_seq.eq(S0_TA4.rcv_act_seq))
						)
						.innerJoin(S0_TA5).on(
							S0_TA1.bill_d_no.eq(S0_TA5.bill_d_no)
							.and(S0_TA1.parent_bill_d_no.eq(S0_TA5.parent_bill_d_no))
						)
						.innerJoin(S0_TA6).on(S0_TA5.parent_bill_d_no.eq(S0_TA6.bill_d_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA4.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_TA4.rcv_act_seq.eq(bind("old_rcv_act_seq")))
					)
					.forUpdate()
			);
	}
	
	/**
	 * -- MSBGL5020_MST_BILL_D_APPL_BAL_Query_S01
	 */
	static MCQueryPlan MSBGL5020_MST_BILL_D_APPL_BAL_S01() {
		MST_BILL_D_APPL_BAL_R S0_T1 = MST_BILL_D_APPL_BAL_R.create("T1");
		MST_BILL_D_R S0_T2 = MST_BILL_D_R.create("T2");
		MST_BILL_R S0_T3 = MST_BILL_R.create("T3");
		MST_BILL_ACST_R S0_T4 = MST_BILL_ACST_R.create("T4");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5020_MST_BILL_D_APPL_BAL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.bill_d_no,
						S0_T1.parent_bill_d_no,
						S0_T2.iv_no,
						S0_T3.iv_no.as("bill_iv_no"),
						S0_T3.wrk_no,
						S0_T3.bill_dpt_cd,
						S0_T3.bcst_cd,
						S0_T4.ar_dpt_cd,
						S0_T4.wg_cd,
						S0_T4.acst_cd,
						S0_T3.bill_cl_sts_typ,
						S0_T3.bill_mng_no,
						S0_T2.ac_dt,
						S0_T2.ac_ym,
						bind("trd_cur_cd").as("trd_cur_cd"),
						S0_T2.ar_typ,
						cases()
							.when(S0_T2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
								.then(S0_T2.xrate)
							.otherwise(nullValue()).as("crt_bill_d_xrate"),
						S0_T2.xrate,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.value())))
								.then(S0_T2.bill_d_no)
							.otherwise(nullValue()).as("sw_src_bill_d_no"),
						S0_T2.trd_ptn_typ
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_d_no.eq(S0_T2.bill_d_no))
						.innerJoin(S0_T3).on(S0_T2.bill_mng_no.eq(S0_T3.bill_mng_no))
						.innerJoin(S0_T4).on(S0_T2.bill_acst_no.eq(S0_T4.bill_acst_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bill_d_no.eq(bind("bill_d_no")))
						.and(S0_T1.parent_bill_d_no.eq(bind("parent_bill_d_no")))
					)
			);
	}
	
	/**
	 * -- MSBGL5020_MST_BILL_D_Query_S01
	 */
	static MCQueryPlan MSBGL5020_MST_BILL_D_S01() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_RCV_ACT_D_R S0_T3 = MST_RCV_ACT_D_R.create("T3");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5020_MST_BILL_D_Query_S01")
					.mainQuery()
					.select(
						bind("rcv_act_d_no").as("act_d_no"),
						bind("can_rcv_act_d_seq").as("act_d_seq"),
						bind("old_rcv_act_d_seq").as("old_act_d_seq"),
						bind("rcv_act_no").as("act_no"),
						bind("can_rcv_act_seq").as("act_seq"),
						bind("can_rcv_act_rev").as("act_rev"),
						S0_T1.bill_d_typ,
						bind("can_trd_cd").as("trd_cd"),
						S0_T1.ar_trd_grp_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.rcv_mtd_cd,
						S0_T1.rcv_typ,
						bind("can_ac_dt").as("ac_dt"),
						bind("can_ac_ym").as("ac_ym"),
						S0_T1.rcv_dt,
						S0_T1.bill_basis_dt,
						S0_T1.bill_crryovr_times,
						S0_T1.trd_unit_qty,
						value(0).subtract(S0_T1.trd_cur_upri).as("trd_cur_upri"),
						value(0).subtract(S0_T1.trd_cur_amt).as("trd_cur_amt"),
						value(0).subtract(S0_T1.trd_cur_amt1).as("trd_cur_amt1"),
						value(0).subtract(S0_T1.trd_cur_amt2).as("trd_cur_amt2"),
						value(0).subtract(S0_T1.trd_cur_amt3).as("trd_cur_amt3"),
						S0_T1.xrate,
						S0_T1.base_unit_qty,
						value(0).subtract(S0_T1.base_cur_upri).as("base_cur_upri"),
						value(0).subtract(S0_T1.base_cur_amt).as("base_cur_amt"),
						value(0).subtract(S0_T1.base_cur_amt1).as("base_cur_amt1"),
						value(0).subtract(S0_T1.base_cur_amt2).as("base_cur_amt2"),
						value(0).subtract(S0_T1.base_cur_amt3).as("base_cur_amt3"),
						value(0).subtract(S0_T1.trd_cur_tax_amt).as("trd_cur_tax_amt"),
						value(0).subtract(S0_T1.base_cur_tax_amt).as("base_cur_tax_amt"),
						value(0).subtract(S0_T1.wtax_amt).as("wtax_amt"),
						S0_T1.trd_d_rmrks,
						S0_T1.par_act_no,
						S0_T1.par_act_seq,
						S0_T1.ref_iv_no,
						S0_T1.wrk_no,
						S0_T1.ar_typ,
						S0_T2.trd_cur_cd,
						S0_T1.iv_no,
						S0_T2.iv_no.as("bill_iv_no"),
						S0_T2.bcst_cd,
						S0_T2.bill_dpt_cd,
						S0_T3.acst_cd,
						S0_T3.ar_dpt_cd
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.innerJoin(S0_T3).on(
							S0_T3.rcv_act_d_no.eq(S0_T1.act_d_no)
							.and(S0_T3.rcv_act_d_seq.eq(S0_T1.act_d_seq))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.act_no.eq(bind("rcv_act_no")))
						.and(S0_T1.act_seq.eq(bind("old_rcv_act_seq")))
						.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
						.and(S0_T3.rcv_act_d_no.eq(bind("rcv_act_d_no")))
						.and(S0_T3.rcv_act_d_seq.eq(bind("old_rcv_act_d_seq")))
					)
			);
	}
	
	/**
	 * -- MSBGL5020_MST_BILL_D_Query_S02
	 */
	static MCQueryPlan MSBGL5020_MST_BILL_D_S02() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_BILL_R S0_T2 = MST_BILL_R.create("T2");
		MST_BILL_ACST_R S0_T3 = MST_BILL_ACST_R.create("T3");
		MST_BILL_D_APPL_BAL_R S1_TB1 = MST_BILL_D_APPL_BAL_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5020_MST_BILL_D_Query_S02")
					.mainQuery()
					.select(
						S0_T1.bill_d_no,
						S0_T1.bill_mng_no,
						S0_T1.bill_acst_no,
						S0_T1.act_no,
						S0_T1.act_seq,
						S0_T1.act_rev,
						S0_T1.act_d_no,
						S0_T1.act_d_seq,
						S0_T1.bill_d_typ,
						S0_T1.trd_cd,
						S0_T1.ar_trd_grp_typ,
						S0_T1.trd_ptn_typ,
						S0_T1.rcv_mtd_cd,
						S0_T1.rcv_typ,
						S0_T1.sls_dpt_cd,
						S0_T1.sls_usr_cd,
						S0_T1.cst_cd,
						S0_T1.dlv_cd,
						S0_T1.dlv_nm,
						S0_T1.dlv_sundry_flg,
						S0_T1.dest_cd1,
						S0_T1.dest_cd2,
						S0_T1.dest_cd3,
						S0_T1.ac_dt,
						S0_T1.ac_ym,
						S0_T1.dlv_dt,
						S0_T1.rcv_dt,
						S0_T1.bill_basis_dt,
						S0_T1.bill_crryovr_times,
						S0_T1.cst_po_no,
						S0_T1.cst_po_d_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.itm_nm,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.sundry_itm_flg,
						S0_T1.cst_itm_cd,
						S0_T1.cst_itm_nm,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_cur_upri,
						S0_T1.interim_flg,
						S0_T1.trd_cur_amt,
						S0_T1.trd_cur_amt1,
						S0_T1.trd_cur_amt2,
						S0_T1.trd_cur_amt3,
						S0_T1.trd_cur_dscnt_amt,
						S0_T1.xrate,
						S0_T1.base_cur_upri,
						S0_T1.base_cur_amt,
						S0_T1.base_cur_amt1,
						S0_T1.base_cur_amt2,
						S0_T1.base_cur_amt3,
						S0_T1.tax_cd,
						S0_T1.trd_cur_tax_amt,
						S0_T1.base_cur_tax_amt,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.trd_d_rmrks,
						S0_T1.dlv_slip_no,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.par_act_no,
						S0_T1.par_act_seq,
						S0_T1.ref_iv_no,
						S0_T1.slip_sts_typ,
						S0_T1.ar_typ,
						S0_T1.iv_no,
						S0_T2.bill_cl_dt,
						S0_T2.bcst_cd,
						S0_T2.bill_dpt_cd,
						S0_T2.trd_cur_cd,
						S0_T2.wrk_no,
						S0_T3.ar_dpt_cd,
						S0_T3.acst_cd,
						value(false).as("ex_im_flg"),
						bracket(
							subQuery()
							.select(
								nvl(
									sum(S1_TB1.appl_amt),
									value(0)
								)
							)
							.from(S1_TB1)
							.where(
								S0_T1.bill_d_no.eq(S1_TB1.parent_bill_d_no)
							)
						).as("appl_amt")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.bill_mng_no.eq(S0_T2.bill_mng_no))
						.innerJoin(S0_T3).on(S0_T1.bill_acst_no.eq(S0_T3.bill_acst_no))
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bill_d_no.eq(bind("bill_d_no")))
					)
			);
	}
	/**
	 * -- MSBGL5020_MST_BILL_D_Query_S03
	 */
	static MCQueryPlan MSBGL5020_MST_BILL_D_S03() {
		MST_BILL_D_R S0_T1 = MST_BILL_D_R.create("T1");
		MST_RCV_ACT_D_R S0_T2= MST_RCV_ACT_D_R.create("T6");
		MST_RCV_ACT_R S0_T3= MST_RCV_ACT_R.create("T7");
		MST_RCV_ACT_D_R S2_T1 = MST_RCV_ACT_D_R.create("T1");
		MST_RCV_ACT_R S2_T2 = MST_RCV_ACT_R.create("T2");
		MCTempView S3_W1 = createTempView("W1");
		MST_BILL_ACST_R S3_T1 = MST_BILL_ACST_R.create("T3");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5020_MST_BILL_D_Query_S03")
					.mainQuery()
					.select(
						S3_W1.prAll(),
						S3_T1.acst_cd,
						S3_T1.ar_dpt_cd,
						S3_T1.ar_typ
					)
					.from(
						subQuery()
						.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.tax_cd,
						S0_T3.tax_cd1,
						S0_T3.tax_cd2,
						S0_T3.ar_sttl_typ1,
						S0_T3.ar_sttl_typ2,
						S0_T1.trd_cur_amt,
						nvl(S0_T2.trd_cur_amt1, value(0)).as("trd_cur_amt1"),
						nvl(S0_T2.trd_cur_amt2, value(0)).as("trd_cur_amt2"),
						S0_T1.trd_cur_tax_amt,
						nvl(S0_T2.trd_cur_tax_amt1, value(0)).as("trd_cur_tax_amt1"),
						nvl(S0_T2.trd_cur_tax_amt2, value(0)).as("trd_cur_tax_amt2"),
						S0_T1.base_cur_tax_amt,
						nvl(S0_T2.base_cur_tax_amt1, value(0)).as("base_cur_tax_amt1"),
						nvl(S0_T2.base_cur_tax_amt2, value(0)).as("base_cur_tax_amt2"),
						S0_T1.trd_ptn_typ,
						S0_T1.bill_acst_no,
						S0_T1.xrate
						,S0_T3.ar_sttl_cd1
						,S0_T3.ar_sttl_cd2
						,S0_T1.bill_d_typ
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.rcv_act_d_no.eq(S0_T1.act_d_no)
								.and(S0_T2.rcv_act_d_seq.eq(S0_T1.act_d_seq))
								.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T3.rcv_act_no.eq(S0_T1.act_no)
								.and(S0_T3.rcv_act_seq.eq(S0_T1.act_seq))
								.and(S0_T1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.bill_mng_no.eq(bind("bill_mng_no")))
						.and(S0_T1.valid_flg.eq(value(true)))
						// 前受金に対する売掛先別情報を設定する際に必要になるため、条件に含めない
						// 税CDがすべてnullの請求明細は後続処理で計算対象から除外される
						//.and(
						//	bracket(
						//		S0_T1.tax_cd.isNotNull().or(S0_T3.tax_cd1.isNotNull()).or(S0_T3.tax_cd2.isNotNull())
						//	)
						//)
					)
					.unionAll(
						subQuery()
						.select(
							nullValue().as("itm_cd"),
							nullValue().as("itm_sub1"),
							nullValue().as("itm_sub2"),
							nullValue().as("itm_sub3"),
							nullValue().as("tax_cd"),
							S2_T2.tax_cd1,
							S2_T2.tax_cd2,
							S2_T2.ar_sttl_typ1,
							S2_T2.ar_sttl_typ2,
							value(0).as("trd_cur_amt"),
							S2_T1.trd_cur_amt1,
							S2_T1.trd_cur_amt2,
							value(0).as("trd_cur_tax_amt"),
							S2_T1.trd_cur_tax_amt1,
							S2_T1.trd_cur_tax_amt2,
							value(0).as("base_cur_tax_amt"),
							S2_T1.base_cur_tax_amt1,
							S2_T1.base_cur_tax_amt2,
							S2_T2.trd_ptn_typ,
							nullValue().as("bill_acst_no"),
							S2_T2.xrate
							,S2_T2.ar_sttl_cd1
							,S2_T2.ar_sttl_cd2
							,nullValue().as("bill_d_typ")
						)
						.from(
							S2_T1
							.innerJoin(S2_T2).on(
								bracket(
									S2_T2.rcv_act_no.eq(S2_T1.rcv_act_no)
									.and(S2_T2.rcv_act_seq.eq(S2_T1.rcv_act_seq))
								)
							)
						)
						.where(
							value(0).eq(value(0))
							.and(S2_T1.bill_mng_no.eq(bind("bill_mng_no")))
							.and(
								S2_T2.trd_ptn_typ.in(
									value(MAC_TRD_PTN_TYP.RCV_ADV.value()), 
									value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value()), 
									value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value())
								)
							)
							.and(
								bracket(
									S2_T2.tax_cd1.isNotNull().or(S2_T2.tax_cd2.isNotNull())
								)
							)
						)
					).view(S3_W1)
					.leftOuterJoin(S3_T1).on(
						bracket(
							S3_T1.bill_acst_no.eq(S3_W1.pr("bill_acst_no"))
						)
					)
				)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dscnt_itm_flg
						))
						.addMap((r, m) -> {
							r.setBooleanNE("dscnt_itm_flg", m.dscnt_itm_flg());
					})
					,j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd1")
						))
						.addSelect(m -> toArray(
								m.bill_tax_disp_flg
							))
						.addMap((r, m) -> {
							r.setBooleanNE("bill_tax_disp_flg1", m.bill_tax_disp_flg());
					})
					,j -> j
						.add(MAM_STTL_R.class, r -> toCondition(
							r.getStringNE("ar_sttl_cd2")
						))
						.addSelect(m -> toArray(
								m.bill_tax_disp_flg
							))
						.addMap((r, m) -> {
							r.setBooleanNE("bill_tax_disp_flg2", m.bill_tax_disp_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBGL5020_MST_RCV_ACT_D_Query_U01
	 */
	static MCQueryPlan MSBGL5020_MST_RCV_ACT_D_U01() {
		MST_RCV_ACT_D_R S0_TA1 = MST_RCV_ACT_D_R.create("TA1");
		MST_BILL_D_R S1_TB1 = MST_BILL_D_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBGL5020_MST_RCV_ACT_D_Query_U01")
					.update(S0_TA1)
					.set(S0_TA1.bill_mng_no).eq(subQuery()
						.select(S1_TB1.bill_mng_no)
						.from(S1_TB1)
						.where(
							value(0).eq(value(0))
							.and(S1_TB1.act_no.eq(bind("rcv_act_no")))
							.and(S1_TB1.act_seq.eq(bind("red_rcv_act_seq")))
							.and(S1_TB1.act_d_no.eq(S0_TA1.rcv_act_d_no))
							.and(S1_TB1.act_d_seq.eq(S0_TA1.rcv_act_d_seq))
							.and(S1_TB1.bill_d_typ.eq(value(MSC_BILL_D_TYP.RCV.value())))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_TA1.rcv_act_no.eq(bind("rcv_act_no")))
						.and(S0_TA1.rcv_act_seq.eq(bind("red_rcv_act_seq")))
					)
			);
	}
}