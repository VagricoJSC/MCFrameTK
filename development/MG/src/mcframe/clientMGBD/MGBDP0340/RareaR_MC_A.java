package mcframe.clientMGBD.MGBDP0340;

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
 * ブロック"Rarea"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RareaR_MC_A extends MCConstRow {

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
	 * Parameter パラメータ.<p>
	 *
	 */
	public static final String $parm_key = "parm_key";
	/**
	 * Business classification 業務分類.<p>
	 *
	 */
	public static final String $parm_biz_grp = "parm_biz_grp";
	/**
	 * Overview 概要.<p>
	 *
	 */
	public static final String $parm_remark = "parm_remark";


	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta parm_key_META = createCommonMeta($parm_key, mcframe.commonMA.meta.MA_META.CALC_PARM_KEY);
	public static final MCMeta parm_biz_grp_META = createCommonMeta($parm_biz_grp, mcframe.commonMG.meta.MG_META.PARM_BIZ_GRP);
	public static final MCMeta parm_remark_META = createCommonMeta($parm_remark, mcframe.commonMG.meta.MG_META.PARM_REMARK);

	protected static final ConstMetaList<RareaR> constMetas = new ConstMetaList<RareaR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			calc_grp_cd_META,
			calc_grp_nm_META,
			parm_key_META,
			parm_biz_grp_META,
			parm_remark_META
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
	protected RareaR_MC_A(ConstMetaList<? extends RareaR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RareaR clone() {
		return (RareaR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RareaR createInstance() {
		return (RareaR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RareaR getValues(String... names) {
		return (RareaR) super.getValues(names);
	}



	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 0, $calc_grp_cd);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 0, $calc_grp_cd, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 1, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 1, $calc_grp_nm, value);
	}


	/**
	 * Parameter パラメータ.<p>
	 *
	 */
	public String parm_key() {
		return getConstString(offset + 2, $parm_key);
	}

	/**
	 * Parameter パラメータ.<p>
	 *
	 */
	public void parm_key(String value) {
		setConstString(offset + 2, $parm_key, value);
	}


	/**
	 * Business classification 業務分類.<p>
	 *
	 */
	public String parm_biz_grp() {
		return getConstString(offset + 3, $parm_biz_grp);
	}

	/**
	 * Business classification 業務分類.<p>
	 *
	 */
	public void parm_biz_grp(String value) {
		setConstString(offset + 3, $parm_biz_grp, value);
	}


	/**
	 * Overview 概要.<p>
	 *
	 */
	public String parm_remark() {
		return getConstString(offset + 4, $parm_remark);
	}

	/**
	 * Overview 概要.<p>
	 *
	 */
	public void parm_remark(String value) {
		setConstString(offset + 4, $parm_remark, value);
	}


	public String getString(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			return parm_biz_grp();
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			return parm_remark();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			return parm_biz_grp();
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			return parm_remark();
		}
		return super.getStringNE(name);
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
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			parm_biz_grp(value);
			return;
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			parm_remark(value);
			return;
		}
		super.setString(name, value);
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
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_biz_grp.equalsIgnoreCase(name)) {
			parm_biz_grp(value);
			return;
		}
		if ($parm_remark.equalsIgnoreCase(name)) {
			parm_remark(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

