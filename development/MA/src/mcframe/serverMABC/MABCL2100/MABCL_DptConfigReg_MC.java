package mcframe.serverMABC.MABCL2100;

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
import mcframe.serverMABC.MABCL2100.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_DptConfigReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_DptConfigReg_MC extends MABCL_DptConfigReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * DptConfig_UpdChk01オペレーション.<p>
	 *
	 * 原価部門構成マスタの登録前のチェックを行います。<br>
	 */
	public class DptConfig_UpdChk01 extends MABCL_DptConfigReg_MC_A.DptConfig_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptConfig_Upd01オペレーション.<p>
	 *
	 * 原価部門構成マスタの登録を行います。<br>
	 */
	public class DptConfig_Upd01 extends MABCL_DptConfigReg_MC_A.DptConfig_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptConfig_DelChk01オペレーション.<p>
	 *
	 * 原価部門構成マスタの削除前のチェックを行います。<br>
	 */
	public class DptConfig_DelChk01 extends MABCL_DptConfigReg_MC_A.DptConfig_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * DptConfig_Del01オペレーション.<p>
	 *
	 * 原価部門構成マスタの削除を行います。<br>
	 */
	public class DptConfig_Del01 extends MABCL_DptConfigReg_MC_A.DptConfig_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価部門構成マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_DptConfigReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_DPT_CONFIG_R){
				dbcCustomizeSub(builder);
			}
		}
		
		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MAM_DPT_CONFIG_R t = MAM_DPT_CONFIG_R.create(builder.getBaseDbcAlias());
			builder.addWhereWithCutOffAnd(t.term.gte(bind("term_fr")));
			builder.addWhereWithCutOffAnd(t.term.lte(bind("term_to")));
			if (up0().oper_null_flg()) {
				builder.addWhereWithCutOffAnd(t.oper_null_flg.eq(value(true)));
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価部門構成マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_DptConfigReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価部門構成マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_DptConfigReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}