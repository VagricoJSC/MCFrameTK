package mcframe.serverMGBD.MGBDL0040;

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
import mcframe.serverMGBD.MGBDL0040.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_ArgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_ArgReg_MC extends MGBDL_ArgReg_MC_A{
	//FMCB CUSTOM START

	/** 例外発生ＦＬＧ **/
	protected boolean _exceptionFlg;
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 原価計算結果確定前のチェックをする。<br>
	 */
	public class Chk01 extends MGBDL_ArgReg_MC_A.Chk01 {

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

			DtlL<DtlR> up = up0();
			MCJoinKey<MCList<MGT_ARG_R>> a2b = lockArg(up);
			msgL.addAll(chkBase(up, a2b));

			if (!msgL.isEmpty()) {
				return msgL;
			}
			compBase(up0(), a2b);

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();
			ml.addAll(chkSubCom(up0()));
			return ml;
		}

		/**
		 * チェック処理
		 * @param up0 上り電文
		 * @param a2bLocked 上り電文からロックした行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {
			MCMessageList ml = new MCMessageList();	
			up0.forEach(u -> {
				chkBaseByRow(ml, u, a2bLocked);
			});
			return ml;
		}

		protected void chkBaseByRow(MCMessageList ml, DtlR u, MCJoinKey<MCList<MGT_ARG_R>> argA2b) {
			checkUpdCntr(ml, u, argA2b);
		}

		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param a2b 上り電文からロックした行（変更前のデータ）を取得するためのキー
		 */
		protected void compBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> a2bLocked) {

		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 原価計算結果確定取消前のチェックをする。<br>
	 */
	public class Chk02 extends MGBDL_ArgReg_MC_A.Chk02 {

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

			DtlL<DtlR> up = up0();
			MCJoinKey<MCList<MGT_ARG_R>> argA2b = lockArg(up);
			MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b = lockCalcFix(up);
			msgL.addAll(chkBase(up, argA2b, fixA2b));

			if (!msgL.isEmpty()) {
				return msgL;
			}
			compBase(up0(), argA2b, fixA2b);

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();
			ml.addAll(chkSubCom(up0()));
			return ml;
		}

		/**
		 * チェック処理
		 * @param up0 上り電文
		 * @param argA2b 上り電文からロックしたMGT_ARGの行を取得するためのキー
		 * @param fixA2b 上り電文からロックしたMGT_CALC_FIXの行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(DtlL<DtlR> up0, 
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
			MCMessageList ml = new MCMessageList();	
			up0.forEach(u -> {
				chkBaseByRow(ml, u, argA2b, fixA2b);
			});
			
			return ml;
		}

		protected void chkBaseByRow(MCMessageList ml, DtlR u, 
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
			checkUpdCntr(ml, u, argA2b, fixA2b);
		}

		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param argA2b 上り電文からロックしたMGT_ARGの行を取得するためのキー
		 * @param fixA2b 上り電文からロックしたMGT_CALC_FIXの行を取得するためのキー
		 */
		protected void compBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {

		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 原価計算結果会計ＩＦ送信前のチェックをする。<br>
	 */
	public class Chk03 extends MGBDL_ArgReg_MC_A.Chk03 {

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

			DtlL<DtlR> up = up0();
			MCJoinKey<MCList<MGT_ARG_R>> argA2b = lockArg(up);
			MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b = lockCalcFix(up);
			msgL.addAll(chkBase(up, argA2b, fixA2b));

			if (!msgL.isEmpty()) {
				return msgL;
			}
			compBase(up0(), argA2b, fixA2b);

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();
			ml.addAll(chkSubCom(up0()));
			return ml;
		}

		/**
		 * チェック処理
		 * @param up0 上り電文
		 * @param argA2b 上り電文からロックしたMGT_ARGの行を取得するためのキー
		 * @param fixA2b 上り電文からロックしたMGT_CALC_FIXの行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(DtlL<DtlR> up0, 
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
			MCMessageList ml = new MCMessageList();	
			up0.forEach(u -> {
				chkBaseByRow(ml, u, argA2b, fixA2b);
			});

			return ml;
		}

		protected void chkBaseByRow(MCMessageList ml, DtlR u, 
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
			checkUpdCntr(ml, u, argA2b, fixA2b);
		}

		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param argA2b 上り電文からロックしたMGT_ARGの行を取得するためのキー
		 * @param fixA2b 上り電文からロックしたMGT_CALC_FIXの行を取得するためのキー
		 */
		protected void compBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {

		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 原価計算結果会計ＩＦ送信取消前のチェックをする。<br>
	 */
	public class Chk04 extends MGBDL_ArgReg_MC_A.Chk04 {

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

			DtlL<DtlR> up = up0();
			MCJoinKey<MCList<MGT_ARG_R>> argA2b = lockArg(up);
			MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b = lockCalcFix(up);
			msgL.addAll(chkBase(up, argA2b, fixA2b));

			if (!msgL.isEmpty()) {
				return msgL;
			}
			compBase(up0(), argA2b, fixA2b);

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList ml = super.doServerCheckSub();
			ml.addAll(chkSubCom(up0()));
			return ml;
		}

		/**
		 * チェック処理
		 * @param up0 上り電文
		 * @param argA2b 上り電文からロックしたMGT_ARGの行を取得するためのキー
		 * @param fixA2b 上り電文からロックしたMGT_CALC_FIXの行を取得するためのキー
		 * @return メッセージ
		 */
		protected MCMessageList chkBase(DtlL<DtlR> up0, 
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
			MCMessageList ml = new MCMessageList();	
			up0.forEach(u -> {
				chkBaseByRow(ml, u, argA2b, fixA2b);
			});

			return ml;
		}

		protected void chkBaseByRow(MCMessageList ml, DtlR u, 
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
			checkUpdCntr(ml, u, argA2b, fixA2b);
		}

		/**
		 * 上り電文を修正する
		 * @param up0 上り電文
		 * @param argA2b 上り電文からロックしたMGT_ARGの行を取得するためのキー
		 * @param fixA2b 上り電文からロックしたMGT_CALC_FIXの行を取得するためのキー
		 */
		protected void compBase(DtlL<DtlR> up0, MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {

		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 原価計算結果を確定する。<br>
	 */
	public class Ins01 extends MGBDL_ArgReg_MC_A.Ins01 {

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
				down0().setAll(up0());
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
			DtlL<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			DtlL<DtlR> list = (DtlL)getChkList(up);
			ins(list);
		}

		protected void editUp(MCList<DtlR> up) {

		}

		protected void callThisChk(DtlL<DtlR> up) {
			MGBDL_ArgReg.Chk01 o = MGBDL_ArgReg.crtChk01();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}

		protected void ins(DtlL<DtlR> up) {
			if (up.isEmpty()) {
				return;
			}

			up.forEach(r -> {
				String procId = "MGPA_CALC_FIX$P_FIX";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":calc_grp_cd, :calc_no, :ym");
			});
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価計算結果の確定を取り消す。<br>
	 */
	public class Del01 extends MGBDL_ArgReg_MC_A.Del01 {

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
				down0().setAll(up0());
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
			DtlL<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			DtlL<DtlR> list = (DtlL)getChkList(up);
			del(list);
		}

		protected void editUp(MCList<DtlR> up) {
			//存在チェック対象外
			up.setStatus(MCRow.DELETE);
		}

		protected void callThisChk(DtlL<DtlR> up) {
			MGBDL_ArgReg.Chk03 o = MGBDL_ArgReg.crtChk03();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}

		protected void del(DtlL<DtlR> up) {
			if (up.isEmpty()) {
				return;
			}
			up.forEach(r -> {
				String procId = "MGPA_CALC_FIX$P_CANCEL";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":calc_grp_cd, :ym");
			});
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Ins02オペレーション.<p>
	 *
	 * 原価計算結果を会計ＩＦ送信する。<br>
	 */
	public class Ins02 extends MGBDL_ArgReg_MC_A.Ins02 {

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
			DtlL<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			DtlL<DtlR> list = (DtlL)getChkList(up);
			ins(list);
		}

		protected void editUp(MCList<DtlR> up) {

		}

		protected void callThisChk(DtlL<DtlR> up) {
			MGBDL_ArgReg.Chk02 o = MGBDL_ArgReg.crtChk02();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}

		protected void ins(DtlL<DtlR> up) {
			if (up.isEmpty())	return;
			up.forEach(r -> {
				String procId = "MGPA_AC_IF$P_SEND";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":calc_grp_cd, :ym");
			});
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 原価計算結果の会計ＩＦ送信を取り消す。<br>
	 */
	public class Del02 extends MGBDL_ArgReg_MC_A.Del02 {

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
				down0().setAll(up0());
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
			DtlL<DtlR> up = up0();
			editUp(up);
			callThisChk(up);
			DtlL<DtlR> list = (DtlL)getChkList(up);
			del(list);
		}

		protected void editUp(MCList<DtlR> up) {
			//存在チェック対象外
			up.setStatus(MCRow.DELETE);
		}

		protected void callThisChk(DtlL<DtlR> up) {
			MGBDL_ArgReg.Chk04 o = MGBDL_ArgReg.crtChk04();
			o.up0().setAll(up);
			o.exec();
			up.setAll(o.down0());
		}

		protected void del(DtlL<DtlR> up) {
			if (up.isEmpty())	return;
			up.forEach(r -> {
				String procId = "MGPA_AC_IF$P_CANCEL";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":calc_grp_cd, :ym");
			});
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価計算確定情報を検索する。<br>
	 */
	public class Srch01 extends MGBDL_ArgReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchArgRslt();
			srchArgDtl();
		}

		protected void srchArgRslt() {
			Srch01_CndR up = up0();
			Srch01_RsltL<Srch01_RsltR> down = down0();

			MAM_TERM_R term = MAM_TERM_R.create();
			dbSelectKey("MGBDL0040_MAM_TERM_S01", term, MCQueryApiBuilder.create(MAM_TERM_R.create("T")), up);
			
			MCList<MGT_CALC_FIX_R> dbcL = MCList.create(MGT_CALC_FIX_R.class);
			MGT_CALC_FIX_R t1 = MGT_CALC_FIX_R.create("T1");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t1);
			// 対象期間の確定レコードを抽出
			dbcL_bldr.setWhere(t1.ym.between(bind("1"), bind("2")), term.term(), term.term_end_ym().addMonth(-1));
			dbcL_bldr.addWhereWithAnd(t1.calc_grp_cd.eq(bind("1")), up0().calc_grp_cd());
			dbSelect("MGBDL0040_MGT_CALC_FIX_S01", dbcL, dbcL_bldr);
			down.addAllByName(dbcL);

			MCDate curYm = term.term();
			MCDate endYm = term.term_end_ym().addMonth(-1);
			MCIndexKey k = down.createIndex(Srch01_RsltR.$ym);

			Srch01_RsltL<Srch01_RsltR> notFix = down.createInstance();
			while(curYm.lte(endYm)){
				Srch01_RsltR calcFix = down.getFirst(k, curYm);
				//未確定の月をキャッシュ
				if (isNull(calcFix)) {
					calcFix = Srch01_RsltR.create();
					calcFix.calc_grp_cd(up0().calc_grp_cd());
					calcFix.ym(curYm);
					notFix.add(calcFix);
				}
				calcFix.term(term.term());
				curYm = curYm.addMonth(1);
			}

			//未確定行を追加してソート
			down.addAll(notFix);
			down.sort(Srch01_RsltR.$ym);
		}

		protected void srchArgDtl() {
			DtlL<DtlR> down1 = down1();
			for (Srch01_RsltR r : down0()) {
				DtlL<DtlR> dbc = down1.createInstance();
				MGT_ARG_R t = MGT_ARG_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				editDtlSql(r, t, dbc_bldr);
				dbSelect("MGBDL0040_MGT_ARG_S01", dbc, dbc_bldr, r);
				down1.addAllByName(dbc);
			}
		}

		protected void editDtlSql(Srch01_RsltR r, MGT_ARG_R t, MCQueryApiBuilder dbc_bldr) {
			MAM_USR_R m2 = MAM_USR_R.create("M2");
			MGT_CALC_FIX_R fix1 = MGT_CALC_FIX_R.create("FIX1");

			dbc_bldr.addSelect(bind("ym").as("ym"), bind("ac_if_flg").as("ac_if_flg"));
			dbc_bldr.addSelect(t.ins_usr_id.as("calc_usr_cd"), m2.usr_nm.as("calc_usr_nm"));
			dbc_bldr.addSelect(fix1.upd_cntr.as("fix_upd_cntr"));
			dbc_bldr.addLeftOuterJoin(m2, bracket( t.ins_usr_id.eq(m2.usr_cd)));
			dbc_bldr.addLeftOuterJoin(fix1, bracket( t.calc_no.eq(fix1.calc_no)
					.and(t.calc_grp_cd.eq(fix1.calc_grp_cd))));
			dbc_bldr.setWhere(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.data_check_flg.eq(value(false)));
			if (!isNull(r.calc_no())) {
				dbc_bldr.addWhereWithAnd(t.calc_no.eq(bind("calc_no")));
			}
			else {
				dbc_bldr.addWhereWithAnd(t.calc_err_flg.neq(value(true)));
				dbc_bldr.addWhereWithAnd(t.end_ym.eq(bind("ym")));
			}
			dbc_bldr.setOrderByAsc(t.calc_no);
		}
	}

	/**
	 * 更新対象をロックし、ロック対象を取得するためのキーを返す。
	 * @param list 更新対象
	 * @return ロックした行
	 */
	protected MCJoinKey<MCList<MGT_ARG_R>> lockArg(MCList<DtlR> list) {
		if (list.isEmpty()) {
			return null;
		}

		list.sort(list.createRow().getKeyColumn());// ロック順の指定
		MCList<MGT_ARG_R> locked = MCList.create(MGT_ARG_R.class);
		dbSelectKeyForUpdateNoWait("MGBDL0040_MGT_ARG_S02", locked, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), list);	// 行ロックできない場合は、ここで例外がスローされる。

		return list.join(
				list.createRow().getKeyColumn(), locked, locked.createRow().getKeyColumn());
	}

	/**
	 * 更新対象をロックし、ロック対象を取得するためのキーを返す。
	 * @param list 更新対象
	 */
	protected MCJoinKey<MCList<MGT_CALC_FIX_R>> lockCalcFix(DtlL<DtlR> list) {
		if (list.isEmpty()) {
			return null;
		}

		list.sort(list.createRow().getKeyColumn());		// ロック順の指定
		MCList<MGT_CALC_FIX_R> locked = MCList.create(MGT_CALC_FIX_R.class);
		dbSelectKeyForUpdateNoWait("MGBDL0040_MGT_CALC_FIX_S02", locked, MCQueryApiBuilder.create(MGT_CALC_FIX_R.create("T")), list);

		return list.join(
				new String[]{DtlR.$calc_grp_cd, DtlR.$ym}, 
				locked, 
				new String[]{MGT_CALC_FIX_R.$calc_grp_cd, MGT_CALC_FIX_R.$ym} );
	}

	protected MCMessageList chkSubCom(DtlL<DtlR> up) {
		MCMessageList ml = new MCMessageList();
		for(DtlL<DtlR> gl : up.groupList(new String[]{DtlR.$calc_grp_cd, DtlR.$ym})) {
			if (gl.size() > 1) {
					gl.forEach(glr->{
					ml.add(new MCMessage(glr, null, MGBDL0022, 
							glr.calc_grp_cd(), toYMString(glr.ym()), toDispGUIIndex(glr)));
				});
			}
		}
		return ml;
	}

	protected void checkUpdCntr(MCMessageList ml, DtlR u, MCJoinKey<MCList<MGT_ARG_R>> argA2b){
		//変更前情報
		MGT_ARG_R b = u.getJoinedRow(argA2b);
		ml.addAll(checkUpdCntrNE(u, DtlR.$upd_cntr, b));
	}

	protected void checkUpdCntr(MCMessageList ml, DtlR u,
				MCJoinKey<MCList<MGT_ARG_R>> argA2b, MCJoinKey<MCList<MGT_CALC_FIX_R>> fixA2b) {
		checkUpdCntr(ml, u, argA2b);
		//確定情報
		MGT_CALC_FIX_R calcfix = u.getJoinedRow(fixA2b);
		ml.addAll(checkUpdCntrNE(u, DtlR.$fix_upd_cntr, calcfix));	
	}

	//FMCB CUSTOM END
}