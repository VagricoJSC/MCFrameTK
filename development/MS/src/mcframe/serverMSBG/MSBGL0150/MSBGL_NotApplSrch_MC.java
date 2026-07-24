package mcframe.serverMSBG.MSBGL0150;

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
import static mcframe.serverMSBG.MSBGL0150.Query.*;
import mcframe.serverMSBG.MSBGL5050.ArSlip_Prnt02_HdrR;
import mcframe.serverMSBG.MSBGL5050.MSBGL_ArSlipPrntService;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_NotApplSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_NotApplSrch_MC extends MSBGL_NotApplSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未処理の入金情報を検索する<br>
	 */
	public class Srch01 extends MSBGL_NotApplSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBGL0150_MST_RCV_S01();
			searchForDL(sql , up0(), down0());
		}

	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 入金管理票を印刷する<br>
	 */
	public class Prnt01 extends MSBGL_NotApplSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {	
			MSBGL_ArSlipPrntService.ArSlip_Prnt02 ope = MSBGL_ArSlipPrntService.crtArSlip_Prnt02();
			setAll(ope.up0(), up0(), createMap_ArSlip_Prnt02_HdrR_Prnt01_CndR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
			
			MCIndexKey ik = ope.down0().createIndex(ArSlip_Prnt02_HdrR.$rcv_no);
			for (Prnt01_CndR up : up0()) {
				ArSlip_Prnt02_HdrR down = ope.down0().getFirst(ik, up.rcv_no());
				if (down == null) {
					continue;
				}
				else if (down.err_flg()) {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					up.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			down0().setAll(up0());
		}
		protected Map_ArSlip_Prnt02_HdrR_Prnt01_CndR<ArSlip_Prnt02_HdrR,Prnt01_CndR> createMap_ArSlip_Prnt02_HdrR_Prnt01_CndR() {
			return new Map_ArSlip_Prnt02_HdrR_Prnt01_CndR<ArSlip_Prnt02_HdrR, Prnt01_CndR>();
		}

		public class Map_ArSlip_Prnt02_HdrR_Prnt01_CndR<D extends ArSlip_Prnt02_HdrR, S extends Prnt01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ArSlip_Prnt02_HdrR.$rcv_no, Prnt01_CndR.$rcv_no);

			}
		}
	}

	//FMCB CUSTOM END
}