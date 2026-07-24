package mcframe.serverMSBC.MSBCL6110;

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
 * ブロック"MfgInstActCom_Upd02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd02_CndR_MC_A extends MCConstRow {

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Copy input result 投入実績引継ぎ.<p>
	 *
	 */
	public static final String $act_flg = "act_flg";


	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta act_flg_META = createCommonMeta($act_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstActCom_Upd02_CndR> constMetas = new ConstMetaList<MfgInstActCom_Upd02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_mfg_inst_no_META,
			mfg_act_no_META,
			act_flg_META
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
	protected MfgInstActCom_Upd02_CndR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd02_CndR clone() {
		return (MfgInstActCom_Upd02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd02_CndR createInstance() {
		return (MfgInstActCom_Upd02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd02_CndR getValues(String... names) {
		return (MfgInstActCom_Upd02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 0, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 0, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 1, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 1, $mfg_act_no, value);
	}


	/**
	 * Copy input result 投入実績引継ぎ.<p>
	 *
	 */
	public boolean act_flg() {
		return getConstBoolean(offset + 2, $act_flg);
	}

	/**
	 * Copy input result 投入実績引継ぎ.<p>
	 *
	 */
	public void act_flg(boolean value) {
		setConstBoolean(offset + 2, $act_flg, value);
	}


	public String getString(String name) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($act_flg.equalsIgnoreCase(name)) {
			return act_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($act_flg.equalsIgnoreCase(name)) {
			act_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

