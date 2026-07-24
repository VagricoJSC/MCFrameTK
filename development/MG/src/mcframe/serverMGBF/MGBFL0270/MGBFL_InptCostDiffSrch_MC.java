package mcframe.serverMGBF.MGBFL0270;

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
import java.util.Arrays;

import static mcframe.serverMGBF.MGBFL0270.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_InptCostDiffSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_InptCostDiffSrch_MC extends MGBFL_InptCostDiffSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 投入原価差異を検索する<br>
	 */
	public class Srch01 extends MGBFL_InptCostDiffSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		protected int _baseUnitDigit = 16;

		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}

		protected void editUp() {
			up0().disp_oper_seq_flg(up0().oper_act_no_flg() && up0().oper_flg());
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
			up0().addStringColumn("chd_asst_typ_cnd", toTrueStr(up0().except_other_flg()));
			up0().addStringColumn("except_ss", toTrueStr(up0().except_ss_flg()));
			if (!isNull(up0().repurc_obli_typ())) {
				if (MGC_REPURC_OBLI_TYP.isREPURC_OBLI_OTH(up0().repurc_obli_typ())) {
					up0().addStringColumn("repurc_obli_oth_flg", toTrueStr(true));
				}
				else {
					up0().addBooleanColumn("repurc_obli_flg", MGC_REPURC_OBLI_TYP.isONLY_REPURC_OBLI(up0().repurc_obli_typ()));
				}
			}
		}

		protected void srch() {
			boolean par_itm_flg = up0().par_itm_flg();
			boolean itm_mfg_inst_no_flg = up0().itm_mfg_inst_no_flg();
			boolean mfg_act_no_flg = up0().mfg_act_no_flg();

			if (up0().comp_qty_flg()) {
				// マージ用キー
				up0().par_itm_flg(true);
				up0().itm_mfg_inst_no_flg(true);
				up0().mfg_act_no_flg(true);
			}

			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0270_MGT_ACC_TOP_S01(), up0());
			if (down0().size() == 0) {
				return;
			}

			if (up0().comp_qty_flg()) {
				MCList<Srch01_CompQtyR> list2 = MCList.create(Srch01_CompQtyR.class);
				executeQuery(list2, MGBFL0270_MGT_ACC_TOP_S03(), up0());
				// マージ後に再集計するため上り電文の値に戻しておく
				up0().par_itm_flg(par_itm_flg);
				up0().itm_mfg_inst_no_flg(itm_mfg_inst_no_flg);
				up0().mfg_act_no_flg(mfg_act_no_flg);
				afterSrchCompQty(list2);
			}
			
			MCList<Srch01_RsltQtyR> list = MCList.create(Srch01_RsltQtyR.class);
			executeQuery(list, MGBFL0270_MGT_ACC_TOP_S02(), up0());
			afterSrch(list);
		}

		protected void afterSrch(MCList<Srch01_RsltQtyR> list) {
			// 数量取得用のキー、インデックス設定
			String[] keys = getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 数量・単価・金額の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_RsltQtyR qtyR = list.getFirst(idx, binds);
				if (isNull(qtyR)) {
					r.qty_diff(0);
					r.std_qty(0);
					r.act_qty(0);
				}
				else {
					r.qty_diff(qtyR.qty_diff());
					r.std_qty(qtyR.std_qty());
					r.act_qty(qtyR.act_qty());
				}
			}
			list.clear();
			insSumRow();
		}

		/**
		 * 合計行を挿入します。
		 */
		protected void insSumRow() {
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

		/**
		 *  製造数を設定します。
		 */
		protected void afterSrchCompQty(MCList<Srch01_CompQtyR> list) {
			// 製造数取得用のキー、インデックス設定
			String[] keys = getDispIndexKeys(list, up0()).toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 製造数の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_CompQtyR qtyR = list.getFirst(idx, binds);
				if (qtyR == null) {
					r.comp_qty(0);
					r.odr_qty(0);
				}
				else {
					r.comp_qty(qtyR.comp_qty());
					r.odr_qty(qtyR.odr_qty());
				}
			}
			list.clear();

			if (!up0().par_itm_flg() || !up0().itm_mfg_inst_no_flg() || !up0().mfg_act_no_flg()) {
				// 集計タブで指定した項目で再集計する
				ArrayList<String> keyColL = getDispIndexKeys(down0(), up0());
				ArrayList<String> sumColL = new ArrayList<String>(Arrays.asList(getSumColNames()));
				sumColL.add(Srch01_RsltR.$comp_qty);
				sumColL.add(Srch01_RsltR.$odr_qty);

				MCGroupByPolicy policy = new MCGroupByPolicy();
				policy.addKey(keyColL.toArray(new String[0]));
				policy.sum(sumColL.toArray(new String[0]));
				policy.max(Srch01_RsltR.$par_dec_place, Srch01_RsltR.$dec_place);
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

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.DIFF_TTL", "T.DIFF_QTY", "T.DIFF_UP"
		};
		return stringArray;
	}

	// 集計対象のカラム名
	protected String[] _sumColNames = null;

	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			ArrayList<String> colL = new ArrayList<String>();
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				colL.add(createColumnNm(i, getSumColScale()));
			}
			colL.add(Srch01_RsltR.$ttl);
			colL.add(Srch01_RsltR.$fxd_cost);
			colL.add(Srch01_RsltR.$var_cost);
			colL.add(Srch01_RsltR.$ttl_qty);
			colL.add(Srch01_RsltR.$fxd_cost_qty);
			colL.add(Srch01_RsltR.$var_cost_qty);
			colL.add(Srch01_RsltR.$ttl_up);
			colL.add(Srch01_RsltR.$fxd_cost_up);
			colL.add(Srch01_RsltR.$var_cost_up);
			colL.add(Srch01_RsltR.$std_cost);
			colL.add(Srch01_RsltR.$act_cost);
			colL.add(Srch01_RsltR.$cost_diff);
			colL.add(Srch01_RsltR.$diff_qty);
			colL.add(Srch01_RsltR.$diff_up);
			_sumColNames = colL.toArray(new String[0]);
		}
		return _sumColNames;
	}

	//FMCB CUSTOM END
}