package mcframe.serverMGBF.MGBFL0480;

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
import static mcframe.serverMGBF.MGBFL0480.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MlySlsCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MlySlsCostSrch_MC extends MGBFL_MlySlsCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 月別に売上原価情報を参照する。<br>
	 */
	public class Srch01 extends MGBFL_MlySlsCostSrch_MC_A.Srch01 {

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
			up0().addStringColumn("no_stk_bp_flg_str", toTrueStr(up0().no_stk_bp_flg()));
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0480_MGT_ACC_SML_COST_S01(), up0());
			if (down0().size() == 0) {
				return;
			}

			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBFL0480_MGT_CALC_SLS_S01(), up0());

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
				// 数量・金額・単価の設定
				for (int i = 0; i < keys.length; i++) {
					binds[i] = r.getValue(keys[i]);
				}

				Srch01_QtyR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.qty(0);
					r.amt(0);
				}
				else {
					r.qty(qtyR.qty());
					// 購買金額
					r.amt(qtyR.amt());
				}

				// 金額の設定
				calculateAmt(r);
				// 比率の設定
				calculateRate(r);
				// 単価の設定
				calculateUpri(r);
			}
			list.clear();
		}

		// 金額計算
		protected void calculateAmt(Srch01_RsltR r) {
			// 利益
			r.profit(r.amt().subtract(r.act_cost()));
			// 売上利益
			r.sls_profit(r.amt().subtract(r.sls_cost()));
			// 限界利益
			r.limit_profit(r.amt().subtract(r.var()));
		}

		// 比率計算
		protected void calculateRate(Srch01_RsltR r) {
			// 利益率
			r.profit_rate(calcRate(r.amt(), r.profit()));
			// 売上利益率
			r.sls_profit_rate(calcRate(r.amt(), r.sls_profit()));
			// 限界利益率
			r.limit_profit_rate(calcRate(r.amt(), r.limit_profit()));
		}

		// 単価計算
		protected void calculateUpri(Srch01_RsltR r) {
			if (up0().qty_flg()) {
				r.upri_amt(calcUnit(r.amt(), r.qty(), Srch01_RsltR.upri_amt_META.scale()));
				r.upri_act_cost(calcUnit(r.act_cost(), r.qty(), Srch01_RsltR.upri_act_cost_META.scale()));
				r.upri_profit(calcUnit(r.profit(), r.qty(), Srch01_RsltR.upri_profit_META.scale()));
				r.upri_sls_profit(calcUnit(r.sls_profit(), r.qty(), Srch01_RsltR.upri_sls_profit_META.scale()));
				r.upri_limit_profit(calcUnit(r.limit_profit(), r.qty(), Srch01_RsltR.upri_limit_profit_META.scale()));
				r.upri_var(calcUnit(r.var(), r.qty(), Srch01_RsltR.upri_var_META.scale()));
				r.upri_fxd(calcUnit(r.fxd(), r.qty(), Srch01_RsltR.upri_fxd_META.scale()));
				r.upri_sls_cost(calcUnit(r.sls_cost(), r.qty(), Srch01_RsltR.upri_sls_cost_META.scale()));
				r.upri_sls_mng_cost(calcUnit(r.sls_mng_cost(), r.qty(), Srch01_RsltR.upri_sls_mng_cost_META.scale()));
			}
		}

	}

	//FMCB CUSTOM END
}