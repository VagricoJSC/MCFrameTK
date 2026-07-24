package mcframe.serverMABC.MABCL1540;

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
import mcframe.serverMABC.MABCL1500.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL1540.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_IfAdapterReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_IfAdapterReg_MC extends MABCL_IfAdapterReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * IfAdapter_DelChk01オペレーション.<p>
	 *
	 * ＩＦアダプタマスタを削除する前のチェックを行う<br>
	 */
	public class IfAdapter_DelChk01 extends MABCL_IfAdapterReg_MC_A.IfAdapter_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * IfAdapter_Del01オペレーション.<p>
	 *
	 * ＩＦアダプタマスタを削除する<br>
	 */
	public class IfAdapter_Del01 extends MABCL_IfAdapterReg_MC_A.IfAdapter_Del01 {
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
	public class Srch01 extends MABCL_IfAdapterReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (builder.getBaseDbc() instanceof MAM_IF_ADAPTER_R) {
				dbcCustomizeSub(builder, rslt);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder, MCList<R> rslt) {
			dbcCustomizeCommon(builder, rslt);
		}
	}

	protected <R extends MCDBContainer> void dbcCustomizeCommon(MCQueryApiBuilder builder, MCList<R> result) {
		MAM_EXT_SYS_R extsys = MAM_EXT_SYS_R.create(MAM_IF_ADAPTER_R.$EXT_SYS1);
		MAM_IF_ADAPTER_R t = MAM_IF_ADAPTER_R.create(builder.getBaseDbcAlias());

		// Select
		builder.addSelect(extsys.ext_sys_typ);
		builder.addSelect(extsys.web_api_flg);
		builder.addSelect(extsys.cmd_exec_flg);
		result.addBooleanColumn("web_api_flg");
		result.addBooleanColumn("cmd_exec_flg");

		// Join
		builder.addLeftOuterJoin(extsys, t.ext_sys_cd.eq(extsys.ext_sys_cd));
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_IfAdapterReg_MC_A.Upd01 {
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
	public class Del01 extends MABCL_IfAdapterReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う。<br>
	 */
	public class Sprt01 extends MABCL_IfAdapterReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder, rslt);
		}


	}

	//FMCB CUSTOM END
}