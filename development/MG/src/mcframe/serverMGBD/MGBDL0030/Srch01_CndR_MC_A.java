package mcframe.serverMGBD.MGBDL0030;

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
abstract class Srch01_CndR_MC_A extends mcframe.serverMG.dbc.MGT_ARG_R {

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


	public static final MCMeta calc_usr_cd_META = createCommonMeta($calc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta calc_usr_nm_META = createCommonMeta($calc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta fix_true_flg_META = createCommonMeta($fix_true_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_false_flg_META = createCommonMeta($fix_false_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_del_true_flg_META = createCommonMeta($non_del_true_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_del_false_flg_META = createCommonMeta($non_del_false_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_err_true_flg_META = createCommonMeta($calc_err_true_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta calc_err_false_flg_META = createCommonMeta($calc_err_false_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		mcframe.serverMG.dbc.MGT_ARG_R.constMetas,
		new MCMeta[]{
			calc_usr_cd_META,
			calc_usr_nm_META,
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
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public String calc_usr_cd() {
		return getConstString(offset + 0, $calc_usr_cd);
	}

	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public void calc_usr_cd(String value) {
		setConstString(offset + 0, $calc_usr_cd, value);
	}


	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public String calc_usr_nm() {
		return getConstString(offset + 1, $calc_usr_nm);
	}

	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public void calc_usr_nm(String value) {
		setConstString(offset + 1, $calc_usr_nm, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_true_flg() {
		return getConstBoolean(offset + 2, $fix_true_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_true_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_true_flg, value);
	}


	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public boolean fix_false_flg() {
		return getConstBoolean(offset + 3, $fix_false_flg);
	}

	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public void fix_false_flg(boolean value) {
		setConstBoolean(offset + 3, $fix_false_flg, value);
	}


	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public boolean non_del_true_flg() {
		return getConstBoolean(offset + 4, $non_del_true_flg);
	}

	/**
	 * Undeletable 削除不可.<p>
	 *
	 */
	public void non_del_true_flg(boolean value) {
		setConstBoolean(offset + 4, $non_del_true_flg, value);
	}


	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public boolean non_del_false_flg() {
		return getConstBoolean(offset + 5, $non_del_false_flg);
	}

	/**
	 * Deletable 削除可.<p>
	 *
	 */
	public void non_del_false_flg(boolean value) {
		setConstBoolean(offset + 5, $non_del_false_flg, value);
	}


	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public boolean calc_err_true_flg() {
		return getConstBoolean(offset + 6, $calc_err_true_flg);
	}

	/**
	 * Terminate on error エラー終了.<p>
	 *
	 */
	public void calc_err_true_flg(boolean value) {
		setConstBoolean(offset + 6, $calc_err_true_flg, value);
	}


	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public boolean calc_err_false_flg() {
		return getConstBoolean(offset + 7, $calc_err_false_flg);
	}

	/**
	 * Successful completion 正常終了.<p>
	 *
	 */
	public void calc_err_false_flg(boolean value) {
		setConstBoolean(offset + 7, $calc_err_false_flg, value);
	}


	public String getString(String name) {
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
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
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
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
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
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
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			calc_usr_cd(value);
			return;
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			calc_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
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

