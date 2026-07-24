package mcframe.clientMGBD.MGBDP0030;

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
	 * REF,View,REF;UPD,Modify,UPD;DEL,Delete,DEL;DEL_ADMIN,Delete (Administrator),DEL_ADMIN REF,参照する,REF;UPD,訂正する,UPD;DEL,削除する,DEL;DEL_ADMIN,削除する（管理者）,DEL_ADMIN.<p>
	 *
	 */
	public static final String $ope = "ope";
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
	public static final String $calc_no_p = "calc_no_p";
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
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public static final String $st_ym = "st_ym";
	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public static final String $end_ym = "end_ym";
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
	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public static final String $menu_cd = "menu_cd";
	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public static final String $menu_nm = "menu_nm";

	public static final String $term = $term_p + ".term";
	public static final String $term_end_ym = $term_p + ".term_end_ym";
	public static final String $calc_no = $calc_no_p + ".calc_no";
	public static final String $invisible_rmrks = $calc_no_p + ".rmrks";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_no_p_META = createInnerRowMeta($calc_no_p, mcframe.clientMGUB.MGUBP0010.CalcNoR.class);
	public static final MCMeta calc_usr_cd_META = createCommonMeta($calc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta calc_usr_nm_META = createCommonMeta($calc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta st_ym_META = createCommonMeta($st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_META = createCommonMeta($end_ym, mcframe.commonMA.meta.MA_META.YM);
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
	public static final MCMeta menu_cd_META = createCommonMeta($menu_cd, mcframe.commonMA.meta.MA_META.MENU_CD);
	public static final MCMeta menu_nm_META = createCommonMeta($menu_nm, mcframe.commonMA.meta.MA_META.MENU_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			term_p_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_no_p_META,
			calc_usr_cd_META,
			calc_usr_nm_META,
			st_ym_META,
			end_ym_META,
			rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			fix_true_flg_META,
			fix_false_flg_META,
			non_del_true_flg_META,
			non_del_false_flg_META,
			calc_err_true_flg_META,
			calc_err_false_flg_META,
			menu_cd_META,
			menu_nm_META
		},
		new String[][]{
			{
				"term",
				"term_end_ym",
				"calc_no",
				"invisible_rmrks"
			},
			{
				$term,
				$term_end_ym,
				$calc_no,
				$invisible_rmrks
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
				{$calc_grp_cd, "calc_grp_nm"},	// calc_grp_cd
				{$calc_no_p + ".calc_no", "rmrks"},	// calc_no_p.calc_no
				{$calc_usr_cd, "usr_nm"},	// calc_usr_cd
				{$menu_cd, "menu_nm"}	// menu_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$calc_no_p + ".calc_no", "term;calc_grp_cd"},	// calc_no_p.calc_no
				{$menu_cd, "calc_grp_cd"}	// menu_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$calc_no_p + ".calc_no", "term;calc_grp_cd"},	// calc_no_p.calc_no
				{$menu_cd, "calc_grp_cd"}	// menu_cd
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



	/**
	 * REF,View,REF;UPD,Modify,UPD;DEL,Delete,DEL;DEL_ADMIN,Delete (Administrator),DEL_ADMIN REF,参照する,REF;UPD,訂正する,UPD;DEL,削除する,DEL;DEL_ADMIN,削除する（管理者）,DEL_ADMIN.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * REF,View,REF;UPD,Modify,UPD;DEL,Delete,DEL;DEL_ADMIN,Delete (Administrator),DEL_ADMIN REF,参照する,REF;UPD,訂正する,UPD;DEL,削除する,DEL;DEL_ADMIN,削除する（管理者）,DEL_ADMIN.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	public mcframe.clientMAUB.MAUBP0230.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 1, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 1, $term_p, row);
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


	public mcframe.clientMGUB.MGUBP0010.CalcNoR calc_no_p(){
		return (mcframe.clientMGUB.MGUBP0010.CalcNoR) getConstInnerRow(offset + 4, $calc_no_p);
	}
	
	public void calc_no_p(mcframe.clientMGUB.MGUBP0010.CalcNoR row){
		setConstInnerRow(offset + 4, $calc_no_p, row);
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
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCDate st_ym() {
		return getConstDate(offset + 7, $st_ym);
	}

	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		setConstDate(offset + 7, $st_ym, value);
	}


	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCDate end_ym() {
		return getConstDate(offset + 8, $end_ym);
	}

	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		setConstDate(offset + 8, $end_ym, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 9, $rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 9, $rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 10, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 10, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 11, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 11, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 12, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 12, $sub_char3, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_true_flg() {
		return getConstBoolean(offset + 13, $fix_true_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_true_flg(boolean value) {
		setConstBoolean(offset + 13, $fix_true_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean fix_false_flg() {
		return getConstBoolean(offset + 14, $fix_false_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void fix_false_flg(boolean value) {
		setConstBoolean(offset + 14, $fix_false_flg, value);
	}


	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public boolean non_del_true_flg() {
		return getConstBoolean(offset + 15, $non_del_true_flg);
	}

	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public void non_del_true_flg(boolean value) {
		setConstBoolean(offset + 15, $non_del_true_flg, value);
	}


	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public boolean non_del_false_flg() {
		return getConstBoolean(offset + 16, $non_del_false_flg);
	}

	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public void non_del_false_flg(boolean value) {
		setConstBoolean(offset + 16, $non_del_false_flg, value);
	}


	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public boolean calc_err_true_flg() {
		return getConstBoolean(offset + 17, $calc_err_true_flg);
	}

	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public void calc_err_true_flg(boolean value) {
		setConstBoolean(offset + 17, $calc_err_true_flg, value);
	}


	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public boolean calc_err_false_flg() {
		return getConstBoolean(offset + 18, $calc_err_false_flg);
	}

	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public void calc_err_false_flg(boolean value) {
		setConstBoolean(offset + 18, $calc_err_false_flg, value);
	}


	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public String menu_cd() {
		return getConstString(offset + 19, $menu_cd);
	}

	/**
	 * Menu cd. メニューＣＤ.<p>
	 *
	 */
	public void menu_cd(String value) {
		setConstString(offset + 19, $menu_cd, value);
	}


	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public String menu_nm() {
		return getConstString(offset + 20, $menu_nm);
	}

	/**
	 * Menu name メニュー名.<p>
	 *
	 */
	public void menu_nm(String value) {
		setConstString(offset + 20, $menu_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			return menu_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
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
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			return menu_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			menu_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		if ($menu_nm.equalsIgnoreCase(name)) {
			menu_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
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

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		if ($calc_no_p.equalsIgnoreCase(name)) {
			return calc_no_p();
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
		if ($calc_no_p.equalsIgnoreCase(name)) {
			calc_no_p(
				((MCContainerMeta) calc_no_p_META).castInnerRow(mcframe.clientMGUB.MGUBP0010.CalcNoR.class, value)
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

	public String calc_no() {
		return calc_no_p().calc_no();
	}

	public void calc_no(String value) {
		calc_no_p().calc_no(value);
	}

	public String invisible_rmrks() {
		return calc_no_p().rmrks();
	}

	public void invisible_rmrks(String value) {
		calc_no_p().rmrks(value);
	}

}

