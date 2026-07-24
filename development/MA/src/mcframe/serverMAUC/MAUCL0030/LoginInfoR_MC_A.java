package mcframe.serverMAUC.MAUCL0030;

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
 * ブロック"LoginInfo"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LoginInfoR_MC_A extends MCConstRow {

	/**
	 * Login user ログインユーザ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * Search only flg. 検索のみＦＬＧ.<p>
	 *
	 */
	public static final String $srch_only_flg = "srch_only_flg";


	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta srch_only_flg_META = createCommonMeta($srch_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LoginInfoR> constMetas = new ConstMetaList<LoginInfoR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			usr_cd_META,
			srch_only_flg_META
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
	protected LoginInfoR_MC_A(ConstMetaList<? extends LoginInfoR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LoginInfoR clone() {
		return (LoginInfoR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LoginInfoR createInstance() {
		return (LoginInfoR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LoginInfoR getValues(String... names) {
		return (LoginInfoR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Login user ログインユーザ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 0, $usr_cd);
	}

	/**
	 * Login user ログインユーザ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 0, $usr_cd, value);
	}


	/**
	 * Search only flg. 検索のみＦＬＧ.<p>
	 *
	 */
	public boolean srch_only_flg() {
		return getConstBoolean(offset + 1, $srch_only_flg);
	}

	/**
	 * Search only flg. 検索のみＦＬＧ.<p>
	 *
	 */
	public void srch_only_flg(boolean value) {
		setConstBoolean(offset + 1, $srch_only_flg, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($srch_only_flg.equalsIgnoreCase(name)) {
			return srch_only_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($srch_only_flg.equalsIgnoreCase(name)) {
			return srch_only_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($srch_only_flg.equalsIgnoreCase(name)) {
			srch_only_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($srch_only_flg.equalsIgnoreCase(name)) {
			srch_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

