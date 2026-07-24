package mcframe.serverMGBF.MGBFL0100;

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
import static mcframe.serverMGBF.MGBFL0100.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_StkWipCostSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_StkWipCostSrch_MC extends MGBFL_StkWipCostSrch_MC_A{
	//FMCB CUSTOM START

	// 集計対象のカラム名
	protected String[] _sumColNames = null;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫仕掛原価の検索を行います。<br>
	 */
	public class Srch01 extends MGBFL_StkWipCostSrch_MC_A.Srch01 {
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

		protected void editUp() {
			// 月初在庫・仕掛、月末在庫・仕掛、受払差額の条件
			String[][] calcRecArray = {
					{
							Srch01_CndR.$st_stk_flg, MGC_CALC_REC_TYP.ST_STK.value()
					}, {
							Srch01_CndR.$st_wip_flg, MGC_CALC_REC_TYP.ST_WIP.value()
					}, {
							Srch01_CndR.$end_stk_flg, MGC_CALC_REC_TYP.END_STK.value()
					}, {
							Srch01_CndR.$end_wip_flg, MGC_CALC_REC_TYP.END_WIP.value()
					}, {
							Srch01_CndR.$adj_flg, MGC_CALC_REC_TYP.ADJ.value()
					}
			};

			for (int i = 0; i < calcRecArray.length; i++) {
				if (up0().getBooleanNE(calcRecArray[i][0])) {
					up0().addStringColumn("calc_rec_typ" + i, calcRecArray[i][1]);
				}
			}

			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addStringColumn("no_ac_rsn_flg_str", toTrueStr(up0().no_ac_rsn_flg()));
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
			up0().addStringColumn("asst_typ_cnd", toTrueStr(up0().except_other_flg()));
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
			executeQuery(down0(), MGBFL0100_MGT_ACC_TOP_S01(up0().qty_dcsn_typ(), up0().amt_dcsn_typ()), up0());

			if (down0().size() == 0) {
				return;
			}

			if (up0().loss_flg()) {
				MCList<Srch01_LossR> list2 = MCList.create(Srch01_LossR.class);
				executeQuery(list2, MGBFL0100_MGT_STK_LOSS_S01(), up0());
				afterSrchLoss(list2);
			}

			afterSrch(up0(), down0());
		}

		protected void afterSrchLoss(MCList<Srch01_LossR> list2) {
			// 評価損取得用のキー、インデックス設定
			ArrayList<String> keyList = getDispIndexKeys(list2, up0());
			String[] keys = (String[]) keyList.toArray(new String[0]);
			MCIndexKey idx = list2.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				if (MGC_CALC_REC_TYP.isEND_STK(r.calc_rec_typ())) {
					// 評価損の設定
					Comparable<?>[] binds = r.toArray(keys);
					Srch01_LossR qtyR = list2.getFirst(idx, binds);
					if (isNull(qtyR)) {
						r.loss(0);
					}
					else {
						r.loss(qtyR.amt());
					}
					calculateUpriLoss(r);
				}
			}
			list2.clear();
		}

		protected void calculateUpriLoss(Srch01_RsltR r) {
			r.ttl_loss(r.ttl().subtract(r.loss()));

			if (up0().qty_flg()) {
				r.ttl_loss_upri(calcUnit(r.ttl_loss(), r.qty(), Srch01_RsltR.ttl_loss_upri_META.scale()));
				r.ttl_loss_upri2(calcUnit(r.ttl_loss(), r.qty(), Srch01_RsltR.ttl_loss_upri2_META.scale()));
				r.loss_upri(calcUnit(r.loss(), r.qty(), Srch01_RsltR.loss_upri_META.scale()));
			}
		}

		protected void afterSrch(Srch01_CndR up, MCList<Srch01_RsltR> down) {
			for (Srch01_RsltR r : down) {
				calculateUpri(r);
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

		protected void calculateUpri(Srch01_RsltR r) {
			r.diff_cost(r.std_cost().subtract(r.ttl()));

			if (up0().qty_flg()) {
				r.act_upri(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.act_upri_META.scale()));
				r.upri_var(calcUnit(r.var_cost(), r.qty(), Srch01_RsltR.upri_var_META.scale()));
				r.upri_fxd(calcUnit(r.fxd_cost(), r.qty(), Srch01_RsltR.upri_fxd_META.scale()));
				r.diff_upri(r.std_upri().subtract(r.act_upri()));
			}

			if (up0().odr_qty_flg()) {
				if (MGC_CALC_REC_TYP.isST_WIP(r.calc_rec_typ())
						|| MGC_CALC_REC_TYP.isEND_WIP(r.calc_rec_typ())) {
					r.odr_upri(nvl(calcUnit(r.ttl(), r.odr_qty(), Srch01_RsltR.odr_upri_META.scale()), MCNumber.ZERO));
				}
				else {
					r.odr_qty(null);
					r.odr_upri(MCNumber.ZERO);
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
			ArrayList<String> l = new ArrayList<String>();
			for (int i = 0; i < getExpnsAllColNames().size(); i++) {
				if (i % 2 == 0) {
					l.add(getExpnsAllColNames().get(i));
				}
			}
			l.add(Srch01_RsltR.$ttl);
			l.add(Srch01_RsltR.$fxd_cost);
			l.add(Srch01_RsltR.$var_cost);
			l.add(Srch01_RsltR.$diff_cost);
			l.add(Srch01_RsltR.$std_cost);
			l.add(Srch01_RsltR.$ttl_loss);
			l.add(Srch01_RsltR.$loss);
			_sumColNames = l.toArray(new String[] {});
		}
		return _sumColNames;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.act_cost", null
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}