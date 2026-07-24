package mcframe.serverMGBF.MGBFL0220;

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
import static mcframe.serverMGBF.MGBFL0220.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_IoSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_IoSrch_MC extends MGBFL_IoSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価受払表を検索する。<br>
	 */
	public class Srch01 extends MGBFL_IoSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down1(), MGBFL0220_MGT_ARG_S01(), up0());

			if (down1().isEmpty()) {
				return;
			}

			if (!up0().ym_flg()) {
				up0().addDateColumn("st_ym", down1().st_ym());
				up0().addDateColumn("end_ym", down1().end_ym());
			}

			executeQuery(down0(), MGBFL0220_MGT_IO_S01(), up0());

			if (down0().size() == 1 && isAllEmpty()) {
				down0().clear();
			}
			if (down0().isEmpty()) {
				down1().clear();
				return;
			}
		}

		protected boolean isAllEmpty() {
			Srch01_RsltR r = down0().get(0);
			if (!isSame(r.std_qty(), 0) && !isNull(r.std_qty())) {
				return false;
			}
			if (!isSame(r.ave_upri(), 0) && !isNull(r.ave_upri())) {
				return false;
			}
			for (String col : r.getColumnPathArray()) {
				if (isSame(col, Srch01_RsltR.$std_qty)
						|| isSame(col, Srch01_RsltR.$ave_upri)) {
					continue;
				}
				if (!r.isEmpty(col)) {
					return false;
				}
			}
			return true;
		}
	}

	//FMCB CUSTOM END
}