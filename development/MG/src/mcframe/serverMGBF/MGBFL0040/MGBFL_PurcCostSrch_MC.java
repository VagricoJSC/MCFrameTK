package mcframe.serverMGBF.MGBFL0040;

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
import static mcframe.serverMGBF.MGBFL0040.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_PurcCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_PurcCostSrch_MC extends MGBFL_PurcCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 購買原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_PurcCostSrch_MC_A.Srch01 {
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
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0040_MGT_ACC_TOP_S01(), up0());
			if (0 == down0().size()) {
				return;
			}

			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBFL0040_MGT_ACC_TOP_S02(), up0());
			
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
					r.std_amt(0);
					r.amt(0);
					r.std_upri(0);
				}
				else {
					r.qty(qtyR.qty());
					r.std_amt(qtyR.std_amt());
					r.amt(qtyR.amt());
					r.std_upri(qtyR.std_upri());
					r.amt_upri_diff(qtyR.amt_upri_diff());
					r.amt_rate_diff(qtyR.amt_rate_diff());
					r.cur_std_amt(qtyR.cur_std_amt());
					r.trd_cur_amt(qtyR.trd_cur_amt());
				}
				
				if (up0().itm_flg()) {
					// 標準購買単価＝標準購買金額／数量
					r.std_purc_upri(calcUnit(r.std_amt(), r.qty(), Srch01_RsltR.std_purc_upri_META.scale()));

					// 購買単価＝購買金額／数量
					r.purc_upri(calcUnit(r.amt(), r.qty(), Srch01_RsltR.purc_upri_META.scale()));

					// 購買単価差異＝標準購買単価－購買単価
					r.purc_diff(r.std_purc_upri().subtract(r.purc_upri()));

					// 単価＝合計／数量
					r.upri(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.upri_META.scale()));

					// 単価差異＝標準単価－単価
					r.upri_diff(r.std_upri().subtract(r.upri()));
				}
				if (up0().xrate_flg() && !isNull(r.std_xrate()) && !isNull(r.xrate())) {
					// レート差異＝標準為替レート－為替レート
					r.xrate_diff(r.std_xrate().subtract(r.xrate()));
				}
				if (up0().trd_cur_flg() && !isNull(r.cur_std_amt())
						&& !isNull(r.trd_cur_amt())) {
					// 取引金額差異＝標準取引金額－取引金額
					r.cur_amt_diff(r.cur_std_amt().subtract(r.trd_cur_amt()));
				}
				if (up0().itm_flg() && up0().trd_cur_flg()
						&& !isNull(r.trd_cur_upri_dec_place())) {
					// 取引単価＝取引金額／数量
					r.cur_upri(calcUnit(r.trd_cur_amt(), r.qty(), Srch01_RsltR.cur_upri_META.scale()));

					// 標準取引単価＝標準取引金額／数量
					r.cur_std_upri(calcUnit(r.cur_std_amt(), r.qty(), Srch01_RsltR.cur_std_upri_META.scale()));

					// 取引単価差異＝標準取引単価－取引単価
					r.cur_upri_diff(nvl(r.cur_std_upri(), MCNumber.ZERO).subtract(
							nvl(r.cur_upri(), MCNumber.ZERO)));
				}
				
				// 原価差異＝標準原価－合計
				r.amt_diff(r.std_cost().subtract(r.ttl()));
				
				// 購買金額差異＝標準購買金額－購買金額
				r.purc_amt_diff(nvl(r.std_amt(), MCNumber.ZERO).subtract(
						nvl(r.amt(), MCNumber.ZERO)));
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
			down0().add(sumRow);
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
		return list;
	}
	
	// 集計対象のカラム名
	protected String[] _sumColNames = null;
	
	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames() {
	if (_sumColNames == null) {
		_sumColNames = new String[getExpnsAllColNames().size() + 10];
		for (int i = 0; i < getExpnsAllColNames().size(); i++) {
			_sumColNames[i] = createColumnNm(i, getSumColScale());
		}
		_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$ttl;
		_sumColNames[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$fxd;
		_sumColNames[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$var;
		_sumColNames[getExpnsAllColNames().size() + 3] = Srch01_RsltR.$std_cost;
		_sumColNames[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$amt_diff;
		_sumColNames[getExpnsAllColNames().size() + 5] = Srch01_RsltR.$purc_amt_diff;
		_sumColNames[getExpnsAllColNames().size() + 6] = Srch01_RsltR.$amt_upri_diff;
		_sumColNames[getExpnsAllColNames().size() + 7] = Srch01_RsltR.$amt_rate_diff;
		_sumColNames[getExpnsAllColNames().size() + 8] = Srch01_RsltR.$std_amt;
		_sumColNames[getExpnsAllColNames().size() + 9] = Srch01_RsltR.$amt;
	}
	return _sumColNames;
}

	//FMCB CUSTOM END
}