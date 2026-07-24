package mcframe.serverMABC.MABCL0400;

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
 * ブロック"ItmRls_UpdChk02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmRls_UpdChk02_CndR_MC_A extends MCConstRow {

	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Date 対象日.<p>
	 *
	 */
	public static final String $tgt_dt = "tgt_dt";


	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta tgt_dt_META = createCommonMeta($tgt_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<ItmRls_UpdChk02_CndR> constMetas = new ConstMetaList<ItmRls_UpdChk02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_META,
			tgt_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$term, "E"}	// term
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$term, "MA.MAUAL0010.Term"}	// term
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	protected ItmRls_UpdChk02_CndR_MC_A(ConstMetaList<? extends ItmRls_UpdChk02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmRls_UpdChk02_CndR clone() {
		return (ItmRls_UpdChk02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmRls_UpdChk02_CndR createInstance() {
		return (ItmRls_UpdChk02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmRls_UpdChk02_CndR getValues(String... names) {
		return (ItmRls_UpdChk02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 0, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 0, $term, value);
	}


	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDate tgt_dt() {
		return getConstDate(offset + 1, $tgt_dt);
	}

	/**
	 * Date 対象日.<p>
	 *
	 */
	public void tgt_dt(MCDate value) {
		setConstDate(offset + 1, $tgt_dt, value);
	}


	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDate(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDateNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

