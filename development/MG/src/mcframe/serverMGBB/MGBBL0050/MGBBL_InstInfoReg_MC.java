package mcframe.serverMGBB.MGBBL0050;

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
import mcframe.serverMGBB.MGBBL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBB.MGBBL0050.Query.*;
import static mcframe.commonCore.notice.Core_Msg.*;
import mcframe.serverCore.mcjdbc.MCCursor;
import mcframe.serverCore.resource.MCConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBL_InstInfoReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBL_InstInfoReg_MC extends MGBBL_InstInfoReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 生産管理から情報を取得して品目製造指図情報、指図工程情報を更新する前のチェックを行う。<br>
	 */
	public class Chk01 extends MGBBL_InstInfoReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 生産管理から情報を取得して品目製造指図情報、指図工程情報を更新する。<br>
	 */
	public class Upd01 extends MGBBL_InstInfoReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk01();
			throwUpdErr();
			delWork();
			insWork();
			updCalcItmMfgInst();
			updInstOper();
		}

		protected void callThisChk01() {
			MGBBL_InstInfoReg.Chk01 ope = MGBBL_InstInfoReg.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void delWork() {
			dbWkDelete("MGBBL0050_MGW_CALC_ITM_MFG_INST_D01", MGT_ITM_MFG_INST_R.create());
		}

		protected void insWork() {
			executeUpdate(MGBBL0050_MGW_CALC_ITM_MFG_INST_I01(), up0());
		}

		protected void updCalcItmMfgInst() {
			if (!up0().itm_mfg_inst_flg()) {
				return;
			}

			try {
				executeUpdate(MGBBL0050_MGT_ITM_MFG_INST_U01(), up0());
			}
			catch (MCException e) {
				if (isNotExist(e)) {
					throw new MCAppException(MGBBL0003);
				}
				throw e;
			}
		}

		protected void updInstOper() {
			if (!up0().inst_oper_flg()) {
				return;
			}

			try {
				MCCursor<MGT_INST_OPER_R> cur = openCursor(MGT_INST_OPER_R.class,
						MGBBL0050_MGW_ITM_MFG_INST_KEY_S01(), up0(), null,
						getFetchSize());

				while (cur.dbFetch() > 0) {
					MCList<MGT_INST_OPER_R> regL = cur.getList();
					regL.addBooleanColumn("upd_flg", false);
					MCIndexKey idxRegL = regL.createIndex(
							MGT_INST_OPER_R.$calc_ctg_cd
							,MGT_INST_OPER_R.$itm_cd
							,MGT_INST_OPER_R.$itm_sub1
							,MGT_INST_OPER_R.$itm_sub2
							,MGT_INST_OPER_R.$itm_sub3
							,MGT_INST_OPER_R.$itm_mfg_inst_no
							,MGT_INST_OPER_R.$mfg_act_no
							,MGT_INST_OPER_R.$oper_act_no);
					
					MCQueryApiBuilder regLBldr = MCQueryApiBuilder.create(MGT_INST_OPER_R.create("T"));
					dbWkDelete("MGBBL0050_MGW_INST_OPER_D01", regLBldr.getBaseDbc());
					dbWkInsert("MGBBL0050_MGW_INST_OPER_I01", regL, regLBldr.getBaseDbc());
					
					MCList<MGT_INST_OPER_R> updL = MCList.create(MGT_INST_OPER_R.class);
					executeQuery(updL, MGBBL0050_MGT_ITM_MFG_INST_S01());
					dbWkDelete("MGBBL0050_MGW_INST_OPER_D02", regLBldr.getBaseDbc());
					
					for (MGT_INST_OPER_R updR : updL) {
						MGT_INST_OPER_R regR = regL.getFirst(idxRegL,
								updR.calc_ctg_cd()
								,updR.itm_cd()
								,updR.itm_sub1()
								,updR.itm_sub2()
								,updR.itm_sub3()
								,updR.itm_mfg_inst_no()
								,updR.mfg_act_no()
								,updR.oper_act_no());
						regR.setBooleanNE("upd_flg", true);
						updR.qty(regR.qty());
						updR.schd_st_dt(regR.schd_st_dt());
						updR.schd_end_dt(regR.schd_end_dt());
						updR.act_st_dt(regR.act_st_dt());
						updR.act_end_dt(regR.act_end_dt());
						updR.rmrks(regR.rmrks());
					}
					
					if (!updL.isEmpty()) {
						MGT_INST_OPER_R instOperUpdR = MGT_INST_OPER_R.create("T");
						MCQueryApiBuilder updLBldr = MCQueryApiBuilder.create(instOperUpdR);
						updLBldr.setSet(instOperUpdR.qty);
						updLBldr.addSet(instOperUpdR.schd_st_dt);
						updLBldr.addSet(instOperUpdR.schd_end_dt);
						updLBldr.addSet(instOperUpdR.act_st_dt);
						updLBldr.addSet(instOperUpdR.act_end_dt);
						updLBldr.addSet(instOperUpdR.rmrks);
						dbUpdateKey("MGBBL0050_MGT_INST_OPER_U01", updL, updLBldr);
					}
					
					MCList<MGT_INST_OPER_R> insL = MCList.create(MGT_INST_OPER_R.class);
					for (MGT_INST_OPER_R regR : regL.subList("upd_flg", false)) {
						MGT_INST_OPER_R insR = MGT_INST_OPER_R.create();
						insR.calc_ctg_cd(regR.calc_ctg_cd());
						insR.itm_cd(regR.itm_cd());
						insR.itm_sub1(regR.itm_sub1());
						insR.itm_sub2(regR.itm_sub2());
						insR.itm_sub3(regR.itm_sub3());
						insR.itm_mfg_inst_no(regR.itm_mfg_inst_no());
						insR.mfg_act_no(regR.mfg_act_no());
						insR.oper_act_no(regR.oper_act_no());
						insR.wg_cd(regR.wg_cd());
						insR.mng_dpt_cd(regR.mng_dpt_cd());
						insR.oper_cd(regR.oper_cd());
						insR.oper_seq(regR.oper_seq());
						insR.disp_seq(regR.disp_seq());
						insR.qty(regR.qty());
						insR.schd_st_dt(regR.schd_st_dt());
						insR.schd_end_dt(regR.schd_end_dt());
						insR.act_st_dt(regR.act_st_dt());
						insR.act_end_dt(regR.act_end_dt());
						insR.rmrks(regR.rmrks());
						insL.add(insR);
					}
					if (!insL.isEmpty()) {
						dbInsert("MGBBL0050_MGT_INST_OPER_I01", insL, MCQueryApiBuilder.create(MGT_INST_OPER_R.create("T")));
					}
				}
			}
			catch (MCException e) {
				if (isNotExist(e)) {
					throw new MCAppException(MGBBL0003);
				}
				throw e;
			}
		}

		protected int getFetchSize() {
			int fetchSize = MCConst.app.getInteger("MG.MGBBL0050.fetch_size", 5000);
			if (fetchSize <= 0) {
				fetchSize = 5000;
			}
			return fetchSize;
		}

		/**
		 * 「ORA-00942: 表またはビューが存在しません。」
		 * による例外かどうかを判別する<P>
		 * 
		 * @param ex 判断対象の例外
		 * @return boolean ORA-00942のエラーの場合は、true。
		 */
		protected boolean isNotExist(MCException ex) {
			if (ex == null) {
				return false;
			}
			return FCBCC0140.equals(ex.getID());
		}
	}

	//FMCB CUSTOM END
}