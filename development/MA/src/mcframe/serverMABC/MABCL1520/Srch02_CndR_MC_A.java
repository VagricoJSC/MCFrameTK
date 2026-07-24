package mcframe.serverMABC.MABCL1520;

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
 * ブロック"Srch02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_CndR_MC_A extends MCConstRow {

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd2 = "ext_sys_cd2";
	/**
	 * IF column type ＩＦ項目区分.<p>
	 *
	 */
	public static final String $if_col_typ2 = "if_col_typ2";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd2 = "bp_cd2";
	/**
	 * Set for each BP 取引先別に設定する.<p>
	 *
	 */
	public static final String $each_bp_flg = "each_bp_flg";
	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public static final String $srv_req_no = "srv_req_no";


	public static final MCMeta ext_sys_cd2_META = createCommonMeta($ext_sys_cd2, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta if_col_typ2_META = createCommonMeta($if_col_typ2, mcframe.commonMA.meta.MA_META.IF_COL_TYP);
	public static final MCMeta bp_cd2_META = createCommonMeta($bp_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta each_bp_flg_META = createCommonMeta($each_bp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta srv_req_no_META = createCommonMeta($srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch02_CndR> constMetas = new ConstMetaList<Srch02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ext_sys_cd2_META,
			if_col_typ2_META,
			bp_cd2_META,
			each_bp_flg_META,
			srv_req_no_META
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
	protected Srch02_CndR_MC_A(ConstMetaList<? extends Srch02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR clone() {
		return (Srch02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR createInstance() {
		return (Srch02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_CndR getValues(String... names) {
		return (Srch02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd2() {
		return getConstString(offset + 0, $ext_sys_cd2);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd2(String value) {
		setConstString(offset + 0, $ext_sys_cd2, value);
	}


	/**
	 * IF column type ＩＦ項目区分.<p>
	 *
	 */
	public String if_col_typ2() {
		return getConstString(offset + 1, $if_col_typ2);
	}

	/**
	 * IF column type ＩＦ項目区分.<p>
	 *
	 */
	public void if_col_typ2(String value) {
		setConstString(offset + 1, $if_col_typ2, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd2() {
		return getConstString(offset + 2, $bp_cd2);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd2(String value) {
		setConstString(offset + 2, $bp_cd2, value);
	}


	/**
	 * Set for each BP 取引先別に設定する.<p>
	 *
	 */
	public boolean each_bp_flg() {
		return getConstBoolean(offset + 3, $each_bp_flg);
	}

	/**
	 * Set for each BP 取引先別に設定する.<p>
	 *
	 */
	public void each_bp_flg(boolean value) {
		setConstBoolean(offset + 3, $each_bp_flg, value);
	}


	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public String srv_req_no() {
		return getConstString(offset + 4, $srv_req_no);
	}

	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public void srv_req_no(String value) {
		setConstString(offset + 4, $srv_req_no, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			return ext_sys_cd2();
		}
		if ($if_col_typ2.equalsIgnoreCase(name)) {
			return if_col_typ2();
		}
		if ($bp_cd2.equalsIgnoreCase(name)) {
			return bp_cd2();
		}
		if ($srv_req_no.equalsIgnoreCase(name)) {
			return srv_req_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($each_bp_flg.equalsIgnoreCase(name)) {
			return each_bp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			return ext_sys_cd2();
		}
		if ($if_col_typ2.equalsIgnoreCase(name)) {
			return if_col_typ2();
		}
		if ($bp_cd2.equalsIgnoreCase(name)) {
			return bp_cd2();
		}
		if ($srv_req_no.equalsIgnoreCase(name)) {
			return srv_req_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($each_bp_flg.equalsIgnoreCase(name)) {
			return each_bp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			ext_sys_cd2(value);
			return;
		}
		if ($if_col_typ2.equalsIgnoreCase(name)) {
			if_col_typ2(value);
			return;
		}
		if ($bp_cd2.equalsIgnoreCase(name)) {
			bp_cd2(value);
			return;
		}
		if ($srv_req_no.equalsIgnoreCase(name)) {
			srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($each_bp_flg.equalsIgnoreCase(name)) {
			each_bp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd2.equalsIgnoreCase(name)) {
			ext_sys_cd2(value);
			return;
		}
		if ($if_col_typ2.equalsIgnoreCase(name)) {
			if_col_typ2(value);
			return;
		}
		if ($bp_cd2.equalsIgnoreCase(name)) {
			bp_cd2(value);
			return;
		}
		if ($srv_req_no.equalsIgnoreCase(name)) {
			srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($each_bp_flg.equalsIgnoreCase(name)) {
			each_bp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

