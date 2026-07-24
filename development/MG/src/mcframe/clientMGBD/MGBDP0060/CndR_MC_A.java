package mcframe.clientMGBD.MGBDP0060;

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
	 * REF,View,REF;DEL,Delete,DEL REF,参照する,REF;DEL,削除する,DEL.<p>
	 *
	 */
	public static final String $ope = "ope";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_usr_cd_META = createCommonMeta($calc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta calc_usr_nm_META = createCommonMeta($calc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			calc_usr_cd_META,
			calc_usr_nm_META
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$calc_usr_cd, "usr_nm"}	// calc_usr_cd
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
	 * REF,View,REF;DEL,Delete,DEL REF,参照する,REF;DEL,削除する,DEL.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * REF,View,REF;DEL,Delete,DEL REF,参照する,REF;DEL,削除する,DEL.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public String calc_usr_cd() {
		return getConstString(offset + 1, $calc_usr_cd);
	}

	/**
	 * Calculation user cd. 計算者ＣＤ.<p>
	 *
	 */
	public void calc_usr_cd(String value) {
		setConstString(offset + 1, $calc_usr_cd, value);
	}


	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public String calc_usr_nm() {
		return getConstString(offset + 2, $calc_usr_nm);
	}

	/**
	 * Calculation user name 計算者名.<p>
	 *
	 */
	public void calc_usr_nm(String value) {
		setConstString(offset + 2, $calc_usr_nm, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_usr_cd.equalsIgnoreCase(name)) {
			return calc_usr_cd();
		}
		if ($calc_usr_nm.equalsIgnoreCase(name)) {
			return calc_usr_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		super.setStringNE(name, value);
	}



}

