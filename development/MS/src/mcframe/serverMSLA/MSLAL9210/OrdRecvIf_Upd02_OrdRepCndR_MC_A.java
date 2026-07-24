package mcframe.serverMSLA.MSLAL9210;

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
 * ブロック"OrdRecvIf_Upd02_OrdRepCnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OrdRecvIf_Upd02_OrdRepCndR_MC_A extends MCConstRow {

	/**
	 * Planned order refresh flg. オーダ洗い替えＦＬＧ.<p>
	 *
	 */
	public static final String $ord_rep_flg = "ord_rep_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public static final String $if_scheduler_typ = "if_scheduler_typ";
	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public static final String $allow_outsrc_schd_flg = "allow_outsrc_schd_flg";


	public static final MCMeta ord_rep_flg_META = createCommonMeta($ord_rep_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta if_scheduler_typ_META = createCommonMeta($if_scheduler_typ, mcframe.commonMS.meta.MS_META.IF_SCHEDULER_TYP);
	public static final MCMeta allow_outsrc_schd_flg_META = createCommonMeta($allow_outsrc_schd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<OrdRecvIf_Upd02_OrdRepCndR> constMetas = new ConstMetaList<OrdRecvIf_Upd02_OrdRepCndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ord_rep_flg_META,
			loc_cd_META,
			if_scheduler_typ_META,
			allow_outsrc_schd_flg_META
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
	protected OrdRecvIf_Upd02_OrdRepCndR_MC_A(ConstMetaList<? extends OrdRecvIf_Upd02_OrdRepCndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Upd02_OrdRepCndR clone() {
		return (OrdRecvIf_Upd02_OrdRepCndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Upd02_OrdRepCndR createInstance() {
		return (OrdRecvIf_Upd02_OrdRepCndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OrdRecvIf_Upd02_OrdRepCndR getValues(String... names) {
		return (OrdRecvIf_Upd02_OrdRepCndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Planned order refresh flg. オーダ洗い替えＦＬＧ.<p>
	 *
	 */
	public boolean ord_rep_flg() {
		return getConstBoolean(offset + 0, $ord_rep_flg);
	}

	/**
	 * Planned order refresh flg. オーダ洗い替えＦＬＧ.<p>
	 *
	 */
	public void ord_rep_flg(boolean value) {
		setConstBoolean(offset + 0, $ord_rep_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public String if_scheduler_typ() {
		return getConstString(offset + 2, $if_scheduler_typ);
	}

	/**
	 * Linkage scheduler type 連携スケジューラ区分.<p>
	 *
	 */
	public void if_scheduler_typ(String value) {
		setConstString(offset + 2, $if_scheduler_typ, value);
	}


	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public boolean allow_outsrc_schd_flg() {
		return getConstBoolean(offset + 3, $allow_outsrc_schd_flg);
	}

	/**
	 * Allow subcontracting scheduling flg. 外注スケジューリング許可ＦＬＧ.<p>
	 *
	 */
	public void allow_outsrc_schd_flg(boolean value) {
		setConstBoolean(offset + 3, $allow_outsrc_schd_flg, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			return ord_rep_flg();
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			return if_scheduler_typ();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			return ord_rep_flg();
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			return allow_outsrc_schd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			ord_rep_flg(value);
			return;
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($if_scheduler_typ.equalsIgnoreCase(name)) {
			if_scheduler_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($ord_rep_flg.equalsIgnoreCase(name)) {
			ord_rep_flg(value);
			return;
		}
		if ($allow_outsrc_schd_flg.equalsIgnoreCase(name)) {
			allow_outsrc_schd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

