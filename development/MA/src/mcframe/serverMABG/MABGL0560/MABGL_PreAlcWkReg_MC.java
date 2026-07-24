package mcframe.serverMABG.MABGL0560;

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
import mcframe.serverMABG.MABGL0560.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABGL_PreAlcWkReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABGL_PreAlcWkReg_MC extends MABGL_PreAlcWkReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * PreAlcWk_UpdChk01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの登録前のチェックを行います。<br>
	 */
	public class PreAlcWk_UpdChk01 extends MABGL_PreAlcWkReg_MC_A.PreAlcWk_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),PreAlcWk_UpdChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * PreAlcWk_Upd01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの登録を行います。<br>
	 */
	public class PreAlcWk_Upd01 extends MABGL_PreAlcWkReg_MC_A.PreAlcWk_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcWk_DelChk01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの削除前のチェックを行います。<br>
	 */
	public class PreAlcWk_DelChk01 extends MABGL_PreAlcWkReg_MC_A.PreAlcWk_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgLst = super.doServerCheckBase();
			
			msgLst.addAll(checkWritableWgCdDac(up0(),PreAlcWk_DelChk01_DtlR.$wg_cd));
			return msgLst;
		}
	}
	/**
	 * PreAlcWk_Del01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの削除を行います。<br>
	 */
	public class PreAlcWk_Del01 extends MABGL_PreAlcWkReg_MC_A.PreAlcWk_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABGL_PreAlcWkReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(
				MCQueryApiBuilder builder, MCList<R>rslt) {
			super.dbcCustomize(builder,rslt);
			if(builder.getBaseDbc() instanceof MAM_PRE_ALC_WK_R){
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_PRE_ALC_WK_R t = MAM_PRE_ALC_WK_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(t.term.lte(bind(Srch01_CndR.$term_to)));
			
			MAVM_RD_WG_R S1WG2 = MAVM_RD_WG_R.create("WG2");
			builder.addWhereWithAnd(exists( subQuery() .select(S1WG2.prAll()) .from(S1WG2)
					.where( value(0).eq(value(0))
							.and(t.wg_cd.eq(S1WG2.wg_cd)) )));
		}
		
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABGL_PreAlcWkReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 一次配賦基準工数マスタの削除を行います。<br>
	 */
	public class Del01 extends MABGL_PreAlcWkReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}