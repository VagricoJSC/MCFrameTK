package mcframe.serverMABG.MABGL0680;

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
import mcframe.serverMABG.MABGL0680.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_AlcAcImpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_AlcAcImpReg_MC extends MABGL_AlcAcImpReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * AlcAcImp_UpdChk01オペレーション.<p>
	 *
	 * 配賦費用取込マスタの登録前のチェックを行う<br>
	 */
	public class AlcAcImp_UpdChk01 extends MABGL_AlcAcImpReg_MC_A.AlcAcImp_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAcImp_Upd01オペレーション.<p>
	 *
	 * 配賦費用取込マスタを登録する<br>
	 */
	public class AlcAcImp_Upd01 extends MABGL_AlcAcImpReg_MC_A.AlcAcImp_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAcImp_DelChk01オペレーション.<p>
	 *
	 * 配賦費用取込マスタの削除前のチェックを行う<br>
	 */
	public class AlcAcImp_DelChk01 extends MABGL_AlcAcImpReg_MC_A.AlcAcImp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * AlcAcImp_Del01オペレーション.<p>
	 *
	 * 配賦費用取込マスタを削除する<br>
	 */
	public class AlcAcImp_Del01 extends MABGL_AlcAcImpReg_MC_A.AlcAcImp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABGL_AlcAcImpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(	
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_ALC_AC_IMP_R){
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			dbcCustomizeCommon(builder);
		}
	}
	
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		// 原価部門名
		MAM_TERM_R term = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R cost_dpt1 = MAM_COST_DPT_R.create("COST_DPT1");
		MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
		MAM_ALC_AC_IMP_R t = MAM_ALC_AC_IMP_R.create(builder.getBaseDbcAlias());

		builder.addSelect(cost_dpt1.dpt_nm);
		builder.addLeftOuterJoin(term, t.st_dt.gte(term.term)
				.and(t.st_dt.lt(term.term_end_ym)));
		builder.addLeftOuterJoin(cost_dpt1, term.term.eq(cost_dpt1.term)
				.and(t.dpt_cd.eq(cost_dpt1.dpt_cd)));
		builder.addWhereWithCutOffAnd(cost_dpt1.dpt_nm.like(bind(Srch01_CndR.$dpt_nm)));
		builder.addWhereWithAnd(exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
				.where( value(0).eq(value(0))
						.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
		builder.addOrderByAsc(pr("dpt_cd"), pr("alc_ac_cd"), pr("st_dt"));
		
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う<br>
	 */
	public class Sprt01 extends MABGL_AlcAcImpReg_MC_A.Sprt01 {
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
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABGL_AlcAcImpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABGL_AlcAcImpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}