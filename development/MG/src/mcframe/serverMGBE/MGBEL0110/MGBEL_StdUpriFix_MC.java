package mcframe.serverMGBE.MGBEL0110;

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
import mcframe.serverMGBE.MGBEL0110.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBE.MGBEL0110.Query.*;
import mcframe.serverCore.database.MCSQLClause;
import java.util.ArrayList;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogger;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdUpriFix"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdUpriFix_MC extends MGBEL_StdUpriFix_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未確定の標準単価を検索する。<br>
	 */
	public class Srch01 extends MGBEL_StdUpriFix_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}

		protected void editUp() {
			editUpCom(up0());
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0110_MGT_CALC_ITM_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editListCom(this, up0(), down0());
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 確定済の標準単価を検索する。<br>
	 */
	public class Srch02 extends MGBEL_StdUpriFix_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}

		protected void editUp() {
			editUpCom(up0());
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0110_MGT_STD_FIX_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editListCom(this, up0(), down0());
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 標準単価確定前のチェックを行う。<br>
	 */
	public class Chk01 extends MGBEL_StdUpriFix_MC_A.Chk01 {

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
			MCList<Chk01_RsltR> notErrL = getChkList(up1());
			for (Chk01_RsltR upR : notErrL){
				msgL.addAll(checkWritableWgCdDac(upR, Chk01_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 標準単価取り消す前のチェックを行う。<br>
	 */
	public class Chk02 extends MGBEL_StdUpriFix_MC_A.Chk02 {

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
			MCList<Chk01_RsltR> notErrL = getChkList(up1());
			for (Chk01_RsltR upR : notErrL){
				msgL.addAll(checkWritableWgCdDac(upR, Chk01_RsltR.$wg_cd));
			}
			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 標準単価一括確定前のチェックを行う。<br>
	 */
	public class Chk03 extends MGBEL_StdUpriFix_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// DACチェック
				for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
					up0().wg_cd(wg);
					msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));
				}
			}
			return msgL;
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 標準単価一括取り消す前のチェックを行う。<br>
	 */
	public class Chk04 extends MGBEL_StdUpriFix_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(checkSub());
			return msgL;
		}

		protected MCMessageList checkSub() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// DACチェック
				for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
					up0().wg_cd(wg);
					msgL.addAll(checkWritableWgCdDac(up0(), Chk04_CndR.$wg_cd));
				}
			}
			return msgL;
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 標準単価を確定する。<br>
	 */
	public class Upd01 extends MGBEL_StdUpriFix_MC_A.Upd01 {

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
			editUp();
			callThisChk01();
			throwUpdErr();
			insMgwFixItm(up1());
			callProc();
		}

		protected void editUp() {
			setPegNo(up1());
		}

		protected void callThisChk01() {
			MGBEL_StdUpriFix.Chk01 ope = MGBEL_StdUpriFix.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callProc() {
			String procId = "MGPA_ITM_FIX$P_FIX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :calc_no");
		}

	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 標準単価を一括確定する。<br>
	 */
	public class Upd02 extends MGBEL_StdUpriFix_MC_A.Upd02 {

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
			editUp();
			callThisChk03();
			throwUpdErr();
			for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
				up0().wg_cd(wg);
				callProc();
			}
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
		}

		protected void callThisChk03() {
			MGBEL_StdUpriFix.Chk03 ope = MGBEL_StdUpriFix.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void callProc() {
			String procId = "MGPA_ITM_FIX$P_BULK_FIX";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :calc_no, :wg_cd");
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 標準単価を取り消す。<br>
	 */
	public class Del01 extends MGBEL_StdUpriFix_MC_A.Del01 {

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
			editUp();
			callThisChk02();
			throwUpdErr();
			insMgwFixItm(up1());
			callProc();
		}

		protected void editUp() {
			setPegNo(up1());
		}

		protected void callThisChk02() {
			MGBEL_StdUpriFix.Chk02 ope = MGBEL_StdUpriFix.crtChk02();
			MCRow.copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
		}

		protected void callProc() {
			String procId = "MGPA_ITM_FIX$P_CANCEL";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :calc_no");
		}

	}

	/**
	 * Del02オペレーション.<p>
	 *
	 * 標準単価を一括取り消す。<br>
	 */
	public class Del02 extends MGBEL_StdUpriFix_MC_A.Del02 {

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
			editUp();
			callThisChk04();
			throwUpdErr();
			for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
				up0().wg_cd(wg);
				callProc();
			}
		}

		/**
		 * 上り電文設定
		 */
		protected void editUp() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
		}

		protected void callThisChk04() {
			MGBEL_StdUpriFix.Chk04 ope = MGBEL_StdUpriFix.crtChk04();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void callProc() {
			String procId = "MGPA_ITM_FIX$P_BULK_CANCEL";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, up0(), null, ":calc_grp_cd, :calc_no, :wg_cd, :term");
		}

	}

	//////////////////////////////////////////////////////////////////////
	// Common
	protected void editUpCom(Srch01_CndR up) {
		if (MGC_AMT_DCSN_TYP.isONLY_ZERO(up.amt_dcsn_typ())) {
			if (!up.exclude_flg()) {
				up.addBooleanColumn("eq_zero_flg", true);
			}
			else {
				up.addBooleanColumn("not_zero_flg", true);
			}
		}
		else if (MGC_AMT_DCSN_TYP.isLESS_ZERO(up.amt_dcsn_typ())) {
			if (!up.exclude_flg()) {
				up.addBooleanColumn("lte_zero_flg", true);
			}
			else {
				up.addBooleanColumn("gt_zero_flg", true);
			}
		}
		else if (MGC_AMT_DCSN_TYP.isUNDR_ZERO(up.amt_dcsn_typ())) {
			if (!up.exclude_flg()) {
				up.addBooleanColumn("lt_zero_flg", true);
			}
			else {
				up.addBooleanColumn("gte_zero_flg", true);
			}
		}

		MGT_ARG_R dbc = MGT_ARG_R.create();
		if (dbSelectKey("MGBEL0110_MGT_ARG_S01", dbc, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up) > 0) {
			up.term(dbc.term());
			if (getTermInfoYM(dbc.term().addMonth(-1)) != null) {
				up.pre_term(getTermInfoYM(dbc.term().addMonth(-1)).term());
			}
		}
	}

	protected void editListCom(MCOperation ope, Srch01_CndR up, MCList<Srch01_RsltR> down) {
		if (isNull(down)) {
			return;
		}

		MCList<Srch01_RsltR> list = down.createInstance();
		MCIndexKey idxkey = null;
		String[] keys = getKeys();
		if (up.diff_flg()) {
			MCQueryPlan sql = MGBEL0110_MGT_STD_FIX_S02();
			executeQuery(list, sql, up);
			idxkey = list.createIndex(keys);
		}

		for (Srch01_RsltR row : down) {
			// １単位基準数の計算
			row.qty_unit(1);
			row.ttl_unit(calcUnit(row.ttl(), row.qty(), Srch01_RsltR.ttl_unit_META.scale()));
			row.var_cost_unit(calcUnit(row.var_cost(), row.qty(), Srch01_RsltR.var_cost_unit_META.scale()));
			row.fxd_cost_unit(calcUnit(row.fxd_cost(), row.qty(), Srch01_RsltR.fxd_cost_unit_META.scale()));

			if (up.diff_flg()) {
				Srch01_RsltR preR = list.getFirst(idxkey, row.toArray(keys));

				if (isNull(preR)) {
					row.diff_ttl(row.ttl());
					row.diff_ttl_unit(row.ttl_unit());
				}
				else {
					if (isSame(row.qty(), preR.qty())) {
						row.pre_ttl(preR.ttl());
					}
					else {
						// 前期の単価を今期の数量あたりに換算する
						row.pre_ttl(calcUnit(preR.ttl().multiply(row.qty()),
								preR.qty(), Srch01_RsltR.pre_ttl_META.scale()));
					}
					row.diff_ttl(row.ttl().subtract(row.pre_ttl()));
					row.inc_per(calcIncrease(row.diff_ttl(), row.pre_ttl()));
					row.pre_ttl_unit(calcUnit(row.pre_ttl(), row.qty(), Srch01_RsltR.pre_ttl_unit_META.scale()));
					row.diff_ttl_unit(row.ttl_unit().subtract(row.pre_ttl_unit()));
					row.inc_per_unit(calcIncrease(row.diff_ttl_unit(), row.pre_ttl_unit()));
				}
			}
		}
	}

	protected String[] getKeys() {
		return new String[] { Srch01_RsltR.$itm_cd,
				Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$calc_ctg_cd, Srch01_RsltR.$wg_cd };
	}

	protected void insMgwFixItm(MCList<Chk01_RsltR> list) {
		MCList<MGW_FIX_ITM_R> dbcL = MCList.create(MGW_FIX_ITM_R.class);
		MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(MGW_FIX_ITM_R.create("T"));
		execDbWkDelete("MGBEL0110_MGW_FIX_ITM_D01", MGW_FIX_ITM_R.create());
		list.forEach(r -> dbcL.add(r.dbc()));
		dbInsertEx("MGBEL0110_MGW_FIX_ITM_I01", dbcL, dbcL_bldr);
	}

	//////////////////////////////////////////////////////////////////////
	// DynamicSql
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.STD_COST", null
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}