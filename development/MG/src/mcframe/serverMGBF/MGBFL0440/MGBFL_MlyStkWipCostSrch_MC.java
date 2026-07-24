package mcframe.serverMGBF.MGBFL0440;

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
import static mcframe.serverMGBF.MGBFL0440.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MlyStkWipCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MlyStkWipCostSrch_MC extends MGBFL_MlyStkWipCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月別に在庫仕掛原価情報を参照する。<br>
	 */
	public class Srch01 extends MGBFL_MlyStkWipCostSrch_MC_A.Srch01 {

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

		protected void srch() {
			// 原価の取得
			executeQuery(down0(), MGBFL0440_MGT_ACC_TOP_S01(), up0());
			if (down0().size() == 0) {
				return;
			}

			// 数量の取得
			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			if (up0().qty_flg()) {
				executeQuery(list, MGBFL0440_MGT_ACC_TOP_S02(), up0());
			}
			// 後処理
			afterSrch(list);
		}

		/**
		 * 上り電文の加工
		 */
		protected void editUp() {
			// 月末在庫・仕掛の条件
			String[][] calcRecArray = {
					{Srch01_CndR.$end_stk_flg, MGC_CALC_REC_TYP.END_STK.value()},
					{Srch01_CndR.$end_wip_flg, MGC_CALC_REC_TYP.END_WIP.value()}};

			for (int i = 0; i < calcRecArray.length; i++) {
				if (up0().getBooleanNE(calcRecArray[i][0])) {
					up0().addStringColumn(
							"calc_rec_typ".concat(MCNumber.valueOf(i).toString()),
							calcRecArray[i][1]);
				}
			}

			// 他社資産以外＝ＯＮのときは資産区分＝１，２
			up0().addStringColumn("except_other_flg_str", toTrueStr(up0().except_other_flg()));
			// 取引先無ＦＬＧの条件
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));

		}

		// 後処理(数量設定、単価計算)
		protected void afterSrch(MCList<Srch01_QtyR> list) {
			// 数量取得用のキー、インデックス設定
			String[] keys = (String[])getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);
			Comparable<?>[] binds = new Comparable<?>[keys.length];

			for (Srch01_RsltR r : down0()) {
				// 数量・単価の設定
				for (int i = 0; i < keys.length; i++) {
					binds[i] = r.getValue(keys[i]);
				}

				Srch01_QtyR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.qty(0);
				}
				else {
					r.qty(qtyR.qty());
				}
				// 単価の設定
				calculateUpri(r);
			}
			list.clear();
		}

		// 単価計算
		protected void calculateUpri(Srch01_RsltR r) {
			if (up0().qty_flg()) {
				r.upri_amt(calcUnit(r.amt(), r.qty(), Srch01_RsltR.upri_amt_META.scale()));
				r.upri_var_cost(calcUnit(r.var_cost(), r.qty(), Srch01_RsltR.upri_amt_META.scale()));
				r.upri_fxd_cost(calcUnit(r.fxd_cost(), r.qty(), Srch01_RsltR.upri_amt_META.scale()));
			}
		}

	}

	//FMCB CUSTOM END
}