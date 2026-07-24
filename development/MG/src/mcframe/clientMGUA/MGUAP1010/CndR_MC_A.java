package mcframe.clientMGUA.MGUAP1010;

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

	/**
	 * Cost calculation No. (Input value) 原価計算ＮＯ（入力値）.<p>
	 *
	 */
	public static final String $calc_no_input = "calc_no_input";
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	public static final String $term_p = "term_p";
	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public static final String $y_fr = "y_fr";
	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public static final String $y_to = "y_to";
	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $m_fr = "m_fr";
	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public static final String $m_to = "m_to";
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
	 * Search firm data 確定データを検索.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
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
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public static final String $match_typ = "match_typ";

	public static final String $term_fr = $term_p + ".term_fr";
	public static final String $term_to = $term_p + ".term_to";

	public static final MCMeta calc_no_input_META = createCommonMeta($calc_no_input, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.CALC_ARG_RMRKS);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0240.TermR.class);
	public static final MCMeta y_fr_META = createCommonMeta($y_fr, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta y_to_META = createCommonMeta($y_to, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta m_fr_META = createCommonMeta($m_fr, mcframe.commonMA.meta.MA_META.MON);
	public static final MCMeta m_to_META = createCommonMeta($m_to, mcframe.commonMA.meta.MA_META.MON);
	public static final MCMeta ym_fr_META = createCommonMeta($ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_to_META = createCommonMeta($ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR3);
	public static final MCMeta match_typ_META = createStringMeta($match_typ);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_no_input_META,
			calc_no_META,
			rmrks_META,
			term_p_META,
			y_fr_META,
			y_to_META,
			m_fr_META,
			m_to_META,
			ym_fr_META,
			ym_to_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			fix_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			match_typ_META
		},
		new String[][]{
			{
				"term_fr",
				"term_to"
			},
			{
				$term_fr,
				$term_to
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



	/**
	 * Cost calculation No. (Input value) 原価計算ＮＯ（入力値）.<p>
	 *
	 */
	public String calc_no_input() {
		return getConstString(offset + 0, $calc_no_input);
	}

	/**
	 * Cost calculation No. (Input value) 原価計算ＮＯ（入力値）.<p>
	 *
	 */
	public void calc_no_input(String value) {
		setConstString(offset + 0, $calc_no_input, value);
	}


	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 1, $calc_no);
	}

	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 1, $calc_no, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 2, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 2, $rmrks, value);
	}


	public mcframe.clientMAUB.MAUBP0240.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0240.TermR) getConstInnerRow(offset + 3, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0240.TermR row){
		setConstInnerRow(offset + 3, $term_p, row);
	}


	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber y_fr() {
		return getConstNumber(offset + 4, $y_fr);
	}

	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public void y_fr(MCNumber value) {
		setConstNumber(offset + 4, $y_fr, value);
	}

	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public void y_fr(int value) {
		setConstNumber(offset + 4, $y_fr, value);
	}

	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public void y_fr(long value) {
		setConstNumber(offset + 4, $y_fr, value);
	}

	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public void y_fr(float value) {
		setConstNumber(offset + 4, $y_fr, value);
	}

	/**
	 * Year FROM 年ＦＲＯＭ.<p>
	 *
	 */
	public void y_fr(double value) {
		setConstNumber(offset + 4, $y_fr, value);
	}


	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public MCNumber y_to() {
		return getConstNumber(offset + 5, $y_to);
	}

	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public void y_to(MCNumber value) {
		setConstNumber(offset + 5, $y_to, value);
	}

	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public void y_to(int value) {
		setConstNumber(offset + 5, $y_to, value);
	}

	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public void y_to(long value) {
		setConstNumber(offset + 5, $y_to, value);
	}

	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public void y_to(float value) {
		setConstNumber(offset + 5, $y_to, value);
	}

	/**
	 * Year TO 年ＴＯ.<p>
	 *
	 */
	public void y_to(double value) {
		setConstNumber(offset + 5, $y_to, value);
	}


	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber m_fr() {
		return getConstNumber(offset + 6, $m_fr);
	}

	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public void m_fr(MCNumber value) {
		setConstNumber(offset + 6, $m_fr, value);
	}

	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public void m_fr(int value) {
		setConstNumber(offset + 6, $m_fr, value);
	}

	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public void m_fr(long value) {
		setConstNumber(offset + 6, $m_fr, value);
	}

	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public void m_fr(float value) {
		setConstNumber(offset + 6, $m_fr, value);
	}

	/**
	 * Month FROM 月ＦＲＯＭ.<p>
	 *
	 */
	public void m_fr(double value) {
		setConstNumber(offset + 6, $m_fr, value);
	}


	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public MCNumber m_to() {
		return getConstNumber(offset + 7, $m_to);
	}

	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public void m_to(MCNumber value) {
		setConstNumber(offset + 7, $m_to, value);
	}

	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public void m_to(int value) {
		setConstNumber(offset + 7, $m_to, value);
	}

	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public void m_to(long value) {
		setConstNumber(offset + 7, $m_to, value);
	}

	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public void m_to(float value) {
		setConstNumber(offset + 7, $m_to, value);
	}

	/**
	 * Month TO 月ＴＯ.<p>
	 *
	 */
	public void m_to(double value) {
		setConstNumber(offset + 7, $m_to, value);
	}


	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate ym_fr() {
		return getConstDate(offset + 8, $ym_fr);
	}

	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public void ym_fr(MCDate value) {
		setConstDate(offset + 8, $ym_fr, value);
	}


	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDate ym_to() {
		return getConstDate(offset + 9, $ym_to);
	}

	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public void ym_to(MCDate value) {
		setConstDate(offset + 9, $ym_to, value);
	}


	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 10, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 10, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 11, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 11, $calc_grp_nm, value);
	}


	/**
	 * Search firm data 確定データを検索.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 12, $fix_flg);
	}

	/**
	 * Search firm data 確定データを検索.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 12, $fix_flg, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 13, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 13, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 14, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 14, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 15, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 15, $sub_char3, value);
	}


	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public String match_typ() {
		return getConstString(offset + 16, $match_typ);
	}

	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public void match_typ(String value) {
		setConstString(offset + 16, $match_typ, value);
	}


	public String getString(String name) {
		if ($calc_no_input.equalsIgnoreCase(name)) {
			return calc_no_input();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($y_fr.equalsIgnoreCase(name)) {
			return y_fr();
		}
		if ($y_to.equalsIgnoreCase(name)) {
			return y_to();
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			return m_fr();
		}
		if ($m_to.equalsIgnoreCase(name)) {
			return m_to();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($calc_no_input.equalsIgnoreCase(name)) {
			return calc_no_input();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($match_typ.equalsIgnoreCase(name)) {
			return match_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($y_fr.equalsIgnoreCase(name)) {
			return y_fr();
		}
		if ($y_to.equalsIgnoreCase(name)) {
			return y_to();
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			return m_fr();
		}
		if ($m_to.equalsIgnoreCase(name)) {
			return m_to();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym_fr.equalsIgnoreCase(name)) {
			return ym_fr();
		}
		if ($ym_to.equalsIgnoreCase(name)) {
			return ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_no_input.equalsIgnoreCase(name)) {
			calc_no_input(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_no_input.equalsIgnoreCase(name)) {
			calc_no_input(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
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
		if ($match_typ.equalsIgnoreCase(name)) {
			match_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($y_fr.equalsIgnoreCase(name)) {
			y_fr(value);
			return;
		}
		if ($y_to.equalsIgnoreCase(name)) {
			y_to(value);
			return;
		}
		if ($m_fr.equalsIgnoreCase(name)) {
			m_fr(value);
			return;
		}
		if ($m_to.equalsIgnoreCase(name)) {
			m_to(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
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
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0240.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term_fr() {
		return term_p().term_fr();
	}

	public void term_fr(MCDate value) {
		term_p().term_fr(value);
	}

	public MCDate term_to() {
		return term_p().term_to();
	}

	public void term_to(MCDate value) {
		term_p().term_to(value);
	}

}

