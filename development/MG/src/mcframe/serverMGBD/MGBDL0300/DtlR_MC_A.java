package mcframe.serverMGBD.MGBDL0300;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public static final String $tab_ctg_typ = "tab_ctg_typ";
	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public static final String $cost_copy_typ_key = "cost_copy_typ_key";
	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public static final String $cnt_fr = "cnt_fr";
	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public static final String $cnt_to = "cnt_to";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";


	public static final MCMeta tab_ctg_typ_META = createCommonMeta($tab_ctg_typ, mcframe.commonMG.meta.MG_META.TAB_CTG_TYP);
	public static final MCMeta cost_copy_typ_key_META = createStringMeta($cost_copy_typ_key);
	public static final MCMeta cnt_fr_META = createCommonMeta($cnt_fr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta cnt_to_META = createCommonMeta($cnt_to, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			tab_ctg_typ_META,
			cost_copy_typ_key_META,
			cnt_fr_META,
			cnt_to_META,
			wg_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$tab_ctg_typ, "MGC_TAB_CTG_TYP"}	// tab_ctg_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public String tab_ctg_typ() {
		return getConstString(offset + 0, $tab_ctg_typ);
	}

	/**
	 * Table category type テーブルカテゴリ区分.<p>
	 *
	 */
	public void tab_ctg_typ(String value) {
		setConstString(offset + 0, $tab_ctg_typ, value);
	}


	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public String cost_copy_typ_key() {
		return getConstString(offset + 1, $cost_copy_typ_key);
	}

	/**
	 * Cost to copy type key 原価コピー対象区分キー.<p>
	 *
	 */
	public void cost_copy_typ_key(String value) {
		setConstString(offset + 1, $cost_copy_typ_key, value);
	}


	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public MCNumber cnt_fr() {
		return getConstNumber(offset + 2, $cnt_fr);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(MCNumber value) {
		setConstNumber(offset + 2, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(int value) {
		setConstNumber(offset + 2, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(long value) {
		setConstNumber(offset + 2, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(float value) {
		setConstNumber(offset + 2, $cnt_fr, value);
	}

	/**
	 * Number of records (Copy-from) コピー元件数.<p>
	 *
	 */
	public void cnt_fr(double value) {
		setConstNumber(offset + 2, $cnt_fr, value);
	}


	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public MCNumber cnt_to() {
		return getConstNumber(offset + 3, $cnt_to);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(MCNumber value) {
		setConstNumber(offset + 3, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(int value) {
		setConstNumber(offset + 3, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(long value) {
		setConstNumber(offset + 3, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(float value) {
		setConstNumber(offset + 3, $cnt_to, value);
	}

	/**
	 * Number of records (Copy-to) コピー先件数.<p>
	 *
	 */
	public void cnt_to(double value) {
		setConstNumber(offset + 3, $cnt_to, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	public String getString(String name) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			return tab_ctg_typ();
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			return cost_copy_typ_key();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			return cnt_fr();
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			return cnt_to();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			return tab_ctg_typ();
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			return cost_copy_typ_key();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			return cnt_fr();
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			return cnt_to();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			tab_ctg_typ(value);
			return;
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			cost_copy_typ_key(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($tab_ctg_typ.equalsIgnoreCase(name)) {
			tab_ctg_typ(value);
			return;
		}
		if ($cost_copy_typ_key.equalsIgnoreCase(name)) {
			cost_copy_typ_key(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cnt_fr.equalsIgnoreCase(name)) {
			cnt_fr(value);
			return;
		}
		if ($cnt_to.equalsIgnoreCase(name)) {
			cnt_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

