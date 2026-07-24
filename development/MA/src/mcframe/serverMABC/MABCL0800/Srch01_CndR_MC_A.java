package mcframe.serverMABC.MABCL0800;

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
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public static final String $num_ptn_cd = "num_ptn_cd";
	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public static final String $num_ptn_nm = "num_ptn_nm";
	/**
	 * Key element キー要素.<p>
	 *
	 */
	public static final String $key_elm = "key_elm";
	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public static final String $seq_typ = "seq_typ";
	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public static final String $ora_seq_nm = "ora_seq_nm";
	/**
	 * Without numbering pattern master 発番パタンマスタなし.<p>
	 *
	 */
	public static final String $non_num_ptn = "non_num_ptn";


	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta num_ptn_nm_META = createCommonMeta($num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta key_elm_META = createCommonMeta($key_elm, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta seq_typ_META = createCommonMeta($seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta ora_seq_nm_META = createCommonMeta($ora_seq_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta non_num_ptn_META = createCommonMeta($non_num_ptn, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_ptn_cd_META,
			num_ptn_nm_META,
			key_elm_META,
			seq_typ_META,
			ora_seq_nm_META,
			non_num_ptn_META
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
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public String num_biz_typ() {
		return getConstString(offset + 0, $num_biz_typ);
	}

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public void num_biz_typ(String value) {
		setConstString(offset + 0, $num_biz_typ, value);
	}


	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 1, $num_ptn_cd);
	}

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 1, $num_ptn_cd, value);
	}


	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public String num_ptn_nm() {
		return getConstString(offset + 2, $num_ptn_nm);
	}

	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public void num_ptn_nm(String value) {
		setConstString(offset + 2, $num_ptn_nm, value);
	}


	/**
	 * Key element キー要素.<p>
	 *
	 */
	public String key_elm() {
		return getConstString(offset + 3, $key_elm);
	}

	/**
	 * Key element キー要素.<p>
	 *
	 */
	public void key_elm(String value) {
		setConstString(offset + 3, $key_elm, value);
	}


	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public String seq_typ() {
		return getConstString(offset + 4, $seq_typ);
	}

	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public void seq_typ(String value) {
		setConstString(offset + 4, $seq_typ, value);
	}


	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public String ora_seq_nm() {
		return getConstString(offset + 5, $ora_seq_nm);
	}

	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public void ora_seq_nm(String value) {
		setConstString(offset + 5, $ora_seq_nm, value);
	}


	/**
	 * Without numbering pattern master 発番パタンマスタなし.<p>
	 *
	 */
	public boolean non_num_ptn() {
		return getConstBoolean(offset + 6, $non_num_ptn);
	}

	/**
	 * Without numbering pattern master 発番パタンマスタなし.<p>
	 *
	 */
	public void non_num_ptn(boolean value) {
		setConstBoolean(offset + 6, $non_num_ptn, value);
	}


	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			return seq_typ();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($non_num_ptn.equalsIgnoreCase(name)) {
			return non_num_ptn();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			return num_ptn_nm();
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			return key_elm();
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			return seq_typ();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($non_num_ptn.equalsIgnoreCase(name)) {
			return non_num_ptn();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			seq_typ(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($non_num_ptn.equalsIgnoreCase(name)) {
			non_num_ptn(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			num_ptn_cd(value);
			return;
		}
		if ($num_ptn_nm.equalsIgnoreCase(name)) {
			num_ptn_nm(value);
			return;
		}
		if ($key_elm.equalsIgnoreCase(name)) {
			key_elm(value);
			return;
		}
		if ($seq_typ.equalsIgnoreCase(name)) {
			seq_typ(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($non_num_ptn.equalsIgnoreCase(name)) {
			non_num_ptn(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

