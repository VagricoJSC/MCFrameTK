package mcframe.serverMABC.MABCL0160;

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
import mcframe.serverMABC.MABCL0160.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.dbc.CoreFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BatchPushNtcReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BatchPushNtcReg_MC extends MABCL_BatchPushNtcReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * BatchPushNtc_UpdChk01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの登録前のチェックを行います。<br>
	 */
	public class BatchPushNtc_UpdChk01 extends MABCL_BatchPushNtcReg_MC_A.BatchPushNtc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BatchPushNtc_Upd01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの登録を行います。<br>
	 */
	public class BatchPushNtc_Upd01 extends MABCL_BatchPushNtcReg_MC_A.BatchPushNtc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BatchPushNtc_DelChk01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの削除前のチェックを行います。<br>
	 */
	public class BatchPushNtc_DelChk01 extends MABCL_BatchPushNtcReg_MC_A.BatchPushNtc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * BatchPushNtc_Del01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの削除前のチェックを行います。<br>
	 */
	public class BatchPushNtc_Del01 extends MABCL_BatchPushNtcReg_MC_A.BatchPushNtc_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BatchPushNtcReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder);
		}
	}
	
	protected void dbcCustomizeCommon(MCQueryApiBuilder builder) {
		
		builder.addSelect(FCPA_GP_BATCH_GRP$F_GET_GP_BATCH_GRP_NM1(MAM_BATCH_PUSH_NTC_R.create(builder.getBaseDbcAlias()).gp_batch_grp_cd).as("gp_batch_grp_nm"));
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 登録対象の補正を行います。<br>
	 */
	public class Sprt01 extends MABCL_BatchPushNtcReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			dbcCustomizeCommon(builder);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_BatchPushNtcReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * バッチ通知制御マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_BatchPushNtcReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}