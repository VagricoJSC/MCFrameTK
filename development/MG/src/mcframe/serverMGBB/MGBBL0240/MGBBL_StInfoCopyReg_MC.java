package mcframe.serverMGBB.MGBBL0240;

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
import mcframe.serverMGBB.MGBBL0240.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0170.FXUCL_AtLeastOneValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_StInfoCopyReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_StInfoCopyReg_MC extends MGBBL_StInfoCopyReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月初情報をコピーするために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBBL_StInfoCopyReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();
			ml.addAll(chkSub());
			return ml;
		}

		protected MCMessageList chkSub() {
			MCMessageList ml = super.doServerCheckSub();
			checkSame(ml);
			FXUCL_AtLeastOneValidater loiv = new FXUCL_AtLeastOneValidater();
			ml.addAll(check(up0(), new String[]{CndR.$stk_flg, CndR.$wip_flg}, loiv));
			return ml;
		}

		/**
		 * コピー元の値とコピー先の値が同一の場合にはエラーメッセージを返す。
		 * @param msgList
		 */
		protected void checkSame(MCMessageList msgList) {
			String calcGrpFr = up0().calc_grp_cd_fr();
			String calcGrpTo = up0().calc_grp_cd_to();
			MCDate ymFr = up0().ym_fr();
			MCDate ymTo = up0().ym_to();
			if (isSame(calcGrpFr, calcGrpTo) && isSame(ymFr, ymTo)
					&& !isNullAnd(calcGrpFr, calcGrpTo, ymFr, ymTo)) {
				msgList.add(new MCMessage(MGBBL0022));
			}
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 月初情報をコピーする。<br>
	 */
	public class Ins01 extends MGBBL_StInfoCopyReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initBatchLogger(dbTran());
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
			editUp();
			callThisChk();
			throwErr(msgOpeErr());
			execCopySt();
		}

		/**
		 * 上り電文編集
		 */
		protected void editUp() {

		}

		/**
		 * チェック実行
		 */
		protected void callThisChk() {
			MGBBL_StInfoCopyReg.Chk01 ope = MGBBL_StInfoCopyReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		/**
		 * コピー
		 */
		protected void execCopySt() {
			String procId = "MGPA_COPY_ST$P_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null,
					":calc_grp_cd_fr, " +
					":ym_fr, " +
					":calc_grp_cd_to, " +
					":ym_to, " +
					":stk_flg, " +
					":wip_flg, " +
					":lot_no_flg, " +
					":sublot_no_flg, " +
					":sno1_flg, " +
					":sno2_flg, " +
					":sno3_flg, " +
					":sno4_flg, " +
					":bp_flg, " +
					":asst_flg, " +
					":del_flg");
		}

	}

	//FMCB CUSTOM END
}