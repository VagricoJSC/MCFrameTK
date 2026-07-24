package mcframe.serverMABG.MABGL0530;

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
 * ブロック"PreAlcDpt_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PreAlcDpt_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";
	/**
	 * Allocation destination department pattern 配賦先部門パタン.<p>
	 *
	 */
	public static final String $pre_alc_dpt_ptn = "pre_alc_dpt_ptn";
	/**
	 * Allocation source dept. cd. 配賦元部門ＣＤ.<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public static final String $dst_dpt_cd = "dst_dpt_cd";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pre_alc_dpt_ptn_META = createCommonMeta($pre_alc_dpt_ptn, mcframe.commonMA.meta.MA_META.PRE_ALC_DPT_PTN);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dst_dpt_cd_META = createCommonMeta($dst_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<PreAlcDpt_DelChk01_DtlR> constMetas = new ConstMetaList<PreAlcDpt_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_META,
			pre_alc_dpt_ptn_META,
			src_dpt_cd_META,
			dst_dpt_cd_META,
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
				{$term, "E"},	// term
				{$pre_alc_dpt_ptn, "E"},	// pre_alc_dpt_ptn
				{$src_dpt_cd, "E"},	// src_dpt_cd
				{$dst_dpt_cd, "E"}	// dst_dpt_cd
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
	protected PreAlcDpt_DelChk01_DtlR_MC_A(ConstMetaList<? extends PreAlcDpt_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreAlcDpt_DelChk01_DtlR clone() {
		return (PreAlcDpt_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreAlcDpt_DelChk01_DtlR createInstance() {
		return (PreAlcDpt_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PreAlcDpt_DelChk01_DtlR getValues(String... names) {
		return (PreAlcDpt_DelChk01_DtlR) super.getValues(names);
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
	 * Allocation destination department pattern 配賦先部門パタン.<p>
	 *
	 */
	public String pre_alc_dpt_ptn() {
		return getConstString(offset + 1, $pre_alc_dpt_ptn);
	}

	/**
	 * Allocation destination department pattern 配賦先部門パタン.<p>
	 *
	 */
	public void pre_alc_dpt_ptn(String value) {
		setConstString(offset + 1, $pre_alc_dpt_ptn, value);
	}


	/**
	 * Allocation source dept. cd. 配賦元部門ＣＤ.<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 2, $src_dpt_cd);
	}

	/**
	 * Allocation source dept. cd. 配賦元部門ＣＤ.<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 2, $src_dpt_cd, value);
	}


	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public String dst_dpt_cd() {
		return getConstString(offset + 3, $dst_dpt_cd);
	}

	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public void dst_dpt_cd(String value) {
		setConstString(offset + 3, $dst_dpt_cd, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 4, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 4, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			return dst_dpt_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			return dst_dpt_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			dst_dpt_cd(value);
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
	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($dst_dpt_cd.equalsIgnoreCase(name)) {
			dst_dpt_cd(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

