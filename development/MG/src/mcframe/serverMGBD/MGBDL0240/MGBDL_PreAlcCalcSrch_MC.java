package mcframe.serverMGBD.MGBDL0240;

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
import mcframe.serverMGBD.MGBDL0240.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0240.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_PreAlcCalcSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_PreAlcCalcSrch_MC extends MGBDL_PreAlcCalcSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦計算結果を検索する。<br>
	 */
	public class Srch01 extends MGBDL_PreAlcCalcSrch_MC_A.Srch01 {
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
			executeQuery(down0(), MGBDL0240_MGT_PRE_ALC_S01(), up0());
			
			if (down0().size() == 1 && down0().get(0).isEmpty()) {
				down0().clear();
			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 配賦費用反映前にチェックを行う。<br>
	 */
	public class Chk01 extends MGBDL_PreAlcCalcSrch_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}
		
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_SA_TYP.isACT(up0().sa_typ())) {
				msgL.addAll(callProc());
				msgL.addAll(chkActAlcAmt());
				msgL.addAll(chkActAlcFinAmt());
				msgL.addAll(chkActAlcFinFlg());
			}
			else {
				msgL.addAll(chkPlnAlcAmt());
				msgL.addAll(chkPlnAlcFinAmt());
				msgL.addAll(chkPlnAlcFinFlg());
			}
			
			return msgL;
		}
		
		protected MCMessageList callProc() {
			MCMessageList msgL = new MCMessageList();
			
			try {
				String procId = "MGPA_CALC_FIX$P_CHK_FIX_PRE_ALC";
				execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :calc_no, :calc_ctg_cd");
			}
			catch (MCAppException e) {
				if (isSame(e.getMCMessage().getID(), MGBXD0026)) {
					msgL.add(e.getMCMessage());
				}
				else {
					throw e;
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkActAlcAmt() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_CALC_PRE_ALC_AMT_S02(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0004));
			}
			return msgL;
		}
		
		protected MCMessageList chkActAlcFinAmt() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_CALC_PRE_ALC_AMT_S04(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0012));
			}
			return msgL;
		}
		
		protected MCMessageList chkActAlcFinFlg() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_PRE_ALC_S03(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0005));
			}
			return msgL;
		}
		
		protected MCMessageList chkPlnAlcAmt() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_CALC_PRE_ALC_AMT_S01(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0004));
			}
			return msgL;
		}
		
		protected MCMessageList chkPlnAlcFinAmt() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_CALC_PRE_ALC_AMT_S03(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0012));
			}
			return msgL;
		}

		protected MCMessageList chkPlnAlcFinFlg() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_PRE_ALC_S02(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0005));
			}
			return msgL;
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 配賦費用取消前にチェックを行う。<br>
	 */
	public class Chk02 extends MGBDL_PreAlcCalcSrch_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}
		
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			
			if (MAC_SA_TYP.isACT(up0().sa_typ())) {
				msgL.addAll(callProc());
				msgL.addAll(chkActAlcAmt());
				msgL.addAll(chkActPreAlcFinFlg());
			}
			else {
				msgL.addAll(chkPlnAlcAmt());
				msgL.addAll(chkPlnPreAlcFinFlg());
			}
			
			return msgL;
		}
		
		protected MCMessageList callProc() {
			MCMessageList msgL = new MCMessageList();
			
			try {
				String procId = "MGPA_CALC_FIX$P_CHK_FIX_PRE_ALC";
				execProc(createSqlId(LOGIC_ID, procId, "02"), procId, up0(), null, ":calc_grp_cd, :calc_no, :calc_ctg_cd");
			}
			catch (MCAppException e) {
				if (isSame(e.getMCMessage().getID(), MGBXD0026)) {
					msgL.add(e.getMCMessage());
				}
				else {
					throw e;
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkActAlcAmt() {
			MCMessageList msgL = new MCMessageList();

			MGT_ACT_ALC_AMT_R t = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder actAlcAmtL_bldr = MCQueryApiBuilder.create(t);
			actAlcAmtL_bldr.setSelect(count(value(1)).as("cnt"));
			actAlcAmtL_bldr.setWhere(t.trd_calc_grp_cd.eq(bind("1")), up0().calc_grp_cd());
			actAlcAmtL_bldr.addWhereWithAnd(t.trd_calc_no.eq(bind("1")), up0().calc_no());
			actAlcAmtL_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("1")), up0().calc_ctg_cd());
			MCRow result = MCRow.create();
			result.addNumberColumn("cnt");
			actAlcAmtL_bldr.buildSelect("MGBDL0240_MGT_ACT_ALC_AMT_S01").executeQuery(actAlcAmtL_bldr.getMergeBind(), result);
			int count = result.getNumberNE("cnt").intValue();
			
			if (0 == count) {
				msgL.add(new MCMessage(up0(), null, MGBDL0006));
			}
			return msgL;
		}
		
		protected MCMessageList chkActPreAlcFinFlg() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_PRE_ALC_S05(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0005));
			}
			return msgL;
		}
		
		protected MCMessageList chkPlnAlcAmt() {
			MCMessageList msgL = new MCMessageList();
			
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder plnAlcAmtL_bldr = MCQueryApiBuilder.create(t);
			plnAlcAmtL_bldr.setSelect(count(value(1)).as("cnt"));
			plnAlcAmtL_bldr.setWhere(t.trd_calc_grp_cd.eq(bind("1")), up0().calc_grp_cd());
			plnAlcAmtL_bldr.addWhereWithAnd(t.trd_calc_no.eq(bind("1")), up0().calc_no());
			plnAlcAmtL_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("1")), up0().calc_ctg_cd());
			MCRow result = MCRow.create();
			result.addNumberColumn("cnt");
			plnAlcAmtL_bldr.buildSelect("MGBDL0240_MGT_PLN_ALC_AMT_S01").executeQuery(plnAlcAmtL_bldr.getMergeBind(), result);
			int count = result.getNumberNE("cnt").intValue();
			
			if (0 == count) {
				msgL.add(new MCMessage(up0(), null, MGBDL0006));
			}
			return msgL;
		}

		protected MCMessageList chkPlnPreAlcFinFlg() {
			MCMessageList msgL = new MCMessageList();
			
			MCRow cntR = MCRow.create();
			cntR.addNumberColumn("cnt");
			executeQuery(cntR, MGBDL0240_MGT_PRE_ALC_S04(), up0());
			if (0 != cntR.getNumberNE("cnt").intValue()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0005));
			}
			return msgL;
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 配賦費用反映を行う。<br>
	 */
	public class Ins01 extends MGBDL_PreAlcCalcSrch_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (!editUp()) {
				return;
			}
			
			callThisChk01();
			throwUpdErr();
			
			if (MAC_SA_TYP.isACT(up0().sa_typ())) {
				act();
			}
			else if (MAC_SA_TYP.isPLN(up0().sa_typ())) {
				pln();
			}
		}
		
		protected boolean editUp() {
			MGT_ARG_R arg = getMgtArg();
			
			if(isNull(arg.st_ym())) {
				return false;
			}
			up0().sa_typ(arg.sa_typ());
			return true;
		}
		
		protected MGT_ARG_R getMgtArg() {
			MGT_ARG_R r = MGT_ARG_R.create();
			
			dbSelectKeyForUpdateNoWait("MGBDL0240_MGT_ARG_S01", r, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up0());
			
			return r;
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_PreAlcCalcSrch.Chk01 ope = MGBDL_PreAlcCalcSrch.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
		
		protected void act() {
			lockDelActAlcAmt();
			insUpdActAlcAmt();
		}
		
		protected void lockDelActAlcAmt() {
			MGT_PRE_ALC_R S1TB1 = MGT_PRE_ALC_R.create("TB1");
			MGT_ACT_ALC_AMT_R t = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.trd_calc_grp_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(t.trd_calc_no.isNotNull());
			dbc_bldr.addWhereWithAnd(t.trd_wg_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1TB1)
					.where(value(0).eq(value(0))
							.and(S1TB1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1TB1.calc_no.eq(bind("calc_no")))
							.and(S1TB1.ym.eq(t.ym))
							.and(S1TB1.src_wg_cd.eq(t.trd_wg_cd)))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0240_MGT_ACT_ALC_AMT_S02", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBDL0240_MGT_ACT_ALC_AMT_D01").executeUpdate(up0());
		}

		
		protected void insUpdActAlcAmt() {
			regActAlcAmt();
			updActAlcAmt();
		}
		
		protected void regActAlcAmt() {
			executeUpdate(MGBDL0240_MGT_ACT_ALC_AMT_I01(), up0());
		}

		protected void updActAlcAmt() {
			up0().addBooleanColumn("pre_alc_fin_flg", true);
			executeUpdate(MGBDL0240_MGT_ACT_ALC_AMT_U01(), up0());
		}
		
		protected void pln() {
			lockDelPlnAlcAmt();
			insUpdPlnAlcAmt();
		}
		
		protected void lockDelPlnAlcAmt() {
			MGT_PRE_ALC_R S1TB1 = MGT_PRE_ALC_R.create("TB1");
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.trd_calc_grp_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(t.trd_calc_no.isNotNull());
			dbc_bldr.addWhereWithAnd(t.trd_wg_cd.isNotNull());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1TB1)
					.where(value(0).eq(value(0))
							.and(S1TB1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1TB1.calc_no.eq(bind("calc_no")))
							.and(S1TB1.ym.eq(t.ym))
							.and(S1TB1.src_wg_cd.eq(t.trd_wg_cd)))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0240_MGT_PLN_ALC_AMT_S02", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBDL0240_MGT_PLN_ALC_AMT_D01").executeUpdate(up0());
		}
		
		protected void insUpdPlnAlcAmt() {
			regPlnAlcAmt();
			updPlnAlcAmt();
		}
		
		protected void regPlnAlcAmt() {
			executeUpdate(MGBDL0240_MGT_PLN_ALC_AMT_I01(), up0());
		}
		
		protected void updPlnAlcAmt() {
			up0().addBooleanColumn("pre_alc_fin_flg", true);
			executeUpdate(MGBDL0240_MGT_PLN_ALC_AMT_U01(), up0());
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 配賦費用取消を行う。<br>
	 */
	public class Del01 extends MGBDL_PreAlcCalcSrch_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			if (!editUp()) {
				return;
			}
			
			callThisChk02();
			throwUpdErr();
			
			if (MAC_SA_TYP.isACT(up0().sa_typ())) {
				act();
			}
			else if (MAC_SA_TYP.isPLN(up0().sa_typ())) {
				pln();
			}
		}
		
		protected boolean editUp() {
			MGT_ARG_R arg = getMgtArg();
			
			if(isNull(arg.st_ym())) {
				return false;
			}
			up0().sa_typ(arg.sa_typ());
			return true;
		}
		
		protected MGT_ARG_R getMgtArg() {
			MGT_ARG_R r = MGT_ARG_R.create();
			
			dbSelectKeyForUpdateNoWait("MGBDL0240_MGT_ARG_S02", r, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up0());
			
			return r;
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MGBDL_PreAlcCalcSrch.Chk02 ope = MGBDL_PreAlcCalcSrch.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
		
		protected void act() {
			lockDelActAlcAmt();
			updActAlcAmt();
		}
		
		protected void lockDelActAlcAmt() {
			MGT_PRE_ALC_R S1TB1 = MGT_PRE_ALC_R.create("TB1");
			MGT_ACT_ALC_AMT_R t = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1TB1)
					.where(value(0).eq(value(0))
							.and(S1TB1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1TB1.calc_no.eq(bind("calc_no")))
							.and(S1TB1.ym.eq(t.ym))
							.and(S1TB1.src_wg_cd.eq(t.trd_wg_cd))
							.and(S1TB1.calc_grp_cd.eq(t.trd_calc_grp_cd))
							.and(S1TB1.calc_no.eq(t.trd_calc_no)))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0240_MGT_ACT_ALC_AMT_S03", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBDL0240_MGT_ACT_ALC_AMT_D02").executeUpdate(up0());
		}
		
		protected void updActAlcAmt() {
			up0().addBooleanColumn("pre_alc_fin_flg", false);
			executeUpdate(MGBDL0240_MGT_ACT_ALC_AMT_U01(), up0());
		}
		
		protected void pln() {
			lockDelPlnAlcAmt();
			updPlnAlcAmt();
		}
		
		protected void lockDelPlnAlcAmt() {
			MGT_PRE_ALC_R S1TB1 = MGT_PRE_ALC_R.create("TB1");
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1TB1)
					.where(value(0).eq(value(0))
							.and(S1TB1.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1TB1.calc_no.eq(bind("calc_no")))
							.and(S1TB1.ym.eq(t.ym))
							.and(S1TB1.src_wg_cd.eq(t.trd_wg_cd))
							.and(S1TB1.calc_grp_cd.eq(t.trd_calc_grp_cd))
							.and(S1TB1.calc_no.eq(t.trd_calc_no)))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0240_MGT_PLN_ALC_AMT_S03", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBDL0240_MGT_PLN_ALC_AMT_D02").executeUpdate(up0());
		}
		
		protected void updPlnAlcAmt() {
			up0().addBooleanColumn("pre_alc_fin_flg", false);
			executeUpdate(MGBDL0240_MGT_PLN_ALC_AMT_U01(), up0());
		}
	}

	//FMCB CUSTOM END
}