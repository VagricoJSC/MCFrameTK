package mcframe.serverMGBD.MGBDL0210;

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
import mcframe.serverMGBD.MGBDL0210.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0210.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_AlcCalcErrSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_AlcCalcErrSrch_MC extends MGBDL_AlcCalcErrSrch_MC_A{
	//FMCB CUSTOM START
	// 操作種別（参照種別）
	protected static final String _RD_ONLY = "0";
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未配賦金額一覧を検索する。<br>
	 */
	public class Srch01 extends MGBDL_AlcCalcErrSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchAlcCalcErr();
		}
		
		protected void editUp() {
			setGrpFlg(up0(), "itm_grp");
			setGrpFlg(up0(), "bp_grp");
		}
		
		protected void srchAlcCalcErr() {
			if (isRdOnly(up0().ope())) {
				// 参照権限WGを持つものを抽出
				executeQuery(down0(), MGBDL0210_MGT_ALC_CALC_ERR_S01(), up0());
			}
			else {
				// 更新権限WGを持つものを抽出
				executeQuery(down0(), MGBDL0210_MGT_ALC_CALC_ERR_S02(), up0());
			}
		}
		
		/**
		 * 操作種別を判断
		 * @param ope
		 * @return 参照種別の場合はtrue、それ以外はfalse
		 */
		protected boolean isRdOnly(String ope) {
			if (isSame(ope, _RD_ONLY)) {
				return true;
			}
			return false;
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 未配賦金額を繰り越す前にチェックを行う。<br>
	 */
	public class Chk01 extends MGBDL_AlcCalcErrSrch_MC_A.Chk01 {
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
			
			msgL.addAll(checkWritableWgCdDac(up1(), Chk01_RsltR.$wg_cd));
			
			MCList<Chk01_CndR> cndL = makeCndL();
			
			if (MAC_SA_TYP.isACT(up0().sa_typ())) {
				msgL.addAll(callProc(cndL));
				msgL.addAll(chkActAlcFinFlg(cndL));
				msgL.addAll(chkActAlcFinAmt(cndL));
			}
			else {
				msgL.addAll(chkPlnAlcFinFlg(cndL));
				msgL.addAll(chkPlnAlcFinAmt(cndL));
			}
			
			return msgL;
		}
		
		protected MCList<Chk01_CndR> makeCndL() {
			MCList<Chk01_CndR> cndL = MCList.create(Chk01_CndR.class);
			MCList<Chk01_RsltR> grpL = up1().groupBy(Chk01_RsltR.$wg_cd);
			
			for (Chk01_RsltR grpR : grpL) {
				Chk01_CndR tmpR = Chk01_CndR.create();
				tmpR.ym(up0().ym());
				tmpR.calc_no(up0().calc_no());
				tmpR.calc_ctg_cd(up0().calc_ctg_cd());
				tmpR.calc_grp_cd(up0().calc_grp_cd());
				tmpR.wg_cd(grpR.wg_cd());
				cndL.add(tmpR);
			}
			return cndL;
		}
		
		protected MCMessageList callProc(MCList<Chk01_CndR> cndL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_CndR r : cndL) {
				try {
					String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT_AMT";
					execProc(createSqlId(LOGIC_ID, procId, "01"), procId, r, null, ":calc_ctg_cd, :wg_cd, :ym");
				}
				catch (MCAppException e) {
					if (isSame(e.getMCMessage().getID(), MGBXD0026)) {
						msgL.add(e.getMCMessage());
					}
					else {
						throw e;
					}
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkActAlcFinFlg(MCList<Chk01_CndR> cndL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_CndR r : cndL) {
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MGBDL0210_MGT_ACT_ALC_AMT_S01(), r);
				if (0 != cntR.getNumberNE("cnt").intValue()) {
					msgL.add(new MCMessage(r, null, MGBDL0013, r.wg_cd(), toYMString(r.ym())));
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkActAlcFinAmt(MCList<Chk01_CndR> cndL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_CndR r : cndL) {
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MGBDL0210_MGT_ACT_ALC_AMT_S02(), r);
				if (0 != cntR.getNumberNE("cnt").intValue()) {
					msgL.add(new MCMessage(r, null, MGBDL0014, r.wg_cd(), toYMString(r.ym())));
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkPlnAlcFinFlg(MCList<Chk01_CndR> cndL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_CndR r : cndL) {
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MGBDL0210_MGT_PLN_ALC_AMT_S01(), r);
				if (0 != cntR.getNumberNE("cnt").intValue()) {
					msgL.add(new MCMessage(r, null, MGBDL0013, r.wg_cd(), toYMString(r.ym())));
				}
			}
			return msgL;
		}
		
		protected MCMessageList chkPlnAlcFinAmt(MCList<Chk01_CndR> cndL) {
			MCMessageList msgL = new MCMessageList();
			
			for (Chk01_CndR r : cndL) {
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MGBDL0210_MGT_PLN_ALC_AMT_S02(), r);
				if (0 != cntR.getNumberNE("cnt").intValue()) {
					msgL.add(new MCMessage(r, null, MGBDL0014, r.wg_cd(), toYMString(r.ym())));
				}
			}
			return msgL;
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down1().setAll(up1());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 繰り越しを取り消す前にチェックを行う。<br>
	 */
	public class Chk02 extends MGBDL_AlcCalcErrSrch_MC_A.Chk02 {
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
				msgL.addAll(chkActAlcAmt());
			}
			else {
				msgL.addAll(chkPlnAlcAmt());
			}
			
			return msgL;
		}
		
		protected MCMessageList chkActAlcAmt() {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MGT_ACT_ALC_AMT_R> dbc1 = MCList.create(MGT_ACT_ALC_AMT_R.class);
			MGT_ACT_ALC_AMT_R t1 = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr1 = MCQueryApiBuilder.create(t1);
			dbc_bldr1.setDistinct();
			dbc_bldr1.setSelect(t1.calc_ctg_cd, t1.wg_cd, t1.ym);
			editActAlcAmtBldr(dbc_bldr1, t1);
			dbSelect("MGBDL0210_MGT_ACT_ALC_AMT_S01", dbc1, dbc_bldr1, up0());
			
			if (0 == dbc1.size()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0006));
			}
			
			for (MGT_ACT_ALC_AMT_R r :dbc1) {
				msgL.addAll(callProc(r));
			}
			
			MCList<MGT_ACT_ALC_AMT_R> dbc2 = MCList.create(MGT_ACT_ALC_AMT_R.class);
			MGT_ACT_ALC_AMT_R t2 = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr2 = MCQueryApiBuilder.create(t2);
			dbc_bldr2.setSelect(t2.wg_cd);
			editActAlcAmtBldr(dbc_bldr2, t2);
			dbc_bldr2.addWhereWithAnd(t2.pre_alc_fin_flg.eq(bind("pre_alc_fin_flg")));
			dbc_bldr2.setGroupBy(t2.wg_cd);
			dbSelect("MGBDL0210_MGT_ACT_ALC_AMT_S02", dbc2, dbc_bldr2, up0());
			
			if (0 != dbc2.size()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0013, dbc2.get(0).wg_cd(), toYMString(up0().ym())));
			}
			return msgL;
		}
		
		protected void editActAlcAmtBldr(MCQueryApiBuilder dbc_bldr, MGT_ACT_ALC_AMT_R t) {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_no.eq(bind("calc_no")));
			dbc_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())));
			dbc_bldr.addWhereWithCutOffAnd(t.trd_wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.calc_ctg_cd.like(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));
		}
		
		protected MCMessageList callProc(MGT_ACT_ALC_AMT_R r) {
			MCMessageList msgL = new MCMessageList();
			try {
				String procId = "MGPA_CALC_FIX$P_CHK_FIX_ACT_AMT";
				execProc(createSqlId(LOGIC_ID, procId, "02"), procId, r, null, ":calc_ctg_cd, :wg_cd, :ym");
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
		
		protected MCMessageList chkPlnAlcAmt() {
			MCMessageList msgL = new MCMessageList();
			MCList<MGT_PLN_ALC_AMT_R> dbc = MCList.create(MGT_PLN_ALC_AMT_R.class);
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.wg_cd);
			dbc_bldr.setGroupBy(t.wg_cd);
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_no.eq(bind("calc_no")));
			dbc_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())));
			dbc_bldr.addWhereWithCutOffAnd(t.trd_wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.calc_ctg_cd.like(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));
			dbSelect("MGBDL0210_MGT_PLN_ALC_AMT_S01", dbc, dbc_bldr, up0());
			
			if (0 == dbc.size()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0006));
			}
			
			dbc_bldr.addWhereWithAnd(t.pre_alc_fin_flg.eq(bind("pre_alc_fin_flg")));
			dbSelect("MGBDL0210_MGT_PLN_ALC_AMT_S02", dbc, dbc_bldr, up0());
			if (0 != dbc.size()) {
				msgL.add(new MCMessage(up0(), null, MGBDL0013, dbc.get(0).wg_cd(), toYMString(up0().ym())));
			}
			return msgL;
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 未配賦金額を繰り越す。<br>
	 */
	public class Ins01 extends MGBDL_AlcCalcErrSrch_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MGT_ARG_R arg = getMgtArg();
			
			if(isNull(arg.st_ym())) {
				return;
			}
			else {
				up0().ym(arg.end_ym().addMonth(1));
				up0().sa_typ(arg.sa_typ());
			}
			callThisChk01();
			throwUpdErr();
			
			if (MAC_SA_TYP.isACT(arg.sa_typ())) {
				act();
			}
			else if (MAC_SA_TYP.isPLN(arg.sa_typ())) {
				pln();
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_AlcCalcErrSrch.Chk01 ope = MGBDL_AlcCalcErrSrch.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
		}
		
		protected MGT_ARG_R getMgtArg() {
			MGT_ARG_R r = MGT_ARG_R.create();
			
			dbSelectKeyForUpdateNoWait("MGBDL0210_MGT_ARG_S01", r, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up0());
			
			return r;
		}
		
		protected void act() {
			lockDelActAlcAmt();
			insActAlcAmt();
		}
		
		protected void lockDelActAlcAmt() {
			MCList<Chk01_CndR> cndL = MCList.create(Chk01_CndR.class);
			MCList<Chk01_RsltR> grpL = up1().groupBy(Chk01_RsltR.$wg_cd);
			for (Chk01_RsltR grpR : grpL) {
				Chk01_CndR tmpR = Chk01_CndR.create();
				tmpR.ym(up0().ym());
				tmpR.calc_ctg_cd(up0().calc_ctg_cd());
				tmpR.wg_cd(grpR.wg_cd());
				cndL.add(tmpR);
			}
			
			MGT_ACT_ALC_AMT_R t = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			
			dbcL_bldr.setSelect(dbcL_bldr.getBaseDbc().getKeyColumn$());
			dbcL_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbcL_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbcL_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())));
			dbcL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbcL_bldr.addOrderByAsc(dbcL_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0210_MGT_ACT_ALC_AMT_S03", dbcL_bldr, cndL);
			dbcL_bldr.buildDelete("MGBDL0210_MGT_ACT_ALC_AMT_D01").executeBatchUpdate(cndL);
		}
		
		protected void insActAlcAmt() {
			MCList<MGT_ACT_ALC_AMT_R> dbc = MCList.create(MGT_ACT_ALC_AMT_R.class);
			addAll(dbc, up1(), createMap_MGT_ACT_ALC_AMT_R_Chk01_RsltR());
			
			MCList<MGT_ACT_ALC_AMT_R> dbc_sum = MCList.create(MGT_ACT_ALC_AMT_R.class);
			dbc_sum.addAll(dbc.groupBy(getActGroupPolicy()));
			
			doSeqCache(MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY.value(), dbc_sum.size());
			for (MGT_ACT_ALC_AMT_R r :dbc_sum) {
				r.act_alc_amt_key(getSequence(MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY.value()));
				r.trd_wg_cd(r.wg_cd());
			}
			
			dbc_sum.setString(MGT_ACT_ALC_AMT_R.$calc_ctg_cd, up0().calc_ctg_cd());
			dbc_sum.setString(MGT_ACT_ALC_AMT_R.$alc_rec_typ, MGC_ALC_REC_TYP.CARRY.value());
			dbc_sum.setDate(MGT_ACT_ALC_AMT_R.$ym, up0().ym());
			dbc_sum.setString(MGT_ACT_ALC_AMT_R.$trd_calc_grp_cd, up0().calc_grp_cd());
			dbc_sum.setString(MGT_ACT_ALC_AMT_R.$trd_calc_no, up0().calc_no());
			dbc_sum.setBoolean(MGT_ACT_ALC_AMT_R.$pre_alc_fin_flg, false);
			
			dbInsertEx("MGBDL0210_MGT_ACT_ALC_AMT_I01", dbc_sum, MCQueryApiBuilder.create(MGT_ACT_ALC_AMT_R.create("T")));
		}
		
		protected MCGroupByPolicy getActGroupPolicy() {
			MCGroupByPolicy p = new MCGroupByPolicy(getActAlcCol());
			p.sum(MGT_ACT_ALC_AMT_R.$amt);
			return p;
		}
		
		protected String[] getActAlcCol() {
			return new String[] {
					MGT_ACT_ALC_AMT_R.$wg_cd,
					MGT_ACT_ALC_AMT_R.$alc_ac_cd,
					MGT_ACT_ALC_AMT_R.$dpt_cd,
					MGT_ACT_ALC_AMT_R.$loc_cd,
					MGT_ACT_ALC_AMT_R.$oper_cd,
					MGT_ACT_ALC_AMT_R.$bp_cd,
					MGT_ACT_ALC_AMT_R.$ctg_cd,
					MGT_ACT_ALC_AMT_R.$itm_cd,
					MGT_ACT_ALC_AMT_R.$itm_sub1,
					MGT_ACT_ALC_AMT_R.$itm_sub2,
					MGT_ACT_ALC_AMT_R.$itm_sub3,
					MGT_ACT_ALC_AMT_R.$lot_no,
					MGT_ACT_ALC_AMT_R.$sublot_no,
					MGT_ACT_ALC_AMT_R.$sno1,
					MGT_ACT_ALC_AMT_R.$sno2,
					MGT_ACT_ALC_AMT_R.$sno3,
					MGT_ACT_ALC_AMT_R.$sno4,
					MGT_ACT_ALC_AMT_R.$itm_mfg_inst_no,
					MGT_ACT_ALC_AMT_R.$iv_no,
					MGT_ACT_ALC_AMT_R.$po_no,
					MGT_ACT_ALC_AMT_R.$slo_no
			};
		}
		
		protected void pln() {
			lockDelPlnAlcAmt();
			insPlnAlcAmt();
		}
		
		protected void lockDelPlnAlcAmt() {
			MCList<Chk01_CndR> cndL = MCList.create(Chk01_CndR.class);
			MCList<Chk01_RsltR> grpL = up1().groupBy(Chk01_RsltR.$wg_cd);
			for (Chk01_RsltR grpR : grpL) {
				Chk01_CndR tmpR = Chk01_CndR.create();
				tmpR.ym(up0().ym());
				tmpR.calc_ctg_cd(up0().calc_ctg_cd());
				tmpR.wg_cd(grpR.wg_cd());
				cndL.add(tmpR);
			}
			
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			
			dbcL_bldr.setSelect(dbcL_bldr.getBaseDbc().getKeyColumn$());
			dbcL_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbcL_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbcL_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())));
			dbcL_bldr.addWhereWithAnd(t.wg_cd.eq(bind("wg_cd")));
			dbcL_bldr.addOrderByAsc(dbcL_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0210_MGT_PLN_ALC_AMT_S03", dbcL_bldr, cndL);
			dbcL_bldr.buildDelete("MGBDL0210_MGT_PLN_ALC_AMT_D01").executeBatchUpdate(cndL);
		}
		
		protected void insPlnAlcAmt() {
			MCList<MGT_PLN_ALC_AMT_R> dbc = MCList.create(MGT_PLN_ALC_AMT_R.class);
			addAll(dbc, up1(), createMap_MGT_PLN_ALC_AMT_R_Chk01_RsltR());
			
			MCList<MGT_PLN_ALC_AMT_R> dbc_sum = MCList.create(MGT_PLN_ALC_AMT_R.class);
			dbc_sum.addAll(dbc.groupBy(getPlnGroupPolicy()));
			
			doSeqCache(MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY.value(), dbc_sum.size());
			for (MGT_PLN_ALC_AMT_R r :dbc_sum) {
				r.pln_alc_amt_key(getSequence(MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY.value()));
				r.trd_wg_cd(r.wg_cd());
			}
			
			dbc_sum.setString(MGT_PLN_ALC_AMT_R.$calc_ctg_cd, up0().calc_ctg_cd());
			dbc_sum.setString(MGT_PLN_ALC_AMT_R.$alc_rec_typ, MGC_ALC_REC_TYP.CARRY.value());
			dbc_sum.setDate(MGT_PLN_ALC_AMT_R.$ym, up0().ym());
			dbc_sum.setString(MGT_PLN_ALC_AMT_R.$trd_calc_grp_cd, up0().calc_grp_cd());
			dbc_sum.setString(MGT_PLN_ALC_AMT_R.$trd_calc_no, up0().calc_no());
			dbc_sum.setBoolean(MGT_PLN_ALC_AMT_R.$pre_alc_fin_flg, false);
			
			dbInsert("MGBDL0210_MGT_PLN_ALC_AMT_I01", dbc_sum, MCQueryApiBuilder.create(MGT_PLN_ALC_AMT_R.create("T")));
		}
		
		protected MCGroupByPolicy getPlnGroupPolicy() {
			MCGroupByPolicy p = new MCGroupByPolicy(getPlnAlcCol());
			p.sum(MGT_PLN_ALC_AMT_R.$amt);
			return p;
		}
		
		protected String[] getPlnAlcCol() {
			return new String[] {
					MGT_PLN_ALC_AMT_R.$wg_cd,
					MGT_PLN_ALC_AMT_R.$alc_ac_cd,
					MGT_PLN_ALC_AMT_R.$dpt_cd,
					MGT_PLN_ALC_AMT_R.$loc_cd,
					MGT_PLN_ALC_AMT_R.$oper_cd,
					MGT_PLN_ALC_AMT_R.$bp_cd,
					MGT_PLN_ALC_AMT_R.$ctg_cd,
					MGT_PLN_ALC_AMT_R.$itm_cd,
					MGT_PLN_ALC_AMT_R.$itm_sub1,
					MGT_PLN_ALC_AMT_R.$itm_sub2,
					MGT_PLN_ALC_AMT_R.$itm_sub3,
					MGT_PLN_ALC_AMT_R.$lot_no,
					MGT_PLN_ALC_AMT_R.$sublot_no,
					MGT_PLN_ALC_AMT_R.$sno1,
					MGT_PLN_ALC_AMT_R.$sno2,
					MGT_PLN_ALC_AMT_R.$sno3,
					MGT_PLN_ALC_AMT_R.$sno4
			};
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 繰り越しを取り消す。<br>
	 */
	public class Del01 extends MGBDL_AlcCalcErrSrch_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MGT_ARG_R arg = getArg();
			
			if(isNull(arg.st_ym())) {
				return;
			}
			else {
				up0().ym(arg.end_ym().addMonth(1));
				up0().sa_typ(arg.sa_typ());
				up0().pre_alc_fin_flg(true);
			}
			
			callThisChk02();
			throwCanErr();
			
			if (MAC_SA_TYP.isACT(arg.sa_typ())) {
				act();
			}
			else if (MAC_SA_TYP.isPLN(arg.sa_typ())) {
				pln();
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MGBDL_AlcCalcErrSrch.Chk02 ope = MGBDL_AlcCalcErrSrch.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}
		
		protected MGT_ARG_R getArg() {
			MGT_ARG_R r = MGT_ARG_R.create();
			
			dbSelectKeyForUpdateNoWait("MGBDL0210_MGT_ARG_S02", r, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up0());
			
			return r;
		}
		
		protected void act() {
			lockDelActAlcAmt();
		}
		
		protected void lockDelActAlcAmt() {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			MGT_ACT_ALC_AMT_R t = MGT_ACT_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_no.eq(bind("calc_no")));
			dbc_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())));
			dbc_bldr.addWhereWithCutOffAnd(t.trd_wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.calc_ctg_cd.like(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0210_MGT_ACT_ALC_AMT_S04", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBDL0210_MGT_ACT_ALC_AMT_D02").executeUpdate(up0());
		}
		
		protected void pln() {
			lockDelPlnAlcAmt();
		}
		
		protected void lockDelPlnAlcAmt() {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");
			MGT_PLN_ALC_AMT_R t = MGT_PLN_ALC_AMT_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			
			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.ym.eq(bind("ym")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.trd_calc_no.eq(bind("calc_no")));
			dbc_bldr.addWhereWithAnd(t.alc_rec_typ.eq(value(MGC_ALC_REC_TYP.CARRY.value())));
			dbc_bldr.addWhereWithCutOffAnd(t.trd_wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithCutOffAnd(t.calc_ctg_cd.like(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));
			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			
			dbSelectForUpdateNoWaitNoFetch("MGBDL0210_MGT_PLN_ALC_AMT_S04", dbc_bldr, up0());
			dbc_bldr.buildDelete("MGBDL0210_MGT_PLN_ALC_AMT_D02").executeUpdate(up0());
		}
	}
	
	protected Map_MGT_ACT_ALC_AMT_R_Chk01_RsltR<MGT_ACT_ALC_AMT_R,Chk01_RsltR> createMap_MGT_ACT_ALC_AMT_R_Chk01_RsltR() {
		return new Map_MGT_ACT_ALC_AMT_R_Chk01_RsltR<MGT_ACT_ALC_AMT_R, Chk01_RsltR>();
	}
	
	public class Map_MGT_ACT_ALC_AMT_R_Chk01_RsltR<D extends MGT_ACT_ALC_AMT_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		public void valueCopy(D dest, S src){
			dest.wg_cd(src.wg_cd());
			dest.alc_ac_cd(nvl(src.co_alc_ac_cd(), src.alc_ac_cd()));
			dest.dpt_cd(src.dpt_cd());
			dest.loc_cd(src.loc_cd());
			dest.oper_cd(src.oper_cd());
			dest.bp_cd(src.bp_cd());
			dest.ctg_cd(src.ctg_cd());
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			dest.sno1(src.sno1());
			dest.sno2(src.sno2());
			dest.sno3(src.sno3());
			dest.sno4(src.sno4());
			dest.itm_mfg_inst_no(src.itm_mfg_inst_no());
			dest.iv_no(src.iv_no());
			dest.po_no(src.po_no());
			dest.slo_no(src.slo_no());
			dest.amt(src.amt());
		}
	}
	
	protected Map_MGT_PLN_ALC_AMT_R_Chk01_RsltR<MGT_PLN_ALC_AMT_R,Chk01_RsltR> createMap_MGT_PLN_ALC_AMT_R_Chk01_RsltR() {
		return new Map_MGT_PLN_ALC_AMT_R_Chk01_RsltR<MGT_PLN_ALC_AMT_R, Chk01_RsltR>();
	}
	
	public class Map_MGT_PLN_ALC_AMT_R_Chk01_RsltR<D extends MGT_PLN_ALC_AMT_R, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		public void valueCopy(D dest, S src){
			dest.wg_cd(src.wg_cd());
			dest.alc_ac_cd(nvl(src.co_alc_ac_cd(), src.alc_ac_cd()));
			dest.dpt_cd(src.dpt_cd());
			dest.loc_cd(src.loc_cd());
			dest.oper_cd(src.oper_cd());
			dest.bp_cd(src.bp_cd());
			dest.ctg_cd(src.ctg_cd());
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			dest.sno1(src.sno1());
			dest.sno2(src.sno2());
			dest.sno3(src.sno3());
			dest.sno4(src.sno4());
			dest.amt(src.amt());
		}
	}

	//FMCB CUSTOM END
}