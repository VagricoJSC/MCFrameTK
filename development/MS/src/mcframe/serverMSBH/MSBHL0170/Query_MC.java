package mcframe.serverMSBH.MSBHL0170;

import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import mcframe.commonMA.constant.MAC_BP_GRP_TYP;
import mcframe.serverCore.queryapi.IFMCSQL.MCDynamicSQLID;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import mcframe.serverMA.dbc.MAM_BANK_AC_R;
import mcframe.serverMA.dbc.MAM_BANK_BRANCH_R;
import mcframe.serverMA.dbc.MAM_BANK_R;
import mcframe.serverMA.dbc.MAM_BP_GRP_R;
import mcframe.serverMA.dbc.MAM_BP_R;
import mcframe.serverMA.dbc.MAM_CUR_R;
import mcframe.serverMA.dbc.MAM_STTL_R;
import mcframe.serverMS.dbc.MST_BILL_RCPT_R;

public class Query_MC {
	
	/**
	 * -- MSBHL0170_MST_BILL_RCPT_Query_S01
	 */
	static MCQueryPlan MSBHL0170_MST_BILL_RCPT_S01() {
		MST_BILL_RCPT_R T1 = MST_BILL_RCPT_R.create("T");
		
		MAM_BP_R BP = MAM_BP_R.create("BP");							// 取引先マスタ
		MAM_BP_GRP_R GRP1 = MAM_BP_GRP_R.create("GRP1");				// 取引先分類マスタ1
		MAM_BP_GRP_R GRP2 = MAM_BP_GRP_R.create("GRP2");				// 取引先分類マスタ2
		MAM_BP_GRP_R GRP3 = MAM_BP_GRP_R.create("GRP3");				// 取引先分類マスタ3
		MAM_BP_GRP_R GRP4 = MAM_BP_GRP_R.create("GRP4");				// 取引先分類マスタ4
		MAM_BP_GRP_R GRP5 = MAM_BP_GRP_R.create("GRP5");				// 取引先分類マスタ5
		MAM_BP_GRP_R GRP6 = MAM_BP_GRP_R.create("GRP6");				// 取引先分類マスタ6
		MAM_BP_GRP_R GRP7 = MAM_BP_GRP_R.create("GRP7");				// 取引先分類マスタ7
		MAM_BP_GRP_R GRP8 = MAM_BP_GRP_R.create("GRP8");				// 取引先分類マスタ8
		MAM_BP_GRP_R GRP9 = MAM_BP_GRP_R.create("GRP9");				// 取引先分類マスタ9
		MAM_BP_GRP_R GRP10 = MAM_BP_GRP_R.create("GRP10");				// 取引先分類マスタ10
		MAM_CUR_R CUR = MAM_CUR_R.create("CUR");						// 通貨マスタ
		MAM_BANK_AC_R BANK_AC = MAM_BANK_AC_R.create("BANK_AC");		// 口座マスタ
		MAM_BANK_BRANCH_R BANK_BR =MAM_BANK_BRANCH_R.create("BANK_BR");	// 銀行支店マスタ
		MAM_BANK_R BANK = MAM_BANK_R.create("BANK");					// 銀行マスタ
		MAM_STTL_R STTL1 = MAM_STTL_R.create("STTL1");					// 決済方法マスタ1
		MAM_STTL_R STTL2 = MAM_STTL_R.create("STTL2");					// 決済方法マスタ2
		MAM_STTL_R STTL3 = MAM_STTL_R.create("STTL3");					// 決済方法マスタ3
		MAM_STTL_R STTL4 = MAM_STTL_R.create("STTL4");					// 決済方法マスタ4
		MAM_STTL_R STTL5 = MAM_STTL_R.create("STTL5");					// 決済方法マスタ5
		MAM_STTL_R STTL6 = MAM_STTL_R.create("STTL6");					// 決済方法マスタ6
		MAM_STTL_R STTL7 = MAM_STTL_R.create("STTL7");					// 決済方法マスタ7
		MAM_STTL_R STTL8 = MAM_STTL_R.create("STTL8");					// 決済方法マスタ8
		MAM_STTL_R STTL9 = MAM_STTL_R.create("STTL9");					// 決済方法マスタ9
		MAM_STTL_R STTL10 = MAM_STTL_R.create("STTL10");				// 決済方法マスタ10
		MCDynamicSQLID D1_Invalid = createDynamicSQLID("D1_Invalid");	// 条件1
		MCDynamicSQLID D2_Not_Bill = createDynamicSQLID("D2_Not_Bill");	// 条件2
		MCDynamicSQLID D3_BP_GRP = createDynamicSQLID("D3_BP_GRP");	// 条件2
		
		return 
			createQueryPlan()
				.setQuery(
					sql("MSBHL0170_MST_BILL_RCPT_Query_S01")
					.mainQuery()
					.select(
						T1.bill_rcpt_no,
						T1.invalid_flg,
						T1.bill_cl_dt,
						T1.bill_dt,
						T1.bill_no,
						T1.pre_bill_no,
						T1.pre_bill_dt,
						T1.bill_st_dt,
						T1.bill_end_dt,
						T1.iv_no,
						T1.wrk_no,
						T1.wrk_nm,
						T1.bill_src_cd,
						BP.bp_nm.as(Srch01_RsltR.$bill_src_nm),
						T1.bill_src_ein,
						T1.bill_src_biz_co_no,
						T1.bill_src_zip_cd,
						T1.bill_src_addr1,
						T1.bill_src_addr2,
						T1.bill_src_addr3,
						T1.bill_src_addr4,
						T1.bill_src_dpt,
						T1.bill_src_tel,
						BP.bp_grp_cd1,
						BP.bp_grp_cd2,
						BP.bp_grp_cd3,
						BP.bp_grp_cd4,
						BP.bp_grp_cd5,
						BP.bp_grp_cd6,
						BP.bp_grp_cd7,
						BP.bp_grp_cd8,
						BP.bp_grp_cd9,
						BP.bp_grp_cd10,
						T1.trd_cur_cd,
						CUR.cur_nm.as(Srch01_RsltR.$trd_cur_nm),
						T1.bill_xrate,
						T1.last_bill_amt,
						T1.rcv_amt,
						T1.sw_amt,
						T1.setoff_amt,
						T1.bfw_amt,
						T1.sls_amt,
						T1.dscnt_amt,
						T1.ret_amt,
						T1.tax_amt,
						T1.sw_to_amt,
						T1.bill_amt,
						T1.bank_ac_cd,
						BANK_AC.bank_ac_nm,
						BANK_AC.bank_ac_typ,
						BANK_AC.bank_ac_no,
						BANK_AC.bank_ac_holder,
						BANK_AC.bank_ac_holder_sub,
						BANK_AC.bank_cd,
						BANK.bank_nm,
						BANK_AC.branch_cd,
						BANK_BR.branch_nm,
						T1.tax_rate1,
						T1.tax_rate_sls_amt1,
						T1.tax_rate_tax_amt1,
						T1.tax_rate_base_tax_amt1,
						T1.tax_rate2,
						T1.tax_rate_sls_amt2,
						T1.tax_rate_tax_amt2,
						T1.tax_rate_base_tax_amt2,
						T1.tax_rate3,
						T1.tax_rate_sls_amt3,
						T1.tax_rate_tax_amt3,
						T1.tax_rate_base_tax_amt3,
						T1.tax_rate4,
						T1.tax_rate_sls_amt4,
						T1.tax_rate_tax_amt4,
						T1.tax_rate_base_tax_amt4,
						T1.tax_rate5,
						T1.tax_rate_sls_amt5,
						T1.tax_rate_tax_amt5,
						T1.tax_rate_base_tax_amt5,
						T1.tax_rate6,
						T1.tax_rate_sls_amt6,
						T1.tax_rate_tax_amt6,
						T1.tax_rate_base_tax_amt6,
						T1.tax_rate7,
						T1.tax_rate_sls_amt7,
						T1.tax_rate_tax_amt7,
						T1.tax_rate_base_tax_amt7,
						T1.tax_rate8,
						T1.tax_rate_sls_amt8,
						T1.tax_rate_tax_amt8,
						T1.tax_rate_base_tax_amt8,
						T1.tax_rate9,
						T1.tax_rate_sls_amt9,
						T1.tax_rate_tax_amt9,
						T1.tax_rate_base_tax_amt9,
						T1.tax_rate10,
						T1.tax_rate_sls_amt10,
						T1.tax_rate_tax_amt10,
						T1.tax_rate_base_tax_amt10,
						T1.adv_amt_bal,
						T1.adv_amt,
						T1.adv_setoff_amt,
						T1.adv_setoff_tax_amt,
						T1.pay_schd_dt1,
						T1.pay_schd_amt1,
						T1.pay_mtd_cd1,
						STTL1.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm1),
						T1.pay_schd_dt2,
						T1.pay_schd_amt2,
						T1.pay_mtd_cd2,
						STTL2.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm2),
						T1.pay_schd_dt3,
						T1.pay_schd_amt3,
						T1.pay_mtd_cd3,
						STTL3.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm3),
						T1.pay_schd_dt4,
						T1.pay_schd_amt4,
						T1.pay_mtd_cd4,
						STTL4.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm4),
						T1.pay_schd_dt5,
						T1.pay_schd_amt5,
						T1.pay_mtd_cd5,
						STTL5.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm5),
						T1.pay_schd_dt6,
						T1.pay_schd_amt6,
						T1.pay_mtd_cd6,
						STTL6.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm6),
						T1.pay_schd_dt7,
						T1.pay_schd_amt7,
						T1.pay_mtd_cd7,
						STTL7.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm7),
						T1.pay_schd_dt8,
						T1.pay_schd_amt8,
						T1.pay_mtd_cd8,
						STTL8.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm8),
						T1.pay_schd_dt9,
						T1.pay_schd_amt9,
						T1.pay_mtd_cd9,
						STTL9.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm9),
						T1.pay_schd_dt10,
						T1.pay_schd_amt10,
						T1.pay_mtd_cd10,
						STTL10.sttl_nm.as(Srch01_RsltR.$pay_mtd_nm10),
						T1.bill_bcst_nm,
						T1.bill_ein,
						T1.bill_biz_co_no,
						T1.bill_zip_cd,
						T1.bill_addr1,
						T1.bill_addr2,
						T1.bill_addr3,
						T1.bill_addr4,
						T1.bill_bcst_dpt,
						T1.bill_tel,
						T1.ins_usr_id,
						T1.ins_usr_nm,
						T1.ins_func_id,
						T1.ins_ts,
						T1.upd_usr_id,
						T1.upd_usr_nm,
						T1.upd_func_id,
						T1.upd_ts,
						T1.upd_srv_req_no,
						addDynamicSelect(D3_BP_GRP)
					)
					.from(
						T1
						.leftOuterJoin(BP).on(T1.bill_src_cd.eq(BP.bp_cd).and(BP.bsppl_flg.eq(value(true))))
						.leftOuterJoin(CUR).on(T1.trd_cur_cd.eq(CUR.cur_cd))
						.leftOuterJoin(BANK_AC).on(T1.bank_ac_cd.eq(BANK_AC.bank_ac_cd))
						.leftOuterJoin(BANK_BR).on((BANK_AC.bank_cd.eq(BANK_BR.bank_cd).and(BANK_AC.branch_cd.eq(BANK_BR.branch_cd))))
						.leftOuterJoin(BANK).on(BANK_AC.bank_cd.eq(BANK.bank_cd))
						.leftOuterJoin(STTL1).on(T1.pay_mtd_cd1.eq(STTL1.sttl_cd))
						.leftOuterJoin(STTL2).on(T1.pay_mtd_cd2.eq(STTL2.sttl_cd))
						.leftOuterJoin(STTL3).on(T1.pay_mtd_cd3.eq(STTL3.sttl_cd))
						.leftOuterJoin(STTL4).on(T1.pay_mtd_cd4.eq(STTL4.sttl_cd))
						.leftOuterJoin(STTL5).on(T1.pay_mtd_cd5.eq(STTL5.sttl_cd))
						.leftOuterJoin(STTL6).on(T1.pay_mtd_cd6.eq(STTL6.sttl_cd))
						.leftOuterJoin(STTL7).on(T1.pay_mtd_cd7.eq(STTL7.sttl_cd))
						.leftOuterJoin(STTL8).on(T1.pay_mtd_cd8.eq(STTL8.sttl_cd))
						.leftOuterJoin(STTL9).on(T1.pay_mtd_cd9.eq(STTL9.sttl_cd))
						.leftOuterJoin(STTL10).on(T1.pay_mtd_cd10.eq(STTL10.sttl_cd))
						.addDynamicView(D3_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(T1.bill_rcpt_no.like(bind(Srch01_CndR.$bill_rcpt_no)))
						.cutoff$and(T1.bill_no.like(bind(Srch01_CndR.$bill_no)))
						.cutoff$and(T1.iv_no.like(bind(Srch01_CndR.$iv_no)))
						.cutoff$and(T1.bill_src_cd.like(bind(Srch01_CndR.$bill_src_cd)))
						.cutoff$and(BP.bp_nm.like(bind(Srch01_CndR.$bill_src_nm)))
						.cutoff$and(T1.bill_cl_dt.gte(bind(Srch01_CndR.$bill_cl_dt_from)))
						.cutoff$and(T1.bill_cl_dt.lte(bind(Srch01_CndR.$bill_cl_dt_to)))
						.cutoff$and(T1.trd_cur_cd.like(bind(Srch01_CndR.$trd_cur_cd)))
						.cutoff$and(
									T1.pay_schd_dt1.gte(bind(Srch01_CndR.$pay_schd_dt_from))
								.or(T1.pay_schd_dt2.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt3.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt4.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt5.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt6.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt7.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt8.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt9.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
								.or(T1.pay_schd_dt10.gte(bind(Srch01_CndR.$pay_schd_dt_from)))
							)
						.cutoff$and(
									T1.pay_schd_dt1.lte(bind(Srch01_CndR.$pay_schd_dt_to))
								.or(T1.pay_schd_dt2.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt3.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt4.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt5.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt6.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt7.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt8.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt9.lte(bind(Srch01_CndR.$pay_schd_dt_to)))
								.or(T1.pay_schd_dt10.lte(bind(Srch01_CndR.$pay_schd_dt_to)))		
							)
						.cutoff$and(CUR.cur_nm.like(bind(Srch01_CndR.$trd_cur_nm)))
						.addDynamicPredicate(D1_Invalid)
						.addDynamicPredicate(D2_Not_Bill)
						.addDynamicPredicate(D3_BP_GRP)
					)
					.orderBy(
						T1.bill_rcpt_no.asc()
					)
				)
				.setDynamicSQLInfo(
					when(r -> !r.getBooleanNE(Srch01_CndR.$inc_invalid_flg))
						.predicate(D1_Invalid, d ->d.and(T1.invalid_flg.eq(value(false)))),
					when(r -> !r.getBooleanNE(Srch01_CndR.$inc_not_bill_flg))
						.predicate(D2_Not_Bill, d -> d.and(T1.bill_amt.neq(value(0)))),
					when(boundOr("bp_grp_flg1"))
						.select(D3_BP_GRP, BP.bp_grp_cd1.as("bp_grp_cd1"), GRP1.bp_grp_nm.as("bp_grp_nm1"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP1).on(BP.bp_grp_cd1.eq(GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(GRP1.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
					when(boundOr("bp_grp_flg2"))
						.select(D3_BP_GRP, BP.bp_grp_cd2.as("bp_grp_cd2"), GRP2.bp_grp_nm.as("bp_grp_nm2"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP2).on(BP.bp_grp_cd2.eq(GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(GRP2.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
					when(boundOr("bp_grp_flg3"))
						.select(D3_BP_GRP, BP.bp_grp_cd3.as("bp_grp_cd3"), GRP3.bp_grp_nm.as("bp_grp_nm3"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP3).on(BP.bp_grp_cd3.eq(GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(GRP3.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
					when(boundOr("bp_grp_flg4"))
						.select(D3_BP_GRP, BP.bp_grp_cd4.as("bp_grp_cd4"), GRP4.bp_grp_nm.as("bp_grp_nm4"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP4).on(BP.bp_grp_cd4.eq(GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(GRP4.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
					when(boundOr("bp_grp_flg5"))
						.select(D3_BP_GRP, BP.bp_grp_cd5.as("bp_grp_cd5"), GRP5.bp_grp_nm.as("bp_grp_nm5"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP5).on(BP.bp_grp_cd5.eq(GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(GRP5.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
					when(boundOr("bp_grp_flg6"))
						.select(D3_BP_GRP, BP.bp_grp_cd6.as("bp_grp_cd6"), GRP6.bp_grp_nm.as("bp_grp_nm6"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP6).on(BP.bp_grp_cd6.eq(GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(GRP6.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
					when(boundOr("bp_grp_flg7"))
						.select(D3_BP_GRP, BP.bp_grp_cd7.as("bp_grp_cd7"), GRP7.bp_grp_nm.as("bp_grp_nm7"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP7).on(BP.bp_grp_cd7.eq(GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(GRP7.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
					when(boundOr("bp_grp_flg8"))
						.select(D3_BP_GRP, BP.bp_grp_cd8.as("bp_grp_cd8"), GRP8.bp_grp_nm.as("bp_grp_nm8"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP8).on(BP.bp_grp_cd8.eq(GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(GRP8.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
					when(boundOr("bp_grp_flg9"))
						.select(D3_BP_GRP, BP.bp_grp_cd9.as("bp_grp_cd9"), GRP9.bp_grp_nm.as("bp_grp_nm9"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP9).on(BP.bp_grp_cd9.eq(GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(GRP9.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
					when(boundOr("bp_grp_flg10"))
						.select(D3_BP_GRP, BP.bp_grp_cd10.as("bp_grp_cd10"), GRP10.bp_grp_nm.as("bp_grp_nm10"))
						.view(D3_BP_GRP, v -> v.leftOuterJoin(GRP10).on(BP.bp_grp_cd10.eq(GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(GRP10.bp_grp_typ))))
						.predicate(D3_BP_GRP, p -> p.cutoff$and(BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
					);
	}
}