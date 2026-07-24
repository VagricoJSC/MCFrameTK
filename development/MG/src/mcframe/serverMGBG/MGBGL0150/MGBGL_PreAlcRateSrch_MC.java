package mcframe.serverMGBG.MGBGL0150;

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
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMGBG.MGBGL0150.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_PreAlcRateSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_PreAlcRateSrch_MC extends MGBGL_PreAlcRateSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦比率を検索する。<br>
	 */
	public class Srch01 extends MGBGL_PreAlcRateSrch_MC_A.Srch01 {

		/** 検索種別：期間 */
		protected String _TERMSRCH = "0";

		/** 検索種別：計画 */
		protected String _PLNSRCH = "1";

		/** 検索種別：実績 */
		protected String _ACTSRCH = "2";

		/** 検索種別：計画実績 */
		protected String _PLNACTSRCH = "3";

		/** lpad で使用する補完文字 */
		protected String _LPADSTR = "0";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setSrchTyp();
			srchPreAlcRate();
		}

		protected void setSrchTyp() {
			// 計画
			if (isSame(up0().typ(), _PLNSRCH)) {
				up0().addStringColumn("PLN_ONLY", up0().pln_calc_ctg_cd());
			}
			// 実績
			else if (isSame(up0().typ(), _ACTSRCH)) {
				up0().addStringColumn("ACT_ONLY", up0().act_calc_ctg_cd());
			}
			// 計画実績
			else if (isSame(up0().typ(), _PLNACTSRCH)) {
				up0().addStringColumn("PLN", up0().pln_calc_ctg_cd());
				up0().addStringColumn("ACT", up0().act_calc_ctg_cd());
			}
		}

		protected void srchPreAlcRate() {
			executeQuery(down0(), getCoreSql(), up0());
		}

		protected MCQueryPlan getCoreSql() {
			int colNo = 0;
			List<String> bindList = new ArrayList<String>();

			if (isSame(up0().typ(), _TERMSRCH)) {
				// 期間
				for (MAM_TERM_R termR : getTermList()) {

					if (termR.term().gte(up0().term_fr())
							&& termR.term().lte(up0().term_to())) {

						// バインド変数追加
						String key = "term" + lpad(colNo, 2, _LPADSTR);
						up0().addDateColumn(key, termR.term());
						bindList.add(key);

						colNo++;
					}
				}
				return MGBGL0150_MGT_PRE_RATE_TERM_S01(bindList);
			}
			else {
				// 月次
				for (MCDate date = up0().ym_fr(); date
						.lte(up0().ym_to()); date = date.addMonth(1)) {

					// バインド変数追加
					String key = "ym" + lpad(colNo, 2, _LPADSTR);
					up0().addDateColumn(key, date);
					bindList.add(key);

					colNo++;
				}
				boolean plnFlg = isSame(up0().typ(), _PLNSRCH) || isSame(up0().typ(), _PLNACTSRCH);
				boolean actFlg = isSame(up0().typ(), _ACTSRCH) || isSame(up0().typ(), _PLNACTSRCH);
				return MGBGL0150_MGT_PRE_RATE_MLY_S01(bindList, plnFlg, actFlg);
			}
		}
	}

	//FMCB CUSTOM END
}