package mcframe.serverMSBC.MSBCL6000;

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
 * ブロック"MfgInstReg_Del01_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Del01_CtrlR_MC_A extends MCConstRow {

	/**
	 * Bulk cancellation flg. 一括取消ＦＬＧ.<p>
	 *
	 */
	public static final String $lst_del_flg = "lst_del_flg";
	/**
	 * No commit required コミット不要.<p>
	 *
	 */
	public static final String $not_commit_flg = "not_commit_flg";
	/**
	 * Update counter check not required 更新カウンタチェック不要.<p>
	 *
	 */
	public static final String $not_chk_cntr_flg = "not_chk_cntr_flg";


	public static final MCMeta lst_del_flg_META = createCommonMeta($lst_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_commit_flg_META = createCommonMeta($not_commit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_chk_cntr_flg_META = createCommonMeta($not_chk_cntr_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstReg_Del01_CtrlR> constMetas = new ConstMetaList<MfgInstReg_Del01_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			lst_del_flg_META,
			not_commit_flg_META,
			not_chk_cntr_flg_META
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
	protected MfgInstReg_Del01_CtrlR_MC_A(ConstMetaList<? extends MfgInstReg_Del01_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Del01_CtrlR clone() {
		return (MfgInstReg_Del01_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Del01_CtrlR createInstance() {
		return (MfgInstReg_Del01_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Del01_CtrlR getValues(String... names) {
		return (MfgInstReg_Del01_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Bulk cancellation flg. 一括取消ＦＬＧ.<p>
	 *
	 */
	public boolean lst_del_flg() {
		return getConstBoolean(offset + 0, $lst_del_flg);
	}

	/**
	 * Bulk cancellation flg. 一括取消ＦＬＧ.<p>
	 *
	 */
	public void lst_del_flg(boolean value) {
		setConstBoolean(offset + 0, $lst_del_flg, value);
	}


	/**
	 * No commit required コミット不要.<p>
	 *
	 */
	public boolean not_commit_flg() {
		return getConstBoolean(offset + 1, $not_commit_flg);
	}

	/**
	 * No commit required コミット不要.<p>
	 *
	 */
	public void not_commit_flg(boolean value) {
		setConstBoolean(offset + 1, $not_commit_flg, value);
	}


	/**
	 * Update counter check not required 更新カウンタチェック不要.<p>
	 *
	 */
	public boolean not_chk_cntr_flg() {
		return getConstBoolean(offset + 2, $not_chk_cntr_flg);
	}

	/**
	 * Update counter check not required 更新カウンタチェック不要.<p>
	 *
	 */
	public void not_chk_cntr_flg(boolean value) {
		setConstBoolean(offset + 2, $not_chk_cntr_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($lst_del_flg.equalsIgnoreCase(name)) {
			return lst_del_flg();
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
		}
		if ($not_chk_cntr_flg.equalsIgnoreCase(name)) {
			return not_chk_cntr_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($lst_del_flg.equalsIgnoreCase(name)) {
			return lst_del_flg();
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			return not_commit_flg();
		}
		if ($not_chk_cntr_flg.equalsIgnoreCase(name)) {
			return not_chk_cntr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($lst_del_flg.equalsIgnoreCase(name)) {
			lst_del_flg(value);
			return;
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		if ($not_chk_cntr_flg.equalsIgnoreCase(name)) {
			not_chk_cntr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($lst_del_flg.equalsIgnoreCase(name)) {
			lst_del_flg(value);
			return;
		}
		if ($not_commit_flg.equalsIgnoreCase(name)) {
			not_commit_flg(value);
			return;
		}
		if ($not_chk_cntr_flg.equalsIgnoreCase(name)) {
			not_chk_cntr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

