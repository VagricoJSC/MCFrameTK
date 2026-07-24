package mcframe.serverMGBD.MGBDB0010;

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
import mcframe.serverMGBD.MGBDL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDB_CalcCostBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDB_CalcCostBatch_MC extends MGBDB_CalcCostBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * CalcCost_Upd01オペレーション.<p>
	 *
	 * 原価計算を実行する。<br>
	 */
	public class CalcCost_Upd01 extends MGBDB_CalcCostBatch_MC_A.CalcCost_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
		}

		protected void execMain() {
			MCList<MGT_ACT_PTN_CONFIG_R> tgt = MCList.create(MGT_ACT_PTN_CONFIG_R.class);
			selectTgt(tgt);
			execMain(tgt);
			throwErr(msgOpeErr());
		}

		/**
		 * 引数のコンテナを使用して計算対象を検索する。
		 */
		protected void selectTgt(MCList<MGT_ACT_PTN_CONFIG_R> tgt) {
			MGT_ACT_PTN_CONFIG_R t = MGT_ACT_PTN_CONFIG_R.create("T");
			MCQueryApiBuilder tgt_bldr = MCQueryApiBuilder.create(t);

			tgt_bldr.setWhere(t.act_ptn_cd.eq(bind("1")), up0().act_ptn_cd());
			tgt_bldr.setOrderByAsc(t.calc_act_seq);
			if (dbSelect("MGBDB0010_MGT_ACT_PTN_CONFIG_S01", tgt, tgt_bldr) == 0) {
				throw new MCAppException(up0(), CalcCost_Upd01_CndR.$act_ptn_cd,
						MGBDL0039, up0().act_ptn_cd());
			}
		}

		protected void execMain(MCList<MGT_ACT_PTN_CONFIG_R> tgt) {
			MGBDL_CalcCostService.CalcCost_Ins01 ope = MGBDL_CalcCostService.crtCalcCost_Ins01();
			addAll(ope.up0(), tgt, createMap_CalcCost_CndR_MGT_ACT_PTN_CONFIG_R());
			ope.exec();
		}

		protected Map_CalcCost_CndR_MGT_ACT_PTN_CONFIG_R<CalcCost_CndR,MGT_ACT_PTN_CONFIG_R> createMap_CalcCost_CndR_MGT_ACT_PTN_CONFIG_R() {
			return new Map_CalcCost_CndR_MGT_ACT_PTN_CONFIG_R<CalcCost_CndR, MGT_ACT_PTN_CONFIG_R>();
		}

		public class Map_CalcCost_CndR_MGT_ACT_PTN_CONFIG_R<D extends CalcCost_CndR, S extends MGT_ACT_PTN_CONFIG_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(CalcCost_CndR.$term, MGT_ACT_PTN_CONFIG_R.$term);
				addColumnPathMap(CalcCost_CndR.$calc_grp_cd, MGT_ACT_PTN_CONFIG_R.$calc_grp_cd);
				addColumnPathMap(CalcCost_CndR.$ym_fr, MGT_ACT_PTN_CONFIG_R.$st_ym);
				addColumnPathMap(CalcCost_CndR.$ym_to, MGT_ACT_PTN_CONFIG_R.$end_ym);
				addColumnPathMap(CalcCost_CndR.$xrate_cd, MGT_ACT_PTN_CONFIG_R.$xrate_cd);
				addColumnPathMap(CalcCost_CndR.$rmrks, MGT_ACT_PTN_CONFIG_R.$rmrks);
				addColumnPathMap(CalcCost_CndR.$sub_char1, MGT_ACT_PTN_CONFIG_R.$sub_char1);
				addColumnPathMap(CalcCost_CndR.$sub_char2, MGT_ACT_PTN_CONFIG_R.$sub_char2);
				addColumnPathMap(CalcCost_CndR.$sub_char3, MGT_ACT_PTN_CONFIG_R.$sub_char3);
				addColumnPathMap(CalcCost_CndR.$carry_flg, MGT_ACT_PTN_CONFIG_R.$carry_flg);
				addColumnPathMap(CalcCost_CndR.$err_proceed_flg, MGT_ACT_PTN_CONFIG_R.$err_proceed_flg);
			}
		}

	}

	//FMCB CUSTOM END
}