package mcframe.serverMSBB.MSBBL6020;

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
 * ブロック"Slo_Upd01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_Upd01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Commit every order 受注ごとコミット.<p>
	 *
	 */
	public static final String $commit_by_slo_flg = "commit_by_slo_flg";


	public static final MCMeta commit_by_slo_flg_META = createCommonMeta($commit_by_slo_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Slo_Upd01_CtrlR> constMetas = new ConstMetaList<Slo_Upd01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			commit_by_slo_flg_META
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
	protected Slo_Upd01_CtrlR_MC_A(ConstMetaList<? extends Slo_Upd01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_CtrlR clone() {
		return (Slo_Upd01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_CtrlR createInstance() {
		return (Slo_Upd01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_CtrlR getValues(String... names) {
		return (Slo_Upd01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Commit every order 受注ごとコミット.<p>
	 *
	 */
	public boolean commit_by_slo_flg() {
		return getConstBoolean(offset + 0, $commit_by_slo_flg);
	}

	/**
	 * Commit every order 受注ごとコミット.<p>
	 *
	 */
	public void commit_by_slo_flg(boolean value) {
		setConstBoolean(offset + 0, $commit_by_slo_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($commit_by_slo_flg.equalsIgnoreCase(name)) {
			return commit_by_slo_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($commit_by_slo_flg.equalsIgnoreCase(name)) {
			return commit_by_slo_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($commit_by_slo_flg.equalsIgnoreCase(name)) {
			commit_by_slo_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($commit_by_slo_flg.equalsIgnoreCase(name)) {
			commit_by_slo_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

