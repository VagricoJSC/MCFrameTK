package mcframe.serverMGBF.MGBFL0070;

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
import static mcframe.serverMGBF.MGBFL0070.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_OperCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_OperCostSrch_MC extends MGBFL_OperCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 工程原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_OperCostSrch_MC_A.Srch01 {

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
			up0().addStringColumn("INPT_CND", toTrueStr(up0().except_inpt_flg()));
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_oper_act_no_flg_str", toTrueStr(up0().no_oper_act_no_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
		}

		protected void srch() {

			boolean itm_flg = up0().itm_flg();
			boolean itm_mfg_inst_flg = up0().itm_mfg_inst_flg();
			boolean mfg_act_flg = up0().mfg_act_flg();
			if (up0().qty_flg()) {
				// マージ用キー
				up0().itm_flg(true);
				up0().itm_mfg_inst_flg(true);
				up0().mfg_act_flg(true);
			}

			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0070_MGT_ACC_TOP_S01(), up0());
			if (0 == down0().size()) {
				return;
			}

			if (up0().qty_flg()) {
				MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
				executeQuery(list, MGBFL0070_MGT_ACC_TOP_S02(), up0());

				// マージ後に再集計するため上り電文の値に戻しておく
				up0().itm_flg(itm_flg);
				up0().itm_mfg_inst_flg(itm_mfg_inst_flg);
				up0().mfg_act_flg(mfg_act_flg);

				// 製造数の設定
				afterSrchQty(list);
			}

			// 後処理
			afterSrch();
		}

		// 製造数の設定
		protected void afterSrchQty(MCList<Srch01_QtyR> list) {
			// 製造数取得用のキー、インデックス設定
			String[] keys = (String[]) getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 製造数の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_QtyR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.qty(0);
				}
				else {
					r.qty(qtyR.qty());
					r.odr_qty(qtyR.odr_qty());
				}
			}
			list.clear();

			if (!up0().itm_flg() || !up0().itm_mfg_inst_flg() || !up0().mfg_act_flg()) {
				// 集計タブで指定した項目で再集計する
				MCGroupByPolicy policy = new MCGroupByPolicy();
				ArrayList<String> l = getDispIndexKeys(down0(), up0());
				// dec_placeは最大値を取得するため、キーから除外する
				l.remove(Srch01_RsltR.$dec_place);
				policy.addKey((String[]) l.toArray(new String[0]));

				String[] col = getSumColNames().clone();
				col[getExpnsAllColNames().size() + 5] = Srch01_RsltR.$qty;
				col[getExpnsAllColNames().size() + 6] = Srch01_RsltR.$odr_qty;
				policy.sum(col);
				policy.max(Srch01_RsltR.$dec_place);

				down0().setAll(down0().groupBy(policy));
			}
		}

		// 後処理
		protected void afterSrch() {
			// 合計計算
			for (Srch01_RsltR r : down0()) {
				r.all_ttl(r.ttl().add(r.mfg_inpt_cost()));

				if (up0().qty_flg()) {
					if (r.qty().isZero()) {
						r.all_upri(0);
						r.upri(0);
					}
					else {
						r.all_upri(calcUnit(r.all_ttl(), r.qty(),
								Srch01_RsltR.all_upri_META.scale()));
						r.upri(calcUnit(r.ttl(), r.qty(),
								Srch01_RsltR.upri_META.scale()));
					}
				}

				if (up0().odr_qty_flg()) {
					if (r.odr_qty() == null || r.odr_qty().isZero()) {
						r.odr_all_upri(0);
						r.odr_upri(0);
					}
					else {
						r.odr_all_upri(calcUnit(r.all_ttl(), r.odr_qty(),
								Srch01_RsltR.odr_all_upri_META.scale()));
						r.odr_upri(calcUnit(r.ttl(), r.odr_qty(),
								Srch01_RsltR.odr_upri_META.scale()));
					}
				}
			}

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
			_sumColNames = new String[getExpnsAllColNames().size() + 7];
			_sumColNames[getExpnsAllColNames().size() + 5] = Srch01_RsltR.$all_ttl;
			_sumColNames[getExpnsAllColNames().size() + 6] = Srch01_RsltR.$all_ttl;
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$ttl;
			_sumColNames[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$fxd;
			_sumColNames[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$var;
			_sumColNames[getExpnsAllColNames().size()
					+ 3] = Srch01_RsltR.$mfg_inpt_cost;
			_sumColNames[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$all_ttl;
		}
		return _sumColNames;
	}

	//FMCB CUSTOM END
}