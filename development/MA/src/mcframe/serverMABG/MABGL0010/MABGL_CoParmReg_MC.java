package mcframe.serverMABG.MABGL0010;

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
import mcframe.serverMABG.MABGL0010.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CoParmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CoParmReg_MC extends MABGL_CoParmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CoParm_UpdChk01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの登録前のチェックを行います。<br>
	 */
	public class CoParm_UpdChk01 extends MABGL_CoParmReg_MC_A.CoParm_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoParm_Upd01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの登録を行います。<br>
	 */
	public class CoParm_Upd01 extends MABGL_CoParmReg_MC_A.CoParm_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoParm_DelChk01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの削除前のチェックを行います。<br>
	 */
	public class CoParm_DelChk01 extends MABGL_CoParmReg_MC_A.CoParm_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CoParm_Del01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの削除を行います。<br>
	 */
	public class CoParm_Del01 extends MABGL_CoParmReg_MC_A.CoParm_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CoParmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt)	
	    {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_CO_PARM_R) {
				dbcCustomizeSub(builder);
			}
		}
		@Override
		protected void condCustomize(MCRow cond) {
			super.condCustomize(cond);
			cond.addDateColumn(MAM_COST_DPT_R.$term, up0().this_term());
		}
		/**
		 * 原価部門マスタ・計算カテゴリマスタと結合するためのSQL編集
		 * 
		 * @param dbc
		 */
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			MAM_CO_PARM_R t = MAM_CO_PARM_R.create(builder.getBaseDbcAlias());
			MAM_COST_DPT_R cost_dpt1 = MAM_COST_DPT_R.create("COST_DPT1");
			MAM_COST_DPT_R cost_dpt2 = MAM_COST_DPT_R.create("COST_DPT2");
			MAM_CALC_CTG_R calc_ctg1 = MAM_CALC_CTG_R.create("CALC_CTG1");
			MAM_CALC_CTG_R calc_ctg2 = MAM_CALC_CTG_R.create("CALC_CTG2");	

			builder.addSelect(cost_dpt1.dpt_nm.as("fix_dpt_nm"));
			builder.addSelect(cost_dpt2.dpt_nm.as("tmp_dpt_nm"));
			builder.addSelect((calc_ctg1.calc_ctg_nm.as("def_calc_ctg_nm")));
			builder.addLeftOuterJoin(cost_dpt1, bind("term").eq(cost_dpt1.term)
					.and(cost_dpt1.dpt_cd.eq(t.fix_dpt_cd)));
			builder.addLeftOuterJoin(cost_dpt2, bind("term").eq(cost_dpt2.term)
					.and(cost_dpt2.dpt_cd.eq(t.tmp_dpt_cd)));
			builder.addLeftOuterJoin(calc_ctg1, calc_ctg1.calc_ctg_cd.eq(t.def_calc_ctg_cd));
			builder.addSelect((calc_ctg2.calc_ctg_nm.as("act_trd_calc_ctg_nm")));
			builder.addLeftOuterJoin(calc_ctg2, calc_ctg2.calc_ctg_cd.eq(t.act_trd_calc_ctg_cd));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CoParmReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価会社パラメータマスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CoParmReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}