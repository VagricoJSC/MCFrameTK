package mcframe.serverMSBG.MSBGL0050;

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
import static mcframe.serverMSBG.MSBGL0050.Query.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_BillAcstSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_BillAcstSrch_MC extends MSBGL_BillAcstSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売掛先請求情報を検索する<br>
	 */
	public class Srch01 extends MSBGL_BillAcstSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			MCQueryPlan sql = MSBGL0050_MST_BILL_ACST_S01();
			searchForDL(sql , up0(), down0());
		}
		protected void setUpTmpCol(Srch01_CndR up) {
			if (isSame(up.bill_cl_day(), 99)) {
				up.bill_cl_day(null);
				up.addStringColumn("BILL_CL_DAY99_FLG_STR", toTrueStr(true));
			}
		}

		@Override
		protected void editListMain() {
			setArDpt(down0());
		}

		/**
		 * 債権部門の情報を補完する
		 * 組織変更対応で、計上年月を基準に債権部門ＣＤに対する部門名、ＷＧ、ＷＧ名が取得できない場合、
		 * 対象の債権部門ＣＤをもとに適用終了日が一番大きい部門マスタから部門名、ＷＧ、ＷＧ名を補完する
		 * 
		 * @param rsltL 検索結果リスト
		 */
		protected void setArDpt(MCList<Srch01_RsltR> rsltL) {
			for (Srch01_RsltR r : rsltL) {
				if (isNull(r.ar_dpt_nm())) {
					MSBGL_ArUtil.setLastDpt(r, Srch01_RsltR.$ar_dpt_cd, Srch01_RsltR.$ar_dpt_nm);
				}
				if (!isNull(r.setoff_amt())) {
					r.setoff_amt(r.setoff_amt().multiply(-1));
				}
			}
		}
	}

	//FMCB CUSTOM END
}