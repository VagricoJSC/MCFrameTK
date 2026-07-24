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
 * ブロック"Seq_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Seq_DelChk01_DtlR_MC_A extends MCConstRow {

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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta num_biz_typ_META = createCommonMeta($num_biz_typ, mcframe.commonMA.meta.MA_META.NUM_BIZ_TYP);
	public static final MCMeta num_ptn_cd_META = createCommonMeta($num_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta key_elm_META = createCommonMeta($key_elm, mcframe.commonMA.meta.MA_META.NUMBERING_UNDISP);
	public static final MCMeta seq_typ_META = createCommonMeta($seq_typ, mcframe.commonMA.meta.MA_META.SEQ_TYP);
	public static final MCMeta ora_seq_nm_META = createCommonMeta($ora_seq_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Seq_DelChk01_DtlR> constMetas = new ConstMetaList<Seq_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			num_biz_typ_META,
			num_ptn_cd_META,
			key_elm_META,
			seq_typ_META,
			ora_seq_nm_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$num_biz_typ, "E"},	// num_biz_typ
				{$num_ptn_cd, "E"},	// num_ptn_cd
				{$key_elm, "E"}	// key_elm
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
	protected Seq_DelChk01_DtlR_MC_A(ConstMetaList<? extends Seq_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Seq_DelChk01_DtlR clone() {
		return (Seq_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Seq_DelChk01_DtlR createInstance() {
		return (Seq_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Seq_DelChk01_DtlR getValues(String... names) {
		return (Seq_DelChk01_DtlR) super.getValues(names);
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
	 * Key element キー要素.<p>
	 *
	 */
	public String key_elm() {
		return getConstString(offset + 2, $key_elm);
	}

	/**
	 * Key element キー要素.<p>
	 *
	 */
	public void key_elm(String value) {
		setConstString(offset + 2, $key_elm, value);
	}


	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public String seq_typ() {
		return getConstString(offset + 3, $seq_typ);
	}

	/**
	 * Sequence type シーケンス区分.<p>
	 *
	 */
	public void seq_typ(String value) {
		setConstString(offset + 3, $seq_typ, value);
	}


	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public String ora_seq_nm() {
		return getConstString(offset + 4, $ora_seq_nm);
	}

	/**
	 * Sequence name シーケンス名.<p>
	 *
	 */
	public void ora_seq_nm(String value) {
		setConstString(offset + 4, $ora_seq_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 5, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 5, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
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
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($num_biz_typ.equalsIgnoreCase(name)) {
			return num_biz_typ();
		}
		if ($num_ptn_cd.equalsIgnoreCase(name)) {
			return num_ptn_cd();
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
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
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
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

