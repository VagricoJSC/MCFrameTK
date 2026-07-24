package mcframe.serverMGBB.MGBBB0010;

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
import mcframe.serverMGBB.MGBBL5010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBBB_PcmIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBBB_PcmIfBatch_MC extends MGBBB_PcmIfBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * PcmIf_Upd01オペレーション.<p>
	 *
	 * 原価ＩＦデータを取り込む。<br>
	 */
	public class PcmIf_Upd01 extends MGBBB_PcmIfBatch_MC_A.PcmIf_Upd01 {

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
			MGBBL_PcmIfService.PcmIf_Upd01 ope = MGBBL_PcmIfService.crtPcmIf_Upd01();
			copy(ope.up0(), up0(), createMap_PcmIf_Chk01_CndR_PcmIf_Upd01_CndR());
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

		protected Map_PcmIf_Chk01_CndR_PcmIf_Upd01_CndR<PcmIf_Chk01_CndR,PcmIf_Upd01_CndR> createMap_PcmIf_Chk01_CndR_PcmIf_Upd01_CndR() {
			return new Map_PcmIf_Chk01_CndR_PcmIf_Upd01_CndR<PcmIf_Chk01_CndR, PcmIf_Upd01_CndR>();
		}

		public class Map_PcmIf_Chk01_CndR_PcmIf_Upd01_CndR<D extends PcmIf_Chk01_CndR, S extends PcmIf_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PcmIf_Chk01_CndR.$ym, PcmIf_Upd01_CndR.$ym);
				addColumnPathMap(PcmIf_Chk01_CndR.$calc_ctg_cd, PcmIf_Upd01_CndR.$calc_ctg_cd);
				addColumnPathMap(PcmIf_Chk01_CndR.$io_flg, PcmIf_Upd01_CndR.$io_flg);
				addColumnPathMap(PcmIf_Chk01_CndR.$wk_flg, PcmIf_Upd01_CndR.$wk_flg);
				addColumnPathMap(PcmIf_Chk01_CndR.$wip_flg, PcmIf_Upd01_CndR.$wip_flg);
				addColumnPathMap(PcmIf_Chk01_CndR.$stk_flg, PcmIf_Upd01_CndR.$stk_flg);
				addColumnPathMap(PcmIf_Chk01_CndR.$rerun_flg, PcmIf_Upd01_CndR.$rerun_flg);
				addColumnPathMap(PcmIf_Chk01_CndR.$err_flg, PcmIf_Upd01_CndR.$err_flg);
				addColumnPathMap(PcmIf_Chk01_CndR.$non_mov_flg, PcmIf_Upd01_CndR.$non_mov_flg);
			}
		}

	}

	//FMCB CUSTOM END
}