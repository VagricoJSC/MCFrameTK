package mcframe.serverMSBC.MSBCL0220;

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
import mcframe.serverMSBC.MSBCL0220.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0220.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MrpLogSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MrpLogSrch_MC extends MSBCL_MrpLogSrch_MC_A{
	//FMCB CUSTOM START

	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 所要量計算ログの検索を行います。<br>
	 */
	public class Srch01 extends MSBCL_MrpLogSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			searchForDL(MSBCL0220_MST_MRP_LOG_S01(), up0(), down0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 所要量計算ログの削除を行います。<br>
	 */
	public class Del01 extends MSBCL_MrpLogSrch_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk01();
			throwCanErr();
			
			deleteLog();
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MrpLogSrch.Chk01 ope = MSBCL_MrpLogSrch.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			//up0().setAll(ope.down0());
		}

		/**
		 * 削除処理を実行する
		 */
		protected void deleteLog() {
			up0().sort(Srch01_RsltR.$wg_cd, Srch01_RsltR.$mrp_calc_no, Srch01_RsltR.$seq_no);
			MST_MRP_LOG_R dbc = MST_MRP_LOG_R.create("T");
			execDbDeleteKey("MSBCL0220_MST_MRP_LOG_D01", dbc, up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 所要量計算ログの削除前チェックを行います。<br>
	 */
	public class Chk01 extends MSBCL_MrpLogSrch_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0(), MCRow.Status.MODIFY);
			for (Chk01_RsltR r : notErrL) {
				msgL.addAll(checkWritableWgCdDac(r, Chk01_RsltR.$wg_cd));
			}
			return msgL;
		}
	}

	//FMCB CUSTOM END
}