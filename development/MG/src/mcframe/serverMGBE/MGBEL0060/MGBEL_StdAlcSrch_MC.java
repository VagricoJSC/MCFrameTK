package mcframe.serverMGBE.MGBEL0060;

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
import static mcframe.serverMGBE.MGBEL0060.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdAlcSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdAlcSrch_MC extends MGBEL_StdAlcSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 各品目に配賦された費用情報を参照する。<br>
	 */
	public class Srch01 extends MGBEL_StdAlcSrch_MC_A.Srch01 {
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
			if (!up0().amt_zero_flg()) up0().addStringColumn("amt_zero_flg_str", "1");
			if (up0().no_loc_flg()) up0().addStringColumn("no_loc_flg_str", "1");
			if (up0().no_dpt_flg()) up0().addStringColumn("no_dpt_flg_str", "1");
			if (up0().no_sppl_flg()) up0().addStringColumn("no_sppl_flg_str", "1");
			if (up0().no_cst_flg()) up0().addStringColumn("no_cst_flg_str", "1");
			if (up0().no_dlv_flg()) up0().addStringColumn("no_dlv_flg_str", "1");
			if (up0().no_dpt2_flg()) up0().addStringColumn("no_dpt2_flg_str", "1");
			if (up0().no_loc2_flg()) up0().addStringColumn("no_loc2_flg_str", "1");
			if (up0().no_oper_flg()) up0().addStringColumn("no_oper_flg_str", "1");
			if (up0().no_bp_flg()) up0().addStringColumn("no_bp_flg_str", "1");
			if (up0().no_ctg_flg()) up0().addStringColumn("no_ctg_flg_str", "1");
			if (up0().no_itm2_flg()) up0().addStringColumn("no_itm2_flg_str", "1");
			if (up0().no_dest1_flg()) up0().addStringColumn("no_dest1_str", "1");
			if (up0().no_dest2_flg()) up0().addStringColumn("no_dest2_str", "1");
			if (up0().no_dest3_flg()) up0().addStringColumn("no_dest3_str", "1");
		}
		
		protected void srch() {
			executeQuery(down0(), MGBEL0060_STD_ALC_S01(), up0());
		}
		
	}

	//FMCB CUSTOM END
}