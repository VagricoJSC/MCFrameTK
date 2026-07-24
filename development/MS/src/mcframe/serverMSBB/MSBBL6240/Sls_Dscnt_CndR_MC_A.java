package mcframe.serverMSBB.MSBBL6240;

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
 * ブロック"Sls_Dscnt_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sls_Dscnt_CndR_MC_A extends MCConstRow {

	/**
	 * Batch entry tool import まとめ登録ツール取込.<p>
	 *
	 */
	public static final String $bulk_imp_flg = "bulk_imp_flg";


	public static final MCMeta bulk_imp_flg_META = createCommonMeta($bulk_imp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Sls_Dscnt_CndR> constMetas = new ConstMetaList<Sls_Dscnt_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bulk_imp_flg_META
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
	protected Sls_Dscnt_CndR_MC_A(ConstMetaList<? extends Sls_Dscnt_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sls_Dscnt_CndR clone() {
		return (Sls_Dscnt_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sls_Dscnt_CndR createInstance() {
		return (Sls_Dscnt_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sls_Dscnt_CndR getValues(String... names) {
		return (Sls_Dscnt_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Batch entry tool import まとめ登録ツール取込.<p>
	 *
	 */
	public boolean bulk_imp_flg() {
		return getConstBoolean(offset + 0, $bulk_imp_flg);
	}

	/**
	 * Batch entry tool import まとめ登録ツール取込.<p>
	 *
	 */
	public void bulk_imp_flg(boolean value) {
		setConstBoolean(offset + 0, $bulk_imp_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($bulk_imp_flg.equalsIgnoreCase(name)) {
			return bulk_imp_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($bulk_imp_flg.equalsIgnoreCase(name)) {
			return bulk_imp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($bulk_imp_flg.equalsIgnoreCase(name)) {
			bulk_imp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($bulk_imp_flg.equalsIgnoreCase(name)) {
			bulk_imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

