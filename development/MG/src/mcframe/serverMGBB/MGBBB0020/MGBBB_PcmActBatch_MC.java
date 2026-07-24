package mcframe.serverMGBB.MGBBB0020;

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
import mcframe.serverMGBB.MGBBL5020.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBB_PcmActBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBB_PcmActBatch_MC extends MGBBB_PcmActBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PcmAct_Upd01オペレーション.<p>
	 *
	 * 原価実績データを作成する。<br>
	 */
	public class PcmAct_Upd01 extends MGBBB_PcmActBatch_MC_A.PcmAct_Upd01 {

		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			try {
				execMain();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				postBatch();
			}
		}

		protected void execMain() {
			MGBBL_PcmActService.PcmAct_Upd01 ope = MGBBL_PcmActService.crtPcmAct_Upd01();
			copy(ope.up0(), up0(), createMap_PcmAct_Chk01_CndR_PcmAct_Upd01_CndR());
			ope.exec();
		}

		protected void postBatch() {
			if (_exceptionFlg) {
				MCMessagePool.clear();
				MCMessagePool.add(new MCMessage(MAUDL0009));
			}
		}

		protected void handleEx(Exception e) {
			_exceptionFlg = true;
			if (e instanceof MCAppException) {
				//正常終了と見なす
				return ;
			}
			throw new MCException(e);
		}

		protected Map_PcmAct_Chk01_CndR_PcmAct_Upd01_CndR<PcmAct_Chk01_CndR,PcmAct_Upd01_CndR> createMap_PcmAct_Chk01_CndR_PcmAct_Upd01_CndR() {
			return new Map_PcmAct_Chk01_CndR_PcmAct_Upd01_CndR<PcmAct_Chk01_CndR, PcmAct_Upd01_CndR>();
		}

		public class Map_PcmAct_Chk01_CndR_PcmAct_Upd01_CndR<D extends PcmAct_Chk01_CndR, S extends PcmAct_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PcmAct_Chk01_CndR.$calc_ctg_cd, PcmAct_Upd01_CndR.$calc_ctg_cd);
				addColumnPathMap(PcmAct_Chk01_CndR.$wg_cd, PcmAct_Upd01_CndR.$wg_cd);
				addColumnPathMap(PcmAct_Chk01_CndR.$ym, PcmAct_Upd01_CndR.$ym);
				addColumnPathMap(PcmAct_Chk01_CndR.$mfg_flg, PcmAct_Upd01_CndR.$mfg_flg);
				addColumnPathMap(PcmAct_Chk01_CndR.$io_flg, PcmAct_Upd01_CndR.$io_flg);
				addColumnPathMap(PcmAct_Chk01_CndR.$stk_flg, PcmAct_Upd01_CndR.$stk_flg);
				addColumnPathMap(PcmAct_Chk01_CndR.$del_flg, PcmAct_Upd01_CndR.$del_flg);
				addColumnPathMap(PcmAct_Chk01_CndR.$err_flg, PcmAct_Upd01_CndR.$err_flg);
			}
		}

	}

	//FMCB CUSTOM END
}