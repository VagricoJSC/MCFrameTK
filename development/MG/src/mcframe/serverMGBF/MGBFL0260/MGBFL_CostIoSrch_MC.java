package mcframe.serverMGBF.MGBFL0260;

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
import static mcframe.serverMGBF.MGBFL0260.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_CostIoSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_CostIoSrch_MC extends MGBFL_CostIoSrch_MC_A{
	//FMCB CUSTOM START

	protected static final String REPLACE_COST_IO_TNAME = "MGT_COST_IO_N";

	protected static final String BASE_COST_IO_TNAME = "MGT_COST_IO";

	// SQLのテーブル名を置換して返す
	protected String repTabName(MCNumber costIoId) {
		return BASE_COST_IO_TNAME.concat(costIoId.toString());
	}
		
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価個別受払表を検索する<br>
	 */
	public class Srch01 extends MGBFL_CostIoSrch_MC_A.Srch01 {
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
			// 他社資産以外＝ＯＮのときは資産区分＝１，２
			if (up0().except_other_flg()) {
				up0().addBooleanColumn("asst_cnd", true);
			}

			// 取引先無ＦＬＧの条件
			if (up0().no_bp_flg()) {
				up0().addStringColumn("no_bp_flg_str", "1");
			}
		}

		protected void srch() {
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			MCQueryPlan sql = MGBFL0260_MGT_COST_IO_S01();
			sql.addDynamicSQLInfo(when(null).view(REP1, v -> createDbcWithAlias(repTabName(up0().cost_io_id()), "T")));
			executeQuery(down0(), sql, up0());

			// down0がなかったら終わり
			if (down0().isEmpty()) {
				return;
			}

			executeQuery(down1(), MGBFL0260_MAM_COST_IO_CONF_S01(), up0());
		}
	}

	//FMCB CUSTOM END
}