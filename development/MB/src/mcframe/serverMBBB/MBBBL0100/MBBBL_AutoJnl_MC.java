package mcframe.serverMBBB.MBBBL0100;

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
import mcframe.serverMBBB.MBBBL0100.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMBBB.MBBBL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBBL_AutoJnl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBBL_AutoJnl_MC extends MBBBL_AutoJnl_MC_A{
	//FMCB CUSTOM START

	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MBBBL_AutoJnl_MC_A.Ins01 {

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
			MBBBL_AutoJnlService.AutoJnl_Upd01 ope = MBBBL_AutoJnlService.crtAutoJnl_Upd01();
			copy(ope.up0(), up0(), createMap_AutoJnl_Chk01_CndR_Ins01_CndR());
			ope.exec();
		}

		protected Map_AutoJnl_Chk01_CndR_Ins01_CndR<AutoJnl_Chk01_CndR,Ins01_CndR> createMap_AutoJnl_Chk01_CndR_Ins01_CndR() {
			return new Map_AutoJnl_Chk01_CndR_Ins01_CndR<AutoJnl_Chk01_CndR, Ins01_CndR>();
		}

		public class Map_AutoJnl_Chk01_CndR_Ins01_CndR<D extends AutoJnl_Chk01_CndR, S extends Ins01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(AutoJnl_Chk01_CndR.$ac_ym, Ins01_CndR.$ac_ym);
				addColumnPathMap(AutoJnl_Chk01_CndR.$dt_fr, Ins01_CndR.$dt_fr);
				addColumnPathMap(AutoJnl_Chk01_CndR.$dt_to, Ins01_CndR.$dt_to);
				addColumnPathMap(AutoJnl_Chk01_CndR.$ac_slip_dt, Ins01_CndR.$ac_slip_dt);
				addColumnPathMap(AutoJnl_Chk01_CndR.$jnl_act_cd, Ins01_CndR.$jnl_act_cd);
				addColumnPathMap(AutoJnl_Chk01_CndR.$wg_cd, Ins01_CndR.$wg_cd);
				addColumnPathMap(AutoJnl_Chk01_CndR.$rerun_flg, Ins01_CndR.$rerun_flg);
				addColumnPathMap(AutoJnl_Chk01_CndR.$jnl_rmrks, Ins01_CndR.$jnl_rmrks);
				addColumnPathMap(AutoJnl_Chk01_CndR.$err_flg, Ins01_CndR.$err_flg);
			}
		}

	}

	//FMCB CUSTOM END
}