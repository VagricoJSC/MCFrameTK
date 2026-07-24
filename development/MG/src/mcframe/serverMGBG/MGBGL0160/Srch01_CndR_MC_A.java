package mcframe.serverMGBG.MGBGL0160;

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
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public static final String $pre_alc_rate_nm = "pre_alc_rate_nm";
	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public static final String $pre_alc_set_typ = "pre_alc_set_typ";
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public static final String $no_exist_flg = "no_exist_flg";
	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public static final String $no_exist_flg_str = "no_exist_flg_str";
	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public static final String $pln_mly_flg_str = "pln_mly_flg_str";
	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public static final String $act_mly_flg_str = "act_mly_flg_str";
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	/**
	 * Month to create FROM 作成対象年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $tgt_ym_fr = "tgt_ym_fr";
	/**
	 * Month to create TO 作成対象年月ＴＯ.<p>
	 *
	 */
	public static final String $tgt_ym_to = "tgt_ym_to";
	/**
	 * Term 期.<p>
	 *
	 */
	public static final String $term = "term";


	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta pre_alc_rate_nm_META = createCommonMeta($pre_alc_rate_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_NM);
	public static final MCMeta pre_alc_set_typ_META = createCommonMeta($pre_alc_set_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_SET_TYP);
	public static final MCMeta no_exist_flg_META = createCommonMeta($no_exist_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_exist_flg_str_META = createCommonMeta($no_exist_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta pln_mly_flg_str_META = createCommonMeta($pln_mly_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta act_mly_flg_str_META = createCommonMeta($act_mly_flg_str, mcframe.commonMA.meta.MA_META.FLG_STR);
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta tgt_ym_fr_META = createCommonMeta($tgt_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta tgt_ym_to_META = createCommonMeta($tgt_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			pre_alc_rate_cd_META,
			pre_alc_rate_nm_META,
			pre_alc_set_typ_META,
			no_exist_flg_META,
			no_exist_flg_str_META,
			pln_mly_flg_str_META,
			act_mly_flg_str_META,
			sa_typ_META,
			tgt_ym_fr_META,
			tgt_ym_to_META,
			term_META
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
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 0, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 0, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 1, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 1, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 4, $pre_alc_rate_cd);
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 4, $pre_alc_rate_cd, value);
	}


	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public String pre_alc_rate_nm() {
		return getConstString(offset + 5, $pre_alc_rate_nm);
	}

	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public void pre_alc_rate_nm(String value) {
		setConstString(offset + 5, $pre_alc_rate_nm, value);
	}


	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public String pre_alc_set_typ() {
		return getConstString(offset + 6, $pre_alc_set_typ);
	}

	/**
	 * Ratio setting type 比率設定区分.<p>
	 *
	 */
	public void pre_alc_set_typ(String value) {
		setConstString(offset + 6, $pre_alc_set_typ, value);
	}


	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public boolean no_exist_flg() {
		return getConstBoolean(offset + 7, $no_exist_flg);
	}

	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public void no_exist_flg(boolean value) {
		setConstBoolean(offset + 7, $no_exist_flg, value);
	}


	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public String no_exist_flg_str() {
		return getConstString(offset + 8, $no_exist_flg_str);
	}

	/**
	 * Non-entry 未登録.<p>
	 *
	 */
	public void no_exist_flg_str(String value) {
		setConstString(offset + 8, $no_exist_flg_str, value);
	}


	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public String pln_mly_flg_str() {
		return getConstString(offset + 9, $pln_mly_flg_str);
	}

	/**
	 * Monthly ratio (Plan) 計画月次比率.<p>
	 *
	 */
	public void pln_mly_flg_str(String value) {
		setConstString(offset + 9, $pln_mly_flg_str, value);
	}


	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public String act_mly_flg_str() {
		return getConstString(offset + 10, $act_mly_flg_str);
	}

	/**
	 * Monthly ratio (Result) 実績月次比率.<p>
	 *
	 */
	public void act_mly_flg_str(String value) {
		setConstString(offset + 10, $act_mly_flg_str, value);
	}


	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 11, $sa_typ);
	}

	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 11, $sa_typ, value);
	}


	/**
	 * Month to create FROM 作成対象年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate tgt_ym_fr() {
		return getConstDate(offset + 12, $tgt_ym_fr);
	}

	/**
	 * Month to create FROM 作成対象年月ＦＲＯＭ.<p>
	 *
	 */
	public void tgt_ym_fr(MCDate value) {
		setConstDate(offset + 12, $tgt_ym_fr, value);
	}


	/**
	 * Month to create TO 作成対象年月ＴＯ.<p>
	 *
	 */
	public MCDate tgt_ym_to() {
		return getConstDate(offset + 13, $tgt_ym_to);
	}

	/**
	 * Month to create TO 作成対象年月ＴＯ.<p>
	 *
	 */
	public void tgt_ym_to(MCDate value) {
		setConstDate(offset + 13, $tgt_ym_to, value);
	}


	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 14, $term);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 14, $term, value);
	}


	public String getString(String name) {
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
		if ($no_exist_flg_str.equalsIgnoreCase(name)) {
			return no_exist_flg_str();
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			return pln_mly_flg_str();
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			return act_mly_flg_str();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($tgt_ym_fr.equalsIgnoreCase(name)) {
			return tgt_ym_fr();
		}
		if ($tgt_ym_to.equalsIgnoreCase(name)) {
			return tgt_ym_to();
		}
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($no_exist_flg.equalsIgnoreCase(name)) {
			return no_exist_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($no_exist_flg_str.equalsIgnoreCase(name)) {
			return no_exist_flg_str();
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			return pln_mly_flg_str();
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			return act_mly_flg_str();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($tgt_ym_fr.equalsIgnoreCase(name)) {
			return tgt_ym_fr();
		}
		if ($tgt_ym_to.equalsIgnoreCase(name)) {
			return tgt_ym_to();
		}
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_exist_flg.equalsIgnoreCase(name)) {
			return no_exist_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($no_exist_flg_str.equalsIgnoreCase(name)) {
			no_exist_flg_str(value);
			return;
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			pln_mly_flg_str(value);
			return;
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			act_mly_flg_str(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($tgt_ym_fr.equalsIgnoreCase(name)) {
			tgt_ym_fr(value);
			return;
		}
		if ($tgt_ym_to.equalsIgnoreCase(name)) {
			tgt_ym_to(value);
			return;
		}
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_exist_flg.equalsIgnoreCase(name)) {
			no_exist_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($no_exist_flg_str.equalsIgnoreCase(name)) {
			no_exist_flg_str(value);
			return;
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			pln_mly_flg_str(value);
			return;
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			act_mly_flg_str(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($tgt_ym_fr.equalsIgnoreCase(name)) {
			tgt_ym_fr(value);
			return;
		}
		if ($tgt_ym_to.equalsIgnoreCase(name)) {
			tgt_ym_to(value);
			return;
		}
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_exist_flg.equalsIgnoreCase(name)) {
			no_exist_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

