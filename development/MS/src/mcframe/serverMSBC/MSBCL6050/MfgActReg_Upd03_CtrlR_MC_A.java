package mcframe.serverMSBC.MSBCL6050;

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
 * ブロック"MfgActReg_Upd03_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActReg_Upd03_CtrlR_MC_A extends MCConstRow {

	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public static final String $not_commit_flg = "not_commit_flg";


	public static final MCMeta not_commit_flg_META = createCommonMeta($not_commit_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgActReg_Upd03_CtrlR> constMetas = new ConstMetaList<MfgActReg_Upd03_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			not_commit_flg_META
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
	protected MfgActReg_Upd03_CtrlR_MC_A(ConstMetaList<? extends MfgActReg_Upd03_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd03_CtrlR clone() {
		return (MfgActReg_Upd03_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd03_CtrlR createInstance() {
		return (MfgActReg_Upd03_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Upd03_CtrlR getValues(String... names) {
		return (MfgActReg_Upd03_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public boolean not_commit_flg() {
		return getConstBoolean(offset + 0, $not_commit_flg);
	}

	/**
	 * Do not commit コミットしない.<p>
	 *
	 */
	public void not_commit_flg(boolean value) {
		setConstBoolean(offset + 0, $not_commit_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

