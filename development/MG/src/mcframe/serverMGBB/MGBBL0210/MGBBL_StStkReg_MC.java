package mcframe.serverMGBB.MGBBL0210;

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
import mcframe.serverMG.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMGBB.MGBBL0210.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0210.Query.*;
import java.util.ArrayList;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_StStkReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_StStkReg_MC extends MGBBL_StStkReg_MC_A{
	//FMCB CUSTOM START

	protected String _CALC_GRP_EVAL_TYP = "calc_grp_eval_typ";
	protected String _RUNTIME_WG_CD = "runtime_wg_cd";
	protected String _TERM = "term";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月初在庫を検索する<br>
	 */
	public class Srch01 extends MGBBL_StStkReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}

		protected void editUp() {
			editUpCom(up0());
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBBL0210_MGT_ST_STK_S01(), up0());
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月初在庫を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBBL_StStkReg_MC_A.Chk01 {
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

			MCList<Chk01_RsltR> notErrUpdL = up0().subList(r -> !r.err_flg() && r.isStatusModify());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}
			
			MCList<MGT_ST_STK_R> selectL = MCList.create(MGT_ST_STK_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ST_STK_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBBL0210_MGT_ST_STK_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, MGT_ST_STK_R.$wg_cd, MGT_ST_STK_R.$calc_grp_cd, MGT_ST_STK_R.$ym, MGT_ST_STK_R.$std_flg);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBBL0210_MGT_ST_STK_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, MGT_ST_STK_R.$wg_cd, MGT_ST_STK_R.$calc_grp_cd, MGT_ST_STK_R.$ym, MGT_ST_STK_R.$std_flg);
			}
			
			MCIndexKey idxkey = selectL.createIndex(MGT_ST_STK_R.$st_stk_key);
			for (Chk01_RsltR r : notErrUpdL) {
				MGT_ST_STK_R selectR = selectL.getFirst(idxkey, r.st_stk_key());

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg()) {
						r.upd_cntr(selectR.upd_cntr());
						r.std_flg(selectR.std_flg());
					}
					else {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						// 計算ＮＯ確定チェック用に変更前の計算Ｇと年月を保持
						r.old_calc_grp_cd(selectR.calc_grp_cd());
						r.old_ym(selectR.ym());
					}
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ST_STK_R.$wg_cd));
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(checkCalcFix(notErrL));

			for (Chk01_RsltR upR : notErrL){

				// 小数有効桁数チェック
				msgL.addAll(checkDecPlace(upR, Chk01_RsltR.$dec_place, Chk01_RsltR.$qty));

				// 費目別金額の小数有効桁数チェック
				int amtDecPlace = getBaseCur().amt_dec_place().intValue();
				for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
					msgL.addAll(checkDecPlace(upR, amtDecPlace, e.getKey()));
				}

				// 資産区分のチェック
				if (isNull(upR.bp_cd())) {
					msgL.add(chkAsstNoOth(upR, Chk01_RsltR.$asst_typ));
				}

				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_ST_STK_R.$wg_cd));
				if (isNull(upR.bp_cd()) || MAC_ASST_TYP.isOTH(upR.asst_typ())) {
					if (upR.repurc_obli_flg()) {
						msgL.add(new MCMessage(upR, MGT_ST_STK_R.$repurc_obli_flg, MGBBL0024, toDispGUIIndex(upR)));
					}
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
	 * Chk02オペレーション.<p>
	 *
	 * 月初在庫を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBBL_StStkReg_MC_A.Chk02 {
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
			
			MCList<MGT_ST_STK_R> selectL = MCList.create(MGT_ST_STK_R.class);
			selectForUpdateNoWaitPkWk("MGBBL0210_MGT_ST_STK_S03",
					selectL, MCQueryApiBuilder.create(MGT_ST_STK_R.create("T")).getBaseDbc(), notErrL, MGT_ST_STK_R.$wg_cd, MGT_ST_STK_R.$calc_grp_cd, MGT_ST_STK_R.$ym);

			MCIndexKey idxkey = selectL.createIndex(MGT_ST_STK_R.$st_stk_key);
			for (Chk02_RsltR r : notErrL) {
				MGT_ST_STK_R selectR = selectL.getFirst(idxkey, r.st_stk_key());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ST_STK_R.$wg_cd));

					// 計算ＮＯ確定チェック用に計算Ｇと年月を保持
					r.calc_grp_cd(selectR.calc_grp_cd());
					r.ym(selectR.ym());
				}
			}
			return msgL;
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(checkCalcFix(notErrL));

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
	 * 月初在庫を一括で削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBBL_StStkReg_MC_A.Chk03 {
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
			msgL.addAll(chk());
			return msgL;
		}

		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// 原価計算ＮＯ確定チェック
				msgL.add(chkCalcFix(up0().calc_grp_cd(), up0().ym()));
				// DACチェック 
				msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));
			}
			return msgL;
		}

		/** 下り電文設定 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 月初在庫を評価替えするために、チェックを行う<br>
	 */
	public class Chk04 extends MGBBL_StStkReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chk());
			return msgL;
		}

		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			// DACチェック 
			msgL.addAll(checkWritableWgCdDac(up0(), Chk04_RsltR.$wg_cd));

			return msgL;
		}
	}
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 月初在庫を一括評価替えするために、チェックを行う<br>
	 */
	public class Chk05 extends MGBBL_StStkReg_MC_A.Chk05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chk());
			return msgL;
		}

		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// DACチェック 
				if (!isNull(up0().wg_cd())) {
					for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
						up0().wg_cd(wg);
						msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));
					}
				}
			}
			return msgL;
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
	 * ファイルから取り込んだ月初在庫のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBBL_StStkReg_MC_A.Imp01 {
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
			MGBBL_StStkReg.Chk01 ope = MGBBL_StStkReg.crtChk01();
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
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 月初在庫を登録、訂正する<br>
	 */
	public class Upd01 extends MGBBL_StStkReg_MC_A.Upd01 {
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
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBBL_StStkReg.Chk01 ope = MGBBL_StStkReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 月初在庫の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}

			MCList<Chk01_RsltR> updL = notErrL.subList(MCRow.MODIFY);
			MCList<MGT_ST_STK_R> dbcL = MCList.create(MGT_ST_STK_R.class);
			updL.forEach(r -> dbcL.add(r.dbc()));
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MGT_ST_STK_R.create("T"));
			dbWkDelete("MGBBL0210_MGW_ST_STK_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MGBBL0210_MGW_ST_STK_I01", dbcL, dbcL_bldr.getBaseDbc());
			delByWk();
			dbWkDelete("MGBBL0210_MGW_ST_STK_D02", dbcL_bldr.getBaseDbc());

			MCList<Chk01_RsltR> insL = notErrL.subList(MCRow.CREATE);
			doSeqCache(MGC_NUM_SYS_TYP.ST_STK_KEY.value(), insL.size());
			for (Chk01_RsltR r : insL) {
				r.st_stk_key(getSequence(MGC_NUM_SYS_TYP.ST_STK_KEY.value()));
			}

			MCList<MGT_ST_STK_EXPNS_R> stStkExpns = MCList.create(MGT_ST_STK_EXPNS_R.class);
			for (Chk01_RsltR r : notErrL) {
				for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
					MCNumber n = r.getNumber(e.getKey());
					if (!isNull(n)) {
						MGT_ST_STK_EXPNS_R rec = MGT_ST_STK_EXPNS_R.create();
						rec.st_stk_key(r.st_stk_key());
						rec.expns_cd(e.getValue());
						rec.amt(n);
						stStkExpns.add(rec);
					}
				}
			}
			dbInsertEx("MGBBL0210_MGT_ST_STK_EXPNS_I01", stStkExpns, MCQueryApiBuilder.create(MGT_ST_STK_EXPNS_R.create("T")));

			dbcL.clear();
			dbcL_bldr.removeSet(MGT_ST_STK_R.$itm_ext, MGT_ST_STK_R.$std_flg);
			dbcL_bldr.removeValues(MGT_ST_STK_R.$itm_ext, MGT_ST_STK_R.$std_flg);
			notErrL.forEach(r -> dbcL.add(r.dbc()));
			dbUpdByStatus(dbcL, dbcL_bldr);
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
	 * Del01オペレーション.<p>
	 *
	 * 月初在庫を削除する<br>
	 */
	public class Del01 extends MGBBL_StStkReg_MC_A.Del01 {
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
			MGBBL_StStkReg.Chk02 ope = MGBBL_StStkReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 月初在庫の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if(notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ST_STK_R> stStk = MCList.create(MGT_ST_STK_R.class);
			notErrL.forEach(r -> stStk.add(r.dbc()));

			MCQueryApiBuilder stStk_bldr = MCQueryApiBuilder.create(MGT_ST_STK_R.create("T"));
			dbWkDelete("MGBBL0210_MGW_ST_STK_D03", stStk_bldr.getBaseDbc());
			dbWkInsert("MGBBL0210_MGW_ST_STK_I02", stStk, stStk_bldr.getBaseDbc());
			delByWk();
			dbWkDelete("MGBBL0210_MGW_ST_STK_D04", stStk_bldr.getBaseDbc());

			dbDeleteKey("MGBBL0210_MGT_ST_STK_D01", stStk, stStk_bldr);
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
	 * 月初在庫を一括で削除する<br>
	 */
	public class Del02 extends MGBBL_StStkReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			callThisChk03();
			throwDelErr();
			MCQueryApiBuilder stStk_bldr = createStStk();
			MCQueryApiBuilder stStkExpns_bldr = createStStkExpns();
			MCQueryApiBuilder stStkDiff_bldr = createStStkDiff();
			lock(stStk_bldr);
			del(stStk_bldr, stStkExpns_bldr, stStkDiff_bldr);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBBL_StStkReg.Chk03 ope = MGBBL_StStkReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
		}

		protected MCQueryApiBuilder createStStk() {
			MGT_ST_STK_R t = MGT_ST_STK_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithCutOffAnd(t.mng_dpt_cd.like(bind("mng_dpt_cd")));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			return dbc_bldr;
		}
		protected MCQueryApiBuilder createStStkExpns() {
			MGT_ST_STK_R S1W1 = MGT_ST_STK_R.create("W1");
			MGT_ST_STK_EXPNS_R t = MGT_ST_STK_EXPNS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W1)
					.where(value(0).eq(value(0))
							.and(S1W1.st_stk_key.eq(t.st_stk_key))
							.and(S1W1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1W1.wg_cd.eq(bind("wg_cd")))
							.and(S1W1.ym.eq(bind("ym")))
							.cutoff$and(S1W1.mng_dpt_cd.like(bind("mng_dpt_cd"))))));
			return dbc_bldr;
		}
		protected MCQueryApiBuilder createStStkDiff() {
			MGT_ST_STK_R S1W1 = MGT_ST_STK_R.create("W1");
			MGT_ST_STK_DIFF_R t = MGT_ST_STK_DIFF_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W1)
					.where(value(0).eq(value(0))
							.and(S1W1.st_stk_key.eq(t.st_stk_key))
							.and(S1W1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1W1.wg_cd.eq(bind("wg_cd")))
							.and(S1W1.ym.eq(bind("ym")))
							.cutoff$and(S1W1.mng_dpt_cd.like(bind("mng_dpt_cd"))))));
			return dbc_bldr;
		}
		protected void lock(MCQueryApiBuilder dbc_bldr) {
			dbSelectForUpdateNoWaitNoFetch("MGBBL0210_MGT_ST_STK_S04", dbc_bldr, up0());
		}
		protected void del(MCQueryApiBuilder stStk_bldr, MCQueryApiBuilder stStkExpns_bldr, MCQueryApiBuilder stStkDiff_bldr) {
			stStkExpns_bldr.buildDelete("MGBBL0210_MGT_ST_STK_EXPNS_D01").executeUpdate(up0());
			stStkDiff_bldr.buildDelete("MGBBL0210_MGT_ST_STK_DIFF_D01").executeUpdate(up0());
			stStk_bldr.buildDelete("MGBBL0210_MGT_ST_STK_D02").executeUpdate(up0());
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 月初在庫を評価替えする<br>
	 */
	public class Upd02 extends MGBBL_StStkReg_MC_A.Upd02 {
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
			callThisChk04();
			throwUpdErr();
			delWk();
			insWk();
			callProc();
			delWk();
		}

		protected void callThisChk04() {
			MGBBL_StStkReg.Chk04 ope = MGBBL_StStkReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
		}

		protected void insWk() {
			MCList<MGT_ST_STK_R> dbcL = MCList.create(MGT_ST_STK_R.class);
			up0().forEach(r -> dbcL.add(r.dbc()));
			dbWkInsert("MGBBL0210_MGW_ST_STK_I03", dbcL, MCQueryApiBuilder.create(MGT_ST_STK_R.create("T")).getBaseDbc());
		}
	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * 月初在庫を一括で評価替えする<br>
	 */
	public class Upd03 extends MGBBL_StStkReg_MC_A.Upd03 {
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
			callThisChk05();
			throwUpdErr();
			editUpCom(up0());
			delWk();
			insWk();
			callProc();
			delWk();
		}

		protected void callThisChk05() {
			MGBBL_StStkReg.Chk05 ope = MGBBL_StStkReg.crtChk05();
			ope.up0().calc_grp_cd(up0().calc_grp_cd());
			ope.up0().wg_cd(up0().wg_cd());
			ope.up0().ym(up0().ym_fr());
			ope.up0().std_bf_flg(up0().std_bf_flg());
			ope.up0().std_af_flg(up0().std_af_flg());
			ope.exec();
		}

		protected void insWk() {
			executeUpdate(MGBBL0210_MGW_ST_STK_KEY_I01(), up0());
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
		list.add(MAC_EXPNS_TYP.SPPL.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.amt"
		};
		return stringArray;
	}

	// -----------------------------------------------
	// Common
	protected void editUpCom(Srch01_CndR up) {
		up.addStringColumn("no_bp_flg_str", toTrueStr(up.no_bp_flg()));

		up.addStringColumn(_CALC_GRP_EVAL_TYP, null);
		up.addStringColumn(_RUNTIME_WG_CD, null);
		up.addDateColumn(_TERM, null);

		if (!isNull(up.eval_typ())) {
			MCList<MCRow> calcCtgL = MCList.create(MCRow.class);
			MAM_CALC_GRP_R calcGrpR = MAM_CALC_GRP_R.create();
			MAM_TERM_R term = MAM_TERM_R.create();
			MAM_TERM_R t1 = MAM_TERM_R.create("T");
			MCQueryApiBuilder term_bldr = MCQueryApiBuilder.create(t1);
			term_bldr.addWhereWithAnd(t1.term.lte(bind("1")), up.ym_fr());
			term_bldr.addWhereWithAnd(t1.term_end_ym.gt(bind("1")), up.ym_fr());
			dbSelect("MGBBL0210_MAM_TERM_S01", term, term_bldr);

			MAM_CALC_GRP_R t2 = MAM_CALC_GRP_R.create("T");
			MCQueryApiBuilder calcGrpR_bldr = MCQueryApiBuilder.create(t2);
			calcGrpR_bldr.setSelect(t2.calc_grp_cd);
			calcGrpR_bldr.addSelect(t2.eval_typ);
			calcGrpR_bldr.addSelect(t2.runtime_wg_cd);
			dbSelectKey("MGBBL0210_MAM_CALC_GRP_S01", calcGrpR, calcGrpR_bldr, up);
			
			up.setStringNE(_CALC_GRP_EVAL_TYP, calcGrpR.eval_typ());
			up.setStringNE(_RUNTIME_WG_CD, calcGrpR.runtime_wg_cd());
			
			if (!isNull(term.term())) {
				up.setDateNE(_TERM, term.term());
			}
			
			getCalcCtgL(calcCtgL, calcGrpR);
			createGwFixItm(calcCtgL, up);
		}
	}

	protected void createGwFixItm(MCList<MCRow> calcCtgL, Srch01_CndR up) {
		for (MCRow row : calcCtgL) {
			up.addStringColumn(MGW_FIX_ITM_R.$calc_ctg_cd, row.getStringNE(MGW_FIX_ITM_R.$calc_ctg_cd));
			executeUpdate(MGBBL0210_MGW_FIX_ITM_I01(), up);
		}
	}

	protected void getCalcCtgL(MCList<MCRow> calcCtgL, MAM_CALC_GRP_R calcGrpR) {
		executeQuery(calcCtgL, MGBBL0210_MAM_GRP_CTG_S01(), calcGrpR);
	}

	protected void delByWk() {
		MGW_ST_STK_KEY_R S1W1 = MGW_ST_STK_KEY_R.create("W1");
		MGT_ST_STK_EXPNS_R t1 = MGT_ST_STK_EXPNS_R.create("T");
		MCQueryApiBuilder stStkExpns_bldr = MCQueryApiBuilder.create(t1);
		stStkExpns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1).where(S1W1.st_stk_key.eq(t1.st_stk_key))));
		stStkExpns_bldr.buildDelete("MGBBL0210_MGT_ST_STK_EXPNS_D02").executeUpdate();

		MGW_ST_STK_KEY_R S2W1 = MGW_ST_STK_KEY_R.create("W1");
		MGT_ST_STK_DIFF_R t2 = MGT_ST_STK_DIFF_R.create("T");
		MCQueryApiBuilder stStkDiff_bldr = MCQueryApiBuilder.create(t2);
		stStkDiff_bldr.setWhere(exists(subQuery().select(value("X")).from(S2W1).where(S2W1.st_stk_key.eq(t2.st_stk_key))));
		stStkDiff_bldr.buildDelete("MGBBL0210_MGT_ST_STK_DIFF_D02").executeUpdate();
	}

	protected void callProc() {
		execProc(createSqlId(LOGIC_ID, "MGPA_CALC_ST_STK$P_MAIN", "01"), "MGPA_CALC_ST_STK$P_MAIN");
	}

	protected void delWk() {
		dbWkDelete("MGBBL0210_MGW_ST_STK_D05", MCQueryApiBuilder.create(MGT_ST_STK_R.create("T")).getBaseDbc());
	}

	/**
	 * 計算Ｇ・年月に対して原価計算ＮＯが確定されているかどうかチェック
	 * @param mL
	 */
	protected MCMessageList checkCalcFix(MCList<? extends MCRow> up) {
		MCMessageList msgList = new MCMessageList();
		if (up.isEmpty()) {
			return msgList;
		}

		MCList<MGT_CALC_FIX_R> list = MCList.create(MGT_CALC_FIX_R.class);

		for (MCRow r : up.groupBy(MGT_CALC_FIX_R.$calc_grp_cd, MGT_CALC_FIX_R.$ym)) {
			String calcGrpCd = r.getStringNE(MGT_CALC_FIX_R.$calc_grp_cd);
			MCDate ym = r.getDateNE(MGT_CALC_FIX_R.$ym);
			MGT_CALC_FIX_R t = MGT_CALC_FIX_R.create();
			t.calc_grp_cd(calcGrpCd);
			t.ym(ym);
			list.add(t);
		}
		MCIndexKey oldidxkey = null;
		if (up.get(0).contains(Chk01_RsltR.$old_calc_grp_cd)) {
			for (MCRow r : up.groupBy(Chk01_RsltR.$old_calc_grp_cd, Chk01_RsltR.$old_ym)) {
				String calcGrpCd = r.getStringNE(Chk01_RsltR.$old_calc_grp_cd);
				MCDate ym = r.getDateNE(Chk01_RsltR.$old_ym);
				if (!isNullOr(calcGrpCd, ym)) {
					MGT_CALC_FIX_R t = MGT_CALC_FIX_R.create();
					t.calc_grp_cd(calcGrpCd);
					t.ym(ym);
					list.add(t);
				}
			}
			oldidxkey = up.createIndex(Chk01_RsltR.$old_calc_grp_cd, Chk01_RsltR.$old_ym);
		}
		MCIndexKey idxkey = up.createIndex(MGT_CALC_FIX_R.$calc_grp_cd, MGT_CALC_FIX_R.$ym);
		for (MGT_CALC_FIX_R r : list.groupBy(MGT_CALC_FIX_R.$calc_grp_cd, MGT_CALC_FIX_R.$ym)) {
			String calcGrpCd = r.calc_grp_cd();
			MCDate ym = r.ym();
			MCMessage mcm = chkCalcFix(calcGrpCd, ym);
			if (mcm != null) {
				for (MCRow row : up.subList(idxkey, calcGrpCd, ym)) {
					msgList.add(new MCMessage(row, null, mcm.getID(), mcm.getBindArray()));
				}
				if (oldidxkey != null) {
					for (MCRow row : up.subList(oldidxkey, calcGrpCd, ym)) {
						if (!isSame(row.getString(MGT_CALC_FIX_R.$calc_grp_cd),
								row.getString(Chk01_RsltR.$old_calc_grp_cd))
								|| !isSame(row.getDate(MGT_CALC_FIX_R.$ym), row.getDate(Chk01_RsltR.$old_ym))) {
							msgList.add(new MCMessage(row, null, mcm.getID(), mcm.getBindArray()));
						}
					}
				}
			}
		}
		return msgList;
	}

	//FMCB CUSTOM END
}