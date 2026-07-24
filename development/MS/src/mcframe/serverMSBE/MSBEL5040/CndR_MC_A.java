package mcframe.serverMSBE.MSBEL5040;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_flg = "stk_flg";
	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public static final String $short_ope_typ = "short_ope_typ";
	/**
	 * Lot suggestion type ロット提案区分.<p>
	 *
	 */
	public static final String $lot_prop_typ = "lot_prop_typ";
	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public static final String $except_alloc_wait_flg = "except_alloc_wait_flg";
	/**
	 * Name search flg. 名称検索ＦＬＧ.<p>
	 *
	 */
	public static final String $nm_srch_flg = "nm_srch_flg";
	/**
	 * Active ingredient calculation flg. 有効成分計算ＦＬＧ.<p>
	 *
	 */
	public static final String $cont_fctr_calc_flg = "cont_fctr_calc_flg";
	/**
	 * Details output flg. 詳細出力ＦＬＧ.<p>
	 *
	 */
	public static final String $dtl_flg = "dtl_flg";
	/**
	 * GI allocation check flg. 出庫引当確認フラグ.<p>
	 *
	 */
	public static final String $gi_alloc_flg = "gi_alloc_flg";
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";


	public static final MCMeta stk_flg_META = createCommonMeta($stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta short_ope_typ_META = createCommonMeta($short_ope_typ, mcframe.commonMS.meta.MS_META.SHORT_OPE_TYP);
	public static final MCMeta lot_prop_typ_META = createCommonMeta($lot_prop_typ, mcframe.commonMS.meta.MS_META.LOT_PROP_TYP);
	public static final MCMeta except_alloc_wait_flg_META = createCommonMeta($except_alloc_wait_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta nm_srch_flg_META = createCommonMeta($nm_srch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_calc_flg_META = createCommonMeta($cont_fctr_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_flg_META = createCommonMeta($dtl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_alloc_flg_META = createCommonMeta($gi_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			stk_flg_META,
			short_ope_typ_META,
			lot_prop_typ_META,
			except_alloc_wait_flg_META,
			nm_srch_flg_META,
			cont_fctr_calc_flg_META,
			dtl_flg_META,
			gi_alloc_flg_META,
			xfr_src_typ_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public boolean stk_flg() {
		return getConstBoolean(offset + 0, $stk_flg);
	}

	/**
	 * Inventory suggestion flg. 在庫提案ＦＬＧ.<p>
	 *
	 */
	public void stk_flg(boolean value) {
		setConstBoolean(offset + 0, $stk_flg, value);
	}


	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public String short_ope_typ() {
		return getConstString(offset + 1, $short_ope_typ);
	}

	/**
	 * Process type at shortage 不足時処理区分.<p>
	 *
	 */
	public void short_ope_typ(String value) {
		setConstString(offset + 1, $short_ope_typ, value);
	}


	/**
	 * Lot suggestion type ロット提案区分.<p>
	 *
	 */
	public String lot_prop_typ() {
		return getConstString(offset + 2, $lot_prop_typ);
	}

	/**
	 * Lot suggestion type ロット提案区分.<p>
	 *
	 */
	public void lot_prop_typ(String value) {
		setConstString(offset + 2, $lot_prop_typ, value);
	}


	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public boolean except_alloc_wait_flg() {
		return getConstBoolean(offset + 3, $except_alloc_wait_flg);
	}

	/**
	 * Allocation pending exclusion flg. 引当保留除外ＦＬＧ.<p>
	 *
	 */
	public void except_alloc_wait_flg(boolean value) {
		setConstBoolean(offset + 3, $except_alloc_wait_flg, value);
	}


	/**
	 * Name search flg. 名称検索ＦＬＧ.<p>
	 *
	 */
	public boolean nm_srch_flg() {
		return getConstBoolean(offset + 4, $nm_srch_flg);
	}

	/**
	 * Name search flg. 名称検索ＦＬＧ.<p>
	 *
	 */
	public void nm_srch_flg(boolean value) {
		setConstBoolean(offset + 4, $nm_srch_flg, value);
	}


	/**
	 * Active ingredient calculation flg. 有効成分計算ＦＬＧ.<p>
	 *
	 */
	public boolean cont_fctr_calc_flg() {
		return getConstBoolean(offset + 5, $cont_fctr_calc_flg);
	}

	/**
	 * Active ingredient calculation flg. 有効成分計算ＦＬＧ.<p>
	 *
	 */
	public void cont_fctr_calc_flg(boolean value) {
		setConstBoolean(offset + 5, $cont_fctr_calc_flg, value);
	}


	/**
	 * Details output flg. 詳細出力ＦＬＧ.<p>
	 *
	 */
	public boolean dtl_flg() {
		return getConstBoolean(offset + 6, $dtl_flg);
	}

	/**
	 * Details output flg. 詳細出力ＦＬＧ.<p>
	 *
	 */
	public void dtl_flg(boolean value) {
		setConstBoolean(offset + 6, $dtl_flg, value);
	}


	/**
	 * GI allocation check flg. 出庫引当確認フラグ.<p>
	 *
	 */
	public boolean gi_alloc_flg() {
		return getConstBoolean(offset + 7, $gi_alloc_flg);
	}

	/**
	 * GI allocation check flg. 出庫引当確認フラグ.<p>
	 *
	 */
	public void gi_alloc_flg(boolean value) {
		setConstBoolean(offset + 7, $gi_alloc_flg, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 8, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 8, $xfr_src_typ, value);
	}


	public String getString(String name) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			return short_ope_typ();
		}
		if ($lot_prop_typ.equalsIgnoreCase(name)) {
			return lot_prop_typ();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($nm_srch_flg.equalsIgnoreCase(name)) {
			return nm_srch_flg();
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			return cont_fctr_calc_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			return short_ope_typ();
		}
		if ($lot_prop_typ.equalsIgnoreCase(name)) {
			return lot_prop_typ();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			return stk_flg();
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			return except_alloc_wait_flg();
		}
		if ($nm_srch_flg.equalsIgnoreCase(name)) {
			return nm_srch_flg();
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			return cont_fctr_calc_flg();
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			return dtl_flg();
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			return gi_alloc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			short_ope_typ(value);
			return;
		}
		if ($lot_prop_typ.equalsIgnoreCase(name)) {
			lot_prop_typ(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($nm_srch_flg.equalsIgnoreCase(name)) {
			nm_srch_flg(value);
			return;
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			cont_fctr_calc_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($short_ope_typ.equalsIgnoreCase(name)) {
			short_ope_typ(value);
			return;
		}
		if ($lot_prop_typ.equalsIgnoreCase(name)) {
			lot_prop_typ(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($stk_flg.equalsIgnoreCase(name)) {
			stk_flg(value);
			return;
		}
		if ($except_alloc_wait_flg.equalsIgnoreCase(name)) {
			except_alloc_wait_flg(value);
			return;
		}
		if ($nm_srch_flg.equalsIgnoreCase(name)) {
			nm_srch_flg(value);
			return;
		}
		if ($cont_fctr_calc_flg.equalsIgnoreCase(name)) {
			cont_fctr_calc_flg(value);
			return;
		}
		if ($dtl_flg.equalsIgnoreCase(name)) {
			dtl_flg(value);
			return;
		}
		if ($gi_alloc_flg.equalsIgnoreCase(name)) {
			gi_alloc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

