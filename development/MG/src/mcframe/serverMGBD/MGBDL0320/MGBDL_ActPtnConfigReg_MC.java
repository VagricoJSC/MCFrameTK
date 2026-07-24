package mcframe.serverMGBD.MGBDL0320;

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
import mcframe.serverMGBD.MGBDL0320.*; // このimportはFrameManagerの自動生成で追加されました。

import static mcframe.serverMGBD.MGBDL0320.Query.*;

import java.util.*;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ActPtnConfigReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ActPtnConfigReg_MC extends MGBDL_ActPtnConfigReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 計算実行パタン構成を検索する。<br>
	 */
	public class Srch01 extends MGBDL_ActPtnConfigReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchActPtnConfig();
		}

		protected void srchActPtnConfig() {
			executeQuery(down0(), MGBDL0320_MGT_ACT_PTN_CONFIG_S01(), up0());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 計算実行パタン構成を登録・訂正するために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBDL_ActPtnConfigReg_MC_A.Chk01 {

		protected Boolean _stYmErrFlg = false;

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
			MCList<MGT_ACT_PTN_CONFIG_R> selectL = MCList.create(MGT_ACT_PTN_CONFIG_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ACT_PTN_CONFIG_R.create("T"));

			// ファイル入力の場合はロックを取得しない
			if (up1().file_imp_flg()) {
				selectPkWk("MGBDL0320_MGT_ACT_PTN_CONFIG_S01", selectL, selectL_bldr.getBaseDbc(), notErrL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBDL0320_MGT_ACT_PTN_CONFIG_S02", selectL, selectL_bldr.getBaseDbc(), notErrL);
			}

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxKey = selectL.createIndex(keys);

			for (Chk01_RsltR rsltR : notErrL) {
				Comparable<?>[] binds = rsltR.toArray(keys);
				MGT_ACT_PTN_CONFIG_R selectR = selectL.getFirst(idxKey, binds);

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
			MCList<Chk01_RsltR> up = getChkList(up0());
			up.forEach(upR -> chkSub(msgL, upR));

			return msgL;
		}

		protected void chkSub(MCMessageList msgL, Chk01_RsltR rsltR) {
			chkBeforeAfter(msgL, rsltR);
			chkStYmIntervalYm(msgL, rsltR);

			if (!_stYmErrFlg) {
				chkEndYmIntervalYm(msgL, rsltR);
			}
		}

		/**
		 * 日付関連の前後チェックを行う。
		 * @param msgL
		 * @param rsltR
		 */
		protected void chkBeforeAfter(MCMessageList msgL, Chk01_RsltR rsltR) {
			FXUCL_RequiredValidater rv = new FXUCL_RequiredValidater();

			if (isNull(rsltR.term())) {
				msgL.addAll(check(rsltR, Chk01_RsltR.$term, rv));
			}

			if (isNull(rsltR.term_end_ym())) {
				msgL.addAll(check(rsltR, Chk01_RsltR.$term_end_ym, rv));
			}

			if (isNull(rsltR.st_ym())) {
				msgL.addAll(check(rsltR, Chk01_RsltR.$st_ym, rv));
			}

			if (isNull(rsltR.end_ym())) {
				msgL.addAll(check(rsltR, Chk01_RsltR.$end_ym, rv));
			}

			// 期 <= 計算対象先頭月 <= 期終了年月
			if (!isNullOr(rsltR.term(), rsltR.st_ym(), rsltR.term_end_ym())) {
				msgL.addAll(chkBeforeAfterByValidater(rsltR, Chk01_RsltR.$term,
						Chk01_RsltR.$st_ym, Chk01_RsltR.$term_end_ym));
			}

			// 期 <= 計算対象末尾月 <= 期終了年月
			if (!isNullOr(rsltR.term(), rsltR.end_ym(), rsltR.term_end_ym())) {
				msgL.addAll(chkBeforeAfterByValidater(rsltR, Chk01_RsltR.$term,
						Chk01_RsltR.$end_ym, Chk01_RsltR.$term_end_ym));
			}
		}

		protected MCMessageList chkBeforeAfterByValidater(Chk01_RsltR rsltR,
				String before, String tgt, String after) {
			MCMessageList msgL = new MCMessageList();
			String[] compCols = new String[] {
					before, tgt, after
			};

			msgL.addAll(check(rsltR, compCols, new FXUCL_BeforeAfterValidater()));

			return msgL;
		}

		protected MCMessageList chkStYmIntervalYm(MCMessageList msgL, Chk01_RsltR rsltR) {
			ArrayList<MCDate> stYmL = new ArrayList<MCDate>();
			ArrayList<String> stYmStrL = new ArrayList<String>();

			MCDate stYm = rsltR.st_ym();
			MCDate term = rsltR.term();
			MCDate termEndYm = rsltR.term_end_ym();
			MCDate currentYm = term;
			MCNumber maxMons = rsltR.max_mons();

			if (isNullOr(stYm, term, termEndYm, maxMons)) {
				return msgL;
			}

			while (true) {
				if (currentYm.gte(termEndYm)) {
					break;
				}

				stYmL.add(currentYm);

				if (maxMons.isZero()) {
					currentYm = currentYm.addMonth(MCNumber.ONE);
				}
				else {
					currentYm = currentYm.addMonth(maxMons);
				}
			}

			if (!stYmL.contains(stYm)) {
				_stYmErrFlg = true;
				setYmToStr(stYmL, stYmStrL);

				msgL.add(new MCMessage(rsltR, Chk01_RsltR.$st_ym, MGBDL0029, stYmStrL,
						toDispGUIIndex(rsltR)));
			}

			return msgL;
		}

		protected MCMessageList chkEndYmIntervalYm(MCMessageList msgL,
				Chk01_RsltR rsltR) {
			ArrayList<MCDate> endYmL = new ArrayList<MCDate>();
			ArrayList<String> endYmStrL = new ArrayList<String>();

			MCDate stYm = rsltR.st_ym();
			MCDate endYm = rsltR.end_ym();
			MCDate termEndYm = rsltR.term_end_ym();
			MCDate currentYm = stYm;
			MCNumber maxMons = rsltR.max_mons();

			if (isNullOr(stYm, endYm, termEndYm, maxMons)) {
				return msgL;
			}

			while (true) {
				if (maxMons.isZero()) {
					if (currentYm.gte(termEndYm)) {
						break;
					}
				}
				else {
					if (currentYm.gte(stYm.addMonth(maxMons))) {
						break;
					}
				}

				endYmL.add(currentYm);
				currentYm = currentYm.addMonth(MCNumber.ONE);
			}

			if (!endYmL.contains(endYm)) {
				setYmToStr(endYmL, endYmStrL);

				msgL.add(new MCMessage(rsltR, Chk01_RsltR.$end_ym, MGBDL0030, endYmStrL,
						toDispGUIIndex(rsltR)));
			}

			return msgL;
		}

		protected ArrayList<String> setYmToStr(ArrayList<MCDate> frList,
				ArrayList<String> toList) {
			frList.forEach(frYm -> toList.add(toYMString(frYm)));

			return toList;
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
	 * 計算実行パタン構成を削除するために、チェックを行う。<br>
	 */
	public class Chk02 extends MGBDL_ActPtnConfigReg_MC_A.Chk02 {

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

			// ロック取得
			MCList<MGT_ACT_PTN_CONFIG_R> selectL = MCList
					.create(MGT_ACT_PTN_CONFIG_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ACT_PTN_CONFIG_R.create("T"));
			selectForUpdateNoWaitPkWk("MGBDL0320_MGT_ACT_PTN_CONFIG_S03", selectL, selectL_bldr.getBaseDbc(), notErrL);

			String[] keys = selectL_bldr.getBaseDbc().getKeyColumn();
			MCIndexKey idxKey = selectL.createIndex(keys);

			for (Chk02_RsltR rsltR : notErrL) {
				Comparable<?>[] binds = rsltR.toArray(keys);
				MGT_ACT_PTN_CONFIG_R selectR = selectL.getFirst(idxKey, binds);

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
	 * 計算実行パタン構成を登録、訂正する。<br>
	 */
	public class Upd01 extends MGBDL_ActPtnConfigReg_MC_A.Upd01 {
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
			MGBDL_ActPtnConfigReg.Chk01 ope = MGBDL_ActPtnConfigReg.crtChk01();

			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<MGT_ACT_PTN_CONFIG_R> dbcL = MCList.create(MGT_ACT_PTN_CONFIG_R.class);

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
	 * 計算実行パタン構成を削除する。<br>
	 */
	public class Del01 extends MGBDL_ActPtnConfigReg_MC_A.Del01 {
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
			MGBDL_ActPtnConfigReg.Chk02 ope = MGBDL_ActPtnConfigReg.crtChk02();

			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<MGT_ACT_PTN_CONFIG_R> dbcL = MCList.create(MGT_ACT_PTN_CONFIG_R.class);

			//バッチ削除
			notErrL.forEach(r -> dbcL.add(r.dbc()));

			dbDeleteKey("MGBDL0320_MGT_ACT_PTN_CONFIG_D01", dbcL, MCQueryApiBuilder.create(MGT_ACT_PTN_CONFIG_R.create("T")));
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
	 * ファイルから取り込んだ計算実行パタン構成情報のチェック処理を行う。<br>
	 */
	public class Imp01 extends MGBDL_ActPtnConfigReg_MC_A.Imp01 {

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
			MGBDL_ActPtnConfigReg.Chk01 ope = MGBDL_ActPtnConfigReg.crtChk01();

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