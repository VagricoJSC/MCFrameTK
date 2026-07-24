package mcframe.serverMSBG.MSBGL0270;

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


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBG.MSBGL0270.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_CredSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_CredSrch_MC extends MSBGL_CredSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBGL_CredSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {

			super.doSearchMain();

			setCnd();

			// 与信限度額マスタに存在する与信情報の検索
			MCQueryPlan sql1 = MSBGL0270_MST_CRED_S01();
			searchForDL(sql1, up0(), down0());

			// 与信限度額マスタに存在しない与信情報の検索
			if (reqSrchNoCredCtrl()) {
				MCQueryPlan sql2 = MSBGL0270_MST_CRED_S02();
				searchForDL(sql2, up0(), down0());
			}
		}

		/**
		 * MSBGL0270_MST_CRED_S01で使用するバインド値をセットする
		 */
		protected void setCnd() {
			if (!isNull(up0().cred_amt_fr())) {
				// 与信対象額ＦＲＯＭが０以下の場合、MST_CREDに無いレコードも検索対象とする
				if (up0().cred_amt_fr().lte(MCNumber.ZERO)) {
					up0().addStringColumn("fr_lte_zero", "1");
				}
				// 与信対象額ＦＲＯＭが０より大きい場合、MST_CREDに無いレコードは検索対象としない
				else {
					up0().addStringColumn("fr_gt_zero", "1");
				}
			}
			if (!isNull(up0().cred_amt_to())) {
				// 与信対象額ＴＯが０以上の場合、MST_CREDに無いレコードも検索対象とする
				if (up0().cred_amt_to().gte(MCNumber.ZERO)) {
					up0().addStringColumn("to_gte_zero", "1");
				}
				// 与信対象額ＴＯが０より小さい場合、MST_CREDに無いレコードは検索対象としない
				else {
					up0().addStringColumn("to_lt_zero", "1");
				}
			}
		}

		/**
		 * 与信限度額マスタに存在しない与信情報を検索するかどうかを判断する
		 * 
		 * @return 検索する場合はtrue
		 */
		protected boolean reqSrchNoCredCtrl() {

			// 与信限度額マスタを参照する必要がある条件が１つでも指定されている場合には検索対象としない
			if (up0().alarm_flg()) {
				return false;
			}
			if (!isNull(up0().cred_use_fr())) {
				return false;
			}
			if (!isNull(up0().cred_use_to())) {
				return false;
			}

			return true;

		}
	}

	//FMCB CUSTOM END
}