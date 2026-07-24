package mcframe.clientMABC.MABCP0800;

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
 * ブロック"Row"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RowR_MC_A extends MCConstRow {

	/**
	 * Numbering operation type 発番業務区分.<p>
	 *
	 */
	public static final String $num_biz_typ = "num_biz_typ";
	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public static final String $num_biz_typ_nm = "num_biz_typ_nm";
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
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public static final String $seq_typ_nm = "seq_typ_nm";
	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public static final String $ora_seq_nm = "ora_seq_nm";
	/**
	 * Update number 番号更新.<p>
	 *
	 */
	public static final String $num_upd_flg = "num_upd_flg";
	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public static final String $min_val = "min_val";
	/**
	 * Current value 現在値.<p>
	 *
	 */
	public static final String $last_val = "last_val";
	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public static final String $max_val = "max_val";
	/**
	 * Increment 増加量.<p>
	 *
	 */
	public static final String $increment_by = "increment_by";
	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public static final String $cycl_flg = "cycl_flg";


	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_biz_typ_nm_META = createCommonMeta($num_biz_typ_nm, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP_NM);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta num_ptn_nm_META = createCommonMeta($num_ptn_nm, mcframe.commonMA.meta.MA_META.NUM_PTN_NM);
	public static final MCMeta key_elm_META = createCommonMeta($key_elm, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta seq_typ_META = createCommonMeta($seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta seq_typ_nm_META = createCommonMeta($seq_typ_nm, mcframe.commonMA.meta.MA_META.SEQ_TYP_NM);
	public static final MCMeta ora_seq_nm_META = createCommonMeta($ora_seq_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta num_upd_flg_META = createCommonMeta($num_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta min_val_META = createCommonMeta($min_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta last_val_META = createCommonMeta($last_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta max_val_META = createCommonMeta($max_val, mcframe.commonMA.meta.MA_META.NUM_SEQ);
	public static final MCMeta increment_by_META = createCommonMeta($increment_by, mcframe.commonMA.meta.MA_META.NUM_INC);
	public static final MCMeta cycl_flg_META = createCommonMeta($cycl_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RowR> constMetas = new ConstMetaList<RowR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_biz_typ_nm_META,
			num_ptn_cd_META,
			num_ptn_nm_META,
			key_elm_META,
			seq_typ_META,
			seq_typ_nm_META,
			ora_seq_nm_META,
			num_upd_flg_META,
			min_val_META,
			last_val_META,
			max_val_META,
			increment_by_META,
			cycl_flg_META
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
			$num_biz_typ,	// num_biz_typ
			$num_ptn_cd,	// num_ptn_cd
			$key_elm	// key_elm
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$num_ptn_cd, "num_biz_typ"}	// num_ptn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$num_ptn_cd, "num_biz_typ"}	// num_ptn_cd
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
	protected RowR_MC_A(ConstMetaList<? extends RowR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR clone() {
		return (RowR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR createInstance() {
		return (RowR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RowR getValues(String... names) {
		return (RowR) super.getValues(names);
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
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public String num_biz_typ_nm() {
		return getConstString(offset + 1, $num_biz_typ_nm);
	}

	/**
	 * Numbering operation type name 発番業務区分名.<p>
	 *
	 */
	public void num_biz_typ_nm(String value) {
		setConstString(offset + 1, $num_biz_typ_nm, value);
	}


	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public String num_ptn_cd() {
		return getConstString(offset + 2, $num_ptn_cd);
	}

	/**
	 * Numbering pattern cd. 発番パタンＣＤ.<p>
	 *
	 */
	public void num_ptn_cd(String value) {
		setConstString(offset + 2, $num_ptn_cd, value);
	}


	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public String num_ptn_nm() {
		return getConstString(offset + 3, $num_ptn_nm);
	}

	/**
	 * Numbering pattern name 発番パタン名.<p>
	 *
	 */
	public void num_ptn_nm(String value) {
		setConstString(offset + 3, $num_ptn_nm, value);
	}


	/**
	 * Key element キー要素.<p>
	 *
	 */
	public String key_elm() {
		return getConstString(offset + 4, $key_elm);
	}

	/**
	 * Key element キー要素.<p>
	 *
	 */
	public void key_elm(String value) {
		setConstString(offset + 4, $key_elm, value);
	}


	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public String seq_typ() {
		return getConstString(offset + 5, $seq_typ);
	}

	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public void seq_typ(String value) {
		setConstString(offset + 5, $seq_typ, value);
	}


	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public String seq_typ_nm() {
		return getConstString(offset + 6, $seq_typ_nm);
	}

	/**
	 * Sequence type name シーケンス区分名.<p>
	 *
	 */
	public void seq_typ_nm(String value) {
		setConstString(offset + 6, $seq_typ_nm, value);
	}


	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public String ora_seq_nm() {
		return getConstString(offset + 7, $ora_seq_nm);
	}

	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public void ora_seq_nm(String value) {
		setConstString(offset + 7, $ora_seq_nm, value);
	}


	/**
	 * Update number 番号更新.<p>
	 *
	 */
	public boolean num_upd_flg() {
		return getConstBoolean(offset + 8, $num_upd_flg);
	}

	/**
	 * Update number 番号更新.<p>
	 *
	 */
	public void num_upd_flg(boolean value) {
		setConstBoolean(offset + 8, $num_upd_flg, value);
	}


	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public MCNumber min_val() {
		return getConstNumber(offset + 9, $min_val);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(MCNumber value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(int value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(long value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(float value) {
		setConstNumber(offset + 9, $min_val, value);
	}

	/**
	 * Min. value 最小値.<p>
	 *
	 */
	public void min_val(double value) {
		setConstNumber(offset + 9, $min_val, value);
	}


	/**
	 * Current value 現在値.<p>
	 *
	 */
	public MCNumber last_val() {
		return getConstNumber(offset + 10, $last_val);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(MCNumber value) {
		setConstNumber(offset + 10, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(int value) {
		setConstNumber(offset + 10, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(long value) {
		setConstNumber(offset + 10, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(float value) {
		setConstNumber(offset + 10, $last_val, value);
	}

	/**
	 * Current value 現在値.<p>
	 *
	 */
	public void last_val(double value) {
		setConstNumber(offset + 10, $last_val, value);
	}


	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public MCNumber max_val() {
		return getConstNumber(offset + 11, $max_val);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(MCNumber value) {
		setConstNumber(offset + 11, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(int value) {
		setConstNumber(offset + 11, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(long value) {
		setConstNumber(offset + 11, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(float value) {
		setConstNumber(offset + 11, $max_val, value);
	}

	/**
	 * Max. value 最大値.<p>
	 *
	 */
	public void max_val(double value) {
		setConstNumber(offset + 11, $max_val, value);
	}


	/**
	 * Increment 増加量.<p>
	 *
	 */
	public MCNumber increment_by() {
		return getConstNumber(offset + 12, $increment_by);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(MCNumber value) {
		setConstNumber(offset + 12, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(int value) {
		setConstNumber(offset + 12, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(long value) {
		setConstNumber(offset + 12, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(float value) {
		setConstNumber(offset + 12, $increment_by, value);
	}

	/**
	 * Increment 増加量.<p>
	 *
	 */
	public void increment_by(double value) {
		setConstNumber(offset + 12, $increment_by, value);
	}


	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public boolean cycl_flg() {
		return getConstBoolean(offset + 13, $cycl_flg);
	}

	/**
	 * Allow auto-reset 自動リセット許可.<p>
	 *
	 */
	public void cycl_flg(boolean value) {
		setConstBoolean(offset + 13, $cycl_flg, value);
	}


	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			return num_biz_typ_nm();
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
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			return seq_typ_nm();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($min_val.equalsIgnoreCase(name)) {
			return min_val();
		}
		if ($last_val.equalsIgnoreCase(name)) {
			return last_val();
		}
		if ($max_val.equalsIgnoreCase(name)) {
			return max_val();
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			return increment_by();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($num_upd_flg.equalsIgnoreCase(name)) {
			return num_upd_flg();
		}
		if ($cycl_flg.equalsIgnoreCase(name)) {
			return cycl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			return num_biz_typ_nm();
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
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			return seq_typ_nm();
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			return ora_seq_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($min_val.equalsIgnoreCase(name)) {
			return min_val();
		}
		if ($last_val.equalsIgnoreCase(name)) {
			return last_val();
		}
		if ($max_val.equalsIgnoreCase(name)) {
			return max_val();
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			return increment_by();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($num_upd_flg.equalsIgnoreCase(name)) {
			return num_upd_flg();
		}
		if ($cycl_flg.equalsIgnoreCase(name)) {
			return cycl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			num_biz_typ_nm(value);
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
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			seq_typ_nm(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($num_upd_flg.equalsIgnoreCase(name)) {
			num_upd_flg(value);
			return;
		}
		if ($cycl_flg.equalsIgnoreCase(name)) {
			cycl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			num_biz_typ(value);
			return;
		}
		if ($num_biz_typ_nm.equalsIgnoreCase(name)) {
			num_biz_typ_nm(value);
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
		if ($seq_typ_nm.equalsIgnoreCase(name)) {
			seq_typ_nm(value);
			return;
		}
		if ($ora_seq_nm.equalsIgnoreCase(name)) {
			ora_seq_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($min_val.equalsIgnoreCase(name)) {
			min_val(value);
			return;
		}
		if ($last_val.equalsIgnoreCase(name)) {
			last_val(value);
			return;
		}
		if ($max_val.equalsIgnoreCase(name)) {
			max_val(value);
			return;
		}
		if ($increment_by.equalsIgnoreCase(name)) {
			increment_by(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($num_upd_flg.equalsIgnoreCase(name)) {
			num_upd_flg(value);
			return;
		}
		if ($cycl_flg.equalsIgnoreCase(name)) {
			cycl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

