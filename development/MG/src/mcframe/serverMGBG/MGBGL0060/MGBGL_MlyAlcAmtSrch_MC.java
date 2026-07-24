package mcframe.serverMGBG.MGBGL0060;

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
import static mcframe.serverMGBG.MGBGL0060.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_MlyAlcAmtSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_MlyAlcAmtSrch_MC extends MGBGL_MlyAlcAmtSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦費用に関して月別に計画値と実績値を参照する。<br>
	 */
	public class Srch01 extends MGBGL_MlyAlcAmtSrch_MC_A.Srch01 {

		/** 検索対象期間内で最大の実績年月 */
		protected MCDate _actMaxYm;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			editUp();

			executeQuery(down0(), MGBGL0060_MGT_PLN_ALC_AMT_S01(), up0());

			if (!down0().isEmpty()) {
				MGT_ACT_ALC_AMT_R actSls = MGT_ACT_ALC_AMT_R.create();
				MGT_ACT_ALC_AMT_R t = MGT_ACT_ALC_AMT_R.create("T");
				MCQueryApiBuilder actSls_bldr = MCQueryApiBuilder.create(t);
				actSls_bldr.addMax(t.ym, MGT_ACT_ALC_AMT_R.$ym);
				actSls_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("act_calc_ctg_cd")));
				actSls_bldr.addWhereWithAnd(t.ym.gte(bind("ym_fr")));
				actSls_bldr.addWhereWithAnd(t.ym.lt(bind("ym_to")));

				dbSelect("MGBGL0060_MGT_ACT_ALC_AMT_S01", actSls, actSls_bldr, up0());
				_actMaxYm = actSls.getDateNE(MGT_ACT_ALC_AMT_R.$ym);
			}
		}

		/**
		 * 上り電文の加工
		 */
		protected void editUp() {
			if (up0().not_my_wg_flg()) {
				up0().addStringColumn("not_my_wg_flg_str", toTrueStr(true));
			}

			if (up0().not_pre_alc_fin_flg()) {
				up0().addStringColumn("pre_alc_fin_flg_str", toFalseStr(false));
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDown(r);
			}
		}

		protected void editDown(Srch01_RsltR r) {
			// 実績計画差金額、計画実績金額を計算する
			r.diff_amt(nvl(r.pln_amt(), MCNumber.ZERO).subtract(nvl(r.act_amt(), MCNumber.ZERO)));
			r.pln_act_amt(r.ym().lteDate(_actMaxYm)? r.act_amt(): r.pln_amt());
		}

	}

	//FMCB CUSTOM END
}