package mcframe.serverMBBB.MBBBL0110;

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
import mcframe.serverMB.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBB.MBBBL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverCore.mcjdbc.MCSavepoint;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverMBBB.MBBBL0110.Query.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMBBB.MBBBL5040.*;
import mcframe.serverMBBB.MBBBL5080.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_JnlHistory"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_JnlHistory_MC extends MBBBL_JnlHistory_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 自動仕訳の履歴を検索する。<br>
	 */
	public class Srch01 extends MBBBL_JnlHistory_MC_A.Srch01 {
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
			executeQuery(down0(), MBBBL0110_MBT_JNL_HISTORY_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕訳データの削除前チェック<br>
	 */
	public class Chk01 extends MBBBL_JnlHistory_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			//　ロック、更新カウンタチェック
			msgL.addAll(lock(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			initJnlActCache(notErrL);

			for (Chk01_DtlR r : notErrL) {
				if (MAC_DATA_TYP.isAC_MK(r.data_typ())) {

					MAM_JNL_ACT_R row = getJnlAct(r.jnl_act_cd());

					if (!isNull(row) && !row.jnl_del_flg()) {
						msgL.add(new MCMessage(r, null, MBBBL0005, toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		MCList<MAM_JNL_ACT_R> _jnlActL;
		MCIndexKey _jnlActKey;
		protected void initJnlActCache(MCList<Chk01_DtlR> list) {
			MCList<Chk01_DtlR> ls = list.groupBy(Chk01_DtlR.$jnl_act_cd);
			_jnlActL = MCList.create(MAM_JNL_ACT_R.class);
			MAM_JNL_ACT_R t = MAM_JNL_ACT_R.create("T");
			MCQueryApiBuilder _jnlActL_bldr = MCQueryApiBuilder.create(t);
			_jnlActL_bldr.setSelect(_jnlActL_bldr.getBaseDbc().getKeyColumn$());
			_jnlActL_bldr.addSelect(t.jnl_del_flg);
			dbSelectKey("MBBBL0110_MAM_JNL_ACT_S01", _jnlActL, _jnlActL_bldr, ls);
			_jnlActKey = _jnlActL.createIndex(MAM_JNL_ACT_R.$jnl_act_cd);
		}

		protected MAM_JNL_ACT_R getJnlAct(String jnlActCd) {
			return _jnlActL.getFirst(_jnlActKey, jnlActCd);
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 備考の更新前チェック<br>
	 */
	public class Chk02 extends MBBBL_JnlHistory_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
			setDown();
		}

		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			//　ロック、更新カウンタチェック
			msgL.addAll(lock(up0()));

			return msgL;
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕訳データの削除処理をする。<br>
	 */
	public class Del01 extends MBBBL_JnlHistory_MC_A.Del01 {
		
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
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
			up0().sort(Chk01_DtlR.$jnl_grp_no);
		}

		protected void callThisChk01() {
			MBBBL_JnlHistory.Chk01 ope = MBBBL_JnlHistory.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Chk01_DtlR> notErrL) {
			String param = getSysParmNE("AC_JNL_ERR_CNT");
			for (Chk01_DtlR r : notErrL) {
				// セーブポイント設定
				MCSavepoint sp = dbTran().setSavepoint();

				try {
					// 仕訳データ削除
					delJournal(r);
					// 仕訳済カウントデクリメント
					if (isSame(param, "1")) {
						if (!MAC_DATA_TYP.isERR(r.data_typ())) {
							decJnlFinCnt(r);
						}
					}
					else {
						decJnlFinCnt(r);
					}
					// 履歴削除
					delHistory(r);
				}
				catch (MCAppException ex) {
					dbTran().rollback(sp);
				}
			}
			dbTran().commit();
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected void delJournal(Chk01_DtlR r) {
			MBT_JOURNAL_R t = MBT_JOURNAL_R.create("T");
			execDbDelete("MBBBL0110_MBT_JOURNAL_D01", t, t.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
		}

		// 仕訳済データのカウントを１つ減らす
		protected void decJnlFinCnt(Chk01_DtlR r) {
			MBT_AC_IO_R tran = MBT_AC_IO_R.create("T");
			MCQueryApiBuilder tran_bldr = MCQueryApiBuilder.create(tran);
			setDecJnlFinCntSql(tran, tran_bldr, MAC_AC_TABLE_TYP.AC_IO.value(), r);
			dbUpdate("MBBBL0110_MBT_AC_IO_U01", tran, tran_bldr);

			MBT_AC_STK_R stk = MBT_AC_STK_R.create("T");
			MCQueryApiBuilder stk_bldr = MCQueryApiBuilder.create(stk);
			setDecJnlFinCntSql(stk, stk_bldr, MAC_AC_TABLE_TYP.AC_STK.value(), r);
			dbUpdate("MBBBL0110_MBT_AC_STK_U01", stk, stk_bldr);

			MBT_AC_COST_R cst = MBT_AC_COST_R.create("T");
			MCQueryApiBuilder cst_bldr = MCQueryApiBuilder.create(cst);
			setDecJnlFinCntSql(cst, cst_bldr, MAC_AC_TABLE_TYP.AC_COST.value(), r);
			dbUpdate("MBBBL0110_MBT_AC_COST_U01", cst, cst_bldr);

			MBT_AC_RCV_R rcv = MBT_AC_RCV_R.create("T");
			MCQueryApiBuilder rcv_bldr = MCQueryApiBuilder.create(rcv);
			setDecJnlFinCntSql(rcv, rcv_bldr, MAC_AC_TABLE_TYP.AC_RCV.value(), r);
			dbUpdate("MBBBL0110_MBT_AC_RCV_U01", rcv, rcv_bldr);

			MBT_AC_PAY_R pay = MBT_AC_PAY_R.create("T");
			MCQueryApiBuilder pay_bldr = MCQueryApiBuilder.create(pay);
			setDecJnlFinCntSql(pay, pay_bldr, MAC_AC_TABLE_TYP.AC_PAY.value(), r);
			dbUpdate("MBBBL0110_MBT_AC_PAY_U01", pay, pay_bldr);
		}

		protected void setDecJnlFinCntSql(MCDBContainer dbc, MCQueryApiBuilder dbc_bldr, String acTblTyp, Chk01_DtlR r) {

			MBT_JNL_HISTORYD_R S1X = MBT_JNL_HISTORYD_R.create("X");

			dbc_bldr.setSetVL(dbc.getColumn$("jnl_fin_cnt"),
					((MCNumberPermColumn) dbc.getColumn$("jnl_fin_cnt")).subtract(value(1)));
			dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeEq(dbc.getColumn$("ac_ym"), bind("1")), r.ac_ym());
			dbc_bldr.addWhereWithAnd(MCQueryApiBuilder.makeGt(dbc.getColumn$("jnl_fin_cnt"), value(0)));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(7)).from(S1X)
					.where(value(0).eq(value(0))
							.and(S1X.jnl_grp_no.eq(bind("1")))
							.and(S1X.table_typ.eq(bind("2")))
							.and(MCQueryApiBuilder.makeEq(S1X.data_no, dbc.getColumn$("data_no"))))),
					r.jnl_grp_no(), acTblTyp);
		}

		protected void delHistory(Chk01_DtlR r) {
			MBT_JNL_HISTORY_R t = MBT_JNL_HISTORY_R.create("T");
			MBT_JNL_HISTORYD_R t1 = MBT_JNL_HISTORYD_R.create("T");

			execDbDeleteKey("MBBBL0110_MBT_JNL_HISTORY_D01", t, r.jnl_grp_no());
			execDbDelete("MBBBL0110_MBT_JNL_HISTORYD_D01", t1, t1.jnl_grp_no.eq(bind("1")), r.jnl_grp_no());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕訳備考を更新する。<br>
	 */
	public class Upd01 extends MBBBL_JnlHistory_MC_A.Upd01 {
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
			MCList<Chk02_DtlR> notErrL = getChkList(up0());
			upd(notErrL);
		}

		protected void editUp() {
			setPegNo(up0());
			up0().sort(Chk02_DtlR.$jnl_grp_no);
		}

		protected void callThisChk02() {
			MBBBL_JnlHistory.Chk02 o = MBBBL_JnlHistory.crtChk02();
			o.up0().addAll(up0());
			o.exec();
			up0().addAll(o.down0());
		}

		protected void upd(MCList<Chk02_DtlR> notErrL) {
			for (Chk02_DtlR r : notErrL) {
				MBT_JNL_HISTORY_R t = r.jnl_his();
				t.setAlias("T");
				MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
				r_bldr.setSet(t.jnl_rmrks);
				dbUpdateKey("MBBBL0110_MBT_JNL_HISTORY_U01", t, r_bldr);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 会計データを送信する。<br>
	 */
	public class Ins01 extends MBBBL_JnlHistory_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			execMain();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void execMain() {
			MBBBL_SendAcService.SendAc_Ins01 ope = crtSendAc_Ins01();
			addAll(ope.up0(), up0(), createMap_SendAc_Chk01_DtlR_Ins01_DtlR());
			ope.up0().setString(SendAc_Chk01_DtlR.$ext_sys_cd, up1().ext_sys_cd());
			ope.exec();
			String[] cols = new String[]{Ins01_DtlR.$err_flg, Ins01_DtlR.$rtn_sts_typ};
			copyByPegNo(up0(), cols, ope.down0(), cols);
		}
		protected  MBBBL_SendAcService.SendAc_Ins01 crtSendAc_Ins01() {
			if (isSAP()) {
				return MBBBL_SapSendAcService.crtSendAc_Ins01();
			}
			else {
				return MBBBL_SendAcService.crtSendAc_Ins01();
			}
		}
		protected boolean isSAP() {
			MAM_EXT_SYS_R rsltR = MAM_EXT_SYS_R.create();
			dbSelectKey("MBBBL0110_MAM_EXT_SYS_S01", rsltR, rsltR, up1());
			if (MAC_EXT_SYS_TYP.isAC_SAP(rsltR.ext_sys_typ())) {
				return true;
			}
			return false;
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_SendAc_Chk01_DtlR_Ins01_DtlR<SendAc_Chk01_DtlR,Ins01_DtlR> createMap_SendAc_Chk01_DtlR_Ins01_DtlR() {
			return new Map_SendAc_Chk01_DtlR_Ins01_DtlR<SendAc_Chk01_DtlR, Ins01_DtlR>();
		}

		public class Map_SendAc_Chk01_DtlR_Ins01_DtlR<D extends SendAc_Chk01_DtlR, S extends Ins01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendAc_Chk01_DtlR.$peg_no, Ins01_DtlR.$peg_no);
				addColumnPathMap(SendAc_Chk01_DtlR.$jnl_his, Ins01_DtlR.$jnl_his);
			}
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 送信済み会計データを取り消す。<br>
	 */
	public class Del02 extends MBBBL_JnlHistory_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			execMain();
			setDown();
		}

		protected void editUp() {
			setPegNo(up0());
		}

		protected void execMain() {
			MBBBL_SendAcService.SendAc_Del01 ope = MBBBL_SendAcService.crtSendAc_Del01();
			addAll(ope.up0(), up0(), createMap_SendAc_Chk02_DtlR_Del02_DtlR());
			ope.exec();
			String[] cols = new String[]{Del02_DtlR.$err_flg, Del02_DtlR.$rtn_sts_typ};
			copyByPegNo(up0(), cols, ope.down0(), cols);
		}

		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_SendAc_Chk02_DtlR_Del02_DtlR<SendAc_Chk02_DtlR,Del02_DtlR> createMap_SendAc_Chk02_DtlR_Del02_DtlR() {
			return new Map_SendAc_Chk02_DtlR_Del02_DtlR<SendAc_Chk02_DtlR, Del02_DtlR>();
		}

		public class Map_SendAc_Chk02_DtlR_Del02_DtlR<D extends SendAc_Chk02_DtlR, S extends Del02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendAc_Chk02_DtlR.$peg_no, Del02_DtlR.$peg_no);
				addColumnPathMap(SendAc_Chk02_DtlR.$jnl_his, Del02_DtlR.$jnl_his);
			}
		}
	}

	////////////////////////////////////////////////////////////////
	// Common

	/**
	 * ロック、更新カウンタチェック
	 */
	protected MCMessageList lock(MCList<? extends MCRow> bindL) {
		MCMessageList msgL = new MCMessageList();

		bindL.sort(MBT_JNL_HISTORY_R.$jnl_grp_no);

		MCList<MBT_JNL_HISTORY_R> selectL = MCList.create(MBT_JNL_HISTORY_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MBT_JNL_HISTORY_R.create("T"));
		selectL_bldr.setOrderByAsc(selectL_bldr.getBaseDbc().getKeyColumn$());

		dbSelectKeyForUpdateNoWait("MBBBL0110_MBT_JNL_HISTORY_S01", selectL, selectL_bldr, bindL);
		
		MCIndexKey idxkey = selectL.createIndex(MBT_JNL_HISTORY_R.$jnl_grp_no);

		for (MCRow r : bindL) {
			MBT_JNL_HISTORY_R selectR = selectL.getFirst(idxkey, r.getString(MBT_JNL_HISTORY_R.$jnl_grp_no));
			msgL.addAll(checkUpdCntrNE(r, MBT_JNL_HISTORY_R.$upd_cntr, selectR));
		}

		return msgL;
	}

	//FMCB CUSTOM END
}