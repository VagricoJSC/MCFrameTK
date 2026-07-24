package mcframe.serverMSBF.MSBFL5200;

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
 * ブロック"LotTrace_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotTrace_Chk01_CndR_MC_A extends MCConstRow {

	/**
	 * No error message required flg. エラーメッセージ不要ＦＬＧ.<p>
	 *
	 */
	public static final String $no_err_msg_flg = "no_err_msg_flg";
	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public static final String $lst_reg_flg = "lst_reg_flg";


	public static final MCMeta no_err_msg_flg_META = createCommonMeta($no_err_msg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LotTrace_Chk01_CndR> constMetas = new ConstMetaList<LotTrace_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			no_err_msg_flg_META,
			lst_reg_flg_META
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
	protected LotTrace_Chk01_CndR_MC_A(ConstMetaList<? extends LotTrace_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Chk01_CndR clone() {
		return (LotTrace_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Chk01_CndR createInstance() {
		return (LotTrace_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Chk01_CndR getValues(String... names) {
		return (LotTrace_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * No error message required flg. エラーメッセージ不要ＦＬＧ.<p>
	 *
	 */
	public boolean no_err_msg_flg() {
		return getConstBoolean(offset + 0, $no_err_msg_flg);
	}

	/**
	 * No error message required flg. エラーメッセージ不要ＦＬＧ.<p>
	 *
	 */
	public void no_err_msg_flg(boolean value) {
		setConstBoolean(offset + 0, $no_err_msg_flg, value);
	}


	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 1, $lst_reg_flg);
	}

	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 1, $lst_reg_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($no_err_msg_flg.equalsIgnoreCase(name)) {
			return no_err_msg_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($no_err_msg_flg.equalsIgnoreCase(name)) {
			return no_err_msg_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($no_err_msg_flg.equalsIgnoreCase(name)) {
			no_err_msg_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($no_err_msg_flg.equalsIgnoreCase(name)) {
			no_err_msg_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

