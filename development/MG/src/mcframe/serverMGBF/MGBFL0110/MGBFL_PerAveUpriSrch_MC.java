package mcframe.serverMGBF.MGBFL0110;

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
import java.util.ArrayList;

import static mcframe.serverMGBF.MGBFL0110.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_PerAveUpriSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_PerAveUpriSrch_MC extends MGBFL_PerAveUpriSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 総平均単価を検索する<br>
	 */
	public class Srch01 extends MGBFL_PerAveUpriSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}

		protected void editUp() {
			up0().addStringColumn("asst_typ_cnd", toTrueStr(up0().except_other_flg()));
			if (!isNull(up0().repurc_obli_typ())) {
				if (MGC_REPURC_OBLI_TYP.isREPURC_OBLI_OTH(up0().repurc_obli_typ())) {
					up0().addStringColumn("repurc_obli_oth_flg", toTrueStr(true));
				}
				else {
					up0().addBooleanColumn("repurc_obli_flg", MGC_REPURC_OBLI_TYP.isONLY_REPURC_OBLI(up0().repurc_obli_typ()));
				}
			}
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0110_MGT_STD_TOP_S01(), up0());
			afterSrch();
		}

		protected void afterSrch() {
			for (Srch01_RsltR row : down0()) {
				row.qty_unit(1);
				row.ttl_upri(calcUnit(row.ttl(), row.qty(), Srch01_RsltR.ttl_upri_META.scale()));
				row.var_cost_upri(calcUnit(row.var_cost(), row.qty(), Srch01_RsltR.var_cost_upri_META.scale()));
				row.fxd_cost_upri(calcUnit(row.fxd_cost(), row.qty(), Srch01_RsltR.fxd_cost_upri_META.scale()));
				row.std_cost_ttl_upri(calcUnit(row.std_cost_ttl(), row.qty(), Srch01_RsltR.std_cost_ttl_upri_META.scale()));

				if (isNull(row.std_cost_ttl())) {
					row.std_cost_ttl(0);
				}
				else {
					row.diff_cost(row.std_cost_ttl().subtract(row.ttl()));
				}
				if (isNull(row.std_cost_ttl_upri())) {
					row.std_cost_ttl_upri(0);
				}
				else {
					row.diff_cost_upri(row.std_cost_ttl_upri().subtract(row.ttl_upri()));
				}
			}
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		list.add(MAC_EXPNS_TYP.SPPL.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.act_cost", null
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}