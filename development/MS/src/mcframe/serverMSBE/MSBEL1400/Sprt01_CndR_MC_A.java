package mcframe.serverMSBE.MSBEL1400;

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
 * ブロック"Sprt01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_CndR_MC_A extends MCConstRow {

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public static final String $lot_chk_off_flg = "lot_chk_off_flg";


	public static final MCMeta lot_chk_off_flg_META = createCommonMeta($lot_chk_off_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Sprt01_CndR> constMetas = new ConstMetaList<Sprt01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lot_chk_off_flg_META
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
	protected Sprt01_CndR_MC_A(ConstMetaList<? extends Sprt01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_CndR clone() {
		return (Sprt01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_CndR createInstance() {
		return (Sprt01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_CndR getValues(String... names) {
		return (Sprt01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public boolean lot_chk_off_flg() {
		return getConstBoolean(offset + 0, $lot_chk_off_flg);
	}

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public void lot_chk_off_flg(boolean value) {
		setConstBoolean(offset + 0, $lot_chk_off_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

