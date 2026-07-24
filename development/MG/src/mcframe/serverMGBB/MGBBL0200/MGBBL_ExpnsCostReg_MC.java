package mcframe.serverMGBB.MGBBL0200;

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
import mcframe.serverMGBB.MGBBL0200.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0200.Query.*;
import java.util.ArrayList;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.autoCommitDBTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_ExpnsCostReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_ExpnsCostReg_MC extends MGBBL_ExpnsCostReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 投入実績の費目別原価を検索する<br>
	 */
	public class Srch01 extends MGBBL_ExpnsCostReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0200_MGT_ACT_INPT_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcUpri(down0());
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を検索する<br>
	 */
	public class Srch02 extends MGBBL_ExpnsCostReg_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0200_MGT_ACT_IO_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcUpri(down0());
		}

	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 売上実績の費目別原価を検索する<br>
	 */
	public class Srch03 extends MGBBL_ExpnsCostReg_MC_A.Srch03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0200_MGT_ACT_SLS_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			calcUpri(down0());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 投入実績の費目別原価を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBBL_ExpnsCostReg_MC_A.Chk01 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnInpt(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk01_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixInpt(upR);
			// 費目別金額の小数有効桁数チェック、合計金額≠０チェック
			chkAmtDecPlaceAndTtl(upR, msgL);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBBL_ExpnsCostReg_MC_A.Chk02 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnIo(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk02_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixIo(upR);
			// 費目別金額の小数有効桁数チェック、合計金額≠０チェック
			chkAmtDecPlaceAndTtl(upR, msgL);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 売上実績の費目別原価を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBBL_ExpnsCostReg_MC_A.Chk03 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnSls(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk03_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixSls(upR);
			// 費目別金額の小数有効桁数チェック、合計金額≠０チェック
			chkAmtDecPlaceAndTtl(upR, msgL);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 投入実績の費目別原価を自動設定するために、チェックを行う<br>
	 */
	public class Chk04 extends MGBBL_ExpnsCostReg_MC_A.Chk04 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnInpt(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk04_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixInpt(upR);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk05オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を自動設定するために、チェックを行う<br>
	 */
	public class Chk05 extends MGBBL_ExpnsCostReg_MC_A.Chk05 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnIo(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk05_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixIo(upR);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk06オペレーション.<p>
	 *
	 * 売上実績の費目別原価を自動設定するために、チェックを行う<br>
	 */
	public class Chk06 extends MGBBL_ExpnsCostReg_MC_A.Chk06 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnSls(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk06_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixSls(upR);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk07オペレーション.<p>
	 *
	 * 投入実績の費目別原価を削除するために、チェックを行う<br>
	 */
	public class Chk07 extends MGBBL_ExpnsCostReg_MC_A.Chk07 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnInpt(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk07_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixInpt(upR);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk08オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を削除するために、チェックを行う<br>
	 */
	public class Chk08 extends MGBBL_ExpnsCostReg_MC_A.Chk08 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnIo(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk08_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixIo(upR);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk09オペレーション.<p>
	 *
	 * 売上実績の費目別原価を削除するために、チェックを行う<br>
	 */
	public class Chk09 extends MGBBL_ExpnsCostReg_MC_A.Chk09 {

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

		/**
		 * ロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chk() {
			return chkCmnSls(up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			Chk09_RsltR upR = up0().get(0);
			if (upR.err_flg()) {
				return msgL;
			}

			// 確定チェック
			chkFixSls(upR);

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 投入実績の費目別原価を登録、訂正する<br>
	 */
	public class Upd01 extends MGBBL_ExpnsCostReg_MC_A.Upd01 {

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

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBBL_ExpnsCostReg.Chk01 ope = MGBBL_ExpnsCostReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 投入実績の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			Chk01_RsltR r = notErrL.get(0);
			MGT_ACT_INPT_R dbc = r.dbc();
			MGT_ACT_INPT_R t1 = MGT_ACT_INPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbWkDelete("MGBBL0200_MGW_ACT_INPT_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MGBBL0200_MGW_ACT_INPT_I01", dbc, dbc_bldr.getBaseDbc());
			delByWkInpt();
			dbWkDelete("MGBBL0200_MGW_ACT_INPT_D02", dbc_bldr.getBaseDbc());

			MCList<MGT_ACT_INPT_EXPNS_R> expns = MCList.create(MGT_ACT_INPT_EXPNS_R.class);
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				MCNumber n = r.getNumber(e.getKey());
				if (!isNull(n)) {
					MGT_ACT_INPT_EXPNS_R rec = MGT_ACT_INPT_EXPNS_R.create();
					rec.act_inpt_id(r.act_inpt_id());
					rec.act_inpt_id_sub(r.act_inpt_id_sub());
					rec.expns_cd(e.getValue());
					rec.amt(n);
					expns.add(rec);
				}
			}
			dbInsertEx("MGBBL0200_MGT_ACT_INPT_EXPNS_I01", expns, MCQueryApiBuilder.create(MGT_ACT_INPT_EXPNS_R.create("T")));

			dbc_bldr.setSet(t1.rec_eval_typ);
			dbc.setValue(MGT_ACT_INPT_R.$rec_eval_typ, MGC_REC_EVAL_TYP.EXPNS.value());
			dbUpdateKey("MGBBL0200_MGT_ACT_INPT_U01", dbc, dbc_bldr);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を登録、訂正する<br>
	 */
	public class Upd02 extends MGBBL_ExpnsCostReg_MC_A.Upd02 {

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
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MGBBL_ExpnsCostReg.Chk02 ope = MGBBL_ExpnsCostReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 入出庫実績の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			Chk02_RsltR r = notErrL.get(0);
			MGT_ACT_IO_R dbc = r.dbc();
			MGT_ACT_IO_R t1 = MGT_ACT_IO_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbWkDelete("MGBBL0200_MGW_ACT_IO_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MGBBL0200_MGW_ACT_IO_I01", dbc, dbc_bldr.getBaseDbc());
			delByWkIo();
			dbWkDelete("MGBBL0200_MGW_ACT_IO_D02", dbc_bldr.getBaseDbc());

			MCList<MGT_ACT_IO_EXPNS_R> expns = MCList.create(MGT_ACT_IO_EXPNS_R.class);
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				MCNumber n = r.getNumber(e.getKey());
				if (!isNull(n)) {
					MGT_ACT_IO_EXPNS_R rec = MGT_ACT_IO_EXPNS_R.create();
					rec.act_io_id(r.act_io_id());
					rec.act_io_id_sub(r.act_io_id_sub());
					rec.expns_cd(e.getValue());
					rec.amt(n);
					expns.add(rec);
				}
			}
			dbInsertEx("MGBBL0200_MGT_ACT_IO_EXPNS_I01", expns, MCQueryApiBuilder.create(MGT_ACT_IO_EXPNS_R.create("T")));

			dbc_bldr.setSet(t1.rec_eval_typ);
			dbc.setValue(MGT_ACT_IO_R.$rec_eval_typ, MGC_REC_EVAL_TYP.EXPNS.value());
			dbUpdateKey("MGBBL0200_MGT_ACT_IO_U01", dbc, dbc_bldr);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd03オペレーション.<p>
	 *
	 * 売上実績の費目別原価を登録、訂正する<br>
	 */
	public class Upd03 extends MGBBL_ExpnsCostReg_MC_A.Upd03 {

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
			callThisChk03();
			MCList<Chk03_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBBL_ExpnsCostReg.Chk03 ope = MGBBL_ExpnsCostReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 売上実績の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk03_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			Chk03_RsltR r = notErrL.get(0);
			MGT_ACT_SLS_R dbc = r.dbc();
			MGT_ACT_SLS_R t1 = MGT_ACT_SLS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t1);
			dbWkDelete("MGBBL0200_MGW_ACT_SLS_D01", dbc_bldr.getBaseDbc());
			dbWkInsert("MGBBL0200_MGW_ACT_SLS_I01", dbc, dbc_bldr.getBaseDbc());
			delByWkSls();
			dbWkDelete("MGBBL0200_MGW_ACT_SLS_D02", dbc_bldr.getBaseDbc());

			MCList<MGT_ACT_SLS_EXPNS_R> expns = MCList.create(MGT_ACT_SLS_EXPNS_R.class);
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				MCNumber n = r.getNumber(e.getKey());
				if (!isNull(n)) {
					MGT_ACT_SLS_EXPNS_R rec = MGT_ACT_SLS_EXPNS_R.create();
					rec.act_sls_id(r.act_sls_id());
					rec.act_sls_id_sub(r.act_sls_id_sub());
					rec.expns_cd(e.getValue());
					rec.amt(n);
					expns.add(rec);
				}
			}
			dbInsertEx("MGBBL0200_MGT_ACT_SLS_EXPNS_I01", expns, MCQueryApiBuilder.create(MGT_ACT_SLS_EXPNS_R.create("T")));

			dbc_bldr.setSet(t1.rec_eval_typ);
			dbc.setValue(MGT_ACT_SLS_R.$rec_eval_typ, MGC_REC_EVAL_TYP.EXPNS.value());
			dbUpdateKey("MGBBL0200_MGT_ACT_SLS_U01", dbc, dbc_bldr);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd04オペレーション.<p>
	 *
	 * 投入実績の費目別原価を自動設定する<br>
	 */
	public class Upd04 extends MGBBL_ExpnsCostReg_MC_A.Upd04 {

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
			editUp();
			callThisChk04();
			MCList<Chk04_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MGBBL_ExpnsCostReg.Chk04 ope = MGBBL_ExpnsCostReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 投入実績の費目別原価の自動設定を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk04_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}

			Chk04_RsltR r = notErrL.get(0);
			executeUpdate(MGBBL0200_MGW_EXPNS_INPT_I01(), autoCommitDBTran(), r, null, null);

			callProc();
		}

		protected void callProc() {
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_SET_EXPNS$P_INPT", "01"), "MGPA_SET_EXPNS$P_INPT");
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd05オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を自動設定する<br>
	 */
	public class Upd05 extends MGBBL_ExpnsCostReg_MC_A.Upd05 {

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
			editUp();
			callThisChk05();
			MCList<Chk05_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MGBBL_ExpnsCostReg.Chk05 ope = MGBBL_ExpnsCostReg.crtChk05();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 入出庫実績の費目別原価の自動設定を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk05_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}

			Chk05_RsltR r = notErrL.get(0);
			executeUpdate(MGBBL0200_MGW_EXPNS_IO_I01(), autoCommitDBTran(), r, null, null);

			callProc();
		}

		protected void callProc() {
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_SET_EXPNS$P_IO", "01"), "MGPA_SET_EXPNS$P_IO");
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Upd06オペレーション.<p>
	 *
	 * 売上実績の費目別原価を自動設定する<br>
	 */
	public class Upd06 extends MGBBL_ExpnsCostReg_MC_A.Upd06 {

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
			editUp();
			callThisChk06();
			MCList<Chk06_RsltR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk06() {
			MGBBL_ExpnsCostReg.Chk06 ope = MGBBL_ExpnsCostReg.crtChk06();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 売上実績の費目別原価の自動設定を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk06_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}

			Chk06_RsltR r = notErrL.get(0);
			executeUpdate(MGBBL0200_MGW_EXPNS_SLS_I01(), autoCommitDBTran(), r, null, null);

			callProc();
		}

		protected void callProc() {
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, "MGPA_SET_EXPNS$P_SLS", "01"), "MGPA_SET_EXPNS$P_SLS");
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 投入実績の費目別原価を削除する<br>
	 */
	public class Del01 extends MGBBL_ExpnsCostReg_MC_A.Del01 {

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
			callThisChk07();
			MCList<Chk07_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk07() {
			MGBBL_ExpnsCostReg.Chk07 ope = MGBBL_ExpnsCostReg.crtChk07();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 投入実績の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk07_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			Chk07_RsltR r = notErrL.get(0);
			MGT_ACT_INPT_R dbc = r.dbc();
			MGT_ACT_INPT_R t = MGT_ACT_INPT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MGBBL0200_MGW_ACT_INPT_D03", dbc_bldr.getBaseDbc());
			dbWkInsert("MGBBL0200_MGW_ACT_INPT_I02", dbc, dbc_bldr.getBaseDbc());
			delByWkInpt();
			dbWkDelete("MGBBL0200_MGW_ACT_INPT_D04", dbc_bldr.getBaseDbc());

			dbc_bldr.setSet(t.rec_eval_typ);
			dbc.setValue(MGT_ACT_INPT_R.$rec_eval_typ, null);
			dbUpdateKey("MGBBL0200_MGT_ACT_INPT_U02", dbc, dbc_bldr);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 入出庫実績の費目別原価を削除する<br>
	 */
	public class Del02 extends MGBBL_ExpnsCostReg_MC_A.Del02 {

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
			callThisChk08();
			MCList<Chk08_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk08() {
			MGBBL_ExpnsCostReg.Chk08 ope = MGBBL_ExpnsCostReg.crtChk08();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 入出庫実績の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk08_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			Chk08_RsltR r = notErrL.get(0);
			MGT_ACT_IO_R dbc = r.dbc();
			MGT_ACT_IO_R t = MGT_ACT_IO_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MGBBL0200_MGW_ACT_IO_D03", dbc_bldr.getBaseDbc());
			dbWkInsert("MGBBL0200_MGW_ACT_IO_I02", dbc, dbc_bldr.getBaseDbc());
			delByWkIo();
			dbWkDelete("MGBBL0200_MGW_ACT_IO_D04", dbc_bldr.getBaseDbc());

			dbc_bldr.setSet(t.rec_eval_typ);
			dbc.setValue(MGT_ACT_IO_R.$rec_eval_typ, null);
			dbUpdateKey("MGBBL0200_MGT_ACT_IO_U02", dbc, dbc_bldr);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Del03オペレーション.<p>
	 *
	 * 売上実績の費目別原価を削除する<br>
	 */
	public class Del03 extends MGBBL_ExpnsCostReg_MC_A.Del03 {

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
			callThisChk09();
			MCList<Chk09_RsltR> notErrL = getChkList(up0());
			del(notErrL);
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk09() {
			MGBBL_ExpnsCostReg.Chk09 ope = MGBBL_ExpnsCostReg.crtChk09();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 売上実績の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk09_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			Chk09_RsltR r = notErrL.get(0);
			MGT_ACT_SLS_R dbc = r.dbc();
			MGT_ACT_SLS_R t = MGT_ACT_SLS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbWkDelete("MGBBL0200_MGW_ACT_SLS_D03", dbc_bldr.getBaseDbc());
			dbWkInsert("MGBBL0200_MGW_ACT_SLS_I02", dbc, dbc_bldr.getBaseDbc());
			delByWkSls();
			dbWkDelete("MGBBL0200_MGW_ACT_SLS_D04", dbc_bldr.getBaseDbc());

			dbc_bldr.setSet(t.rec_eval_typ);
			dbc.setValue(MGT_ACT_SLS_R.$rec_eval_typ, null);
			dbUpdateKey("MGBBL0200_MGT_ACT_SLS_U02", dbc, dbc_bldr);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

	}

	// -----------------------------------------------
	// DynamicSql
	/**
	 * 有効な費目区分を取得する
	 *
	 * @return 有効な費目区分
	 */
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = { "T.amt" };
		return stringArray;
	}

	// -----------------------------------------------
	// Common
	protected void calcUpri(MCList<Srch01_RsltR> down) {
		for (Srch01_RsltR r : down) {
			r.upri(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.upri_META.scale()));
		}
	}

	protected void chkFixInpt(MCRow r) {
		MGT_ACT_INPT_R dbc = getDbcInpt(r);
		String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT";
		if (r instanceof Chk04_RsltR) {
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "01"), procId, dbc, null,
					":calc_ctg_cd, :wg_cd, :ym, '0', '0', '1', '0', '0', '0', '0', '0', '0'");
		}
		else {
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, dbc, null,
					":calc_ctg_cd, :wg_cd, :ym, '0', '0', '1', '0', '0', '0', '0', '0', '0'");
		}
	}

	protected void chkFixIo(MCRow r) {
		MGT_ACT_IO_R dbc = getDbcIo(r);
		String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT";
		if (r instanceof Chk05_RsltR) {
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "02"), procId, dbc, null,
					":calc_ctg_cd, :wg_cd, :ym, '0', '0', '0', '0', '0', '0', '1', '0', '0'");
		}
		else {
			execProc(createSqlId(LOGIC_ID, procId, "02"), procId, dbc, null,
					":calc_ctg_cd, :wg_cd, :ym, '0', '0', '0', '0', '0', '0', '1', '0', '0'");
		}
	}

	protected void chkFixSls(MCRow r) {
		MGT_ACT_SLS_R dbc = getDbcSls(r);
		String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT";
		if (r instanceof Chk06_RsltR) {
			execProcWithAutoCommitDbTran(createSqlId(LOGIC_ID, procId, "03"), procId, dbc, null,
					":calc_ctg_cd, :wg_cd, :ym, '0', '0', '0', '0', '0', '0', '0', '1', '0'");
		}
		else {
			execProc(createSqlId(LOGIC_ID, procId, "03"), procId, dbc, null,
					":calc_ctg_cd, :wg_cd, :ym, '0', '0', '0', '0', '0', '0', '0', '1', '0'");
		}
	}

	protected void chkAmtDecPlaceAndTtl(MCRow upR, MCMessageList msgL) {
		MCNumber ttl = MCNumber.ZERO;

		// AtLeastOneチェック
		msgL.addAll(check(upR, getExpnsColNames(), new MAUDL_AtLeastOneValidater_NULL_VAL()));

		// 費目別金額の小数有効桁数チェック
		int amtDecPlace = getBaseCur().amt_dec_place().intValue();
		for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
			msgL.addAll(checkDecPlace(upR, amtDecPlace, e.getKey()));
			ttl = ttl.add(nvl(upR.getNumber(e.getKey()), MCNumber.ZERO));
		}
		// 合計金額≠０チェック
		if (ttl.isZero()) {
			msgL.add(new MCMessage(MGBBL0001, upR, getExpnsColNames()[0]));
		}
	}

	protected MCMessageList chkCmnInpt(MCList<?> upL) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(upL);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		MCList<MGT_ACT_INPT_R> selectL = MCList.create(MGT_ACT_INPT_R.class);
		if (notErrUpdL.get(0) instanceof Chk04_RsltR) {
			selectPkWk("MGBBL0200_MGT_ACT_INPT_S01",
					selectL, MCQueryApiBuilder.create(MGT_ACT_INPT_R.create("T")).getBaseDbc(), notErrUpdL, false, MGT_ACT_INPT_R.$wg_cd, MGT_ACT_INPT_R.$calc_ctg_cd, MGT_ACT_INPT_R.$ym);
		}
		else {
			selectForUpdateNoWaitPkWk("MGBBL0200_MGT_ACT_INPT_S01",
					selectL, MCQueryApiBuilder.create(MGT_ACT_INPT_R.create("T")).getBaseDbc(), notErrUpdL, MGT_ACT_INPT_R.$wg_cd, MGT_ACT_INPT_R.$calc_ctg_cd, MGT_ACT_INPT_R.$ym);
		}

		MCIndexKey idxkey = selectL.createIndex(MGT_ACT_INPT_R.$act_inpt_id, MGT_ACT_INPT_R.$act_inpt_id_sub);
		for (MCRow r : notErrUpdL) {
			MGT_ACT_INPT_R dbc = getDbcInpt(r);
			MGT_ACT_INPT_R selectR = selectL.getFirst(idxkey, dbc.act_inpt_id(), dbc.act_inpt_id_sub());

			if (isNull(selectR)) {
				msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
			}
			else {
				selectR.setAttributes(r);
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_INPT_R.$wg_cd));
				// 確定チェック用引数セット
				dbc.calc_ctg_cd(selectR.calc_ctg_cd());
				dbc.wg_cd(selectR.wg_cd());
				dbc.ym(selectR.ym());
			}
		}
		return msgL;
	}

	protected MCMessageList chkCmnIo(MCList<?> upL) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(upL);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		MCList<MGT_ACT_IO_R> selectL = MCList.create(MGT_ACT_IO_R.class);
		if (notErrUpdL.get(0) instanceof Chk05_RsltR) {
			selectPkWk("MGBBL0200_MGT_ACT_IO_S01",
					selectL, MCQueryApiBuilder.create(MGT_ACT_IO_R.create("T")).getBaseDbc(), notErrUpdL, false, MGT_ACT_IO_R.$wg_cd, MGT_ACT_IO_R.$calc_ctg_cd, MGT_ACT_IO_R.$ym);
		}
		else {
			selectForUpdateNoWaitPkWk("MGBBL0200_MGT_ACT_IO_S01",
					selectL, MCQueryApiBuilder.create(MGT_ACT_IO_R.create("T")).getBaseDbc(), notErrUpdL, MGT_ACT_IO_R.$wg_cd, MGT_ACT_IO_R.$calc_ctg_cd, MGT_ACT_IO_R.$ym);
		}

		MCIndexKey idxkey = selectL.createIndex(MGT_ACT_IO_R.$act_io_id, MGT_ACT_IO_R.$act_io_id_sub);
		for (MCRow r : notErrUpdL) {
			MGT_ACT_IO_R dbc = getDbcIo(r);
			MGT_ACT_IO_R selectR = selectL.getFirst(idxkey, dbc.act_io_id(), dbc.act_io_id_sub());

			if (isNull(selectR)) {
				msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
			}
			else {
				selectR.setAttributes(r);
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_IO_R.$wg_cd));
				// 確定チェック用引数セット
				dbc.calc_ctg_cd(selectR.calc_ctg_cd());
				dbc.wg_cd(selectR.wg_cd());
				dbc.ym(selectR.ym());
			}
		}
		return msgL;
	}

	protected MCMessageList chkCmnSls(MCList<?> upL) {
		MCMessageList msgL = new MCMessageList();
		MCList<?> notErrUpdL = getChkList(upL);
		if (notErrUpdL.isEmpty()) {
			return msgL;
		}

		MCList<MGT_ACT_SLS_R> selectL = MCList.create(MGT_ACT_SLS_R.class);
		if (notErrUpdL.get(0) instanceof Chk06_RsltR) {
			selectPkWk("MGBBL0200_MGT_ACT_SLS_S01",
					selectL, MCQueryApiBuilder.create(MGT_ACT_SLS_R.create("T")).getBaseDbc(), notErrUpdL, false, MGT_ACT_SLS_R.$wg_cd, MGT_ACT_SLS_R.$calc_ctg_cd, MGT_ACT_SLS_R.$ym);
		}
		else {
			selectForUpdateNoWaitPkWk("MGBBL0200_MGT_ACT_SLS_S01",
					selectL, MCQueryApiBuilder.create(MGT_ACT_SLS_R.create("T")).getBaseDbc(), notErrUpdL, MGT_ACT_SLS_R.$wg_cd, MGT_ACT_SLS_R.$calc_ctg_cd, MGT_ACT_SLS_R.$ym);
		}

		MCIndexKey idxkey = selectL.createIndex(MGT_ACT_SLS_R.$act_sls_id, MGT_ACT_SLS_R.$act_sls_id_sub);
		for (MCRow r : notErrUpdL) {
			MGT_ACT_SLS_R dbc = getDbcSls(r);
			MGT_ACT_SLS_R selectR = selectL.getFirst(idxkey, dbc.act_sls_id(), dbc.act_sls_id_sub());

			if (isNull(selectR)) {
				msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
			}
			else {
				selectR.setAttributes(r);
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(selectR, MGT_ACT_SLS_R.$wg_cd));
				// 確定チェック用引数セット
				dbc.calc_ctg_cd(selectR.calc_ctg_cd());
				dbc.wg_cd(selectR.wg_cd());
				dbc.ym(selectR.ym());
			}
		}
		return msgL;
	}

	protected void delByWkInpt() {
		MGW_ACT_INPT_KEY_R S1W1 = MGW_ACT_INPT_KEY_R.create("W1");
		MGT_ACT_INPT_EXPNS_R t = MGT_ACT_INPT_EXPNS_R.create("T");
		MCQueryApiBuilder expns_bldr = MCQueryApiBuilder.create(t);
		expns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1)
				.where(S1W1.act_inpt_id.eq(t.act_inpt_id)
						.and(S1W1.act_inpt_id_sub.eq(t.act_inpt_id_sub)))));
		expns_bldr.buildDelete("MGBBL0200_MGT_ACT_INPT_EXPNS_D01").executeUpdate();
	}

	protected void delByWkIo() {
		MGW_ACT_IO_KEY_R S1W1 = MGW_ACT_IO_KEY_R.create("W1");
		MGT_ACT_IO_EXPNS_R t = MGT_ACT_IO_EXPNS_R.create("T");
		MCQueryApiBuilder expns_bldr = MCQueryApiBuilder.create(t);
		expns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1)
				.where(S1W1.act_io_id.eq(t.act_io_id)
						.and(S1W1.act_io_id_sub.eq(t.act_io_id_sub)))));
		expns_bldr.buildDelete("MGBBL0200_MGT_ACT_IO_EXPNS_D01").executeUpdate();
	}

	protected void delByWkSls() {
		MGW_ACT_SLS_KEY_R S1W1 = MGW_ACT_SLS_KEY_R.create("W1");
		MGT_ACT_SLS_EXPNS_R t = MGT_ACT_SLS_EXPNS_R.create("T");
		MCQueryApiBuilder expns_bldr = MCQueryApiBuilder.create(t);
		expns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1)
				.where(S1W1.act_sls_id.eq(t.act_sls_id)
						.and(S1W1.act_sls_id_sub.eq(t.act_sls_id_sub)))));
		expns_bldr.buildDelete("MGBBL0200_MGT_ACT_SLS_EXPNS_D01").executeUpdate();
	}

	protected MGT_ACT_INPT_R getDbcInpt(MCRow r) {
		MGT_ACT_INPT_R dbc = null;
		if (r instanceof Chk01_RsltR) {
			dbc = ((Chk01_RsltR) r).dbc();
		}
		else if (r instanceof Chk04_RsltR) {
			dbc = ((Chk04_RsltR) r).dbc();
		}
		else if (r instanceof Chk07_RsltR) {
			dbc = ((Chk07_RsltR) r).dbc();
		}
		return dbc;
	}

	protected MGT_ACT_IO_R getDbcIo(MCRow r) {
		MGT_ACT_IO_R dbc = null;
		if (r instanceof Chk02_RsltR) {
			dbc = ((Chk02_RsltR) r).dbc();
		}
		else if (r instanceof Chk05_RsltR) {
			dbc = ((Chk05_RsltR) r).dbc();
		}
		else if (r instanceof Chk08_RsltR) {
			dbc = ((Chk08_RsltR) r).dbc();
		}
		return dbc;
	}

	protected MGT_ACT_SLS_R getDbcSls(MCRow r) {
		MGT_ACT_SLS_R dbc = null;
		if (r instanceof Chk03_RsltR) {
			dbc = ((Chk03_RsltR) r).dbc();
		}
		else if (r instanceof Chk06_RsltR) {
			dbc = ((Chk06_RsltR) r).dbc();
		}
		else if (r instanceof Chk09_RsltR) {
			dbc = ((Chk09_RsltR) r).dbc();
		}
		return dbc;
	}

	//FMCB CUSTOM END
}