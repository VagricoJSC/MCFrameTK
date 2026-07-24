package mcframe.serverMGBD.MGBDL0340;

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
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBD.MGBDL0340.*; // このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverMGBD.MGBDL0340.Query.*;

import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ParmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ParmReg_MC extends MGBDL_ParmReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算パラメータを検索する。<br>
	 */
	public class Srch01 extends MGBDL_ParmReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchCalcParam();
		}

		protected void srchCalcParam() {
			executeQuery(down0(), MGBDL0340_MGT_PARM_S01(), up0());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価計算パラメータを登録・訂正するために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBDL_ParmReg_MC_A.Chk01 {
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

			// ロック取得(ファイル取り込みの場合はロックしない)
			MCList<MGT_PARM_R> selectL = MCList.create(MGT_PARM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PARM_R.create("T"));

			// ファイル入力の場合はロックを取得しない
			if (up1().file_imp_flg()) {
				selectPkWk("MGBDL0340_MGT_PARM_S01",selectL, selectL_bldr.getBaseDbc(), notErrL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBDL0340_MGT_PARM_S02", selectL, selectL_bldr.getBaseDbc(), notErrL);
			}

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxKey = selectL.createIndex(keys);

			for (Chk01_RsltR rsltR : notErrL) {
				Comparable<?>[] binds = rsltR.toArray(keys);
				MGT_PARM_R selectR = selectL.getFirst(idxKey, binds);

				// 更新カウンタチェック(ファイル入力、ファイル取込の場合は存在チェック)
				if (isNull(selectR)) {
					if (up1().file_imp_flg()) {
						rsltR.setStatus(MCRow.CREATE);
					}
					else {
						if (rsltR.isStatusModify()) {
							msgL.addAll(
									getRecordNotFoundMsg(getModuleID(), selectL.createRow(), rsltR));
						}
					}
				}
				else {
					selectR.setAttributes(rsltR);

					if (up1().file_imp_flg()) {
						rsltR.setStatus(MCRow.MODIFY);
						rsltR.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (rsltR.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(rsltR, Chk01_RsltR.$upd_cntr,
									selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), rsltR));
						}
					}
				}
			}

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
	 * 原価計算パラメータを削除するために、チェックを行う。<br>
	 */
	public class Chk02 extends MGBDL_ParmReg_MC_A.Chk02 {
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
			MCList<Chk02_RsltR> chkL = getChkList(up0());

			if (chkL.isEmpty()) {
				return msgL;
			}

			// ロック取得
			MCList<MGT_PARM_R> selectL = MCList.create(MGT_PARM_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_PARM_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0340_MGT_PARM_S03", selectL, selectL_bldr.getBaseDbc(), chkL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxKey = selectL.createIndex(keys);

			for (Chk02_RsltR rsltR : chkL) {
				Comparable<?>[] binds = rsltR.toArray(keys);
				MGT_PARM_R selectR = selectL.getFirst(idxKey, binds);

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), rsltR));
				}
				else {
					selectR.setAttributes(rsltR);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(rsltR, Chk02_RsltR.$upd_cntr, selectR));
				}
			}

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
	 * 原価計算パラメータを登録、訂正する。<br>
	 */
	public class Upd01 extends MGBDL_ParmReg_MC_A.Upd01 {
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
			MGBDL_ParmReg.Chk01 ope = MGBDL_ParmReg.crtChk01();

			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<MGT_PARM_R> dbcL = MCList.create(MGT_PARM_R.class);

			//ステータスに応じて挿入・更新
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbUpdByStatus(dbcL);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価計算パラメータを削除する。<br>
	 */
	public class Del01 extends MGBDL_ParmReg_MC_A.Del01 {
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

		/** 削除用チェック処理を実行する */
		protected void callThisChk02() {
			MGBDL_ParmReg.Chk02 ope = MGBDL_ParmReg.crtChk02();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<MGT_PARM_R> dbcL = MCList.create(MGT_PARM_R.class);

			//バッチ削除
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBDL0340_MGT_PARM_D01", dbcL, MCQueryApiBuilder.create(MGT_PARM_R.create("T")));
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ原価計算パラメータ情報のチェック処理を行う。<br>
	 */
	public class Imp01 extends MGBDL_ParmReg_MC_A.Imp01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}

		/** 上り電文編集 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * 更新用チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_ParmReg.Chk01 ope = MGBDL_ParmReg.crtChk01();

			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();

			up0().setAll(ope.down0());
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