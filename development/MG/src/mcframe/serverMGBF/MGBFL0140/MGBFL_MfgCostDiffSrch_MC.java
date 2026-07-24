package mcframe.serverMGBF.MGBFL0140;

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
import mcframe.serverMGBF.MGBFL0140.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBF.MGBFL0140.Query.*;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MfgCostDiffSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MfgCostDiffSrch_MC extends MGBFL_MfgCostDiffSrch_MC_A{
	//FMCB CUSTOM START

	/** 集計対象項目 */
	protected String[] _tgtCols = null;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 製造原価差異内訳の検索を行います。<br>
	 */
	public class Srch01 extends MGBFL_MfgCostDiffSrch_MC_A.Srch01 {

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
			if (up0().except_inpt_flg()) {
				up0().addNumberColumn("lvl", MCNumber.ZERO);
			}
			else {
				up0().addNumberColumn("lvl", MCNumber.ONE);
			}
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0140_MGT_ACC_TOP_S01(), up0());
			executeQuery(down0(), MGBFL0140_MGT_ITM_MFG_INST_S01(), up0());

			selectDown1();
			if (down1().isEmpty()) {
				return ;
			}

			setCalcArgFlg();

			MCList<Srch01_Rslt2R> down2 = down2().createInstance();
			executeQuery(down2, MGBFL0140_MGT_ACC_TOP_S05(), up0());

			convertList(down2, down2(), 1,
					new String[]{"act_cost"},
					new String[]{"ttl"},
					new String[]{"var_cost"},
					new String[]{"fxd_cost"});
			convertList(down2, down5(), 1,
					new String[]{"diff_up"},
					new String[]{"ttl"},
					new String[]{"var_cost"},
					new String[]{"fxd_cost"});

			MCList<Srch01_Rslt4R> down4 = down4().createInstance();
			executeQuery(down4, MGBFL0140_MGT_ACC_TOP_S06(), up0());

			convertList(down4, down3(), 2,
					new String[] { "std_cost" },
					new String[] { "ttl" },
					new String[] { "var_cost" },
					new String[] { "fxd_cost" });
			convertList(down4, down4(), 4,
					new String[] { "diff_cost", "std_cost", "act_cost" },
					new String[] { "diff_ttl", "std_ttl", "ttl" },
					new String[] { "diff_var_cost", "std_var_cost", "var_cost" },
					new String[] { "diff_fxd_cost", "std_fxd_cost", "fxd_cost" });
			convertList(down4, down6(), 3,
					new String[] { "diff_qty" },
					new String[] { "ttl" },
					new String[] { "var_cost" },
					new String[] { "fxd_cost" });

			MCList<Srch01_Rslt9R> down9 = down9().createInstance();
			executeQuery(down9, MGBFL0140_MGT_ACC_TOP_S07(), up0());

			convertList(down9, down7(), 0,
					new String[] { "diff_wk" },
					new String[] { "ttl" },
					new String[] { "var_cost" },
					new String[] { "fxd_cost" });
			convertList(down9, down8(), 0,
					new String[] { "act_cost", "std_cost" },
					new String[] { "ttl", "std_ttl" },
					new String[] { "var_cost", "std_var_cost" },
					new String[] { "fxd_cost", "std_fxd_cost" });
			convertList(down9, down9(), 0,
					new String[] { "diff_cost", "std_cost", "act_cost" },
					new String[] { "diff_ttl", "std_ttl", "ttl" },
					new String[] { "diff_var_cost", "std_var_cost", "var_cost" },
					new String[] { "diff_fxd_cost", "std_fxd_cost", "fxd_cost" });

			executeQuery(down10(), MGBFL0140_MGT_ALC_CALC_DTL_S01(), up0());
		}

		protected <R extends MCConstRow> void convertList(MCList<R> src, MCList<R> dest, int typ, String[] tgtCols, String[] ttlCols, String[] varCols, String[] fxdCols) {
			if (!src.isEmpty()) {
				String[] keys = src.get(0).getExtMap(DYNAMIC_SQL_COL_SQL).keySet().toArray(new String[0]);
				src.sort(keys);

				_tgtCols = tgtCols;
				setExpnsMap();

				for (MCList<R> l : src.groupList(keys)) {
					R destR = (R)l.get(0).clone();
					initRow(destR,ttlCols,varCols,fxdCols);

					for (R r : l) {
						String[] expnsCols = getExpnsCols(r.getString("expns_cd"));
						String[] expnsGCols = getExpnsGCols(r.getString("expns_grp_cd"));

						for (int i = 0; i < tgtCols.length; i++) {
							MCNumber v = r.getNumber(tgtCols[i]);

							destR.setNumber(ttlCols[i], sum(destR.getNumber(ttlCols[i]), v));

							if (MAC_VAR_TYP.isVAR(r.getString("var_typ"))) {
								destR.setNumber(varCols[i], sum(destR.getNumber(varCols[i]), v));
							}
							else {
								destR.setNumber(fxdCols[i], sum(destR.getNumber(fxdCols[i]), v));
							}

							if (!isNull(v) && !v.isZero()) {
								destR.setNumber(expnsCols[i], v);
								destR.setNumber(expnsGCols[i], sum(destR.getNumber(expnsGCols[i]), v));
							}
						}
					}
					dest.add(destR);
				}
				if (typ != 0) {
					convertList(dest, keys);
				}
				String[] odrKeys = getOdrKeys(src.get(0));
				dest.sort(odrKeys);

				setSumRow(dest, typ);
			}
		}

		protected <R extends MCConstRow> void initRow(R r, String[] ttlCols, String[] varCols, String[] fxdCols) {
			for (int i = 0; i < ttlCols.length; i++) {
				r.setNumber(ttlCols[i], 0);
				r.setNumber(varCols[i], 0);
				r.setNumber(fxdCols[i], 0);
			}
			for (String col : getExpnsGColNames()) {
				r.setNumber(col, 0);
			}
		}

		protected String[] getOdrKeys(MCConstRow proto) {
			MCList<MCRow> odrL = MCList.create(MCRow.class);
			for (Map.Entry<String, String> e : proto.getExtMap(DYNAMIC_SQL_ORDER_SQL).entrySet()) {
				MCRow odrR = MCRow.create();
				odrR.addNumberColumn(ORDER_NO, MCNumber.valueOf(e.getValue()));
				odrR.addStringColumn(ORDER_ITM, e.getKey());
				odrL.add(odrR);
			}
			odrL.sort(ORDER_NO, ORDER_ITM);
			String[] odrKeys = new String[odrL.size()];
			for (int i = 0; i < odrL.size(); i++) {
				odrKeys[i] = odrL.getString(i, ORDER_ITM);
			}
			return odrKeys;
		}

		protected boolean _isNotCalcUnit;
		protected boolean _isTermAve;

		protected void setCalcArgFlg() {
			MGT_ARG_R argR = MGT_ARG_R.create();
			dbSelectKey("MGBFL0140_MGT_ARG_S01", argR, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up0());

			// 計算ＮＯの指定が一つ、かつ単月または期間総平均（->単価を計算しない）
			_isNotCalcUnit = !up0().calc_no().contains("^")
					&& (MAC_EVAL_TYP.isTERM_AVE(argR.eval_typ())
							|| isSame(argR.st_ym(), argR.end_ym()));

			_isTermAve = MAC_EVAL_TYP.isTERM_AVE(argR.eval_typ());
		}

		protected boolean _isAct;
		protected boolean _isStd;
		protected boolean _isDiff;
		protected boolean _isDiffUp;
		protected boolean _isDiffQty;

		protected void setFlg() {
			_isAct = isSame(_tgtCols[0], "act_cost");
			_isStd = isSame(_tgtCols[0], "std_cost");
			_isDiff = isSame(_tgtCols[0], "diff_cost");
			_isDiffUp = isSame(_tgtCols[0], "diff_up");
			_isDiffQty = isSame(_tgtCols[0], "diff_qty");
		}

		protected <A extends MCRow> void convertList(MCList<A> srcList, String[] keys) {
			MCList<A> convL = srcList.createInstance();

			setFlg();
			String[] keyArr = getKeyArr(keys);
			String[] sumCols = getSumColsAndQtyCols(srcList);

			MCGroupByPolicy policy0 = getPolicyLv0(keyArr, sumCols);
			MCGroupByPolicy policy1 = getPolicyLv1(keyArr, sumCols);

			MCList<A>[] topRecGrpList = srcList.groupList(Srch01_Rslt2R.$top_rec_no);
			// レベル＝０のキー単位にデータをまとめる
			for (A r : srcList.subList(Srch01_Rslt2R.$lvl, MCNumber.ZERO).groupBy(keyArr)) {

				MCNumber grpNo = null; // ソート用
				MCList<A> tmpL0 = srcList.createInstance();
				MCList<A> tmpL1 = srcList.createInstance();

				// キーが一致するデータをTOP_REC_NO単位で追加する
				for (MCList<A> l : topRecGrpList) {
					if (l.get(0).equalColumns(r, keyArr)) {
						tmpL0.addAll(l.subList(Srch01_Rslt2R.$lvl, MCNumber.ZERO));
						tmpL1.addAll(l.subList(Srch01_Rslt2R.$lvl, MCNumber.ONE));
						if (isNull(grpNo)) { // 最初に一致したデータのTOP_REC_NOで統一
							grpNo = l.get(0).getNumber(Srch01_Rslt2R.$top_rec_no);
						}
					}
				}
				
				tmpL0 = tmpL0.groupBy(policy0);
				tmpL1 = tmpL1.groupBy(policy1);
				tmpL0.addAll(tmpL1);
				tmpL0.setNumber(Srch01_Rslt2R.$top_rec_no, grpNo);
				convL.addAll(tmpL0);
			}
			if (_isAct || _isDiffUp) {
				for (A r : convL) {
					if (r.getNumber(Srch01_Rslt2R.$act_upri) == null) {
						r.setNumber(Srch01_Rslt2R.$act_upri, 0);
					}
				}
			}
			srcList.setAll(convL);
		}
		protected String[] getKeyArr(String[] keys) {
			List<String> l = new ArrayList<String>(java.util.Arrays.asList(keys));
			l.remove(Srch01_Rslt2R.$top_rec_no);
			l.remove(Srch01_Rslt2R.$calc_no);
			l.remove(Srch01_Rslt2R.$qty);
			l.remove(Srch01_Rslt4R.$std_qty);
			l.remove(Srch01_Rslt4R.$act_qty);
			l.remove(Srch01_Rslt2R.$inst_qty);
			l.remove(Srch01_Rslt2R.$std_upri);
			l.remove(Srch01_Rslt2R.$act_upri);
			return l.toArray(new String[]{});
		}
		protected <A extends MCRow> String[] getSumColsAndQtyCols(MCList<A> list) {
			List<String> l = new ArrayList<String>(java.util.Arrays.asList(getSumCols(list)));
			if (_isAct || _isDiffUp) {
				l.add(Srch01_Rslt2R.$qty);
			}
			else {
				l.add(Srch01_Rslt4R.$act_qty);
				l.add(Srch01_Rslt4R.$std_qty);
			}
			return l.toArray(new String[]{});
		}
		/**
		 * レベル＝０のデータを集計するポリシーを返す
		 */
		protected MCGroupByPolicy getPolicyLv0(String[] keyArr, String[] sumCols) {
			MCGroupByPolicy policy0 = new MCGroupByPolicy();
			policy0.addKey(keyArr);
			policy0.sum(sumCols);
			if (_isDiffUp) { // 価格差異のLV=0は単価を平均で求める
				policy0.avg(Srch01_Rslt2R.$act_upri, Srch01_Rslt2R.$std_upri);
			}
			if (_isDiffQty) { // 数量差異のLV=0は単価を平均で求める
				policy0.avg(Srch01_Rslt4R.$std_upri);
			}
			if (_isAct) { // 製造原価の指図数は最大値（後処理で合計行に転記されてLV=0の指図数はクリアされる）
				policy0.max(Srch01_Rslt2R.$inst_qty);
			}
			return policy0;
		}
		/**
		 * レベル＝１のデータを集計するポリシーを返す
		 */
		protected MCGroupByPolicy getPolicyLv1(String[] keyArr, String[] sumCols) {
			MCGroupByPolicy policy1 = new MCGroupByPolicy();
			policy1.addKey(keyArr);
			if (_isNotCalcUnit) {
				if (_isAct || _isDiff) {
					// 期間平均は平均で求めるので、期間平均以外のときキーに追加
					if (!_isTermAve) {
						policy1.addKey(Srch01_Rslt2R.$std_upri);
						policy1.addKey(Srch01_Rslt2R.$act_upri);
					}
				}
				else if (_isStd) {
					policy1.addKey(Srch01_Rslt2R.$std_upri);
				}
			}
			if (_isDiffUp) { // 価格差異のLV=1は単価別で求める
				if (_isTermAve) {
					policy1.avg(Srch01_Rslt2R.$std_upri, Srch01_Rslt2R.$act_upri);
				}
				else {
					policy1.addKey(Srch01_Rslt2R.$std_upri, Srch01_Rslt2R.$act_upri);
				}
			}
			if (_isDiffQty) { // 数量差異のLV=1は単価別で求める
				policy1.addKey(Srch01_Rslt4R.$std_upri);
			}
			policy1.sum(sumCols);
			if (_isAct || _isDiff) {
				if (_isTermAve) {
					policy1.avg(Srch01_Rslt2R.$std_upri, Srch01_Rslt2R.$act_upri);
				}
			}
			return policy1;
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editList2();
			editList3();
			editList4();
			editList5();
			editList6();
			editList10(down10());
		}

		protected void selectDown1() {
			MCList<Srch01_RsltR> rsltL = MCList.create(Srch01_RsltR.class);
			MCQueryPlan sql = up0().mfg_inpt_flg() ? MGBFL0140_MGT_ACC_TOP_S03() : MGBFL0140_MGT_ACC_TOP_S02();
			MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
			MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
			if (up0().except_inpt_flg()) {
				MGT_ACC_COST_R S0_T2 = MGT_ACC_COST_R.create("T2");
				sql = sql.addDynamicSQLInfo(when(null).view(REP1, v -> v.leftOuterJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)));
			}
			else {
				MGT_ACC_SML_COST_R S0_T2 = MGT_ACC_SML_COST_R.create("T2");
				sql = sql.addDynamicSQLInfo(when(null).view(REP1, v -> v.leftOuterJoin(S0_T2).on(
						S0_T2.calc_no.eq(S0_T.calc_no)
						.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
						.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
					)));
			}
			executeQuery(rsltL, sql, up0());
			if (rsltL.isEmpty()) {
				return ;
			}

			Srch01_RsltR rsltR = Srch01_RsltR.create();
			if (up0().mfg_inpt_flg()) {
				sql = MGBFL0140_MGT_ACC_TOP_S04();
				executeQuery(rsltR, sql, up0());
			}
			// down1準備
			String[] items = getItemArray();
			for (int i = 0; i < items.length; i++) {
				Srch01_RsltR r = Srch01_RsltR.create();
				r.key(items[i]);
				down1().add(r);
			}
			// 検索結果をdown1に加算（縦横変換）
			for (Srch01_RsltR r : rsltL) {
				String col = getExpnsCol(r.expns_cd());
				if (!isNull(col)) {
					for (int i = 0; i < items.length; i++) {
						MCNumber n = r.getNumber(items[i]);
						if (!isNull(n)) {
							Srch01_RsltR tmpR = down1().get(i);
							tmpR.setNumber(col, sum(n, tmpR.getNumber(col)));
						}
					}
				}
			}
			// 製造品投入原価設定
			for (int i = 0; i < items.length; i++) {
				Srch01_RsltR tmpR = down1().get(i);
				MCNumber n = MCNumber.ZERO;
				if (!up0().except_inpt_flg()) {
					n = nvl(rsltR.getNumber(items[i]), n);
				}
				tmpR.setNumber(Srch01_RsltR.$mfg_inpt_cost, n);
			}
			// 差異合計行挿入
			insDiffTtl();
			// 集計
			for (Srch01_RsltR r : down1()) {
				doSum(r, Srch01_RsltR.$ttl, Srch01_RsltR.$var_cost, Srch01_RsltR.$fxd_cost, Srch01_RsltR.$sub_ttl, Srch01_RsltR.$mfg_inpt_cost);
			}
			// 不要な差異行を削除
			removeDiff();
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

		protected String[] getExpnsCols(String expnsCd) {
			List<String> l = new ArrayList<String>();
			for (Map.Entry<String, String> e : getExpnsColMap().entrySet()) {
				if (isSame(e.getValue(), expnsCd)) {
					l.add(e.getKey());
				}
			}
			return l.toArray(new String[0]);
		}

		protected String[] getExpnsGCols(String expnsGrpCd) {
			List<String> l = new ArrayList<String>();
			for (Map.Entry<String, String> e : getExpnsGColMap().entrySet()) {
				if (isSame(e.getValue(), expnsGrpCd)) {
					l.add(e.getKey());
				}
			}
			return l.toArray(new String[0]);
		}

		protected void insDiffTtl() {
			Srch01_RsltR actR = down1().get(0);
			Srch01_RsltR stdR = down1().get(1);
			Srch01_RsltR diff = Srch01_RsltR.create();
			diff.key("diff_ttl");
			for (String col : getExpnsColNames()) {
				MCNumber n = calcDiff(stdR.getNumber(col), actR.getNumber(col));
				diff.setNumber(col, n);
			}
			for (String col : getExpnsGColNames()) {
				MCNumber n = calcDiff(stdR.getNumber(col), actR.getNumber(col));
				diff.setNumber(col, n);
			}
			diff.mfg_inpt_cost(calcDiff(stdR.mfg_inpt_cost(), actR.mfg_inpt_cost()));
			down1().add(2, diff);
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

		protected void removeDiff() {
			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);
			String key = lastRowKey();
			for (Srch01_RsltR r : down1()) {
				list.add(r);
				if (isSame(r.key(), key)) {
					break;
				}
			}
			down1().setAll(list);
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
			for (Srch01_RsltR r : down1()) {
				r.label(getDispString(r.key().toUpperCase()));
			}
		}

		protected <R extends MCRow> void setSumRow(MCList<R> list, int typ) {
			if (list.isEmpty()) {
				return;
			}
			String[] sumColNames = getSumCols(list);
			MCGroupByPolicy policy = new MCGroupByPolicy();
			policy.sum(sumColNames);
			R sumRow = list.groupBy(policy).get(0);
			for (String col : sumColNames) {
				if (isNull(sumRow.getValueNE(col))) {
					sumRow.setValue(col, MCNumber.ZERO);
				}
			}

			if (typ != 0) {
				// 数量項目を取得するためにレベル０の行を抽出する
				MCList<R> topList = list.subList("lvl", MCNumber.ZERO);

				if (!up0().except_inpt_flg()) {
					// 小計行の金額項目を取得
					policy.addKey("calc_no", "top_rec_no");
					MCList<R> subSumList = list.groupBy(policy);
					// 金額のリストと数量のリストをマージする
					subSumList.sort("calc_no", "top_rec_no");
					topList.sort("calc_no", "top_rec_no");
					int j = 0;
					for (R r : topList) {
						setSumRowSub(subSumList.get(j), r, typ);
						j++;
					}
					// 小計行を一覧に追加
					j = subSumList.size() - 2;
					if (j >= 0) {
						for (int i = list.size() - 1; i > -1; i--) {
							if (isSame(list.get(i).getValue("lvl"), 0)) {
								list.add(i, subSumList.get(j));
								if (j < 1)
									break;
								j--;
							}
						}
					}
					list.add(subSumList.get(subSumList.size() - 1));
				}
				// 合計行に数量をマージする
				MCGroupByPolicy policy2 = new MCGroupByPolicy();
				policy2.addKey("unit_cd", "unit_nm", "dec_place");
				if (typ == 1) {
					policy2.sum("qty", "inst_qty");
				} else if (typ == 2) {
					policy2.sum("std_qty");
				} else if (typ == 3 || typ == 4) {
					policy2.sum("std_qty", "act_qty");
				}
				setSumRowSub(sumRow, topList.groupBy(policy2).get(0), typ);
			}
			list.add(sumRow);
			if (typ == 1) {
				for (R r : list) {
					if (r.getNumber("lvl") == null) {
						r.setNumber("inst_upri", calcUnit(r.getNumber("ttl"), r.getNumber("inst_qty"), r.getConstMeta("inst_upri").scale()));
					} else {
						r.setNumber("inst_qty", null);
					}
				}
			}
		}

		protected <R extends MCRow> String[] getSumCols(MCList<R> list) {
			R proto = list.createRow();
			List<String> sumColL = getExpnsAllColNames();
			for (String col : new String[] { Srch01_Rslt2R.$ttl, Srch01_Rslt2R.$var_cost, Srch01_Rslt2R.$fxd_cost,
					Srch01_Rslt4R.$diff_ttl, Srch01_Rslt4R.$std_ttl, Srch01_Rslt4R.$diff_fxd_cost,
					Srch01_Rslt4R.$std_fxd_cost, Srch01_Rslt4R.$diff_var_cost, Srch01_Rslt4R.$std_var_cost }) {
				if (proto.contains(col)) {
					sumColL.add(col);
				}
			}
			return sumColL.toArray(new String[]{});
		}

		protected <R extends MCRow> void setSumRowSub(R sumRow, R listRow, int typ) {
			if (typ == 1) {
				sumRow.setNumber("qty", listRow.getNumber("qty"));
				sumRow.setNumber("inst_qty", listRow.getNumber("inst_qty"));
			} else if (typ == 2) {
				sumRow.setNumber("std_qty", listRow.getNumber("std_qty"));
			} else if (typ == 3 || typ == 4) {
				sumRow.setNumber("std_qty", listRow.getNumber("std_qty"));
				sumRow.setNumber("act_qty", listRow.getNumber("act_qty"));
				sumRow.setNumber("qty_diff",
						calcDiff(listRow.getNumber("std_qty"), listRow.getNumber("act_qty")));
			}
			sumRow.setString("unit_cd", listRow.getString("unit_cd"));
			sumRow.setString("unit_nm", listRow.getString("unit_nm"));
			sumRow.setNumber("dec_place", listRow.getNumber("dec_place"));

			calcUpri(sumRow, typ);
		}

		protected <R extends MCRow> void calcUpri(R r, int typ) {
			if (typ == 1) {
				r.setNumber("act_upri", calcUnit(r.getNumber("ttl"), r.getNumber("qty"), r.getConstMeta("act_upri").scale()));
			}
			else if (typ == 2 || typ == 3) {
				r.setNumber("std_upri", calcUnit(r.getNumber("ttl"), r.getNumber("std_qty"), r.getConstMeta("std_upri").scale()));
			}
			else if (typ == 4) {
				r.setNumber("std_upri", calcUnit(r.getNumber("std_ttl"), r.getNumber("std_qty"), r.getConstMeta("std_upri").scale()));
				r.setNumber("act_upri", calcUnit(r.getNumber("ttl"), r.getNumber("act_qty"), r.getConstMeta("act_upri").scale()));
				r.setNumber("diff_upri", calcDiff(r.getNumber("std_upri"), r.getNumber("act_upri")));
			}
		}

		protected void editList2() {
			for (Srch01_Rslt2R r : down2()) {
				if (!_isNotCalcUnit || isSame(r.lvl(), MCNumber.ZERO)) {
					calcUpri(r, 1);
				}
			}
		}

		protected void editList3() {
			for (Srch01_Rslt4R r : down3()) {
				if (!_isNotCalcUnit || isSame(r.lvl(), MCNumber.ZERO)) {
					calcUpri(r, 2);
				}
			}
		}

		protected void editList4() {
			for (Srch01_Rslt4R r : down4()) {
				if (!_isNotCalcUnit || isSame(r.lvl(), MCNumber.ZERO)) {
					calcUpri(r, 4);
				}
				r.diff_upri(calcDiff(r.std_upri(), r.act_upri()));
				r.qty_diff(calcDiff(r.std_qty(), r.act_qty()));
			}
		}

		protected void editList5() {
			for (Srch01_Rslt2R r : down5()) {
				if (!isNull(r.lvl())) {
					r.diff_upri(calcDiff(r.std_upri(), r.act_upri()));
				}
			}
		}

		protected void editList6() {
			for (Srch01_Rslt4R r : down6()) {
				r.qty_diff(calcDiff(r.std_qty(), r.act_qty()));
			}
		}

	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 製造原価差異内訳の検索を行います。<br>
	 */
	public class Srch02 extends MGBFL_MfgCostDiffSrch_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srch();
		}

		protected void srch() {
			executeQuery(down0(), MGBFL0140_MGT_ALC_CALC_DTL_S02(), up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			editList10(down0());
		}

	}

	// -----------------------------------------------
	// Common
	protected void editList10(MCList<Srch01_Rslt10R> list) {
		for (Srch01_Rslt10R r : list) {
			r.diff_alc_tgt_val(calcDiff(r.std_alc_tgt_val(), r.alc_tgt_val()));
			r.diff_alc_rate(calcDiff(r.std_alc_rate(), r.alc_rate()));

			r.std_tgt_amt(nvl(r.std_alc_tgt_val(), MCNumber.ZERO).multiply(
					r.std_alc_rate(), getCoParm().amt_dec_place().intValue(),
					MAC_RND_TYP.get(getCoParm().amt_rnd_typ()).toMC()));

			r.diff_std_tgt_std_alc_amt(calcDiff(r.std_tgt_amt(), r.std_alc_amt()));
			r.diff_std_tgt_alc_amt(calcDiff(r.std_tgt_amt(), r.alc_amt()));
			r.diff_alc_amt(calcDiff(r.std_alc_amt(), r.alc_amt()));
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

	@Override
	protected String[] getSumTgtCols() {
		if (_tgtCols == null) {
			return super.getSumTgtCols();
		}
		return _tgtCols;
	}

	//FMCB CUSTOM END
}