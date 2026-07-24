package mcframe.serverMGBD.MGBDL0260;

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
import java.util.HashMap;
import java.util.Map;
import static mcframe.serverMGBD.MGBDL0260.Query.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_PreAlcPathSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_PreAlcPathSrch_MC extends MGBDL_PreAlcPathSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 一次配賦計算過程を検索する。<br>
	 */
	public class Srch01 extends MGBDL_PreAlcPathSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srch();
		}
		
		protected void editUp(){
			up0().addStringColumn("lvl0_flg_str", toTrueStr(up0().lvl0_flg()));
		}
		
		protected void srch() {
			dbTran().statement().executeQuery("MGBDL0260_MGT_PRE_ALC_PATH_Query_S01",
					MGBDL0260_MGT_PRE_ALC_PATH_S01(), up0(), null, null, down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			setExtno();
		}

		protected void setExtno() {
			Map<MCNumber, MCNumber> ext_map = new HashMap<>();
			MCNumber num = MCNumber.ONE;

			for (Srch01_RsltR r : down0()) {
				if (r.hrrchy().isZero() == false) {
					r.ym(null);
				}
				MCNumber curr_lvl = r.hrrchy();

				//ひとつ上のLEVELのext_noをpar_extnoに設定
				r.par_extno(ext_map.get(curr_lvl.subtract(1)));
				r.extno(num);
				ext_map.put(curr_lvl, num);
				num = num.add(1);
			}
		}
	}

	//FMCB CUSTOM END
}