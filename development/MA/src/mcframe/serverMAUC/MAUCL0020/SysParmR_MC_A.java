package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"SysParm"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SysParmR_MC_A extends MCConstRow {

	/**
	 * System parameter システムパラメータ.<p>
	 *
	 */
	public static final String $sp = "sp";

	public static final String $parm_key = $sp + ".parm_key";
	public static final String $parm_val = $sp + ".parm_val";

	public static final MCMeta sp_META = createInnerRowMeta($sp, mcframe.serverMA.dbc.MAM_SYS_PARM_R.class);

	protected static final ConstMetaList<SysParmR> constMetas = new ConstMetaList<SysParmR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sp_META
		},
		new String[][]{
			{
				"parm_key",
				"parm_val"
			},
			{
				$parm_key,
				$parm_val
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
	protected SysParmR_MC_A(ConstMetaList<? extends SysParmR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SysParmR clone() {
		return (SysParmR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SysParmR createInstance() {
		return (SysParmR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SysParmR getValues(String... names) {
		return (SysParmR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * System parameter システムパラメータ.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_SYS_PARM_R sp(){
		return (mcframe.serverMA.dbc.MAM_SYS_PARM_R) getConstInnerRow(offset + 0, $sp);
	}
	
	/**
	 * System parameter システムパラメータ.<p>
	 *
	 */
	public void sp(mcframe.serverMA.dbc.MAM_SYS_PARM_R row){
		setConstInnerRow(offset + 0, $sp, row);
	}






	public MCRow getInnerRow(String name) {
		if ($sp.equalsIgnoreCase(name)) {
			return sp();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sp.equalsIgnoreCase(name)) {
			sp(
				((MCContainerMeta) sp_META).castInnerRow(mcframe.serverMA.dbc.MAM_SYS_PARM_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public String parm_key() {
		return sp().parm_key();
	}

	/**
	 * Parameter key パラメータキー.<p>
	 *
	 */
	public void parm_key(String value) {
		sp().parm_key(value);
	}

	/**
	 * Parameter value パラメータ値.<p>
	 *
	 */
	public String parm_val() {
		return sp().parm_val();
	}

	/**
	 * Parameter value パラメータ値.<p>
	 *
	 */
	public void parm_val(String value) {
		sp().parm_val(value);
	}

}

