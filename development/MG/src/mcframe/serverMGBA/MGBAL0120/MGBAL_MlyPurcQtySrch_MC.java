package mcframe.serverMGBA.MGBAL0120;

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
import static mcframe.serverMGBA.MGBAL0120.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBAL_MlyPurcQtySrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBAL_MlyPurcQtySrch_MC extends MGBAL_MlyPurcQtySrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買数に関して月別に計画値と実績値を参照する。<br>
	 */
	public class Srch01 extends MGBAL_MlyPurcQtySrch_MC_A.Srch01 {

		/** 検索対象期間内で最大の実績年月 */
		protected MCDate _actMaxYm;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			executeQuery(down0(), MGBAL0120_MGT_PLN_PURC_S01(), up0());

			if (!down0().isEmpty()) {
				MGT_ACT_PURC_R actPurc = MGT_ACT_PURC_R.create();
				MGT_ACT_PURC_R t = MGT_ACT_PURC_R.create("T");
				MCQueryApiBuilder actPurc_bldr = MCQueryApiBuilder.create(t);
				actPurc_bldr.addMax(t.ym, MGT_ACT_PURC_R.$ym);
				actPurc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("act_calc_ctg_cd")));
				actPurc_bldr.addWhereWithAnd(t.ym.gte(bind("ym_fr")));
				actPurc_bldr.addWhereWithAnd(t.ym.lt(bind("ym_to")));

				dbSelect("MGBAL0120_MGT_ACT_PURC_S01", actPurc, actPurc_bldr, up0());
				_actMaxYm = actPurc.getDateNE(MGT_ACT_PURC_R.$ym);
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
			// 実績計画差数量、計画実績数量を計算する
			r.diff_qty(nvl(r.pln_qty(), MCNumber.ZERO).subtract(nvl(r.act_qty(), MCNumber.ZERO)));
			r.pln_act_qty(r.ym().lteDate(_actMaxYm)? r.act_qty(): r.pln_qty());
		}
	}

	//FMCB CUSTOM END
}