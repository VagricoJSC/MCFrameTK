package mcframe.serverMGBF.MGBFL0230;

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
import mcframe.serverMGBF.MGBFL0230.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBF.MGBFL0230.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_CostReportListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_CostReportListReg_MC extends MGBFL_CostReportListReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポート一覧を検索する。<br>
	 */
	public class Srch01 extends MGBFL_CostReportListReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchReportIo();
		}

		protected void srchReportIo() {
			executeQuery(down0(), MGBFL0230_MAM_CALC_RPT_PTN_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			afterSrch();
			sort();
		}

		protected void afterSrch() {
			MCList<Srch01_RsltR> newList = MCList.create(Srch01_RsltR.create());

			for (Srch01_RsltR rsltR : down0()) {
				// 作成済ＦＬＧの設定
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MGBFL0230_MGT_RPT_S01(), rsltR);
				int cnt = cntR.getNumberNE("cnt").intValue();

				rsltR.made_flg(cnt > 0);

				// 未作成･作成済検索条件によってリストを作り直す。
				if (rsltR.made_flg()) {
					if (up0().made_flg()) {
						newList.add(rsltR);
					}
				}
				else {
					if (up0().unmake_flg()) {
						newList.add(rsltR);
					}
				}
			}

			down0().clear();
			down0().addAll(newList);
		}

		protected void sort() {
			MCSortPolicy sortPolicy = new MCSortPolicy();

			sortPolicy.add(SortType.ASC, Srch01_RsltR.$rpt_ptn_cd);
			sortPolicy.add(SortType.ASC, Srch01_RsltR.$rpt_key_cd);

			down0().sort(sortPolicy);
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価レポート一覧を作成するために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBFL_CostReportListReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chk());

			return msgL;
		}

		/** ロック、更新カウンタチェック */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			if (notErrL.isEmpty()) {
				return msgL;
			}

			// 何もしない

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 何もしない

			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 原価レポート一覧を削除するために、チェックを行う。<br>
	 */
	public class Chk02 extends MGBFL_CostReportListReg_MC_A.Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			msgL.addAll(chk());

			return msgL;
		}

		/** ロック、更新カウンタチェック、更新前データDACチェック */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			if (notErrL.isEmpty()) {
				return msgL;
			}

			// 何もしない

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 何もしない

			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価レポート一覧を作成する。<br>
	 */
	public class Upd01 extends MGBFL_CostReportListReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(autoCommitDBTran());
				writeStartLogWithLogger(null);
				execUpd();
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void setDown() {
			// 何もしない
		}

		protected void execUpd() {
			editUp();
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk01() {
			MGBFL_CostReportListReg.Chk01 ope = MGBFL_CostReportListReg.crtChk01();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			for (Chk01_RsltR up0R : notErrL) {
				make(up0R);
			}
		}

		protected void make(Chk01_RsltR rsltR) {
			String procId = "MGPA_RPT$P_MAIN";
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, rsltR, null,
					":CALC_GRP_CD, :CALC_NO, :RPT_PTN_CD, :RPT_KEY_CD");
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価レポート一覧を削除する。<br>
	 */
	public class Del01 extends MGBFL_CostReportListReg_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();

				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}

		/** 上り電文編集 */
		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk02() {
			MGBFL_CostReportListReg.Chk02 ope = MGBFL_CostReportListReg.crtChk02();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			for (Chk02_RsltR up0R : up0()) {
				del(up0R);
			}
		}

		protected void del(Chk02_RsltR rsltR) {
			executeUpdate(MGBFL0230_MGT_RPT_D01(), rsltR);

			// 競合防止のため、１行ずつコミットする
			dbTran().commit();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	//FMCB CUSTOM END
}