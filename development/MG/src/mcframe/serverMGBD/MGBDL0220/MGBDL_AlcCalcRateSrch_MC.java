package mcframe.serverMGBD.MGBDL0220;

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
import static mcframe.serverMGBD.MGBDL0220.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_AlcCalcRateSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_AlcCalcRateSrch_MC extends MGBDL_AlcCalcRateSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦率情報と未配賦費用情報を検索する。<br>
	 */
	public class Srch01 extends MGBDL_AlcCalcRateSrch_MC_A.Srch01 {
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
			if (up0().alc_fin_flg()) {
				MCList<Srch01_RsltR> tmpList = MCList.create(Srch01_RsltR.class);
				executeQuery(tmpList, MGBDL0220_MGT_ALC_CALC_RATE_S01(), up0());
				down0().addAll(tmpList);
			}
			if (up0().alc_yet_flg()) {
				MCList<Srch01_RsltR> tmpList = MCList.create(Srch01_RsltR.class);
				executeQuery(tmpList, MGBDL0220_MGT_ALC_CALC_ERR_S01(), up0());
				down0().addAll(tmpList);
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			sort();
		}
		protected void sort() {
			down0().sort(
					Srch01_RsltR.$wg_cd, 
					Srch01_RsltR.$ym,
					Srch01_RsltR.$inpt_alc_typ,
					Srch01_RsltR.$alc_ac_cd,
					Srch01_RsltR.$dpt_cd,
					Srch01_RsltR.$itm_typ,
					Srch01_RsltR.$itm_typ_d_cd,
					Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3
					);
		}
	}

	//FMCB CUSTOM END
}