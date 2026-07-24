package mcframe.serverMGBF.MGBFL0030;

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
import static mcframe.serverMGBF.MGBFL0030.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_OutCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_OutCostSrch_MC extends MGBFL_OutCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 外注原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_OutCostSrch_MC_A.Srch01 {
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
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
		}
		
		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0030_MGT_ACC_TOP_S01(), up0());
			if (0 == down0().size()) {
				return;
			}
			
			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBFL0030_MGT_ACC_TOP_S03(), up0());
			
			// 後処理
			afterSrch(list);
		}
		
		// 後処理(数量設定、単価計算)
		protected void afterSrch(MCList<Srch01_QtyR> list) {
			// 数量取得用のキー、インデックス設定
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
					r.out_cost(0);
					r.std_purc_amt(0);
					r.std_trd_amt(0);
					r.trd_amt(0);
					r.std_out_amt(0);
					r.out_amt(0);
					r.upri_diff(0);
					r.rate_diff(0);
				}
				else {
					r.qty(qtyR.qty());
					r.purc_amt(qtyR.purc_amt());
					r.out_cost(qtyR.out_cost());
					r.odr_qty(qtyR.odr_qty());
					r.std_purc_amt(qtyR.std_purc_amt());
					r.std_trd_amt(qtyR.std_trd_amt());
					r.trd_amt(qtyR.trd_amt());
					r.std_out_amt(r.std_purc_amt().subtract(qtyR.so_std_amt()));
					r.out_amt(r.purc_amt().subtract(qtyR.so_act_amt()));
					r.upri_diff(qtyR.upri_diff());
					r.rate_diff(qtyR.rate_diff());
				}
				if (r.qty().isZero()) {
					r.purc_upri(0);
					r.out_upri(0);
					r.std_out_unit(0);
					r.out_unit(0);
					r.std_trd_upri(0);
					r.trd_upri(0);
					r.std_purc_upri(0);
				}
				else {
					r.purc_upri(calcUnit(r.purc_amt(), r.qty(), Srch01_RsltR.purc_upri_META.scale()));
					r.out_upri(calcUnit(r.out_cost(), r.qty(), Srch01_RsltR.out_upri_META.scale()));
					r.std_out_unit(calcUnit(r.std_out_amt(), r.qty(), Srch01_RsltR.std_out_unit_META.scale()));
					r.out_unit(calcUnit(r.out_amt(), r.qty(), Srch01_RsltR.out_unit_META.scale()));
					r.std_trd_upri(calcUnit(r.std_trd_amt(), r.qty(), Srch01_RsltR.std_trd_upri_META.scale()));
					r.trd_upri(calcUnit(r.trd_amt(), r.qty(), Srch01_RsltR.trd_upri_META.scale()));
					r.std_purc_upri(calcUnit(r.std_purc_amt(), r.qty(), Srch01_RsltR.std_purc_upri_META.scale()));
				}
				if (up0().odr_qty_flg()) {
					if (r.odr_qty() == null || r.odr_qty().isZero()) {
						r.odr_purc_upri(0);
						r.odr_out_upri(0);
					}
					else {
						r.odr_purc_upri(calcUnit(r.purc_amt(), r.odr_qty(), Srch01_RsltR.odr_purc_upri_META.scale()));
						r.odr_out_upri(calcUnit(r.out_cost(), r.odr_qty(), Srch01_RsltR.odr_out_upri_META.scale()));
					}
				}
				r.out_diff(r.upri_diff().add(r.rate_diff()));
				r.out_unit_gap(r.std_out_unit().subtract(r.out_unit()));
				r.purc_upri_gap(r.std_purc_upri().subtract(r.purc_upri()));
				r.purc_amt_gap(r.std_purc_amt().subtract(r.purc_amt()));
				r.purc_cost_gap(r.std_purc_cost().subtract(r.ttl()));
				if (up0().trd_cur_flg()) {
					r.trd_upri_gap(r.std_trd_upri().subtract(r.trd_upri()));
					r.trd_amt_gap(r.std_trd_amt().subtract(r.trd_amt()));
				}
				if (up0().xrate_flg() && !isNull(r.std_xrate())) {
					r.xrate_gap(r.std_xrate().subtract(r.xrate()));
				}
			}
			list.clear();

			// 合計行挿入
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames1());
			Srch01_RsltR sumRow = down0().groupBy(policy).get(0);
			for (String nm : getSumColNames1()) {
				if (isNull(sumRow.getValueNE(nm))) {
					sumRow.setValue(nm, MCNumber.ZERO);
				}
			}
			down0().add(sumRow);
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 外注原価を検索する<br>
	 */
	public class Srch02 extends MGBFL_OutCostSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			srch();
		}
		
		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0030_MGT_ACC_TOP_S02(), up0());
			if (down0().size() == 0) {
				return;
			}
			MCList<Srch02_QtyR> list = MCList.create(Srch02_QtyR.class);
			executeQuery(list, MGBFL0030_MGT_ACC_TOP_S04(), up0());
			// 後処理
			afterSrch(list);
		}
		
		// 後処理(数量設定、単価計算)
		protected void afterSrch(MCList<Srch02_QtyR> list) {
			// 数量取得用のキー、インデックス設定
			String[] keys = (String[])getDispIndexKeys(list, up0()).toArray(new String[0]);
			Comparable<?>[] binds = new Comparable<?>[keys.length];
			MCIndexKey idx = list.createIndex(keys);

			for (Srch02_RsltR r : down0()) {
				// 数量・単価・単価差異の設定
				for (int i = 0; i < keys.length; i++) {
					binds[i] = r.getValue(keys[i]);
				}
				Srch02_QtyR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.qty(0);
					r.cbd_amt(0);
					r.so_std_amt(0);
				}
				else {
					r.qty(qtyR.qty());
					r.cbd_amt(qtyR.cbd_amt());
					r.so_std_amt(qtyR.so_std_amt());
				}
				// 投入単価を計算
				if (r.qty().isZero()) {
					r.inpt_unit(0);
				}
				else {
					r.inpt_unit(calcUnit(r.ttl(), r.qty(), Srch02_RsltR.inpt_unit_META.scale()));
				}
				if (!isNull(r.cbd_amt())) {
					r.dmp_amt(r.cbd_amt().subtract(nvl(r.ttl(), MCNumber.ZERO)));
				}
				r.inpt_unit_gap(r.std_inpt_unit().subtract(r.inpt_unit()));
			}
			list.clear();

			// 合計行挿入
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(getSumColNames2());
			Srch02_RsltR sumRow = down0().groupBy(policy).get(0);
			for (String nm : getSumColNames2()) {
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
	protected String[] _sumColNames1 = null;

	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames1() {
		if (_sumColNames1 == null) {
			_sumColNames1 = new String[getExpnsAllColNames().size() + 5];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames1[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames1[getExpnsAllColNames().size()] = Srch01_RsltR.$ttl;
			_sumColNames1[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$fxd_cost;
			_sumColNames1[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$var_cost;
			_sumColNames1[getExpnsAllColNames().size() + 3] = Srch01_RsltR.$purc_amt;
			_sumColNames1[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$out_cost;
			ArrayList<String> l = new ArrayList<String>(java.util.Arrays.asList(_sumColNames1));
			l.add(Srch01_RsltR.$out_diff);
			l.add(Srch01_RsltR.$std_out_amt);
			l.add(Srch01_RsltR.$out_amt);
			l.add(Srch01_RsltR.$upri_diff);
			l.add(Srch01_RsltR.$rate_diff);
			l.add(Srch01_RsltR.$purc_amt_gap);
			l.add(Srch01_RsltR.$std_purc_amt);
			l.add(Srch01_RsltR.$purc_cost_gap);
			l.add(Srch01_RsltR.$std_purc_cost);
			_sumColNames1 = l.toArray(new String[0]);
		}
		return _sumColNames1;
	}

	// 集計対象のカラム名
	protected String[] _sumColNames2 = null;

	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames2() {
		if (_sumColNames2 == null) {
			_sumColNames2 = new String[getExpnsAllColNames().size() + 5];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames2[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames2[getExpnsAllColNames().size()] = Srch02_RsltR.$ttl;
			_sumColNames2[getExpnsAllColNames().size() + 1] = Srch02_RsltR.$fxd_cost;
			_sumColNames2[getExpnsAllColNames().size() + 2] = Srch02_RsltR.$var_cost;
			_sumColNames2[getExpnsAllColNames().size() + 3] = Srch02_RsltR.$cbd_amt;
			_sumColNames2[getExpnsAllColNames().size() + 4] = Srch02_RsltR.$dmp_amt;
			ArrayList<String> l = new ArrayList<String>(java.util.Arrays.asList(_sumColNames2));
			l.add(Srch02_RsltR.$diff_up);
			l.add(Srch02_RsltR.$so_std_amt);
			l.add(Srch02_RsltR.$std_cost);
			_sumColNames2 = l.toArray(new String[0]);
		}
		return _sumColNames2;
	}

	//FMCB CUSTOM END
}