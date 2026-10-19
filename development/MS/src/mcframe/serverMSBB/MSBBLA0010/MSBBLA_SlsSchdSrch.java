package mcframe.serverMSBB.MSBBLA0010;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;

//FMCB IMPORT START
import static mcframe.serverMSBB.MSBBLA0010.Query.*;
//FMCB IMPORT END

/**
 * "MSBBLA_SlsSchdSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
@EI
public class MSBBLA_SlsSchdSrch extends MSBBLA_SlsSchdSrch_MC {

//FMCB CUSTOM START
	/**
	 * Srch01オペレーション.<p>
	 *
	 * ZOHO販売予定ヘッダ、顧客期間内示明細を検索する<br>
	 */
	public class Srch01 extends MSBBLA_SlsSchdSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editCnd();
			srchCstFrcst();
			if (down0().size() == 0) {
				return;
			}
		}
		
		/**
		 * 検索条件を加工する
		 */
		protected void editCnd() {
			
//			if (up0().fix_t_flg() && !up0().fix_f_flg()) {
//				up0().addStringColumn("fix_flg_str", MCBooleanUtil.booleanToDBString(true));
//			}
//			else if (!up0().fix_t_flg() && up0().fix_f_flg()) {
//				up0().addStringColumn("fix_flg_str", MCBooleanUtil.booleanToDBString(false));
//			}
//			
//			if (up0().except_frcst_stop_flg()) {
//				up0().addStringColumn("frcst_stop_flg_str", MCBooleanUtil.booleanToDBString(false));
//			}
		}
		
		/**
		 * 販売予定ヘッダ・明細を検索する
		 */
		protected void srchCstFrcst(){
			MCQueryPlan cstFrcstHSql= null;
			
			// 明細
			if (isSame(up0().mode(), "0")) {
				cstFrcstHSql = MSBBLA0010_MST_SLS_SCHD_D_S01();
			}
			// ヘッダ
			else if (isSame(up0().mode(), "1")) {
				cstFrcstHSql = MSBBLA0010_MST_SLS_SCHD_S01();
			}
			searchForDL(cstFrcstHSql, up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			if (isSame(up0().mode(), "0")) {
//				srchOtherDtl();
			}
		}
		
		
		
	}
//FMCB CUSTOM END
}