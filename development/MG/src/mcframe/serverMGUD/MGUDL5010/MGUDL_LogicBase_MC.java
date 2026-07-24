package mcframe.serverMGUD.MGUDL5010;

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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;
import static mcframe.commonFX.notice.FX_Msg.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MGUDL_LogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGUDL_LogicBase_MC extends MGUDL_LogicBase_MC_A{
	//FMCB CUSTOM START

	// -- 動的ＳＱＬ (START)

	/**
	 * 動的ＳＱＬ用定数：グループ関数のSELECT句を保持するカラム名を保持する項目属性名
	 */
	protected static final String DYNAMIC_SQL_SUM_SQL = "SUM_SQL";

	/**
	 * 動的ＳＱＬ用定数：グループ関数のSELECT句として費目別原価を設定する場合の属性値
	 */
	protected static final String DYNAMIC_SQL_CUSTOM_SUM_SQL = "CUSTOM_SUM_COL";

	// -- 動的ＳＱＬ (END)

	// -- 費目別原価検索処理（START）

	protected LinkedHashMap<String, String> _expnsColMap = null;
	protected LinkedHashMap<String, String> _expnsGColMap = null;
	protected Map<String, List<String>> _expnsGMap = null;
	protected String[] _expnsColNames = null;
	protected String[] _expnsColGNames = null;
	protected List<String> _expnsAllColNames = null;

	// -- 費目関連バインド変数設定（START）
	protected void addDynamicBind(MCRow up, MCList<? extends MCConstRow> down) {
		Map<String, String> map = down.createRow().getExtMap(DYNAMIC_SQL_SUM_SQL);
		List<String> colL = new ArrayList<String>();
		map.entrySet().forEach(r -> {
			if (isSame(r.getValue(), DYNAMIC_SQL_CUSTOM_SUM_SQL)) colL.add(r.getKey());
		});
		java.util.Collections.sort(colL);
		MCList<MCRow> eL = getExpnsList();

		int n = 0;
		for (String column : colL) {
			String tail = column.substring(3);
			int sIdx = n%getSumTgtCols().length;
			int eIdx = n/getSumTgtCols().length;

			if (null == getSumTgtCols()[sIdx]) {
				n++;
				continue;
			};

			if (eL.size() > eIdx) {
				MCRow e = eL.get(eIdx);
				up.setBooleanNE("GRP_FLG" + tail, e.getBooleanNE("grp_flg"));
				up.setBooleanNE("EXP_FLG" + tail, !e.getBooleanNE("grp_flg"));
				if (e.getBooleanNE("grp_flg")) {
					up.setStringNE("BIND_GRP" + tail, e.getString("cd"));
				}
				else {
					up.setStringNE("BIND_EXP" + tail, e.getString("cd"));
				}
			}
			n++;
		}
	}

	protected MCList<MCRow> getExpnsList() {
		MCList<MCRow> l = MCList.create(MCRow.class);
		MAM_EXPNS_R pre = null;
		for (MAM_EXPNS_R m : getCustomExpnsL()) {
			// EXPNS_GRP_CD
			if (isNull(pre) || !isSame(pre.expns_grp_cd(), m.expns_grp_cd())) {
				MCRow r = MCRow.create();
				r.addBooleanColumn("grp_flg", true);
				r.addStringColumn("cd", m.expns_grp_cd());
				l.add(r);
			}
			// EXPNS_CD
			MCRow r = MCRow.create();
			r.addBooleanColumn("grp_flg", false);
			r.addStringColumn("cd", m.expns_cd());
			l.add(r);

			pre = m;
		}
		return l;
	}
	// -- 費目関連バインド変数設定（END）

	/**
	 * 有効な原価費目情報を取得する
	 *
	 * @return 有効な原価費目情報
	 */
	protected MCList<MAM_EXPNS_R> getCustomExpnsL() {
		MCList<MAM_EXPNS_R> l = getExpns();
		MCList<MAM_EXPNS_R> retL = MCList.create(MAM_EXPNS_R.class);
		ArrayList<String> validL = getValidExpnsTyp();
		for (MAM_EXPNS_R r : l) {
			if (!r.del_flg()) {
				if (validL.contains(r.expns_typ())) {
					retL.add(r);
				}
			}
		}
		return retL;
	}

	/**
	 * 有効な費目区分を取得する
	 *
	 * @return 有効な費目区分
	 */
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		for (MAC_EXPNS_TYP typ : MAC_EXPNS_TYP.array()) {
			list.add(typ.value());
		}
		return list;
	}

	/**
	 * 可変カラムと費目ＣＤを関連付けたマップを取得
	 * 
	 * @return 可変カラムをキーとして費目ＣＤを関連付けたマップ
	 */
	protected Map<String, String> getExpnsColMap() {
		if (_expnsColMap == null) {
			setExpnsMap();
		}
		return _expnsColMap;
	}

	/**
	 * 可変カラムと費目グループＣＤを関連付けたマップを取得
	 * 
	 * @return 可変カラムをキーとして費目グループＣＤを関連付けたマップ
	 */
	protected Map<String, String> getExpnsGColMap() {
		if (_expnsGColMap == null) {
			setExpnsMap();
		}
		return _expnsGColMap;
	}

	/**
	 * 費目グループＣＤの可変カラムと所属する費目ＣＤの可変カラムを関連付けたマップを取得
	 * 
	 * @return 費目グループＣＤの可変カラムと所属する費目ＣＤの可変カラムを関連付けたマップ
	 */
	protected Map<String, List<String>> getExpnsGMap() {
		if (_expnsGMap == null) {
			setExpnsMap();
		}
		return _expnsGMap;
	}

	/**
	 * 費目が割り当てられた可変カラム名を返す
	 * 
	 * @return 費目の可変カラム名
	 */
	protected String[] getExpnsColNames() {
		if (_expnsColNames == null) {
			setExpnsMap();
		}
		return _expnsColNames;
	}

	/**
	 * 費目Ｇが割り当てられた可変カラム名を返す
	 * 
	 * @return 費目Ｇの可変カラム名
	 */
	protected String[] getExpnsGColNames() {
		if (_expnsColGNames == null) {
			setExpnsMap();
		}
		return _expnsColGNames;
	}

	/**
	 * 費目・費目Ｇが割り当てられた可変カラム名を返す
	 * 
	 * @return 費目・費目Ｇの可変カラム名
	 */
	protected List<String> getExpnsAllColNames() {
		if (_expnsAllColNames == null) {
			setExpnsMap();
		}
		return _expnsAllColNames;
	}

	/**
	 * 集計対象項目を取得
	 * <P>
	 * 集計対象項目を変更する場合、このメソッドをオーバーライドする
	 */
	protected String[] getSumTgtCols() {
		String[] stringArray = {
			"T.act_cost"
		};
		return stringArray;
	}

	/**
	 * 集計項目の連番の桁数を取得
	 * <P>
	 * 集計項目の連番の桁数を変更する場合、このメソッドをオーバーライドする
	 */
	protected int getSumColScale() {
		return 3;
	}

	/**
	 * 費目・費目Ｇをキーとして集計項目を関連付けたマップを設定
	 *
	 * @return 費目・費目Ｇをキーとして集計項目を関連付けたマップ
	 */
	protected void setExpnsMap() {
		setExpnsMap(getSumTgtCols(), getSumColScale());
	}

	/**
	 * 費目・費目Ｇをキーとして集計項目を関連付けたマップを設定
	 * 
	 * @param colName 集計対象の項目
	 * @param decPlace 連番の桁数(col_xxのxxの桁数)
	 * @return 費目・費目Ｇをキーとして集計項目を関連付けたマップ
	 */
	protected void setExpnsMap(String[] tgtNames, int decPlace) {
		_expnsColMap = new LinkedHashMap<String, String>();
		_expnsGColMap = new LinkedHashMap<String, String>();
		_expnsGMap = new HashMap<String, List<String>>();
		ArrayList<String> expnsColNames = new ArrayList<String>();
		ArrayList<String> expnsColGNames = new ArrayList<String>();
		ArrayList<String> expnsAllColNames = new ArrayList<String>();
		ArrayList<ArrayList<String>> sumTgtGrpNames = new ArrayList<ArrayList<String>>();
		ArrayList<String> tmpGColNames = new ArrayList<String>();
		for (int j = 0; j < getSumTgtCols().length; j++) {
			sumTgtGrpNames.add(new ArrayList<String>());
		}
		MCList<MAM_EXPNS_R> l = getCustomExpnsL();
		String expnsG = null, cName;
		int i = 0;

		for (MAM_EXPNS_R r : l) {
			if (isNull(expnsG) || !isSame(r.expns_grp_cd(), expnsG)) {
				tmpGColNames = new ArrayList<String>();
				// 費目グループＣＤの集計カラム
				for (int j = 0; j < tgtNames.length; j++) {
					cName = createColumnNm(i, decPlace);
					expnsColGNames.add(cName);
					expnsAllColNames.add(cName);
					sumTgtGrpNames.get(j).add(cName);

					_expnsGColMap.put(cName, r.expns_grp_cd());
					_expnsGMap.put(cName, new ArrayList<String>());
					tmpGColNames.add(cName);

					i++;
				}

				expnsG = r.expns_grp_cd();
			}
			// 費目ＣＤの集計カラム
			for (int j = 0; j < tgtNames.length; j++) {
				cName = createColumnNm(i, decPlace);
				_expnsColMap.put(cName, r.expns_cd());
				expnsColNames.add(cName);
				expnsAllColNames.add(cName);
				sumTgtGrpNames.get(j).add(cName);

				_expnsGMap.get(tmpGColNames.get(j)).add(cName);

				i++;
			}
		}
		_expnsColGNames = (String[]) expnsColGNames.toArray(new String[0]);
		_expnsColNames = (String[]) expnsColNames.toArray(new String[0]);
		_expnsAllColNames = expnsAllColNames;
	}

	/**
	 * 可変カラムのカラム名を返します。
	 * @param i 連番
	 * @param decPlace 連番の桁数
	 */
	protected String createColumnNm(int i, int decPlace) {
		return "col_" + lpad(String.valueOf(i), decPlace, "0");
	}

	// -- 費目別原価検索処理（END）

	// -- ユーティリティ（START）
	/**
	 * Rowコンテナの全てのBOOLEAN型のカラムに値を設定します。
	 * 
	 * @param row Rowコンテナ
	 * @param b 値
	 * @param exceptCols 対象外のBOOLEAN型カラム 
	 */
	protected <R extends MCRow> void setAllFlgCol(R row, boolean b, String...exceptCols) {
		List<String> exceptL = Arrays.asList(exceptCols);
		for (String c : row.getColumnPathArray()) {
			if (exceptL.contains(c)) {
				continue;
			}
			if (row.getDataType(c) == MCDataType.BOOLEAN) {
				row.setBoolean(c, b);
			}
		}
	}

	/**
	 * 行の編集ステータスに応じてinsert / update / delete を行います。
	 * 
	 * @throws MCAppException [FXUDL0005] 新規追加行が既に登録されている場合（＝追加できない場合）
	 */
	protected <E extends MCDBContainer> void dbUpdByStatus(MCList<E> list) {
		if (list.isEmpty()) {
			return ;
		}

		MCQueryApiBuilder builder = MCQueryApiBuilder.create(list.get(0));
		dbUpdByStatus(list, builder);
	}

	/**
	 * 行の編集ステータスに応じてinsert / update / delete を行います。
	 * 
	 * @throws MCAppException [FXUDL0005] 新規追加行が既に登録されている場合（＝追加できない場合）
	 */
	protected <E extends MCDBContainer> void dbUpdByStatus(MCList<E> list, MCQueryApiBuilder builder) {
		MCList<E> del = list.subList(MCRow.DELETE);
		if (!del.isEmpty()) {
			dbDeleteKey(createSqlId(LOGIC_ID, del.get(0), "D01"), del, builder);
		}

		MCList<E> upd = list.subList(MCRow.MODIFY);
		if (!upd.isEmpty()) {
			dbUpdateKey(createSqlId(LOGIC_ID, upd.get(0), "U01"), upd, builder);
		}

		MCList<E> ins = list.subList(MCRow.CREATE);
		if (!ins.isEmpty()) {
			dbInsertEx(createSqlId(LOGIC_ID, ins.get(0), "I01"), ins, builder, FXUDL0005);
		}
	}

	/**
	 * 更新処理成功時の後処理を行います。
	 * <p>
	 * @param l
	 * @param errFlgCol
	 * @param rtnStsTypCol
	 */
	protected void handleSuccess(MCList<?> l, String errFlgCol, String rtnStsTypCol) {
		dbTran().commit();
		for (MCRow r : l) {
			if (!r.getBooleanNE(errFlgCol)) {
				r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	/**
	 * 更新処理成功時の後処理を行います。
	 * <p>
	 * エラーフラグ項目は「err_flg」、結果区分項目は「rtn_sts_typ」固定です。
	 * @param l
	 */
	protected void handleSuccess(MCList<?> l) {
		String errFlgCol = "err_flg";
		String rtnStsTypCol = "rtn_sts_typ";
		handleSuccess(l, errFlgCol, rtnStsTypCol);
	}

	/**
	 * 更新処理例外発生時の後処理を行います。
	 * <p>
	 * @param e
	 * @param l
	 * @param rtnStsTypCol
	 */
	protected void handleEx(Exception e, MCList<?> l, String rtnStsTypCol) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (MCRow r : l) {
			r.setString(rtnStsTypCol, MAC_RTN_STS_TYP.ERR.value());
		}
	}

	/**
	 * 更新処理例外発生時の後処理を行います。
	 * <p>
	 * 結果区分項目は「rtn_sts_typ」固定です。
	 * @param e
	 * @param l
	 */
	protected void handleEx(Exception e, MCList<?> l) {
		String rtnStsTypCol = "rtn_sts_typ";
		handleEx(e, l, rtnStsTypCol);
	 }

	/**
	 * 金額を数量で割った値を返す。
	 * 数量がゼロの場合、ゼロを返す。
	 * @param amt
	 * @param qty
	 * @param scale
	 */
	protected MCNumber calcUnit(MCNumber amt, MCNumber qty, int scale) {
		MCNumber unit = null;
		if (MCNumber.ZERO.eq(qty)) {
			unit = MCNumber.ZERO;
		}
		else {
			if (!isNull(amt)) {
				unit = amt.divide(qty, scale, MAC_RND_TYP.RNDOFF.toMC());
			}
		}
		return unit;
	}

	/**
	 * 率（％）の計算<br>
	 * 端数は四捨五入します。
	 * <p>
	 * @param denominator　分母
	 * @param numerator 分子
	 * @param scale 除算した結果のスケール
	 * @return 率（％）
	 */
	protected MCNumber calcRate(MCNumber denominator, MCNumber numerator, int scale) {
		if (isNull(denominator) || isNull(numerator)) {
			return null;
		}
		return (denominator.isZero() ? MCNumber.ZERO
				: numerator.multiply(100).divide(denominator, scale, MAC_RND_TYP.RNDOFF.toMC()));
	}

	/**
	 * 率（％）の計算<br>
	 * 端数は四捨五入します。
	 * 除算した結果のスケールは8です。
	 * <p>
	 * @param denominator　分母
	 * @param numerator 分子
	 * @return 率（％）
	 */
	protected MCNumber calcRate(MCNumber denominator, MCNumber numerator) {
		return calcRate(denominator, numerator, 8);
	}

	/**
	 * 差異の計算（標準値－実際値）<br>
	 * nullは0に変換して、計算します。
	 * <P>
	 * @param stdNumber 標準値
	 * @param actNumber 実際値
	 * @return 差異
	 */
	protected MCNumber calcDiff(MCNumber stdNumber, MCNumber actNumber) {
		return nvl(stdNumber, MCNumber.ZERO).subtract(nvl(actNumber, MCNumber.ZERO));
	}

	/**
	 * 増加率（％）の計算<br>
	 * 端数は四捨五入します。<br>
	 * 増加率 = inc / original(絶対値)
	 * <p>
	 * @param inc 増加分
	 * @param original 元の数値
	 * @param scale
	 * @return 増加率
	 */
	protected MCNumber calcIncrease(MCNumber inc, MCNumber original) {
		if (isNull(original)) {
			return null;
		}
		return calcRate(original.abs(), inc);
	}

	protected static final String SUF_FLG = "_flg";
	protected static final String SUF_NM = "_nm";
	protected static final String SUF_CD = "_cd";

	/**
	 * 品目分類１～１０や取引先分類１～１０の名称、CDがNOT NULLのとき、対応するフラグにTRUEを設定します。<br>
	 * <P>
	 * 「itm_grp_nm1」がNOT NULL => 「itm_grp_flg1」にTRUEを設定
 	 * 「itm_grp_cd1」がNOT NULL => 「itm_grp_flg1」にTRUEを設定
	 * </P>
	 * @param r ROWコンテナ
	 * @param grpHdr 分類の頭の部分「itm_grp」「par_itm_grp」「bp_grp」「cst_grp」など
	 */
	protected void setGrpFlg(MCRow r, String grpHdr) {
		for (int i = 1; i <= 10; i++) {
			boolean bNm = !isNull(r.getValue(grpHdr.toLowerCase() + SUF_NM + i));
			boolean bCd = !isNull(r.getValue(grpHdr.toLowerCase() + SUF_CD + i));
			r.setBoolean(grpHdr.toLowerCase() + SUF_FLG + i, bNm || bCd);
		}
	}

	protected static final String DYNAMIC_KEY = "COL_SQL";
	protected static final String DYNAMIC_FLG = "FLG_COL";

	/**
	 * 上り電文（引数up）のフラグの値を見て、有効なカラムをリストに格納して返します。<br>
	 * <p>
	 * 実装仕様書で項目属性「FLG_COL」「COL_SQL」を定義している必要があります。
	 * </p>
	 * @param list 対象リスト
	 * @param up 上り電文
	 * @return 有効なカラムのリスト
	 */
	protected ArrayList<String> getDispIndexKeys(MCList<? extends MCConstRow> list, MCRow up) {
		MCConstRow r = list.createRow();
		Map<String, String> keyMap = r.getExtMap(DYNAMIC_KEY);
		Map<String, String> flgMap = r.getExtMap(DYNAMIC_FLG);
		ArrayList<String> keys = new ArrayList<String>();

		for (String c : r.getConstColumnPathArray()) {
			String key = keyMap.get(c);
			String flg = flgMap.get(c);
			if (!isNull(key) && (isNull(flg) || up.getBooleanNE(flg))) {
				keys.add(c);
			}
		}
		return keys;
	}

	/**
	 * MCLabelリソースからラベル文字列を取得します。
	 * <p>
	 * 以下の構成のみ対応しています。
	 * <p>
	 * &LT;モジュールＩＤ&GT;&LT;ロジックＩＤ&GT;&LT;リソースキー&GT;
	 * <p>
	 * リソースキーが見つかった場合は、見つかったリソースキーのラベル文字列を返します。<br>
	 * リソースキーが見つからなかった場合は null を返します。
	 *
	 * @param resourceKey リソースキー
	 * @return リソース値、または null
	 */
	protected String getDispString(String resourceKey) {
		String key = MCConst.createKey(getModuleID(), getLogicID(), resourceKey);
		String label = MCLocaleConst.label(MCSys.user.locale(), getClass().getPackage().getName()).getLabel(key);
		return label;
	}

	protected String toOnOffStr(boolean onFlg, boolean offFlg) {
		if (onFlg == offFlg) {
			return null;
		}
		else if (onFlg) {
			return MCBooleanUtil.booleanToDBString(true);
		}
		else {
			return MCBooleanUtil.booleanToDBString(false);
		}
	}

	// -- ユーティリティ（END）

	// -- 共通チェック処理（START）

	/**
	 * 資産区分が「1.自社（販売）」または「2.自社（生産）」であるかチェックします。
	 * <p>
	 * @param row 対象行
	 * @param asstCol 資産区分の項目名
	 * @return　エラーメッセージ（正常ならばnull）
	 */
	protected MCMessage chkAsstNoOth(MCRow row, String asstTypCol) {
		String asstTyp = row.getString(asstTypCol);
		if (!isNull(asstTyp) && !MAC_ASST_TYP.isCO_PROD(asstTyp) && !MAC_ASST_TYP.isCO_SLS(asstTyp)) {
			return new MCMessage(row, asstTypCol, MGUDL0001, toDispGUIIndex(row));
		}
		else {
			return null;
		}
	}

	/**
	 * 個別評価区分が「1.標準単価」または「2.０評価」であるかチェックします。
	 * <p>
	 * @param row 対象行
	 * @param recEvslTypCol 個別評価区分の項目名
	 * @return　エラーメッセージ（正常ならばnull）
	 */
	protected MCMessage chkRecEvalNoExpns(MCRow row, String recEvslTypCol) {
		String recEvslTyp = row.getString(recEvslTypCol);
		if (!isNull(recEvslTyp) && !MGC_REC_EVAL_TYP.isSTD_UNIT(recEvslTyp) && !MGC_REC_EVAL_TYP.isZERO(recEvslTyp)) {
			return new MCMessage(row, recEvslTyp, MGUDL0003, toDispGUIIndex(row));
		}
		else {
			return null;
		}
	}

	/**
	 * 計算Ｇ・年月に対して原価計算ＮＯが確定されているかどうかチェック<br>
	 * 確定されている場合は、エラーメッセージを返す。<br>
	 * 確定されていない場合は、nullを返す。
	 * <p>
	 * @param calcGrpCd 計算グループＣＤ
	 * @param ym 年月
	 * @return エラーメッセージ（正常ならばnull）
	 */
	protected MCMessage chkCalcFix(String calcGrpCd, MCDate ym) {
		if (!isNullOr(calcGrpCd, ym)) {
			MCRow r = MCRow.create();
			r.addBooleanColumn("boo");
			sql(createSqlId(LOGIC_ID, "MGPA_CALC_FIX$F_CHK_FIX", "chkCalcFix"))
					.mainQuery()
					.select(MGPA_CALC_FIX$F_CHK_FIX(value(calcGrpCd), value(ym)).as("boo"))
					.executeQuery(r);
			if (r.getBoolean("boo")) {
				return new MCMessage(MGUDL0002, calcGrpCd, toYMString(ym));
			}
		}
		return null;
	}

	/**
	 * 会計伝票区分が指定された属性に属するかチェックします。
	 * <p>
	 * @param row 対象行
	 * @param acSlipTypCol 会計伝票区分の項目名
	 * @param attr 属性名称（指定方法：MAC_AC_SLIP_TYP.$IS_SLS_TYP など）
	 */
	protected MCMessage chkAcSlipWithAttr(MCRow row, String acSlipTypCol, String attr) {
		String acSlipTyp = row.getString(acSlipTypCol);
		if (isNull(acSlipTyp)) {
			return null;
		}
		String[] acSlipTyps = getAcSlipTyps(attr);
		for (String val : acSlipTyps) {
			if (isSame(acSlipTyp, val)) {
				return null;
			}
		}
		return new MCMessage(row, null, MGBXL0031, acSlipTyp, MCStringUtil.join(",", acSlipTyps));
	}

	protected Map<String, String[]> _acSlipMap = new HashMap<String, String[]>();

	protected String[] getAcSlipTyps(String attr) {
		if (!_acSlipMap.containsKey(attr)) {
			MCList<MCRow> subList = MAC_AC_SLIP_TYP.subList(new String[] { attr }, new Comparable<?>[] { true });
			ArrayList<String> acSlipTypList = new ArrayList<String>();
			for (MCRow r : subList) {
				acSlipTypList.add(r.getString(MAC_AC_SLIP_TYP.$VALUE));
			}
			_acSlipMap.put(attr, acSlipTypList.toArray(new String[0]));
		}
		return _acSlipMap.get(attr);
	}

	/**
	 * 工程実績ＮＯ、工程ＣＤ、工程連番の入力チェックをします。
	 * <p>
	 */
	protected MCMessage chkOper(MCRow row, String operActNoCol, String operCdCol, String operSeqCol) {
		if (isNullOrNullVal(row.getString(operActNoCol))) {
			if (!isNull(row.getString(operCdCol)) || !isNull(row.getNumber(operSeqCol))) {
				return new MCMessage(row, null, MGUDL0006, toDispGUIIndex(row));
			}
		}
		else {
			if (isNull(row.getString(operCdCol)) || isNull(row.getNumber(operSeqCol))) {
				return new MCMessage(row, null, MGUDL0005, toDispGUIIndex(row));
			}
		}
		return null;
	}

	// -- 共通チェック処理（END）

	// -- メッセージ（START）
	/**
	 * 登録対象が共通の場合の必須エラーメッセージ
	 */
	protected MCMessage getRegTgtCmnReqMsg(MCRow causeRow, String... causeCol) {
		return new MCMessage(causeRow, causeCol.length == 0 ? null : causeCol[0], MGUDL0004, getLabel(causeRow, causeCol),
				toDispGUIIndex(causeRow));
	}
	// -- メッセージ（END）

	protected static final String DYNAMIC_SQL_COL_SQL = "COL_SQL";
	protected static final String DYNAMIC_SQL_ORDER_SQL = "ORDER_SQL";
	
	protected static final String ORDER_NO = "order_no";
	protected static final String ORDER_ITM = "order_itm";
	//FMCB CUSTOM END
}