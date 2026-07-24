package mcframe.serverMGBG.MGBGL5200;

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
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBG.MGBGL5200.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PreAlcRateService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PreAlcRateService_MC extends MGBGL_PreAlcRateService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PreAlcRate_Chk01オペレーション.<p>
	 *
	 * 一次配賦比率作成前チェック<br>
	 */
	public class PreAlcRate_Chk01 extends MGBGL_PreAlcRateService_MC_A.PreAlcRate_Chk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * PreAlcRate_Upd01オペレーション.<p>
	 *
	 * 一次配賦比率を作成する。<br>
	 */
	public class PreAlcRate_Upd01 extends MGBGL_PreAlcRateService_MC_A.PreAlcRate_Upd01 {

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

		protected void execMain(){
			callThisChk();
			throwErr(msgOpeErr());
			execPreRate();
		}

		protected void callThisChk() {
			MGBGL_PreAlcRateService.PreAlcRate_Chk01 ope = MGBGL_PreAlcRateService.crtPreAlcRate_Chk01();
			ope.up0().addAll(up0());
			ope.exec();
		}

		protected void execPreRate() {
			for (PreAlcRate_Chk01_DtlR  dtl : up0()) {
				String procId = "MGPA_PRE_RATE$P_MAIN";
				execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, dtl, null,
						":sa_typ, :ym, :ym_fr, :ym_to, :wg_cd, :calc_ctg_cd, :pre_alc_rate_cd");
			}
		}
	
	}

	//FMCB CUSTOM END
}