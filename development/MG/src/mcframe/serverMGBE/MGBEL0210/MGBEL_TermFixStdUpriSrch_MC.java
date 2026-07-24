package mcframe.serverMGBE.MGBEL0210;

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
import static mcframe.serverMGBE.MGBEL0210.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_TermFixStdUpriSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_TermFixStdUpriSrch_MC extends MGBEL_TermFixStdUpriSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 期別確定標準単価を参照する。<br>
	 */
	public class Srch01 extends MGBEL_TermFixStdUpriSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down0(), MGBEL0210_MGT_STD_FIX_S01(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down0().isEmpty()) {
				return ;
			}
			calcUpri();
			calcOther();
		}

		protected void calcUpri() {
			for (Srch01_RsltR r : down0()) {
				r.unit_upri(calcUnit(r.std_upri(), r.std_qty(), Srch01_RsltR.unit_upri_META.scale()));
				r.base_upri(r.unit_upri().multiply(r.base_qty()));
			}
		}

		protected void calcOther() {
			MCIndexKey idxkey = down0().createIndex(
					Srch01_RsltR.$calc_ctg_cd, Srch01_RsltR.$wg_cd,
					Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$term);

			for (Srch01_RsltR r : down0()) {
				Srch01_RsltR nextR = down0().getFirst(idxkey,
						r.calc_ctg_cd(), r.wg_cd(),
						r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(),
						getNextTerm(r.term()));
				if (nextR != null) {
					nextR.unit_diff(calcDiff(nextR.unit_upri(), r.unit_upri()));
					nextR.base_diff(calcDiff(nextR.base_upri(), r.base_upri()));
					nextR.inc_per(calcIncrease(nextR.unit_diff(), r.unit_upri()));
				}
			}
		}

		protected MCDate getNextTerm(MCDate term) {
			for (mcframe.serverMA.dbc.MAM_TERM_R r : getTermList()) {
				if (isSame(r.term(), term)) {
					return r.term_end_ym();
				}
			}
			return null;
		}

	}

	//FMCB CUSTOM END
}