package mcframe.serverMSBC.MSBCL1010;

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
 * ブロック"Sprt03_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt03_HdrR_MC_A extends MCConstRow {

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public static final String $base_unit_inst_qty = "base_unit_inst_qty";
	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public static final String $strg_str_ln_cd_none_flg = "strg_str_ln_cd_none_flg";


	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta strg_str_ln_cd_none_flg_META = createCommonMeta($strg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Sprt03_HdrR> constMetas = new ConstMetaList<Sprt03_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			st_schd_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			oper_ptn_META,
			strg_loc_cd_META,
			base_unit_inst_qty_META,
			base_unit_yield_qty_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			itm_mfg_inst_no_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			strg_str_ln_cd_none_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Sprt03_HdrR_MC_A(ConstMetaList<? extends Sprt03_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt03_HdrR clone() {
		return (Sprt03_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt03_HdrR createInstance() {
		return (Sprt03_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt03_HdrR getValues(String... names) {
		return (Sprt03_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 0, $st_schd_dt);
	}

	/**
	 * Scheduled start date 着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 0, $st_schd_dt, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 5, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 5, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 6, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 6, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 7, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 7, $oper_ptn, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 8, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 8, $strg_loc_cd, value);
	}


	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 9, $base_unit_inst_qty);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 9, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 9, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 9, $base_unit_inst_qty, value);
	}

	/**
	 * Base unit mfg. order qty. 基準単位製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 9, $base_unit_inst_qty, value);
	}


	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 10, $base_unit_yield_qty);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 10, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 10, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 10, $base_unit_yield_qty, value);
	}

	/**
	 * Base unit output scheduled qty. 基準単位出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 10, $base_unit_yield_qty, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 11, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 11, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 12, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 12, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 13, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 13, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 14, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 14, $sno4, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 15, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 15, $mfg_inst_no, value);
	}


	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 16, $mfg_inst_rev);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}

	/**
	 * Mfg. order rev. number 製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 16, $mfg_inst_rev, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 17, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 17, $itm_mfg_inst_no, value);
	}


	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 18, $strg_str_ln_cd);
	}

	/**
	 * Storage rack/line cd. 格納棚・ラインＣＤ.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 18, $strg_str_ln_cd, value);
	}


	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 19, $strg_str_ln_nm);
	}

	/**
	 * Storage rack/line name 格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 19, $strg_str_ln_nm, value);
	}


	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public boolean strg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 20, $strg_str_ln_cd_none_flg);
	}

	/**
	 * Without storage rack/line 格納棚・ライン無.<p>
	 *
	 */
	public void strg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 20, $strg_str_ln_cd_none_flg, value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return strg_str_ln_cd_none_flg();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($strg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			strg_str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

