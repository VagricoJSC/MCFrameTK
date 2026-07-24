package mcframe.clientMAUB.MAUBP5020;

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
 * ブロック"Ac_SubAc"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ac_SubAcR_MC_A extends MCConstRow {

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $ac_cd = "ac_cd";
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public static final String $ac_nm = "ac_nm";
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public static final String $sub_ac_cd = "sub_ac_cd";
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public static final String $sub_ac_nm = "sub_ac_nm";


	public static final MCMeta ac_cd_META = createCommonMeta($ac_cd, mcframe.commonMA.meta.MA_META.AC_CD);
	public static final MCMeta ac_nm_META = createCommonMeta($ac_nm, mcframe.commonMA.meta.MA_META.AC_NM);
	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_ac_cd_META = createCommonMeta($sub_ac_cd, mcframe.commonMA.meta.MA_META.SUB_AC_CD);
	public static final MCMeta sub_ac_nm_META = createCommonMeta($sub_ac_nm, mcframe.commonMA.meta.MA_META.SUB_AC_NM);

	protected static final ConstMetaList<Ac_SubAcR> constMetas = new ConstMetaList<Ac_SubAcR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ac_cd_META,
			ac_nm_META,
			sub_flg_META,
			sub_ac_cd_META,
			sub_ac_nm_META
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
	protected Ac_SubAcR_MC_A(ConstMetaList<? extends Ac_SubAcR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ac_SubAcR clone() {
		return (Ac_SubAcR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ac_SubAcR createInstance() {
		return (Ac_SubAcR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ac_SubAcR getValues(String... names) {
		return (Ac_SubAcR) super.getValues(names);
	}



	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public String ac_cd() {
		return getConstString(offset + 0, $ac_cd);
	}

	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public void ac_cd(String value) {
		setConstString(offset + 0, $ac_cd, value);
	}


	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public String ac_nm() {
		return getConstString(offset + 1, $ac_nm);
	}

	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public void ac_nm(String value) {
		setConstString(offset + 1, $ac_nm, value);
	}


	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 2, $sub_flg);
	}

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 2, $sub_flg, value);
	}


	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public String sub_ac_cd() {
		return getConstString(offset + 3, $sub_ac_cd);
	}

	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public void sub_ac_cd(String value) {
		setConstString(offset + 3, $sub_ac_cd, value);
	}


	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public String sub_ac_nm() {
		return getConstString(offset + 4, $sub_ac_nm);
	}

	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public void sub_ac_nm(String value) {
		setConstString(offset + 4, $sub_ac_nm, value);
	}


	public String getString(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			return sub_ac_cd();
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			return sub_ac_nm();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			return ac_cd();
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			return ac_nm();
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			return sub_ac_cd();
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			return sub_ac_nm();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			sub_ac_cd(value);
			return;
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			sub_ac_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_cd.equalsIgnoreCase(name)) {
			ac_cd(value);
			return;
		}
		if ($ac_nm.equalsIgnoreCase(name)) {
			ac_nm(value);
			return;
		}
		if ($sub_ac_cd.equalsIgnoreCase(name)) {
			sub_ac_cd(value);
			return;
		}
		if ($sub_ac_nm.equalsIgnoreCase(name)) {
			sub_ac_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

