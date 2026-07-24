package mcframe.serverMSBE.MSBEL5200;

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
 * ブロック"XfrSchdMod_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrSchdMod_DtlR_MC_A extends MCConstRow {

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public static final String $xfr_src_no = "xfr_src_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Edited by request source flg. 依頼元訂正ＦＬＧ.<p>
	 *
	 */
	public static final String $rqst_mod_flg = "rqst_mod_flg";
	/**
	 * Unpegged flg. 紐切れＦＬＧ.<p>
	 *
	 */
	public static final String $rqst_can_flg = "rqst_can_flg";


	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta rqst_mod_flg_META = createCommonMeta($rqst_mod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_can_flg_META = createCommonMeta($rqst_can_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<XfrSchdMod_DtlR> constMetas = new ConstMetaList<XfrSchdMod_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			xfr_src_typ_META,
			xfr_src_no_META,
			xfr_schd_no_META,
			rqst_mod_flg_META,
			rqst_can_flg_META
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
	protected XfrSchdMod_DtlR_MC_A(ConstMetaList<? extends XfrSchdMod_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdMod_DtlR clone() {
		return (XfrSchdMod_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdMod_DtlR createInstance() {
		return (XfrSchdMod_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrSchdMod_DtlR getValues(String... names) {
		return (XfrSchdMod_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 0, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 0, $xfr_src_typ, value);
	}


	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 1, $xfr_src_no);
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 1, $xfr_src_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 2, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 2, $xfr_schd_no, value);
	}


	/**
	 * Edited by request source flg. 依頼元訂正ＦＬＧ.<p>
	 *
	 */
	public boolean rqst_mod_flg() {
		return getConstBoolean(offset + 3, $rqst_mod_flg);
	}

	/**
	 * Edited by request source flg. 依頼元訂正ＦＬＧ.<p>
	 *
	 */
	public void rqst_mod_flg(boolean value) {
		setConstBoolean(offset + 3, $rqst_mod_flg, value);
	}


	/**
	 * Unpegged flg. 紐切れＦＬＧ.<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return getConstBoolean(offset + 4, $rqst_can_flg);
	}

	/**
	 * Unpegged flg. 紐切れＦＬＧ.<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		setConstBoolean(offset + 4, $rqst_can_flg, value);
	}


	public String getString(String name) {
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			return rqst_mod_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rqst_mod_flg.equalsIgnoreCase(name)) {
			rqst_mod_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

