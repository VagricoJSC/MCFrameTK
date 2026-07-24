package mcframe.serverMABS.MABSL1120;

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
import mcframe.serverMABS.MABSL0640.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0820.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL0830.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABS.MABSL1120.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABSL_SlsItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABSL_SlsItmReg_MC extends MABSL_SlsItmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 販売品関連の検索を行います。<br>
	 */
	public class Srch01 extends MABSL_SlsItmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_ITM__R) {
				dbcCustomizeItm(builder);
			}
			if(builder.getBaseDbc() instanceof MAM_SPLN_ITM_CONF_R){
				dbcCustomizeSpln(builder);
			}
			if (builder.getBaseDbc() instanceof MAM_DMND_DIV_R) {
				dbcCustomizeDmndDiv(builder);
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

		protected void dbcCustomizeSpln(MCQueryApiBuilder builder) {
			MAVM_ITM_UNIT_R itm_unit1 = MAVM_ITM_UNIT_R.create("ITM_UNIT1");
			MAM_SPLN_ITM_CONF_R t = MAM_SPLN_ITM_CONF_R.create(builder.getBaseDbcAlias());

			builder.addSelect(itm_unit1.dec_place);
			builder.addLeftOuterJoin(itm_unit1, t.itm_cd.eq(itm_unit1.itm_cd)
					.and(t.itm_sub1.eq(itm_unit1.itm_sub1))
					.and(t.itm_sub2.eq(itm_unit1.itm_sub2))
					.and(t.itm_sub3.eq(itm_unit1.itm_sub3))
					.and(t.upri_unit_cd.eq(itm_unit1.unit_cd)));
			
			builder.addWhereWithCutOffAnd(t.st_ym.gte(bind(Srch01_CndR.$st_dt_fr)));
			builder.addWhereWithCutOffAnd(t.st_ym.lte(bind(Srch01_CndR.$st_dt_to)));
			builder.addWhereWithCutOffAnd(t.end_ym.gte(bind(Srch01_CndR.$end_dt_fr)));
			builder.addWhereWithCutOffAnd(t.end_ym.lte(bind(Srch01_CndR.$end_dt_to)));
		}

		protected void dbcCustomizeDmndDiv(MCQueryApiBuilder builder) {
			MAM_DPT_R dpt1 = MAM_DPT_R.create("DPT1");
			MAM_DMND_DIV_R t = MAM_DMND_DIV_R.create(builder.getBaseDbcAlias());

			builder.addSelect(dpt1.dpt_nm.as("sls_dpt_nm"));
			builder.addLeftOuterJoin(dpt1, dpt1.dpt_cd.eq(t.sls_dpt_cd)
					.and(dpt1.st_dt.lte(t.st_dt))
					.and(dpt1.end_dt.gte(t.st_dt)));
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
			MAVM_RD_LOC_R S1RD_LOC1 = MAVM_RD_LOC_R.create("RD_LOC1");
			MAM_ITM_STR_LN_R t =  MAM_ITM_STR_LN_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithAnd(exists( subQuery() .select(S1RD_LOC1.prAll())
					.from(S1RD_LOC1) .where( t.gr_loc_cd.eq(S1RD_LOC1.loc_cd) )));
			
			builder.addLeftOuterJoin(wg1, loc1.wg_cd.eq(wg1.wg_cd));
			builder.addLeftOuterJoin(locgrp1, loc1.loc_grp_cd.eq(locgrp1.loc_grp_cd));

		}

		protected <R extends MCDBContainer> void dbcCustomizeBpItm(MCQueryApiBuilder builder, MCList<R> rslt) {
			
			MAM_BP_R bp1 = MAM_BP_R.create("BP1");
			
			rslt.addBooleanColumn("sppl_flg");
			builder.addSelect(bp1.sppl_flg);
			builder.addSelect(bp1.cst_flg);
			rslt.addBooleanColumn("cst_flg");

		}
		

		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_ITM__R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);
			r_dest.unit_nm(r_src.getStringNE("unit_nm"));
		}
		
		@Override
		protected void down_SELECT_SUB1_c1_0(Srch01_Rslt2R r_dest, MAM_SPLN_ITM_CONF_R r_src) {
			super.down_SELECT_SUB1_c1_0(r_dest, r_src);
			r_dest.dec_place(r_src.getNumberNE("dec_place"));
		}
		
		@Override
		protected void down_SELECT_SUB2_c2_0(Srch01_Rslt3R r_dest, MAM_DMND_DIV_R r_src) {
			super.down_SELECT_SUB2_c2_0(r_dest, r_src);
			r_dest.sls_dpt_nm(r_src.getStringNE("sls_dpt_nm"));
		}
		
		@Override
		protected void down_SELECT_SUB3_c3_0(Srch01_Rslt4R r_dest, MAM_BP_ITM_R r_src) {
			super.down_SELECT_SUB3_c3_0(r_dest, r_src);
			r_dest.sppl_flg(r_src.getBooleanNE("sppl_flg"));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 販売品関連の登録を行います。<br>
	 */
	public class Upd01 extends MABSL_SlsItmReg_MC_A.Upd01 {
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
			
			// 販売設定済ＦＬＧのみ更新
			builder.setSet(t.sls_input_flg);
			// キーの会社ＣＤはここで設定
			rslt.setString(MAM_ITM_COM_R.$co_cd, getCo().co_cd());

		}
	}

	//FMCB CUSTOM END
}