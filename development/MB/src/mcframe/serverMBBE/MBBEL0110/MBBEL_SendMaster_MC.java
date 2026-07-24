package mcframe.serverMBBE.MBBEL0110;

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
import mcframe.serverMBBE.MBBEL5020.MBBEL_SendExtMstService;
import mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk01_CndR;
import mcframe.serverMBBE.MBBEL5020.SendExtMst_Chk02_CndR;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_SendMaster"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_SendMaster_MC extends MBBEL_SendMaster_MC_A{
	//FMCB CUSTOM START
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 送信処理をする<br>
	 */
	public class Ins01 extends MBBEL_SendMaster_MC_A.Ins01 {
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
			MBBEL_SendExtMstService.SendExtMst_Ins01 ope = MBBEL_SendExtMstService.crtSendExtMst_Ins01();
			copy(ope.up0(), up0(), createMap_SendExtMst_Chk01_CndR_Ins01_CndR());
			ope.exec();
		}

		protected Map_SendExtMst_Chk01_CndR_Ins01_CndR<SendExtMst_Chk01_CndR,Ins01_CndR> createMap_SendExtMst_Chk01_CndR_Ins01_CndR() {
			return new Map_SendExtMst_Chk01_CndR_Ins01_CndR<SendExtMst_Chk01_CndR, Ins01_CndR>();
		}

		public class Map_SendExtMst_Chk01_CndR_Ins01_CndR<D extends SendExtMst_Chk01_CndR, S extends Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendExtMst_Chk01_CndR.$ext_master_typ, Ins01_CndR.$ext_master_typ);
				addColumnPathMap(SendExtMst_Chk01_CndR.$ext_sys_cd, Ins01_CndR.$ext_sys_cd);
				addColumnPathMap(SendExtMst_Chk01_CndR.$err_flg, Ins01_CndR.$err_flg);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 送信取消処理をする<br>
	 */
	public class Del01 extends MBBEL_SendMaster_MC_A.Del01 {
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
			MBBEL_SendExtMstService.SendExtMst_Del01 ope = MBBEL_SendExtMstService.crtSendExtMst_Del01();
			copy(ope.up0(), up0(), createMap_SendExtMst_Chk02_CndR_Del01_CndR());
			ope.exec();
		}

		protected Map_SendExtMst_Chk02_CndR_Del01_CndR<SendExtMst_Chk02_CndR,Del01_CndR> createMap_SendExtMst_Chk02_CndR_Del01_CndR() {
			return new Map_SendExtMst_Chk02_CndR_Del01_CndR<SendExtMst_Chk02_CndR, Del01_CndR>();
		}

		public class Map_SendExtMst_Chk02_CndR_Del01_CndR<D extends SendExtMst_Chk02_CndR, S extends Del01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendExtMst_Chk02_CndR.$ext_master_typ, Del01_CndR.$ext_master_typ);
				addColumnPathMap(SendExtMst_Chk02_CndR.$ext_sys_cd, Del01_CndR.$ext_sys_cd);
				addColumnPathMap(SendExtMst_Chk02_CndR.$err_flg, Del01_CndR.$err_flg);
			}
		}
	}

	//FMCB CUSTOM END
}