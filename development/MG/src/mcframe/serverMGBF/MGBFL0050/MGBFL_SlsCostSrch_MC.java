package mcframe.serverMGBF.MGBFL0050;

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
import static mcframe.serverMGBF.MGBFL0050.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_SlsCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_SlsCostSrch_MC extends MGBFL_SlsCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_SlsCostSrch_MC_A.Srch01 {
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
			up0().addStringColumn("no_stk_bp_flg_str", toTrueStr(up0().no_stk_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
		}

		protected void srch() {
			MCList<Srch01_Calc_SlsR> list = MCList.create(Srch01_Calc_SlsR.class);
			executeQuery(list, MGBFL0050_MGT_CALC_SLS_S01(), up0());
			if (0 == list.size()) {
				list.clear();
				return;
			}

			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0050_MGT_ACC_SML_COST_S01(), up0());
			if (down0().size() == 0) {
				list.clear();
				return;
			}
			// 後処理
			afterSrch(list);
		}

		// 後処理(数量設定、単価計算)
		protected void afterSrch(MCList<Srch01_Calc_SlsR> list) {
			// 数量・売上金額取得用のキー、インデックス設定
			ArrayList<String> keyList = getDispIndexKeys(list, up0());
			String[] keys = (String[]) keyList.toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 数量・売上金額の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_Calc_SlsR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.qty(0);
					r.amt(0);
					r.std_amt(0);
				}
				else {
					r.qty(qtyR.qty());
					r.amt(qtyR.amt());
					r.std_amt(qtyR.std_amt());
					r.amt_upri_diff(qtyR.amt_upri_diff());
					r.amt_rate_diff(qtyR.amt_rate_diff());
					r.cur_std_amt(qtyR.cur_std_amt());
					r.trd_cur_amt(qtyR.trd_cur_amt());
				}

				// 金額・比率の設定
				calcAmt(r);
				calculateRate(r);
				calcDiff(r);
				// 単価の設定
				calculateUpri(r);
			}
			list.clear();

			// 合計行挿入
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames());
			Srch01_RsltR sumRow = down0().groupBy(policy).get(0);
			for (String nm : getSumColNames()) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			// 比率計算
			calculateRate(sumRow);
			down0().add(sumRow);
		}

		// 金額計算
		protected void calcAmt(Srch01_RsltR r) {
			r.profit(r.amt().subtract(r.ttl()));
			r.std_profit(r.amt().subtract(r.std_cost()));
			r.sls_profit(r.amt().subtract(r.sls_cost()));
			r.std_sls_profit(r.amt().subtract(r.std_sls_cost()));
			r.limit_profit(r.amt().subtract(r.var()));
			r.diff(r.std_cost().subtract(r.ttl()));
		}
		
		// 差異計算
		protected void calcDiff(Srch01_RsltR r) {
			// 売上金額差異＝売上金額－標準売上金額
			r.amt_diff(r.amt().subtract(r.std_amt()));
			// レート差異＝為替レート－標準為替レート
			if (up0().xrate_flg()) {
				r.xrate_diff(r.xrate().subtract(r.std_xrate()));
			}
			// 取引金額差異＝取引金額－標準取引金額
			if (up0().trd_cur_flg()) {
				r.cur_amt_diff(r.trd_cur_amt().subtract(r.cur_std_amt()));
			}
		}

		// 比率計算
		protected void calculateRate(Srch01_RsltR r) {
			r.profit_rate(calcRate(r.amt(), r.profit()));
			r.std_profit_rate(calcRate(r.amt(), r.std_profit()));
			r.sls_profit_rate(calcRate(r.amt(), r.sls_profit()));
			r.std_sls_profit_rate(calcRate(r.amt(), r.std_sls_profit()));
			r.limit_profit_rate(calcRate(r.amt(), r.limit_profit()));
		}

		// 単価計算
		protected void calculateUpri(Srch01_RsltR r) {
			r.unit_amt(calcUnit(r.amt(), r.qty(), Srch01_RsltR.unit_amt_META.scale()));
			r.unit_std_amt(calcUnit(r.std_amt(), r.qty(), Srch01_RsltR.unit_std_amt_META.scale()));
			r.unit_profit(calcUnit(r.profit(), r.qty(), Srch01_RsltR.unit_profit_META.scale()));
			r.unit_std_profit(calcUnit(r.std_profit(), r.qty(), Srch01_RsltR.unit_std_profit_META.scale()));
			r.unit_sls_profit(calcUnit(r.sls_profit(), r.qty(), Srch01_RsltR.unit_sls_profit_META.scale()));
			r.unit_std_sls_profit(calcUnit(r.std_sls_profit(), r.qty(), Srch01_RsltR.unit_std_sls_profit_META.scale()));
			r.unit_limit_profit(calcUnit(r.limit_profit(), r.qty(), Srch01_RsltR.unit_limit_profit_META.scale()));
			r.unit_var(calcUnit(r.var(), r.qty(), Srch01_RsltR.unit_var_META.scale()));
			r.unit_fxd(calcUnit(r.fxd(), r.qty(), Srch01_RsltR.unit_fxd_META.scale()));
			r.unit_diff(calcUnit(r.diff(), r.qty(), Srch01_RsltR.unit_diff_META.scale()));
			r.unit_std_sls_cost(calcUnit(r.std_sls_cost(), r.qty(), Srch01_RsltR.unit_std_sls_cost_META.scale()));
			r.unit_std_sls_mng_cost(
					calcUnit(r.std_sls_mng_cost(), r.qty(), Srch01_RsltR.unit_std_sls_mng_cost_META.scale()));
			r.unit_ttl(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.unit_ttl_META.scale()));
			r.unit_sls_cost(calcUnit(r.sls_cost(), r.qty(), Srch01_RsltR.unit_sls_cost_META.scale()));
			r.unit_sls_mng_cost(calcUnit(r.sls_mng_cost(), r.qty(), Srch01_RsltR.unit_sls_mng_cost_META.scale()));

			r.unit_amt_diff(calcUnit(r.amt_diff(), r.qty(), Srch01_RsltR.unit_amt_diff_META.scale()));
			r.unit_amt_upri_diff(calcUnit(r.amt_upri_diff(), r.qty(), Srch01_RsltR.unit_amt_upri_diff_META.scale()));
			r.unit_amt_rate_diff(calcUnit(r.amt_rate_diff(), r.qty(), Srch01_RsltR.unit_amt_rate_diff_META.scale()));

			if (up0().trd_cur_flg() && !isNull(r.trd_cur_upri_dec_place())) {
				r.unit_trd_cur_amt(calcUnit(r.trd_cur_amt(), r.qty(), r.trd_cur_upri_dec_place().intValue()));
				r.unit_cur_std_amt(calcUnit(r.cur_std_amt(), r.qty(), r.trd_cur_upri_dec_place().intValue()));
				r.unit_cur_amt_diff(calcUnit(r.cur_amt_diff(), r.qty(), r.trd_cur_upri_dec_place().intValue()));
			}
		}
	}

	/**
	 * 有効な費目区分を取得する
	 *
	 * @return 有効な費目区分
	 */
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		list.add(MAC_EXPNS_TYP.SGA.value());
		return list;
	}

	// 集計対象のカラム名
	protected String[] _sumColNames = null;

	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			ArrayList<String> l = new ArrayList<String>();
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				if (i % 2 == 0) {
					l.add(getExpnsAllColNames().get(i));
				}
			}
			l.add(Srch01_RsltR.$amt);
			l.add(Srch01_RsltR.$std_amt);
			l.add(Srch01_RsltR.$amt_diff);
			l.add(Srch01_RsltR.$amt_upri_diff);
			l.add(Srch01_RsltR.$amt_rate_diff);
			l.add(Srch01_RsltR.$profit);
			l.add(Srch01_RsltR.$std_profit);
			l.add(Srch01_RsltR.$sls_profit);
			l.add(Srch01_RsltR.$std_sls_profit);
			l.add(Srch01_RsltR.$limit_profit);
			l.add(Srch01_RsltR.$var);
			l.add(Srch01_RsltR.$fxd);
			l.add(Srch01_RsltR.$diff);
			l.add(Srch01_RsltR.$std_cost);
			l.add(Srch01_RsltR.$std_sls_cost);
			l.add(Srch01_RsltR.$std_sls_mng_cost);
			l.add(Srch01_RsltR.$ttl);
			l.add(Srch01_RsltR.$sls_cost);
			l.add(Srch01_RsltR.$sls_mng_cost);
			_sumColNames = l.toArray(new String[] {});
		}
		return _sumColNames;
	}

	/**
	 * 集計対象項目を取得
	 * <P>
	 * 集計対象項目を変更する場合、このメソッドをオーバーライドする
	 */
	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.act_cost", null
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}