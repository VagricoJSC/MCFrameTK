package mcframe.serverMSBC.MSBCL1130;

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
 * ブロック"Sprt01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Numbering lot ロット発番.<p>
	 *
	 */
	public static final String $lot_issue_flg = "lot_issue_flg";
	/**
	 * Sublot numbering サブロット発番.<p>
	 *
	 */
	public static final String $sublot_issue_flg = "sublot_issue_flg";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";


	public static final MCMeta lot_issue_flg_META = createCommonMeta($lot_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_issue_flg_META = createCommonMeta($sublot_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);

	protected static final ConstMetaList<Sprt01_CtrlR> constMetas = new ConstMetaList<Sprt01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lot_issue_flg_META,
			sublot_issue_flg_META,
			itm_mfg_inst_no_META,
			mfg_inst_no_META,
			mfg_act_no_META
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
	protected Sprt01_CtrlR_MC_A(ConstMetaList<? extends Sprt01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_CtrlR clone() {
		return (Sprt01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_CtrlR createInstance() {
		return (Sprt01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_CtrlR getValues(String... names) {
		return (Sprt01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Numbering lot ロット発番.<p>
	 *
	 */
	public boolean lot_issue_flg() {
		return getConstBoolean(offset + 0, $lot_issue_flg);
	}

	/**
	 * Numbering lot ロット発番.<p>
	 *
	 */
	public void lot_issue_flg(boolean value) {
		setConstBoolean(offset + 0, $lot_issue_flg, value);
	}


	/**
	 * Sublot numbering サブロット発番.<p>
	 *
	 */
	public boolean sublot_issue_flg() {
		return getConstBoolean(offset + 1, $sublot_issue_flg);
	}

	/**
	 * Sublot numbering サブロット発番.<p>
	 *
	 */
	public void sublot_issue_flg(boolean value) {
		setConstBoolean(offset + 1, $sublot_issue_flg, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 3, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 3, $mfg_inst_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 4, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 4, $mfg_act_no, value);
	}


	public String getString(String name) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			return lot_issue_flg();
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			return sublot_issue_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			return lot_issue_flg();
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			return sublot_issue_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			lot_issue_flg(value);
			return;
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			sublot_issue_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			lot_issue_flg(value);
			return;
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			sublot_issue_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

