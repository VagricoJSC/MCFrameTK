package mcframe.serverMGBE.MGBEL0010;

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
import static mcframe.serverMGBE.MGBEL0010.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdUpriSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdUpriSrch_MC extends MGBEL_StdUpriSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準単価の検索を行います。<br>
	 */
	public class Srch01 extends MGBEL_StdUpriSrch_MC_A.Srch01 {

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
			up0().addStringColumn("no_loc_flg_str", toTrueStr(up0().no_loc_flg()));
			up0().addStringColumn("no_sppl_flg_str", toTrueStr(up0().no_sppl_flg()));
			if (MGC_AMT_DCSN_TYP.isONLY_ZERO(up0().amt_dcsn_typ())) {
				if (!up0().exclude_flg()) {
					up0().addBooleanColumn("eq_zero_flg", true);
				}
				else {
					up0().addBooleanColumn("not_zero_flg", true);
				}
			}
			else if (MGC_AMT_DCSN_TYP.isLESS_ZERO(up0().amt_dcsn_typ())) {
				if (!up0().exclude_flg()) {
					up0().addBooleanColumn("lte_zero_flg", true);
				}
				else {
					up0().addBooleanColumn("gt_zero_flg", true);
				}
			}
			else if (MGC_AMT_DCSN_TYP.isUNDR_ZERO(up0().amt_dcsn_typ())) {
				if (!up0().exclude_flg()) {
					up0().addBooleanColumn("lt_zero_flg", true);
				}
				else {
					up0().addBooleanColumn("gte_zero_flg", true);
				}
			}
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0010_MGT_STD_TOP_S01(), up0());
			if (down0().isEmpty()) {
				return;
			}

			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			addDynamicBind(up0(), list);
			executeQuery(list, MGBEL0010_MGT_STD_TOP_S02(), up0());

			// 数量設定と１単位基準の計算
			setQty(list);
		}

		protected void setQty(MCList<Srch01_QtyR> list) {
			// 数量取得用のキー、インデックス設定
			String[] keys = (String[]) getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 数量の設定
				Srch01_QtyR sumR = list.getFirst(idx, r.toArray(keys));
				if (isNull(sumR)) {
					r.qty(MCNumber.ZERO);
				}
				else {
					r.qty(sumR.qty());
				}

				// １単位基準の計算
				r.qty_unit(1);
				r.ttl_unit(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.ttl_unit_META.scale()));
				r.var_cost_unit(calcUnit(r.var_cost(), r.qty(), Srch01_RsltR.var_cost_unit_META.scale()));
				r.fxd_cost_unit(calcUnit(r.fxd_cost(), r.qty(), Srch01_RsltR.fxd_cost_unit_META.scale()));
			}
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.STD_COST", null
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}