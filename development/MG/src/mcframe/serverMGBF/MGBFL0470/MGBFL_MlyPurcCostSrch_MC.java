package mcframe.serverMGBF.MGBFL0470;

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
import static mcframe.serverMGBF.MGBFL0470.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MlyPurcCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MlyPurcCostSrch_MC extends MGBFL_MlyPurcCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月別に購買原価情報を参照する。<br>
	 */
	public class Srch01 extends MGBFL_MlyPurcCostSrch_MC_A.Srch01 {

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
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0470_MGT_ACC_TOP_S01(), up0());
			if (down0().size() == 0) {
				return;
			}

			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBFL0470_MGT_ACC_TOP_S02(), up0());

			// 後処理
			afterSrch(list);
		}

		// 後処理(数量設定、単価計算)
		protected void afterSrch(MCList<Srch01_QtyR> list) {
			// 数量取得用のキー、インデックス設定\
			String[] keys = (String[])getDispIndexKeys(list, up0()).toArray(new String[0]);
			Comparable<?>[] binds = new Comparable<?>[keys.length];
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 数量・単価・単価差異の設定
				for (int i = 0; i < keys.length; i++) {
					binds[i] = r.getValue(keys[i]);
				}

				Srch01_QtyR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.qty(0);
					r.purc_amt(0);
				}
				else {
					if (up0().itm_flg()) {
						r.qty(qtyR.qty());
					}
					// 購買金額
					r.purc_amt(qtyR.amt());
				}

				if (up0().itm_flg()) {
					// 購買単価
					r.purc_upri(calcUnit(r.purc_amt(), r.qty(), Srch01_RsltR.purc_upri_META.scale()));
					// 原価単価
					r.cost_upri(calcUnit(r.purc_cost(), r.qty(), Srch01_RsltR.cost_upri_META.scale()));
				}
			}
			list.clear();
		}

	}

	//FMCB CUSTOM END
}