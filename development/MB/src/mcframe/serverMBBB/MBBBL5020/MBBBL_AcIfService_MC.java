package mcframe.serverMBBB.MBBBL5020;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBB.MBBBL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_AcIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_AcIfService_MC extends MBBBL_AcIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * AcIf_Chk01オペレーション.<p>
	 *
	 * 会計ＩＦデータ取込前チェック<br>
	 */
	public class AcIf_Chk01 extends MBBBL_AcIfService_MC_A.AcIf_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}

	/**
	 * AcIf_Upd01オペレーション.<p>
	 *
	 * 会計ＩＦデータを取り込む。<br>
	 */
	public class AcIf_Upd01 extends MBBBL_AcIfService_MC_A.AcIf_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(null);
				execMain();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			callThisChk01();
			throwUpdErr();
			callProc();
		}

		protected void callThisChk01() {
			MBBBL_AcIfService.AcIf_Chk01 o = MBBBL_AcIfService.crtAcIf_Chk01();
			MCRow.copyall(o.up0(), up0());
			o.exec();
			MCRow.copyall(up0(), o.down0());
		}

		protected void callProc() {
			String procId = "MBPA_IMP_AC$P_MAIN";
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, 
					":ac_ym, :dt_fr, :dt_to, :io_flg, :stk_flg, :rcv_flg, :pay_flg, :schdpay_flg, :note_flg, :rerun_flg, :reget_flg");
		}

	}

	//FMCB CUSTOM END
}