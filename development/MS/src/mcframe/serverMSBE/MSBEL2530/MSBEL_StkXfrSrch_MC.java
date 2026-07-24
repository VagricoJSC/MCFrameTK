package mcframe.serverMSBE.MSBEL2530;

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
import mcframe.serverMSBE.MSBEL5550.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL2530.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkXfrSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkXfrSrch_MC extends MSBEL_StkXfrSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫振替情報を検索する<br>
	 */
	public class Srch01 extends MSBEL_StkXfrSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void beforeSearchForBizDatDL() {
			super.beforeSearchForBizDatDL();
			beforeSearchForBizDatDLCmn();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			MCQueryPlan stkXfrSql = MSBEL2530_MST_STK_XFR_ACT_S01();
			searchForDL(stkXfrSql, up0(), down0());
		}

		protected void beforeSearchForBizDatDLCmn() {
			// 品目分類
			up0().itm_grp_flg1(true);
			up0().itm_grp_flg2(true);
			up0().itm_grp_flg3(true);
			up0().itm_grp_flg4(true);
			up0().itm_grp_flg5(true);
			up0().itm_grp_flg6(true);
			up0().itm_grp_flg7(true);
			up0().itm_grp_flg8(true);
			up0().itm_grp_flg9(true);
			up0().itm_grp_flg10(true);
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 振替伝票を発行する<br>
	 */
	public class Prnt01 extends MSBEL_StkXfrSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 帳票発行サービス呼び出し
			callShipRprtPrnt01();
		}

		/**
		 * 帳票発行サービスのPrnt01を実行する。
		 */
		protected void callShipRprtPrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 srp = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
		
			MCList<ShipRprt_Prnt01_HdrR> hdrL = up0().groupBy(ShipRprt_Prnt01_HdrR.$dlv_slip_no,ShipRprt_Prnt01_HdrR.$dlv_slip_act_no);
	
			for (ShipRprt_Prnt01_HdrR r : hdrL){
				
				r.trn_typ(MSC_TRN_TYP.STK_XFR.value());
				r.dlv_slip_prnt_flg(true);
				
				srp.up0().add(r);
		}

			srp.exec();
		}
	}

	//FMCB CUSTOM END
}