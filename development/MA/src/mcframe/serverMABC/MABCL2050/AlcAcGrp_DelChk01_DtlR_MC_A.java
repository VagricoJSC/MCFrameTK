package mcframe.serverMABC.MABCL2050;

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
 * ブロック"AlcAcGrp_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class AlcAcGrp_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Allocation account group type 配賦科目グループ区分.<p>
	 *
	 */
	public static final String $alc_ac_grp_typ = "alc_ac_grp_typ";
	/**
	 * Allocation account group cd. 配賦科目グループＣＤ.<p>
	 *
	 */
	public static final String $alc_ac_grp_cd = "alc_ac_grp_cd";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta alc_ac_grp_typ_META = createCommonMeta($alc_ac_grp_typ, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_TYP);
	public static final MCMeta alc_ac_grp_cd_META = createCommonMeta($alc_ac_grp_cd, mcframe.commonMA.meta.MA_META.ALC_AC_GRP_CD);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<AlcAcGrp_DelChk01_DtlR> constMetas = new ConstMetaList<AlcAcGrp_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			alc_ac_grp_typ_META,
			alc_ac_grp_cd_META,
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
				{$alc_ac_grp_typ, "E"},	// alc_ac_grp_typ
				{$alc_ac_grp_cd, "E"}	// alc_ac_grp_cd
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
	protected AlcAcGrp_DelChk01_DtlR_MC_A(ConstMetaList<? extends AlcAcGrp_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AlcAcGrp_DelChk01_DtlR clone() {
		return (AlcAcGrp_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AlcAcGrp_DelChk01_DtlR createInstance() {
		return (AlcAcGrp_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public AlcAcGrp_DelChk01_DtlR getValues(String... names) {
		return (AlcAcGrp_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Allocation account group type 配賦科目グループ区分.<p>
	 *
	 */
	public String alc_ac_grp_typ() {
		return getConstString(offset + 0, $alc_ac_grp_typ);
	}

	/**
	 * Allocation account group type 配賦科目グループ区分.<p>
	 *
	 */
	public void alc_ac_grp_typ(String value) {
		setConstString(offset + 0, $alc_ac_grp_typ, value);
	}


	/**
	 * Allocation account group cd. 配賦科目グループＣＤ.<p>
	 *
	 */
	public String alc_ac_grp_cd() {
		return getConstString(offset + 1, $alc_ac_grp_cd);
	}

	/**
	 * Allocation account group cd. 配賦科目グループＣＤ.<p>
	 *
	 */
	public void alc_ac_grp_cd(String value) {
		setConstString(offset + 1, $alc_ac_grp_cd, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 2, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 2, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 2, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 2, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 2, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 2, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($alc_ac_grp_typ.equalsIgnoreCase(name)) {
			return alc_ac_grp_typ();
		}
		if ($alc_ac_grp_cd.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd();
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
		if ($alc_ac_grp_typ.equalsIgnoreCase(name)) {
			return alc_ac_grp_typ();
		}
		if ($alc_ac_grp_cd.equalsIgnoreCase(name)) {
			return alc_ac_grp_cd();
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
		if ($alc_ac_grp_typ.equalsIgnoreCase(name)) {
			alc_ac_grp_typ(value);
			return;
		}
		if ($alc_ac_grp_cd.equalsIgnoreCase(name)) {
			alc_ac_grp_cd(value);
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
		if ($alc_ac_grp_typ.equalsIgnoreCase(name)) {
			alc_ac_grp_typ(value);
			return;
		}
		if ($alc_ac_grp_cd.equalsIgnoreCase(name)) {
			alc_ac_grp_cd(value);
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

