package mcframe.serverMABS.MABSL5040;

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
 * ブロック"GpBom_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class GpBom_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_GP_BOM_R {

	/**
	 * BOM key _ [Before modification] ＢＯＭキー_[変更前].<p>
	 *
	 */
	public static final String $bom_key_key = "bom_key_key";


	public static final MCMeta bom_key_key_META = createCommonMeta($bom_key_key, mcframe.commonMA.meta.MA_META.BOM_KEY);

	protected static final ConstMetaList<GpBom_UpdChk01_DtlR> constMetas = new ConstMetaList<GpBom_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_GP_BOM_R.constMetas,
		new MCMeta[]{
			bom_key_key_META,
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
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$bom_key, "U"},	// bom_key
				{$bom_typ, "E"},	// bom_typ
				{$par_itm_cd, "E"},	// par_itm_cd
				{$bom_ptn, "E"},	// bom_ptn
				{$sno_typ1, "E"},	// sno_typ1
				{$sno_typ2, "E"},	// sno_typ2
				{$sno_typ3, "E"},	// sno_typ3
				{$sno_typ4, "E"},	// sno_typ4
				{$par_inst_qty, "E"},	// par_inst_qty
				{$chd_rqmt_qty, "E"},	// chd_rqmt_qty
				{$chd_inpt_qty, "E"},	// chd_inpt_qty
				{$fxd_chd_rqmt_qty, "E"},	// fxd_chd_rqmt_qty
				{$in_offst_typ, "E"},	// in_offst_typ
				{$in_offst, "E"},	// in_offst
				{$bkf_typ, "E"},	// bkf_typ
				{$alloc_ctl_typ, "E"},	// alloc_ctl_typ
				{$inpt_ctl_typ, "E"},	// inpt_ctl_typ
				{$disp_seq, "E"},	// disp_seq
				{$st_dt, "E"},	// st_dt
				{$end_dt, "E"}	// end_dt
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$wg_cd, "E"},	// wg_cd
				{$par_itm_sub1, "E"},	// par_itm_sub1
				{$par_itm_sub2, "E"},	// par_itm_sub2
				{$par_itm_sub3, "E"}	// par_itm_sub3
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$bom_key, "bom_key"}	// bom_key
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$bom_typ, "MAC_BOM_TYP"},	// bom_typ
				{$alt_itm_typ, "MAC_ALT_ITM_TYP"},	// alt_itm_typ
				{$sno_typ1, "MAC_SNO_TYP"},	// sno_typ1
				{$sno_typ2, "MAC_SNO_TYP"},	// sno_typ2
				{$sno_typ3, "MAC_SNO_TYP"},	// sno_typ3
				{$sno_typ4, "MAC_SNO_TYP"},	// sno_typ4
				{$in_offst_typ, "MAC_OFFST_TYP"},	// in_offst_typ
				{$bkf_typ, "MAC_BKF_TYP"},	// bkf_typ
				{$alloc_ctl_typ, "MAC_ALLOC_CTL_TYP"},	// alloc_ctl_typ
				{$inpt_ctl_typ, "MAC_INPT_CTL_TYP"}	// inpt_ctl_typ
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
	protected GpBom_UpdChk01_DtlR_MC_A(ConstMetaList<? extends GpBom_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GpBom_UpdChk01_DtlR clone() {
		return (GpBom_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GpBom_UpdChk01_DtlR createInstance() {
		return (GpBom_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public GpBom_UpdChk01_DtlR getValues(String... names) {
		return (GpBom_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * BOM key _ [Before modification] ＢＯＭキー_[変更前].<p>
	 *
	 */
	public String bom_key_key() {
		return getConstString(offset + 0, $bom_key_key);
	}

	/**
	 * BOM key _ [Before modification] ＢＯＭキー_[変更前].<p>
	 *
	 */
	public void bom_key_key(String value) {
		setConstString(offset + 0, $bom_key_key, value);
	}


	public String getString(String name) {
		if ($bom_key_key.equalsIgnoreCase(name)) {
			return bom_key_key();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bom_key_key.equalsIgnoreCase(name)) {
			return bom_key_key();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bom_key_key.equalsIgnoreCase(name)) {
			bom_key_key(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bom_key_key.equalsIgnoreCase(name)) {
			bom_key_key(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		super.setBooleanNE(name, value);
	}



}

