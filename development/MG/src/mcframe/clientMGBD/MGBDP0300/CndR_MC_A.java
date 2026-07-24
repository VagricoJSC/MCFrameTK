package mcframe.clientMGBD.MGBDP0300;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
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
	 * CALC_CTG,Copy to other calculation category,tgt_ctg;TERM,Copy to other term,tgt_term;PLN,Copy plan,trg_pln;ACT,Copy result,tgt_act CALC_CTG,別の計算カテゴリにコピーする,tgt_ctg;TERM,別の期にコピーする,tgt_term;PLN,計画をコピーする,trg_pln;ACT,実績をコピーする,tgt_act.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public static final String $tab_ctg_typ = "tab_ctg_typ";
	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public static final String $tab_ctg_typ_nm = "tab_ctg_typ_nm";
	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public static final String $cost_copy_typ = "cost_copy_typ";
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public static final String $cost_copy_typ_nm = "cost_copy_typ_nm";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta tab_ctg_typ_META = createCommonMeta($tab_ctg_typ, mcframe.commonMG.meta.MG_META.TAB_CTG_TYP);
	public static final MCMeta tab_ctg_typ_nm_META = createCommonMeta($tab_ctg_typ_nm, mcframe.commonMG.meta.MG_META.TAB_CTG_TYP_NM);
	public static final MCMeta cost_copy_typ_META = createCommonMeta($cost_copy_typ, mcframe.commonMG.meta.MG_META.COST_COPY_TYP);
	public static final MCMeta cost_copy_typ_nm_META = createCommonMeta($cost_copy_typ_nm, mcframe.commonMG.meta.MG_META.COST_COPY_TYP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			tab_ctg_typ_META,
			tab_ctg_typ_nm_META,
			cost_copy_typ_META,
			cost_copy_typ_nm_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$tab_ctg_typ, "tab_ctg_typ_nm"},	// tab_ctg_typ
				{$cost_copy_typ, "cost_copy_typ_nm"}	// cost_copy_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cost_copy_typ, "tab_ctg_typ"}	// cost_copy_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cost_copy_typ, "tab_ctg_typ"}	// cost_copy_typ
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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



	/**
	 * CALC_CTG,Copy to other calculation category,tgt_ctg;TERM,Copy to other term,tgt_term;PLN,Copy plan,trg_pln;ACT,Copy result,tgt_act CALC_CTG,別の計算カテゴリにコピーする,tgt_ctg;TERM,別の期にコピーする,tgt_term;PLN,計画をコピーする,trg_pln;ACT,実績をコピーする,tgt_act.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * CALC_CTG,Copy to other calculation category,tgt_ctg;TERM,Copy to other term,tgt_term;PLN,Copy plan,trg_pln;ACT,Copy result,tgt_act CALC_CTG,別の計算カテゴリにコピーする,tgt_ctg;TERM,別の期にコピーする,tgt_term;PLN,計画をコピーする,trg_pln;ACT,実績をコピーする,tgt_act.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public String tab_ctg_typ() {
		return getConstString(offset + 1, $tab_ctg_typ);
	}

	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public void tab_ctg_typ(String value) {
		setConstString(offset + 1, $tab_ctg_typ, value);
	}


	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public String tab_ctg_typ_nm() {
		return getConstString(offset + 2, $tab_ctg_typ_nm);
	}

	/**
	 * Table category type name テーブルカテゴリ区分名.<p>
	 *
	 */
	public void tab_ctg_typ_nm(String value) {
		setConstString(offset + 2, $tab_ctg_typ_nm, value);
	}


	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public String cost_copy_typ() {
		return getConstString(offset + 3, $cost_copy_typ);
	}

	/**
	 * Table name テーブル名.<p>
	 *
	 */
	public void cost_copy_typ(String value) {
		setConstString(offset + 3, $cost_copy_typ, value);
	}


	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public String cost_copy_typ_nm() {
		return getConstString(offset + 4, $cost_copy_typ_nm);
	}

	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public void cost_copy_typ_nm(String value) {
		setConstString(offset + 4, $cost_copy_typ_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			return tab_ctg_typ();
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			return tab_ctg_typ_nm();
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			return cost_copy_typ();
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			return cost_copy_typ_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			return tab_ctg_typ();
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			return tab_ctg_typ_nm();
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			return cost_copy_typ();
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			return cost_copy_typ_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			tab_ctg_typ(value);
			return;
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			tab_ctg_typ_nm(value);
			return;
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			cost_copy_typ(value);
			return;
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			cost_copy_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			tab_ctg_typ(value);
			return;
		}
		if ($tab_ctg_typ_nm.equalsIgnoreCase(name)) {
			tab_ctg_typ_nm(value);
			return;
		}
		if ($cost_copy_typ.equalsIgnoreCase(name)) {
			cost_copy_typ(value);
			return;
		}
		if ($cost_copy_typ_nm.equalsIgnoreCase(name)) {
			cost_copy_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

