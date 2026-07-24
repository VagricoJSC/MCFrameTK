package mcframe.clientMGBD.MGBDP0010;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	public static final String $term_p = "term_p";
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public static final String $cost_calc_typ = "cost_calc_typ";
	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public static final String $max_mons = "max_mons";
	public static final String $calc_no = "calc_no";
	public static final String $ym = "ym";
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";
	/**
	 * Item specified calculation 品目指定計算.<p>
	 *
	 */
	public static final String $itm_limit_flg = "itm_limit_flg";
	/**
	 * Calculation for data check データ確認計算.<p>
	 *
	 */
	public static final String $data_check_flg = "data_check_flg";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";

	public static final String $term = $term_p + ".term";
	public static final String $term_end_ym = $term_p + ".term_end_ym";

	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta cost_calc_typ_META = createCommonMeta($cost_calc_typ, mcframe.commonMA.meta.MA_META.COST_CALC_TYP);
	public static final MCMeta max_mons_META = createCommonMeta($max_mons, mcframe.commonMA.meta.MA_META.MAX_MONS);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta itm_limit_flg_META = createCommonMeta($itm_limit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_check_flg_META = createCommonMeta($data_check_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.CALC_ARG_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR3);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_p_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			cost_calc_typ_META,
			max_mons_META,
			calc_no_META,
			ym_META,
			ym_fr_META,
			ym_to_META,
			xrate_cd_META,
			xrate_nm_META,
			itm_limit_flg_META,
			data_check_flg_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
				"term",
				"term_end_ym"
			},
			{
				$term,
				$term_end_ym
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$calc_grp_cd, "calc_grp_nm;cost_calc_typ;max_mons;xrate_cd"},	// calc_grp_cd
				{$xrate_cd, "xrate_nm"}	// xrate_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ym_fr, "term;term_end_ym;max_mons"},	// ym_fr
				{$ym_to, "term;term_end_ym"}	// ym_to
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ym_fr, "st_ym;end_ym;max_interval"},	// ym_fr
				{$ym_to, "st_ym;end_ym"}	// ym_to
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0230.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 0, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 0, $term_p, row);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 2, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 2, $calc_grp_nm, value);
	}


	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public String cost_calc_typ() {
		return getConstString(offset + 3, $cost_calc_typ);
	}

	/**
	 * Cost calculation type 計算区分.<p>
	 *
	 */
	public void cost_calc_typ(String value) {
		setConstString(offset + 3, $cost_calc_typ, value);
	}


	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public MCNumber max_mons() {
		return getConstNumber(offset + 4, $max_mons);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(MCNumber value) {
		setConstNumber(offset + 4, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(int value) {
		setConstNumber(offset + 4, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(long value) {
		setConstNumber(offset + 4, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(float value) {
		setConstNumber(offset + 4, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(double value) {
		setConstNumber(offset + 4, $max_mons, value);
	}


	public String calc_no() {
		return getConstString(offset + 5, $calc_no);
	}

	public void calc_no(String value) {
		setConstString(offset + 5, $calc_no, value);
	}


	public MCDate ym() {
		return getConstDate(offset + 6, $ym);
	}

	public void ym(MCDate value) {
		setConstDate(offset + 6, $ym, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 7, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 7, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 8, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 8, $ym_to, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 9, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 9, $xrate_cd, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 10, $xrate_nm);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 10, $xrate_nm, value);
	}


	/**
	 * Item specified calculation 品目指定計算.<p>
	 *
	 */
	public boolean itm_limit_flg() {
		return getConstBoolean(offset + 11, $itm_limit_flg);
	}

	/**
	 * Item specified calculation 品目指定計算.<p>
	 *
	 */
	public void itm_limit_flg(boolean value) {
		setConstBoolean(offset + 11, $itm_limit_flg, value);
	}


	/**
	 * Calculation for data check データ確認計算.<p>
	 *
	 */
	public boolean data_check_flg() {
		return getConstBoolean(offset + 12, $data_check_flg);
	}

	/**
	 * Calculation for data check データ確認計算.<p>
	 *
	 */
	public void data_check_flg(boolean value) {
		setConstBoolean(offset + 12, $data_check_flg, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 13, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 13, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 14, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 14, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 15, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 15, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 16, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 16, $sub_char3, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			return itm_limit_flg();
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			return data_check_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			return itm_limit_flg();
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			return data_check_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			itm_limit_flg(value);
			return;
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			data_check_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_fr.equalsIgnoreCase(name)) {
			ym_fr(value);
			return;
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($itm_limit_flg.equalsIgnoreCase(name)) {
			itm_limit_flg(value);
			return;
		}
		if ($data_check_flg.equalsIgnoreCase(name)) {
			data_check_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0230.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
	}

	public MCDate term_end_ym() {
		return term_p().term_end_ym();
	}

	public void term_end_ym(MCDate value) {
		term_p().term_end_ym(value);
	}

}

