package mcframe.serverMGBE.MGBEL0100;

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
import mcframe.serverMGBE.MGBEL0100.*; // このimportはFrameManagerの自動生成で追加されました。

import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.serverMGBE.MGBEL0100.Query.*;
import static mcframe.commonFX.notice.FX_Msg.*;

import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdAlcRateFix"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdAlcRateFix_MC extends MGBEL_StdAlcRateFix_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準配賦率を検索する。<br>
	 */
	public class Srch01 extends MGBEL_StdAlcRateFix_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setCnd(up0());
			getTerm(up0());
			srchCalcStdAlcRate();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			getPreRate(down0(), up0());
		}

		protected void srchCalcStdAlcRate() {
			executeQuery(down0(), MGBEL0100_MGT_CALC_STD_ALC_RATE_S01(), up0());
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 確定標準配賦率を検索する。<br>
	 */
	public class Srch02 extends MGBEL_StdAlcRateFix_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setCnd(up0());
			getTerm(up0());
			srchStdAlcRate();
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			getPreRate(down0(), up0());
		}

		protected void srchStdAlcRate() {
			executeQuery(down0(), MGBEL0100_MGT_STD_ALC_RATE_S01(), up0());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 標準配賦率を確定するために、チェックを行う。<br>
	 */
	public class Chk01 extends MGBEL_StdAlcRateFix_MC_A.Chk01 {
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
			callProc();

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

			createWork(up1(), up0());
			stdAlcRateLock();
			msgL.addAll(checkFix());

			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind dptBind = getListLogicBind(up0(), Chk01_RsltR.$dpt_cd);

			// MGBEL0100_MGT_ARG_S01 が実行済みである前提
			dptBind.putBind(CostDptCols.$i_ym, up1(), Chk01_HdrR.$term);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_RsltR> up = getChkList(up0());

			up.forEach(upR -> chkSub(msgL, upR));

			return msgL;
		}

		protected void chkSub(MCMessageList msgL, Chk01_RsltR rsltR) {
			msgL.addAll(checkDac(rsltR));
		}

		protected MCMessageList checkDac(Chk01_RsltR rsltR) {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkWritableWgCdDac(rsltR, Chk01_RsltR.$wg_cd));

			return msgL;
		}

		protected void callProc() {
			String procId = "MGPA_ITM_FIX$P_CHK_RATE_FIX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up1(), null, ":calc_grp_cd, :calc_no");
		}

		/**
		 * 確定済みのレコードがないかを調べる
		 */
		protected MCMessageList checkFix() {
			MCRow row = MCRow.create();
			MCMessageList msgL = new MCMessageList();

			row.setBooleanNE("FIX_FLG", true);

			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBEL0100_MGT_STD_ALC_RATE_S04(), row);
			int cnt = cntR.getNumberNE("cnt").intValue();

			if (!isSame(cnt, 0)) {
				msgL.add(new MCMessage(FXBAL0003));
			}

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
	 * 標準配賦率を確定解除するために、チェックを行う。<br>
	 */
	public class Chk02 extends MGBEL_StdAlcRateFix_MC_A.Chk02 {
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
			callProc();

			msgL.addAll(chk());

			return msgL;
		}

		/** ロック、更新カウンタチェック */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			if (notErrL.isEmpty()) {
				return msgL;
			}

			createWork(up1(), up0());
			stdAlcRateLock();

			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();

			ListLogicBind dptBind = getListLogicBind(up0(), Chk02_RsltR.$dpt_cd);

			// MGBEL0100_MGT_ARG_S01 が実行済みである前提
			dptBind.putBind(CostDptCols.$i_ym, up1(), Chk02_HdrR.$term);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk02_RsltR> up = getChkList(up0());

			up.forEach(upR -> chkSub(msgL, upR));

			return msgL;
		}

		protected void chkSub(MCMessageList msgL, Chk02_RsltR rsltR) {
			msgL.addAll(checkDac(rsltR));
		}

		protected MCMessageList checkDac(Chk02_RsltR rsltR) {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(checkWritableWgCdDac(rsltR, Chk02_RsltR.$wg_cd));

			return msgL;
		}

		protected void callProc() {
			String procId = "MGPA_ITM_FIX$P_CHK_RATE_CANCEL";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up1(), null, ":calc_grp_cd, :calc_no");
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
	 * 標準配賦率を確定する。<br>
	 */
	public class Upd01 extends MGBEL_StdAlcRateFix_MC_A.Upd01 {
		@Override
		protected void call() {
			try {
				super.call();

				handleSuccess(up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			throwUpdErr();
			upd(up0());
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk01() {
			MGBEL_StdAlcRateFix.Chk01 ope = MGBEL_StdAlcRateFix.crtChk01();

			ope.up0().setAll(up0());
			MCRow.copyall(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void upd(MCList<Chk01_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			updAlcRate();
			updArg();
		}

		/**
		 * MGT_STD_ALC_RATE を更新する
		 */
		protected void updAlcRate() {
			MCList<MGW_STD_ALC_RATE_R> regL = MCList.create(MGW_STD_ALC_RATE_R.class);
			regL.addBooleanColumn("upd_flg", false);
			dbSelect("MGBEL0100_MGW_STD_ALC_RATE_S01", regL, MCQueryApiBuilder.create(MGW_STD_ALC_RATE_R.create("T")));
			MCIndexKey idxRegL = regL.createIndex(
					MGW_STD_ALC_RATE_R.$alc_ac_cd
					,MGW_STD_ALC_RATE_R.$dpt_cd
					,MGW_STD_ALC_RATE_R.$loc_cd
					,MGW_STD_ALC_RATE_R.$oper_cd
					,MGW_STD_ALC_RATE_R.$bp_cd
					,MGW_STD_ALC_RATE_R.$ctg_cd
					,MGW_STD_ALC_RATE_R.$itm_cd
					,MGW_STD_ALC_RATE_R.$itm_sub1
					,MGW_STD_ALC_RATE_R.$itm_sub2
					,MGW_STD_ALC_RATE_R.$itm_sub3
					,MGW_STD_ALC_RATE_R.$wg_cd
					,MGW_STD_ALC_RATE_R.$term
					,MGW_STD_ALC_RATE_R.$calc_ctg_cd
					);
			
			MCList<MGT_STD_ALC_RATE_R> updL = MCList.create(MGT_STD_ALC_RATE_R.class);
			executeQuery(updL, MGBEL0100_MGT_STD_ALC_RATE_S05());
			
			for (MGT_STD_ALC_RATE_R updR : updL) {
				MGW_STD_ALC_RATE_R regR = regL.getFirst(idxRegL,
						updR.alc_ac_cd()
						,updR.dpt_cd()
						,updR.loc_cd()
						,updR.oper_cd()
						,updR.bp_cd()
						,updR.ctg_cd()
						,updR.itm_cd()
						,updR.itm_sub1()
						,updR.itm_sub2()
						,updR.itm_sub3()
						,updR.wg_cd()
						,updR.term()
						,updR.calc_ctg_cd());
				regR.setBooleanNE("upd_flg", true);
				updR.alc_rate(regR.alc_rate());
				updR.fix_alc_ptn_cd(regR.alc_ptn_cd());
				updR.fix_expns_cd(regR.expns_cd());
				updR.calc_grp_cd(up1().calc_grp_cd());
				updR.calc_no(up1().calc_no());
				updR.fix_flg(true);
			}
			
			if (!updL.isEmpty()) {
				MGT_STD_ALC_RATE_R stdAlcRateUpdR = MGT_STD_ALC_RATE_R.create("T");
				MCQueryApiBuilder updLBldr = MCQueryApiBuilder.create(stdAlcRateUpdR);
				updLBldr.setSet(stdAlcRateUpdR.alc_rate);
				updLBldr.addSet(stdAlcRateUpdR.fix_alc_ptn_cd);
				updLBldr.addSet(stdAlcRateUpdR.fix_expns_cd);
				updLBldr.addSet(stdAlcRateUpdR.calc_grp_cd);
				updLBldr.addSet(stdAlcRateUpdR.calc_no);
				updLBldr.addSet(stdAlcRateUpdR.fix_flg);
				dbUpdateKey("MGBEL0100_MGT_STD_ALC_RATE_U01", updL, updLBldr);
			}
			
			MCList<MGT_STD_ALC_RATE_R> insL = MCList.create(MGT_STD_ALC_RATE_R.class);
			for (MGW_STD_ALC_RATE_R regR : regL.subList("upd_flg", false)) {
				MGT_STD_ALC_RATE_R insR = MGT_STD_ALC_RATE_R.create();
				insR.alc_ac_cd(regR.alc_ac_cd());
				insR.dpt_cd(regR.dpt_cd());
				insR.loc_cd(regR.loc_cd());
				insR.oper_cd(regR.oper_cd());
				insR.bp_cd(regR.bp_cd());
				insR.ctg_cd(regR.ctg_cd());
				insR.itm_cd(regR.itm_cd());
				insR.itm_sub1(regR.itm_sub1());
				insR.itm_sub2(regR.itm_sub2());
				insR.itm_sub3(regR.itm_sub3());
				insR.wg_cd(regR.wg_cd());
				insR.term(regR.term());
				insR.calc_ctg_cd(regR.calc_ctg_cd());
				insR.alc_rate(regR.alc_rate());
				insR.fix_flg(true);
				insR.fix_alc_ptn_cd(regR.alc_ptn_cd());
				insR.fix_expns_cd(regR.expns_cd());
				insR.calc_grp_cd(up1().calc_grp_cd());
				insR.calc_no(up1().calc_no());
				insL.add(insR);
			}
			if (!insL.isEmpty()) {
				dbInsert("MGBEL0100_MGT_STD_ALC_RATE_I01", insL, MCQueryApiBuilder.create(MGT_STD_ALC_RATE_R.create("T")));
			}
		}

		/**
		 * MGT_ARG.RATE_FIX_FLGの更新を行います。
		 */
		protected void updArg() {
			MGT_ARG_R argR = MGT_ARG_R.create();

			argR.calc_grp_cd(up1().calc_grp_cd());
			argR.calc_no(up1().calc_no());
			argR.rate_fix_flg(true);

			MGT_ARG_R t = MGT_ARG_R.create("T");
			MCQueryApiBuilder argR_bldr = MCQueryApiBuilder.create(t);
			argR_bldr.setSet(t.rate_fix_flg);
			dbUpdateKey("MGBEL0100_MGT_ARG_U01", argR, argR_bldr);
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 標準配賦率を確定解除する。<br>
	 */
	public class Del01 extends MGBEL_StdAlcRateFix_MC_A.Del01 {
		@Override
		protected void call() {
			try {
				super.call();

				handleSuccess(up0());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwCanErr();
			del(up0());
		}

		/** 上り電文編集 */
		protected void editUp() {
			setPegNo(up0());
		}

		protected void callThisChk02() {
			MGBEL_StdAlcRateFix.Chk02 ope = MGBEL_StdAlcRateFix.crtChk02();

			ope.up0().setAll(up0());
			MCRow.copyall(ope.up1(), up1());
			ope.exec();
			up0().setAll(ope.down0());
		}

		protected void del(MCList<Chk02_RsltR> notErrL) {
			if (notErrL.isEmpty()) {
				return;
			}

			updAlcRate();
			updArg();
		}

		/**
		 * MGT_STD_ALC_RATE を更新する
		 */
		protected void updAlcRate() {
			executeUpdate(MGBEL0100_MGT_STD_ALC_RATE_U02());
		}

		/**
		 * MGT_ARG.RATE_FIX_FLGの更新を行います。
		 */
		protected void updArg() {
			MGT_ARG_R argR = MGT_ARG_R.create();
			MGT_STD_ALC_RATE_R stdAlcRateR = MGT_STD_ALC_RATE_R.create();
			MGT_STD_ALC_RATE_R t2 = MGT_STD_ALC_RATE_R.create("T");
			MGT_ARG_R t1 = MGT_ARG_R.create("T");
			MCQueryApiBuilder argR_bldr = MCQueryApiBuilder.create(t1);

			dbSelectKey("MGBEL0100_MGT_ARG_S01", argR, argR_bldr, up1().calc_no(), up1().calc_grp_cd()); // 期を取得

			stdAlcRateR.calc_grp_cd(up1().calc_grp_cd());
			stdAlcRateR.calc_no(up1().calc_no());
			stdAlcRateR.term(argR.term());

			int cnt = execDbCount("MGBEL0100_MGT_STD_ALC_RATE_S01", t2,
					t2.calc_grp_cd.eq(bind("calc_grp_cd"))
							.and(t2.calc_no.eq(bind("calc_no")))
							.and(t2.term.eq(bind("term"))),
					stdAlcRateR);

			if (isSame(cnt, 0)) {
				argR.rate_fix_flg(false);
				argR_bldr.setSet(t1.rate_fix_flg);
				dbUpdateKey("MGBEL0100_MGT_ARG_U02", argR, argR_bldr);
			}
		}

		protected void setDown() {
			down0().setAll(up0());
		}
	}

	protected void setCnd(Srch01_CndR cndR) {
		if (cndR.no_bp_flg()) {
			cndR.addStringColumn("no_bp_flg_str", "1");
		}

		if (cndR.no_dpt_flg()) {
			cndR.addStringColumn("no_dpt_flg_str", "1");
		}

		if (cndR.no_loc_flg()) {
			cndR.addStringColumn("no_loc_flg_str", "1");
		}

		if (cndR.no_oper_flg()) {
			cndR.addStringColumn("no_oper_flg_str", "1");
		}

		if (cndR.no_ctg_flg()) {
			cndR.addStringColumn("no_ctg_flg_str", "1");
		}

		if (cndR.no_itm_flg()) {
			cndR.addStringColumn("no_itm_flg_str", "1");
		}

		setGrpFlg(cndR, "itm_grp");
		setGrpFlg(cndR, "bp_grp");
	}

	/**
	 * 期を取得する
	 */
	protected Srch01_CndR getTerm(Srch01_CndR cndR) {
		executeQuery(cndR, MGBEL0100_MGT_ARG_S01(), cndR);

		return cndR;
	}

	/**
	 * 前期の配賦率を取得する
	 */
	protected void getPreRate(MCList<Srch01_RsltR> rsltL, Srch01_CndR cndR) {
		if (!cndR.diff_flg() || rsltL.isEmpty()) {
			return;
		}
		
		MGT_ARG_R argR = MGT_ARG_R.create();
		
		if (dbSelectKey("MGBEL0100_MGT_ARG_S02", argR, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), cndR) == 0) {
			return;
		}

		MCList<Srch01_RsltR> preRate = MCList.create(Srch01_RsltR.class);

		cndR.addDateColumn("pre_term", getTermInfoYM(argR.term().addMonth(-1)).term());
		executeQuery(preRate, MGBEL0100_MGT_STD_ALC_RATE_S03(), cndR);

		// 前期の配賦率取得用のキー、インデックス設定
		String[] keys = new String[] {
				Srch01_RsltR.$calc_ctg_cd, Srch01_RsltR.$alc_ac_cd, Srch01_RsltR.$dpt_cd,
				Srch01_RsltR.$loc_cd, Srch01_RsltR.$oper_cd, Srch01_RsltR.$bp_cd,
				Srch01_RsltR.$ctg_cd, Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1,
				Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3, Srch01_RsltR.$wg_cd
		};

		Comparable<?>[] binds = new Comparable<?>[keys.length];
		MCIndexKey idx = preRate.createIndex(keys);
		MCNumber pre_alc_rate;

		for (Srch01_RsltR rsltR : rsltL) {
			// 前期の配賦率を設定
			for (int i = 0; i < keys.length; i++) {
				binds[i] = rsltR.getValue(keys[i]);
			}

			Srch01_RsltR rate = preRate.getFirst(idx, binds);

			if (isNull(rate)) {
				pre_alc_rate = MCNumber.ZERO;
			}
			else {
				rsltR.pre_alc_rate(rate.getNumber(Srch01_RsltR.$alc_rate));
				pre_alc_rate = rsltR.pre_alc_rate();
			}

			rsltR.diff_alc_rate(rsltR.alc_rate().subtract(pre_alc_rate));
			rsltR.increase_rate(calcIncrease(rsltR.diff_alc_rate(), pre_alc_rate));
		}
	}
	
	protected MAM_TERM_R getPrevTermInfoYM(Srch01_CndR cndR) {
		MGT_ARG_R argR = MGT_ARG_R.create();

		if (dbSelectKey("MGBEL0100_MGT_ARG_S03", argR, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), cndR) > 0) {
			return getTermInfoYM(argR.term().addMonth(-1));
		}
		else {
			return null;
		}
	}

	/**
	 * MGW_STD_ALC_RATE を作成する (Chk01)
	 */
	protected Chk01_HdrR createWork(Chk01_HdrR hdrR, MCList<Chk01_RsltR> rsltL) {
		// 期を取得
		executeQuery(hdrR, MGBEL0100_MGT_ARG_S01(), hdrR);

		// ワークテーブルにデータを作成する
		executeBatchUpdate(MGBEL0100_MGW_STD_ALC_RATE_I01(), null, rsltL, hdrR);

		return hdrR;
	}

	/**
	 * MGW_STD_ALC_RATE を作成する (Chk02)
	 */
	protected Chk02_HdrR createWork(Chk02_HdrR hdrR, MCList<Chk02_RsltR> rsltL) {
		Chk01_HdrR chk01hdrR = Chk01_HdrR.create();
		MCList<Chk01_RsltR> chk01RsltL = MCList.create(Chk01_RsltR.class);

		// Chk01 用のワーク作成処理を利用するため、Chk01 用のコンテナに値を入れ替える
		copy(chk01hdrR, hdrR, createMap_Chk01_HdrR_Chk02_HdrR());
		addAll(chk01RsltL, rsltL, createMap_Chk01_RsltR_Chk02_RsltR());
		createWork(chk01hdrR, chk01RsltL);

		// Chk01 用処理終了後、Chk02 用のコンテナに値を戻す
		copy(hdrR, chk01hdrR, createMap_Chk02_HdrR_Chk01_HdrR());

		return hdrR;
	}

	/**
	 * MGT_STD_ALC_RATE の更新対象行をロックする
	 */
	protected void stdAlcRateLock() {
		executeQuery((MCRow) null, MGBEL0100_MGT_STD_ALC_RATE_S02());
	}

	/**
	 * MGT_ARG をロックする (Chk01)
	 * @param hdrR
	 */
	protected void argLock(Chk01_HdrR hdrR) {
		MGT_ARG_R argR = MGT_ARG_R.create();
		MGT_ARG_R rsltR  = MGT_ARG_R.create();

		dbSelectKeyForUpdateNoWait("MGBEL0100_MGT_ARG_S04", rsltR, argR, hdrR.calc_no(),
				hdrR.calc_grp_cd());
	}

	/**
	 * MGT_ARG をロックする (Chk02)
	 * @param hdrR
	 */
	protected void argLock(Chk02_HdrR hdrR) {
		Chk01_HdrR chk01hdrR = Chk01_HdrR.create();

		// Chk01 用のロック処理を利用するため、Chk01 用のコンテナに値を入れ替える
		copy(chk01hdrR, hdrR, createMap_Chk01_HdrR_Chk02_HdrR());
		argLock(chk01hdrR);
	}

	protected Map_Chk01_HdrR_Chk02_HdrR<Chk01_HdrR, Chk02_HdrR> createMap_Chk01_HdrR_Chk02_HdrR() {
		return new Map_Chk01_HdrR_Chk02_HdrR<Chk01_HdrR, Chk02_HdrR>();
	}

	public class Map_Chk01_HdrR_Chk02_HdrR<D extends Chk01_HdrR, S extends Chk02_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_HdrR.$calc_grp_cd, Chk02_HdrR.$calc_grp_cd);
			addColumnPathMap(Chk01_HdrR.$calc_no, Chk02_HdrR.$calc_no);
			addColumnPathMap(Chk01_HdrR.$term, Chk02_HdrR.$term);
		}
	}

	protected Map_Chk01_RsltR_Chk02_RsltR<Chk01_RsltR, Chk02_RsltR> createMap_Chk01_RsltR_Chk02_RsltR() {
		return new Map_Chk01_RsltR_Chk02_RsltR<Chk01_RsltR, Chk02_RsltR>();
	}

	public class Map_Chk01_RsltR_Chk02_RsltR<D extends Chk01_RsltR, S extends Chk02_RsltR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_RsltR.$peg_no, Chk02_RsltR.$peg_no);
			addColumnPathMap(Chk01_RsltR.$err_flg, Chk02_RsltR.$err_flg);
			addColumnPathMap(Chk01_RsltR.$rtn_sts_typ, Chk02_RsltR.$rtn_sts_typ);
			addColumnPathMap(Chk01_RsltR.$dbc, Chk02_RsltR.$dbc);
		}
	}

	protected Map_Chk02_HdrR_Chk01_HdrR<Chk02_HdrR, Chk01_HdrR> createMap_Chk02_HdrR_Chk01_HdrR() {
		return new Map_Chk02_HdrR_Chk01_HdrR<Chk02_HdrR, Chk01_HdrR>();
	}

	public class Map_Chk02_HdrR_Chk01_HdrR<D extends Chk02_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk02_HdrR.$calc_grp_cd, Chk01_HdrR.$calc_grp_cd);
			addColumnPathMap(Chk02_HdrR.$calc_no, Chk01_HdrR.$calc_no);
			addColumnPathMap(Chk02_HdrR.$term, Chk01_HdrR.$term);
		}
	}

	//FMCB CUSTOM END
}