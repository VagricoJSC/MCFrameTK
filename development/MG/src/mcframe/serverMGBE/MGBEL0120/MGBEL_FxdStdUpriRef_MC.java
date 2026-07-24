package mcframe.serverMGBE.MGBEL0120;

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
import mcframe.serverMGBE.MGBEL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBE.MGBEL0120.Query.*;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_FxdStdUpriRef"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_FxdStdUpriRef_MC extends MGBEL_FxdStdUpriRef_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 確定標準単価を標準単価マスタに反映する前のチェックを行います。<br>
	 */
	public class Chk01 extends MGBEL_FxdStdUpriRef_MC_A.Chk01 {
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
					msgL.addAll(checkWritableWgCdDac(up0(), Chk01_CndR.$wg_cd));
				}
			}
			return msgL;
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 確定標準単価を標準単価マスタに反映します。<br>
	 */
	public class Ins01 extends MGBEL_FxdStdUpriRef_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNullOrNullVal(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
			callThisChk01();
			throwUpdErr();
			for (String wg : MCStringUtil.arrayValueSplit(up0().wg_cd())) {
				up0().wg_cd(wg);
				editUp();
				ref();
			}
		}

		protected void editUp() {
			up0().addStringColumn("RND_TYP", MAC_RND_TYP.CUTOFF.value());
			up0().addNumberColumn("DEC_PLACE", getBaseCur().upri_dec_place());

			MAM_WG_R dbc = MAM_WG_R.create();
			dbSelectKey("MGBEL0120_MAM_WG_S01", dbc, MCQueryApiBuilder.create(MAM_WG_R.create("T")), up0());
			up0().addStringColumn("wg_cmn_upri_flg_str", toTrueStr(dbc.cmn_upri_flg() || !isNullOrNullVal(getSysParm("DEF_WG_CD"))));
		}

		protected void callThisChk01() {
			MGBEL_FxdStdUpriRef.Chk01 ope = MGBEL_FxdStdUpriRef.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void ref() {
			if (isSame(up0().ref(), "0")) {
				ins();
			}
			else if (isSame(up0().ref(), "1")) {
				upd();
			}
			else if (isSame(up0().ref(), "2")) {
				del();
				ins();
			}
		}
		
		protected void ins() {
			executeUpdate(MGBEL0120_MAM_STDCOST_I01(), up0());
		}

		protected void upd() {
			MCCursor<MGT_STD_FIX_R> cur = openCursor(MGT_STD_FIX_R.class,
					MGBEL0120_MGT_STD_FIX_S01(), up0(), null, getFetchSize());

			while (cur.dbFetch() > 0) {
				MCList<MGT_STD_FIX_R> regL = cur.getList();
				regL.addBooleanColumn("upd_flg", false);
				MCIndexKey idxRegL = regL.createIndex(
						MGT_STD_FIX_R.$itm_cd
						,MGT_STD_FIX_R.$itm_sub1
						,MGT_STD_FIX_R.$itm_sub2
						,MGT_STD_FIX_R.$itm_sub3
						,MGT_STD_FIX_R.$term
						,MGT_STD_FIX_R.$wg_cd);
				MCList<MAM_STDCOST__R> wkL = MCList.create(MAM_STDCOST__R.class);
				MCQueryApiBuilder wkLBldr = MCQueryApiBuilder.create(MAM_STDCOST_R.create("T"));
				dbWkDelete("MGBEL0120_MAW_STDCOST_D01", wkLBldr.getBaseDbc());

				for (MGT_STD_FIX_R regR : regL) {
					MAM_STDCOST__R wkR = MAM_STDCOST__R.create();
					wkR.itm_cd(regR.itm_cd());
					wkR.itm_sub1(regR.itm_sub1());
					wkR.itm_sub2(regR.itm_sub2());
					wkR.itm_sub3(regR.itm_sub3());
					wkR.term(regR.term());
					wkR.wg_cd(regR.wg_cd());
					wkL.add(wkR);
				}
				
				dbWkInsert("MGBEL0120_MAW_STDCOST_I01", wkL, wkLBldr.getBaseDbc());
				
				MCList<MAM_STDCOST__R> updL = MCList.create(MAM_STDCOST__R.class);
				executeQuery(updL, MGBEL0120_MAM_STDCOST_S01());
				dbWkDelete("MGBEL0120_MAW_STDCOST_D02", wkLBldr.getBaseDbc());
				
				regL.addNumberColumn("rnd_std_upri");
				regL.addNumberColumn("dec_place", up0().getNumberNE("dec_place"));
				regL.addStringColumn("rnd_typ", up0().getStringNE("rnd_typ"));
				execDbFuncBatch(
						createSqlId(LOGIC_ID, "MAPA_CALC$F_RND", "01")
						, MABCFunction.getFunctionExecuter("MAPA_CALC$F_RND")
						, "rnd_std_upri"
						, regL
						, MGT_STD_FIX_R.$std_upri
						, "dec_place"
						, "rnd_typ");
				
				for (MAM_STDCOST__R updR : updL) {
					MGT_STD_FIX_R regR = regL.getFirst(idxRegL,
							updR.itm_cd()
							,updR.itm_sub1()
							,updR.itm_sub2()
							,updR.itm_sub3()
							,updR.term()
							,updR.wg_cd());
					regR.setBooleanNE("upd_flg", true);
					updR.std_qty(regR.std_qty());
					updR.std_upri(regR.getNumberNE("rnd_std_upri"));
				}
				
				if (!updL.isEmpty()) {
					MAM_STDCOST__R stdcostUpdR = MAM_STDCOST__R.create("T");
					MCQueryApiBuilder updLBldr = MCQueryApiBuilder.create(stdcostUpdR);
					updLBldr.setSet(stdcostUpdR.std_qty);
					updLBldr.addSet(stdcostUpdR.std_upri);
					dbUpdateKey("MGBEL0120_MAM_STDCOST__U01", updL, updLBldr);
				}
				
				MCList<MAM_STDCOST__R> insL = MCList.create(MAM_STDCOST__R.class);
				for (MGT_STD_FIX_R regR : regL.subList("upd_flg", false)) {
					MAM_STDCOST__R insR = MAM_STDCOST__R.create();
					insR.itm_cd(regR.itm_cd());
					insR.itm_sub1(regR.itm_sub1());
					insR.itm_sub2(regR.itm_sub2());
					insR.itm_sub3(regR.itm_sub3());
					insR.term(regR.term());
					insR.wg_cd(regR.wg_cd());
					insR.std_qty(regR.std_qty());
					insR.std_upri(regR.getNumberNE("rnd_std_upri"));
					insL.add(insR);
				}
				
				if (!insL.isEmpty()) {
					dbInsert("MGBEL0120_MAM_STDCOST__I01", insL, MCQueryApiBuilder.create(MAM_STDCOST__R.create("T")));
				}
			}
		}

		protected int getFetchSize() {
			int fetchSize = MCConst.app.getInteger("MG.MGBEL0120.fetch_size", 5000);
			if (fetchSize <= 0) {
				fetchSize = 5000;
			}
			return fetchSize;
		}

		protected void del() {
			MGT_STD_FIX_R S1W = MGT_STD_FIX_R.create("W");
			MAM_STDCOST_R t = MAM_STDCOST_R.create("T");

			execDbDelete("MGBEL0120_MAM_STDCOST_D01", t, t.term.eq(bind("term"))
					.and(t.wg_cd.in(bind("wg_cd"), value(MAC_STR.NULL_VAL.value())))
					.and(exists(subQuery().select(value("A")).from(S1W)
							.where(S1W.itm_cd.eq(t.itm_cd)
									.and(S1W.itm_sub1.eq(t.itm_sub1))
									.and(S1W.itm_sub2.eq(t.itm_sub2))
									.and(S1W.itm_sub3.eq(t.itm_sub3))
									.and(S1W.term.eq(t.term))
									.and(S1W.calc_ctg_cd.eq(bind("calc_ctg_cd")))
									.and(S1W.wg_cd.eq(bind("wg_cd")))))),
					up0());
		}
	}

	//FMCB CUSTOM END
}