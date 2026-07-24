package mcframe.serverMGBA.MGBAL5020;

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
import mcframe.serverMGBA.MGBAL5020.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBA.MGBAL5020.Query.*;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBAL_PlnRqmtIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBAL_PlnRqmtIfService_MC extends MGBAL_PlnRqmtIfService_MC_A{
	//FMCB CUSTOM START

	/**
	 * PlnRqmtIf_Chk01オペレーション.<p>
	 *
	 * ＳＣＭから月次計画を取り込むために、チェックを行う。<br>
	 */
	public class PlnRqmtIf_Chk01 extends MGBAL_PlnRqmtIfService_MC_A.PlnRqmtIf_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			// 必須チェック
			if (MAC_RQMT_PLN_IMP_TYP.isSIM_RQMT(up0().rqmt_pln_imp_typ())) {
				msgL.addAll(check(up0(), PlnRqmtIf_Chk01_CndR.$sim_mrp_no, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}

	}
	/**
	 * PlnRqmtIf_Upd01オペレーション.<p>
	 *
	 * ＳＣＭから月次計画を取り込む。<br>
	 */
	public class PlnRqmtIf_Upd01 extends MGBAL_PlnRqmtIfService_MC_A.PlnRqmtIf_Upd01 {

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
			callThisPlnRqmtIf_Chk01();
			throwUpdErr();
			impPln();
		}

		/**
		 * 取込用チェック処理を実行する
		 */
		protected void callThisPlnRqmtIf_Chk01() {
			MGBAL_PlnRqmtIfService.PlnRqmtIf_Chk01 ope = MGBAL_PlnRqmtIfService.crtPlnRqmtIf_Chk01();
			MCRow.copyall(ope.up0(), up0());

			ope.exec();
		}

		/** 月次計画取り込み処理 */
		protected void impPln() {
			insWgWork();
			execImpPlnProc();
			delWgWork();
		}

		/** MGW_WGに対象のワーキンググループを設定する */
		protected void insWgWork() {
			delWgWork();
			executeUpdate(MGBAL5020_MGW_WG_I01(), autoCommitDBTran(), up0(), null, null);
		}

		protected void delWgWork() {
			MGW_WG_R S0 = MGW_WG_R.create();
			MCDelete q = sql("MGBAL5020_MGW_WG_D01").delete(S0);
			q.executeUpdate(autoCommitDBTran(), null, null, null);
		}

		/** 月次計画取り込み用プロシージャを実行する */
		protected void execImpPlnProc() {
			String procId = "MGPA_IMP_PLN$P_RQMT";
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null,
					":calc_ctg_cd, :ym_fr, :ym_to, :rqmt_pln_imp_typ, :sim_mrp_no");
		}

	}

	//FMCB CUSTOM END
}