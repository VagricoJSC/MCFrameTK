package mcframe.serverMBBB.MBBBL0210;

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
import mcframe.serverMBBB.MBBBL5070.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_SendSchdPay"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_SendSchdPay_MC extends MBBBL_SendSchdPay_MC_A{
	//FMCB CUSTOM START

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 送信処理をする<br>
	 */
	public class Ins01 extends MBBBL_SendSchdPay_MC_A.Ins01 {
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
			MBBBL_SendSchdPayService.SendSchdPay_Upd01 ope = MBBBL_SendSchdPayService.crtSendSchdPay_Upd01();
			copy(ope.up0(), up0(), createMap_SendSchdPay_Chk01_CndR_Ins01_CndR());
			ope.exec();
		}

		protected Map_SendSchdPay_Chk01_CndR_Ins01_CndR<SendSchdPay_Chk01_CndR,Ins01_CndR> createMap_SendSchdPay_Chk01_CndR_Ins01_CndR() {
			return new Map_SendSchdPay_Chk01_CndR_Ins01_CndR<SendSchdPay_Chk01_CndR, Ins01_CndR>();
		}

		public class Map_SendSchdPay_Chk01_CndR_Ins01_CndR<D extends SendSchdPay_Chk01_CndR, S extends Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendSchdPay_Chk01_CndR.$ym, Ins01_CndR.$ym);
				addColumnPathMap(SendSchdPay_Chk01_CndR.$wg_cd, Ins01_CndR.$wg_cd);
				addColumnPathMap(SendSchdPay_Chk01_CndR.$ext_sys_cd, Ins01_CndR.$ext_sys_cd);
				addColumnPathMap(SendSchdPay_Chk01_CndR.$err_flg, Ins01_CndR.$err_flg);
			}
		}

	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 送信取消処理をする<br>
	 */
	public class Del01 extends MBBBL_SendSchdPay_MC_A.Del01 {
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
			MBBBL_SendSchdPayService.SendSchdPay_Del01 ope = MBBBL_SendSchdPayService.crtSendSchdPay_Del01();
			copy(ope.up0(), up0(), createMap_SendSchdPay_Chk02_CndR_Del01_CndR());
			ope.exec();
		}

		protected Map_SendSchdPay_Chk02_CndR_Del01_CndR<SendSchdPay_Chk02_CndR,Del01_CndR> createMap_SendSchdPay_Chk02_CndR_Del01_CndR() {
			return new Map_SendSchdPay_Chk02_CndR_Del01_CndR<SendSchdPay_Chk02_CndR, Del01_CndR>();
		}

		public class Map_SendSchdPay_Chk02_CndR_Del01_CndR<D extends SendSchdPay_Chk02_CndR, S extends Del01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(SendSchdPay_Chk02_CndR.$ym, Del01_CndR.$ym);
				addColumnPathMap(SendSchdPay_Chk02_CndR.$wg_cd, Del01_CndR.$wg_cd);
				addColumnPathMap(SendSchdPay_Chk02_CndR.$err_flg, Del01_CndR.$err_flg);
			}
		}

	}

	//FMCB CUSTOM END
}