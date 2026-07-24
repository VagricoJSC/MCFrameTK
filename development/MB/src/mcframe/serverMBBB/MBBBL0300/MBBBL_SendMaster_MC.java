package mcframe.serverMBBB.MBBBL0300;

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
import mcframe.serverMBBB.MBBBL0300.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBB.MBBBL5060.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SendMaster"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SendMaster_MC extends MBBBL_SendMaster_MC_A{
	//FMCB CUSTOM START

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 会計マスタ情報を送信する。<br>
	 */
	public class Upd01 extends MBBBL_SendMaster_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
			throwErr(msgOpeErr());
		}

		protected void execMain() {
			MBBBL_SendAcMstService.SendAcMst_Upd01 ope = MBBBL_SendAcMstService.crtSendAcMst_Upd01();
			copy(ope.up0(), up0(), createMap_SendAcMst_Chk01_CndR_Upd01_CndR());
			ope.exec();
		}

		protected Map_SendAcMst_Chk01_CndR_Upd01_CndR<SendAcMst_Chk01_CndR,Upd01_CndR> createMap_SendAcMst_Chk01_CndR_Upd01_CndR() {
			return new Map_SendAcMst_Chk01_CndR_Upd01_CndR<SendAcMst_Chk01_CndR, Upd01_CndR>();
		}

		public class Map_SendAcMst_Chk01_CndR_Upd01_CndR<D extends SendAcMst_Chk01_CndR, S extends Upd01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendAcMst_Chk01_CndR.$master_typ, Upd01_CndR.$master_typ);
				addColumnPathMap(SendAcMst_Chk01_CndR.$ext_sys_cd, Upd01_CndR.$ext_sys_cd);
				addColumnPathMap(SendAcMst_Chk01_CndR.$err_flg, Upd01_CndR.$err_flg);
			}
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 会計マスタ情報の送信を取り消す。<br>
	 */
	public class Del01 extends MBBBL_SendMaster_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			execMain();
			throwErr(msgOpeErr());
		}

		protected void execMain() {
			MBBBL_SendAcMstService.SendAcMst_Del01 ope = MBBBL_SendAcMstService.crtSendAcMst_Del01();
			copy(ope.up0(), up0(), createMap_SendAcMst_Chk02_CndR_Del01_CndR());
			ope.exec();
		}

		protected Map_SendAcMst_Chk02_CndR_Del01_CndR<SendAcMst_Chk02_CndR,Del01_CndR> createMap_SendAcMst_Chk02_CndR_Del01_CndR() {
			return new Map_SendAcMst_Chk02_CndR_Del01_CndR<SendAcMst_Chk02_CndR, Del01_CndR>();
		}

		public class Map_SendAcMst_Chk02_CndR_Del01_CndR<D extends SendAcMst_Chk02_CndR, S extends Del01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendAcMst_Chk02_CndR.$master_typ, Del01_CndR.$master_typ);
				addColumnPathMap(SendAcMst_Chk02_CndR.$err_flg, Del01_CndR.$err_flg);
				addColumnPathMap(SendAcMst_Chk02_CndR.$ext_sys_cd, Del01_CndR.$ext_sys_cd);
			}
		}

	}

	//FMCB CUSTOM END
}