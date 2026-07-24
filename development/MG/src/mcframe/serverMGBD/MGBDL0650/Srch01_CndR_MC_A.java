package mcframe.serverMGBD.MGBDL0650;

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
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public static final String $term_fr = "term_fr";
	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public static final String $term_to = "term_to";
	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public static final String $fr_cur_cd = "fr_cur_cd";
	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public static final String $fr_cur_nm = "fr_cur_nm";
	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public static final String $to_cur_cd = "to_cur_cd";
	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public static final String $to_cur_nm = "to_cur_nm";
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
	/**
	 * Firm. Off 確定.オフ.<p>
	 *
	 */
	public static final String $off_fix_flg = "off_fix_flg";
	/**
	 * Firm.off 確定.オン.<p>
	 *
	 */
	public static final String $on_fix_flg = "on_fix_flg";


	public static final MCMeta term_fr_META = createCommonMeta($term_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_to_META = createCommonMeta($term_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta fr_cur_cd_META = createCommonMeta($fr_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta fr_cur_nm_META = createCommonMeta($fr_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta to_cur_cd_META = createCommonMeta($to_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta to_cur_nm_META = createCommonMeta($to_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.CUR_XRATE_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.CUR_XRATE_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.CUR_XRATE_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.CUR_XRATE_SUB_CHAR3);
	public static final MCMeta off_fix_flg_META = createCommonMeta($off_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_fix_flg_META = createCommonMeta($on_fix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_fr_META,
			term_to_META,
			fr_cur_cd_META,
			fr_cur_nm_META,
			to_cur_cd_META,
			to_cur_nm_META,
			xrate_cd_META,
			xrate_nm_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			off_fix_flg_META,
			on_fix_flg_META
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
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public MCDate term_fr() {
		return getConstDate(offset + 0, $term_fr);
	}

	/**
	 * Term FROM 期ＦＲＯＭ.<p>
	 *
	 */
	public void term_fr(MCDate value) {
		setConstDate(offset + 0, $term_fr, value);
	}


	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public MCDate term_to() {
		return getConstDate(offset + 1, $term_to);
	}

	/**
	 * Term TO 期ＴＯ.<p>
	 *
	 */
	public void term_to(MCDate value) {
		setConstDate(offset + 1, $term_to, value);
	}


	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public String fr_cur_cd() {
		return getConstString(offset + 2, $fr_cur_cd);
	}

	/**
	 * Exchange-from currency cd. 換算元通貨ＣＤ.<p>
	 *
	 */
	public void fr_cur_cd(String value) {
		setConstString(offset + 2, $fr_cur_cd, value);
	}


	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public String fr_cur_nm() {
		return getConstString(offset + 3, $fr_cur_nm);
	}

	/**
	 * Exchange-from currency name 換算元通貨名.<p>
	 *
	 */
	public void fr_cur_nm(String value) {
		setConstString(offset + 3, $fr_cur_nm, value);
	}


	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public String to_cur_cd() {
		return getConstString(offset + 4, $to_cur_cd);
	}

	/**
	 * Exchange-to currency cd. 換算先通貨ＣＤ.<p>
	 *
	 */
	public void to_cur_cd(String value) {
		setConstString(offset + 4, $to_cur_cd, value);
	}


	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public String to_cur_nm() {
		return getConstString(offset + 5, $to_cur_nm);
	}

	/**
	 * Exchange-to currency name 換算先通貨名.<p>
	 *
	 */
	public void to_cur_nm(String value) {
		setConstString(offset + 5, $to_cur_nm, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 6, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 6, $xrate_cd, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 7, $xrate_nm);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 7, $xrate_nm, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 8, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 8, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 9, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 9, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 10, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 10, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 11, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 11, $sub_char3, value);
	}


	/**
	 * Firm. Off 確定.オフ.<p>
	 *
	 */
	public boolean off_fix_flg() {
		return getConstBoolean(offset + 12, $off_fix_flg);
	}

	/**
	 * Firm. Off 確定.オフ.<p>
	 *
	 */
	public void off_fix_flg(boolean value) {
		setConstBoolean(offset + 12, $off_fix_flg, value);
	}


	/**
	 * Firm.off 確定.オン.<p>
	 *
	 */
	public boolean on_fix_flg() {
		return getConstBoolean(offset + 13, $on_fix_flg);
	}

	/**
	 * Firm.off 確定.オン.<p>
	 *
	 */
	public void on_fix_flg(boolean value) {
		setConstBoolean(offset + 13, $on_fix_flg, value);
	}


	public String getString(String name) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			return fr_cur_nm();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			return to_cur_nm();
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
	public MCDate getDate(String name) {
		if ($term_fr.equalsIgnoreCase(name)) {
			return term_fr();
		}
		if ($term_to.equalsIgnoreCase(name)) {
			return term_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($off_fix_flg.equalsIgnoreCase(name)) {
			return off_fix_flg();
		}
		if ($on_fix_flg.equalsIgnoreCase(name)) {
			return on_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			return fr_cur_cd();
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			return fr_cur_nm();
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			return to_cur_cd();
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			return to_cur_nm();
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
	public MCDate getDateNE(String name) {
		if ($term_fr.equalsIgnoreCase(name)) {
			return term_fr();
		}
		if ($term_to.equalsIgnoreCase(name)) {
			return term_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($off_fix_flg.equalsIgnoreCase(name)) {
			return off_fix_flg();
		}
		if ($on_fix_flg.equalsIgnoreCase(name)) {
			return on_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			fr_cur_nm(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			to_cur_nm(value);
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
	public void setDate(String name, MCDate value) {
		if ($term_fr.equalsIgnoreCase(name)) {
			term_fr(value);
			return;
		}
		if ($term_to.equalsIgnoreCase(name)) {
			term_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($off_fix_flg.equalsIgnoreCase(name)) {
			off_fix_flg(value);
			return;
		}
		if ($on_fix_flg.equalsIgnoreCase(name)) {
			on_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fr_cur_cd.equalsIgnoreCase(name)) {
			fr_cur_cd(value);
			return;
		}
		if ($fr_cur_nm.equalsIgnoreCase(name)) {
			fr_cur_nm(value);
			return;
		}
		if ($to_cur_cd.equalsIgnoreCase(name)) {
			to_cur_cd(value);
			return;
		}
		if ($to_cur_nm.equalsIgnoreCase(name)) {
			to_cur_nm(value);
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
	public void setDateNE(String name, MCDate value) {
		if ($term_fr.equalsIgnoreCase(name)) {
			term_fr(value);
			return;
		}
		if ($term_to.equalsIgnoreCase(name)) {
			term_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($off_fix_flg.equalsIgnoreCase(name)) {
			off_fix_flg(value);
			return;
		}
		if ($on_fix_flg.equalsIgnoreCase(name)) {
			on_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

