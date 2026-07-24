package mcframe.serverMAUD.MAUDL5070;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueSplit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPredicate;
import mcframe.commonCore.sys.MCFactory;
import mcframe.serverCore.list.MCListLogicUtil;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
//FMCB CUSTOM_IMPORT END

/**
 * "MAUDL_ListLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MAUDL_ListLogicBase_MC extends MAUDL_ListLogicBase_MC_A{
	//FMCB CUSTOM START

	/**
	 * Checkerオペレーション.<p>
	 *
	 * リストロジック共通のロジック親クラスです。<br>
	 */
	public class Checker extends MAUDL_ListLogicBase_MC_A.Checker {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
		}
	}

	// ///////////////////////////////////////////////
	// 共通（ここから）
	// ///////////////////////////////////////////////
	
	@Override
	protected void listlogicCommon_Set(
			MCRow row, MCQueryApiBuilder d, String listLogicId) {
		super.listlogicCommon_Set(row, d, listLogicId);
		setListLogicCheckWhere(row, d, listLogicId);
		setReqPluralWhere(row, d, listLogicId);
	}
	
	/**
	 * 引数のbuilderに複数値入力の検索条件用のwhere句を追加します。
	 * <p>
	 * 
	 * @param row 検索条件のrow
	 * @param builder クエリAPIビルダー
	 * @param listLogicId リストロジックID
	 */
	protected void setReqPluralWhere(
			MCRow row, MCQueryApiBuilder builder, String listLogicId) {
		
		if (row.getBooleanNE($IS_REQ_PLURAL)) {
			Comparable<?> iv = row.getValueNE($INPUT_REQ_PLURAL_VAL);
			if (!isNull(iv) && iv instanceof String) {
			
				//複数値の条件を追加
				String[] pv = mcframe.commonCore.lang.MCStringUtil.arrayValueSplit((String) iv);
				
				//OUT項目の１つ目を入力項目とする前提の実装
				String[] ss = MCListLogicUtil.getOutColumns(listLogicId);

				MCDBContainer d = builder.getBaseDbc();
				MCPermColumn col = d.getColumn$(ss[0]);
				MCPredicate p = value(0).neq(value(0));
				for(int i=1 ; i <= pv.length ; i++) {
					p = p.or(MCQueryApiBuilder.makeEq(col, bind(String.valueOf(i))));
				}
				builder.addWhereWithAnd(p, pv);
			}
		}
		
	}
	@Override
	protected <R extends MCDBContainer, DR extends MCRow, DL extends MCList<DR>> DL listlogicCommon_AfterSelect(
			MCRow row, MCList<? extends R> d, DL rd, String listLogicId) {
		DL srd = super.listlogicCommon_AfterSelect(row, d, rd, listLogicId);
		listlogicCommon_Sort(srd, listLogicId);
		
		// "枝番"はmode_nullval_flgに依らないパタンがあるので、ここではif分岐しない
		getListNullValByBind(row, srd, listLogicId);
		return srd;
	}

	protected <DR extends MCRow, DL extends MCList<DR>> void listlogicCommon_Sort(
			DL rd, String listLogicId) {
		sortByListLogicDef(rd, listLogicId);
		sortNullVal(rd, listLogicId);
	}
	
	/**
	 * リストロジック定義書のColSort列で指定したソート順を反映する
	 *
	 * @param rd ソート対象のリスト
	 * @param listLogicId リストロジックＩＤ
	 */
	protected <DR extends MCRow, DL extends MCList<DR>> void sortByListLogicDef(
			DL rd, String listLogicId) {
		Class<?> c = (Class<?>) mcframe.commonCore.util.MCListLogicUtil.getColsClass(listLogicId);
		MCSortPolicy sp = (MCSortPolicy) MCFactory.invokeStatic(c, "sortPolicy", null, null);
		rd.sort(sp);
	}

	/**
	 * ＮＵＬＬ文字を末尾に移動する
	 *
	 * @param rd ソート対象のリスト
	 * @param listLogicId リストロジックＩＤ
	 */
	protected <DR extends MCRow, DL extends MCList<DR>> void sortNullVal(
			DL rd, String listLogicId) {
		String tarCol = getFirstKeyCol(listLogicId);
		
		// tarColのカラムがString型以外なら終了
		if (!isSame(rd.getDataType(tarCol), MCDataType.STRING)) {
			return;
		}
		
		// ＮＵＬＬ文字がなければ終了
		if (isNull(rd.getFirst(tarCol, MAC_STR.NULL_VAL.value()))) {
			return;
		}
		
		// ＮＵＬＬ文字が末尾にあれば終了
		if (isSame(rd.get(rd.size() - 1).getStringNE(tarCol), MAC_STR.NULL_VAL.value())) {
			return;
		}
		
		// ＮＵＬＬ文字を末尾に移動
		MCList<DR> subRd = rd.shallowClone();
		rd.clear();
		for (DR sr : subRd) {
			if (isSame(sr.getStringNE(tarCol), MAC_STR.NULL_VAL.value())) {
				continue;
			}
			rd.add(sr);
		}
		rd.addAll(subRd.subList(tarCol, MAC_STR.NULL_VAL.value()));
	}

	/**
	 * 引数のbuilderにリストロジックチェック用の検索条件用のwhere句を追加します。
	 * <p>
	 *
	 * @param row バインド用Rowコンテナ
	 * @param builder 検索を実行するクエリAPIビルダー
	 * @param listLogicId リストロジックＩＤ
	 */
	protected void setListLogicCheckWhere(
			MCRow row, MCQueryApiBuilder builder, String listLogicId) {

		if (row.getValueNE($LIST_LOGIC_VAL) == null) {
			return;
		}
		
		// キー
		String firstKeyChkCol = getFirstKeyChkCol();
		String firstKeyDbCol = getFirstKeyDbCol(listLogicId);
		List<String> otherKeyChkCols = getOtherKeyChkCols(listLogicId);
		List<String> otherKeyCols = getOtherKeyCols(listLogicId);
		List<String> otherKeyDbCols = getOtherKeyDbCols(listLogicId);
		
		// 値
		Comparable<?>[] firstKeyVal = convDataArray(row.getStringNE(firstKeyChkCol));
		HashMap<String, Comparable<?>[]> otherKeyValsMap = new HashMap<>();
		for (int i = 0; i < otherKeyChkCols.size(); i++) {
			otherKeyValsMap.put(otherKeyCols.get(i), convDataArray(row.getStringNE(otherKeyChkCols.get(i))));
		}
		
		// キーと値を組み合わせて次のようなWHERE句を追加する
		// AND (
		//      ( T.[firstKeyCol] = :1 AND T.[otherKeyCol] = :2 ... AND :n BETWEEN T.ST_DT AND T.END_DT)
		//   OR ( T.[firstKeyCol] = :n+1 AND T.[otherKeyCol] = :n+2 ... AND :n+n BETWEEN T.ST_DT AND T.END_DT)
		// )
		// )
		// bindValsにはバインドする値をバインド順に格納する
		MCDBContainer d = builder.getBaseDbc();
		
		MCPredicate p1 = null;
		MCPermColumn firstDbKey = d.getColumn$(firstKeyDbCol);
		
		ArrayList<Comparable<?>> binds = new ArrayList<>();
		int bindcnt = 0;
		
		for (int i = 0; i < firstKeyVal.length; i++) {
			
			//p2 =  T.[firstKeyCol] = :1 AND T.[otherKeyCol] = :2 ... AND :n BETWEEN T.ST_DT AND T.END_DT
			MCPredicate p2 = MCQueryApiBuilder.makeEq(firstDbKey, bind(String.valueOf(++bindcnt)));
			binds.add( firstKeyVal[i]);
			
			for (int j = 0; j < otherKeyCols.size(); j++) {
				String otherKeyCol = otherKeyCols.get(j);
				String otherKeyDbCol = otherKeyDbCols.get(j);
				Comparable<?>[] vals = otherKeyValsMap.get(otherKeyCol);
				
				binds.add(vals[i]);

				if (isSame(otherKeyCol, "dt")) {
					p2 = p2.and(bind(String.valueOf(++bindcnt)).between(
							(MCDatePermColumn)d.getColumn$("st_dt"), 
							(MCDatePermColumn)d.getColumn$("end_dt")));
				}
				else {
					p2 = p2.and(MCQueryApiBuilder.makeEq(d.getColumn$(otherKeyDbCol), bind(String.valueOf(++bindcnt))));
				}
			}
			if (p1 == null) {
				p1 = bracket(p2);
			}
			else {
				p1 = p1.or(p2);
			}
		}
		builder.addWhereWithAnd(p1, binds.toArray(new Comparable<?>[binds.size()]));
	}
	
	/**
	 * OTHER KEYのサーバチェック用の項目名を取得する。
	 * 
	 * @param listLogicId リストロジックＩＤ
	 * @return OTHER KEY
	 */
	public static List<String> getOtherKeyChkCols(String listLogicId) {
		List<String> othKeyCols = getOtherKeyCols(listLogicId);
		
		// OTHER KEYのカラム名はリストロジック
		List<String> ret = new ArrayList<String>();
		for (String othKeyCol :othKeyCols) {
			ret.add(getLLBindNm(othKeyCol));
		}
		return ret;
	}
	
	/**
	 * OTHER KEYのリストロジック定義上の項目名を取得する。
	 * リストロジック定義書に$k_oth_keyで定義した項目を取得する。
	 * $k_oth_keyには、リスト取得対象のマスタが複合キーの場合、第一キー以外のキーを定義する。
	 * 
	 * @param listLogicId リストロジックＩＤ
	 * @return OTHER KEY
	 */
	public static List<String> getOtherKeyCols(String listLogicId) {
		Class<?> cls = MCListLogicUtil.getColsClass(listLogicId);
		String otherKeysString = MCFactory.getFieldValue(cls, String.class, "$k_oth_key");
		String[] othKeyCols = MCStringUtil.split(",", otherKeysString);
		List<String> ret = new ArrayList<String>();
		for (String othKeyCol :othKeyCols) {
			ret.add(othKeyCol);
		}
		return ret;
	}
	
	/**
	 * OTHER KEYのDB定義（DBコンテナ）上の項目名を取得する。
	 * OTHER KEYはリストロジック定義書に$k_oth_keyで定義した項目。
	 * $k_oth_keyには、リスト取得対象のマスタが複合キーの場合、第一キー以外のキーを定義する。
	 * 
	 * @param listLogicId リストロジックＩＤ
	 * @return OTHER KEY
	 */
	public static List<String> getOtherKeyDbCols(String listLogicId) {
		Class<?> cls = MCListLogicUtil.getColsClass(listLogicId);
		String otherKeyDbColsStr = MCFactory.getFieldValue(cls, String.class, "$k_oth_key_db");
		String[] otherKeyDbCols = MCStringUtil.split(",", otherKeyDbColsStr);
		List<String> ret = new ArrayList<String>();
		for (String otherKeyDbCol :otherKeyDbCols) {
			ret.add(otherKeyDbCol);
		}
		if (ret.size() == 0) {
			ret = getOtherKeyCols(listLogicId);
		}
		return ret;
	}
	
	/**
	 * 第一キーのサーバチェック用の項目名を取得する。
	 * 第一キーはリスト取得対象のマスタのキーの一部で、リストロジックのout項目の最初の項目。
	 * 
	 * @return 第一キーのサーバチェック用の項目名
	 */
	public static String getFirstKeyChkCol() {
		return $LIST_LOGIC_VAL;
	}
	
	/**
	 * 第一キーのリストロジック定義上の項目名を取得する。
	 * 第一キーはリスト取得対象のマスタのキーの一部で、リストロジックのout項目の最初の項目。
	 * 
	 * @return 第一キーのリストロジック定義上の項目名
	 */
	public static String getFirstKeyCol(String listLogicId) {
		return MCListLogicUtil.getOutColumns(listLogicId)[0];
	}
	
	/**
	 * 第一キーのDB定義（DBコンテナ）上の項目名を取得する。
	 * <p>第一キーはリスト取得対象のマスタのキーの一部。
	 * <p>基本的に第一キーはリストロジックのout項目の最初の項目が対応するが、
	 * リストロジック定義書に$k_first_key_db で定義した項目が優先される。
	 * @return  第一キーのDB定義上の項目名
	 */
	public static String getFirstKeyDbCol(String listLogicId) {
		Class<?> cls = MCListLogicUtil.getColsClass(listLogicId);
		String firstKeyDbCol = MCFactory.getFieldValue(cls, String.class, "$k_first_key_db");
		return isNull(firstKeyDbCol) ? getFirstKeyCol(listLogicId) : firstKeyDbCol;
	}

	/**
	 * 「^」で連結された複数のデータを分割・変換して配列にして返す。<br>
	 * BooleanはString（DBブール文字列）として格納します。<p>
	 * 
	 * @param valuesStr 連結された文字列
	 */
	protected Comparable<?>[] convDataArray(String valuesStr) {
		// MCDate、TIMESTAMP、Numberの場合は、要素が空文字になることも考慮する
		String[] strs = arrayValueSplit(valuesStr);
		if (isSame(strs[0],MCDataType.DATE.toString())) {
			MCDate[] da = new MCDate[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				da[i - 1] = isSame(strs[i], "") ? null : MCDate.valueOf(strs[i], "yyyyMMddHHmmss");
			}
			return da;
		}
		else if (isSame(strs[0],MCDataType.NUMBER.toString())) {
			MCNumber[] na = new MCNumber[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				na[i - 1] = isSame(strs[i], "") ? null : MCNumber.valueOf(strs[i]);
			}
			return na;
		}
		else if (isSame(strs[0],MCDataType.TIMESTAMP.toString())) {
			MCTimestamp[] ta = new MCTimestamp[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				ta[i - 1] = isSame(strs[i], "") ? null : MCTimestamp.valueOf(strs[i], "yyyyMMddHHmmssSSS");
			}
			return ta;
		}
		else if (isSame(strs[0],MCDataType.BOOLEAN.toString())) {
			Boolean[] ba = new Boolean[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				ba[i - 1] = Boolean.valueOf(strs[i]);
			}
			return ba;
		}
		else {
			String[] sa = new String[strs.length - 1];
			for (int i = 1; i < strs.length; i++) {
				sa[i - 1] = strs[i];
			}
			return sa;
		}
	}

	/**
	 * サーバのリストロジッククラスに定義されたget[リストロジックＩＤ]_NullValメソッドを実行して返します。<br>
	 * メソッドが定義されていなければnullを返します。<br>
	 * メソッド例：getBp_NullVal(～)<br>
	 *
	 * @param bind 引数のバインドRow
	 * @param down DB検索結果のリスト
	 * @param llid リストロジックＩＤ（例：MA.MAUAL0010.Loc）
	 */
	protected <DR extends MCDBContainer> void getListNullValByBind(
		MCRow bind,  MCList<? extends MCRow> down, String llid) {
		MCLogicBase lstLgc = MCListLogicUtil.getServerClass(llid);
		String mtd = MCConst.ll.getServerMethod(llid);
		String nullValMtd = mtd + "_NullVal";
		try {
			MCFactory.invoke(lstLgc, nullValMtd,
					new Class[] {MCRow.class, MCList.class},
					new Object[] {bind, down});
		}
		catch (MCException e) {
			// メソッドが存在しない場合、何もしない
		}
	}
	// ///////////////////////////////////////////////
	// 共通（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 品目関連（ここから）
	// ///////////////////////////////////////////////
	
	/**
	 * 品目入力補助検索区分に応じた検索条件を追加する。<p>
	 * @param row 検索条件
	 * @param d 検索を実行するDBコンテナ
	 * @param itm_is_srch_typ 検索区分(値)
	 */
	protected void setItmConditionByItmIsSrchTyp(
			MCRow row, MCQueryApiBuilder builder, String itm_is_srch_typ) {
		// 区分１～１７の条件は定数定義書で属性として定義。２４の条件は在庫管理区分の条件のみ定数定義書で属性として定義
		// そのほかの区分は定数定義書で属性としてnullが定義されているため、ここの条件はカットオフされる
		// 検索区分がnullの場合も属性としてnullが返されるためここの条件はカットオフされ、区分１と同等になる
		MCDBContainer d = builder.getBaseDbc();
		
		String smtcol = "stk_mng_typ";
		String amtcol = "asset_mng_typ";
		String sndcol = "sundry_itm_flg";
		builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(d.getColumn$(smtcol),  bind("1")), MAC_ITM_IS_SRCH_TYP.stk_mng_typ(itm_is_srch_typ));
		builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(d.getColumn$(amtcol),  bind("1")), MAC_ITM_IS_SRCH_TYP.asset_mng_typ(itm_is_srch_typ));
		if (MAC_ITM_IS_SRCH_TYP.is_referring_sundry_flg(itm_is_srch_typ)) {
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(d.getColumn$(sndcol),  bind("1")), MAC_ITM_IS_SRCH_TYP.sundry_flg(itm_is_srch_typ));
		}
		
		// 区分０：全品目（架空品除く）
		if (MAC_ITM_IS_SRCH_TYP.isNOT_ASSET3(itm_is_srch_typ)) {
			builder.addWhereWithAnd(makeNeqVal(d.getColumn$("asset_mng_typ"), "3"));
		}
		// 区分１８：版管理対象品
		else if (MAC_ITM_IS_SRCH_TYP.isVER(itm_is_srch_typ)) {
			builder.addWhereWithAnd(makeEqVal(d.getColumn$("ver_flg"),"1"));
		}
		// 区分１９：品目検査パタンマスタ登録済品
		else if (MAC_ITM_IS_SRCH_TYP.isITM_INSP_PTN(itm_is_srch_typ)) {
			MAM_ITM_INSP_PTN_R sub = MAM_ITM_INSP_PTN_R.create("IIP");
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(sub)
					.where(MCQueryApiBuilder.makeEq(sub.itm_cd, d.getColumn$( "itm_cd"))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub1, d.getColumn$( "itm_sub1")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub2, d.getColumn$( "itm_sub2")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub3, d.getColumn$( "itm_sub3"))))));
		}
		// 区分２０：販売計画品目
		else if (MAC_ITM_IS_SRCH_TYP.isSPLN(itm_is_srch_typ)) {
			MAM_SPLN_ITM_CONF_R sub = MAM_SPLN_ITM_CONF_R.create("SPLN");
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(sub)
					.where(MCQueryApiBuilder.makeEq(sub.itm_cd, d.getColumn$( "itm_cd"))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub1, d.getColumn$( "itm_sub1")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub2, d.getColumn$( "itm_sub2")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub3, d.getColumn$( "itm_sub3")))
							.and(sub.spln_itm_cd.eq(value(MAC_STR.NULL_VAL.value()))))));
		}
		// 区分２１：資産管理品もしくは架空品
		else if (MAC_ITM_IS_SRCH_TYP.isPAR_ITM_BOM(itm_is_srch_typ)) {
			MCPermColumn col = d.getColumn$("asset_mng_typ");
			builder.addWhereWithAnd(
					makeEqVal(col, "1").or(makeEqVal(col, "3")));
		}
		// 区分２２：構成主品目
		else if (MAC_ITM_IS_SRCH_TYP.isCOMP_CORE_ITM(itm_is_srch_typ)) {
			builder.addWhereWithAnd(
					makeEqVal(d.getColumn$("comp_core_itm_flg"), "1"));
		}
		// 区分２３：架空品以外かつ構成・仕様管理するもの以外
		else if (MAC_ITM_IS_SRCH_TYP.isNOT_ASSET3_NOT_COMP_SPEC(itm_is_srch_typ)) {
			builder.addWhereWithAnd(makeNeqVal(d.getColumn$("asset_mng_typ"), "3"));
			builder.addWhereWithAnd(makeNeqVal(d.getColumn$("comp_spec_typ"), "2"));
		}
		// 区分２４：在庫管理品かつ構成・仕様管理するもの以外
		else if (MAC_ITM_IS_SRCH_TYP.isSTK1_NOT_COMP_SPEC(itm_is_srch_typ)) {
			// 在庫管理区分については、定数定義書にて定義済み
			builder.addWhereWithAnd(makeNeqVal(d.getColumn$("comp_spec_typ"), "2"));
		}
		// 区分２５：購買内示
		else if (MAC_ITM_IS_SRCH_TYP.isPURC_FRCST(itm_is_srch_typ)) {
			MAM_BP_ITM_R bpitm = MAM_BP_ITM_R.create("BI");
			builder.addInnerJoin(bpitm, 
					MCQueryApiBuilder.makeEq(bpitm.itm_cd, d.getColumn$("itm_cd"))
					.and(MCQueryApiBuilder.makeEq(bpitm.itm_sub1, d.getColumn$("itm_sub1")))
					.and(MCQueryApiBuilder.makeEq(bpitm.itm_sub2, d.getColumn$("itm_sub2")))
					.and(MCQueryApiBuilder.makeEq(bpitm.itm_sub3, d.getColumn$("itm_sub3")))
					.and(bpitm.pf_grp_cd.isNotNull())
					);
		}
		// 区分２６：規格検査対象品
		else if (MAC_ITM_IS_SRCH_TYP.isITM_INSP_SPEC(itm_is_srch_typ)) {
			MAM_ITM_INSP_PTN_R sub = MAM_ITM_INSP_PTN_R.create("IIP");
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(sub)
					.where(MCQueryApiBuilder.makeEq(sub.itm_cd, d.getColumn$("itm_cd"))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub1, d.getColumn$("itm_sub1")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub2, d.getColumn$("itm_sub2")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub3, d.getColumn$("itm_sub3")))
							.and(sub.insp_mtd_typ.eq(value(MAC_INSP_MTD_TYP.SPEC.value()))))));
		}
		// 区分２７：ロット管理品
		else if (MAC_ITM_IS_SRCH_TYP.isLOT(itm_is_srch_typ)) {
			MCPermColumn col = d.getColumn$("lot_mng_typ");
			builder.addWhereWithAnd(
					makeEqVal(col, MAC_LOT_MNG_TYP.DUPL_ABL.value())
					.or(makeEqVal(col, MAC_LOT_MNG_TYP.UNIQ.value())));
		}
		// 区分２８：発注点管理品
		else if (MAC_ITM_IS_SRCH_TYP.isOP(itm_is_srch_typ)) {
			MAM_STK_RPL_R sub = MAM_STK_RPL_R.create("SR");
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(sub)
					.where(MCQueryApiBuilder.makeEq(sub.itm_cd, d.getColumn$("itm_cd"))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub1, d.getColumn$("itm_sub1")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub2, d.getColumn$("itm_sub2")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub3, d.getColumn$("itm_sub3")))
							.and(sub.rord_stk_qty.gte(value(0))))));
		}
		// 区分２９：原価レポートキー構成品
		else if (MAC_ITM_IS_SRCH_TYP.isRPT_KEY(itm_is_srch_typ)) {
			MAM_RPT_KEY_CONF_R sub = MAM_RPT_KEY_CONF_R.create("RPT_KEY_CONF");
			builder.addWhereWithAnd(exists(
					subQuery().select(value("X")).from(sub)
					.where(MCQueryApiBuilder.makeEq(sub.itm_cd, d.getColumn$("itm_cd"))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub1, d.getColumn$("itm_sub1")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub2, d.getColumn$("itm_sub2")))
							.and(MCQueryApiBuilder.makeEq(sub.itm_sub3, d.getColumn$("itm_sub3")))
							.and(sub.rpt_key_cd.eq(bind(ItmCols.$i_rpt_key_cd))))));
		}
		// 区分３０：ロット継承
		else if (MAC_ITM_IS_SRCH_TYP.isLOT_INH_DEST(itm_is_srch_typ)) {
			builder.addWhereWithAnd(
					makeEqVal(d.getColumn$("lot_mng_typ"), MAC_LOT_MNG_TYP.UNIQ.value())
					.or(makeEqVal(d.getColumn$("sublot_mng_typ"), MAC_SUBLOT_MNG_TYP.UNIQ.value())));
		}
	}

	/**
	 * 品目関連で設定する、品目分類に関するSELECT句とJOIN句を追加するユーティリティ<p>
	 * 利用する場合は品目分類の入出力項目名を品目のリストロジックと同じにすること
	 *
	 * @param row 検索条件
	 * @param d 検索を実行するDBコンテナ
	 */
	protected void setSelectJoinOfItmGrpForItm(MCRow row, MCQueryApiBuilder builder) {
		if (isSrvChk(row)) {
			return;
		}
		
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg1)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP1,"1", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg2)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP2,"2", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg3)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP3,"3", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg4)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP4,"4", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg5)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP5,"5", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg6)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP6,"6", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg7)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP7,"7", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg8)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP8,"8", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg9)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP9,"9", builder);
		}
		if (row.getBooleanNE(ItmCols.$i_itm_grp_flg10)) {
			addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP.GRP10,"10", builder);
		}
	}
	
	/**
	 * 品目分類名を検索するための設定をします。
	 * @param grp 品目分類
	 * @param num　分類番号
	 * @param builder クエリAPIビルダー
	 */
	protected void addOuterJoinItmGrpAndSelectNm(MAC_ITM_GRP_TYP grp, String num, MCQueryApiBuilder builder) {
		MAM_ITM_GRP_R view = MAM_ITM_GRP_R.create(grp.key());
		MCDBContainer d = builder.getBaseDbc();
		builder.addLeftOuterJoin(view, 
				MCQueryApiBuilder.makeEq(view.itm_grp_cd, d.getColumn$("itm_grp_cd" + num))
				.and(view.itm_grp_typ.eq(value( grp.value()))));
		builder.addSelect(view.itm_grp_nm.as("itm_grp_nm" + num));
	}
	
	/**
	 * 品目関連のリストロジックに対して、区分名を設定する<p>
	 *
	 * @param row 検索条件
	 * @param builder クエリAPIビルダー
	 * @param l 検索結果
	 */
	protected void setTypNmForItm(MCRow row, MCQueryApiBuilder builder, MCList<?> l) {
		l.addStringColumn("itm_typ_nm");
		l.addStringColumn("stk_mng_typ_nm");
		l.addStringColumn("asset_mng_typ_nm");
		l.addStringColumn("rnd_typ_nm");
		l.addStringColumn("lot_mng_typ_nm");
		l.addStringColumn("lot_no_typ_nm");
		l.addStringColumn("sublot_mng_typ_nm");
		l.addStringColumn("sublot_no_typ_nm");
		l.addStringColumn("insp_bind_typ_nm");
		l.addStringColumn("cont_fctr_rnd_typ_nm");
		l.addStringColumn("sno1_mng_typ_nm");
		l.addStringColumn("sno1_num_typ_nm");
		l.addStringColumn("sno2_mng_typ_nm");
		l.addStringColumn("sno2_num_typ_nm");
		l.addStringColumn("sno3_mng_typ_nm");
		l.addStringColumn("sno3_num_typ_nm");
		l.addStringColumn("sno4_mng_typ_nm");
		l.addStringColumn("sno4_num_typ_nm");
		l.addStringColumn("mfg_inst_unit_typ_nm");
		l.addStringColumn("mrp_proc_typ_nm");
		l.addStringColumn("comp_spec_typ_nm");
		l.addStringColumn("slo_proc_typ_nm");
		l.addStringColumn("ship_inst_typ_nm");
		l.addStringColumn("exim_xpns_typ_nm");
		l.addStringColumn("rqmt_typ_nm");
		l.addStringColumn("prod_pln_typ_nm");

		MAC_ITM_TYP.putNameNE(l, "itm_typ", "itm_typ_nm");
		MAC_STK_MNG_TYP.putNameNE(l, "stk_mng_typ", "stk_mng_typ_nm");
		MAC_ASSET_MNG_TYP.putNameNE(l, "asset_mng_typ", "asset_mng_typ_nm");
		MAC_RND_TYP.putNameNE(l, "rnd_typ", "rnd_typ_nm");
		MAC_LOT_MNG_TYP.putNameNE(l, "lot_mng_typ", "lot_mng_typ_nm");
		MAC_LOT_NO_TYP.putNameNE(l, "lot_no_typ", "lot_no_typ_nm");
		MAC_SUBLOT_MNG_TYP.putNameNE(l, "sublot_mng_typ", "sublot_mng_typ_nm");
		MAC_LOT_NO_TYP.putNameNE(l, "sublot_no_typ", "sublot_no_typ_nm");
		MAC_INSP_BIND_TYP.putNameNE(l, "insp_bind_typ", "insp_bind_typ_nm");
		MAC_RND_TYP.putNameNE(l, "cont_fctr_rnd_typ", "cont_fctr_rnd_typ_nm");
		MAC_SNO_MNG_TYP.putNameNE(l, "sno1_mng_typ", "sno1_mng_typ_nm");
		MAC_SNO_NO_TYP.putNameNE(l, "sno1_num_typ", "sno1_num_typ_nm");
		MAC_SNO_MNG_TYP.putNameNE(l, "sno2_mng_typ", "sno2_mng_typ_nm");
		MAC_SNO_NO_TYP.putNameNE(l, "sno2_num_typ", "sno2_num_typ_nm");
		MAC_SNO_MNG_TYP.putNameNE(l, "sno3_mng_typ", "sno3_mng_typ_nm");
		MAC_SNO_NO_TYP.putNameNE(l, "sno3_num_typ", "sno3_num_typ_nm");
		MAC_SNO_MNG_TYP.putNameNE(l, "sno4_mng_typ", "sno4_mng_typ_nm");
		MAC_SNO_NO_TYP.putNameNE(l, "sno4_num_typ", "sno4_num_typ_nm");
		MAC_MFG_INST_UNIT_TYP.putNameNE(l, "mfg_inst_unit_typ", "mfg_inst_unit_typ_nm");
		MAC_MRP_PROC_TYP.putNameNE(l, "mrp_proc_typ", "mrp_proc_typ_nm");
		MAC_COMP_SPEC_TYP.putNameNE(l, "comp_spec_typ", "comp_spec_typ_nm");
		MAC_SLO_PROC_TYP.putNameNE(l, "slo_proc_typ", "slo_proc_typ_nm");
		MAC_SHIP_INST_TYP.putNameNE(l, "ship_inst_typ", "ship_inst_typ_nm");
		MAC_EXIM_XPNS_TYP.putNameNE(l, "exim_xpns_typ", "exim_xpns_typ_nm");
		MAC_RQMT_TYP.putNameNE(l, "rqmt_typ", "rqmt_typ_nm");
		MAC_PROD_PLN_TYP.putNameNE(l, "prod_pln_typ", "prod_pln_typ_nm");
	}
	// ///////////////////////////////////////////////
	// 品目関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 取引先関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 取引先関連で設定する、取引先分類に関するSELECT句とJOIN句を追加する<p>
	 *
	 * @param row 検索条件
	 * @param builder クエリAPIビルダー
	 */
	protected void setSelectJoinOfBpGrpForBp(MCRow row, MCQueryApiBuilder builder) {
		if (row.getBooleanNE("bp_grp_flg1")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP1,"1", builder);
		}
		if (row.getBooleanNE("bp_grp_flg2")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP2,"2", builder);
		}
		if (row.getBooleanNE("bp_grp_flg3")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP3,"3", builder);
		}
		if (row.getBooleanNE("bp_grp_flg4")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP4,"4", builder);
		}
		if (row.getBooleanNE("bp_grp_flg5")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP5,"5", builder);
		}
		if (row.getBooleanNE("bp_grp_flg6")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP6,"6", builder);
		}
		if (row.getBooleanNE("bp_grp_flg7")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP7,"7", builder);
		}
		if (row.getBooleanNE("bp_grp_flg8")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP8,"8", builder);
		}
		if (row.getBooleanNE("bp_grp_flg9")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP9,"9", builder);
		}
		if (row.getBooleanNE("bp_grp_flg10")) {
			addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP.GRP10,"10", builder);
		}
	}

	/**
	 * 取引先分類名を検索するための設定をします。
	 * @param grp 品目分類
	 * @param num　分類番号
	 * @param builder クエリAPIビルダー
	 */
	protected void addOuterJoinBpGrpAndSelectNm(MAC_BP_GRP_TYP grp, String num, MCQueryApiBuilder builder) {
		MAM_BP_GRP_R view = MAM_BP_GRP_R.create(grp.key());
		MCDBContainer d = builder.getBaseDbc();
		builder.addLeftOuterJoin(view, 
				MCQueryApiBuilder.makeEq(view.bp_grp_cd, d.getColumn$("bp_grp_cd" + num))
				.and(view.bp_grp_typ.eq(value( grp.value()))));
		builder.addSelect(view.bp_grp_nm.as("bp_grp_nm" + num));
	}
	
	/**
	 * in項目にセットされた取引先関連のフラグに応じて、Where句を追加する。
	 * @param row 検索条件
	 * @param builder クエリAPIビルダー
	 */
	protected void addWhereByBpFlg(MCRow row, MCQueryApiBuilder builder) {
		// コンボだったら実行しない（入力補助からしか渡されない条件項目があるかどうかで判定）
		if (!row.contains(BpCols.$i_cst_flg)) {
			return;
		}
		MCDBContainer d = builder.getBaseDbc();
		MCPredicate p1 = value(0).eq(value(1));
		if (row.getBooleanNE(BpCols.$i_cst_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("cst_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_acst_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("acst_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_bcst_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("bcst_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_rcst_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("rcst_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_dlv_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("dlv_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_dest_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("dest_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_cred_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("cred_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_sppl_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("sppl_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_asppl_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("asppl_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_bsppl_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("bsppl_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_psppl_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("psppl_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_maker_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("maker_flg"), true));
		}
		if (row.getBooleanNE(BpCols.$i_tdlv_flg)) {
			p1 = p1.or(makeEqVal(d.getColumn$("tdlv_flg"), true));
		}
		
		builder.addWhereWithAnd(p1);

	}
	// ///////////////////////////////////////////////
	// 取引先関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// 部門関連（ここから）
	// ///////////////////////////////////////////////
	/**
	 * <p>部門情報を絞り込むための日付を取得する。</P>
	 * <p>
	 * ・適用日が未指定の場合かつ、運用日付ＦＬＧがtrueの場合は運用日付を返す<br>
	 * ・適用日が未指定の場合かつ、運用日付ＦＬＧがfalseまたは未指定の場合はnullを返す<br>
     * ・適用日が指定されている場合は、運用日付ＦＬＧを常に無視して、適用日の値を返す(値がnullならnull)<br>
	 * </p>
	 *
	 * @param row 検索条件
	 * @param dtColNm in項目に定義されている適用日のカラム名
	 * @param modeTodayFlgColNm in項目に定義されている運用日付使用ＦＬＧのカラム名
	 * @return
	 */
	protected MCDate getDtForDpt(MCRow row) {
		MCDate dt = null;
		if (row.contains("dt")) {
			dt = row.getDate("dt");
		}
		else if (row.getBooleanNE("mode_today_flg")) {
			dt = getToday();
		}
		return dt;
	}
	
	/**
	 * <p>部門情報を絞り込むための日付を取得する。(会計ＩＦ用)</P>
	 * <p>
	 * ・適用日が未指定の場合かつ、運用日付ＦＬＧがtrueの場合は運用日付を返す<br>
	 * ・適用日が未指定の場合かつ、運用日付ＦＬＧがfalseまたは未指定の場合はnullを返す<br>
     * ・適用日が指定されている場合は、運用日付ＦＬＧを常に無視して、適用日の値を返す(値がnullならnull)<br>
	 * </p>
	 *
	 * @param row 検索条件
	 * @param dtColNm in項目に定義されている適用日のカラム名
	 * @param modeTodayFlgColNm in項目に定義されている運用日付使用ＦＬＧのカラム名
	 * @return
	 */
	protected MCDate getDtForAcDpt(MCRow row) {
		MCDate dt = null;
		if (row.contains("dt") && !isNull(row.getDateNE("dt"))) {
			dt = row.getDate("dt");
		}
		else if (row.getBooleanNE("mode_today_flg")) {
			dt = getToday();
		}
		return dt;
	}
	
	/**
	 * <p>部門情報を絞り込むための年月を取得する。(原価用)</P>
	 * <p>
	 * ・適用年月が未指定の場合かつ、運用日付ＦＬＧがtrueの場合は運用年月を返す<br>
	 * ・適用年月が未指定の場合かつ、運用日付ＦＬＧがfalseまたは未指定の場合はnullを返す<br>
     * ・適用年月が指定されている場合は、運用日付ＦＬＧを常に無視して、適用日の値を返す(値がnullならnull)<br>
	 * </p>
	 */
	protected MCDate getYmForDpt(MCRow row) {
		MCDate dt = null;
		if (row.contains("ym") && !isNull(row.getDateNE("ym"))) {
			dt = row.getDate("ym");
		}
		// ログイン情報設定時（期）の対応
		else if (row.contains("_this_term") && !isNull(row.getDateNE("_this_term"))) {
			dt = row.getDate("_this_term");
		}
		else if (row.getBooleanNE("mode_this_month_flg")) {
			dt = getToday().trunc(MCDateFieldType.MONTH);
		}
		return dt;
	}
	
	// ///////////////////////////////////////////////
	// 部門関連（ここまで）
	// ///////////////////////////////////////////////

	// ///////////////////////////////////////////////
	// その他（ここから）
	// ///////////////////////////////////////////////
	/**
	 * 予備科目区分に応じた科目区分取得のためのselect文を設定します。<p>
	 * 取得した結果のカラム名は引数で指定したカラム名の配列になります。<p>
	 * @param row 検索条件
	 * @param typ 予備科目区分
	 * @param cols ~カラム名の配列
	 * @param builder クエリAPIビルダー
	 */
	protected void setAcTyp_SubTyp(MCRow row, MAC_AC_SUBTYP typ, String[] cols, MCQueryApiBuilder builder) {
		MCDBContainer d = builder.getBaseDbc();
		builder.setSelect(getStringCol(d, "ac_typ").as(cols[0]));
		builder.addSelect(getStringCol(d, "ac_typ_nm").as(cols[1]));
		
		builder.addWhereWithCutOffAnd(
				MCQueryApiBuilder.makeEq(d.getColumn$("ac_typ"), bind("1")), row.getStringNE($INPUT_VAL));
		builder.addWhereWithAnd(
				MCQueryApiBuilder.makeEq(d.getColumn$("ac_subtyp"), bind("1")), typ.value());
	}

	/**
	 * 存在チェックかどうかチェックします。
	 *
	 * @return 存在チェックの場合true
	 */
	protected boolean isSrvChk(MCRow row) {
		return row.contains($LIST_LOGIC_VAL);
	}

	protected boolean isInput(MCRow row) {
		return row.contains($INPUT_VAL) || row.contains($INPUT_REQ_PLURAL_VAL);
	}

	protected boolean isCombo(MCRow row) {
		return row.contains($COMBO_MODE);
	}

	protected boolean hasDt(MCRow row, String dtCol) {
		return row.contains(dtCol) || row.contains(getLLBindNm(dtCol));
	}

	/**
	 * <p>原価の各情報を絞り込むための年月を取得する。</P>
	 * <p>
	 * ・適用期が未指定の場合かつ、運用期ＦＬＧがtrueの場合は運用年月を返す<br>
	 * ・適用期が未指定の場合かつ、運用期ＦＬＧがfalseまたは未指定の場合はnullを返す<br>
     * ・適用期が指定されている場合は、運用日付ＦＬＧを常に無視して、適用日の値を返す(値がnullならnull)<br>
	 * </p>
	 */
	protected MCDate getTermForDpt(MCRow row) {
		MCDate dt = null;
		if (row.contains("term")) {
			dt = row.getDate("term");
		}
		else if (row.getBooleanNE("mode_this_term_flg")) {
			dt = getToday().trunc(MCDateFieldType.MONTH);
		}
		return dt;
	}

	/**
	 * 項目をMCStringPermColumnを返します。
	 * @param d DBコンテナ
	 * @param col 項目名
	 * @return
	 */
	protected MCStringPermColumn getStringCol(MCDBContainer d, String col) {
		return (MCStringPermColumn)d.getColumn$(col);
	}
	
	/**
	 * MCQueryApiBuilder.makeEq　の結果（MCPredicate）を返します。
	 * @param c カラム
	 * @param val 値
	 * @return MCPredicate. val が nullの場合はnull
	 */
	protected MCPredicate makeEqVal(MCPermColumn c, Comparable<?> val) {
		if (isNull(val)) {
			return null;
		}
		return (MCQueryApiBuilder.makeEq(c, value(val)));
	}
	
	/**
	 * MCQueryApiBuilder.makeNeq　の結果（MCPredicate）を返します。
	 * @param c カラム
	 * @param val 値
	 * @return MCPredicate. val が nullの場合はnull
	 */
	protected MCPredicate makeNeqVal(MCPermColumn c, Comparable<?> val) {
		if (isNull(val)) {
			return null;
		}
		return (MCQueryApiBuilder.makeNeq(c, value(val)));
	}
	/**
	 * ＤＢコンテナを生成します。
	 * 
	 * @param tbl ＤＢコンテナを生成する対象のテーブル名
	 * @return ＤＢコンテナ
	 */
	protected MCDBContainer createDbc(String tbl) {
		String classNm = MCFactory.createClassName("mcframe", "server" + tbl.substring(0, 2), "dbc", tbl + "_R");
		Class<? extends MCDBContainer> clazz = MCFactory.getClass(MCDBContainer.class, classNm);
		return createDbc(clazz);
	}
	/**
	 * ＤＢコンテナを生成します。
	 * 
	 * @param clazz ＤＢコンテナクラス
	 * @return ＤＢコンテナ
	 */
	protected <T extends MCDBContainer> T createDbc(Class<T> clazz) {
		return clazz.cast(MCFactory.invokeStatic(clazz, "create", new Class<?>[] {String.class}, new Object[] {"T"}));
	}
	/**
	 * ＤＢコンテナキャッシュをまとめて管理するクラスです
	 * <P>
	 * ＤＢコンテナキャッシュでは、テーブル名ごとにキャッシュを管理します。<br>
	 * テーブル名には、品目マスタの場合は「MAM_ITM」を設定します。<br>
	 * また、テーブル名には「MAM_ITM#xx」のように「#」を付与して別名を指定することもできます。<br>
	 * マスタテーブルに対する結合テーブルが異なる場合など、テーブルに対してキャッシュを複数扱う場合には別名を指定してください。
	 */
	public class DbcCacheMap {
		protected HashMap<String, FXUCL_Cache<?>> _cacheMap = new HashMap<>();
		public void set(String tbl, String col, MCList<?> bindL, String... bindCols) {
			MCDBContainer dbc = createDbc(tbl);
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			builder.setSelect(dbc.getColumn$(col));
			set(tbl, builder, bindL, bindCols);
		}
		@SuppressWarnings({	"unchecked", "rawtypes"})
		public void set(String tbl,MCQueryApiBuilder builder, MCList<?> bindL, String... bindCols) {
			FXUCL_Cache cache = _cacheMap.get(tbl);
			if (cache == null) {
				cache = new FXUCL_MCDbcCache(builder, bindL, bindCols);
			}
			else {
				// 既にキャッシュが存在する場合、キャッシュ内にないレコードのみ取得する
				MCList<?> list = bindL.createInstance();
				for (MCRow r : bindL) {
					Comparable[] keyVals = r.toArray(bindCols);
					if (!isNullOr(keyVals) && cache.getCache(keyVals) == null) {
						MCRow.copyvalue(list.add(), r);
					}
				}
				if (!list.isEmpty()) {
					FXUCL_Cache c = new FXUCL_MCDbcCache(builder, list, bindCols);
					for (MCRow r : list) {
						Comparable[] keyVals = r.toArray(bindCols);
						cache.putCache(keyVals, c.getCache(keyVals));
					}
				}
			}
			set(tbl, cache);
		}

		public void set(String tbl, FXUCL_Cache<?> cache) {
			_cacheMap.put(tbl, cache);
		}
		public <T extends MCDBContainer> T get(Class<T> rowc, Comparable<?>... in) {
			return get(rowc, null, in);
		}
		public <T extends MCDBContainer> T get(String tbl, Class<T> rowc, Comparable<?>... in) {
			return get(tbl, rowc, null, in);
		}
		public <T extends MCDBContainer> T get(Class<T> rowc, MCDate dt, Comparable<?>... in) {
			String tbl = rowc.getSimpleName().replaceAll("_R$", "");
			return get(tbl, rowc, dt, in);
		}
		public <T extends MCDBContainer> T get(String tbl, Class<T> rowc, MCDate dt, Comparable<?>... in) {
			if (!isNullOr(in)) {
				MCRow r = null;
				Object o = _cacheMap.get(tbl);
				if (!isNull(dt) && o instanceof FXUCL_MCDbcCacheStEnd) {
					r = ((FXUCL_MCDbcCacheStEnd<?>)o).get(dt, in);
				}
				else if (o instanceof FXUCL_MCDbcCache) {
					r = ((FXUCL_MCDbcCache<?>)o).get(in);
				}
				if (!isNull(r)) {
					return MCDataType.cast(rowc, r);
				}
			}
			return createDbc(rowc);
		}
	}

	// ///////////////////////////////////////////////
	// その他（ここまで）
	// ///////////////////////////////////////////////

	//FMCB CUSTOM END
}