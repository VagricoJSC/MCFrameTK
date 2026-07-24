package mcframe.serverMABC.MABCL1060;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Journal pattern 仕訳パタン.<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public static final String $jnl_ptn_nm = "jnl_ptn_nm";
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public static final String $jnl_seq = "jnl_seq";


	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta jnl_ptn_nm_META = createCommonMeta($jnl_ptn_nm, mcframe.commonMA.meta.MA_META.JNL_PTN_NM);
	public static final MCMeta jnl_seq_META = createCommonMeta($jnl_seq, mcframe.commonMA.meta.MA_META.INT4);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			jnl_ptn_cd_META,
			jnl_ptn_nm_META,
			jnl_seq_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Journal pattern 仕訳パタン.<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 0, $jnl_ptn_cd);
	}

	/**
	 * Journal pattern 仕訳パタン.<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 0, $jnl_ptn_cd, value);
	}


	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public String jnl_ptn_nm() {
		return getConstString(offset + 1, $jnl_ptn_nm);
	}

	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public void jnl_ptn_nm(String value) {
		setConstString(offset + 1, $jnl_ptn_nm, value);
	}


	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCNumber jnl_seq() {
		return getConstNumber(offset + 2, $jnl_seq);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(MCNumber value) {
		setConstNumber(offset + 2, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(int value) {
		setConstNumber(offset + 2, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(long value) {
		setConstNumber(offset + 2, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(float value) {
		setConstNumber(offset + 2, $jnl_seq, value);
	}

	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public void jnl_seq(double value) {
		setConstNumber(offset + 2, $jnl_seq, value);
	}


	public String getString(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			return jnl_ptn_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		if ($jnl_ptn_nm.equalsIgnoreCase(name)) {
			jnl_ptn_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

