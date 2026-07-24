package mcframe.serverMGBF.MGBFL0130;

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
import static mcframe.serverMGBF.MGBFL0130.Query.*;

import java.util.ArrayList;
import java.util.Map;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran; 
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MfgCostDiffLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MfgCostDiffLst_MC extends MGBFL_MfgCostDiffLst_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造原価差異一覧の検索を行います。<br>
	 */
	public class Srch01 extends MGBFL_MfgCostDiffLst_MC_A.Srch01 {
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
			up0().addStringColumn("no_po_no_flg_str", toTrueStr(up0().no_po_no_flg()));
			up0().addStringColumn("no_slo_no_flg_str", toTrueStr(up0().no_slo_no_flg()));
			up0().addStringColumn("no_iv_no_flg_str", toTrueStr(up0().no_iv_no_flg()));
			up0().addStringColumn("no_bp_flg_str", toTrueStr(up0().no_bp_flg()));
			up0().addBooleanColumn("itm_nm_flg", up0().itm_flg());
		}

		protected void srch() {
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			MCQueryPlan sql = up0().mfg_inpt_flg() ? MGBFL0130_MGT_ACC_TOP_S02() : MGBFL0130_MGT_ACC_TOP_S01();
			MGT_ACC_TOP_R S0T = MGT_ACC_TOP_R.create("T");
			MGT_ACC_INPT_R S2_W = MGT_ACC_INPT_R.create("W");
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			if (!up0().mfg_inpt_flg()) {
				if (up0().except_inpt_flg()) {
					MGT_ACC_COST_R S0T2 = MGT_ACC_COST_R.create("T2");
					sql.addDynamicSQLInfo(when(null).view(REP1, v -> v.leftOuterJoin(S0T2).on(
							S0T2.calc_no.eq(S0T.calc_no)
							.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
							.and(S0T2.top_rec_no.eq(S0T.top_rec_no))
							))
							.predicate(REP1, p -> p.and(exists(subQuery().select(value("X")).from(S2_W)
									.where(value(0).eq(value(0))
											.and(S2_W.calc_no.eq(S0T2.calc_no))
											.and(S2_W.calc_grp_cd.eq(S0T2.calc_grp_cd))
											.and(S2_W.inpt_rec_no.eq(S0T2.inpt_rec_no))
											.and(S2_W.top_rec_no.eq(S0T2.top_rec_no))
											.and(S2_W.lvl.eq(value(0))))))));
				}
				else {
					MGT_ACC_SML_COST_R S0T2 = MGT_ACC_SML_COST_R.create("T2");
					sql.addDynamicSQLInfo(when(null).view(REP1, v -> v.leftOuterJoin(S0T2).on(
							S0T2.calc_no.eq(S0T.calc_no)
							.and(S0T2.calc_grp_cd.eq(S0T.calc_grp_cd))
							.and(S0T2.top_rec_no.eq(S0T.top_rec_no))
						)));
				}
			}
			executeQuery(rsltL, sql, up0());
			if (rsltL.isEmpty()) {
				return ;
			}

			setPegNo(rsltL);

			ArrayList<String> keyList = getDispIndexKeys(rsltL, up0());
			keyList.remove(Srch01_RsltR.$expns_cd);
			keyList.remove(Srch01_RsltR.$expns_grp_cd);
			String[] keys = (String[]) keyList.toArray(new String[0]);

			MCList<Srch01_QtyR> qtyL = MCList.create(Srch01_QtyR.class);
			MCIndexKey qtyIdx = null;
			String[] qtyKeys = null;
			if (up0().itm_flg()) {
				executeQuery(qtyL, MGBFL0130_MGT_ACC_TOP_S03(), up0());
				ArrayList<String> qtyKeyList = getDispIndexKeys(qtyL, up0());
				qtyKeys = (String[]) qtyKeyList.toArray(new String[0]);
				qtyIdx = qtyL.createIndex(qtyKeys);
			}

			MCList<Srch01_QtyR> instL = MCList.create(Srch01_QtyR.class);
			MCIndexKey instIdx = null;
			String[] instKeys = null;
			if (up0().inst_qty_flg()) {
				Srch01_CndR upDummy = up0().clone();
				setAllFlgCol(upDummy, false);
				upDummy.itm_flg(up0().itm_flg());
				upDummy.itm_mfg_inst_no_flg(up0().itm_mfg_inst_no_flg());
				upDummy.mfg_act_no_flg(up0().mfg_act_no_flg());
				upDummy.setBoolean("itm_nm_flg", false);
				executeQuery(instL, MGBFL0130_MGT_ACC_TOP_S04(), upDummy);
				ArrayList<String> instKeyList = getDispIndexKeys(instL, upDummy);
				instKeys = (String[]) instKeyList.toArray(new String[0]);
				instIdx = instL.createIndex(instKeys);
			}

			MCList<Srch01_RsltR> newL = MCList.create(Srch01_RsltR.class);
			String[] items = getItemArray();

			for (MCList<Srch01_RsltR> l : rsltL.groupList(keys)) {
				MCNumber sortNo = (MCNumber) l.min(Srch01_RsltR.$peg_no);
				Comparable<?>[] qtyBinds = l.get(0).toArray(qtyKeys);
				MCNumber qty = MCNumber.ZERO, inst = MCNumber.ZERO;
				if (qtyIdx != null) {
					Srch01_QtyR qtyR = qtyL.getFirst(qtyIdx, qtyBinds);
					if (qtyR != null) {
						qty = qtyR.qty();
					}
				}
				Comparable<?>[] instBinds = l.get(0).toArray(instKeys);
				if (instIdx != null) {
					Srch01_QtyR instR = instL.getFirst(instIdx, instBinds);
					if (instR != null) {
						inst = instR.inst_qty();
					}
				}

				// tmpL準備
				MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
				for (int i = 0; i < items.length; i++) {
					Srch01_RsltR r = l.get(0).clone();
					r.peg_no(sortNo);
					r.key(items[i]);
					r.qty(qty);
					r.inst_qty(inst);
					r.mfg_inpt_cost(0);
					tmpL.add(r);
				}
				// 検索結果をtmpLに加算（縦横変換）
				for (Srch01_RsltR r : l) {
					String col = getExpnsCol(r.expns_cd());
					if (!isNull(col)) {
						for (int i = 0; i < items.length; i++) {
							Srch01_RsltR tmpR = tmpL.get(i);
							MCNumber n = r.getNumber(items[i]);
							if (!isNull(n)) {
								tmpR.setNumber(col, sum(n, tmpR.getNumber(col)));
							}
							if (up0().mfg_inpt_flg()) {
								n = r.getNumber(items[i]+"2");
								if (!isNull(n)) {
									tmpR.mfg_inpt_cost(sum(tmpR.mfg_inpt_cost(),n));
								}
							}
						}
					}
				}
				newL.addAll(editTmpL(tmpL));
			}
			newL.sort(Srch01_RsltR.$peg_no);
			down0().setAll(newL);
			setLabel();
		}

		protected String[] getItemArray() {
			return new String[] { Srch01_RsltR.$act_cost, Srch01_RsltR.$std_cost, Srch01_RsltR.$diff_up,
					Srch01_RsltR.$diff_qty, Srch01_RsltR.$diff_wk, Srch01_RsltR.$diff_rt, Srch01_RsltR.$diff_std,
					Srch01_RsltR.$diff_a, Srch01_RsltR.$diff_b, Srch01_RsltR.$diff_c, Srch01_RsltR.$diff_d,
					Srch01_RsltR.$diff_e };
		}
		protected String getExpnsCol(String expnsCd) {
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				if (isSame(e.getValue(), expnsCd)) {
					return e.getKey();
				}
			}
			return null;
		}
		/**
		 * 差異合計行の挿入・各行の集計・差異使用区分による差異行の削除を行います。
		 * @param expnsCd
		 * @return
		 */
		protected MCList<Srch01_RsltR> editTmpL(MCList<Srch01_RsltR> tmpL) {
			Srch01_RsltR actR = tmpL.get(0);
			Srch01_RsltR stdR = tmpL.get(1);
			Srch01_RsltR diffR = tmpL.get(0).clone();
			diffR.key("diff_ttl");
			for (String col : getExpnsColNames()) {
				MCNumber n = calcDiff(stdR.getNumber(col), actR.getNumber(col));
				diffR.setNumber(col, n);
			}
			for (String col : getExpnsGColNames()) {
				MCNumber n = calcDiff(stdR.getNumber(col), actR.getNumber(col));
				diffR.setNumber(col, n);
			}
			diffR.mfg_inpt_cost(calcDiff(stdR.mfg_inpt_cost(), actR.mfg_inpt_cost()));

			String lastKey = lastRowKey();

			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);
			for (int i = 0; i < tmpL.size(); i++) {
				Srch01_RsltR r = tmpL.get(i);
				list.add(r);
				if (i == 1) {
					list.add(diffR);
				}
				if (isSame(r.key(), lastKey)) {
					break;
				}
			}
			for (Srch01_RsltR r : list) {
				doSum(r, Srch01_RsltR.$ttl, Srch01_RsltR.$var_cost, Srch01_RsltR.$fxd_cost, Srch01_RsltR.$sub_ttl, Srch01_RsltR.$mfg_inpt_cost);
				r.upri(calcUnit(r.ttl(), r.qty(), Srch01_RsltR.upri_META.scale()));
				r.inst_upri(calcUnit(r.ttl(), r.inst_qty(), Srch01_RsltR.inst_upri_META.scale()));
			}
			
			return list;
		}
		protected void doSum(MCRow r, String ttlCol, String varCol, String fxdCol, String subCol, String inptCol) {
			MCNumber ttl = MCNumber.ZERO;
			MCNumber var = MCNumber.ZERO;
			MCNumber fxd = MCNumber.ZERO;
			for(Map.Entry<String, java.util.List<String>> e : getExpnsGMap().entrySet()) {
				MCNumber sum = MCNumber.ZERO;
				for (String col : e.getValue()) {
					MCNumber n = r.getNumber(col);
					sum = sum(sum, n);

					if (isVarCost(getExpnsColMap().get(col))) {
						var = sum(var, n);
					}
					else {
						fxd = sum(fxd, n);
					}
				}
				r.setNumber(e.getKey(), sum);
				ttl = sum(ttl, sum);
			}
			if (!isNull(ttlCol)) {
				if (!isNull(inptCol)) {
					ttl = sum(ttl, r.getNumber(inptCol));
				}
				r.setNumber(ttlCol, ttl);
			}
			if (!isNull(varCol)) {
				r.setNumber(varCol, var);
			}
			if (!isNull(fxdCol)) {
				r.setNumber(fxdCol, fxd);
			}
			if (!isNull(subCol)) {
				r.setNumber(subCol, sum(var, fxd));
			}
		}
		protected boolean isVarCost(String expnsCd) {
			for (MAM_EXPNS_R r : getExpns()) {
				if (isSame(r.expns_cd(), expnsCd)) {
					return MAC_VAR_TYP.isVAR(r.var_typ());
				}
			}
			return false;
		}
		protected String lastRowKey() {
			String diffUseTyp = nvl(getCoParm().diff_use_typ(), MAC_DIFF_USE_TYP.DIFF5.toString());
			if (MAC_DIFF_USE_TYP.isNON(diffUseTyp)) {
				return Srch01_RsltR.$diff_std;
			}
			else if (MAC_DIFF_USE_TYP.isDIFF1(diffUseTyp)) {
				return Srch01_RsltR.$diff_a;
			}
			else if (MAC_DIFF_USE_TYP.isDIFF2(diffUseTyp)) {
				return Srch01_RsltR.$diff_b;
			}
			else if (MAC_DIFF_USE_TYP.isDIFF3(diffUseTyp)) {
				return Srch01_RsltR.$diff_c;
			}
			else if (MAC_DIFF_USE_TYP.isDIFF4(diffUseTyp)) {
				return Srch01_RsltR.$diff_d;
			}
			else {
				return Srch01_RsltR.$diff_e;
			}
		}

		protected void setLabel() {
			for (Srch01_RsltR r : down0()) {
				r.label(getDispString(r.key().toUpperCase()));
			}
		}
	}

	// -----------------------------------------------
	// DynamicSql
	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		return list;
	}

	//FMCB CUSTOM END
}