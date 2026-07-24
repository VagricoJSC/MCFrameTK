package mcframe.serverMSBC.MSBCB0020;

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
 * ブロック"PrcdMrp_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PrcdMrp_CndR_MC_A extends MCConstRow {

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * GI schedule FROM 出庫予定ＦＲＯＭ.<p>
	 *
	 */
	public static final String $gi_schd_fr = "gi_schd_fr";
	/**
	 * Independent requirement FROM 独立所要ＦＲＯＭ.<p>
	 *
	 */
	public static final String $irqmt_fr = "irqmt_fr";


	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_schd_fr_META = createCommonMeta($gi_schd_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta irqmt_fr_META = createCommonMeta($irqmt_fr, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<PrcdMrp_CndR> constMetas = new ConstMetaList<PrcdMrp_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_cd_META,
			gi_schd_fr_META,
			irqmt_fr_META
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
	protected PrcdMrp_CndR_MC_A(ConstMetaList<? extends PrcdMrp_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PrcdMrp_CndR clone() {
		return (PrcdMrp_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PrcdMrp_CndR createInstance() {
		return (PrcdMrp_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PrcdMrp_CndR getValues(String... names) {
		return (PrcdMrp_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}


	/**
	 * GI schedule FROM 出庫予定ＦＲＯＭ.<p>
	 *
	 */
	public MCDate gi_schd_fr() {
		return getConstDate(offset + 1, $gi_schd_fr);
	}

	/**
	 * GI schedule FROM 出庫予定ＦＲＯＭ.<p>
	 *
	 */
	public void gi_schd_fr(MCDate value) {
		setConstDate(offset + 1, $gi_schd_fr, value);
	}


	/**
	 * Independent requirement FROM 独立所要ＦＲＯＭ.<p>
	 *
	 */
	public MCDate irqmt_fr() {
		return getConstDate(offset + 2, $irqmt_fr);
	}

	/**
	 * Independent requirement FROM 独立所要ＦＲＯＭ.<p>
	 *
	 */
	public void irqmt_fr(MCDate value) {
		setConstDate(offset + 2, $irqmt_fr, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			return gi_schd_fr();
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			return irqmt_fr();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			return gi_schd_fr();
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			return irqmt_fr();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			gi_schd_fr(value);
			return;
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			irqmt_fr(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($gi_schd_fr.equalsIgnoreCase(name)) {
			gi_schd_fr(value);
			return;
		}
		if ($irqmt_fr.equalsIgnoreCase(name)) {
			irqmt_fr(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

