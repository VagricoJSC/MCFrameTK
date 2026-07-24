package mcframe.serverMGBF.MGBFL0080;

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

import static mcframe.serverMGBF.MGBFL0080.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_WkCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_WkCostSrch_MC extends MGBFL_WkCostSrch_MC_A{
	//FMCB CUSTOM START

	protected int _baseUnitDigit = 16;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工数原価の検索を行います。<br>
	 */
	public class Srch01 extends MGBFL_WkCostSrch_MC_A.Srch01 {

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
			up0().disp_oper_seq_flg(up0().oper_act_no_flg() && up0().oper_flg());
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
			up0().addStringColumn("except_zero_flg_str", toTrueStr(up0().except_zero_flg()));
		}

		protected void srch() {
			boolean itm_flg = up0().itm_flg();
			boolean itm_mfg_inst_no_flg = up0().itm_mfg_inst_no_flg();
			boolean mfg_act_no_flg = up0().mfg_act_no_flg();

			if (up0().qty_flg()) {
				// マージ用キー
				up0().itm_flg(true);
				up0().itm_mfg_inst_no_flg(true);
				up0().mfg_act_no_flg(true);
			}
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0080_MGT_ACC_TOP_S01(), up0());
			if (down0().size() == 0) {
				return;
			}

			if (up0().qty_flg()) {
				MCList<Srch01_QtyR> list2 = MCList.create(Srch01_QtyR.class);
				executeQuery(list2, MGBFL0080_MGT_ACC_TOP_S03(), up0());
				// マージ後に再集計するため上り電文の設定に戻しておく
				up0().itm_flg(itm_flg);
				up0().itm_mfg_inst_no_flg(itm_mfg_inst_no_flg);
				up0().mfg_act_no_flg(mfg_act_no_flg);
				afterSrchQty(list2);
			}

			MCList<Srch01_CostR> list = MCList.create(Srch01_CostR.class);
			executeQuery(list, MGBFL0080_MGT_ACC_TOP_S02(), up0());
			afterSrch(list);
		}

		protected void afterSrch(MCList<Srch01_CostR> list) {
			// 工数取得用のキー、インデックス設定
			String[] keys = (String[]) getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 工数の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_CostR qtyR = list.getFirst(idx, binds);
				if (isNull(qtyR)) {
					r.act_wk_cost(0);
					r.std_wk_cost(0);
					r.diff_wk_cost(0);
				}
				else {
					r.act_wk_cost(qtyR.act_wk_cost());
					r.std_wk_cost(qtyR.std_wk_cost());
					r.diff_wk_cost(r.std_wk_cost().subtract(r.act_wk_cost()));
				}
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
			down0().add(sumRow);
		}

		protected void calculateUpri(Srch01_RsltR r) {
			r.std_upri(calcUnit(r.std_cost(), r.std_wk_cost(), Srch01_RsltR.upri_META.scale()));
			r.upri(calcUnit(r.ttl(), r.act_wk_cost(), Srch01_RsltR.upri_META.scale()));
			r.diff_upri(r.std_upri().subtract(r.upri()));
			r.diff_cost(r.std_cost().subtract(r.ttl()));

			if (up0().qty_flg()) {
				if (r.qty().isZero()) {
					r.std_base_ttl(0);
					r.base_ttl(0);
					r.std_base_wk_cost(0);
					r.base_wk_cost(0);
				}
				else {
					r.std_base_ttl(calcUnit(r.std_cost(), r.qty(), _baseUnitDigit));
					r.base_ttl(calcUnit(r.ttl(), r.qty(), _baseUnitDigit));
					r.std_base_wk_cost(calcUnit(r.std_wk_cost(), r.qty(), _baseUnitDigit));
					r.base_wk_cost(calcUnit(r.act_wk_cost(), r.qty(), _baseUnitDigit));
				}
				r.diff_base_ttl(r.std_base_ttl().subtract(r.base_ttl()));
				r.diff_base_wk_cost(r.std_base_wk_cost().subtract(r.base_wk_cost()));
			}

			if (up0().odr_qty_flg()) {
				if (isNull(r.odr_qty()) || r.odr_qty().isZero()) {
					r.odr_base_ttl(0);
				}
				else {
					r.odr_base_ttl(calcUnit(r.ttl(), r.odr_qty(), _baseUnitDigit));
				}
			}
		}

		protected void afterSrchQty(MCList<Srch01_QtyR> list) {
			// 製造数取得用のキー、インデックス設定
			String[] keys = (String[]) getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 製造数の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_QtyR qtyR = list.getFirst(idx, binds);
				if (isNull(qtyR)) {
					r.qty(0);
					r.odr_qty(0);
				}
				else {
					r.qty(qtyR.qty());
					r.odr_qty(qtyR.odr_qty());
				}
			}
			list.clear();

			if (!up0().itm_flg() || !up0().itm_mfg_inst_no_flg() || !up0().mfg_act_no_flg()) {
				// 集計タブで指定した項目で再集計する
				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.addKey((String[]) getDispIndexKeys(down0(), up0()).toArray(new String[0]));
				policy.max(Srch01_RsltR.$qty_dec_place);

				ArrayList<String> l = new ArrayList<String>(java.util.Arrays.asList(getSumColNames().clone()));
				l.add(Srch01_RsltR.$qty);
				l.add(Srch01_RsltR.$odr_qty);
				String[] col = l.toArray(new String[0]);
				policy.sum(col);

				down0().setAll(down0().groupBy(policy));
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
		return list;
	}

	// 集計対象のカラム名
	protected String[] _sumColNames = null;

	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			_sumColNames = new String[getExpnsAllColNames().size() + 9];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$ttl;
			_sumColNames[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$fxd;
			_sumColNames[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$var;
			_sumColNames[getExpnsAllColNames().size() + 3] = Srch01_RsltR.$diff_cost;
			_sumColNames[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$std_cost;
			_sumColNames[getExpnsAllColNames().size() + 5] = Srch01_RsltR.$diff_base_ttl;
			_sumColNames[getExpnsAllColNames().size() + 6] = Srch01_RsltR.$std_base_ttl;
			_sumColNames[getExpnsAllColNames().size() + 7] = Srch01_RsltR.$base_ttl;
			_sumColNames[getExpnsAllColNames().size() + 8] = Srch01_RsltR.$odr_base_ttl;
			ArrayList<String> l = new ArrayList<String>(java.util.Arrays.asList(_sumColNames));
			l.add(Srch01_RsltR.$diff_rt);
			l.add(Srch01_RsltR.$diff_wk);
			l.add(Srch01_RsltR.$diff_a);
			l.add(Srch01_RsltR.$diff_b);
			l.add(Srch01_RsltR.$diff_c);
			l.add(Srch01_RsltR.$diff_d);
			l.add(Srch01_RsltR.$diff_e);
			l.add(Srch01_RsltR.$diff_oth);
			_sumColNames = l.toArray(new String[0]);
		}
		return _sumColNames;
	}

	//FMCB CUSTOM END
}