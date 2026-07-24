package mcframe.serverMABS.MABSL1110;

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
import mcframe.serverMABS.MABSL1110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0150.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0530.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0780.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0800.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_PurcItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_PurcItmReg_MC extends MABSL_PurcItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買品関連の検索を行います。<br>
	 */
	public class Srch01 extends MABSL_PurcItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		protected String _grp;
		
		@Override
		protected void doIt(String grp) {
			_grp = grp;
			super.doIt(grp);
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder,MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_ITM__R) {
				dbcCustomizeItm(builder);
			}
			if (builder.getBaseDbc() instanceof MAM_ITM_DTL__R) {
				dbcCustomizeItmDtl(builder);
			}
			if (builder.getBaseDbc() instanceof MAM_ITM_STRG_R) {
				dbcCustomizeItmStrg(builder);
			}
			if (builder.getBaseDbc() instanceof MAM_ALLOC_CTL_R) {
				dbcCustomizeAllocCtl(builder);
			}
			if (builder.getBaseDbc() instanceof MAM_STK_RPL_R) {
				dbcCustomizeStkRpl(builder, rslt);
			}
			if (builder.getBaseDbc() instanceof MAM_PURC_DDLV_LT_R) {
				dbcCustomizePurcDdlvLt(builder);
			}
			if (builder.getBaseDbc() instanceof MAM_BP_ITM_R) {
				dbcCustomizeBpItm(builder, rslt);
			}
			if(builder.getBaseDbc() instanceof MAM_ITM_STR_LN_R) {
				dbcCustomizeItmStrLn(builder, rslt);
			}
		}

		protected void dbcCustomizeItm(MCQueryApiBuilder builder) {
			MAM_UNIT_R unit1 = MAM_UNIT_R.create("UNIT1");
			MAM_ITM__R t = MAM_ITM__R.create(builder.getBaseDbcAlias());

			builder.addLeftOuterJoin(unit1, unit1.unit_cd.eq(t.unit_cd));
			builder.addSelect(unit1.unit_nm);

		}

		protected void dbcCustomizeItmDtl(MCQueryApiBuilder builder) {
			MAM_ITM_DTL__R t = MAM_ITM_DTL__R.create(builder.getBaseDbcAlias());

			MAVM_RD_WG_R S1RD_WG1 = MAVM_RD_WG_R.create("RD_WG1");
			builder.addWhereWithAnd(t.wg_cd.eq(value(MAC_STR.NULL_VAL.value()))
					.or( exists( subQuery() .select(S1RD_WG1.prAll()) .from(S1RD_WG1)
							.where( t.wg_cd.eq(S1RD_WG1.wg_cd) ) )));
			// 購買
			if (isSame(_grp, SELECT_SUB1)) {
				builder.addWhereWithAnd(t.sppl_cd.isNotNull()
						.and (t.sppl_cd.neq(value(MAC_STR.NULL_VAL.value()))));
			}
			// ＷＧ間依頼
			else {
				builder.addWhereWithAnd(t.rqst_loc_cd.isNotNull()
						.and(t.rqst_loc_cd.neq(value(MAC_STR.NULL_VAL.value()))));
			}
		}

		protected void dbcCustomizeItmStrg(MCQueryApiBuilder builder) {
			
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_ITM_STRG_R t = MAM_ITM_STRG_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.loc_cd.eq(S1RD_LOC1.loc_cd) )));
			
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R lg1 = MAM_LOC_GRP_R.create("LG1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_STRG_R.$LOC1);
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addLeftOuterJoin(lg1, loc1.loc_grp_cd.eq(lg1.loc_grp_cd));
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(loc1.loc_grp_cd);
			builder.addSelect(lg1.loc_grp_nm);

		}

		protected void dbcCustomizeAllocCtl(MCQueryApiBuilder builder) {
			/* DAC対応 */
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_ALLOC_CTL_R t = MAM_ALLOC_CTL_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.to_loc_cd.eq(S1RD_LOC1.loc_cd) )));
			
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ALLOC_CTL_R.$LOC1);
			MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_ALLOC_CTL_R.$LOC2);
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addSelect(loc1.wg_cd.as("to_wg_cd"));
			builder.addSelect(loc1.lg_grp_cd.as("to_lg_grp_cd"));
			builder.addSelect(wg1.wg_nm.as("to_wg_nm"));
			builder.addSelect(loc2.wg_cd.as("fr_wg_cd"));
			builder.addSelect(loc2.lg_grp_cd.as("fr_lg_grp_cd"));
		}

		protected <R extends MCDBContainer> void dbcCustomizeStkRpl(MCQueryApiBuilder builder, MCList<R> rslt) {
			/* DAC対応 */
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_STK_RPL_R t = MAM_STK_RPL_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(t.loc_cd.eq(value(MAC_STR.NULL_VAL.value()))
					.or( exists( subQuery() .select(S1RD_LOC1.prAll()) .from(S1RD_LOC1)
							.where( t.loc_cd.eq(S1RD_LOC1.loc_cd) ) )));
			
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R locgrp1 = MAM_LOC_GRP_R.create("LOCGRP1");
			MAM_ALLOC_GRP_R allocgrp1 = MAM_ALLOC_GRP_R.create("ALLOCGRP1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC1);
			MAM_LOC_R loc2 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC2);
			MAM_LOC_R loc3 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC3);
			MAM_LOC_R loc4 = MAM_LOC_R.create(MAM_STK_RPL_R.$LOC4);
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
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

		protected  void dbcCustomizePurcDdlvLt(MCQueryApiBuilder builder) {
		}

		protected <R extends MCDBContainer> void dbcCustomizeBpItm(MCQueryApiBuilder builder, MCList<R> rslt) {
			MAM_BP_R bp1 = MAM_BP_R.create("BP1");
			
			rslt.addBooleanColumn("sppl_flg");
			builder.addSelect(bp1.sppl_flg);
			builder.addSelect(bp1.cst_flg);
			rslt.addBooleanColumn("cst_flg");

		}

		protected <R extends MCDBContainer> void dbcCustomizeItmStrLn(MCQueryApiBuilder builder, MCList<R> rslt) {
			rslt.addBooleanColumn(MAM_LOC_R.$str_ln_tgt_flg);
			
			MAM_WG_R wg1 = MAM_WG_R.create("WG1");
			MAM_LOC_GRP_R locgrp1 = MAM_LOC_GRP_R.create("LOCGRP1");
			MAM_LOC_R loc1 = MAM_LOC_R.create(MAM_ITM_STR_LN_R.$LOC1);
			builder.addSelect(loc1.str_ln_tgt_flg);
			builder.addSelect(loc1.wg_cd);
			builder.addSelect(wg1.wg_nm);
			builder.addSelect(loc1.loc_grp_cd);
			builder.addSelect(locgrp1.loc_grp_nm);
			
			/* DAC対応 */
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_ITM_STR_LN_R t = MAM_ITM_STR_LN_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.gr_loc_cd.eq(S1RD_LOC1.loc_cd) )));
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addLeftOuterJoin(locgrp1, loc1.loc_grp_cd.eq(locgrp1.loc_grp_cd));

		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 購買品関連の登録を行います。<br>
	 */
	public class Upd01 extends MABSL_PurcItmReg_MC_A.Upd01 {
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

			// 購買設定済ＦＬＧのみ更新
			builder.setSet(t.purc_input_flg);
			// キーの会社ＣＤはここで設定
			rslt.setString(MAM_ITM_COM_R.$co_cd, getCo().co_cd());

		}
	}

	//FMCB CUSTOM END
}