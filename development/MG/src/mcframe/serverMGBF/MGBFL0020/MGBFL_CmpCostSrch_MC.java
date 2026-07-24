package mcframe.serverMGBF.MGBFL0020;

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
import static mcframe.serverMGBF.MGBFL0020.Query.*;
import java.util.ArrayList;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_CmpCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_CmpCostSrch_MC extends MGBFL_CmpCostSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 完成原価を検索する。<br>
	 */
	public class Srch01 extends MGBFL_CmpCostSrch_MC_A.Srch01 {
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
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0020_MGT_ACC_TOP_S01(), up0());
			if (0 == down0().size()) {
				return;
			}

			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			if (up0().qty_flg()) {
				boolean itm_flg = up0().itm_flg();
				boolean itm_mfg_inst_flg = up0().itm_mfg_inst_flg();
				boolean mfg_act_flg = up0().mfg_act_flg();
				if (up0().qty_flg()) {
					// マージのキーとして品目と品目製造指図ＮＯを使用する
					up0().itm_flg(true);
					up0().itm_mfg_inst_flg(true);
					up0().mfg_act_flg(true);
				}
				executeQuery(list, MGBFL0020_MGT_ACC_TOP_S02(), up0());

				// マージ後に再集計するため上り電文の値に戻しておく
				up0().itm_flg(itm_flg);
				up0().itm_mfg_inst_flg(itm_mfg_inst_flg);
				up0().mfg_act_flg(mfg_act_flg);

				if (!itm_flg || !itm_mfg_inst_flg || !mfg_act_flg) {
					// 集計タブで指定した項目で再集計する
					MCGroupByPolicy policy = new MCGroupByPolicy();
					String[] keys = getDispIndexKeysCust(list, up0());
					policy.addKey(keys);
					policy.sum(Srch01_RsltR.$qty, Srch01_RsltR.$odr_qty);
					list = list.groupBy(policy);
				}
			}

			// 後処理
			afterSrch(list);
		}

		// 後処理(数量設定、単価計算)
		protected void afterSrch(MCList<Srch01_QtyR> list) {
			if (up0().qty_flg()) {
				// 数量取得用のキー、インデックス設定\
				String[] keys = getDispIndexKeysCust(list, up0());
				MCIndexKey idx = list.createIndex(keys);

				for (Srch01_RsltR r : down0()) {
					// 数量・単価・単価差異の設定
					Srch01_QtyR qtyR = list.getFirst(idx, r.toArray(keys));
					if (qtyR == null) {
						r.qty(0);
						r.upri(0);
						r.unit_diff(0);
						r.unit_var(0);
						r.unit_fxd(0);
					}
					else {
						r.qty(qtyR.qty());
						r.upri(calcUnit(r.ttl(), r.qty(),
								Srch01_RsltR.upri_META.scale()));
						r.unit_var(calcUnit(r.var(), r.qty(),
								Srch01_RsltR.unit_var_META.scale()));
						r.unit_fxd(calcUnit(r.fxd(), r.qty(),
								Srch01_RsltR.unit_fxd_META.scale()));
						r.unit_diff(r.std_upri().subtract(r.upri()));

						if (up0().odr_qty_flg()) {
							r.odr_qty(qtyR.odr_qty());
							if (r.odr_qty() == null || r.odr_qty().isZero()) {
								r.odr_upri(0);
							}
							else {
								r.odr_upri(calcUnit(r.ttl(), r.odr_qty(),
										Srch01_RsltR.odr_upri_META.scale()));
							}
						}
					}
					// 原価差異の設定
					r.amt_diff(r.std_cost().subtract(r.ttl()));
				}
				list.clear();
			}
			else {
				for (Srch01_RsltR r : down0()) {
					// 原価差異の設定
					r.amt_diff(r.std_cost().subtract(r.ttl()));
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

	protected String[] getDispIndexKeysCust(MCList<? extends MCConstRow> list, MCRow up) {
		ArrayList<String> keys = super.getDispIndexKeys(list, up);
		keys.remove(Srch01_RsltR.$odr_qty);
		return (String[]) keys.toArray(new String[0]);
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
			ArrayList<String> l = new ArrayList<String>();
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				if (i % 2 == 0) {
					l.add(getExpnsAllColNames().get(i));
				}
			}
			l.add(Srch01_RsltR.$ttl);
			l.add(Srch01_RsltR.$fxd);
			l.add(Srch01_RsltR.$var);
			l.add(Srch01_RsltR.$std_cost);
			l.add(Srch01_RsltR.$amt_diff);
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