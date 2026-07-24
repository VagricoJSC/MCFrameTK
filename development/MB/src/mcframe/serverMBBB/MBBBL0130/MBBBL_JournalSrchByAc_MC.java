package mcframe.serverMBBB.MBBBL0130;

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
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMBBB.MBBBL0130.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_JournalSrchByAc"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_JournalSrchByAc_MC extends MBBBL_JournalSrchByAc_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MBBBL_JournalSrchByAc_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			executeQuery(down0(), MBBBL0130_MBT_JOURNAL_S01(), up0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			// 合計の設定
			for (Srch01_RsltR r : down0()) {
				if (MAC_DC_TYP.isDR(r.dc_typ())) {
					r.total_amt(r.d_amt().subtract(r.c_amt()));
					r.total_tax_amt(r.d_tax_amt().subtract(r.c_tax_amt()));
					r.total_trd_amt(r.d_trd_amt().subtract(r.c_trd_amt()));
					r.total_trd_tax_amt(r.d_trd_tax_amt().subtract(r.c_trd_tax_amt()));
				}
				else if (MAC_DC_TYP.isCR(r.dc_typ())) {
					r.total_amt(r.c_amt().subtract(r.d_amt()));
					r.total_tax_amt(r.c_tax_amt().subtract(r.d_tax_amt()));
					r.total_trd_amt(r.c_trd_amt().subtract(r.d_trd_amt()));
					r.total_trd_tax_amt(r.c_trd_tax_amt().subtract(r.d_trd_tax_amt()));
				}
				else {
					MCMessagePool.add(new MCMessage(up0(), up0().ac_cd(), MBBBL0007, r.ac_cd()));
				}
			}
			down0().setAll(groupBy(down0(), up0()));
		}

	}

	//FMCB CUSTOM END
}