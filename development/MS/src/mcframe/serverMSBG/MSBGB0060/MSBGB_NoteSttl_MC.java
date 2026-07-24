package mcframe.serverMSBG.MSBGB0060;

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
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import static mcframe.serverMSBG.MSBGB0060.Query.*;
import mcframe.serverMSBG.MSBGL5080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGB_NoteSttl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGB_NoteSttl_MC extends MSBGB_NoteSttl_MC_A{
	//FMCB CUSTOM START

	/**
	 * NoteSttl_Upd01オペレーション.<p>
	 *
	 */
	public class NoteSttl_Upd01 extends MSBGB_NoteSttl_MC_A.NoteSttl_Upd01 {

		/** 対象件数 */
		protected int _totalCnt;
		/** 正常終了件数 */
		protected int _successCnt;
		/** エラー件数 */
		protected int _errorCnt;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				initLogger();
				writeStartLog();
				execMain();
			}
			catch (Exception ex) {
				_errorCnt = _totalCnt;
				handleEx(ex);
			}
			finally {
				writeEndLog();
			}
		}

		/**
		 * バッチログを初期化する。
		 */
		protected void initLogger() {
			getLogger();
		}

		/**
		 * 開始ログを出力する。
		 */
		protected void writeStartLog() {
			logger().writeStartLog(MSBGL0110);
			pushStartLog(logger());
		}

		/**
		 * 例外処理
		 *
		 * @param ex
		 */
		protected void handleEx(Exception ex) {
			MCException mcex;
			if (ex instanceof MCException) {
				mcex = (MCException) ex;
			}
			else {
				mcex = new MCException(ex);
			}
			logger().writeProcessLog(mcex);

			throw mcex;
		}

		/**
		 * 終了ログを出力する。
		 */
		protected void writeEndLog() {
			if (_errorCnt > 0) {
				logger().writeProcessLog(MAUDL0009);
				MCMessagePool.add(MAUDL0009);
				pushErrorLog(logger());
			}
			else if (_totalCnt == 0) {
				logger().writeProcessLog(MAUDL0008);
				MCMessagePool.add(MAUDL0008);
			}
			logger().writeEndLog(MSBGL0111, _totalCnt, _successCnt, _errorCnt);
			pushEndLog(logger());
		}

		/**
		 * メイン処理を実行する
		 */
		protected void execMain() {
			_totalCnt = 0;
			_successCnt = 0;
			_errorCnt = 0;

			// 対象日の補完
			if (isNull(up0().tgt_dt())) {
				up0().tgt_dt(getToday());
			}
			else {
				// 対象日の丸め処理
				up0().tgt_dt(up0().tgt_dt().trunc(MCDate.DAY));
			}

			// 処理対象の手形情報を取得
			MCList<NoteSttl_Upd01_NoteR> noteL = getTgtNote();

			if (noteL.isEmpty()) {
				return;
			}

			// 処理対象件数を設定
			_totalCnt = noteL.size();

			// 与信更新用の情報を取得
			MCList<NoteSttl_Upd01_NoteR> credL = getTgtCred(noteL);

			// 与信の更新
			MCList<Cred_Upd01_CndR> cndL = createCred(credL);
			updCred(cndL);

			// 手形の更新
			updNote(noteL);

			// 登録件数を設定
			_successCnt = noteL.size();
		}

		/**
		 * 更新対象の手形を取得しロックする
		 * 
		 * @return 更新対象の手形
		 */
		protected MCList<NoteSttl_Upd01_NoteR> getTgtNote() {
			MCList<NoteSttl_Upd01_NoteR> noteL = MCList.create(NoteSttl_Upd01_NoteR.class);

			NoteSttl_Upd01_NoteR cndR = NoteSttl_Upd01_NoteR.create();
			cndR.addDateColumn("tgt_dt", up0().tgt_dt());

			// 決済処理対象の手形の取得とロック（For UpdateはSQL中に記述）
			executeQuery(noteL, MSBGB0060_MST_NOTE_S01(), cndR);

			return noteL;
		}

		/**
		 * 
		 * @param noteL
		 * @return
		 */
		protected MCList<NoteSttl_Upd01_NoteR> getTgtCred(MCList<NoteSttl_Upd01_NoteR> noteL) {

			MCList<NoteSttl_Upd01_NoteR> retL = MCList.create(NoteSttl_Upd01_NoteR.class);
			for (NoteSttl_Upd01_NoteR noteR : noteL) {
				MCList<MST_RCV_ACT_R> rcvActL = getRcvAct(noteR.note_mng_no());

				for (MST_RCV_ACT_R groupR : rcvActL.groupBy(MST_RCV_ACT_R.$trd_cur_cd, MST_RCV_ACT_R.$cred_cd)) {

					NoteSttl_Upd01_NoteR retR = noteR.clone();

					String[] keys = {MST_RCV_ACT_R.$trd_cur_cd, MST_RCV_ACT_R.$cred_cd};
					String[] vals = {groupR.trd_cur_cd(), groupR.cred_cd()};

					for (MST_RCV_ACT_R rcvR : rcvActL.subList(keys, vals)) {
						// 前受金その他相殺の場合は符号を反転して加算する。
						if (MAC_TRD_PTN_TYP.isSETOFF_ADV_OTH(rcvR.trd_ptn_typ())) {
							retR.ar_sttl_amt(nvl(retR.ar_sttl_amt(), MCNumber.ZERO).add(rcvR.trd_cur_amt().negate()));
						}
						else {
							retR.ar_sttl_amt(nvl(retR.ar_sttl_amt(), MCNumber.ZERO).add(rcvR.trd_cur_amt()));
						}
					}
					// 手形管理ＮＯで検索した情報をグルーピングして処理
					// 通貨ＣＤ、請求先は同じなので、リストの１件目から取得して設定する
					retR.cur_cd(groupR.trd_cur_cd());
					retR.cred_cd(groupR.getString("cred_cd"));
					retL.add(retR);
				}
			}
			// 与信管理先ＣＤ、通貨ＣＤで並び替える
			retL.sort(NoteSttl_Upd01_NoteR.$cred_cd, NoteSttl_Upd01_NoteR.$cur_cd);
			return retL;
		}

		/**
		 * 入金実績情報の取得
		 * 
		 * @param noteMngNo 手形管理ＮＯ
		 * @return 入金実績情報
		 */
		protected MCList<MST_RCV_ACT_R> getRcvAct(String noteMngNo) {
			MCList<MST_RCV_ACT_R> rcvActL = MCList.create(MST_RCV_ACT_R.class);
			MST_RCV_ACT_R t1 = MST_RCV_ACT_R.create("T");
			MST_RCV_ACT_D_R t2 = MST_RCV_ACT_D_R.create("T2");
			MCQueryApiBuilder rcvActL_bldr = MCQueryApiBuilder.create(t1);
			rcvActL_bldr.setSelect(t1.trd_cur_cd);
			rcvActL_bldr.addSelect(t1.trd_ptn_typ);
			rcvActL_bldr.addSelect(t2.trd_cur_amt1.add(t2.trd_cur_amt2).add(t2.trd_cur_amt3).as("trd_cur_amt"));
			rcvActL_bldr.addSelect(MAPA_BP$F_GET_CRED_OF_BCST( nvl( t2.bcst_cd, t1.bcst_cd )).as("cred_cd"));
			rcvActL_bldr.addInnerJoin(t2, bracket( t1.rcv_act_no.eq(t2.rcv_act_no)
					.and(t1.rcv_act_seq.eq(t2.rcv_act_seq))));
			rcvActL_bldr.setWhere(t1.note_mng_no.eq(bind("1")), noteMngNo);
			rcvActL_bldr.addWhereWithAnd(t1.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			rcvActL_bldr.addWhereWithAnd(t1.trd_ptn_typ.in( value(MAC_TRD_PTN_TYP.RCV_ADV.value()), value(MAC_TRD_PTN_TYP.RCV_AR.value()), value(MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.value()), value(MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.value()), value(MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.value())));
			dbSelect("MSBGB0060_MST_RCV_ACT_S01", rcvActL, rcvActL_bldr);
			return rcvActL;
		}

		/**
		 * 与信の更新条件を設定する<br>
		 * 手形の決済額を与信管理先、通貨毎に集計する
		 * 
		 * @param noteL 手形情報
		 * @return 与信の更新条件
		 */
		protected MCList<Cred_Upd01_CndR> createCred(MCList<NoteSttl_Upd01_NoteR> noteL) { 

			int cnt = -1;
			MCList<Cred_Upd01_CndR> cndL = MCList.create(Cred_Upd01_CndR.class);

			for (int i = 0; i < noteL.size(); i++) {

				NoteSttl_Upd01_NoteR prevR = (i > 0) ? noteL.get(i - 1) : null;
				NoteSttl_Upd01_NoteR crntR = noteL.get(i);

				if (reqCreateR(i, prevR, crntR)) {
					Cred_Upd01_CndR cndR = createCndR(crntR);
					cndL.add(cndR);
					cnt++;
				}

				// cnt行の金額にcrntRの決済額を加算する
				cndL.get(cnt).amt(cndL.get(cnt).amt().add(nvl(crntR.ar_sttl_amt(), MCNumber.ZERO)));
			}
			return cndL;
		}

		/**
		 * 新規行の作成が必要かどうかを判断する
		 * 
		 * @param i 処理中の行
		 * @param prevR 一つ前の行
		 * @param crntR 現在の行
		 * 
		 * @return　新規行の作成が必要な場合にtrue
		 */
		protected boolean reqCreateR(int i, NoteSttl_Upd01_NoteR prevR,
				NoteSttl_Upd01_NoteR crntR) {

			// 最初の行の場合
			if (i == 0) {
				return true;
			}
			// 前の行と与信管理先違いの場合
			if (!isSame(crntR.cred_cd(), prevR.cred_cd())) {
				return true;
			}
			// 前の行と通貨違いの場合
			if (!isSame(crntR.cur_cd(), prevR.cur_cd())) {
				return true;
			}

			return false;
		}

		/**
		 * 与信更新条件を保持した行を作成する
		 * 
		 * @param crntR 現在処理中の行
		 * @return 更新条件行
		 */
		protected Cred_Upd01_CndR createCndR(NoteSttl_Upd01_NoteR crntR) {
			Cred_Upd01_CndR cndR = Cred_Upd01_CndR.create();
			cndR.cred_cd(crntR.cred_cd());
			cndR.cur_cd(crntR.cur_cd());
			cndR.amt(0);

			return cndR;
		}

		/**
		 * 与信情報を更新する 
		 * 
		 * @param cndL 与信更新条件のリスト
		 */
		protected void updCred(MCList<Cred_Upd01_CndR> cndL) {
			MSBGL_CredService.Cred_Upd01 op = MSBGL_CredService.crtCred_Upd01();
			cndL.setValue(Cred_Upd01_CndR.$trd_ptn_typ, MAC_TRD_PTN_TYP.RCV_AR.value());
			cndL.setValue(Cred_Upd01_CndR.$cred_upd_typ, MSC_CRED_UPD_TYP.UPD.value());

			op.up0().addAll(cndL);
			op.exec();
		}

		/**
		 * 手形情報を更新する（決済フラグを設定する）
		 * @param noteL
		 */
		protected void updNote(MCList<NoteSttl_Upd01_NoteR> noteL) {
			MST_NOTE_R dbc = MST_NOTE_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSet("mat_flg", dbc.mat_flg, value(true));
			dbUpdateKey("MSBGB0060_MST_NOTE_U01", noteL.groupBy(NoteSttl_Upd01_NoteR.$note_mng_no), builder);
		}
	}

	//FMCB CUSTOM END
}