package mcframe.serverMGBF.MGBFL0150;

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

import static mcframe.serverMGBF.MGBFL0150.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_IoCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_IoCostSrch_MC extends MGBFL_IoCostSrch_MC_A{
	//FMCB CUSTOM START

	// 集計対象のカラム名
	protected String[] _sumColNames = null;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 受払原価を検索する<br>
	 */
	public class Srch01 extends MGBFL_IoCostSrch_MC_A.Srch01 {

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

			// 計算レコード区分絞込み条件（カットオフ対応）
			if (up0().st_stk_flg()) {
				up0().addStringColumn("st_stk_str", MGC_CALC_REC_TYP.ST_STK.value());
			}
			if (up0().st_wip_flg()) {
				up0().addStringColumn("st_wip_str", MGC_CALC_REC_TYP.ST_WIP.value());
			}
			if (up0().purc_flg()) {
				up0().addStringColumn("purc_str", MGC_CALC_REC_TYP.PURC.value());
			}
			if (up0().comp_flg()) {
				up0().addStringColumn("comp_str", MGC_CALC_REC_TYP.COMP.value());
			}
			if (up0().gp_alc_flg()) {
				up0().addStringColumn("gp_alc_str", MGC_CALC_REC_TYP.GP_ALC.value());
			}
			if (up0().inpt_flg()) {
				up0().addStringColumn("inpt_str", MGC_CALC_REC_TYP.INPT.value());
			}
			if (up0().sls_flg()) {
				up0().addStringColumn("sls_str", MGC_CALC_REC_TYP.SLS.value());
			}
			if (up0().end_stk_flg()) {
				up0().addStringColumn("end_stk_str", MGC_CALC_REC_TYP.END_STK.value());
			}
			if (up0().end_wip_flg()) {
				up0().addStringColumn("end_wip_str", MGC_CALC_REC_TYP.END_WIP.value());
			}
			if (up0().adj_flg()) {
				up0().addStringColumn("adj_str", MGC_CALC_REC_TYP.ADJ.value());
			}

			// 計算レコード区分＝GC_CALC_REC_TYP.IO かつ原価入出庫区分絞り込み条件
			if (up0().othr_in_flg()) {
				up0().addStringColumn("stk_in_str", MAC_COST_IO_TYP.STK_IN.value());
			}
			if (up0().othr_out_flg()) {
				up0().addStringColumn("stk_out_str", MAC_COST_IO_TYP.STK_OUT.value());
			}
			if (up0().free_prov_flg()) {
				up0().addStringColumn("ffr_prov_str", MAC_COST_IO_TYP.FFR_PROV.value());
			}
			if (up0().paid_flg()) {
				up0().addStringColumn("onr_prov_str", MAC_COST_IO_TYP.ONR_PROV.value());
			}

			// 他社資産除く条件（カットオフ対応）
			if (up0().except_other_flg()) {
				up0().addStringColumn("co_sls_str", MAC_ASST_TYP.CO_SLS.value());
			}
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
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBFL0150_MGT_ACC_TOP_S01(), up0());
			if (down0().size() == 0) {
				return;
			}

			MCList<Srch01_RsltQtyR> list = MCList.create(Srch01_RsltQtyR.class);
			executeQuery(list, MGBFL0150_MGT_ACC_TOP_S02(), up0());
			afterSrch(list);
		}

		/**
		 *  後処理(数量設定、単価計算)
		 */
		protected void afterSrch(MCList<Srch01_RsltQtyR> list) {
			// 数量取得用のキー、インデックス設定
			ArrayList<String> keyList = getDispIndexKeys(list, up0());
			String[] keys = (String[]) keyList.toArray(new String[0]);
			MCIndexKey idx = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				// 数量・金額の設定
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_RsltQtyR qtyR = list.getFirst(idx, binds);
				if (isNull(qtyR)) {
					r.qty(0);
					r.amt(0);
				}
				else {
					r.qty(qtyR.qty());
					r.dim(qtyR.dim());
					r.wt(qtyR.wt());
					r.conts(qtyR.conts());
					r.amt(qtyR.amt());
					r.trd_cur_amt(qtyR.trd_cur_amt());
				}

				if (isNull(r.std_cost())) {
					r.std_cost(MCNumber.ZERO);
				}

				calculateUpri(r);
				calculateDiff(r);
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

		/**
		 * 差異を計算します。
		 */
		protected void calculateDiff(Srch01_RsltR r) {
			// 単価差異の設定
			if (up0().qty_flg()) {
				r.upri_diff(r.std_upri().subtract(r.upri()));
			}
			// 容積単価差異の設定
			if (up0().dim_flg()) {
				if (!isNull(r.dim()) && !r.dim().isZero()) {
					r.dim_upri_diff(r.dim_std_upri().subtract(r.dim_upri()));
				}
			}
			// 重量単価差異の設定
			if (up0().wt_flg()) {
				if (!isNull(r.wt()) && !r.wt().isZero()) {
					r.wt_upri_diff(r.wt_std_upri().subtract(r.wt_upri()));
				}
			}
			// 入り目単価差異の設定
			if (up0().conts_flg()) {
				if (!isNull(r.conts()) && !r.conts().isZero()) {
					r.conts_upri_diff(r.conts_std_upri().subtract(r.conts_upri()));
				}
			}
			r.cost_diff(r.std_cost().subtract(r.ttl()));
		}

		/**
		 * 単価を計算します。
		 */
		protected void calculateUpri(Srch01_RsltR r) {
			// 単価・標準単価
			if (up0().qty_flg()) {
				r.upri(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.upri_META.scale()));
				if (isNull(r.std_upri())) {
					r.std_upri(MCNumber.ZERO);
				}
			}
			// 容積単価・容積標準単価
			if (up0().dim_flg()) {
				if (!isNull(r.dim()) && !r.dim().isZero()) {
					r.dim_upri(calcUnit(r.ttl(), r.dim(), Srch01_RsltR.dim_upri_META.scale()));
					r.dim_std_upri(calcUnit(r.std_cost(), r.dim(), Srch01_RsltR.dim_std_upri_META.scale()));
				}
			}
			// 重量単価・重量標準単価
			if (up0().wt_flg()) {
				if (!isNull(r.wt()) && !r.wt().isZero()) {
					r.wt_upri(calcUnit(r.ttl(), r.wt(), Srch01_RsltR.wt_upri_META.scale()));
					r.wt_std_upri(calcUnit(r.std_cost(), r.wt(), Srch01_RsltR.wt_std_upri_META.scale()));
				}
			}
			// 入り目単価・入り目標準単価
			if (up0().conts_flg()) {
				if (!isNull(r.conts()) && !r.conts().isZero()) {
					r.conts_upri(calcUnit(r.ttl(), r.conts(), Srch01_RsltR.conts_upri_META.scale()));
					r.conts_std_upri(calcUnit(r.std_cost(), r.conts(), Srch01_RsltR.conts_std_upri_META.scale()));
				}
			}
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		list.add(MAC_EXPNS_TYP.SPPL.value());
		return list;
	}

	/**
	 * 集計対象のカラム名の配列を作成
	 */
	protected String[] getSumColNames() {
		if (_sumColNames == null) {
			_sumColNames = new String[getExpnsAllColNames().size() + 6];
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				_sumColNames[i] = createColumnNm(i, getSumColScale());
			}
			_sumColNames[getExpnsAllColNames().size()] = Srch01_RsltR.$amt;
			_sumColNames[getExpnsAllColNames().size() + 1] = Srch01_RsltR.$cost_diff;
			_sumColNames[getExpnsAllColNames().size() + 2] = Srch01_RsltR.$std_cost;
			_sumColNames[getExpnsAllColNames().size() + 3] = Srch01_RsltR.$ttl;
			_sumColNames[getExpnsAllColNames().size() + 4] = Srch01_RsltR.$var;
			_sumColNames[getExpnsAllColNames().size() + 5] = Srch01_RsltR.$fxd;
		}
		return _sumColNames;
	}

	//FMCB CUSTOM END
}