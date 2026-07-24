package mcframe.serverMABG.MABGL0690;

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
import mcframe.serverMABG.MABGL0690.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_CostAcDptMapReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_CostAcDptMapReg_MC extends MABGL_CostAcDptMapReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostAcDptMap_UpdChk01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの登録前のチェックを行います。<br>
	 */
	public class CostAcDptMap_UpdChk01 extends MABGL_CostAcDptMapReg_MC_A.CostAcDptMap_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostAcDptMap_Upd01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの登録を行います。<br>
	 */
	public class CostAcDptMap_Upd01 extends MABGL_CostAcDptMapReg_MC_A.CostAcDptMap_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostAcDptMap_DelChk01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの削除前のチェックを行います。<br>
	 */
	public class CostAcDptMap_DelChk01 extends MABGL_CostAcDptMapReg_MC_A.CostAcDptMap_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostAcDptMap_Del01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの削除を行います。<br>
	 */
	public class CostAcDptMap_Del01 extends MABGL_CostAcDptMapReg_MC_A.CostAcDptMap_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_CostAcDptMapReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(	
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_COST_AC_DPT_MAP_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
		}
	}
	
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R cost_dpt1 = MAM_COST_DPT_R.create("COST_DPT1");
		MAM_AC_DPT_R ac_dpt1 = MAM_AC_DPT_R.create("AC_DPT1");
		MAM_COST_AC_DPT_MAP_R t = MAM_COST_AC_DPT_MAP_R.create(builder.getBaseDbcAlias());

		// 原価部門名、会計部門名
		builder.addSelect(cost_dpt1.dpt_nm);
		builder.addSelect(ac_dpt1.ac_dpt_nm);
		builder.addLeftOuterJoin(term, t.st_dt.gte(term.term)
				.and(t.st_dt.lt(term.term_end_ym)));
		builder.addLeftOuterJoin(cost_dpt1, term.term.eq(cost_dpt1.term)
				.and(t.dpt_cd.eq(cost_dpt1.dpt_cd)));
		builder.addLeftOuterJoin(ac_dpt1, t.ac_dpt_cd.eq(ac_dpt1.ac_dpt_cd)
				.and(t.st_dt.between(ac_dpt1.st_dt, ac_dpt1.end_dt)));	
		builder.addWhereWithCutOffAnd(cost_dpt1.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)));
		builder.addWhereWithCutOffAnd(ac_dpt1.ac_dpt_nm.like(bind(Srch01_CndR.$ac_dpt_nm)));
		
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABGL_CostAcDptMapReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		
		
		protected <R extends MCDBContainer> void dbcCustomize(	
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder,rslt);
				dbcCustomizeCommon(builder);
			}	
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABGL_CostAcDptMapReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価会計部門対応マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_CostAcDptMapReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}