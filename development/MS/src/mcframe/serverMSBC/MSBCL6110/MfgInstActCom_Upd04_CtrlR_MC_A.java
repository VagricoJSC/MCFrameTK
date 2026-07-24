package mcframe.serverMSBC.MSBCL6110;

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
 * ブロック"MfgInstActCom_Upd04_Ctrl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstActCom_Upd04_CtrlR_MC_A extends MCConstRow {

	/**
	 * Caller mfg. order service flg. 呼出元製造指図サービスＦＬＧ.<p>
	 *
	 */
	public static final String $is_src_mfg_inst_srv_flg = "is_src_mfg_inst_srv_flg";


	public static final MCMeta is_src_mfg_inst_srv_flg_META = createCommonMeta($is_src_mfg_inst_srv_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstActCom_Upd04_CtrlR> constMetas = new ConstMetaList<MfgInstActCom_Upd04_CtrlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			is_src_mfg_inst_srv_flg_META
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
	protected MfgInstActCom_Upd04_CtrlR_MC_A(ConstMetaList<? extends MfgInstActCom_Upd04_CtrlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd04_CtrlR clone() {
		return (MfgInstActCom_Upd04_CtrlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd04_CtrlR createInstance() {
		return (MfgInstActCom_Upd04_CtrlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstActCom_Upd04_CtrlR getValues(String... names) {
		return (MfgInstActCom_Upd04_CtrlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Caller mfg. order service flg. 呼出元製造指図サービスＦＬＧ.<p>
	 *
	 */
	public boolean is_src_mfg_inst_srv_flg() {
		return getConstBoolean(offset + 0, $is_src_mfg_inst_srv_flg);
	}

	/**
	 * Caller mfg. order service flg. 呼出元製造指図サービスＦＬＧ.<p>
	 *
	 */
	public void is_src_mfg_inst_srv_flg(boolean value) {
		setConstBoolean(offset + 0, $is_src_mfg_inst_srv_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($is_src_mfg_inst_srv_flg.equalsIgnoreCase(name)) {
			return is_src_mfg_inst_srv_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($is_src_mfg_inst_srv_flg.equalsIgnoreCase(name)) {
			return is_src_mfg_inst_srv_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($is_src_mfg_inst_srv_flg.equalsIgnoreCase(name)) {
			is_src_mfg_inst_srv_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($is_src_mfg_inst_srv_flg.equalsIgnoreCase(name)) {
			is_src_mfg_inst_srv_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

