package mcframe.serverMSBG.MSBGB0010;

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
import mcframe.serverMSBG.MSBGL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGB_BillCl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGB_BillCl_MC extends MSBGB_BillCl_MC_A{
	//FMCB CUSTOM START

	/**
	 * BillCl_Upd01オペレーション.<p>
	 *
	 */
	public class BillCl_Upd01 extends MSBGB_BillCl_MC_A.BillCl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {

			if (!isNull(up0().tgt_dt())) {
				up0().tgt_dt(up0().tgt_dt().trunc(MCDate.DAY));
			}

			// 請求締サービスのバッチ処理を実行する
			MSBGL_BillClService.BillCl_Upd01 op = MSBGL_BillClService.crtBillCl_Upd01();
			copy(op.up0(), up0(), createMap_BillCl_Upd01_CndR_BillCl_Upd01_CndR());
			op.exec();
		}
		
		protected Map_BillCl_Upd01_CndR_BillCl_Upd01_CndR<mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR,BillCl_Upd01_CndR> createMap_BillCl_Upd01_CndR_BillCl_Upd01_CndR() {
			return new Map_BillCl_Upd01_CndR_BillCl_Upd01_CndR<mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR, BillCl_Upd01_CndR>();
		}

		public class Map_BillCl_Upd01_CndR_BillCl_Upd01_CndR<D extends mcframe.serverMSBG.MSBGL5030.BillCl_Upd01_CndR, S extends BillCl_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(BillCl_Upd01_CndR.$tgt_dt, BillCl_Upd01_CndR.$tgt_dt);
			}
		}
	}

	//FMCB CUSTOM END
}