package mcframe.serverMGBB.MGBBL0220;

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
import mcframe.serverMGBB.MGBBL0220.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0220.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_StWipReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_StWipReg_MC extends MGBBL_StWipReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月初仕掛を検索する<br>
	 */
	public class Srch01 extends MGBBL_StWipReg_MC_A.Srch01 {
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
			executeQuery(down0(), MGBBL0220_MGT_ST_WIP_S01(), up0());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月初仕掛を登録・訂正するために、チェックを行う<br>
	 */
	public class Chk01 extends MGBBL_StWipReg_MC_A.Chk01 {
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

			MCList<Chk01_RsltR> notErrUpdL = up0()
					.subList(r -> !r.err_flg() && r.isStatusModify());
			if (notErrUpdL.isEmpty()) {
				return msgL;
			}

			MCList<MGT_ST_WIP_R> selectL = MCList.create(MGT_ST_WIP_R.class);
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MGT_ST_WIP_R.create("T"));
			if (up1().file_imp_flg()) {
				selectPkWk("MGBBL0220_MGT_ST_WIP_S01", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, false, MGT_ST_WIP_R.$wg_cd,
						MGT_ST_WIP_R.$calc_grp_cd, MGT_ST_WIP_R.$ym);
			}
			else {
				selectForUpdateNoWaitPkWk("MGBBL0220_MGT_ST_WIP_S02", selectL, selectL_bldr.getBaseDbc(), notErrUpdL, MGT_ST_WIP_R.$wg_cd,
						MGT_ST_WIP_R.$calc_grp_cd, MGT_ST_WIP_R.$ym);
			}

			MCIndexKey idxkey = selectL.createIndex(MGT_ST_WIP_R.$st_wip_key);
			for (Chk01_RsltR r : notErrUpdL) {
				MGT_ST_WIP_R selectR = selectL.getFirst(idxkey, r.st_wip_key());

				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					if (up1().file_imp_flg()) {
						r.upd_cntr(selectR.upd_cntr());
					}
					else {
						msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
						// 計算ＮＯ確定チェック用に変更前の計算Ｇと年月を保持
						r.old_calc_grp_cd(selectR.calc_grp_cd());
						r.old_ym(selectR.ym());
					}
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ST_WIP_R.$wg_cd));
				}
			}
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			msgL.addAll(checkCalcFix(notErrL));

			for (Chk01_RsltR upR : notErrL) {

				msgL.add(chkOper(upR, Chk01_RsltR.$oper_act_no, Chk01_RsltR.$oper_cd,
						Chk01_RsltR.$oper_seq));

				// 小数有効桁数チェック
				msgL.addAll(
						checkDecPlace(upR, Chk01_RsltR.$dec_place, Chk01_RsltR.$wip_qty));

				// 費目別金額の小数有効桁数チェック
				int amtDecPlace = getBaseCur().amt_dec_place().intValue();
				int cnt = 0;
				for (String key : getExpnsColMap().keySet()) {
					if (cnt % 3 != 0) {
						msgL.addAll(checkDecPlace(upR, amtDecPlace, key));
					}
					cnt++;
				}

				// DACチェック
				msgL.addAll(checkWritableWgCdDac(upR, MGT_ST_WIP_R.$wg_cd));
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
	 * 月初仕掛を削除するために、チェックを行う<br>
	 */
	public class Chk02 extends MGBBL_StWipReg_MC_A.Chk02 {
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

			MCList<MGT_ST_WIP_R> selectL = MCList.create(MGT_ST_WIP_R.class);
			selectForUpdateNoWaitPkWk("MGBBL0220_MGT_ST_WIP_S03",
					selectL, MCQueryApiBuilder.create(MGT_ST_WIP_R.create("T")).getBaseDbc(), notErrL, MGT_ST_WIP_R.$wg_cd,
					MGT_ST_WIP_R.$calc_grp_cd, MGT_ST_WIP_R.$ym);

			MCIndexKey idxkey = selectL.createIndex(MGT_ST_WIP_R.$st_wip_key);
			for (Chk02_RsltR r : notErrL) {
				MGT_ST_WIP_R selectR = selectL.getFirst(idxkey, r.st_wip_key());
				if (isNull(selectR)) {
					msgL.addAll(getRecordNotFoundMsg(getModuleID(), selectL.createRow(), r));
				}
				else {
					selectR.setAttributes(r);
					// 更新カウンタチェック
					msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));
					// DACチェック
					msgL.addAll(checkWritableWgCdDac(selectR, MGT_ST_WIP_R.$wg_cd));

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
			MCList<Chk02_RsltR> notErrL = getChkList(up0());

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
	 * 月初仕掛を一括で削除するために、チェックを行う<br>
	 */
	public class Chk03 extends MGBBL_StWipReg_MC_A.Chk03 {
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
			if (!hasErrFlgOn(up0())) {
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
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ月初仕掛のチェック処理を行う<br>
	 */
	public class Imp01 extends MGBBL_StWipReg_MC_A.Imp01 {
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
			MGBBL_StWipReg.Chk01 ope = MGBBL_StWipReg.crtChk01();
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
	 * 月初仕掛を登録、訂正する<br>
	 */
	public class Upd01 extends MGBBL_StWipReg_MC_A.Upd01 {
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
			MGBBL_StWipReg.Chk01 ope = MGBBL_StWipReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(false);
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 月初仕掛の登録を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			MCList<Chk01_RsltR> updL = notErrL.subList(MCRow.MODIFY);
			MCList<MGT_ST_WIP_R> dbcL = MCList.create(MGT_ST_WIP_R.class);
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MGT_ST_WIP_R.create("T"));
			updL.forEach(r -> dbcL.add(r.dbc()));
			dbWkDelete("MGBBL0220_MGW_ST_WIP_D01", dbcL_bldr.getBaseDbc());
			dbWkInsert("MGBBL0220_MGW_ST_WIP_I01", dbcL, dbcL_bldr.getBaseDbc());
			delByWk();
			dbWkDelete("MGBBL0220_MGW_ST_WIP_D02", dbcL_bldr.getBaseDbc());

			MCList<Chk01_RsltR> insL = notErrL.subList(MCRow.CREATE);
			doSeqCache(MGC_NUM_SYS_TYP.ST_WIP_KEY.value(), insL.size());
			for (Chk01_RsltR r : insL) {
				r.st_wip_key(getSequence(MGC_NUM_SYS_TYP.ST_WIP_KEY.value()));
			}

			MCList<MGT_ST_WIP_EXPNS_R> stWipExpns = MCList.create(MGT_ST_WIP_EXPNS_R.class);
			for (Chk01_RsltR r : notErrL) {
				for (int i = 0; i < getExpnsColNames().length; i = i + 3) {
					MCNumber wipAmt = r.getNumber(getExpnsColNames()[i + 1]);
					MCNumber inptAmt = r.getNumber(getExpnsColNames()[i + 2]);

					if (!isNullAnd(wipAmt, inptAmt)) {
						MGT_ST_WIP_EXPNS_R rec = MGT_ST_WIP_EXPNS_R.create();
						rec.st_wip_key(r.st_wip_key());
						rec.expns_cd(getExpnsColMap().get(getExpnsColNames()[i]));
						rec.wip_amt(nvl(wipAmt, MCNumber.ZERO));
						rec.inpt_amt(nvl(inptAmt, MCNumber.ZERO));
						stWipExpns.add(rec);
					}
				}
			}
			dbInsertEx("MGBBL0220_MGT_ST_WIP_EXPNS_I01", stWipExpns, MCQueryApiBuilder.create(MGT_ST_WIP_EXPNS_R.create("T")));

			dbcL.clear();
			dbcL_bldr.removeSet(MGT_ST_WIP_R.$itm_ext);
			dbcL_bldr.removeValues(MGT_ST_WIP_R.$itm_ext);
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
	 * 月初仕掛を削除する<br>
	 */
	public class Del01 extends MGBBL_StWipReg_MC_A.Del01 {
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
			MGBBL_StWipReg.Chk02 ope = MGBBL_StWipReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 月初仕掛の削除を行う。
		 * @param notErrL エラーのない上り電文
		 */
		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}
			MCList<MGT_ST_WIP_R> stWip = MCList.create(MGT_ST_WIP_R.class);
			notErrL.forEach(r -> stWip.add(r.dbc()));

			MCQueryApiBuilder stWip_bldr = MCQueryApiBuilder.create(MGT_ST_WIP_R.create("T"));
			dbWkDelete("MGBBL0220_MGW_ST_WIP_D03", stWip_bldr.getBaseDbc());
			dbWkInsert("MGBBL0220_MGW_ST_WIP_I02", stWip, stWip_bldr.getBaseDbc());
			delByWk();
			dbWkDelete("MGBBL0220_MGW_ST_WIP_D04", stWip_bldr.getBaseDbc());

			dbDeleteKey("MGBBL0220_MGT_ST_WIP_D01", stWip, stWip_bldr);
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
	 * 月初仕掛を一括で削除する<br>
	 */
	public class Del02 extends MGBBL_StWipReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk03();
			throwDelErr();
			MCQueryApiBuilder stWip_bldr = createStStk();
			MCQueryApiBuilder stWipExpns_bldr = createStStkExpns();
			lock(stWip_bldr);
			del(stWip_bldr, stWipExpns_bldr);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MGBBL_StWipReg.Chk03 ope = MGBBL_StWipReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyvalue(up0(), ope.down0());
		}

		protected MCQueryApiBuilder createStStk() {
			MAM_LOC_R S1W = MAM_LOC_R.create("W");
			MGT_ST_WIP_R t = MGT_ST_WIP_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithCutOffAnd(t.loc_cd.like(bind("loc_cd")));
			dbc_bldr.addWhereWithCutOffAnd(exists(subQuery().select(value("X")).from(S1W)
					.where(S1W.loc_cd.eq(t.loc_cd)
							.and(S1W.site_cd.like(bind("site_cd"))))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			return dbc_bldr;
		}

		protected MCQueryApiBuilder createStStkExpns() {
			MGT_ST_WIP_R S1W1 = MGT_ST_WIP_R.create("W1");
			MAM_LOC_R S2W2 = MAM_LOC_R.create("W2");
			MGT_ST_WIP_EXPNS_R t = MGT_ST_WIP_EXPNS_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W1)
					.where(value(0).eq(value(0))
							.and(S1W1.st_wip_key.eq(t.st_wip_key))
							.and(S1W1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1W1.wg_cd.eq(bind("wg_cd")))
							.and(S1W1.ym.eq(bind("ym")))
							.cutoff$and(exists(subQuery().select(value("X")).from(S2W2)
									.where(S2W2.loc_cd.eq(S1W1.loc_cd)
											.and(S2W2.site_cd.like(bind("site_cd"))))))
							.cutoff$and(S1W1.loc_cd.like(bind("loc_cd"))))));
			return dbc_bldr;
		}

		protected void lock(MCQueryApiBuilder dbc_bldr) {
			dbSelectForUpdateNoWaitNoFetch("MGBBL0220_MGT_ST_WIP_S04", dbc_bldr, up0());
		}

		protected void del(MCQueryApiBuilder stWip_bldr, MCQueryApiBuilder stWipExpns_bldr) {
			stWipExpns_bldr.buildDelete("MGBBL0220_MGT_ST_WIP_EXPNS_D01").executeUpdate(up0());
			stWip_bldr.buildDelete("MGBBL0220_MGT_ST_WIP_D02").executeUpdate(up0());
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
		String[] stringArray = {
				"T.ttl", "T.wip_amt", "T.inpt_amt"
		};
		return stringArray;
	}

	// -----------------------------------------------
	// Common

	protected void delByWk() {
		MGW_ST_WIP_KEY_R S1W1 = MGW_ST_WIP_KEY_R.create("W1");
		MGT_ST_WIP_EXPNS_R t = MGT_ST_WIP_EXPNS_R.create("T");
		MCQueryApiBuilder stWipExpns_bldr = MCQueryApiBuilder.create(t);
		stWipExpns_bldr.setWhere(exists(subQuery().select(value("X")).from(S1W1).where(S1W1.st_wip_key.eq(t.st_wip_key))));
		stWipExpns_bldr.buildDelete("MGBBL0220_MGT_ST_WIP_EXPNS_D02").executeUpdate();
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
			for (MCRow r : up.groupBy(Chk01_RsltR.$old_calc_grp_cd,
					Chk01_RsltR.$old_ym)) {
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
		MCIndexKey idxkey = up.createIndex(MGT_CALC_FIX_R.$calc_grp_cd,
				MGT_CALC_FIX_R.$ym);
		for (MGT_CALC_FIX_R r : list.groupBy(MGT_CALC_FIX_R.$calc_grp_cd,
				MGT_CALC_FIX_R.$ym)) {
			String calcGrpCd = r.calc_grp_cd();
			MCDate ym = r.ym();
			MCMessage mcm = chkCalcFix(calcGrpCd, ym);
			if (mcm != null) {
				for (MCRow row : up.subList(idxkey, calcGrpCd, ym)) {
					msgList.add(
							new MCMessage(row, null, mcm.getID(), mcm.getBindArray()));
				}
				if (oldidxkey != null) {
					for (MCRow row : up.subList(oldidxkey, calcGrpCd, ym)) {
						if (!isSame(row.getString(MGT_CALC_FIX_R.$calc_grp_cd),
								row.getString(Chk01_RsltR.$old_calc_grp_cd))
								|| !isSame(row.getDate(MGT_CALC_FIX_R.$ym),
										row.getDate(Chk01_RsltR.$old_ym))) {
							msgList.add(new MCMessage(row, null, mcm.getID(),
									mcm.getBindArray()));
						}
					}
				}
			}
		}
		return msgList;
	}

	//FMCB CUSTOM END
}