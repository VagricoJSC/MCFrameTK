package mcframe.serverMSBC.MSBCL1040;

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


	public static final MCMeta lot_issue_flg_META = createCommonMeta($lot_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_issue_flg_META = createCommonMeta($sublot_issue_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Sprt01_CtrlR> constMetas = new ConstMetaList<Sprt01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lot_issue_flg_META,
			sublot_issue_flg_META
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


	public boolean getBoolean(String name) {
		if ($lot_issue_flg.equalsIgnoreCase(name)) {
			return lot_issue_flg();
		}
		if ($sublot_issue_flg.equalsIgnoreCase(name)) {
			return sublot_issue_flg();
		}
		return super.getBoolean(name);
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

