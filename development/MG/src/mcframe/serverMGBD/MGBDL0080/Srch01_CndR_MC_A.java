package mcframe.serverMGBD.MGBDL0080;

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
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public static final String $ins_srv_req_no = "ins_srv_req_no";
	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public static final String $calc_usr_cd = "calc_usr_cd";
	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public static final String $calc_usr_nm = "calc_usr_nm";
	/**
	 * First month of the term FROM 対象期間先頭年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $st_ym_fr = "st_ym_fr";
	/**
	 * First month of the term TO 対象期間先頭年月ＴＯ.<p>
	 *
	 */
	public static final String $st_ym_to = "st_ym_to";
	/**
	 * Last month of the term FROM 対象期間末尾年月ＦＲＯＭ.<p>
	 *
	 */
	public static final String $end_ym_fr = "end_ym_fr";
	/**
	 * Last month of the term TO 対象期間末尾年月ＴＯ.<p>
	 *
	 */
	public static final String $end_ym_to = "end_ym_to";
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
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_true_flg = "fix_true_flg";
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public static final String $fix_false_flg = "fix_false_flg";
	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public static final String $non_del_true_flg = "non_del_true_flg";
	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public static final String $non_del_false_flg = "non_del_false_flg";
	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public static final String $calc_err_true_flg = "calc_err_true_flg";
	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public static final String $calc_err_false_flg = "calc_err_false_flg";


	public static final MCMeta term_fr_META = createCommonMeta($term_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_to_META = createCommonMeta($term_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta ins_srv_req_no_META = createCommonMeta($ins_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta calc_usr_cd_META = createCommonMeta($calc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta calc_usr_nm_META = createCommonMeta($calc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta st_ym_fr_META = createCommonMeta($st_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta st_ym_to_META = createCommonMeta($st_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_fr_META = createCommonMeta($end_ym_fr, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_to_META = createCommonMeta($end_ym_to, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMG.meta.MG_META.CALC_ARG_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMG.meta.MG_META.CALC_ARG_SUB_CHAR3);
	public static final MCMeta fix_true_flg_META = createCommonMeta($fix_true_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_false_flg_META = createCommonMeta($fix_false_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_del_true_flg_META = createCommonMeta($non_del_true_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_del_false_flg_META = createCommonMeta($non_del_false_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_err_true_flg_META = createCommonMeta($calc_err_true_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_err_false_flg_META = createCommonMeta($calc_err_false_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_fr_META,
			term_to_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			ins_srv_req_no_META,
			calc_usr_cd_META,
			calc_usr_nm_META,
			st_ym_fr_META,
			st_ym_to_META,
			end_ym_fr_META,
			end_ym_to_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			fix_true_flg_META,
			fix_false_flg_META,
			non_del_true_flg_META,
			non_del_false_flg_META,
			calc_err_true_flg_META,
			calc_err_false_flg_META
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
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 2, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 2, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 3, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 3, $calc_grp_nm, value);
	}


	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public String ins_srv_req_no() {
		return getConstString(offset + 4, $ins_srv_req_no);
	}

	/**
	 * Entry request No. 登録リクエストＮＯ.<p>
	 *
	 */
	public void ins_srv_req_no(String value) {
		setConstString(offset + 4, $ins_srv_req_no, value);
	}


	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public String calc_usr_cd() {
		return getConstString(offset + 5, $calc_usr_cd);
	}

	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public void calc_usr_cd(String value) {
		setConstString(offset + 5, $calc_usr_cd, value);
	}


	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public String calc_usr_nm() {
		return getConstString(offset + 6, $calc_usr_nm);
	}

	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public void calc_usr_nm(String value) {
		setConstString(offset + 6, $calc_usr_nm, value);
	}


	/**
	 * First month of the term FROM 対象期間先頭年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate st_ym_fr() {
		return getConstDate(offset + 7, $st_ym_fr);
	}

	/**
	 * First month of the term FROM 対象期間先頭年月ＦＲＯＭ.<p>
	 *
	 */
	public void st_ym_fr(MCDate value) {
		setConstDate(offset + 7, $st_ym_fr, value);
	}


	/**
	 * First month of the term TO 対象期間先頭年月ＴＯ.<p>
	 *
	 */
	public MCDate st_ym_to() {
		return getConstDate(offset + 8, $st_ym_to);
	}

	/**
	 * First month of the term TO 対象期間先頭年月ＴＯ.<p>
	 *
	 */
	public void st_ym_to(MCDate value) {
		setConstDate(offset + 8, $st_ym_to, value);
	}


	/**
	 * Last month of the term FROM 対象期間末尾年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDate end_ym_fr() {
		return getConstDate(offset + 9, $end_ym_fr);
	}

	/**
	 * Last month of the term FROM 対象期間末尾年月ＦＲＯＭ.<p>
	 *
	 */
	public void end_ym_fr(MCDate value) {
		setConstDate(offset + 9, $end_ym_fr, value);
	}


	/**
	 * Last month of the term TO 対象期間末尾年月ＴＯ.<p>
	 *
	 */
	public MCDate end_ym_to() {
		return getConstDate(offset + 10, $end_ym_to);
	}

	/**
	 * Last month of the term TO 対象期間末尾年月ＴＯ.<p>
	 *
	 */
	public void end_ym_to(MCDate value) {
		setConstDate(offset + 10, $end_ym_to, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 11, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 11, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 12, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 12, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 13, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 13, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 14, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 14, $sub_char3, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_true_flg() {
		return getConstBoolean(offset + 15, $fix_true_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_true_flg(boolean value) {
		setConstBoolean(offset + 15, $fix_true_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean fix_false_flg() {
		return getConstBoolean(offset + 16, $fix_false_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void fix_false_flg(boolean value) {
		setConstBoolean(offset + 16, $fix_false_flg, value);
	}


	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public boolean non_del_true_flg() {
		return getConstBoolean(offset + 17, $non_del_true_flg);
	}

	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public void non_del_true_flg(boolean value) {
		setConstBoolean(offset + 17, $non_del_true_flg, value);
	}


	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public boolean non_del_false_flg() {
		return getConstBoolean(offset + 18, $non_del_false_flg);
	}

	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public void non_del_false_flg(boolean value) {
		setConstBoolean(offset + 18, $non_del_false_flg, value);
	}


	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public boolean calc_err_true_flg() {
		return getConstBoolean(offset + 19, $calc_err_true_flg);
	}

	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public void calc_err_true_flg(boolean value) {
		setConstBoolean(offset + 19, $calc_err_true_flg, value);
	}


	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public boolean calc_err_false_flg() {
		return getConstBoolean(offset + 20, $calc_err_false_flg);
	}

	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public void calc_err_false_flg(boolean value) {
		setConstBoolean(offset + 20, $calc_err_false_flg, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
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
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			return st_ym_fr();
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			return st_ym_to();
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			return end_ym_fr();
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			return end_ym_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($fix_true_flg.equalsIgnoreCase(name)) {
			return fix_true_flg();
		}
		if ($fix_false_flg.equalsIgnoreCase(name)) {
			return fix_false_flg();
		}
		if ($non_del_true_flg.equalsIgnoreCase(name)) {
			return non_del_true_flg();
		}
		if ($non_del_false_flg.equalsIgnoreCase(name)) {
			return non_del_false_flg();
		}
		if ($calc_err_true_flg.equalsIgnoreCase(name)) {
			return calc_err_true_flg();
		}
		if ($calc_err_false_flg.equalsIgnoreCase(name)) {
			return calc_err_false_flg();
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
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
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
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			return st_ym_fr();
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			return st_ym_to();
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			return end_ym_fr();
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			return end_ym_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($fix_true_flg.equalsIgnoreCase(name)) {
			return fix_true_flg();
		}
		if ($fix_false_flg.equalsIgnoreCase(name)) {
			return fix_false_flg();
		}
		if ($non_del_true_flg.equalsIgnoreCase(name)) {
			return non_del_true_flg();
		}
		if ($non_del_false_flg.equalsIgnoreCase(name)) {
			return non_del_false_flg();
		}
		if ($calc_err_true_flg.equalsIgnoreCase(name)) {
			return calc_err_true_flg();
		}
		if ($calc_err_false_flg.equalsIgnoreCase(name)) {
			return calc_err_false_flg();
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
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
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
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			st_ym_fr(value);
			return;
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			st_ym_to(value);
			return;
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			end_ym_fr(value);
			return;
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			end_ym_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($fix_true_flg.equalsIgnoreCase(name)) {
			fix_true_flg(value);
			return;
		}
		if ($fix_false_flg.equalsIgnoreCase(name)) {
			fix_false_flg(value);
			return;
		}
		if ($non_del_true_flg.equalsIgnoreCase(name)) {
			non_del_true_flg(value);
			return;
		}
		if ($non_del_false_flg.equalsIgnoreCase(name)) {
			non_del_false_flg(value);
			return;
		}
		if ($calc_err_true_flg.equalsIgnoreCase(name)) {
			calc_err_true_flg(value);
			return;
		}
		if ($calc_err_false_flg.equalsIgnoreCase(name)) {
			calc_err_false_flg(value);
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
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
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
		if ($st_ym_fr.equalsIgnoreCase(name)) {
			st_ym_fr(value);
			return;
		}
		if ($st_ym_to.equalsIgnoreCase(name)) {
			st_ym_to(value);
			return;
		}
		if ($end_ym_fr.equalsIgnoreCase(name)) {
			end_ym_fr(value);
			return;
		}
		if ($end_ym_to.equalsIgnoreCase(name)) {
			end_ym_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($fix_true_flg.equalsIgnoreCase(name)) {
			fix_true_flg(value);
			return;
		}
		if ($fix_false_flg.equalsIgnoreCase(name)) {
			fix_false_flg(value);
			return;
		}
		if ($non_del_true_flg.equalsIgnoreCase(name)) {
			non_del_true_flg(value);
			return;
		}
		if ($non_del_false_flg.equalsIgnoreCase(name)) {
			non_del_false_flg(value);
			return;
		}
		if ($calc_err_true_flg.equalsIgnoreCase(name)) {
			calc_err_true_flg(value);
			return;
		}
		if ($calc_err_false_flg.equalsIgnoreCase(name)) {
			calc_err_false_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

