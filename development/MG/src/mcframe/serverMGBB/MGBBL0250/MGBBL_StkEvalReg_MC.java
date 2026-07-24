package mcframe.serverMGBB.MGBBL0250;

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
import mcframe.serverMGBB.MGBBL0250.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0250.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_DuplicateValidater;
import mcframe.serverFXUC.FXUCL0170.IfValidater;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_StkEvalReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_StkEvalReg_MC extends MGBBL_StkEvalReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月末在庫評価を検索する<br>
	 */
	public class Srch01 extends MGBBL_StkEvalReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchActStk();
		}

		protected void editUp() {
			setGrpFlg(up0(), "itm_grp");
		}

		protected void srchActStk() {
			executeQuery(down0(), MGBBL0250_MGT_STK_EVAL_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月末在庫評価を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBBL_StkEvalReg_MC_A.Chk01 {
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
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> notErrUpdL = getChkList(up0());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_STK_EVAL_R> selectL = MCList.create(MGT_STK_EVAL_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_STK_EVAL_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBBL0250_MGT_STK_EVAL_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBBL0250_MGT_STK_EVAL_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL);
			}
			
			String[] keys = selectL.createRow().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk01_RsltR r : notErrUpdL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_STK_EVAL_R selectR = selectL.getFirst(idxkey, binds);
				
				if (isNull(selectR)) {
					if (up1().file_imp_flg()) {
						r.setStatus(MCRow.CREATE);
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg() || up1().file_ins_flg()) {
						r.setStatus(MCRow.MODIFY);
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						if (r.isStatusModify()) {
							msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						}
						else {
							msgL.addAll(getRecordFoundMsg(getModuleID(), selectL.createRow(), r));
						}
					}
					if (r.isStatusModify()) {
						// DACチェック
						msgL.addAll(checkWritableWgCdDac(selectR, MGT_STK_EVAL_R.$wg_cd));
					}
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			for (Chk01_RsltR upR : notErrL){
				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_STK_EVAL_R.$wg_cd));

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$dec_place, Chk01_RsltR.$base_qty));
				msgL.addAll(checkDecPlace(upR, getBaseCur().upri_dec_place().intValue(), Chk01_RsltR.$upri));

				// 資産区分のチェック
				msgL.add(chkAsstNoOth(upR, Chk01_RsltR.$asst_typ));
			}

			return msgL;
		}

		@Override
		protected boolean useChkErrUpperLimit() {
			return up1().file_ins_flg();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected IfValidater getDuplicateValidater(String[] cols) {
			return new FXUCL_DuplicateValidater(true);
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 月末在庫評価を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBBL_StkEvalReg_MC_A.Chk02 {
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
			MCMessageList msgL = new MCMessageList();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_STK_EVAL_R> selectL = MCList.create(MGT_STK_EVAL_R.class);
			selectForUpdateNoWaitPkWk("MGBBL0250_MGT_STK_EVAL_S03",
					selectL, MCQueryApiBuilder.create(MGT_STK_EVAL_R.create("T")).getBaseDbc(), notErrL);

			String[] keys = selectL.createRow().getKeyColumn();
			MCIndexKey idxkey = selectL.createIndex(keys);
			for (Chk02_RsltR r : notErrL) {
				Comparable<?>[] binds = r.toArray(keys);
				MGT_STK_EVAL_R selectR = selectL.getFirst(idxkey, binds);
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_STK_EVAL_R.$wg_cd));
				}
			}
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
	 * 月末在庫評価を一括で削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBBL_StkEvalReg_MC_A.Chk03 {
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
		 * DAC
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			Chk03_CndR up0 = up0().clone();
			for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
				up0.wg_cd(wg);
				msgL.addAll(checkWritableWgCdDac(up0, Chk03_CndR.$wg_cd));
			}

			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		@Override
		protected void initUpSub() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 月末在庫評価を一括で登録するために、チェックを行う<br>
	 */
	public class Chk04 extends MGBBL_StkEvalReg_MC_A.Chk04 {
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
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk04_CndR> notErrL = getChkList(up0());

			for (Chk04_CndR upR : notErrL){
				// DACチェック
				Chk04_CndR up0 = upR.clone();
				for (String wg : MCStringUtil.arrayValueSplit(upR.wg_cd())) {
					up0.wg_cd(wg);
					msgL.addAll(checkWritableWgCdDac(up0, MGT_STK_EVAL_R.$wg_cd));
				}
			}

			return msgL;
		}
		
		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
		
		@Override
		protected void initUpSub() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
		}
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ月末在庫評価のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBBL_StkEvalReg_MC_A.Imp01 {
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
		
		protected void editUp() {
			setPegNo(up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBBL_StkEvalReg.Chk01 ope = MGBBL_StkEvalReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 月末在庫評価を登録、訂正する<br>
	 */
	public class Upd01 extends MGBBL_StkEvalReg_MC_A.Upd01 {
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
			upd01Main(up0(), false);
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
	 * Upd02オペレーション.<p>
	 *
	 * 月末在庫評価を一括登録する<br>
	 */
	public class Upd02 extends MGBBL_StkEvalReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			callThisChk04();
			throwUpdErr();
			try {
				initBatchLogger(dbTran());
				writeStartLogWithLogger(null);
				for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
					up0().wg_cd(wg);
					execMain();
				}
			}
			catch (Exception ex) {
				handleExWithLogger(ex);
			}
			finally {
				writeEndLogWithLogger(null);
			}
		}

		protected void execMain() {
			String procId = "MGPA_STK_EVAL$P_MAIN";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, 
					":calc_ctg_cd, " +
					":wg_cd, " +
					":ym, " +
					":stk_eval_cd, " +
					":calc_grp_cd, " +
					":calc_no, " +
					":ym_fr, " +
					":ym_to");
			}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MGBBL_StkEvalReg.Chk04 ope = MGBBL_StkEvalReg.crtChk04();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 月末在庫評価を削除する<br>
	 */
	public class Del01 extends MGBBL_StkEvalReg_MC_A.Del01 {
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
			MGBBL_StkEvalReg.Chk02 ope = MGBBL_StkEvalReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 在庫実績ＩＦの削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_STK_EVAL_R> dbcL = MCList.create(MGT_STK_EVAL_R.class);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbDeleteKey("MGBBL0250_MGT_STK_EVAL_D01", dbcL, MCQueryApiBuilder.create(MGT_STK_EVAL_R.create("T")));
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 月末在庫評価を一括で削除する<br>
	 */
	public class Del02 extends MGBBL_StkEvalReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisChk03();
			throwDelErr();
			MGT_STK_EVAL_R t = MGT_STK_EVAL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			createDbc(t, dbc_bldr);
			lock(t, dbc_bldr);
			del(t, dbc_bldr);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBBL_StkEvalReg.Chk03 ope = MGBBL_StkEvalReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
		}

		protected void createDbc(MGT_STK_EVAL_R t, MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithCutOffAnd(t.stk_eval_cd.like(bind("stk_eval_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.mng_dpt_cd.like(bind("mng_dpt_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
		}
		protected void lock(MGT_STK_EVAL_R dbc, MCQueryApiBuilder dbc_bldr) {
			dbSelectForUpdateNoWaitNoFetch("MGBBL0250_MGT_STK_EVAL_S04", dbc_bldr, up0());
		}
		protected void del(MGT_STK_EVAL_R dbc, MCQueryApiBuilder dbc_bldr) {
			dbc_bldr.buildDelete("MGBBL0250_MGT_STK_EVAL_D02").executeUpdate(up0());
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * ファイルから取り込んだ月末在庫評価を登録する<br>
	 */
	public class Ins01 extends MGBBL_StkEvalReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			upd01Main(up0(), true);
		}
	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 一括削除後にファイルから取り込んだ月末在庫評価を登録する<br>
	 */
	public class Ins02 extends MGBBL_StkEvalReg_MC_A.Ins02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisDel02();
			upd01Main(up1(), true);
		}
		
		protected void callThisDel02() {
			MGBBL_StkEvalReg.Del02 ope = MGBBL_StkEvalReg.crtDel02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
	}
	
	//////////////////////////////////////////////////////////////////////
	// Upd01/Ins01/Ins02 Common
	protected void upd01Main(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		upd01Edit(upL);
		upd01Chk(upL, file_ins_flg);
		if (file_ins_flg) {
			throwUpdErr();
		}
		upd01Reg(upL);
	}

	protected void upd01Edit(MCList<Chk01_RsltR> upL) {
		setPegNo(upL);
	}
	
	protected void upd01Chk(MCList<Chk01_RsltR> upL, boolean file_ins_flg) {
		MGBBL_StkEvalReg.Chk01 ope = MGBBL_StkEvalReg.crtChk01();
		ope.up0().setAll(upL);
		ope.up1().file_ins_flg(file_ins_flg);
		ope.exec();
		upL.setAll(ope.down0());
	}
	
	protected void upd01Reg(MCList<Chk01_RsltR> upL) {
		MCList<Chk01_RsltR> notErrL = upL.subList(r -> !r.err_flg());
		if(notErrL.isEmpty()) {
			return;
		}

		MCList<MGT_STK_EVAL_R> dbcL = MCList.create(MGT_STK_EVAL_R.class);
		notErrL.forEach(r -> dbcL.add(r.dbc()));
		dbUpdByStatus(dbcL);
	}
		
	//////////////////////////////////////////////////////////////////////

	//FMCB CUSTOM END
}