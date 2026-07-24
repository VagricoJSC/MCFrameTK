package mcframe.clientMGBG.MGBGP0160;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Entry 登録.<p>
	 *
	 */
	public static final String $exist_flg = "exist_flg";
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	/**
	 * Month to create 作成対象年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Acquisition month FROM 取得先対象年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $ym_fr = "ym_fr";
	/**
	 * Acquisition month TO 取得先対象年月ＴＯ.<p>
	 *
	 */
	public static final String $ym_to = "ym_to";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public static final String $pre_alc_rate_cd = "pre_alc_rate_cd";
	/**
	 * Departmental alloc. basis name 一次配賦基準名称.<p>
	 *
	 */
	public static final String $pre_alc_rate_nm = "pre_alc_rate_nm";
	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public static final String $pre_alc_set_typ = "pre_alc_set_typ";
	/**
	 * Ratio setting type name 比率設定区分名.<p>
	 *
	 */
	public static final String $pre_alc_set_typ_nm = "pre_alc_set_typ_nm";
	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public static final String $pln_mly_flg = "pln_mly_flg";
	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public static final String $act_mly_flg = "act_mly_flg";
	/**
	 * Plan based 計画基準.<p>
	 *
	 */
	public static final String $pln_rule_flg = "pln_rule_flg";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exist_flg_META = createCommonMeta($exist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta pre_alc_rate_nm_META = createCommonMeta($pre_alc_rate_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_NM);
	public static final MCMeta pre_alc_set_typ_META = createCommonMeta($pre_alc_set_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_SET_TYP);
	public static final MCMeta pre_alc_set_typ_nm_META = createCommonMeta($pre_alc_set_typ_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_SET_TYP_NM);
	public static final MCMeta pln_mly_flg_META = createCommonMeta($pln_mly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_mly_flg_META = createCommonMeta($act_mly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pln_rule_flg_META = createCommonMeta($pln_rule_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			exist_flg_META,
			sa_typ_META,
			ym_META,
			ym_fr_META,
			ym_to_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			pre_alc_rate_cd_META,
			pre_alc_rate_nm_META,
			pre_alc_set_typ_META,
			pre_alc_set_typ_nm_META,
			pln_mly_flg_META,
			act_mly_flg_META,
			pln_rule_flg_META
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Entry 登録.<p>
	 *
	 */
	public boolean exist_flg() {
		return getConstBoolean(offset + 1, $exist_flg);
	}

	/**
	 * Entry 登録.<p>
	 *
	 */
	public void exist_flg(boolean value) {
		setConstBoolean(offset + 1, $exist_flg, value);
	}


	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 2, $sa_typ);
	}

	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 2, $sa_typ, value);
	}


	/**
	 * Month to create 作成対象年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * Month to create 作成対象年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}


	/**
	 * Acquisition month FROM 取得先対象年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 4, $ym_fr);
	}

	/**
	 * Acquisition month FROM 取得先対象年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 4, $ym_fr, value);
	}


	/**
	 * Acquisition month TO 取得先対象年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 5, $ym_to);
	}

	/**
	 * Acquisition month TO 取得先対象年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 5, $ym_to, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 6, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 6, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 7, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 7, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 9, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 9, $wg_nm, value);
	}


	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 10, $pre_alc_rate_cd);
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 10, $pre_alc_rate_cd, value);
	}


	/**
	 * Departmental alloc. basis name 一次配賦基準名称.<p>
	 *
	 */
	public String pre_alc_rate_nm() {
		return getConstString(offset + 11, $pre_alc_rate_nm);
	}

	/**
	 * Departmental alloc. basis name 一次配賦基準名称.<p>
	 *
	 */
	public void pre_alc_rate_nm(String value) {
		setConstString(offset + 11, $pre_alc_rate_nm, value);
	}


	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public String pre_alc_set_typ() {
		return getConstString(offset + 12, $pre_alc_set_typ);
	}

	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public void pre_alc_set_typ(String value) {
		setConstString(offset + 12, $pre_alc_set_typ, value);
	}


	/**
	 * Ratio setting type name 比率設定区分名.<p>
	 *
	 */
	public String pre_alc_set_typ_nm() {
		return getConstString(offset + 13, $pre_alc_set_typ_nm);
	}

	/**
	 * Ratio setting type name 比率設定区分名.<p>
	 *
	 */
	public void pre_alc_set_typ_nm(String value) {
		setConstString(offset + 13, $pre_alc_set_typ_nm, value);
	}


	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public boolean pln_mly_flg() {
		return getConstBoolean(offset + 14, $pln_mly_flg);
	}

	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public void pln_mly_flg(boolean value) {
		setConstBoolean(offset + 14, $pln_mly_flg, value);
	}


	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public boolean act_mly_flg() {
		return getConstBoolean(offset + 15, $act_mly_flg);
	}

	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public void act_mly_flg(boolean value) {
		setConstBoolean(offset + 15, $act_mly_flg, value);
	}


	/**
	 * Plan based 計画基準.<p>
	 *
	 */
	public boolean pln_rule_flg() {
		return getConstBoolean(offset + 16, $pln_rule_flg);
	}

	/**
	 * Plan based 計画基準.<p>
	 *
	 */
	public void pln_rule_flg(boolean value) {
		setConstBoolean(offset + 16, $pln_rule_flg, value);
	}


	public String getString(String name) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_set_typ.equalsIgnoreCase(name)) {
			return pre_alc_set_typ();
		}
		if ($pre_alc_set_typ_nm.equalsIgnoreCase(name)) {
			return pre_alc_set_typ_nm();
		}
		return super.getString(name);
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($exist_flg.equalsIgnoreCase(name)) {
			return exist_flg();
		}
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			return pln_mly_flg();
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			return act_mly_flg();
		}
		if ($pln_rule_flg.equalsIgnoreCase(name)) {
			return pln_rule_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			return pre_alc_rate_nm();
		}
		if ($pre_alc_set_typ.equalsIgnoreCase(name)) {
			return pre_alc_set_typ();
		}
		if ($pre_alc_set_typ_nm.equalsIgnoreCase(name)) {
			return pre_alc_set_typ_nm();
		}
		return super.getStringNE(name);
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($exist_flg.equalsIgnoreCase(name)) {
			return exist_flg();
		}
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			return pln_mly_flg();
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			return act_mly_flg();
		}
		if ($pln_rule_flg.equalsIgnoreCase(name)) {
			return pln_rule_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_set_typ.equalsIgnoreCase(name)) {
			pre_alc_set_typ(value);
			return;
		}
		if ($pre_alc_set_typ_nm.equalsIgnoreCase(name)) {
			pre_alc_set_typ_nm(value);
			return;
		}
		super.setString(name, value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($exist_flg.equalsIgnoreCase(name)) {
			exist_flg(value);
			return;
		}
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			pln_mly_flg(value);
			return;
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			act_mly_flg(value);
			return;
		}
		if ($pln_rule_flg.equalsIgnoreCase(name)) {
			pln_rule_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($pre_alc_rate_nm.equalsIgnoreCase(name)) {
			pre_alc_rate_nm(value);
			return;
		}
		if ($pre_alc_set_typ.equalsIgnoreCase(name)) {
			pre_alc_set_typ(value);
			return;
		}
		if ($pre_alc_set_typ_nm.equalsIgnoreCase(name)) {
			pre_alc_set_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($exist_flg.equalsIgnoreCase(name)) {
			exist_flg(value);
			return;
		}
		if ($pln_mly_flg.equalsIgnoreCase(name)) {
			pln_mly_flg(value);
			return;
		}
		if ($act_mly_flg.equalsIgnoreCase(name)) {
			act_mly_flg(value);
			return;
		}
		if ($pln_rule_flg.equalsIgnoreCase(name)) {
			pln_rule_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

