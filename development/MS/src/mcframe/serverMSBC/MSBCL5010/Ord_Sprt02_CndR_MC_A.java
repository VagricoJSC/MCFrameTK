package mcframe.serverMSBC.MSBCL5010;

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
 * ブロック"Ord_Sprt02_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ord_Sprt02_CndR_MC_A extends MCConstRow {

	/**
	 * Explode at order 指図時展開.<p>
	 *
	 */
	public static final String $inst_exp_flg = "inst_exp_flg";
	/**
	 * Supply unit price acquisition 支給単価取得.<p>
	 *
	 */
	public static final String $get_prov_upri_flg = "get_prov_upri_flg";


	public static final MCMeta inst_exp_flg_META = createCommonMeta($inst_exp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta get_prov_upri_flg_META = createCommonMeta($get_prov_upri_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Ord_Sprt02_CndR> constMetas = new ConstMetaList<Ord_Sprt02_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inst_exp_flg_META,
			get_prov_upri_flg_META
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
	protected Ord_Sprt02_CndR_MC_A(ConstMetaList<? extends Ord_Sprt02_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Sprt02_CndR clone() {
		return (Ord_Sprt02_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Sprt02_CndR createInstance() {
		return (Ord_Sprt02_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Sprt02_CndR getValues(String... names) {
		return (Ord_Sprt02_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Explode at order 指図時展開.<p>
	 *
	 */
	public boolean inst_exp_flg() {
		return getConstBoolean(offset + 0, $inst_exp_flg);
	}

	/**
	 * Explode at order 指図時展開.<p>
	 *
	 */
	public void inst_exp_flg(boolean value) {
		setConstBoolean(offset + 0, $inst_exp_flg, value);
	}


	/**
	 * Supply unit price acquisition 支給単価取得.<p>
	 *
	 */
	public boolean get_prov_upri_flg() {
		return getConstBoolean(offset + 1, $get_prov_upri_flg);
	}

	/**
	 * Supply unit price acquisition 支給単価取得.<p>
	 *
	 */
	public void get_prov_upri_flg(boolean value) {
		setConstBoolean(offset + 1, $get_prov_upri_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($inst_exp_flg.equalsIgnoreCase(name)) {
			return inst_exp_flg();
		}
		if ($get_prov_upri_flg.equalsIgnoreCase(name)) {
			return get_prov_upri_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($inst_exp_flg.equalsIgnoreCase(name)) {
			return inst_exp_flg();
		}
		if ($get_prov_upri_flg.equalsIgnoreCase(name)) {
			return get_prov_upri_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($inst_exp_flg.equalsIgnoreCase(name)) {
			inst_exp_flg(value);
			return;
		}
		if ($get_prov_upri_flg.equalsIgnoreCase(name)) {
			get_prov_upri_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($inst_exp_flg.equalsIgnoreCase(name)) {
			inst_exp_flg(value);
			return;
		}
		if ($get_prov_upri_flg.equalsIgnoreCase(name)) {
			get_prov_upri_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

