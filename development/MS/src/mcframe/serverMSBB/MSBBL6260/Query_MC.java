package mcframe.serverMSBB.MSBBL6260;

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

import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;

public class Query_MC {
	
	/**
	 * -- MSBBL6260_MST_SLS_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL6260_MST_SLS_ACT_S01() {
		MSW_SLS_ACT_KEY_R SLS_ACT_KEY = MSW_SLS_ACT_KEY_R.create("SLS_ACT_KEY");
		MST_SLS_ACT_R SLS_ACT = MST_SLS_ACT_R.create("SLS_ACT");
		MST_SLS_ACT_D_R SLS_ACT_D = MST_SLS_ACT_D_R.create("SLS_ACT_D");
		MAM_BP_R BP_CST = MAM_BP_R.create("BP_CST");
		MAM_BP_R BP_ACST = MAM_BP_R.create("BP_ACST");
		MAM_CUR_R TRD_CUR = MAM_CUR_R.create("TRD_CUR");

		return createQueryPlan()
			.setQuery(
				sql("MSBBL6260_MST_SLS_ACT_Query_S01")
					.mainQuery()
					.select(
						SLS_ACT.sls_act_no,
						SLS_ACT.sls_act_seq,
						SLS_ACT.sls_act_rev,
						SLS_ACT.slip_sts_typ,
						SLS_ACT.trd_cd,
						SLS_ACT.trd_ptn_typ,
						SLS_ACT.ac_ym,
						SLS_ACT.ac_dt,
						SLS_ACT.sls_dpt_cd.as("dpt_cd"),
						SLS_ACT.sls_dpt_cd,
						SLS_ACT.sls_usr_cd.as("usr_cd"),
						SLS_ACT.cst_cd,
						BP_CST.sls_tax_calc_typ.as("tax_calc_typ"),
						BP_CST.cst_iv_flg.as("iv_flg"),
						BP_CST.acst_cd,
						BP_ACST.bcst_cd,
						SLS_ACT.cred_cd,
						SLS_ACT.ar_dpt_cd,
						SLS_ACT.iv_no,
						SLS_ACT.trd_cur_cd,
						SLS_ACT.xrate_cd,
						SLS_ACT.xrate,
						SLS_ACT.ddlv_sls_flg,
						SLS_ACT.ship_lg_grp_cd,
						SLS_ACT.rcv_schd_dt,
						SLS_ACT_D.sls_act_d_no,
						SLS_ACT_D.sls_act_d_seq,
						SLS_ACT_D.itm_cd,
						SLS_ACT_D.itm_sub1,
						SLS_ACT_D.itm_sub2,
						SLS_ACT_D.itm_sub3,
						SLS_ACT_D.itm_nm,
						SLS_ACT_D.stk_mng_typ,
						SLS_ACT_D.trd_unit_cd,
						SLS_ACT_D.trd_unit_qty,
						SLS_ACT_D.base_unit_cd,
						SLS_ACT_D.base_unit_qty,
						SLS_ACT_D.tax_cd,
						SLS_ACT_D.trd_cur_upri,
						SLS_ACT_D.trd_cur_amt,
						SLS_ACT_D.trd_cur_tax_amt,
						SLS_ACT_D.trd_cur_dscnt_amt,
						SLS_ACT_D.base_cur_upri,
						SLS_ACT_D.base_cur_amt,
						SLS_ACT_D.base_cur_tax_amt,
						SLS_ACT_D.base_cur_dscnt_amt,
						SLS_ACT.aprv_flg,
						SLS_ACT.aprv_sts_typ,
						SLS_ACT.sls_act_no.as("act_no"),
						SLS_ACT.sls_act_seq.as("act_seq"),
						SLS_ACT_D.sls_act_d_no.as("act_d_no"),
						SLS_ACT_D.sls_act_d_seq.as("act_d_seq"),
						SLS_ACT.cst_cd.as("bp_cd"),
						BP_CST.sls_amt_rnd_typ.as("amt_rnd_typ"),
						BP_CST.sls_tax_rnd_typ.as("tax_rnd_typ"),
						TRD_CUR.amt_dec_place
					)
					.from(
						SLS_ACT_KEY
						.innerJoin(SLS_ACT).on(
							bracket(
								SLS_ACT.sls_act_no.eq(SLS_ACT_KEY.sls_act_no)
								.and(SLS_ACT.sls_act_seq.eq(SLS_ACT_KEY.sls_act_seq))
							)
						)
						.innerJoin(SLS_ACT_D).on(
							bracket(
								SLS_ACT_D.sls_act_no.eq(SLS_ACT.sls_act_no)
								.and(SLS_ACT_D.sls_act_seq.eq(SLS_ACT.sls_act_seq))
							)
						)
						.leftOuterJoin(BP_CST).on(
							bracket(
								BP_CST.bp_cd.eq(SLS_ACT.cst_cd)
							)
						)
						.leftOuterJoin(BP_ACST).on(
							bracket(
								BP_ACST.bp_cd.eq(BP_CST.acst_cd)
							)
						)
						.leftOuterJoin(TRD_CUR).on(
							bracket(
								SLS_ACT.trd_cur_cd.eq(TRD_CUR.cur_cd)
							)
						)
					)
					.orderBy(
						SLS_ACT.sls_act_no.asc(),
						SLS_ACT_D.sls_act_d_no.asc()
					)
			).setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_jnl_cd,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", nvl(r.getStringNE("itm_nm"), m.itm_nm()));
							r.setStringNE("itm_jnl_cd", m.itm_jnl_cd());
							r.setNumberNE("dec_place", m.dec_place());
							r.setStringNE("rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_typ,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setNumberNE("tax_rate", m.tax_rate());
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
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
					})
				)
			);
	}
	
	/**
	 * -- MSBBL6260_MST_PROV_ACT_Query_S01
	 */
	static MCQueryPlan MSBBL6260_MST_PROV_ACT_S01() {
		MSW_PROV_ACT_KEY_R PROV_ACT_KEY = MSW_PROV_ACT_KEY_R.create("PROV_ACT_KEY");
		MST_PROV_ACT_R PROV_ACT = MST_PROV_ACT_R.create("T1");
		MAM_BP_R BP_PROV = MAM_BP_R.create("BP_PROV");
		MAM_CUR_R TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBBL6260_MST_PROV_ACT_Query_S01")
					.mainQuery()
					.select(
						PROV_ACT.prov_act_no,
						PROV_ACT.prov_act_seq,
						PROV_ACT.prov_act_rev,
						PROV_ACT.slip_sts_typ,
						PROV_ACT.trd_cd,
						PROV_ACT.trd_ptn_typ,
						PROV_ACT.ac_ym,
						PROV_ACT.ac_dt,
						value("").as("dpt_cd"),
						value("").as("usr_cd"),
						PROV_ACT.prsppl_cd,
						value("").as("acst_cd"),
						value("").as("bcst_cd"),
						value("").as("cred_cd"),
						value("").as("ar_dpt_cd"),
						value("").as("iv_no"),
						PROV_ACT.trd_cur_cd,
						PROV_ACT.xrate_cd,
						value("").as("ship_lg_grp_cd"),
						PROV_ACT.xrate,
						PROV_ACT.ac_dt.as("rcv_schd_dt"),
						PROV_ACT.itm_cd,
						PROV_ACT.itm_sub1,
						PROV_ACT.itm_sub2,
						PROV_ACT.itm_sub3,
						PROV_ACT.stk_mng_typ,
						PROV_ACT.loc_cd,
						PROV_ACT.trd_unit_cd,
						PROV_ACT.trd_unit_qty,
						PROV_ACT.base_unit_cd,
						PROV_ACT.base_unit_qty,
						PROV_ACT.tax_cd,
						PROV_ACT.trd_cur_upri,
						PROV_ACT.trd_cur_amt,
						PROV_ACT.trd_cur_tax_amt,
						value((MCNumber)null).as("trd_cur_dscnt_amt"),
						PROV_ACT.base_cur_upri,
						PROV_ACT.base_cur_amt,
						PROV_ACT.base_cur_tax_amt,
						value((MCNumber)null).as("base_cur_dscnt_amt"),
						PROV_ACT.prov_act_no.as("act_no"),
						PROV_ACT.prov_act_seq.as("act_seq"),
						PROV_ACT.prov_act_no.as("act_d_no"),
						PROV_ACT.prov_act_seq.as("act_d_seq"),
						PROV_ACT.prsppl_cd.as("bp_cd"),
						BP_PROV.prov_amt_rnd_typ.as("amt_rnd_typ"),
						BP_PROV.prov_tax_rnd_typ.as("tax_rnd_typ"),
						TRD_CUR.amt_dec_place
					)
					.from(
						PROV_ACT_KEY
						.innerJoin(PROV_ACT).on(
							bracket(
								PROV_ACT.prov_act_no.eq(PROV_ACT_KEY.prov_act_no)
								.and(PROV_ACT.prov_act_seq.eq(PROV_ACT_KEY.prov_act_seq))
							)
						)
						.leftOuterJoin(BP_PROV).on(bracket(BP_PROV.bp_cd.eq(PROV_ACT.prsppl_cd)))
						.leftOuterJoin(TRD_CUR).on(bracket(PROV_ACT.trd_cur_cd.eq(TRD_CUR.cur_cd)))
					)
					.orderBy(
						PROV_ACT.prov_act_no.asc()
					)
			).setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.asset_mng_typ,
							m.itm_jnl_cd,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", nvl(r.getStringNE("itm_nm"), m.itm_nm()));
							r.setStringNE("itm_jnl_cd", m.itm_jnl_cd());
							r.setNumberNE("dec_place", m.dec_place());
							r.setStringNE("rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("tax_cd")
						))
						.addSelect(m -> toArray(
							m.inc_tax_flg,
							m.tax_typ,
							m.tax_rate
						))
						.addMap((r, m) -> {
							r.setBooleanNE("inc_tax_flg", m.inc_tax_flg());
							r.setStringNE("tax_typ", m.tax_typ());
							r.setNumberNE("tax_rate", m.tax_rate());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("amt_dec_place", m.amt_dec_place());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("prsppl_cd")
						))
						.addSelect(m -> toArray(
							m.prov_tax_calc_typ,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_calc_typ", m.prov_tax_calc_typ());
							r.setStringNE("prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.asst_dpt_cd,
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_cd", m.asst_dpt_cd());
							r.setStringNE("asst_dpt_cd", m.asst_dpt_cd());
							r.setStringNE("ship_lg_grp_cd", m.lg_grp_cd());
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
							m.conv_qty
						))
						.addMap((r, m) -> {
							r.setNumberNE("conv_base_qty", m.conv_base_qty());
							r.setNumberNE("conv_qty", m.conv_qty());
				})
				)
			);
	}
}