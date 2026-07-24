package mcframe.serverMSBD.MSBDL4010;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBD.MSBDL4010.*;	// このimportはFrameManagerの自動生成で追加されました。
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PoCrctRsnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PoCrctRsnReg_MC extends MSBDL_PoCrctRsnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * PoCrctRsn_UpdChk01オペレーション.<p>
	 *
	 * 発注訂正理由の登録前のチェックを行います。<br>
	 */
	public class PoCrctRsn_UpdChk01 extends MSBDL_PoCrctRsnReg_MC_A.PoCrctRsn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PoCrctRsn_Upd01オペレーション.<p>
	 *
	 * 発注訂正理由の登録を行います。<br>
	 */
	public class PoCrctRsn_Upd01 extends MSBDL_PoCrctRsnReg_MC_A.PoCrctRsn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PoCrctRsn_DelChk01オペレーション.<p>
	 *
	 * 発注訂正理由の削除前のチェックを行います。<br>
	 */
	public class PoCrctRsn_DelChk01 extends MSBDL_PoCrctRsnReg_MC_A.PoCrctRsn_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PoCrctRsn_Del01オペレーション.<p>
	 *
	 */
	public class PoCrctRsn_Del01 extends MSBDL_PoCrctRsnReg_MC_A.PoCrctRsn_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 発注訂正理由の検索を行います。<br>
	 */
	public class Srch01 extends MSBDL_PoCrctRsnReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 発注訂正理由の登録を行います。<br>
	 */
	public class Upd01 extends MSBDL_PoCrctRsnReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBDL_PoCrctRsnReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	//FMCB CUSTOM END
}