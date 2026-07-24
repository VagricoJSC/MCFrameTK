package mcframe.serverMBBE.MBBEB0020;

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
import mcframe.serverMBBE.MBBEL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEB_RecvExtMstBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEB_RecvExtMstBatch_MC extends MBBEB_RecvExtMstBatch_MC_A{
	//FMCB CUSTOM START

	/**
	 * RecvExtMstBatch_Upd01オペレーション.<p>
	 *
	 * 外部マスタ取込を行う。<br>
	 */
	public class RecvExtMstBatch_Upd01 extends MBBEB_RecvExtMstBatch_MC_A.RecvExtMstBatch_Upd01 {
		/** 例外発生ＦＬＧ **/
		protected boolean _exceptionFlg;
		
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			try {
				callRecvMstService();
			}
			catch (Exception ex) {
				handleEx(ex);
			}
			finally {
				postBatch();
			}
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
				return;
			}
			throw new MCException(e);
		}
		
		protected void callRecvMstService() {
			MBBEL_RecvExtMstService.RecvExtMst_Upd01 ope = MBBEL_RecvExtMstService.crtRecvExtMst_Upd01();
			copy(ope.up0(), up0(), createMap_RecvExtMst_Chk01_CndR_RecvExtMstBatch_Upd01_CndR());
			ope.exec();
		}
		
		protected Map_RecvExtMst_Chk01_CndR_RecvExtMstBatch_Upd01_CndR<RecvExtMst_Chk01_CndR,RecvExtMstBatch_Upd01_CndR> createMap_RecvExtMst_Chk01_CndR_RecvExtMstBatch_Upd01_CndR() {
			return new Map_RecvExtMst_Chk01_CndR_RecvExtMstBatch_Upd01_CndR<RecvExtMst_Chk01_CndR, RecvExtMstBatch_Upd01_CndR>();
		}
		
		public class Map_RecvExtMst_Chk01_CndR_RecvExtMstBatch_Upd01_CndR <D extends RecvExtMst_Chk01_CndR, S extends RecvExtMstBatch_Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RecvExtMst_Chk01_CndR.$ext_master_typ, RecvExtMstBatch_Upd01_CndR.$ext_master_typ);
				addColumnPathMap(RecvExtMst_Chk01_CndR.$ext_sys_cd, RecvExtMstBatch_Upd01_CndR.$ext_sys_cd);
				addColumnPathMap(RecvExtMst_Chk01_CndR.$master_check_dt, RecvExtMstBatch_Upd01_CndR.$master_check_dt);
			}
		}
	}

	//FMCB CUSTOM END
}