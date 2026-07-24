package mcframe.serverMSBD.MSBDL5300;

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
	 * -- MSBDL5300_MST_PURC_ACT_Query_S01
	 */
	static MCQueryPlan MSBDL5300_MST_PURC_ACT_S01() {
		MSW_PURC_ACT_KEY_R PURC_ACT_KEY = MSW_PURC_ACT_KEY_R.create("PURC_ACT_KEY");
		MST_PURC_ACT_R PURC_ACT = MST_PURC_ACT_R.create("PURC_ACT");
		MST_PURC_ACT_D_R PURC_ACT_D = MST_PURC_ACT_D_R.create("PURC_ACT_D");
		MST_PURC_ACT_IO_R PURC_ACT_IO = MST_PURC_ACT_IO_R.create("PURC_ACT_IO");
		MAM_BP_R BP_SPPL = MAM_BP_R.create("BP_SPPL");
		MAM_BP_R BP_ASPPL = MAM_BP_R.create("BP_ASPPL");
		MAM_CUR_R TRD_CUR = MAM_CUR_R.create("TRD_CUR");

		return createQueryPlan()
			.setQuery(
				sql("MSBDL5300_MST_PURC_ACT_Query_S01")
					.mainQuery()
					.select(
						PURC_ACT.purc_act_no,
						PURC_ACT.purc_act_seq,
						PURC_ACT.purc_act_rev,
						PURC_ACT.purc_ret_act_no,
						PURC_ACT.purc_ret_act_rev,
						PURC_ACT.slip_sts_typ,
						PURC_ACT.trd_cd,
						PURC_ACT.trd_ptn_typ,
						PURC_ACT.ac_ym,
						PURC_ACT.ac_dt,
						PURC_ACT.purc_dpt_cd.as("dpt_cd"),
						PURC_ACT.purc_usr_cd.as("usr_cd"),
						PURC_ACT.sppl_cd,
						BP_SPPL.purc_tax_calc_typ.as("tax_calc_typ"),
						BP_SPPL.sppl_iv_flg.as("iv_flg"),
						BP_SPPL.asppl_cd,
						BP_ASPPL.bsppl_cd,
						PURC_ACT.cred_cd,
						MAPA_BP$F_GET_BSPPL_DPT_CD_NE(
							BP_ASPPL.bsppl_cd, PURC_ACT.ac_dt, value(false)
						).as("bsppl_dpt_cd"),
						PURC_ACT_D.ap_dpt_cd,
						PURC_ACT.rcpt_iv_no,
						PURC_ACT.rcpt_iv_mng_no,
						PURC_ACT.trd_cur_cd,
						PURC_ACT.xrate_cd,
						PURC_ACT.xrate,
						PURC_ACT.pay_schd_dt,
						PURC_ACT_D.purc_act_d_no,
						PURC_ACT_D.purc_act_d_seq,
						PURC_ACT_D.purc_ret_act_d_no,
						PURC_ACT_D.itm_cd,
						PURC_ACT_D.itm_sub1,
						PURC_ACT_D.itm_sub2,
						PURC_ACT_D.itm_sub3,
						PURC_ACT_D.itm_nm,
						PURC_ACT_D.stk_mng_typ,
						nvl(PURC_ACT_D.in_to_loc_cd,
							subQuery()
								.select(min(PURC_ACT_IO.in_to_loc_cd))
								.from(PURC_ACT_IO)
								.where(PURC_ACT_IO.purc_act_d_no.eq(PURC_ACT_D.purc_act_d_no)
									.and(PURC_ACT_IO.purc_act_d_seq.eq(PURC_ACT_D.purc_act_d_seq))
									.and(PURC_ACT_IO.in_to_loc_cd.isNotNull())
								)
						).as("loc_cd"),
						PURC_ACT_D.trd_unit_cd,
						PURC_ACT_D.trd_unit_qty,
						PURC_ACT_D.base_unit_cd,
						PURC_ACT_D.base_unit_qty,
						PURC_ACT_D.tax_cd,
						PURC_ACT_D.trd_cur_upri,
						PURC_ACT_D.trd_cur_amt,
						PURC_ACT_D.trd_cur_tax_amt,
						PURC_ACT_D.trd_cur_dscnt_amt,
						PURC_ACT_D.base_cur_upri,
						PURC_ACT_D.base_cur_amt,
						PURC_ACT_D.base_cur_tax_amt,
						PURC_ACT_D.base_cur_dscnt_amt,
						BP_SPPL.purc_amt_rnd_typ.as("amt_rnd_typ"),
						BP_SPPL.purc_tax_rnd_typ.as("tax_rnd_typ"),
						TRD_CUR.amt_dec_place
					)
					.from(
						PURC_ACT_KEY
						.innerJoin(PURC_ACT).on(
							bracket(
								PURC_ACT.purc_act_no.eq(PURC_ACT_KEY.purc_act_no)
								.and(PURC_ACT.purc_act_seq.eq(PURC_ACT_KEY.purc_act_seq))
							)
						)
						.innerJoin(PURC_ACT_D).on(
							bracket(
								PURC_ACT_D.purc_act_no.eq(PURC_ACT.purc_act_no)
								.and(PURC_ACT_D.purc_act_seq.eq(PURC_ACT.purc_act_seq))
							)
						)
						.leftOuterJoin(BP_SPPL).on(
							bracket(
								BP_SPPL.bp_cd.eq(PURC_ACT.sppl_cd)
							)
						)
						.leftOuterJoin(BP_ASPPL).on(
							bracket(
								BP_ASPPL.bp_cd.eq(BP_SPPL.asppl_cd)
							)
						)
						.leftOuterJoin(TRD_CUR).on(
							bracket(
								PURC_ACT.trd_cur_cd.eq(TRD_CUR.cur_cd)
							)
						)
					)
					.orderBy(
						PURC_ACT.purc_act_no.asc(),
						PURC_ACT_D.purc_act_d_no.asc()
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("arr_lg_grp_cd", m.lg_grp_cd());
					}),
					j -> j
						.add(MAM_DPT_R.class, r -> toCondition(
							r.getStringNE("bsppl_dpt_cd"),
							r.getDate("ac_dt")
						))
						.addSelect(m -> toArray(
							m.pay_bank_ac_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("pay_bank_ac_cd", m.pay_bank_ac_cd());
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