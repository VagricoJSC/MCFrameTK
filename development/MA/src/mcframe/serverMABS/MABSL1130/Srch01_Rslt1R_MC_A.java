package mcframe.serverMABS.MABSL1130;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * For expiration management flg. 期限管理対象ＦＬＧ.<p>
	 *
	 */
	public static final String $lmt_ctl_flg = "lmt_ctl_flg";
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public static final String $lmt_ctl_categ = "lmt_ctl_categ";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Inspection flg. 検査ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_flg = "insp_flg";
	/**
	 * Inspection configured flg. 検査設定済ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_input_flg = "insp_input_flg";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public static final String $def_insp_aprv_flg = "def_insp_aprv_flg";
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public static final String $def_insp_aprv_role_cd = "def_insp_aprv_role_cd";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_categ_META = createCommonMeta($lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta insp_flg_META = createCommonMeta($insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_input_flg_META = createCommonMeta($insp_input_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta def_insp_aprv_flg_META = createCommonMeta($def_insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_insp_aprv_role_cd_META = createCommonMeta($def_insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			unit_cd_META,
			unit_nm_META,
			lmt_ctl_flg_META,
			lmt_ctl_categ_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			dec_place_META,
			insp_flg_META,
			insp_input_flg_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			def_insp_aprv_flg_META,
			def_insp_aprv_role_cd_META,
			upd_cntr_META
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
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"}	// asset_mng_typ
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 5, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 5, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 6, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 6, $unit_nm, value);
	}


	/**
	 * For expiration management flg. 期限管理対象ＦＬＧ.<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 7, $lmt_ctl_flg);
	}

	/**
	 * For expiration management flg. 期限管理対象ＦＬＧ.<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 7, $lmt_ctl_flg, value);
	}


	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public String lmt_ctl_categ() {
		return getConstString(offset + 8, $lmt_ctl_categ);
	}

	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public void lmt_ctl_categ(String value) {
		setConstString(offset + 8, $lmt_ctl_categ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 9, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 9, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 10, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 10, $asset_mng_typ_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 11, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 11, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 11, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 11, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 11, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 11, $dec_place, value);
	}


	/**
	 * Inspection flg. 検査ＦＬＧ.<p>
	 *
	 */
	public boolean insp_flg() {
		return getConstBoolean(offset + 12, $insp_flg);
	}

	/**
	 * Inspection flg. 検査ＦＬＧ.<p>
	 *
	 */
	public void insp_flg(boolean value) {
		setConstBoolean(offset + 12, $insp_flg, value);
	}


	/**
	 * Inspection configured flg. 検査設定済ＦＬＧ.<p>
	 *
	 */
	public boolean insp_input_flg() {
		return getConstBoolean(offset + 13, $insp_input_flg);
	}

	/**
	 * Inspection configured flg. 検査設定済ＦＬＧ.<p>
	 *
	 */
	public void insp_input_flg(boolean value) {
		setConstBoolean(offset + 13, $insp_input_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 14, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 14, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 15, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 15, $sublot_mng_typ, value);
	}


	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public boolean def_insp_aprv_flg() {
		return getConstBoolean(offset + 16, $def_insp_aprv_flg);
	}

	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public void def_insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 16, $def_insp_aprv_flg, value);
	}


	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public String def_insp_aprv_role_cd() {
		return getConstString(offset + 17, $def_insp_aprv_role_cd);
	}

	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public void def_insp_aprv_role_cd(String value) {
		setConstString(offset + 17, $def_insp_aprv_role_cd, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 18, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 18, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 18, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 18, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 18, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 18, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return def_insp_aprv_role_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			return insp_flg();
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			return insp_input_flg();
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			return def_insp_aprv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($def_insp_aprv_role_cd.equalsIgnoreCase(name)) {
			def_insp_aprv_role_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($insp_flg.equalsIgnoreCase(name)) {
			insp_flg(value);
			return;
		}
		if ($insp_input_flg.equalsIgnoreCase(name)) {
			insp_input_flg(value);
			return;
		}
		if ($def_insp_aprv_flg.equalsIgnoreCase(name)) {
			def_insp_aprv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

