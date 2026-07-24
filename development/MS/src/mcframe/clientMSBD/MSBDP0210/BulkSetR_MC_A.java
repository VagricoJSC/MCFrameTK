package mcframe.clientMSBD.MSBDP0210;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public static final String $pf_usr_cd = "pf_usr_cd";
	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public static final String $pf_usr_nm = "pf_usr_nm";
	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public static final String $pf_dpt_cd = "pf_dpt_cd";
	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public static final String $pf_dpt_nm = "pf_dpt_nm";


	public static final MCMeta pf_usr_cd_META = createCommonMeta($pf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pf_usr_nm_META = createCommonMeta($pf_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta pf_dpt_cd_META = createCommonMeta($pf_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pf_dpt_nm_META = createCommonMeta($pf_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pf_usr_cd_META,
			pf_usr_nm_META,
			pf_dpt_cd_META,
			pf_dpt_nm_META
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$pf_usr_cd, "usr_nm;dpt_cd"},	// pf_usr_cd
				{$pf_dpt_cd, "dpt_nm"}	// pf_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$pf_dpt_cd, "MAC_DPT_IS_SRCH_TYP.PURC;true;true"}	// pf_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$pf_dpt_cd, "dpt_is_srch_typ;wr_flg;mode_today_flg"}	// pf_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public String pf_usr_cd() {
		return getConstString(offset + 0, $pf_usr_cd);
	}

	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public void pf_usr_cd(String value) {
		setConstString(offset + 0, $pf_usr_cd, value);
	}


	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public String pf_usr_nm() {
		return getConstString(offset + 1, $pf_usr_nm);
	}

	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public void pf_usr_nm(String value) {
		setConstString(offset + 1, $pf_usr_nm, value);
	}


	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public String pf_dpt_cd() {
		return getConstString(offset + 2, $pf_dpt_cd);
	}

	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public void pf_dpt_cd(String value) {
		setConstString(offset + 2, $pf_dpt_cd, value);
	}


	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public String pf_dpt_nm() {
		return getConstString(offset + 3, $pf_dpt_nm);
	}

	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public void pf_dpt_nm(String value) {
		setConstString(offset + 3, $pf_dpt_nm, value);
	}


	public String getString(String name) {
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
			return;
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
			return;
		}
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

