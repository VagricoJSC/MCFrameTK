package mcframe.serverMABS.MABSL1100;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABS.MABSL0370.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0340.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0350.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1100.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0090.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0780.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0800.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_MfgItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_MfgItmReg_MC extends MABSL_MfgItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造品関連の検索を行います。<br>
	 */
	public class Srch01 extends MABSL_MfgItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected java.util.List<java.lang.String> getOtherSelectGrpNames() {
			return super.getOtherSelectGrpNames();
		}
		protected String _grp;
		@Override
		protected void doIt(String grp) {
			_grp = grp;
			super.doIt(grp);
		}
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder,rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM__R) {
				dbcCustomizeItm(builder,rslt);
			}
			else if (builder.getBaseDbc() instanceof MAM_ITM_DTL__R) {
				dbcCustomizeItmDtl(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_BOM_R) {
				dbcCustomizeBom(builder,rslt);
			}
			else if (builder.getBaseDbc() instanceof MAM_ITM_OPER_R) {
				dbcCustomizeItmOper(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_OPER_WK_COST_R) {
				dbcCustomizeOperWkCost(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_ITM_STRG_R) {
				dbcCustomizeItmStrg(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_ALLOC_CTL_R) {
				dbcCustomizeAllocCtl(builder);
			}
			else if (builder.getBaseDbc() instanceof MAM_STK_RPL_R) {
				dbcCustomizeStkRpl(builder, rslt);
			}
			else if (builder.getBaseDbc() instanceof MAM_ITM_WG__R) {
				dbcCustomizeItmWg(builder, rslt);
			}
			else if (builder.getBaseDbc() instanceof MAM_BP_ITM_R) {
				dbcCustomizeBpItm(builder, rslt);
			}
			else if(builder.getBaseDbc() instanceof MAM_ITM_STR_LN_R) {
				dbcCustomizeItmStrLn(builder, rslt);
			}
		}
		protected <R extends MCDBContainer> void dbcCustomizeItm(MCQueryApiBuilder builder,MCList<R> rslt) {
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_ITM_TYP_D_R itd1 = MAM_ITM_TYP_D_R.create("ITD1");
			MAM_ITM__R t = MAM_ITM__R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(unit1, unit1.unit_cd.eq(t.unit_cd));
			builder.addLeftOuterJoin(itd1, itd1.itm_typ.eq(t.itm_typ)
					.and(itd1.itm_typ_d_cd.eq(t.itm_typ_d_cd)));
			builder.addSelect(unit1.unit_nm);
			builder.addSelect(itd1.def_mfg_aprv_flg);
			builder.addSelect(itd1.def_mfg_aprv_role_cd);
			rslt.addBooleanColumn("def_mfg_aprv_flg");
		}
		protected <R extends MCDBContainer> void dbcCustomizeItmDtl(MCQueryApiBuilder builder) {
			// 製造
			if (isSame(_grp, SELECT_SUB01)) {
				MAM_ITM_DTL__R t = MAM_ITM_DTL__R.create(builder.getBaseDbcAlias());

				/* DAC対応 */
				MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
				builder.addWhereWithAnd(exists( subQuery() .select(S1RD_WG1.prAll()) .from(S1RD_WG1)
						.where( t.wg_cd.eq(S1RD_WG1.wg_cd) )));
				
				MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_DTL__R.$LOC1);
				MAM_RSRC_R rsrc1 = MAM_RSRC_R.create("RSRC1");
				MAM_RSRC_R rsrc2 = MAM_RSRC_R.create("RSRC2");
				builder.addLeftOuterJoin(rsrc1, rsrc1.rsrc_cd.eq(loc1.rsrc_cd1));
				builder.addLeftOuterJoin(rsrc2, rsrc2.rsrc_cd.eq(loc1.rsrc_cd2));
				builder.addWhereWithAnd(t.mfg_loc_cd.isNotNull()
						.and(t.mfg_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))));
				
				builder.addSelect(loc1.sppl_cd.as("loc_sppl_cd"));
				builder.addSelect(loc1.rsrc_cd1);
				builder.addSelect(loc1.rsrc_cd2);
				builder.addSelect(rsrc1.rsrc_nm.as("rsrc_nm1"));
				builder.addSelect(rsrc2.rsrc_nm.as("rsrc_nm2"));

			}
			// ＷＧ間依頼
			else {
				MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
				MAM_ITM_DTL__R t = MAM_ITM_DTL__R.create(builder.getBaseDbcAlias());
				
				builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
						.or( exists( subQuery() .select(S1RD_WG1.prAll()) .from(S1RD_WG1)
								.where( t.wg_cd.eq(S1RD_WG1.wg_cd) ) )));
				builder.addWhereWithAnd(t.rqst_loc_cd.isNotNull()
						.and(t.rqst_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))));
				
			}
		}
		protected <R extends MCDBContainer> void dbcCustomizeBom(MCQueryApiBuilder builder, MCList<R> rslt) {
			/* DAC対応 */
			MAM_BOM_R t = MAM_BOM_R.create(builder.getBaseDbcAlias());
			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			MAM_ITM_TYP_D_R itm_typ_d1 = MAM_ITM_TYP_D_R.create("ITM_TYP_D1");
			MAM_ITM__R itm2 = MAM_ITM__R.create(MAM_BOM_R.$ITM2);
			MAM_UNIT_R unit2 = MAM_UNIT_R.create("UNIT2");

			builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or( exists( subQuery() .select(S1RD_WG1.prAll())
					.from(S1RD_WG1) .where( t.wg_cd.eq(S1RD_WG1.wg_cd) ) )));
			builder.addLeftOuterJoin(itm_typ_d1, itm2.itm_typ.eq(itm_typ_d1.itm_typ)
					.and(itm2.itm_typ_d_cd.eq(itm_typ_d1.itm_typ_d_cd)));
			builder.addLeftOuterJoin(unit2, itm2.unit_cd.eq(unit2.unit_cd));
			builder.addWhereWithAnd(t.par_itm_cd.eq(bind("itm_cd")));
			builder.addWhereWithAnd(t.par_itm_sub1.eq(bind("itm_sub1")));
			builder.addWhereWithAnd(t.par_itm_sub2.eq(bind("itm_sub2")));
			builder.addWhereWithAnd(t.par_itm_sub3.eq(bind("itm_sub3")));
			builder.removeSelect(MAM_BOM_R.$alt_itm_typ);
			
			MAM_ALT_GRP_R alt_grp1 = MAM_ALT_GRP_R.create(MAM_BOM_R.$ALT_GRP1);
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_BOM_R.$ITM1);
			builder.addSelect(decode( t.alt_itm_flg, value(true), alt_grp1.alt_itm_typ, t.alt_itm_typ).as("alt_itm_typ"));
			builder.addSelect(itm1.itm_typ.as("par_itm_typ"));
			builder.addSelect(itm1.itm_typ_d_cd.as("par_itm_typ_d_cd"));
			builder.addSelect(itm2.itm_typ.as("chd_itm_typ"));
			builder.addSelect(itm2.itm_typ_d_cd.as("chd_itm_typ_d_cd"));
			builder.addSelect(itm2.stk_mng_typ.as("chd_stk_mng_typ"));
			builder.addSelect(itm2.asset_mng_typ.as("chd_asset_mng_typ"));
			builder.addSelect(itm2.unit_cd.as("chd_base_unit_cd"));
			builder.addSelect(unit2.unit_nm.as("chd_base_unit_nm"));
			builder.addSelect(itm2.dec_place.as("chd_dec_place"));
			builder.addSelect(itm2.lot_mng_typ);
			builder.addSelect(itm2.sublot_mng_typ);
			builder.addSelect(itm2.sno1_mng_typ.as("chd_sno1_mng_typ"));
			builder.addSelect(itm2.sno2_mng_typ.as("chd_sno2_mng_typ"));
			builder.addSelect(itm2.sno3_mng_typ.as("chd_sno3_mng_typ"));
			builder.addSelect(itm2.sno4_mng_typ.as("chd_sno4_mng_typ"));
			builder.addSelect(itm2.def_bom_ptn.as("chd_def_bom_ptn"));
			builder.addSelect(itm2.ver_flg);
			builder.addSelect(itm_typ_d1.itm_typ_d_nm.as("chd_itm_typ_d_nm"));
			rslt.addBooleanColumn("ver_flg");

		}
		protected void dbcCustomizeItmOper(MCQueryApiBuilder builder) {
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_ITM_OPER_R t = MAM_ITM_OPER_R.create(builder.getBaseDbcAlias());
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_OPER_R.$LOC1);
			
			builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value())).or( exists( subQuery()
					.select(S1RD_LOC1.prAll()) .from(S1RD_LOC1) .where( t.loc_cd.eq(S1RD_LOC1.loc_cd) ) )));
			builder.addLeftOuterJoin(wg1, wg1.wg_cd.eq(loc1.wg_cd));
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			
		}
		protected void dbcCustomizeOperWkCost(MCQueryApiBuilder builder) {
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_OPER_WK_COST_R.$LOC1);
			MAM_OPER_WK_COST_R t = MAM_OPER_WK_COST_R.create(builder.getBaseDbcAlias());
			MAM_WK_COST_R wk_cost1 = MAM_WK_COST_R.create(MAM_OPER_WK_COST_R.$WK_COST1);
			
			builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
					.or( exists( subQuery() .select(S1RD_LOC1.prAll()) .from(S1RD_LOC1)
							.where( t.loc_cd.eq(S1RD_LOC1.loc_cd) ) )));
			builder.addLeftOuterJoin(wg1, wg1.wg_cd.eq(loc1.wg_cd));
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(wk_cost1.wk_cost_unit_nm);
			builder.addSelect(wk_cost1.dec_place.as("wk_cost_unit_dec_place"));
			builder.addSelect(wk_cost1.rnd_typ.as("wk_cost_unit_rnd_typ"));

		}
		protected void dbcCustomizeItmStrg(MCQueryApiBuilder builder) {
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R loc_grp1 = MAM_LOC_GRP_R.create("LOC_GRP1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_STRG_R.$LOC1);
			MAM_ITM_STRG_R t = MAM_ITM_STRG_R.create(builder.getBaseDbcAlias());
			
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.loc_cd.eq(S1RD_LOC1.loc_cd) )));
			builder.addLeftOuterJoin(wg1, wg1.wg_cd.eq(loc1.wg_cd));
			builder.addLeftOuterJoin(loc_grp1, loc_grp1.loc_grp_cd.eq(loc1.loc_grp_cd));
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(loc1.loc_grp_cd);
			builder.addSelect(loc_grp1.loc_grp_nm);

		}
		protected void dbcCustomizeAllocCtl(MCQueryApiBuilder builder) {
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ALLOC_CTL_R.$LOC1);
			MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_ALLOC_CTL_R.$LOC2);
			MAM_ALLOC_CTL_R t = MAM_ALLOC_CTL_R.create(builder.getBaseDbcAlias());
			
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.to_loc_cd.eq(S1RD_LOC1.loc_cd) )));
			builder.addLeftOuterJoin(wg1, wg1.wg_cd.eq(loc1.wg_cd));
			builder.addSelect(loc1.wg_cd.as("to_wg_cd"));
			builder.addSelect(wg1.wg_nm.as("to_wg_nm"));
			builder.addSelect(loc1.lg_grp_cd.as("to_lg_grp_cd"));
			builder.addSelect(loc2.wg_cd.as("fr_wg_cd"));
			builder.addSelect(loc2.lg_grp_cd.as("fr_lg_grp_cd"));
			

		}
		protected <R extends MCDBContainer> void dbcCustomizeStkRpl(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R locgrp1 = MAM_LOC_GRP_R.create("LOCGRP1");
			MAM_ALLOC_GRP_R allocgrp1 = MAM_ALLOC_GRP_R.create("ALLOCGRP1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC1);
			MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC2);
			MAM_LOC_R loc3 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC3);
			MAM_LOC_R loc4 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC4);
			MAM_STK_RPL_R t = MAM_STK_RPL_R.create(builder.getBaseDbcAlias());
			
			builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
					.or( exists( subQuery() .select(S1RD_LOC1.prAll())
							.from(S1RD_LOC1) .where( t.loc_cd.eq(S1RD_LOC1.loc_cd) ) )));
			builder.addLeftOuterJoin(wg1, wg1.wg_cd.eq(loc1.wg_cd));
			builder.addLeftOuterJoin(locgrp1, loc1.loc_grp_cd.eq(locgrp1.loc_grp_cd));
			builder.addLeftOuterJoin(allocgrp1, loc1.alloc_grp_cd.eq(allocgrp1.alloc_grp_cd));
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(loc1.loc_grp_cd);
			builder.addSelect(locgrp1.loc_grp_nm);
			builder.addSelect(loc1.alloc_grp_cd);
			builder.addSelect(allocgrp1.alloc_grp_nm);
			builder.addSelect(loc2.str_ln_tgt_flg.as("gi_str_ln_tgt_flg"));
			builder.addSelect(loc3.str_ln_tgt_flg.as("inpt_gi_str_ln_tgt_flg"));
			builder.addSelect(loc4.str_ln_tgt_flg.as("ship_gi_str_ln_tgt_flg"));
			rslt.addBooleanColumn("gi_str_ln_tgt_flg");
			rslt.addBooleanColumn("inpt_gi_str_ln_tgt_flg");
			rslt.addBooleanColumn("ship_gi_str_ln_tgt_flg");
			
		}
		protected <R extends MCDBContainer> void dbcCustomizeItmWg(MCQueryApiBuilder builder, MCList<R> rslt) {
			
			MAM_WG_R wg1 = MAM_WG_R.create(MAM_ITM_WG__R.$WG1);
			
			MAM_ITM_WG__R t = MAM_ITM_WG__R.create(builder.getBaseDbcAlias());
			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_WG1.prAll())
					.from(S1RD_WG1) .where( t.wg_cd.eq(S1RD_WG1.wg_cd) )));
			builder.addSelect(wg1.mfg_inst_unit_typ.as("mfg_inst_unit_typ_wg"));
			builder.addSelect(wg1.mrp_proc_typ.as("mrp_proc_typ_wg"));
			builder.addSelect(wg1.rqmt_typ.as("rqmt_typ_wg"));
			builder.addSelect(wg1.prod_pln_typ.as("prod_pln_typ_wg"));
			builder.addSelect(wg1.dmnd_date_div_mons.as("dmnd_date_div_mons_wg"));
			builder.addSelect(wg1.alloc_margin_days.as("alloc_margin_days_wg"));
			builder.addSelect(wg1.mrp_alloc_margin_days.as("mrp_alloc_margin_days_wg"));
			builder.addSelect(wg1.mrp_opn_xfr_days.as("mrp_opn_xfr_days_wg"));
			
			MAM_ITM__R itm1 = MAM_ITM__R.create(MAM_ITM_WG__R.$ITM1);
			builder.addSelect(nvl( nvl( itm1.mfg_inst_unit_typ, wg1.mfg_inst_unit_typ ),
					value(MAC_MFG_INST_UNIT_TYP.ITM.value())).as("mfg_inst_unit_typ_mst"));
			builder.addSelect(nvl( nvl( itm1.mrp_proc_typ, wg1.mrp_proc_typ ),
					value(MAC_MRP_PROC_TYP.RATE.value())).as("mrp_proc_typ_mst"));
			builder.addSelect(nvl( itm1.rqmt_typ, wg1.rqmt_typ).as("rqmt_typ_mst"));
			builder.addSelect(nvl( itm1.prod_pln_typ, wg1.prod_pln_typ).as("prod_pln_typ_mst"));
			builder.addSelect(nvl( itm1.dmnd_date_div_mons, wg1.dmnd_date_div_mons).as("dmnd_date_div_mons_mst"));
			builder.addSelect(nvl( nvl( itm1.alloc_margin_days, wg1.alloc_margin_days ), value(0)).as("alloc_margin_days_mst"));
			builder.addSelect(nvl( itm1.mrp_alloc_margin_days, wg1.mrp_alloc_margin_days).as("mrp_alloc_margin_days_mst"));
			builder.addSelect(nvl( itm1.mrp_opn_xfr_days, wg1.mrp_opn_xfr_days).as("mrp_opn_xfr_days_mst"));
			
			builder.addSelect(itm1.rqmt_rstr_qty.as("rqmt_rstr_qty_mst"));
			builder.addSelect(itm1.inpt_itm_add_flg.as("inpt_itm_add_flg"));
			builder.addSelect(itm1.inpt_itm_del_flg.as("inpt_itm_del_flg"));
			builder.addSelect(itm1.sch_flg.as("sch_flg"));
			rslt.addBooleanColumn("inpt_itm_add_flg");
			rslt.addBooleanColumn("inpt_itm_del_flg");
			rslt.addBooleanColumn("sch_flg");

		}
		protected <R extends MCDBContainer> void dbcCustomizeBpItm(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_BP_R bp1 = MAM_BP_R.create("BP1");
			
			builder.addSelect(bp1.sppl_flg);
			rslt.addBooleanColumn("sppl_flg");
			builder.addSelect(bp1.cst_flg);
			rslt.addBooleanColumn("cst_flg");

		}
		protected <R extends MCDBContainer> void dbcCustomizeItmStrLn(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R locgrp1 = MAM_LOC_GRP_R.create("LOCGRP1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_STR_LN_R.$LOC1);
			
			rslt.addBooleanColumn(MAM_LOC_R.$str_ln_tgt_flg);
			builder.addSelect(loc1.str_ln_tgt_flg);
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(loc1.loc_grp_cd);
			builder.addSelect(locgrp1.loc_grp_nm);
		
			/* DAC対応 */
			MAM_ITM_STR_LN_R t = MAM_ITM_STR_LN_R.create(builder.getBaseDbcAlias());
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.gr_loc_cd.eq(S1RD_LOC1.loc_cd) )));
			
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addLeftOuterJoin(locgrp1, loc1.loc_grp_cd.eq(locgrp1.loc_grp_cd));

		}
		@Override
		protected void down_SELECT_SUB04_c4_0(Srch01_Rslt4R r_dest, MAM_BOM_R r_src) {
			super.down_SELECT_SUB04_c4_0(r_dest, r_src);

			if (isNull(r_src.chd_itm_cd())) {
				r_dest.chd_dec_place(Srch01_Rslt4R.chd_rqmt_qty_META.scale());
			}
			else {
				r_dest.chd_dec_place(r_src.getNumberNE("chd_dec_place"));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 製造品関連の登録を行います。<br>
	 */
	public class Upd01 extends MABSL_MfgItmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void updDbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.updDbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM_COM_R) {
				updDbcCustomizeItm(builder, rslt);
			}
		}
		protected <R extends MCDBContainer> void updDbcCustomizeItm(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_ITM_COM_R t = MAM_ITM_COM_R.create(builder.getBaseDbcAlias());
			// 製造設定済ＦＬＧのみ更新
			builder.setSet(t.mfg_input_flg);
			// キーの会社ＣＤはここで設定
			rslt.setString(MAM_ITM_COM_R.$co_cd, getCo().co_cd());

		}
	}

	//FMCB CUSTOM END
}